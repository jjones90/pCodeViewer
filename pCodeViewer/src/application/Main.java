package application;
	
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import model.Pcodes;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	
	public static Pcodes pcodes = new Pcodes();
	
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("../view/main.fxml"));
		    
	        Scene scene = new Scene(root);
	    
	        primaryStage.setTitle("Elifs label program");
	        primaryStage.setScene(scene);
	        primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		initPcodes();
		launch(args);
	}
	
	private static void initPcodes() {
		File file = new File("src/pcodes.csv");
		try {
			Scanner in = new Scanner(file);
			String line = "";
			while (in.hasNext()) {
				line = in.nextLine();
				pcodes.addPcode(line);
			    System.out.println("Readling line: " + line);
			}
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
