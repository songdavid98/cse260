import javafx.application.Application; 
import javafx.stage.Stage; 
import javafx.scene.Scene; 
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.scene.paint.Color;

import java.util.Scanner;

public class LabRectangle extends Application {

	@Override
	public void start(Stage primaryStage) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter x coordinate of rectangle 1: ");
		int x1 = Integer.parseInt( sc.nextLine() );
		System.out.println("Please enter y coordinate of rectangle 1: ");
		int y1 = Integer.parseInt( sc.nextLine() );
		System.out.println("Please enter width of rectangle 1: ");
		int w1 = Integer.parseInt( sc.nextLine() );
		System.out.println("Please enter height of rectangle 1: ");
		int h1 = Integer.parseInt( sc.nextLine() );

		System.out.println("Please enter x coordinate of rectangle 2: ");
		int x2 = Integer.parseInt( sc.nextLine() );
		System.out.println("Please enter y coordinate of rectangle 2: ");
		int y2 = Integer.parseInt( sc.nextLine() );
		System.out.println("Please enter width of rectangle 2: ");
		int w2 = Integer.parseInt( sc.nextLine() );
		System.out.println("Please enter height of rectangle 2: ");
		int h2 = Integer.parseInt( sc.nextLine() );

		Rectangle r1 = new Rectangle( x1, y1, w1, h1);
		Rectangle r2 = new Rectangle( x2, y2, w2, h2);

		String s = "";
		if ( x1 > x2+w2 || x2>x1+h1) {
			s = "no overlap";
		}
		else if (y1 > y2+h2 || y2 > y1+h1) {
			s = "no overlap";	
		}
		else {
			s = "overlap";
		}
		Text t = new Text(425, 450, s);

		Pane p = new Pane();
		p.getChildren().addAll(r1, r2, t);

		Scene scene = new Scene(p, 500,500);
		primaryStage.setScene( scene );
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}