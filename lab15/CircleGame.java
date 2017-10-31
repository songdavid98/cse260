import javafx.application.Application; 
import javafx.stage.Stage; 
import javafx.scene.Scene; 
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import java.util.Random;
//import java.util.Date;

public class CircleGame extends Application {

	int counter = 0;
	double now = (double)System.currentTimeMillis()/1000;

	public void start(Stage primaryStage) {
		Pane p = new Pane();
		int sw = 200;
		int sh = 200;

		Scene scene = new Scene( p , sw, sh);

		Random r = new Random();
		Circle c = new Circle(r.nextInt(sw-20) + 10,  r.nextInt(sh-20) + 10, 10);
		c.setFill( Color.color(Math.random(), Math.random(), Math.random() ) );
		
		c.setOnMouseClicked( e -> {
				counter++;
				if (counter >= 5) {
					now = (double)System.currentTimeMillis()/1000 - now;
					Text t = new Text(50,100, Double.toString(now));
					p.getChildren().add(t);
					p.getChildren().remove(c);
				}
				c.setCenterX(r.nextInt(sw-20) + 10);
				c.setCenterY(r.nextInt(sh-20) + 10);
				c.setFill( Color.color(Math.random(), Math.random(), Math.random()) );
			});
		p.getChildren().add(c);
		primaryStage.setTitle("MyJavaFX");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}