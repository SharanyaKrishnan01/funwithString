package com.funWithStrings;

public class RemovalOfVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "areuokbaby";
		char result;
		char notvowel;
		
		char c[] = s.toCharArray();
		for(int i=0;i<c.length;i++) {
			if(c[i] =='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u') {
				result=c[i] ;
			}
			else {
				notvowel = c[i];
				System.out.print(notvowel);

				
				}
		}
		
	}

}
