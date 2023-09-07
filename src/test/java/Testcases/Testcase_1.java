package Testcases;

import org.testng.annotations.Test;

import Page_Object.RegistrationPage;

public class Testcase_1 extends RegistrationPage {
@Test	
public void signup() throws InterruptedException {
	
RegistrationPage obj = new Testcase_1();

obj.homepage();
}
}
