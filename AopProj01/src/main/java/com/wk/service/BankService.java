package com.wk.service;

public class BankService {
	
	
	public static float calSimpleIntr(int pAmt,float rate,float time) {
	
	       return pAmt*rate*time/100.0f;

                 }
	public static float calCompoundIntr(int pAmt,float rate,float time) {
		
	       return (float) ((pAmt*Math.pow(1+(rate/100), time))-pAmt);

              }
}
