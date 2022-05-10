package org.ssglobal.training.codes.declaration;

public class MyDataType {
	
	//global variables
	public static final double PIE = 3.141617; // constants can be class var
	public static long versionId = 1L;
	public static String creature = "vertebrate";
	public static int error_level = 0; //placeholders or legends
	
	public byte counter;
	public short numProducts;
	public int numCells = 20000;
	public long numTCells = 20000L;
	
	public float weight = 0.05F;
	public double billGatesMoney = 0.05;
	
	public char letter;
	public String personName = " ";
	
	public void createVars() {
		
		//local vars
		int age = 0;
		float salary;
		final float MY_PIE = 90.6F; // cont params are not all caps
		
		System.out.println("counter: " + counter);
		System.out.println("age: " + age);
		System.out.println("letter: " + letter);
		System.out.println("personName: " + personName);
		
		
	}
	
	public void manageArguments(float weight, byte counter) {
		System.out.println("weight: " + weight);
		
	}
	
	public void createBlockVarsThruIf(int option) {
		
		if (option == 0) {
			int err_val = 10; // block var
			option = option + err_val;
			System.out.println("Option" + option);
		} else {
			int otherwise_val = -10; // block var
			option = option + otherwise_val; 
			System.out.println("Option" + option);
		}
	}
	
	public void createBlockVarsThruLoop(int[] ids) {
		
		for (int i = 0; i < ids.length; i++) { //block variable i
			System.out.println("ids: " + ids[i]);
		}
		
	}
	
	public void createBlockVarsThruSwitch(int option) {
		
		switch(option) {
		case 1: 
			float amount = 1000.50F; // block variable 
			System.out.println(1);
			break;
		case 2:
			System.out.println(2);
			break;
		case 3:
			System.out.println(-1);
			break;
		
		
		}
	}
	
	public void assignLiterals() {
		
		//integral types
		counter = 127; //within the range -128, 127
		numProducts = 32000;
		numCells = 787878878; // default integer type int
		numTCells = 7878787111l; // caused problem: coercion. put L or l
		
		//real number types
		billGatesMoney = 9999999999999999.89;
		weight = 89.5f; // put f or F 
		
		//character literal types
		
		// ASCII
		letter = 'H';
		System.out.println("H letter: " + letter);
	
		// Numerical value - coercion applies to ASCII only
		letter = 0;
		System.out.println("0 letter: " + letter);
		letter = 68;
		System.out.println("0 letter: " + letter);
		letter = 127;
		System.out.println("0 letter: " + letter);
		letter = 126;
		System.out.println("0 letter: " + letter);
		letter = 125;
		System.out.println("0 letter: " + letter);
		
		
		// Unicode characters (UTF-8) - hexadecimal form
		letter = '\u20B1';
		System.out.println("UTF-8: " + letter);
		letter = '\u00F1';
		System.out.println("UTF-8: " + letter);
		
		//String literals
		personName = "Juan Luna\n";
		System.out.println("personName");
		
	}
	
	public void literalConversion() {
		
		numProducts = 10; // identity conversion
		int amount = 32000; // widening
		double salary = 67800.5F;
		byte param = (byte) 128; //narrowing
		System.out.println(param);
		float price = (float) 89.6;
		System.out.println(price);
		
	}

}

class TestMyDataType{
	
	public static void main(String[] args) {
		
		MyDataType mdt = new MyDataType();
		
		MyDataType.error_level = -1;
		System.out.println("PIE: " + MyDataType.PIE);
		System.out.println("billGatesMoney: " + mdt.billGatesMoney);
		System.out.println("error_Level: " + MyDataType.error_level);
		mdt.manageArguments(89.6F, (byte) 0); //add byte in coercion problem with bytes
		mdt.manageArguments(75.6F, (byte) 7); //
		mdt.createBlockVarsThruLoop(new int[]{10, 20, 45, 89});
		
		mdt.createVars();
		mdt.assignLiterals();
		mdt.literalConversion();

	}
	
	
}
