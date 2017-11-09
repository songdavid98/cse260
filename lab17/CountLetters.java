import javafx.application.Application; 
import javafx.stage.Stage; 
import javafx.scene.Scene; 
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;


public class CountLetters extends Application {

	@Override
	public void start(Stage primaryStage) {

		Histogram hist = new Histogram();
		//hist.setStyle("-fx-padding-top: 50px");

		Scene scene = new Scene(hist, 500, 500);
		
		primaryStage.setTitle("Run");
		primaryStage.setScene( scene );
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}