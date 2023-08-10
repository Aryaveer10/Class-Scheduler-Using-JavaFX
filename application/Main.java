package application;
	


import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;


public class Main extends Application {
	private static Stage stg;
	@Override
	public void start(Stage primaryStage) {
		try {
			stg=primaryStage;
			primaryStage.setResizable(true);
			Group root2= new Group();
			Parent root= FXMLLoader.load(getClass().getResource("main.fxml"));
			
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			Text t=new Text();
			t.setText("Welcome to the Main Page");
			t.setX(60);
			t.setY(10);
		    root2.getChildren().add(t);
		    
			
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void changeScene(String fxml) throws IOException{
		Parent pane	=FXMLLoader.load(getClass().getResource(fxml));
		stg.getScene().setRoot(pane);
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
