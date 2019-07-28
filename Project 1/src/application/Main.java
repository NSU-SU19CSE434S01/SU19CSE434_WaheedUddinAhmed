package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
//import javafx.scene.layout.BorderPane;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	@FXML
	Stage window;
	@Override
	public void start(Stage primaryStage) {
		try {
			window = primaryStage;
			window.setTitle("CV Generator");
			
			Parent root = FXMLLoader.load(getClass().getResource("Design.fxml"));
			ScrollPane sp = new ScrollPane();
			sp.setContent(root);
			sp.setPrefSize(1366,720);
			Scene scene = new Scene(sp);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
