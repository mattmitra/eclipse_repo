package org.ssglobal.training.codes.params;

public class TestVarArg {

	public static void main(String[] args) {
		
		VarArg var = new VarArg();
		var.printNums(1, 2, 3, 4, 5);
		var.printNums();
		var.printNums(10, 11, 12, 13, 14, 15);
		
		int[] array = new int[10];
	}

}
