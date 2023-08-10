package application;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;

import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class sql_dean_controller {
	public TextField textfield;
	public Label textlabel;
	
	public void showname(ActionEvent Event) throws SQLException {
		Connectionclass1 connectionclass=new Connectionclass1();
		Connection connection=connectionclass.getConnection();
		
		String sql="INSERT INTO USER VALUES('"+textfield.getText()+"')";
		Statement statement=connection.createStatement();
		statement.executeUpdate(sql);
		textlabel.setText(textfield.getText());
		
		
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
	 public void deanpage(ActionEvent event) throws IOException {
			Parent root= FXMLLoader.load(getClass().getResource("dean_login.fxml"));
	    	stage= (Stage)((Node)event.getSource()).getScene().getWindow();
	    	scene=new Scene(root);
	    	stage.setScene(scene);
	        stage.show();
			
		}
	    public void table2(ActionEvent event) throws IOException {
			Parent root= FXMLLoader.load(getClass().getResource("time2.fxml"));
	    	stage= (Stage)((Node)event.getSource()).getScene().getWindow();
	    	scene=new Scene(root);
	    	stage.setScene(scene);
	        stage.show();
			
		}
	    public void wish(ActionEvent event) throws IOException {
			Parent root= FXMLLoader.load(getClass().getResource("wish2.fxml"));
	    	stage= (Stage)((Node)event.getSource()).getScene().getWindow();
	    	scene=new Scene(root);
	    	stage.setScene(scene);
	        stage.show();
			
		}
	    public void dean_info(ActionEvent event) throws IOException {
			Parent root= FXMLLoader.load(getClass().getResource("dean_profile.fxml"));
	    	stage= (Stage)((Node)event.getSource()).getScene().getWindow();
	    	scene=new Scene(root);
	    	stage.setScene(scene);
	        stage.show();
			
		}
	    public void spotlight(ActionEvent event) throws IOException {
			Parent root= FXMLLoader.load(getClass().getResource("spotlight.fxml"));
	    	stage= (Stage)((Node)event.getSource()).getScene().getWindow();
	    	scene=new Scene(root);
	    	stage.setScene(scene);
	        stage.show();
			
		}


	
	
	
	

}
