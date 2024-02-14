package com.inheritance;

public class BankMain {

	public static void main(String[] args) {
	
		ICICIBank c = new ICICIBank();
		c.getCaculateInrerset(5000, 2, 2);
		
		SBI s = new SBI();
		s.getCalculateInterset(6000, 2, 2);
		
		HDFC h = new HDFC();
		h.getCalcutatorInterset(7000, 2, 2);
		
	}

}
