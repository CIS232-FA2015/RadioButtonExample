package cis232.classexample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class RadioExampleController {

    @FXML
    private Button button;

    @FXML
    private RadioButton rbChoice3;

    @FXML
    private RadioButton rbChoice2;

    @FXML
    private RadioButton rbChoice1;

    @FXML
    private Label label;
    
    @FXML
    private Label lblGender;

    @FXML
    private ToggleGroup group;

    @FXML
    void buttonClick() {
    	if(rbChoice1.isSelected()){
    		label.setText("That's a choice of 1");
    	} else if(rbChoice2.isSelected()){
    		label.setText("You picked 2");
    	}else{
    		label.setText("No.");
    	}
    }

    @FXML
    void maleClickListener(){
    	lblGender.setText("You chose male.");
    }
    
    @FXML
    void femaleClickListener(){
    	lblGender.setText("You chose female.");
    }
}
