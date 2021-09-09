/**
 * Caleb Wade
 * CIS175 - Fall 2021
 * 09/09/2021
 */
package tests;
import model.Login;
import model.PasswordValidation;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestPassword {

	Login login = new Login("account1");
	PasswordValidation logic = new PasswordValidation();
	
	@Before
	public void setUp() throws Exception 
	{
		
	}

	@Test
	public void testPasswordLengthValid() 
	{
		login.setPassword("password123");
		String password = logic.passwordLength(login); 
		assertNotNull(password);
	}
	
	@Test
	public void testPasswordLengthNotValid() 
	{
		login.setPassword("pass");
		String password = logic.passwordLength(login);
		assertNull(password);
	}
	
	@Test
	public void testValidPasswordUppercase()
	{
		login.setPassword("Zssword");
		boolean password = logic.passwordCapitolLetter(login);
		assertTrue(password);
	}
	
	@Test
	public void testValidPasswordUppercaseAnywhere()
	{
		login.setPassword("passworD");
		boolean password = logic.passwordCapitolLetter(login);
		assertTrue(password);
	}
	
	@Test
	public void testNotValidPasswordUppercase()
	{
		login.setPassword("aaaaaaaaa");
		boolean password = logic.passwordCapitolLetter(login);
		assertFalse(password);
	}
	
	@Test
	public void testValidSpecialCharacter()
	{
		login.setPassword("Password!");
		boolean password = logic.passwordSpecialCharacters(login);
		assertTrue(password); // does not assert true or false
	}
	
	@Test
	public void testValidSpecialCharacterAnywhere()
	{
		login.setPassword("Pa$$word!");
		boolean password = logic.passwordSpecialCharacters(login);
		assertTrue(password);
	}
	
	@Test
	public void testNotValidSpecialCharacter()
	{
		login.setPassword("Password");
		boolean password = logic.passwordSpecialCharacters(login);
		assertFalse(password);
	}
	
	@Test
	public void testValidNumbers()
	{
		login.setPassword("Password1123!");
		boolean password = logic.passwordNumber(login);
		assertTrue(password); // should assert true, possibly does not pull number from password
	}
	
	@Test
	public void testValidNumbersAnywhere()
	{
		login.setPassword("Pa55w0rd!");
		boolean password = logic.passwordNumber(login);
		assertTrue(password); // should assert true, possibly does not pull number from password
	}
	
	@Test
	public void testNotValidNumbers()
	{
		login.setPassword("passwording!!!");
		boolean password = logic.passwordNumber(login);
		assertFalse(password);
	}

}
