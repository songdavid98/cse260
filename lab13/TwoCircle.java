import javafx.application.Application; 
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;

import java.util.Random;

public class TwoCircle extends Application {

	@Override 
	public void start(Stage primaryStage) {

		Random r = new Random();

		Pane pane = new Pane();

		Circle ca = new Circle();
		ca.setCenterX( r.nextInt( 500 ) );
		ca.setCenterY( r.nextInt( 500 ) );
		ca.setRadius(15);
		ca.setStroke(Color.BLACK);
		ca.setFill(Color.BLUE);

		Circle cb = new Circle();
		cb.setCenterX( r.nextInt( 500 ) );
		cb.setCenterY( r.nextInt( 500 ) );
		cb.setRadius(15);
		cb.setStroke(Color.BLACK);
		cb.setFill(Color.BLUE);

		Line l = new Line(ca.getCenterX(), ca.getCenterY(), cb.getCenterX(), cb.getCenterY());
		String length = Double.toString( 
			Math.sqrt( 
				Math.pow((ca.getCenterX() - cb.getCenterX()), 2) 
				+ Math.pow((ca.getCenterY() - cb.getCenterY()), 2) 
				)
			);
		Text t = new Text(
			(ca.getCenterX() + cb.getCenterX())/2, 
			(ca.getCenterY() + cb.getCenterY())/2, 
			length);

		pane.getChildren().add(ca);
		pane.getChildren().add(cb);
		pane.getChildren().add(l);
		pane.getChildren().add(t);				

		Scene scene = new Scene( pane, 500, 500);

		primaryStage.setTitle("Two Circles");
		primaryStage.setScene( scene );
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}
}