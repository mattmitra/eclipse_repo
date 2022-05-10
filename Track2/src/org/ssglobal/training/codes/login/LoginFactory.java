package org.ssglobal.training.codes.login;

public class LoginFactory {
	
	public boolean isValidUser() {
		
		LoginAuth auth = new LoginAuth();
		LogPermissions permission = new LogPermissions();
		Logout logout = new Logout();
		return true;
		
	}

}
