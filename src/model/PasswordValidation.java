/**
 * Caleb Wade
 * CIS175 - Fall 2021
 * 09/09/2021
 */
package model;

public class PasswordValidation {
	
	public String passwordLength(Login login)
	{
		String userName;
		userName = login.getPassword();
		
		if(userName.length() < 5)
		{
			return null;
		}
		else
		{
			return userName;
		}
		
	}
	
	public boolean passwordCapitolLetter(Login login)
	{
		String userName;
		char currentCharacter;
		boolean isValid = false;
		userName = login.getPassword();
		
			for (int i = 0; i < userName.length(); i++)
			{			
				currentCharacter = userName.charAt(i);
				if(currentCharacter >= 65 && currentCharacter <= 90) // all test work with hard coded letter
				{
					isValid = true;
				}
				
			}
		return isValid; 
	}
	
	public boolean passwordSpecialCharacters(Login login)
	{
		String userName;
		String specialCharacters="!@#$%&*()'+,-./:;<=>?[]^_`{|}\"";
		//char currentCharacter;
		boolean isValid = false;
		userName = login.getPassword();
		for (int i=0; i < userName.length() ; i++)
        {
            char currentCharacter = userName.charAt(i);
            if(specialCharacters.contains(Character.toString(currentCharacter))) 
            {
            	isValid = true;
                break;
            }    
       
        }
		
		return isValid;
	}
	
	public boolean passwordNumber(Login login)
	{
		String userName;
		char currentCharacter;
		boolean isValid = false;
		userName = login.getPassword();
		
			for (int i = 0; i < userName.length(); i++)
			{			
				currentCharacter = userName.charAt(i);
				if(currentCharacter >= 48 && currentCharacter <= 57) // all test work with hard coded letter
				{
					isValid = true;
				}
				
			}
		return isValid; 
	}

}
