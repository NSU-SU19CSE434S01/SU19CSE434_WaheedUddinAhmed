package application;

import static org.junit.Assert.*;

import org.junit.Test;

public class CVGenTesting {
	MainController mcont = new MainController();


	
	/*Interface-Based testing*/
	
	/*Can be applied for both name and email test cases*/
	
	/*Characteristics 1: Is the input value null 
	 * 
	 *-------block 1->true  (Case1)
	 *
	 *-------block 2->false  (Case2)
	 
	 *Characteristics 2: Is the input value empty 
	 *
	 *-------block 1->true  (Case3)
	 *
	 *-------block 2->false  (Case4)
	 *
	 *Characteristics 3: Not empty or null
	 *
	 *Case5: Special Characters input check 
	 *
	 *Case6: Number input check 
	 *
	 *Case7: Alphabets check 
	*/
	
	
	
	
	
	
	/*Graphing for Name_isValid()*/
	
	/* Node 1: checks the condition (Condition Checking Node) whether input !== null and if input matches the given regex (Starting Node)
	 * 
	 * Node 2: If input != null and matches the given regex, return boolean value = true (Final Node)
	 * 
	 * Node 3: if input == null, (Condition Checking Node)  return boolean value = false (Final Node)
	 * 
	 * Prime Paths: [1,2] [1,3]
	 * 
	 * For Prime Path 1 the value is : "Waheed Uddin Ahmed"
	 * 
	 * For Prime Path 2 the value is : "W@heed"
	 */
		
	
	
	
	/*Name input Test Cases*/
	
	
	@Test			//Case1
	public void name_input_null() {
		Boolean value = mcont.name_isValid(null);
		assertFalse(value);
	}			//Checking whether the output is false using assertFalse as 'null' is not a valid name input.
	
	@Test			//Case2
	public void name_input_is_not_null() {
		Boolean value = mcont.name_isValid("Waheed");
		assertTrue(value);
	}			//Checking whether the output is false using assertFalse as 'null' is not a valid name input.
	
	
	@Test			//Case3
	public void name_input_is_empty() {
		Boolean value = mcont.name_isValid("");
		assertFalse(value);
	}			//Checking whether the output is false using assertFalse as an 'empty' string is not a valid name input.

	
	@Test			//Case4
	public void name_input_is_not_empty_check() {
		Boolean value = mcont.name_isValid("Waheed");
		assertTrue(value);
	}			//Checking whether the output is false using assertFalse as an 'empty' string is not a valid name input.
	
	
	@Test			//Case5
	public void name_input_special_character_check() {
		Boolean value = mcont.name_isValid(":'//.");
		assertFalse(value);
	} 			//Checking whether the output is false using assertFalse as 'special characters' are not a valid name input.
	

	@Test			//Case6
	public void name_input_number_check() {
		Boolean value = mcont.name_isValid("123");
		assertFalse(value);
	}			//Checking whether the output is false using assertFalse as 'numbers' are not a valid name input.
	
	
	@Test			//Case5
	public void name_input_alphabets_check() {
		Boolean value = mcont.name_isValid("Hello World");
		assertTrue(value);			//Checking whether the output is True using assertTrue as 'Alphabets' are not a valid name output.
	}
	
	
	
	/*Graphing for email_isValid()*/
	
	/* Node 1: checks the condition (Condition Checking Node) whether input == null or if input does not matches the given regex (Starting Node)
	 * 
	 * Node 2: If input == null and does not matches the given regex, return boolean value = false (Final Node)
	 * 
	 * Node 3: if input != null and the matches the given regex, (Condition Checking Node)  return boolean value = false (Final Node)
	 * 
	 * 
	 * 
	 * 
	 * Prime Paths: [1,2] [1,3]
	 * 
	 * For Prime Path 1 the value is : "Wheed213@.com"
	 * 
	 * For Prime Path 2 the value is : "www123@email.com"
	 */
	
	
	
	/* Email input Test Cases  */
	
	@Test			//Case1
	public void email_input_null() {
		Boolean value = mcont.email_isValid(null);
		assertFalse(value);
	}			//Checking whether the output is false using assertFalse as 'null' is not a valid name input.
	
	@Test			//Case2
	public void email_input_is_not_null() {
		Boolean value = mcont.email_isValid("www@email.com");
		assertTrue(value);
	}			//Checking whether the output is false using assertFalse as 'null' is not a valid name input.
	
	
	@Test			//Case3
	public void email_input_is_empty() {
		Boolean value = mcont.email_isValid("");
		assertFalse(value);
	}			//Checking whether the output is false using assertFalse as an 'empty' string is not a valid name input.

	
	@Test			//Case4
	public void email_input_is_not_empty_check() {
		Boolean value = mcont.email_isValid("www@email.com");
		assertTrue(value);
		
	}			//Checking whether the output is false using assertFalse as an 'empty' string is not a valid name input.
	
	
	@Test			//Case5
	public void email_input_only_special_character_check() {
		Boolean value = mcont.email_isValid(":'//.");
		assertFalse(value);
	} 			//Checking whether the output is false using assertFalse as 'special characters' are not a valid name input.
	

