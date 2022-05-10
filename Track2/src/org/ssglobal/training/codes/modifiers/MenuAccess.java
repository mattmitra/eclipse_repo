package org.ssglobal.training.codes.modifiers;

import org.ssglobal.training.codes.login.LoginFactory;

public class MenuAccess {
	
	public void showMenu() {
		LoginFactory login = new LoginFactory();
		login.isValidUser();
	}

}
