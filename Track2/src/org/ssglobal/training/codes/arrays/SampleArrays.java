package org.ssglobal.training.codes.arrays;

public class SampleArrays {
	
	char[] letters = new char[5];  //fixed length
	
	public void createSingleArrays() {

		System.out.println(letters[0]);
		letters[0] = 64;
		letters[1] = 'a';
		letters[2] = '\u20b1';
		letters[3] = 'C';
		letters[4] = 't';
		System.out.println(letters[0]);
		
		String names[] = new String[10]; // array of objects / no constructors
		names[names.length-1] = "Matt"; // last cell
		int lenArray = letters.length; // constant value
		System.out.println(lenArray);
		System.out.println(names[names.length-1]);
		
		double[] grades = { 78.5, 90.6, 100.5};
		System.out.println(grades[0]);
		
		grades = null;
		grades = new double[] {66.0, 90.5, 22.5, 100.5};
		System.out.println(grades[0]);
	}
	
	public void createMatrix() {
		
		int [][] matrix = new int[3][3];
		
		// row 1
		matrix[0][0] = 2;
		matrix[0][1] = 5;
		matrix[0][2] = 10;
		
		// row 2
		matrix[1][0] = 1;
		matrix[1][1] = 1;
		matrix[1][2] = 1;
		
		// row 3
		matrix[2][0] = 2;
		matrix[2][1] = 2;
		matrix[2][2] = 2;
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.println(matrix[i][j]);
			}
			System.out.println(); //\n
		}
		
		double[][] prices = new double[][] { {2.2, 3.3, 4.5}, 
											 {8.9, 4.5, 1.1},
											 {3.4, 6.6, 4.5} };
		/*								 
		for (int i = 0; i < prices.length; i++) {
			for (int j = 0; j < prices[i].length; j++) {
				System.out.println(prices[i][j]);
			}
			System.out.println(); //\n
		}
		*/
											 
		for(double[] rowLookup: prices) {
			for(double colLookup: rowLookup) {
				System.out.println(colLookup);
			}
			System.out.println(); //\n 
		}
		
	}

}