	@Test			//Case6
	public void email_input_only_number_check() {
		Boolean value = mcont.email_isValid("123");
		assertFalse(value);
		
	}			//Checking whether the output is false using assertFalse as 'numbers' are not a valid name input.
	
	
	@Test			//Case5
	public void email_input_only_alphabets_check() {
		Boolean value = mcont.email_isValid("Hello_World");
		assertFalse(value);			//Checking whether the output is True using assertTrue as 'Alphabets' are not a valid name output.
		
	}
	
	

	
	/*Graphing for mobile_check()*/
	
	/* Node 1: checks the condition (Condition Checking Node) whether input == null  (Starting Node)
	 * 
	 * Node 2: If input == null return boolean value = false (Final Node)
	 * 
	 * Node 3: if input != null, check whether matches regex or not(Condition Checking Node) 
	 * 
	 * Node 4: if input matches regex  return boolean value = true (Final Node)
	 * 
	 * Node 5 if input does not match regex, return boolean value = false (Final Node)
	 * 
	 * 
	 * 
	 * Prime Paths: [1,2] [1,3,4] [1,3,5]
	 * 
	 * For Prime Path 1 the value is : null
	 * 
	 * For Prime Path 2 the value is : "01754653587"
	 * 
	 * For Prime Path 3 the value is : "W2314"
	 */
		
	
	
	
	/*Name input Test Cases*/
	
	
	@Test			//Case1
	public void mobile_input_null() {
		Boolean value = mcont.mobile_check(null);
		assertFalse(value);
	}			//Checking whether the output is false using assertFalse as 'null' is not a valid number input.(Prime path 1)
	
	@Test			//Case2
	public void mobile_input_is_not_null() {
		Boolean value = mcont.mobile_check("01751841625");
		assertTrue(value);
	}			//Checking whether the output is true using assertTalse as '01751841625' is  a valid number input.(Prime path 2)
	
	
	@Test			//Case3
	public void mobile_input_is_empty() {
		Boolean value = mcont.mobile_check("");
		assertFalse(value);
	}			//Checking whether the output is false using assertFalse as an 'empty' string is not a valid number input.

	
	@Test			//Case4
	public void mobile_input_is_not_empty_check() {
		Boolean value = mcont.mobile_check("01751841625");
		assertTrue(value);
	}			//Checking whether the output is false using assertFalse as an 'empty' string is not a valid number input.(Prime path 2)
	
	
	@Test			//Case5
	public void mobile_input_special_character_check() {
		Boolean value = mcont.mobile_check(":'//.");
		assertFalse(value);
	} 			//Checking whether the output is false using assertFalse as 'special characters' are not a valid number input.
	

	@Test			//Case6
	public void mobile_input_number_check() {
		Boolean value = mcont.mobile_check("12312312343");
		assertTrue(value);
	}			//Checking whether the output is true using assertTrue as '11 digit number' is a valid Mobile/Phone number input.
	
	
	@Test			//Case5
	public void mobile_input_alphabets_check() {
		Boolean value = mcont.mobile_check("W3234");
		assertFalse(value);			//Checking whether the output is False using assertFrue as 'Alphabets' are not a valid number output.
	}
	
	
	
	
/*Graphing for generateAboutMe()*/
	
	/* Node 1: checks the condition (Condition Checking Node) whether input == null || input == ""  (Starting Node)
	 * 
	 * Node 2: If input == null return "" (Final Node)
	 * 
	 * Node 3: if input != null, (Condition Checking Node)  return given String (Final Node)
	 * 
	 * Prime Paths: [1,2] [1,3]
	 * 
	 * For Prime Path 1 the value is : null
	 * 
	 * For Prime Path 2 the value is : "Hello, I am a student of North South University"
	 */
		
	
	
	
	/*generateAboutMe input Test Cases*/
	
	
	@Test			//Case1
	public void generateAboutMe_input_null() {
		String actual = mcont.generateAboutMe(null);
		String expected = "";
		assertEquals(expected,actual);
	}			//Checking whether the output is false using assertFalse as 'null' is not a valid generateAboutMe input.
	
