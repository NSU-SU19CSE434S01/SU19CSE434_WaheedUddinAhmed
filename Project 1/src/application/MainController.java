package application;


import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.stage.Stage;

import java.nio.file.Paths;
import java.time.format.DateTimeFormatter;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.event.EventHandler;



public class MainController implements EventHandler<ActionEvent>{
@FXML
public TextField name;
@FXML
public DatePicker Dob;
@FXML
public TextField address;
@FXML
public TextField mobile;


@FXML
public TextField email;
@FXML
public TextField skill1,skill2;
@FXML
public Button Generate;
@FXML
public Label na;
@FXML
public Button newskill;
@FXML
public Button newjobexp;
@FXML
public Button propic;

@FXML
public HBox next[] = new HBox[20];
@FXML
public VBox dyvbox1;
@FXML
public VBox dyvbox2;
@FXML 
public ImageView Dp;

@FXML
public TextField textField[] = new TextField[20];


public static String tex[] = new String[20];

@FXML
public TextField textField1[] = new TextField[20];
public static String tex1[] = new String[20];

@FXML
public TextField cgpa_HS;
@FXML
public TextField cgpa_S;

@FXML
public VBox JobExpVbox2;

 int j=0;
 int last=0;
 int last1 = 0;
@FXML
String n,l;
int i = 0;









//Main Generate Button Function//
public void click(ActionEvent args) {
//	 n = fname.getText();
	Generate.setOnAction(this);
	
}

//To Generate Dynamic Skills Fields//
public void new_skill(ActionEvent args) {

	newskill.setOnAction(this);

}

//To Generate Dynamic Job Experience Fields//
public void new_jobexp(ActionEvent args) {

	newjobexp.setOnAction(this);

}

public void choose_pic(ActionEvent args) throws IOException {

	FileChooser fc = new FileChooser();
	File selectedFile = fc.showOpenDialog(null);
	String working_dir = System.getProperty("user.dir");

	working_dir = working_dir+ "\\";
	String path = selectedFile.getAbsolutePath();
	String name = selectedFile.getName();
	String temp = "";
	
	for (int i = name.length()-1; i >= 0; i--) {
		if(name.charAt(i)!='.') {
			temp += name.charAt(i);
		}
		else
			break;
		
	}
	StringBuffer filetype = new StringBuffer(temp);
    filetype.reverse();
	System.out.println(filetype);
	
	working_dir = working_dir.replace("\\", "\\\\");
	
	working_dir = working_dir+"user."+filetype;
	String file2 = "user."+filetype;
	System.out.println(working_dir);	
	
	try {
		
		FileInputStream in = new FileInputStream(path);
		FileOutputStream out = new FileOutputStream(working_dir);
	
		BufferedInputStream bin = new BufferedInputStream(in);
		BufferedOutputStream bout = new BufferedOutputStream(out);
		
		int b=0;
		while(b!= -1) {
			b = bin.read();
			bout.write(b);
		}
		bin.close();
		bout.close();
		
		} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		System.out.println("Could not copy to destination");
	}
	 File file1 = new File(file2);
     Image image = new Image(file1.toURI().toString());
     Dp.setImage(image);
	
	
	
}


