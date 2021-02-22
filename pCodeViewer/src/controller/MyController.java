package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
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
    private File file = new File("src/pcodes.csv");
    private ArrayList<String> pCodes = new ArrayList<>();
    
    @FXML void initialize () {
    	readPcodes();
    }
    
    private void readPcodes() {
    	try {
			Scanner in = new Scanner(file);
			String line = "";
			while (in.hasNext()) {
				line = in.nextLine();
				pCodes.add(line);
			    System.out.println("Readling line: " + line);
			}
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
    }
    
    @FXML protected void search(Event event) {
        String input = textarea1.getText();
        String returnString = "";
        for(String code : pCodes) {
        	Scanner sc = new Scanner(code);
        	sc.useDelimiter(",");
        	String pcode = sc.next();
        	String dsc = sc.next();
        	if(pcode.equals(input)) {
        		returnString += pcode + " " + dsc + "\n";
        	} 
        }
        ouputText.setText(returnString);
    }

}