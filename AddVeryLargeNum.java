package com.funWithStrings;

import java.math.BigInteger;

public class AddVeryLargeNum {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "1234567812345678";
		String b = "11111111111111111";
		
		BigInteger c = new BigInteger(a);
		BigInteger d = new BigInteger(b);
		
		if(a.length() > b.length()) {
			System.out.println(c.add(d));
			
			}
		else {
			System.out.println(d.add(c));
			}

	}

}
