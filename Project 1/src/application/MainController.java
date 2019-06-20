package application;


import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXML;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.scene.control.Button;
import javafx.event.EventHandler;



public class MainController implements EventHandler<ActionEvent>{
@FXML
public TextField fname;
@FXML
public TextField lname;
@FXML
public TextField mail;
@FXML
public Button Generate;
@FXML
String n,m;
public void click(ActionEvent args) {
//	 n = fname.getText();
	Generate.setOnAction(this);
	
}
public void handle(ActionEvent args) {
	// TODO Auto-generated method stub
	if(args.getSource()==Generate) {
		
		String n = fname.getText();
		String m = lname.getText();
		String g = mail.getText();
		String filename = "project.html";
		
		try {
			PrintWriter outputStream = new PrintWriter(filename);
			outputStream.println("<!DOCTYPE html>\r\n" + 
					"<html lang=\"en\" dir=\"ltr\">\r\n" + 
					"  <head>\r\n" + 
					"    <meta charset=\"utf-8\">\r\n" + 
					"    <link href=\"https://fonts.googleapis.com/css?family=Nunito:200,600\" rel=\"stylesheet\">\r\n" + 
					"    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\r\n" + 
					"    <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\"></script>\r\n" + 
					"    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"></script>\r\n" + 
					"    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>\r\n" + 
					"\r\n" + 
					"    <title></title>\r\n" + 
					"  </head>\r\n" + 
					"\r\n" + 
					"  <body>\r\n" + 
					"    <div class=\"container\">\r\n" + 
					"      <h2 id=\"fname\">First Name: " + m + "</h2>\r\n" + 
					"      <h2 id=\"lname\">Last Name: " + n + "</h2>\r\n" + 
					"      <h2 id=\"mail\">Email:" + g + " </h2>\r\n" + 
					"\r\n" + 
					"    </div>\r\n" + 
					"\r\n" + 
					"  </body>\r\n" + 
					"</html>\r\n" + 
					"");
			outputStream.close();
			System.out.println("Printed!" );
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		};
		
		
		
	}
}

}
