package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class faculty_controller {
	@FXML
	private Button button;
	@FXML
	private Label wrong;
	@FXML
	private TextField username;
	@FXML
	private PasswordField password;
	
	public void userlogin(ActionEvent event) throws IOException {
		Checklogin();
		
	}
	private void Checklogin() throws IOException {
		Main m=new Main();
		if(username.getText().toString().equals("Aryaveer") && password.getText().toString().equals("sadal")){
			wrong.setText("Login Success");
			
			m.changeScene("faculty_login.fxml");
		}
		else if(username.getText().isEmpty()&& password.getText().isEmpty()) {
			wrong.setText("Plz enter the password or username");
		}
		else {
			wrong.setText("Wrong inputs");
		}
	}
	
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	
	
	public void switchToFaculty(ActionEvent event) throws IOException {
		Parent root= FXMLLoader.load(getClass().getResource("faculty.fxml"));
    	stage= (Stage)((Node)event.getSource()).getScene().getWindow();
    	scene=new Scene(root);
    	stage.setScene(scene);
        stage.show();
		
	}
    public void switchToback(ActionEvent event) throws IOException {
    	Parent root= FXMLLoader.load(getClass().getResource("main.fxml"));
    	stage= (Stage)((Node)event.getSource()).getScene().getWindow();
    	scene=new Scene(root);
    	stage.setScene(scene);
        stage.show();
		
	}
    public void switchToDean(ActionEvent event) throws IOException {
		Parent root= FXMLLoader.load(getClass().getResource("Dean.fxml"));
    	stage= (Stage)((Node)event.getSource()).getScene().getWindow();
    	scene=new Scene(root);
    	stage.setScene(scene);
        stage.show();
		
	}
    public void switchToAdmin(ActionEvent event) throws IOException {
		Parent root= FXMLLoader.load(getClass().getResource("admin.fxml"));
    	stage= (Stage)((Node)event.getSource()).getScene().getWindow();
    	scene=new Scene(root);
    	stage.setScene(scene);
        stage.show();
		
	}
    public void switchTowishlist(ActionEvent event) throws IOException {
		Parent root= FXMLLoader.load(getClass().getResource("Wishlist.fxml"));
    	stage= (Stage)((Node)event.getSource()).getScene().getWindow();
    	scene=new Scene(root);
    	stage.setScene(scene);
        stage.show();
		
	}
	
	public void switchToTimetable(ActionEvent event) throws IOException {
		Parent root= FXMLLoader.load(getClass().getResource("time table.fxml"));
    	stage= (Stage)((Node)event.getSource()).getScene().getWindow();
    	scene=new Scene(root);
    	stage.setScene(scene);
        stage.show();
		
	}

}
