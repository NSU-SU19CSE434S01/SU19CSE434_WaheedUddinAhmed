package application;

import static org.junit.Assert.*;
import org.junit.Test;
import static org.junit.Assert.*;


public class name_validationtest  {
	MainController mcont = new MainController();
	
	
	
	/*
	 *Characteristics 1: Is the input value null
	 *-------block 1->true( value= {null} )
	 *-------block 2->false( value= {"Apple") => Base block )
	 
	 *Characteristics 2: Is the input value empty
	 *-------block 1->true( value= {""} )
	 *-------block 2->false( value= {"Apple"} => Base block )
	 *
	 *Characteristics 3:
	 *Case1: Null input check
	 *Case2: Empty String input check
	 *Case3: Special Characters input check
	 *Case4: Number input check
	 *Case5: Alphabets check
	*/
	
	
	@Test			//Case1
	public void testCase1() {
		Boolean value = mcont.name_isValid(null);
		assertFalse(value);
	}			//Checking whether the output is false using assertFalse as 'null' is not a valid name input.
	
	
	@Test			//Case2
	public void testCase2() {
		Boolean value = mcont.name_isValid("");
		assertFalse(value);
	}			//Checking whether the output is false using assertFalse as an 'empty' string is not a valid name input.

	
	@Test			//Case3
	public void testCase3() {
		Boolean value = mcont.name_isValid(":'//.");
		assertFalse(value);
	} 			//Checking whether the output is false using assertFalse as 'special characters' are not a valid name input.
	

	@Test			//Case4
	public void testCase4() {
		Boolean value = mcont.name_isValid("123");
		assertFalse(value);
	}			//Checking whether the output is false using assertFalse as 'numbers' are not a valid name input.
	
	
	@Test			//Case5
	public void testCase5() {
		Boolean value = mcont.name_isValid("Hello World");
		assertTrue(value);			//Checking whether the output is True using assertTrue as 'Alphabets' are not a valid name output.
	}
	
	
	


}
