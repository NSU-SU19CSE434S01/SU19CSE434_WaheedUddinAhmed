package application;


import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.fxml.FXML;
import javafx.stage.Stage;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.event.EventHandler;



public class MainController implements EventHandler<ActionEvent>{
@FXML
public TextField name;
@FXML
public TextField Dob;
@FXML
public TextField address;
@FXML
public TextField mobile;


@FXML
public TextField email;
@FXML
public TextField skill5;
@FXML
public Button Generate;
@FXML
public Label na;
@FXML
public Button newskill;
@FXML
public VBox dood;
@FXML
public HBox next[] = new HBox[20];
@FXML
public Label sk[] = new Label[20];
@FXML
public TextField textField[] = new TextField[20];
public static String tex[] = new String[20];
 int j=3;
 int last=0;
@FXML
String n,m,l;
int i = 0;
public void click(ActionEvent args) {
//	 n = fname.getText();
	Generate.setOnAction(this);
	
}

public void handle(ActionEvent args) {
	// TODO Auto-generated method stub
	if(args.getSource()==Generate) {
		
		
		String m = name.getText();
		String addr = address.getText();
		String mob = mobile.getText();
//		String Db = Dob.getText();
		String g = email.getText();
		
		for(int k = 0;k<last;k++) {
			
			 tex[k] = textField[k].getText();
		      System.out.println("text is " + tex[k]);
	}
		
			Boolean g_check = email_isValid(g);
//			Boolean m_check = name_check(m);
			Boolean mob_check = mobile_check(mob);
			Boolean bool = isempty(m,g,addr,mob);
			Boolean dy = dycheck(tex,last,textField);
			    if(bool.equals(false) && g_check.equals(true) && mob_check.equals(true) && dy.equals(true)) {
			
			
				String filename = "CV of " + m + ".html";
		
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

			
	
			    else {
			    	System.out.println("cannot be printed");
			    	}	
		
	}
	
	if(args.getSource()==newskill) {
		if(i<7) {
		

     
     next[i]=new HBox();
     next[i].setPrefWidth(309);
     next[i].setStyle("-fx-margin:20px 0px 0px 0px;");
     next[i].getStyleClass().add("dy-hbox");
     
    
     sk[i]=new Label();
     sk[i].setText("Skill# "+j);
     sk[i].setPrefWidth(77);
     sk[i].getStyleClass().add("dy-label");
      textField[i] = new TextField();
      
      textField[i].getStyleClass().add("dy-text");
      
      textField[i].setPromptText("Add a skill");
      next[i].getChildren().addAll(sk[i],textField[i]);
      
      dood.getChildren().add(next[i]);
      dood.setStyle("-fx-padding:0px 0px 20px 0px");
      i = i+1;
      last = i;
      j=j+1;
  
		}
		else {}
	
}

	

}


public void new_skill(ActionEvent args) {

	newskill.setOnAction(this);

}


private boolean dycheck(String[] tex2,int last,TextField[] tex3) {
	
	Boolean value = true;
	for(int h=0;h<last;h++) {
		if(tex2[h].contentEquals("")) {
			textField[h].setPromptText("Cannot be left empty");
			textField[h].setStyle("-fx-prompt-text-fill: red;-fx-font-weight: bold;");	
			value = false;
		}
	}

	
return value;
}
private boolean email_isValid(String g) {
    String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
    if(g.matches(regex)==false) {
    	email.clear();
    	email.setPromptText("Not a correct email format");
		email.setStyle("-fx-prompt-text-fill: red;-fx-font-weight: bold;");	
    }
    return g.matches(regex);
 }
//
//private boolean name_check(String m) {
//	Boolean value = true;
//	
//	
//	
//	return value;
//}
private boolean mobile_check(String mob) {
if(mob.matches("^[0-9]*$") && mob.length() == 11){
	
    return true;
}
else {
	mobile.clear();
	mobile.setPromptText("Cannot contain letters or characters");
	mobile.setStyle("-fx-prompt-text-fill: red;-fx-font-weight: bold;");
	return false;}
}


private boolean isempty(String m,String g,String addr,String mob) {
	Boolean value = true;
	if(m.contentEquals("")) {
		name.setPromptText("name field cannot be empty");
		name.setStyle("-fx-Prompt-text-fill: red;-fx-font-weight: bold;");
	}
	else {
	value = false; 
	}
	
	for(int k = 0;k<10;k++) {
		
	}
	
	if(g.contentEquals("")) {
		email.setPromptText("email field cannot be empty");
		email.setStyle("-fx-prompt-text-fill: red;-fx-font-weight: bold;");
	}
	else {
		value = false; 
		}
		
	if(addr.contentEquals("")) {
		address.setPromptText("address field cannot be empty");
		address.setStyle("-fx-prompt-text-fill: red;-fx-font-weight: bold;");
	}
	else {
		value = false; 
		}
		
	if(mob.contentEquals("")) {
		mobile.setPromptText("mobile field cannot be empty");
		mobile.setStyle("-fx-prompt-text-fill: red;-fx-font-weight: bold;");
	}
	else {
		value = false; 
		}
		

	return value;
	
}
//public void resettodefault(ActionEvent args) {
//
//	System.out.println("hello World");
//
//	
//}


}
