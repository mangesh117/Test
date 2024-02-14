package com.inheritance;

public class ICICIBank extends Bank{

	double principleamount;
	public void getCaculateInrerset(double principleamount, int tenure, float rateOfInterset) {
		getICICIBankDetails();
		double totalInterset;
		totalInterset=(principleamount+tenure+rateOfInterset)/100;
		System.out.println("Total Interset:" +totalInterset);
	}
	private void getICICIBankDetails() {
		
		System.out.println("ICICI Bank");
		int accountnumber = 8081;
		String name = "Mangesh";
		String accounttype = "Saving Account";
		String balance = "5000";
		
		System.out.println("Account Number :" +accountnumber);
		System.out.println("Name :" +name);
		System.out.println("Account Type :" +accounttype);
		System.out.println("Balance :" +balance);
		
		
	}
}