	@Test			//Case2
	public void generateAboutMe_input_is_not_null() {
		String aboutme = "Hello World";
		String actual = mcont.generateAboutMe(aboutme);
		String expected = "               <h3 class = \"lead\"><span>About Me</span></h3>\r\n" + 
				"              <p >"+ aboutme + "</p>\r\n" ;
		assertEquals(expected,actual);
	}			//Checking whether the output matches with the expected value using assertEquals  if the input is not null.
	
	
	@Test			//Case3
	public void generateAboutMe_input_is_empty() {
		String actual = mcont.generateAboutMe("");
		String expected = "";
		assertEquals(expected, actual);
	}			//Checking whether the output matches with the expected value using assertEquals if the input in empty.

	
	@Test			//Case4
	public void generateAboutMe_input_is_not_empty_check() {
		String aboutme = "Waheed";
		String actual = mcont.generateAboutMe(aboutme);
		String expected = "               <h3 class = \"lead\"><span>About Me</span></h3>\r\n" + 
				"              <p >"+ aboutme + "</p>\r\n" ;
		assertEquals(expected,actual);
	}			//Checking whether the output matches with the expected value using assertEquals if the input in empty.
	
	
	@Test			//Case5
	public void generateAboutMe_input_special_character_check() {
		String aboutme = "*.sd/";
		String actual = mcont.generateAboutMe(aboutme);
		String expected = "               <h3 class = \"lead\"><span>About Me</span></h3>\r\n" + 
				"              <p >"+ aboutme + "</p>\r\n" ;
		assertEquals(expected,actual);
	} 			//Checking whether the output matches with the expected value using assertEquals if the input contains special characters.
	

	@Test			//Case6
	public void generateAboutMe_input_number_check() {
		String aboutme = "131132";
		String actual = mcont.generateAboutMe(aboutme);
		String expected = "               <h3 class = \"lead\"><span>About Me</span></h3>\r\n" + 
				"              <p >"+ aboutme + "</p>\r\n" ;
		assertEquals(expected,actual);
	}			//Checking whether the output matches with the expected value using assertEquals if the input contains numbers.
	
	
	@Test			//Case5
	public void generateAboutMe_input_alphabets_check() {
		String aboutme = "ADFdsg hello";
		String actual = mcont.generateAboutMe(aboutme);
		String expected = "               <h3 class = \"lead\"><span>About Me</span></h3>\r\n" + 
				"              <p >"+ aboutme + "</p>\r\n" ;
		assertEquals(expected,actual);
	} 			//Checking whether the output matches with the expected value using assertEquals if the input contains Just Alphabets.
	
	
	
	
	
	
	
/*Graphing for skillhtmlGenerator()*/
	
	/* Node 1: checks the condition (Condition Checking Node) whether input == null || input == ""  (Starting Node)
	 * 
	 * Node 2: If input == null || input == "" ,return "" (Final Node)
	 * 
	 * Node 3: if input != null or input != "", (Condition Checking Node)  return given String (Final Node)
	 * 
	 * Prime Paths: [1,2] [1,3]
	 * 
	 * For Prime Path 1 the value is : null
	 * 
	 * For Prime Path 2 the value is : "Java"
	 */
		
	
	
	
	/*skillhtmlGenerator input Test Cases*/
	
	
	@Test			//Case1
	public void skillhtmlGenerator_input_null() {
		String actual = mcont.skillhtmlGenerator(null);
		String expected = "";
		assertEquals(expected,actual);
	}			//Checking whether the output is false using assertFalse as 'null' is not a valid generateAboutMe input.
	
	@Test			//Case2
	public void skillhtmlGenerator_input_is_not_null() {
		String skills = "Java";
		String actual = mcont.skillhtmlGenerator(skills);
		String expected = "<h5> "+ skills + "</h5>\r\n";
		assertEquals(expected,actual);
	}			//Checking whether the output matches with the expected value using assertEquals  if the input is not null.
	
	
	@Test			//Case3
	public void skillhtmlGenerator_input_is_empty() {
		String actual = mcont.skillhtmlGenerator("");
		String expected = "";
		assertEquals(expected, actual);
	}			//Checking whether the output matches with the expected value using assertEquals if the input in empty.

	
	@Test			//Case4
	public void skillhtmlGenerator_is_not_empty_check() {
		String skills = "Waheed";
		String actual = mcont.skillhtmlGenerator(skills);
		String expected = "<h5> "+ skills + "</h5>\r\n";
		assertEquals(expected,actual);
	}			//Checking whether the output matches with the expected value using assertEquals if the input in empty.
	
	
	@Test			//Case5
	public void skillhtmlGenerator_input_special_character_check() {
		String skills = "*.sd/";
		String actual = mcont.skillhtmlGenerator(skills);
		String expected = "<h5> "+ skills + "</h5>\r\n";
		assertEquals(expected,actual);
	} 			//Checking whether the output matches with the expected value using assertEquals if the input contains special characters.
	

	@Test			//Case6
	public void skillhtmlGenerator_input_number_check() {
		String skills = "131132";
		String actual = mcont.skillhtmlGenerator(skills);
		String expected = "<h5> "+ skills + "</h5>\r\n";
		assertEquals(expected,actual);
	}			//Checking whether the output matches with the expected value using assertEquals if the input contains numbers.
	
	
	
