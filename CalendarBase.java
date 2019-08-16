package Testing;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.stage.Stage;



public class GridPaneTest extends Application{
	public void start (Stage stage) {
		
		
		GridPane Squares = new GridPane();
		Squares.setMaxSize(1500, 850);
		Squares.setPadding(new Insets(10, 10, 10, 10));
		//Squares.setVgap(10);
		//Squares.setHgap(10);
		
		
		Squares.setAlignment(Pos.TOP_CENTER);
		Squares.setGridLinesVisible(true);
		
		// found here: https://stackoverflow.com/questions/29609916/possible-to-decide-number-of-rows-and-columns-in-gridpane-javafx/29611827
		for (int i = 0; i < 7; i++) 
		{
			ColumnConstraints colCount = new ColumnConstraints();
			colCount.setPercentWidth(100.0 / 7);
			Squares.getColumnConstraints().add(colCount);
		}
		
		RowConstraints row1 = new RowConstraints(10);
		row1.setPercentHeight(10);
		Squares.getRowConstraints().add(row1);
		
		
		for (int j = 0; j < 5; j++) 
		{
			RowConstraints rowCount = new RowConstraints();
			rowCount.setPercentHeight(100.0 / 5);
			Squares.getRowConstraints().add(rowCount);
		}
		
		
		//Days labels 
		Label Day1 = new Label("Sun"); 
		Label Day2 = new Label("Mon");
		Label Day3 = new Label("Tue"); 
		Label Day4 = new Label("Wed"); 
		Label Day5 = new Label("Thu"); 
		Label Day6 = new Label("Fri"); 
		Label Day7 = new Label("Sat");
		
		
		/*
		 * Label[] days = new Label[32]; for (int k = 0; k < 32; k++) {
		 * 
		 * }
		 */
		
		Squares.addRow(0, Day1, Day2, Day3, Day4, Day5, Day6, Day7);
		
		
		
		GridPane.setHalignment(Day1, HPos.CENTER);
		GridPane.setHalignment(Day2, HPos.CENTER);
		GridPane.setHalignment(Day3, HPos.CENTER);
		GridPane.setHalignment(Day4, HPos.CENTER);
		GridPane.setHalignment(Day5, HPos.CENTER);
		GridPane.setHalignment(Day6, HPos.CENTER);
		GridPane.setHalignment(Day7, HPos.CENTER);
		
		
		
		
		Scene scene = new Scene(Squares, 1500, 850);
		Squares.setStyle("-fx-background-color: lightsalmon; -fx-border-color: mediumvioletred; -fx-border-width: 20px;");
		stage.setTitle("Calendar Squares");
		stage.setScene(scene);
		stage.show();
	}
	public static void main(String args[]) {launch(args);}
}
