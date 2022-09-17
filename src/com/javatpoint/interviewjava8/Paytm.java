package com.javatpoint.interviewjava8;

public class Paytm implements UPIPayment {

	@Override
	public String doPayment(String source, String dest) {
		UPIPayment.datePattern("yyyy-mm-dd");
		return null;
	}
    @Override
    public double getScratchCard() {
    	return UPIPayment.super.getScratchCard();
    }
}
