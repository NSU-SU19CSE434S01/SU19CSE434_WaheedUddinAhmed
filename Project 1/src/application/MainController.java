package application;


import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
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



public class MainController {
@FXML
public TextField name,Title;
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
public VBox JEVbox;

@FXML 
public ImageView Dp;

@FXML 
public TextField nationality;

@FXML 
public TextArea aboutme;

@FXML
public TextField textField[] = new TextField[20];
public static String tex[] = new String[20];

@FXML
public TextField jobinst,jobdur,jobpost;
public TextField job_inst[] = new TextField[20];
public TextField job_dur[] = new TextField[20];
public TextField job_post[] = new TextField[20];

public static String tex1[] = new String[20];

@FXML
public TextField cgpa_HS, cgpa_S, hs_inst, s_inst, hs_year, s_year, cgpa_U, U_inst, U_year, U_major;

@FXML
public VBox JobExpVbox2;

public int j=0;
public int last=0;
public int last1 = 0;
@FXML
public String n,l;
public int count =0;
public int i = 0,w = 0;


public String working_dir,file2,fl;





	public String generateEduInfo(String Edu_label,String Edu_inst, String Edu_gpa, String Edu_year, String Edu_Major) {
		if(!Edu_inst.contentEquals("")) {
		String Edu = "                 <h4 class= \"lead\">"+Edu_label+"</h4>\r\n" + 
				"                 <div class=\"row\" id = \"Education\">\r\n" + 
				"                   <div class=\"col-md-5\" >\r\n" + 
				"                     <h5 id = \"Edu\">Institution: </h5>\r\n"; 
			if(Edu_label=="Bachelor's Degree") {
				Edu= Edu + "<h5 id = \"Edu\">Major: </h5>\r\n";
				}
				
				
				Edu = Edu+ "                     <h5 id = \"Edu\">CGPA: </h5>\r\n" + 
				"                     <h5 id = \"Edu\">Passing Year: </h5>\r\n" + 
				"\r\n" + 
				"                   </div>\r\n" + 
				"                   <div class=\"col-md-7\">\r\n" + 
				"                     <h5>"+Edu_inst+" </h5>\r\n";
			if(Edu_label=="Bachelor's Degree") {
					Edu= Edu + "<h5 id = \"Edu\">"+Edu_Major+"</h5>\r\n";
				}
				
				Edu = Edu+ "         <h5>"+Edu_gpa+"</h5>\r\n" + 
				"                    <h5>"+Edu_year+"</h5>\r\n" + 
				"\r\n" + 
				"                   </div>\r\n" + 
				"                 </div>\r\n" + 
				"\r\n" ;
		
		return Edu;
		
		}
		else 
			return "";
}

	public String generateAboutMe(String TA) {
	
		if(TA==null || TA == "") {return "";}
		else if(!TA.contentEquals("")) {
		String About_Me = "               <h3 class = \"lead\"><span>About Me</span></h3>\r\n" + 
				"              <p >"+ TA + "</p>\r\n" ;
		return About_Me;}
		else 
			return "";
}

	/*To Generate Dynamic Skills Fields in CV Form*/