	@Test			//Case5
	public void skillhtmlGenerator_input_alphabets_check() {
		String skills = "ADFdsg hello";
		String actual = mcont.skillhtmlGenerator(skills);
		String expected = "<h5> "+ skills + "</h5>\r\n";
		assertEquals(expected,actual);
	} 			//Checking whether the output matches with the expected value using assertEquals if the input contains Just Alphabets.
	
	
	
	
/*Graphing for WEhtmlGenerator()*/
	
	/* Node 1: checks the condition (Condition Checking Node) whether input == null || input == ""  (Starting Node)
	 * 
	 * Node 2: If input == null || input == "" ,return "" (Final Node)
	 * 
	 * Node 3: if input != null or input != "", (Condition Checking Node)  checks the condition if input2 ==null || input2 == "" 
	 * 
	 * Node 4: if input2 ==null || input2 == "", return "" (Final Node)
	 * 
	 * Node 5: if input2 !=null || input2 != "", (Condition Checking Node) checks the condition if input3 ==null || input3 == ""
	 * 
	 * Node 6: if input3 ==null || input3 == "", return "" (Final Node)
	 * 
	 * Node 7: if input3 !=null || input3 != "", returns given string
	 * 
	 * 
	 * Prime Paths: [1,2] [1,3,4] [1,3,5,6] [1,3,5,7]
	 * 
	 * For Prime Path 1 the value is : [null,"2 months","waiter"]
	 * 
	 * For Prime Path 2 the value is : ["Burger Lab",null,"waiter"]
	 * 
	 * For Prime Path 3 the value is : ["Burger Lab","2 months",null]
	 * 
	 * For Prime Path 4 the value is : ["Burger Lab","2 months","waiter"]
	 */
		
	
	
	
	/*WEhtmlGenerator input Test Cases*/
	
	
	@Test			//Case1
	public void WEhtmlGenerator_input_null() {
		String actual = mcont.WEhtmlGenerator(null,null,null);
		String expected = "";
		assertEquals(expected,actual);
	}			//Checking whether the output is false using assertFalse as 'null' is not a valid generateAboutMe input.
	
	@Test			//Case2
	public void WEhtmlGenerator_input_is_not_null() {
		String job_inst = "Burger joint",job_dur="2 months", job_post="waiter";
		
		String actual = mcont.WEhtmlGenerator(job_inst,job_dur,job_post);
		String expected = "                 <div class=\"col-md-5\" >\r\n" + 
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
		assertEquals(expected,actual);
	}			//Checking whether the output matches with the expected value using assertEquals  if the input is not null.
	
	
	@Test			//Case3
	public void WEhtmlGenerator_input_is_empty() {
		String actual = mcont.WEhtmlGenerator("","","");
		String expected = "";
		assertEquals(expected, actual);
	}			//Checking whether the output matches with the expected value using assertEquals if the input in empty.

	
	@Test			//Case4
	public void WEhtmlGenerator_is_not_empty_check() {
		String job_inst = "Burger joint",job_dur="2 months", job_post="waiter";
		String actual = mcont.WEhtmlGenerator(job_inst,job_dur,job_post);
		String expected ="                 <div class=\"col-md-5\" >\r\n" + 
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
		assertEquals(expected,actual);
	}			//Checking whether the output matches with the expected value using assertEquals if the input in empty.
	
	
	@Test			//Case5
	public void WEhtmlGenerator_input_special_character_check() {
		String job_inst = "Burger_jo!nt",job_dur="2_months", job_post="wa!ter";
		String actual = mcont.WEhtmlGenerator(job_inst,job_dur,job_post);
		String expected ="                 <div class=\"col-md-5\" >\r\n" + 
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
		assertEquals(expected,actual);
	} 			//Checking whether the output matches with the expected value using assertEquals if the input contains special characters.
	

	@Test			//Case6
	public void WEhtmlGenerator_input_number_check() {
		String job_inst = "25tolife",job_dur="2_months", job_post="23141";
		String actual = mcont.WEhtmlGenerator(job_inst,job_dur,job_post);
		String expected = "                 <div class=\"col-md-5\" >\r\n" + 
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
		assertEquals(expected,actual);
	}			//Checking whether the output matches with the expected value using assertEquals if the input contains numbers.
	
	
	
	@Test			//Case5
	public void WEhtmlGenerator_input_alphabets_check() {
		String job_inst = "Burger joint",job_dur="2 months", job_post="waiter";
		String actual = mcont.WEhtmlGenerator(job_inst,job_dur,job_post);
		String expected ="                 <div class=\"col-md-5\" >\r\n" + 
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
		assertEquals(expected,actual);
	} 			//Checking whether the output matches with the expected value using assertEquals if the input contains Just Alphabets.
	
	

	
	
}
