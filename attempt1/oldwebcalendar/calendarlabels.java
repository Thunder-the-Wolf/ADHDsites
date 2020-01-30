package Testing;



import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.stage.Stage;



public class label extends Application{
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
		
		RowConstraints row1 = new RowConstraints(20);
		row1.setPercentHeight(20);
		
		
		
		Squares.getRowConstraints().addAll(row1);
		
		
		for (int j = 0; j < 6; j++) 
		{
			RowConstraints rowCount = new RowConstraints();
			rowCount.setPercentHeight(100.0 / 6);
			Squares.getRowConstraints().add(rowCount);
		}
		
		
		//Days labels 
		//Label Day1 = new Label("Sun"); 
		
		
		//Label D1 = new Label("1");
		
		Label greetings = new Label("Hello! Today is ");
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		Label CurrentDate = new Label(dtf.format(now));
		
		
		//GridPane.setColumnSpan(greetings, 5);
		GridPane.setValignment(greetings, VPos.TOP);
		GridPane.setValignment(CurrentDate, VPos.TOP);
		Squares.addRow(0, greetings, CurrentDate);
		
		
		greetings.setStyle("-fx-font: 50px Tahoma; -fx-stroke: black; -fx-stroke-width: 1;");
		CurrentDate.setStyle("-fx-font: 50px Tahoma; -fx-stroke: black; -fx-stroke-width: 1;");
		
		/*
		 * Squares.addRow(0, Day1, Day2, Day3, Day4, Day5, Day6, Day7);
		 * Squares.addRow(1, D1, D2, D3, D4, D5, D6, D7); Squares.addRow(2, D8, D9, D10,
		 * D11, D12, D13, D14); Squares.addRow(3, D15, D16, D17, D18, D19, D20, D21);
		 * Squares.addRow(4, D22, D23, D24, D25, D26, D27, D28); Squares.addRow(5, D29,
		 * D30, D31);
		 * 
		 * GridPane.setHalignment(Day1, HPos.CENTER);
		 * 
		 * 
		 * GridPane.setValignment(D1, VPos.TOP);
		 */
