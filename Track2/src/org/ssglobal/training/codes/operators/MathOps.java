package org.ssglobal.training.codes.operators;

public class MathOps {
	
	public int divide(final int x, final int y) {
		
		return x/y; //integer division op
	}
	
	public int calRemainder(final int x, final int y) {
		
		return x%y;
	}
	
	public double divideNum(final int x, final int y) {
		double xdbl = x;
		double ydbl = y;
		
		return xdbl / ydbl;
		//return (double)(x) / (double)(y);
	}
	
	public double divideNumParams(final double x, final double y) {
		
		return x/y;
	}
	
	public double divideNumCustom(final int x, final int y) {
		
		return 1.0 * x / y; // (*, /, +, -)
	}
}
