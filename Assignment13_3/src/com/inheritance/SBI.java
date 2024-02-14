package com.inheritance;

public class SBI extends Bank{

	double principleAmount;
	void getCalculateInterset(double principleAmount, int tenure, float rateOfInterset) {
		SBIBankDetails();
		double d;
		d=(principleAmount*tenure*rateOfInterset)/100;
		System.out.println("Total Interset :" +d);
	}
	private void SBIBankDetails() {
	
		System.out.println("SBI Bank details");
		int accountnumber = 89745;
		String accountname = "Jayant";
		String accounttype = "Personal Account";
		String Balance = "11111";
		
		System.out.println("Account Number :" +accountnumber);
		System.out.println("Account Name :" +accountname);
		System.out.println("Account Type :" +accounttype);
		System.out.println("Balance :" +Balance);
	
	}
}
