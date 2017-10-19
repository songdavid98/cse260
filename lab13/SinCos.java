import javafx.application.Application; 
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Polyline;
import javafx.collections.ObservableList;
import javafx.scene.shape.Line;

public class SinCos extends Application {

	public void start(Stage primaryStage) {


		Polyline polyline = new Polyline();
		ObservableList list = polyline.getPoints();
		double scaleFactor = 50;
		for (int x = -170; x <= 170; x++) {
			list.add(x + 250.0);
			list.add(250 - 50 * Math.sin((x / 100.0) * 2 * Math.PI));
		}

		Polyline polylineb = new Polyline();
		ObservableList listb = polylineb.getPoints();
		for (int x = -170; x <= 170; x++) {
			listb.add(x + 250.0);
			listb.add(250 - 50 * Math.cos((x / 100.0) * 2 * Math.PI));
		}

		Line xaxis = new Line(0,250,500,250);
		Line yaxis = new Line(250,0,250,500);

		Pane pane = new Pane();

		
		pane.getChildren().add(polyline);
		pane.getChildren().add(polylineb);
		pane.getChildren().add(xaxis);
		pane.getChildren().add(yaxis);
		Scene scene = new Scene(pane, 500, 500);
		

		primaryStage.setTitle("Square Function");
		primaryStage.setScene( scene );
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}