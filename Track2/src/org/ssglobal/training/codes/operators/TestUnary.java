package org.ssglobal.training.codes.operators;

public class TestUnary {

	public static void main(String[] args) {
		
		Unary unary = new Unary();
		System.out.println("------------POST INCREMENT-------------------");
		unary.loopWithoutCounterVarPost();
		System.out.println("----------------------------------");
		unary.loopWithCounterVarPost();
		System.out.println("------------PRE INCREMENT-------------");
		unary.loopWithoutCounterVarPre();
		System.out.println("----------------------------------");
		unary.loopWithCounterVarPre();
	}
}
