package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javafx.animation.Animation;
import javafx.animation.Interpolator;
import javafx.animation.RotateTransition;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.util.Duration;
 
public class MyController {
    @FXML private TextField textarea1;
    @FXML private Label lbl;
    @FXML private TextArea ouputText;
    
    @FXML protected void search(Event event) {
        String input = textarea1.getText();
        File file = new File("src/pcodes.csv");
     
        try {
			Scanner in = new Scanner(file);
			String line = "";
			String output2 = "";
			while (in.hasNext()) {
				line = in.nextLine();
				if(line.contains(input)) {
					output2 += line + "\n";
				}
				
				ouputText.setText(output2);
			    System.out.println(output2);
			}
			in.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       
    }

}