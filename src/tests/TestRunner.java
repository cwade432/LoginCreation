/**
 * Caleb Wade
 * CIS175 - Fall 2021
 * 09/09/2021
 */
package tests;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {

	public static void main(String[] args)
	{
		Result result = JUnitCore.runClasses(TestPassword.class);
		
		for(Failure failure : result.getFailures())
		{
			System.out.println(failure.toString());
		}
		
		System.out.println("All test passed true/false: " + result.wasSuccessful());
	}
}
