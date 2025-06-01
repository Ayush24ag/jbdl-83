package com.geeks;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

class LoginServiceTest2 {
	public LoginServiceTest2() {
		System.out.println("***Test class constructor****");
	}
	 LoginService service;//=new LoginService();
	@BeforeEach
	public  void beforeTest() {
		service= new LoginService();
		System.out.println("Before Each");
	}
	
	@ParameterizedTest
	@CsvSource({"albin,sunday,true"," albin,sunday,true","Albin ,Sunday,false"})
  void loginTest(String uname,String pwd,boolean expected) {
	     boolean status= service.login(uname, pwd);
	     assertEquals(expected, status);
  }
	@ParameterizedTest
	@CsvFileSource(resources = "/testcredentials.csv",numLinesToSkip = 1)
	void loginTest2(String uname,String pwd,boolean expected) {
	     boolean status= service.login(uname, pwd);
	     assertEquals(expected, status);
 }
	@Test
	void testEmptyUserName() {
	    // boolean status= service.login("", "");
	     assertThrows(RuntimeException.class, ()->service.login("",""));
	}
	@Test
	void testEmptyUserNameMessage() {
		try {
		  service.login(null, ""); //here it must throw exception
		  fail("Test case failed due not throwing exception"); //to make the test case fail ....
		}
		catch(RuntimeException e) {
			assertEquals("UserName cannot be blank", e.getMessage());
		}
	}
	
}
