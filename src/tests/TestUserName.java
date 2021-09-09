package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Login;
import model.PasswordValidation;

public class TestUserName {

	Login login = new Login("account");
	PasswordValidation logic = new PasswordValidation();
	
	@Before
	public void setUp() throws Exception 
	{
		
	}

	@Test
	public void testSettingAndGettingUserName() 
	{
		login.setUserName("user123");
		String name = login.getUserName();
		assertNotNull(name);
	}

}
