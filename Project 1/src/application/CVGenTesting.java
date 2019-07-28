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
	}			//Checking whether the output is false using assertFalse as 'null' is not a valid name input.
	
	@Test			//Case2
	public void mobile_input_is_not_null() {
		Boolean value = mcont.mobile_check("01751841625");
		assertTrue(value);
	}			//Checking whether the output is false using assertFalse as 'null' is not a valid name input.
	
	
	@Test			//Case3
	public void mobile_input_is_empty() {
		Boolean value = mcont.mobile_check("");
		assertFalse(value);
	}			//Checking whether the output is false using assertFalse as an 'empty' string is not a valid name input.

	
	@Test			//Case4
	public void mobile_input_is_not_empty_check() {
		Boolean value = mcont.mobile_check("01751841625");
		assertTrue(value);
	}			//Checking whether the output is false using assertFalse as an 'empty' string is not a valid name input.
	
	
	@Test			//Case5
	public void mobile_input_special_character_check() {
		Boolean value = mcont.mobile_check(":'//.");
		assertFalse(value);
	} 			//Checking whether the output is false using assertFalse as 'special characters' are not a valid name input.
	

	@Test			//Case6
	public void mobile_input_number_check() {
		Boolean value = mcont.mobile_check("12312312343");
		assertTrue(value);
	}			//Checking whether the output is false using assertFalse as 'numbers' are not a valid name input.
	
	
	@Test			//Case5
	public void mobile_input_alphabets_check() {
		Boolean value = mcont.mobile_check("Hello World");
		assertFalse(value);			//Checking whether the output is True using assertTrue as 'Alphabets' are not a valid name output.
	}
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