	public void new_skill(ActionEvent args) {

	
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

	
	
	
	
	
	
	
	/*To Generate Dynamic Job Experience Fields in CV Form*/

	public void new_jobexp(ActionEvent args) { 
		
	
		if(j<3) {
			job_inst[j] = new TextField();
			job_inst[j].setPromptText("Job #"+(j+1)+" Institute");
			
			job_dur[j] = new TextField();
			job_post[j] = new TextField();
			next[j] = new HBox();
			next[j].getChildren().addAll(job_inst[j],job_dur[j],job_post[j]);
			next[j].getStyleClass().add("dyWE");
			JEVbox.getChildren().add(next[j]);
			JEVbox.setSpacing(20);
			j++;
			last1 = j;
			
		}
		
		else {}
		
	
	}


	/*To Choose picture to insert in the CV*/
	
	public void choose_pic(ActionEvent args) throws IOException {
	
		FileChooser fc = new FileChooser();
		
		File selectedFile = fc.showOpenDialog(null);
		
		 working_dir = System.getProperty("user.dir");
	
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
		
		file2 = "user."+filetype;
		fl = file2;
		System.out.println(file2);
		
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



	public String skillhtmlGenerator(String skills) {
		
		String mid;
		if(skills==null || skills == "") {return "";}
		else
		
			mid = "<h5> "+ skills + "</h5>\r\n";
			
			return mid;
			
		}
	

	public String WEhtmlGenerator(String job_inst, String job_dur, String job_post) {
		
		String je;
		if(job_inst==null||job_inst=="") {return "";}
		else if(job_dur ==null || job_dur ==""){return "";}
		else if(job_post ==null || job_post ==""){return "";}
		else
		
			je = "                 <div class=\"col-md-5\" >\r\n" + 
					"                   <h5 id = \"Edu\">Worked At: </h5>\r\n" + 
					"                   <h5 id = \"Edu\">Duration: </h5>\r\n" + 
					"                   <h5 id = \"Edu\">Post: </h5>\r\n" + 
					"\r\n" + 
					"                   <br>\r\n" + 
					"\r\n" + 
					"\r\n" + 
					"\r\n" + 
					"                 </div>\r\n" + 
					"                 <div class=\"col-md-7\">\r\n" + 
					"                   <h5>"+job_inst+"</h5>\r\n" + 
					"                   <h5>"+job_dur+"</h5>\r\n" + 
					"                   <h5>"+job_post+"</h5>\r\n" + 
					"\r\n" + 
					"                   <br>\r\n" + 
					"                 </div>\r\n";
			count++;
			return je;
			
		}


	
	

	public boolean email_isValid(String g) {
		
		Boolean value = true;
		
	    String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
	    
	    
	    
	    if ( g== null ||  g.matches(regex) ==false ) {
	    	
	    	value = false;
	    	
	    }
	    
	    
	    return value;
	    
	 }
	

	
	
	public boolean name_isValid(String m) {
		
		Boolean value = true;
		
		if (m != null && m!= "" && m.matches("^[a-z A-Z]*$")) { 
			
			value =true;
		
			return value; 
			
		}
		
		else {
			
			value = false;
			
			return value;
			
			}
		
		
		
	}
	
	
	
	
	public boolean mobile_check(String mob) {
	
	
		String regex = "^[0-9]\\d{8}$|^[0-9]\\d{10}$|^[0-9]\\d{12}$|^[0-9]\\d{6}$";
		
		if(mob==null) {return false;}
		
		else if(mob.matches(regex)){
		
	    return true;
	
		}
		else 
		
		return false;
	}
	
	
	
	
	public boolean isempty(String m,String g,String addr,String mob) {
		
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
			

			
		if(mob.contentEquals("")) {
			
			mobile.setPromptText("mobile field cannot be empty!");
			
			mobile.setStyle("-fx-prompt-text-fill: red;-fx-font-weight: bold;");
			
		}
		
		else {
			
			value = false; 
			
			}
			
	
		return value;
		
	}
	
	
	
	
	//Main Generate Button Function//
	public void click(ActionEvent args) {

		/*Basic Info Fields Extraction */
		String m = name.getText();
		String t = Title.getText();
		String addr = address.getText();
		String mob = mobile.getText();
		String g = email.getText();
		
		/*Educational Info Fields Extraction */
		String cg_HS= cgpa_HS.getText();
		String cg_S= cgpa_S.getText();
		String s_institute = s_inst.getText();
		String hs_institute = hs_inst.getText();
		String cg_U = cgpa_U.getText();
		String U_institute = U_inst.getText();
		String U_m = U_major.getText();
		String U_y = U_year.getText();
		String hs_py = hs_year.getText();
		String s_py = s_year.getText();
		
		
		
		String sk1 = skill1.getText();
		String sk2 = skill2.getText();
		String TA = aboutme.getText();
		String Nat = nationality.getText();
		

		
		if(jobinst.getText()!="" && jobdur.getText()!="" && jobpost.getText()!="") {count = 1;}
		
		System.out.println(TA);
			Boolean empty = isempty(m,g,addr,mob);			//empty makes a call to required fields validation method isempty()
			Boolean email_check = email_isValid(g);			//email_check makes a call to email validation method email_isValid()
			Boolean m_check = name_isValid(m);				//m_check makes a call to name validation method name_isValid()
			Boolean mob_check = mobile_check(mob);			//mob_check makes a call to mobile validation method mobile_check()

			
			if(empty.equals(false)) {
				
			if(m_check.equals(false)) {
				
				name.clear();
				
				name.setPromptText("Cannot contain numbers or symbols!");
				
				name.setStyle("-fx-prompt-text-fill: red;-fx-font-weight: bold;");
				
			}
			
			if(email_check.equals(false)) {
				
			 	email.clear();
			 	
		    	email.setPromptText("Not a correct email format!");
		    	
				email.setStyle("-fx-prompt-text-fill: red;-fx-font-weight: bold;");	
				
			}
			
			if(mob_check.equals(false)) {
				
				mobile.clear();
				
				mobile.setPromptText("Mobile cannot contain letters or characters!");
				
				mobile.setStyle("-fx-prompt-text-fill: red;-fx-font-weight: bold;");
				
			}}
			
			
			
			if(empty.equals(false)) {
			
			
			
			    if(m_check.equals(true)  && email_check.equals(true) && mob_check.equals(true) ) {
			
			
				String filename = "CV of " + m + ".html";
		
				try {
					
					System.out.println(fl);
					PrintWriter outputStream = new PrintWriter(filename);

					
					String fp = "<!DOCTYPE html>\r\n" + 
							"<html lang=\"en\" dir=\"ltr\">\r\n" + 
							"  <head>\r\n" + 
							"    <meta charset=\"utf-8\">\r\n" + 
							"    <link href=\"https://fonts.googleapis.com/css?family=Nunito:200,600\" rel=\"stylesheet\">\r\n" + 
							"    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\r\n" + 
							"    <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\"></script>\r\n" + 
							"    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"></script>\r\n" + 
							"    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>\r\n" + 
							"    <link rel=\"stylesheet\" href=\"css/master.css\">\r\n" + 
							"    <title></title>\r\n" + 
							"  </head>\r\n" + 
							"\r\n" + 
							"<style media=\"screen\">\r\n" + 
							".cont{\r\n" + 
							"  width: 1000px;\r\n" + 
							"}\r\n" + 
							"</style>\r\n" + 
							"\r\n" + 
							"  <body>\r\n" + 
							"    <div class=\"container\">\r\n" + 
							"      <div class=\"cont\">\r\n" + 
							"        <div class=\"row\">\r\n" + 
							"          <div class=\"col-md-5 col-sm-5\">\r\n" + 
							"\r\n" + 
							"            <div class=\"img-border rounded-circle\">\r\n" + 
							"              <img src=\""+ fl + "\" class=\"rounded-circle\"  alt=\"\">\r\n" + 
							"            </div>\r\n" + 
							"            <div id=\"Name-Title\">\r\n" + 
							"              <h2>" + m + "</h2>\r\n" + 
							"              <h3>"+t+"</h3>\r\n" + 
							"\r\n" + 
							"            </div>\r\n" + 
							"            <div id=\"personal\" class=\"box\">\r\n" + 
							"              <h3 class = \"lead\"><span>Personal</span></h3>\r\n" + 
							"              <div class=\"row\">\r\n" + 
							"                <div class=\"col-md-4\">\r\n" + 
							"                  <h5>Name: </h5>\r\n" + 
							"                  <h5>Date Of Birth: </h5>\r\n" + 
							"                  <h5>Nationality: </h5>\r\n" + 
							"                  <h5>Language: </h5>\r\n" + 
							
							"                </div>\r\n" + 
							"                <div class=\"col-md-8\">\r\n" + 
							"                  <h5>" + m + "</h5>\r\n" + 
							"                  <h5>13th Sept, 1995</h5>\r\n" + 
							"                  <h5>"+Nat+"</h5>\r\n" + 
							"                  <h5>Bengali, English</h5>\r\n" + 
							
							"                </div>\r\n" + 
							"              </div>\r\n" + 
							"            </div>\r\n" + 
							"\r\n" + 
							"            <div id = \"contact\" class=\"box\">\r\n" + 
							"              <h3 class = \"lead\"><span>Contact</span></h3>\r\n" + 
							"              <div class=\"row\">\r\n" + 
							"                <div class=\"col-md-4\">\r\n" + 
							"                  <h5>Email: </h5>\r\n" + 
							"                  <h5>Mobile: </h5>\r\n" + 
							"                  <h5>LinkedIn: </h5>\r\n" + 
							"                  <h5>Github: </h5>\r\n" + 
							"                </div>\r\n" + 
							"                <div class=\"col-md-8\">\r\n" + 
							"                  <h5>" + g + " </h5>\r\n" + 
							"                  <h5>" + mob + " </h5>\r\n" + 
							"                  <h5>Blank </h5>\r\n" + 
							"                  <h5>Blank </h5>\r\n" + 
							"                  <h5>Waheed Ahmed </h5>\r\n" + 
							"                </div>\r\n" + 
							"              </div>\r\n" + 
							"            </div>\r\n" + 
							"\r\n" + 
							"            <div id=\"Skills\" class=\"box\">\r\n" + 
							"              <h3 class = \"lead\"><span>Skills</span></h3>\r\n" + 
							"              <div class=\"row\">\r\n" + 
							"                <div class=\"col-md-4\">\r\n"+
							"                  <h5> --"+sk1+"</h5>\r\n" + 
							"                  <h5> --"+sk2+"</h5>\r\n";
							String mp = "",mid;
								
							for(int k=0;k<last;k++) {
								if(k==5) {
									break;
								}

								mid = skillhtmlGenerator(textField[k].getText());
								mp = mp+ mid;
								
							}
							
							mp = mp + "                </div>\r\n" + 
							"                <div class=\"col-md-8\">\r\n";
							
							for(int k=5;k<last;k++) {

								mid = skillhtmlGenerator(textField[k].getText(),k);
								mp = mp+ mid;
								
							}
							
							 
							String lp = "           </div>\r\n" + 
							"              </div>\r\n" + 
							"            </div>\r\n" + 
							"\r\n" + 
							"\r\n" + 
							"\r\n" + 
							"\r\n" + 
							"          </div>\r\n" + 
							"\r\n" + 
							"          <div class=\"col-md-7 col-sm-7\">\r\n" + 
							"             <div id=\"\" class=\"box\">\r\n" + 
							"\r\n" ; 
							
							
							String About_Me = generateAboutMe(TA);
							
						
							String Edu_label,Edu_inst,Edu_GPA,Edu_year,Edu_Major, Edu = " <h3 class = \"lead\"><span>Education</span></h3>\r\n";
							/* For Bachelor's Degree info injection */
							
								Edu_label = "Bachelor's Degree";
								Edu_inst = U_institute;
								Edu_GPA = cg_U;
								Edu_year = U_y;
								Edu_Major = U_m;
								Edu = Edu + generateEduInfo(Edu_label,Edu_inst,Edu_GPA,Edu_year,Edu_Major);
								
								
								Edu_inst = ""; //resetting the check variable for the method "generateEduInfo()"
							
									
							
								Edu_label = "Alevels/HSC Degree";
								Edu_inst = hs_institute;
								Edu_GPA = cg_HS;
								Edu_year = hs_py;
								Edu = Edu + generateEduInfo(Edu_label,Edu_inst,Edu_GPA,Edu_year,"");
								
							
								Edu_inst = ""; //resetting the check variable for the method "generateEduInfo()"
							
								
								Edu_label = "Olevels/SSC Degree";
								Edu_inst = s_institute;
								Edu_GPA = cg_S;
								Edu_year = s_py;
								Edu = Edu + generateEduInfo(Edu_label,Edu_inst,Edu_GPA,Edu_year,"");
							
								
								Edu_inst = ""; //resetting the check variable for the method "generateEduInfo()"
							
								
							
							
						String	Work_E = "  <h3 class = \"lead\" id =\"WE\"><span>Work Experience</span></h3>\r\n" + 
											" <div class=\"row\" id = \"Education\">\r\n";
						
						String	je = "                 <div class=\"col-md-5\" >\r\n" + 
								"                   <h5 id = \"Edu\">Worked At: </h5>\r\n" + 
								"                   <h5 id = \"Edu\">Duration: </h5>\r\n" + 
								"                   <h5 id = \"Edu\">Post: </h5>\r\n" + 
								"\r\n" + 
								"                   <br>\r\n" + 
								"\r\n" + 
								"\r\n" + 
								"\r\n" + 
								"                 </div>\r\n" + 
								"                 <div class=\"col-md-7\">\r\n" + 
								"                   <h5>"+jobinst.getText()+"</h5>\r\n" + 
								"                   <h5>"+jobdur.getText()+"</h5>\r\n" + 
								"                   <h5>"+jobpost.getText()+"</h5>\r\n" + 
								"\r\n" + 
								"                   <br>\r\n" + 
								"                 </div>\r\n";
						Work_E = Work_E + je;
							
							String wid;
							
							for(int j=0;j<last1;j++) {
								if(j==3) {
									break;
								}

								wid = WEhtmlGenerator(job_inst[j].getText(),job_dur[j].getText(),job_post[j].getText());
								Work_E = Work_E + wid;
								
							}
							
							
							
							
							String Lastpart ="\r\n" + 
							"\r\n" + 
							"\r\n" + 
							"\r\n" + 
							"            </div>\r\n" + 
							"          </div>\r\n" + 
							"\r\n" + 
							"\r\n" + 
							"\r\n" + 
							"          </div>\r\n" + 
							"\r\n" + 
							"        </div>\r\n" + 
							"\r\n" + 
							"      </div>\r\n" + 
							"    </div>\r\n" + 
							"\r\n" + 
							"\r\n" + 
							"  </body>\r\n" + 
							"</html>\r\n" ;
							
						String Educ = "";
						
							
					outputStream.println(fp+mp+lp+About_Me+Edu+Work_E + Lastpart);	
							
					
				
						
					
			outputStream.close();
			
			System.out.println("Printed!" );
		
			}catch(FileNotFoundException e) {
				
			e.printStackTrace();
			
			};
			
			
			
			}

			

			    else {
			    	
			    	System.out.println("cannot be printed");
			    	
			    	}	}
		
		
	}
	
	
	
	
	
	}
