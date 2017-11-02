import javafx.application.Application; 
import javafx.stage.Stage; 
import javafx.scene.Scene; 
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class Traffic extends Application {

	@Override
	public void start(Stage primaryStage) {

		BorderPane pane = new BorderPane();

		Circle light = new Circle(250,250,100);
		light.setFill( Color.WHITE );

		RadioButton red = new RadioButton("Red");
		RadioButton yellow = new RadioButton("Yellow");
		RadioButton green = new RadioButton("Green");

		VBox radioButtonpane = new VBox(10);

		radioButtonpane.getChildren().addAll( red, yellow, green );

		ToggleGroup group = new ToggleGroup();
		red.setToggleGroup(group);
		yellow.setToggleGroup(group);
		green.setToggleGroup(group);

		red.setOnAction(e -> { 
			if (red.isSelected()) { 
				light.setFill(Color.RED); 
			} 
		});
		yellow.setOnAction(e -> { 
			if (yellow.isSelected()) { 
				light.setFill(Color.YELLOW); 
			} 
		});
		green.setOnAction(e -> { 
			if (green.isSelected()) { 
				light.setFill(Color.GREEN); 
			} 
		});

		pane.setLeft( radioButtonpane );

		pane.setCenter( light );		

		Scene scene = new Scene(pane, 500, 500);
		
		primaryStage.setTitle("Run");
		primaryStage.setScene( scene );
		primaryStage.show();

		System.out.println("test");
	}

	public static void main(String[] args) {
		launch(args);
	}
}