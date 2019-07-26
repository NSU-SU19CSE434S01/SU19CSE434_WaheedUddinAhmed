package application;

import static org.junit.Assert.*;

import org.junit.Test;

public class CVGenTesting {
	MainController mcont = new MainController();


	
	/*Interface-Based testing*/
	
	 /*Characteristics 1: Is the input value null 
	 *-------block 1->true( value= {null} )  (Case1)
	 *-------block 2->false( value= {"Apple"}  )  (Case2)
	 
	 *Characteristics 2: Is the input value empty 
	 *-------block 1->true( value= {""} )  (Case3)
	 *-------block 2->false( value= {"Apple"} )  (Case4)
	 *
	 *Characteristics 3: Not empty or null
	 *Case5: Special Characters input check 
	 *Case6: Number input check 
	 *Case7: Alphabets check 
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
	
	
	
	
	
	
	
	
	
	
	
	
}
