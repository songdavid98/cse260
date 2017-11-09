import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.util.Duration;

import java.util.Random;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BouncingBall extends Application{

	public static final int BALLS = 5;
	public static final int RADIUS = 10;
	public static int width = 500;
	public static int height = 500;

	class Ball {
		private int dx = 1; 
		private int dy = 1;
		private int x; 
		private int y;
		private int radius;
		public Circle circle;
		public Ball() {
			Random r = new Random();
			x = r.nextInt(450)+25;
			y = r.nextInt(450)+25;
			radius = RADIUS;
			circle = new Circle(  x, y, radius);
			circle.setFill( Color.GREEN );

			Timeline timeline = 
				new Timeline( new KeyFrame( Duration.millis(5), e -> moveBall()) );
			timeline.setCycleCount( Timeline.INDEFINITE);
			timeline.play();
		}

		public void moveBall() {
			if ( x < radius || x > width - radius ) {
				dx *= -1;
			}
			if ( y < radius || y > height - radius ) {
				dy *= -1;
			}
			x += dx;
			y += dy;
			circle.setCenterX(x);
			circle.setCenterY(y);
		}
	}

	public void start(Stage primaryStage) {
		Pane pane = new Pane();



		ExecutorService executor = Executors.newFixedThreadPool( BALLS );
		
		for (int i = 0; i < BALLS; i++) {
			executor.execute( () -> {
				Ball b = new Ball();
				pane.getChildren().add( b.circle );
			});
		}
		executor.shutdown();
		while ( !executor.isTerminated() ) {
			try {
				Thread.sleep(1);
			} catch( InterruptedException e) {
				e.printStackTrace();
			}
		}

		Scene scene = new Scene(pane, 500, 500);

		primaryStage.setScene( scene );
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}