package com.inheritance;

public class HDFC extends Bank{

	double principleAmount;
	
	void getCalcutatorInterset(double principleAmount, int tenure, float rateOfInterset) {
		getHDFCBankDetails();
		double d;
		d=(principleAmount*tenure*rateOfInterset)/100;
		System.out.println("Total Interset :" +d);
	}

	private void getHDFCBankDetails() {
	
		System.out.println("HDFC Bank Details");
		int accountnumber = 8081;
		String accountname = "Krisha";
		String accounttype = "Personal Account";
		String balance = "7000";
		
		System.out.println("Account Number :" +accountnumber);
		System.out.println("Account Name :" +accountname);
		System.out.println("Account Type :" +accounttype);
		System.out.println("Balance :" +balance);
		
	}
	
}
