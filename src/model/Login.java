/**
 * Caleb Wade
 * CIS175 - Fall 2021
 * 09/09/2021
 */
package model;

public class Login {

	private String accountName;
	private String userName;
	private String passWord;
	
	public Login()
	{
		
	}
	
	public Login(String accName)
	{
		this.accountName = accName;
		//this.userName = name;
		//this.passWord = pass;
	}
	
	public String getAccountName()
	{
		return accountName;
	}
	
	public void setAccountName(String newName)
	{
		this.accountName = newName;
	}
	
	public String getUserName()
	{
		return userName;
	}
	
	public void setUserName(String name)
	{
		this.userName = name;
	}
	
	public String getPassword()
	{
		return passWord;
	}
	
	public void setPassword(String pass)
	{
		this.passWord = pass;
	}
}
