package com.wk.service;

public class BankService {
	
	
	public  float calSimpleIntr(int pAmt,float rate,float time) {
	System.out.println("****calSimpleIntr*******");
	       return pAmt*rate*time/100.0f;

                 }
	public  float calCompoundIntr(int pAmt,float rate,float time) {
		System.out.println("******calCompoundIntr********");
	       return (float) ((pAmt*Math.pow(1+(rate/100), time))-pAmt);

              }
}