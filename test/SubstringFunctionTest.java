import static org.junit.Assert.*;

import org.junit.Test;


public class SubstringFunctionTest {

	
	
	SubstringFunction substringFunciton= new SubstringFunction();
	
	
	@Test
	public void negativeTestEmptyString() {
		
		String original ="";
		String textTofind="";
		
		assertEquals(false, substringFunciton.findString(original, textTofind));
		
		}
	
	
	@Test
	public void negativeTestNullString() {
		
		String original =null;
		String textTofind=null;
		
		assertEquals(false, substringFunciton.findString(original, textTofind));
		
		}
	
	@Test
	public void negativeTest(){
		String original ="what";
		String textTofind="nothing to see here";
		
		assertEquals(false, substringFunciton.findString(original, textTofind));
		
		}
	
	@Test
	public void positiveTest() {
		
		String textTofind ="ed";
		String original="edgar";
		
		assertEquals(true, substringFunciton.findString(original, textTofind));
		
		}
	
	@Test
	public void positiveTestWithEspace() {
		
		String original ="lopez edgar";
		String textTofind="ed";
		
		assertEquals(true, substringFunciton.findString(original, textTofind));
		
		}
	
	
	@Test
	public void positiveTestSpecialChar() {
		
		String textTofind ="@#$%";
		String original="son of a b@#$%";
		
		assertEquals(true, substringFunciton.findString(original, textTofind));
		
		}	

}
