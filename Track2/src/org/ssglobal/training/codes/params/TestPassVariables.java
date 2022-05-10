package org.ssglobal.training.codes.params;

public class TestPassVariables {

	public static void main(String[] args) {
		PassVariables cv = new PassVariables();
		
		// Primitive Var
		int testX = 10;
		System.out.format("This is the original num: %d \n", testX);
		cv.passPrimitive(testX);
		System.out.format("This is new num: %d \n", testX);

		// Reference Var
		//[12345]testSb -> [67890] ==> 67890("Manila")
		StringBuilder testSb = new StringBuilder("Manila"); // pointed to @
		System.out.format("This is the original sb is %s. \n", testSb);
		cv.passRefVar(testSb);
		System.out.format("This is the new sb is %s. \n", testSb);
		System.out.println(testSb);
		
		//String Example
		String testStr = new String("Pasay");
		System.out.format("This is the original TestStr is %s \n", testStr);
		cv.passStrVal(testStr); // no passing of address
		System.out.format("This is the new TestStr is %s \n", testStr);
	}

}
