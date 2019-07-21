package application;

import static org.junit.Assert.*;
import org.junit.Test;
import static org.junit.Assert.*;


public class name_validationtest  {
	MainController mcont = new MainController();
	
	
	
	/*
	 *Case1: Null input check
	 *Case2: Empty String input check
	 *Case3: Special Characters input check
	 *Case4: Number input check
	 *Case5: Alphabets check
	*/
	
	
	@Test			//Case1
	public void testCase1() {
		Boolean value = mcont.name_check(null);
		assertFalse(value);
	}			//Checking whether the output is false using assertFalse as 'null' is not a valid name input.
	
	

	
	
	


}
