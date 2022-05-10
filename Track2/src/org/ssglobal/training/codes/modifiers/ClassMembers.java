package org.ssglobal.training.codes.modifiers;

public class ClassMembers {
	
	// static variables
	public static long id = 1L;
	double salary = 100.5; // public is the default convention. not default
	
	protected int key = 69696969;
	private char letter = 'v';
	
	// instance variables
	public int age = 10;
	
	// methods
	
	public void showData() {
		id = 2L;
		salary = 5000.5;
		key = 420420420;
		letter = 'h';
	}
	
	void printData() {
		
	}
	
	protected void authenticate() {
		
	}
	
	private void encryptData() {
		
	}
	
	public void referece() {
		showData();
		printData();
		authenticate();
		encryptData();
	}

}
