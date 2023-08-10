package application;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class controller   {
	@FXML
	private Button logout;
	@FXML
	private AnchorPane scenepane;
	
		
		
		
		
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
	
	private  Stage stage;
	private Scene scene;
	private Parent root;
	
	public void logoutt(ActionEvent event) {
		stage=(Stage) scenepane.getScene().getWindow();
		System.out.println("Logged out Successfully");
		stage.close();
	}
	
	
	
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
    public void switchToAdmin(ActionEvent event) throws IOException  {
		Parent root= FXMLLoader.load(getClass().getResource("admin.fxml"));
    	stage= (Stage)((Node)event.getSource()).getScene().getWindow();
    	scene=new Scene(root);
    	stage.setScene(scene);
        stage.show();
		
	}

	}
