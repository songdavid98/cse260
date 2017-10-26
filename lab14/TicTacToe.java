import javafx.application.Application; 
import javafx.stage.Stage; 
import javafx.scene.Scene; 
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.geometry.*;

public class TicTacToe extends Application {

	String turn = "X";

	@Override
	public void start(Stage primaryStage) {

		

		GridPane gp = new GridPane();
		gp.setHgap(5);
		gp.setVgap(5);
		gp.setAlignment(Pos.CENTER);

		for (int i = 0; i < 9; i++) {
			Button b = new Button(" ");
			b.setOnAction( e-> {
				if (!b.getText().equals(" "))
					return;
				b.setText( turn );
				if (turn.equals("X"))
					turn = "O";
				else
					turn = "X";
			} );

			gp.add( b, i%3, i/3 );	
		}

		Scene scene = new Scene(gp, 300,300);
		primaryStage.setScene( scene );
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}
}