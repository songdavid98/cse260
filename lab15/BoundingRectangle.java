import javafx.application.Application; 
import javafx.stage.Stage; 
import javafx.scene.Scene; 
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.collections.ObservableList;

public class BoundingRectangle extends Application{

	public void start(Stage primaryStage) {
		Pane p = new Pane();
		Rectangle r = new Rectangle(100,100,10,10);
		r.setFill(Color.WHITE);
		r.setStroke(Color.BLUE);
		p.getChildren().add(r);

		p.setOnMouseClicked( e -> {
			Circle circle = new Circle( e.getX(), e.getY(), 10);
			circle.setOnMouseClicked( c -> {
				c.consume();
				for (Circle c : p.getChildren() ) {
					if (c.getCenterX() < r.getX()) {
						r.setWidth( r.getWidth() + r.getX() - c.getCenterX() + 10);
						r.setX( c.getCenterX() -10 );
					}
					else if (c.getCenterX() > r.getX() + r.getWidth()) {
						r.setWidth( c.getCenterX() - r.getX() + 10);
					}
					if (c.getCenterY() < r.getY()) {
						r.setHeight( r.getHeight() + r.getY() - c.getCenterY() + 10);
						r.setY( c.getCenterY() -10 );
					}
					else if (c.getCenterY() > r.getY() + r.getHeight()) {
						r.setHeight( c.getCenterY() - r.getY() + 10);
					}
				}
				p.getChildren().remove(circle);
			});
			p.getChildren().add(circle);

			if (e.getX() < r.getX()) {
				r.setWidth( r.getWidth() + r.getX() - e.getX() + 10);
				r.setX( e.getX() -10 );
			}
			else if (e.getX() > r.getX() + r.getWidth()) {
				r.setWidth( e.getX() - r.getX() + 10);
			}
			if (e.getY() < r.getY()) {
				r.setHeight( r.getHeight() + r.getY() - e.getY() + 10);
				r.setY( e.getY() -10 );
			}
			else if (e.getY() > r.getY() + r.getHeight()) {
				r.setHeight( e.getY() - r.getY() + 10);
			}

		});

		Scene scene = new Scene( p , 200, 200);

		primaryStage.setTitle("MyJavaFX");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}