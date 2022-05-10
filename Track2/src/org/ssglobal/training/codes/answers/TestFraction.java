package org.ssglobal.training.codes.answers;

public class TestFraction {

	public static void main(String[] args) {
		
		Fraction f1 = new Fraction();
		f1.numerator = 2;
		f1.denominator = 2;
		
		Fraction f2 = new Fraction();
		f2.numerator = 3;
		f2.denominator = 4;
		
		Fraction f3 = new Fraction();
		f3.numerator = 1;
		f3.denominator = 2;
		
		Fraction f4 = new Fraction();
		f4.numerator = 2;
		f4.denominator = 2;
		
		//f1.add(f2).toFractionString();
		
		f1.multiply(f2).toFractionString();
		
		System.out.println(f3.greaterEqual(f4));
		
		// Properties of an object
		// Criteria: Identity property;
		
		int id1 = f1.hashCode();
		System.out.println(id1);
		int id2 = f2.hashCode();
		System.out.println(id2);
		int id3 = f3.hashCode();
		System.out.println(id3);
		
		// Criteria: State property
		
		System.out.println(f1.numerator);
		System.out.println(f1.id);
		System.out.println(f2.numerator);
		System.out.println(f2.id);
		System.out.println(f3.numerator);
		System.out.println(f3.id);
	}

}
