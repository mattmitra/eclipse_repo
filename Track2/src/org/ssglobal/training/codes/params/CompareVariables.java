package org.ssglobal.training.codes.params;

public class CompareVariables {
	
	public void comparePrimitives() {
		int x1 = 10;
		int x2 = 20;
		System.out.println(x1 == x2);
		
	}
	
	public void compareRefVar() {
		StringBuilder sb1 = new StringBuilder("Manila");
		StringBuilder sb2 = new StringBuilder("Manila");
		//System.out.println(sb1 == sb2); // compares sb1 and sb2 memory, not the objects they're pointing to 
		System.out.println(sb1.toString().equals(sb2.toString()));
	}
	
	public void compareStrVal() {
		String str1 = new String("Manila");
		String str2 = new String("Manila");
		System.out.println(str1 == str2); // Wrong
		System.out.println(str1.equals(str2));
		
		//Wrong Practice
		String str3 = "Manila";
		String str4 = "Manila";
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
		System.out.println(str3 == str4); //nasusunod yung value
	}

}
