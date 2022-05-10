package org.ssglobal.training.codes.params;

public class PassVariables {
	
	public void passPrimitive(int number) {
		number = 100;
		System.out.format("the new number is %d. \n", number);
	}
	
	public void passRefVar(StringBuilder sb) { // sb pointer-like
		sb.append(" in the Philippines");
		System.out.format("The new sb is %s. \n", sb);
	}
	
	public void passStrVal(String str) {
		str = "Pasig";
		System.out.format("The new str is %s. \n", str);
	}
}
