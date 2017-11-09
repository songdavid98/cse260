import javafx.application.Application; 
import javafx.stage.Stage; 
import javafx.scene.Scene; 
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

import javafx.scene.shape.Line;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;

import javafx.animation.RotateTransition;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.animation.Interpolator;
import javafx.util.Duration;
import javafx.scene.input.KeyCode;

import javafx.animation.KeyFrame;

public class Pendulum extends Application {

	int dur = 2000;
	PathTransition pt = new PathTransition();
	RotateTransition rt = new RotateTransition();	
	boolean running = true;
	Line line = new Line(250,250,250,250);

	@Override
	public void start(Stage primaryStage) {

		Circle circle = new Circle(250,350, 10);
		circle.setFill(Color.WHITE);
		circle.setStroke(Color.ORANGE);

		line.setStartX(250);
		line.setStartY(250);
		line.endXProperty().bind( circle.centerXProperty().add( circle.translateXProperty() ) );
		line.endYProperty().bind( circle.centerYProperty().add( circle.translateYProperty() ) );
		// Timeline timeline = new Timeline( new KeyFrame(Duration.millis(1), e-> {
		// 	line.setEndX( circle.getCenterX() );
		// 	line.setEndY( circle.getCenterY() );
		// 	System.out.println( circle.getCenterX() );
		// }
		// ));
		// timeline.setCycleCount( Timeline.INDEFINITE );
		// timeline.play();

		Arc arc = new Arc(250,250,100,100, 225, 90);
		arc.setType( ArcType.OPEN );
		arc.setOpacity(0.0);

		Pane pane = new Pane();
		pane.getChildren().addAll(arc, line, circle);

		pt.setDuration( Duration.millis( dur ) );
		pt.setPath( arc );
		pt.setNode(circle);
		pt.setCycleCount( Timeline.INDEFINITE );
		pt.setAutoReverse( true );
		pt.play();

		pane.setOnKeyPressed(e -> {
			Duration d = pt.getCurrentTime();
			double progress = d.toMillis()/dur;
			switch ( e.getCode() ) {
				case UP:
				dur -= 200;
				pt.stop();
				pt.setDuration( Duration.millis( dur ) );
				System.out.println(dur);
				pt.jumpTo( Duration.millis( progress*dur ) );
				if (running)
					pt.play();
				break;
				case DOWN:
				dur += 200;
				pt.stop();
				pt.setDuration( Duration.millis( dur ) );
				System.out.println(dur);
				pt.jumpTo( Duration.millis( progress*dur ) );
				if (running)
					pt.play();
				break;
				case R:
				pt.play();
				running = true;
				break;
				case S:
				pt.pause();
				running = false;
				break;
			}
		}); 
		pane.setFocusTraversable( true );

		Scene scene = new Scene(pane, 500, 500);
		scene.getRoot().requestFocus();
		
		primaryStage.setTitle("Pendulum");
		primaryStage.setScene( scene );
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}