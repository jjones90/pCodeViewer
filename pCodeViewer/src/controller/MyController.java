package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import application.Main;
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
    
    
    
    @FXML void initialize () {
    	
    }
    
    
    @FXML protected void updateText(Event event) {
    	String output = Main.pcodes.search(textarea1.getText()); //possibly move to updateModel function
    	ouputText.setText(output);
    }

}