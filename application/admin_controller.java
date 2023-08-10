package application;

import java.io.IOException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
import javafx.stage.Stage;

public class admin_controller  {
	
	
	//implements Initializable//
	
    /*@FXML
    private TableColumn<User, String>name;

	@FXML
    private TableView<User>table;

    ObservableList<User>list=FXCollections.observableArrayList();
    
    @Override
   	public void initialize(URL arg0, ResourceBundle arg1) throws NullPointerException  {
    	
    	System.out.println("helo");
    	
    	try {
   		
    	Connection con = Connectionclass1.getConnection();
    	
    	ResultSet rs=con.createStatement().executeQuery("SELECT * FROM USER");
    	while(rs.next()) {
    		list.add(new User(rs.getString("name")));
    	}
    	}catch (SQLException ex) {
    		Logger.getLogger(admin_controller.class.getName()).log(Level.SEVERE,null,ex);
    	}
    	
    	
    		
   		    
   		   name.setCellValueFactory( new PropertyValueFactory<User,String>("name"));
   		   
   		   
   		   table.setItems(list);
   		    
   		   }
   		   */
    
    
    	
   	
   
    
    
    
    
    
	@FXML
	private Button button;
	@FXML
	private Label wrong;
	@FXML
	public TextField username;
    @FXML
	private PasswordField password;
   

	
	
	public void userlogin3(ActionEvent event) throws Exception {
		Checklogin();
		
	}
	private void Checklogin() throws Exception {
		Connectionclass1 connectionclass=new Connectionclass1();
		Connection connection2=connectionclass.getConnection();

		String sql2="CREATE TABLE "+username.getText()+"(Course_Name VARCHAR(30),Course_code VARCHAR(30),Course_Slot VARCHAR(30))";
			Statement statement2=connection2.createStatement();
			statement2.executeUpdate(sql2);
		Main m=new Main();
		/*if(username.getText().toString().equals("Aryaveer") && password.getText().toString().equals("sadal")){
			wrong.setText("Login Success");
			
			m.changeScene("admin_login.fxml");
		}*/
		 if(username.getText().isEmpty()&& password.getText().isEmpty()) {
			wrong.setText("Plz enter the password or username");
		}
		else {
			m.changeScene("admin_login.fxml");
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
	public void switchTofacultylogin(ActionEvent event) throws IOException {
		Parent root= FXMLLoader.load(getClass().getResource("admin_login.fxml"));
    	stage= (Stage)((Node)event.getSource()).getScene().getWindow();
    	scene=new Scene(root);
    	stage.setScene(scene);
        stage.show();
		
	}
	
	
		
		
	

}
