package org.ssglobal.training.codes.operators;

import org.ssglobal.training.codes.modifiers.ClassMembers;

public class TestClassMembers extends ClassMembers {

	public static void main(String[] args) {
		ClassMembers cm = new ClassMembers();
		cm.id = 4L;
		cm.showData();
		
		
	}
	
	public void accessPoint() {
		key = 9000; // can access keys if you extend what class they're under to
		authenticate();
	}

}