public void handle(ActionEvent args) {
	// TODO Auto-generated method stub
	if(args.getSource()==Generate) {
		
		
		String m = name.getText();
		String addr = address.getText();
		String mob = mobile.getText();
//		String Db = ((TextField)Dob.getEditor()).getText();
		String g = email.getText();
		String cg_HS= cgpa_HS.getText();
		String cg_S= cgpa_S.getText();
		String sk1 = skill1.getText();
		String sk2 = skill2.getText();
		
		
		
		
		for(int k = 0;k<last;k++) {
			
			 tex[k] = textField[k].getText();
		      System.out.println("text is " + tex[k]);
	}
		for(int k = 0;k<last1;k++) {
			
			 tex1[k] = textField1[k].getText();
		      System.out.println("text is " + tex1[k]);
	}
		
			Boolean g_check = email_isValid(g);
			Boolean m_check = name_check(m);
			Boolean mob_check = mobile_check(mob);
			Boolean bool = isempty(m,g,addr,mob);
			Boolean dy = dycheck(tex,last,textField);
			Boolean dy1 = dycheck1(tex1,last1,textField1);
			Boolean AN = All_numbers(cg_HS,cg_S);
			
			    if(m_check.equals(true) && bool.equals(false) && g_check.equals(true) && mob_check.equals(true) && AN.equals(true)) {
			
			
				String filename = "CV of " + m + ".html";
		
				try {
					PrintWriter outputStream = new PrintWriter(filename);

					
					String fp = ("<!DOCTYPE html>\r\n" + 
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
							
								"#pic{ " +
							      "height: 200px;" +
							      "width: 220px;" + 
							      "border: 8px solid white;" +
							      "margin-top: -210px;" +
							      "margin-left:100px;" +
							      "padding: 20px;" +
							      "background-color: yellow;" +
							      "background: url('prof.jpg') 0px -20px;" +
							      "background-size: 100%;" +
							      "background-repeat: no-repeat;" +
							      "box-shadow: 5px red;" +

							    "}" +
							
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
							"       <h3 class=\"ml-5\">Full Name:  <span>"+ m + "</span></h3>\r\n" + 
							"       <h3 class=\"ml-5\">Email:    <span>"+ g +"</span></h3>\r\n" + 
							"       <h3 class=\"ml-5\">Github:    <span></span></h3>\r\n" + 
							"       <h3 class=\"ml-5\">LinkedIn:    <span></span></h3>\r\n" +
							"       </div><div id = \"info\" >\r\n" + 
							"       <h5>EDUCATION</h5>\r\n" + 
							"       <hr color=\"silver\"  width=\"115px\">\r\n" + 
							"       <h3 class=\"ml-5\">Undergraduate<span></span></h3>\r\n" + 
							"       <h3 class=\"ml-5\">Studied Software Engineering at North South University<span></span></h3>\r\n" + 
							"       <h3 class=\"ml-5\">CGPA: <span></span></h3>\r\n" + 
							"       </div>\r\n" + 
							"       <div id = \"info\" >\r\n" +
							"       <h5>SKILLS</h5>\r\n" + 
							"       <hr color=\"silver\"  width=\"45px\">\r\n" ) ;
									
									String mid = "";
									String skills =  "<h3 class=\"ml-5\">"+ sk1 + "</h3>\r\n" +
											 "<h3 class=\"ml-5\">"+ sk2 + "</h3>\r\n";
									for(int w = 0;w<last;w++) {
										mid =  "<h3 class=\"ml-5\">"+ textField[w].getText() + "</h3>\r\n"  ;
										skills = skills + mid;
									}			
									
									
						String lp=	"       <h3 class=\"ml-5\">Front-end, UX,UI Developer<span></span></h3>\r\n" + 
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
									"</html>\r\n";
					outputStream.println(fp + skills +lp);	
							
							
						
					
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
		if(i<10) {
	if(i==0 || i%2==0) {
		
		
		  textField[i] = new TextField();
	      
	      textField[i].getStyleClass().add("dy-text");
	      
	      textField[i].setPromptText("Add a skill");
	      dyvbox1.getChildren().add(textField[i]);
	      dyvbox1.setSpacing(20);
	}
	else {

      textField[i] = new TextField();
      
      textField[i].getStyleClass().add("dy-text");
      
      textField[i].setPromptText("Add a skill");
      dyvbox2.getChildren().addAll(textField[i]);
      

      dyvbox2.setSpacing(20);

     
		}
	 i = i+1;
     last = i;
		}
		else {}
	
}
	
	
	if(args.getSource()==newjobexp) {
		
		System.out.println("hello world");
	
		if(j<4) {
	
		  textField1[j] = new TextField();
	      
	      textField1[j].getStyleClass().add("dy-text1");
	      
	      textField1[j].setPromptText("Add a job");
	      JobExpVbox2.getChildren().add(textField1[j]);
	      JobExpVbox2.setSpacing(20);
	      j=j+1;
	      last1 = j;
				}
		else {}
	
}
	
}


private boolean All_numbers(String cg_HS, String cg_S) {
	Boolean value = true;
	String regex = "/^[0-4]\\.\\d\\d$/";
//	String p = cgpa_HS.getText();
	if(!cg_HS.matches(regex) && !cg_HS.contentEquals("")) {
		cgpa_HS.clear();
		cgpa_HS.setPromptText("wrong input!");
		cgpa_HS.setStyle("-fx-prompt-text-fill: red;-fx-font-weight: bold;");	
		value = false;
	}
	 if(!cg_S.matches(regex) && !cg_S.contentEquals("")) {
		cgpa_S.clear();
		cgpa_S.setPromptText("wrong input!");
		cgpa_S.setStyle("-fx-prompt-text-fill: red;-fx-font-weight: bold;");	
		value = false;
	}
	return value;
}


private boolean dycheck(String[] tex2,int last,TextField[] tex3) {
	
	Boolean value = true;
	for(int h=0;h<last;h++) {
		if(tex2[h].contentEquals("")) {
			textField[h].setPromptText("Cannot be left empty!");
			textField[h].setStyle("-fx-prompt-text-fill: red;-fx-font-weight: bold;");	
			value = false;
		}
	}

	
	
return value;
}



private boolean dycheck1(String[] tex2,int last,TextField[] tex3) {
	
	Boolean value = true;
	for(int h=0;h<last1;h++) {
		if(tex1[h].contentEquals("")) {
			textField1[h].setPromptText("Cannot be left empty!");
			textField1[h].setStyle("-fx-prompt-text-fill: red;-fx-font-weight: bold;");	
			value = false;
		}
		
	}
	return value;}


private boolean email_isValid(String g) {
    String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
    if(g.matches(regex)==false) {
    	email.clear();
    	email.setPromptText("Not a correct email format!");
		email.setStyle("-fx-prompt-text-fill: red;-fx-font-weight: bold;");	
    }
    return g.matches(regex);
 }

private boolean name_check(String m) {
	Boolean value = true;
	
	if (m != null && m.matches("^[a-z A-Z]*$")) {
		value =true;
	}
	else {
		value = false;
		name.clear();
		name.setPromptText("Cannot contain numbers or symbols!");
		name.setStyle("-fx-prompt-text-fill: red;-fx-font-weight: bold;");
		}
	
	return value;
}
private boolean mobile_check(String mob) {
if(mob.matches("^[0-9]*$") && mob.length() == 11){
	
    return true;
}
else {
	mobile.clear();
	mobile.setPromptText("Cannot contain letters or characters!");
	mobile.setStyle("-fx-prompt-text-fill: red;-fx-font-weight: bold;");
	return false;}
}


private boolean isempty(String m,String g,String addr,String mob) {
	Boolean value = true;
	if(m.contentEquals("")) {
		name.setPromptText("name field cannot be empty!");
		name.setStyle("-fx-Prompt-text-fill: red;-fx-font-weight: bold;");
	}
	else {
	value = false; 
	}
	
	for(int k = 0;k<10;k++) {
		
	}
	
	if(g.contentEquals("")) {
		email.setPromptText("email field cannot be empty!");
		email.setStyle("-fx-prompt-text-fill: red;-fx-font-weight: bold;");
	}
	else {
		value = false; 
		}
		
	if(addr.contentEquals("")) {
		address.setPromptText("address field cannot be empty!");
		address.setStyle("-fx-prompt-text-fill: red;-fx-font-weight: bold;");
	}
	else {
		value = false; 
		}
		
	if(mob.contentEquals("")) {
		mobile.setPromptText("mobile field cannot be empty!");
		mobile.setStyle("-fx-prompt-text-fill: red;-fx-font-weight: bold;");
	}
	else {
		value = false; 
		}
		

	return value;
	
}



}
