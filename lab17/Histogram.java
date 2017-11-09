import javafx.collections.ObservableList;

import javafx.stage.Stage; 
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.geometry.Pos;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;

import java.util.Scanner;
import java.util.Arrays;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Histogram extends BorderPane {

	public int[] counts = new int[26];
	public String text = "";

	public Histogram() {
		System.out.println("test");

		TextField tf = new TextField();
		tf.setOnAction(e -> {
			try {
				Scanner sc = new Scanner( new File( tf.getText() ) ) ;
				text = sc.useDelimiter("\\A").next();
				sc.close();
			}
			catch (FileNotFoundException f) {
				f.printStackTrace();
			}

			for ( char c : text.toUpperCase().toCharArray() ) {
				if (c > 64 && c < 90)
					counts[ c-65 ] += 1;
			}
			HBox h = new HBox();
			for (int i : counts) {
				Rectangle r = new Rectangle();
				r.setWidth(15);
				r.setHeight(5* i);
				r.setY(getHeight() - r.getHeight() );
				r.setFill(Color.BLUE);
				h.getChildren().add(r);
			}
			setCenter(h);
			h.setStyle("-fx-padding: 50px");
		}); 
		tf.setAlignment( Pos.BOTTOM_RIGHT );
		setLeft( new Label("Enter filename: ") );
		setTop(tf);
		setStyle("-fx-border-color: green");
	}

}