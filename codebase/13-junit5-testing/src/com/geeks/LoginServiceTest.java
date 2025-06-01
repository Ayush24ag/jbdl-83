package com.geeks;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LoginServiceTest {
	public LoginServiceTest() {
		System.out.println("****Constructor****");
	}
	@Test
	void loginTest1() {
		LoginService service=new LoginService();
		boolean status=service.login("albin", "sunday");
		assertEquals(true, status);
	}
	@Test
	void loginTest2() {
		LoginService service=new LoginService();
		boolean status=service.login(" albin", "sunday");
		assertEquals(true, status);
	}
	@Test
	void loginTest3() {
		LoginService service=new LoginService();
		boolean status=service.login("albin ", "sunday");
		assertEquals(true, status);
	}
	@Test
	void loginTest4() {
		LoginService service=new LoginService();
		boolean status=service.login(" albin ", "sunday");
		assertEquals(true, status);
	}
	@Test
	void loginTest5() {
		LoginService service=new LoginService();
		boolean status=service.login("albi n", "sunday");
		assertEquals(false, status);
	}

}
