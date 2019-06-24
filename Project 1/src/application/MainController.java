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
public TextField name;


@FXML
public TextField email;
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
		

		String m = name.getText();
		
		String g = email.getText();

		

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
					"    <link rel=\"stylesheet\" href=\"project.css\">\r\n" + 
					"    <title>RESUME | CV</title>\r\n" + 
					"  </head>\r\n" + 
					"\r\n" + 
					"<style media=\"screen\">\r\n" + 
					"  footer{\r\n" + 
					"          margin-bottom: 0px;\r\n" + 
					"          margin-top: 150px;\r\n" + 
					"          height:  300px;\r\n" + 
					"          background-color: #005073;\r\n" + 
					"\r\n" + 
					"\r\n" + 
					"          color: white;\r\n" + 
					"        }\r\n" + 
					"        .row{\r\n" + 
					"          display: flex;\r\n" + 
					"          flex-direction: row;\r\n" + 
					"\r\n" + 
					"        }\r\n" + 
					"        .col-md-4{\r\n" + 
					"          text-align: center;\r\n" + 
					"          margin-top: 30px;\r\n" + 
					"          letter-spacing: 4px;\r\n" + 
					"        }\r\n" + 
					"        .col-md-4 hr{\r\n" + 
					"          height:1px;\r\n" + 
					"        }\r\n" + 
					"        .col-md-4 .lead {\r\n" + 
					"          font-size: 25px;\r\n" + 
					"          font-weight: 200;\r\n" + 
					"        }\r\n" + 
					"\r\n" + 
					"\r\n" + 
					"        @media only screen and (max-width: 768px) {\r\n" + 
					"          footer{\r\n" + 
					"            height: 550px;\r\n" + 
					"\r\n" + 
					"\r\n" + 
					"          }\r\n" + 
					"        }\r\n" + 
					"\r\n" + 
					"        @media only screen and (max-width: 480px) {\r\n" + 
					"          footer{\r\n" + 
					"            background-color: black !important;\r\n" + 
					"          }\r\n" + 
					"        }\r\n" + 
					"</style>\r\n" + 
					"\r\n" + 
					"  <body>\r\n" + 
					"    <div class=\"wrapper \">\r\n" + 
					"      <h1 class=\"mt-3 lead heading\"align= center >RESUME <span class =\"i\">|</span> CV</h1>\r\n" + 
					"      <hr color=\"silver\"  width=\"150px\">\r\n" + 
					"      <div class=\"container-fluid mt-3 background\"></div>\r\n" + 
					"      <div class=\"container\">\r\n" + 
					"       <div id=\"pic\"></div>\r\n" + 

					"       <h3 id=\"Name\" class=\"lead\"><span>Waheed Uddin  Ahmed</span></h3>\r\n" + 
					"       <div id = \"info\" >\r\n" + 
					"       <h5>MY INFO</h5>\r\n" + 
					"       <hr color=\"silver\"  width=\"80px\">\r\n" + 
					"       <h3 class=\"ml-5\">Full Name:  <span>Waheed Uddin Ahmed</span></h3>\r\n" + 
					"       <h3 class=\"ml-5\">Email:    <span>dmc4719@gmail.com</span></h3>\r\n" + 
					"       <h3 class=\"ml-5\">Github:    <span></span></h3>\r\n" + 
					"       <h3 class=\"ml-5\">LinkedIn:    <span></span></h3>\r\n" + 
					"       </div>\r\n" + 
					"       <div id = \"info\" >\r\n" + 
					"       <h5>EDUCATION</h5>\r\n" + 
					"       <hr color=\"silver\"  width=\"115px\">\r\n" + 
					"       <h3 class=\"ml-5\">Undergraduate<span></span></h3>\r\n" + 
					"       <h3 class=\"ml-5\">Studied Software Engineering at North South University<span></span></h3>\r\n" + 
					"       <h3 class=\"ml-5\">CGPA: <span></span></h3>\r\n" + 
					"       </div>\r\n" + 
					"       <div id = \"info\" >\r\n" + 
					"       <h5>SKILLS</h5>\r\n" + 
					"       <hr color=\"silver\"  width=\"45px\">\r\n" + 
					"       <h3 class=\"ml-5\">Front-end, UX,UI Developer<span></span></h3>\r\n" + 
					"       <h3 class=\"ml-5\">Back-end Developer<span></span></h3>\r\n" + 
					"       <h3 class=\"ml-5\">Fluency with various programming languages and frameworks such Python, R, Java, C++, Bootstrap, HTML, CSS, JS, Django, Laravel, etc.<span></span></h3>\r\n" + 

					"       <h3 id=\"Name\" class=\"lead\"><span>" + m +  "</span></h3>\r\n" + 
					"       <div id = \"info\" >\r\n" + 
					"       <h5>MY INFO</h5>\r\n" + 
					"       <hr color=\"silver\"  width=\"80px\">\r\n" + 

					"       <h3 id=\"Name\" class=\"lead\"><span>" + m +  "</span></h3>\r\n" + 
					"       <div id = \"info\" >\r\n" + 
					"       <h5>MY INFO</h5>\r\n" + 
					"       <hr color=\"silver\"  width=\"80px\">\r\n" + 

					"       <h3 class=\"ml-5\">Full Name:  <span>"+m+"</span></h3>\r\n" + 
					"       <h3 class=\"ml-5\">Email:    <span>"+g+"</span></h3>\r\n" + 

					"       </div>\r\n" + 
					"\r\n" + 
					"\r\n" + 
					"\r\n" + 
					"\r\n" + 
					"       </div>\r\n" + 
					"    </div>\r\n" + 
					"\r\n" + 
					"\r\n" + 
					"\r\n" + 
					"\r\n" + 
					"\r\n" + 
					"\r\n" + 
					"\r\n" + 
					"    <footer>\r\n" + 
					"\r\n" + 
					"      <div class=\"row\">\r\n" + 
					"        <div class=\"col-md-4 \">\r\n" + 
					"          <h3 class = \"lead\">EDUCATION</h3>\r\n" + 
					"          <hr color=\"silver\"  width=\"80px\">\r\n" + 
					"          <h4>Github</h4>\r\n" + 
					"          <h4>Piazza</h4>\r\n" + 
					"\r\n" + 
					"        </div>\r\n" + 
					"        <div class=\"col-md-4\">\r\n" + 
					"          <h3 class = \"lead\">SOCIAL</h3>\r\n" + 
					"          <hr color=\"silver\"  width=\"80px\">\r\n" + 
					"          <h4>Github</h4>\r\n" + 
					"          <h4>Piazza</h4>\r\n" + 
					"\r\n" + 
					"        </div>\r\n" + 
					"        <div class=\"col-md-4\">\r\n" + 
					"          <h3 class = \"lead\">RANDOM</h3>\r\n" + 
					"          <hr color=\"silver\"  width=\"80px\">\r\n" + 
					"          <h4>Github</h4>\r\n" + 
					"          <h4>Piazza</h4>\r\n" + 
					"\r\n" + 
					"        </div>\r\n" + 
					"\r\n" + 
					"        </div>\r\n" + 
					"\r\n" + 
					"\r\n" + 
					"\r\n" + 
					"    </footer>\r\n" + 
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
