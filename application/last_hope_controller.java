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
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;


public class last_hope_controller implements Initializable  {
	private Stage stage;
	private Scene scene;
	private Parent root;
	public TextField name1;
	public TextField code1;
	public TextField slot1;
	public Label textlabel;
	@FXML
	public Label holdup;
	public TextField course3;
	public TextField code3;
	public TextField slot3;
	public TextField hello;
	

	public void showname(ActionEvent Event) throws SQLException {
		Connectionclass1 connectionclass=new Connectionclass1();
		Connection connection=connectionclass.getConnection();
		
	
		if(name1.getText().isEmpty()||code1.getText().isEmpty()||slot1.getText().isEmpty()) {
			textlabel.setText("Please enter all the fields");
		}
		else if (mychoice!=null) {
		if(mychoice.getValue()=="PC B.tech") {
			String sql1="INSERT INTO PC_BTECH VALUES('"+name1.getText()+"',' "+code1.getText()+" ','"+slot1.getText()+"')";
			Statement statement1=connection.createStatement();
			statement1.executeUpdate(sql1);
			textlabel.setText("Course Added Successfully");
		}
		if(mychoice.getValue()=="PE B.tech") {
			String sql1="INSERT INTO PE_BTECH VALUES('"+name1.getText()+"',' "+code1.getText()+" ','"+slot1.getText()+"')";
			Statement statement1=connection.createStatement();
			statement1.executeUpdate(sql1);
			textlabel.setText("Course Added Successfully");
		}
		if(mychoice.getValue()=="PC M.tech") {
			String sql1="INSERT INTO PC_MTECH VALUES('"+name1.getText()+"',' "+code1.getText()+" ','"+slot1.getText()+"')";
			Statement statement1=connection.createStatement();
			statement1.executeUpdate(sql1);
			textlabel.setText("Course Added Successfully");
		}
		if(mychoice.getValue()=="PE M.tech") {
			String sql1="INSERT INTO PE_MTECH VALUES('"+name1.getText()+"',' "+code1.getText()+" ','"+slot1.getText()+"')";
			Statement statement1=connection.createStatement();
			statement1.executeUpdate(sql1);
			textlabel.setText("Course Added Successfully");
		}}}
	

	@FXML
	private ChoiceBox<String> mychoice;
	
	
	private String[] co= {"PC B.tech","PE B.tech","PC M.tech","PE M.tech"};
	
	
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
    public void facultypage(ActionEvent event) throws IOException {
		Parent root= FXMLLoader.load(getClass().getResource("admin_login.fxml"));
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
    public void wish3(ActionEvent event) throws IOException {
		Parent root= FXMLLoader.load(getClass().getResource("wish3.fxml"));
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
    public void admin_page(ActionEvent event) throws IOException {
		Parent root= FXMLLoader.load(getClass().getResource("faculty_login.fxml"));
    	stage= (Stage)((Node)event.getSource()).getScene().getWindow();
    	scene=new Scene(root);
    	stage.setScene(scene);
        stage.show();
		
	}
    public void tt(ActionEvent event) throws IOException {
		Parent root= FXMLLoader.load(getClass().getResource("spot2.fxml"));
    	stage= (Stage)((Node)event.getSource()).getScene().getWindow();
    	scene=new Scene(root);
    	stage.setScene(scene);
        stage.show();
		
	}
  

    @FXML
    private TableColumn<User, String>slot;
    @FXML
    private TableColumn<User, Integer>code;
	@FXML
    private TableColumn<User, String>name;

	@FXML
    private TableView<User>table;

    ObservableList<User>list=FXCollections.observableArrayList();

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {

    	if(mychoice!=null) {
    		mychoice.setValue("PC B.tech");
    	mychoice.getItems().addAll(co);
    	}

   		try {
    	Connection con = Connectionclass1.getConnection();
    	
    	ResultSet rs=con.createStatement().executeQuery("SELECT * FROM USER");
    	while(rs.next()) {
    		list.add(new User(rs.getString("name"), 0, null));
    	}
   		}catch(SQLException e) {
   			
   		}
    	
    
    	
    	if(name!=null && slot!=null && code!=null) {
   		   name.setCellValueFactory(new PropertyValueFactory<User,String>("name"));
   		slot.setCellValueFactory(new PropertyValueFactory<User,String>("slot"));
   		code.setCellValueFactory(new PropertyValueFactory<User,Integer>("code"));
   		
   		   
   		   table.setItems(list);
    	}
   		}
    
    @FXML
	private Button button;
	@FXML
	private Label wrong;
	@FXML
	private TextField username;
    @FXML
	private PasswordField password;

    public void userlogin3(ActionEvent event) throws Exception {
		Checklogin3();
		
	}
	private void Checklogin3() throws Exception {
		String a=username.getText();
		Connectionclass1 connectionclass=new Connectionclass1();
		Connection connection2=connectionclass.getConnection();

		String sql2="CREATE TABLE "+username.getText()+"(Course_Name VARCHAR(30),Course_code VARCHAR(30),Course_Slot VARCHAR(30))";
			Statement statement2=connection2.createStatement();
			statement2.executeUpdate(sql2);
		Main m=new Main();

		 if(username.getText().isEmpty()&& password.getText().isEmpty()) {
			wrong.setText("Plz enter the password or username");
		}
		else {
			m.changeScene("admin_login.fxml");
		}
	}

	public void showname2(ActionEvent Event) throws SQLException {

		if(course3.getText().isEmpty()||code3.getText().isEmpty()||slot3.getText().isEmpty()){
			holdup.setText("Please Enter all the Fields");
		}
		else if(course3.getText()!=null || code3.getText()!=null ||slot3.getText()!=null){
			Connectionclass1 connectionclass3=new Connectionclass1();
			Connection connection3=connectionclass3.getConnection();
		
			String sql1="INSERT INTO "+hello.getText()+" VALUES('"+course3.getText()+"',' "+code3.getText()+" ','"+slot3.getText()+"')";
			Statement statement1=connection3.createStatement();
			statement1.executeUpdate(sql1);
			
			
			holdup.setText("Course Added Successfully");

	}}
	

	public void userlogin(ActionEvent event) throws IOException {
		Checklogin();
		
	}
	private void Checklogin() throws IOException {
		Main m=new Main();
		if(username.getText().toString().equals("Aryaveer") && password.getText().toString().equals("sadal")){
			wrong.setText("Login Success");
			
			m.changeScene("admin_login.fxml");
		}
		else if(username.getText().isEmpty()&& password.getText().isEmpty()) {
			wrong.setText("Plz enter the password or username");
		}
		else {
			wrong.setText("Wrong inputs");
		}
	}
	public void userlogin2(ActionEvent event) throws IOException {
		Checklogin2();
		
	}
	private void Checklogin2() throws IOException {
		Main m=new Main();
		if(username.getText().toString().equals("Priya") && password.getText().toString().equals("mam")){
			wrong.setText("Login Success");
			
			m.changeScene("admin_login.fxml");
		}
		else if(username.getText().isEmpty() ||  password.getText().isEmpty()) {
			wrong.setText("Plz enter the password or username");
		}
		else {
			wrong.setText("Wrong inputs");
		}
	}
 
}