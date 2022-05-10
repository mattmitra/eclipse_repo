package org.ssglobal.training.codes.params;

public class VarArg {
	
	public void printNums(int...nums) {
		/*
		for(int lookup: nums) {
			System.out.println(lookup);
		}
		*/
		
		if(nums.length == 0) {
			System.out.println("Empty List");
		} else {
			for(int lookup: nums) {
				System.out.println(lookup);
			}
		}
	}
}
