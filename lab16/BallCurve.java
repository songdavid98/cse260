import javafx.application.Application; 
import javafx.stage.Stage; 
import javafx.scene.Scene; 
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

import javafx.scene.shape.Polyline;
import javafx.collections.ObservableList;
import javafx.scene.shape.Circle;

import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.util.Duration;

public class BallCurve extends Application {

	@Override
	public void start(Stage primaryStage) {
		Polyline polyline = new Polyline();
		ObservableList list = polyline.getPoints();
		double scaleFactor = 50;
		for(int x = -170; x <= 170; x++) {
			list.add(x + 250.0);
			list.add(250 - scaleFactor * Math.sin((x / 100.0) * 2 * Math.PI));
		}

		Circle circle = new Circle(80, 200, 10);
		circle.setFill(Color.WHITE);
		circle.setStroke(Color.ORANGE);

		PathTransition pt = new PathTransition();
		pt.setDuration( Duration.millis(4000) );
		pt.setPath(polyline);
		pt.setNode(circle);
		pt.setCycleCount( Timeline.INDEFINITE );

		Pane pane = new Pane();
		pane.getChildren().addAll(polyline, circle);

		pane.setOnMousePressed( e -> {
			if ( e.isSecondaryButtonDown() ) { 
				pt.pause(); 
			} 
			if (e.isPrimaryButtonDown()) { 
				pt.play(); 
			}
		});

		Scene scene = new Scene(pane, 500, 500);
		
		primaryStage.setTitle("Ball Curve");
		primaryStage.setScene( scene );
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}


}