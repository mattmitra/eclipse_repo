package org.ssglobal.training.codes.operators;

public class TestTemperature {

	public static void main(String[] args) {
		
		Temperature temp = new Temperature();
		System.out.println(temp.chooseTemperature(3));
		System.out.println(temp.chooseTemperatureSwitch(2));
	}

}
