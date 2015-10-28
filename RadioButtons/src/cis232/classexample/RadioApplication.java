package cis232.classexample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class RadioApplication extends Application{

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage stage) throws Exception {
		Parent p = FXMLLoader.load(getClass().getResource("RadioExample.fxml"));
		Scene scn = new Scene(p);
		stage.setScene(scn);
		stage.show();
		
	}
	
	

}
