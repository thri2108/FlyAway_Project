package Testcases;

import org.testng.annotations.Test;

import Page_Object.LoginPage;

public class Testcase_2 extends LoginPage {
@Test
	public void signup() throws InterruptedException {
		
		LoginPage obj = new Testcase_2();

		obj.homepage();
		}
}
