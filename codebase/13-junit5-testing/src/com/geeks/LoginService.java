package com.geeks;
public class LoginService {
	public LoginService() {
		System.out.println("Login Service constructor");
	}
  public boolean login(String uname,String pwd) {
	  //connect with the DB & chk the credentials
	  //call the repository and access the data & chk the credentials
	 if(uname==null || uname.equals("")) {
		  throw new RuntimeException("UserName cannot be blank");
	}
	  
	  if(uname.trim().equalsIgnoreCase("Albin") && pwd.equals("sunday")){
		  return true;
	  }
	  else {
		  return false;
	  }
  }
}
