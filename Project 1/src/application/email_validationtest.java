package application;

import static org.junit.Assert.*;

import org.junit.Test;

public class email_validationtest {
	MainController mcont = new MainController();
	
	
	
	/*
	 *Characteristics 1: Is the input value null (Case1)
	 *-------block 1->true( value= {null} )
	 *-------block 2->false( value= {"Apple"} => Base block )
	 
	 *Characteristics 2: Is the input value empty (Case2)
	 *-------block 1->true( value= {""} )
	 *-------block 2->false( value= {"Apple"} => Base block )
	 *
	 *Characteristics 3: Email value length (Case3)
	 *Characteristics 4:Characters and numbers(Case4)
	 *Characteristics 5:Special Characters(Case5)
	 *Characteristics 6: Email with Dots
	 *-------block 1-> email id with single dot ( value = { "single.dot.is.fine@email.com" } => Base block ) -valid (Case6)
	 *-------block 2-> email id with double dots (value = { "double..dot@email.com" } -invalid (Case7)
	 *-------block 3-> email id with trailing dot (value = { "trailing.@email.com" } -invalid (Case8)
	 *-------block 4-> email id with leading dot (value = { ".leadingdot@email.com" } -invalid (Case9)
	
	*/
	
	
	
	
	
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
