package com.stackroute.utility;

public class TransposingString {
	public String transposeString(String string) {
		String transposedString="";
		String array[]= string.trim().split(" ");
		for(int i=0;i<array.length;i++) {
			String rev="";
			for(int j=array[i].length()-1;j>=0;j--){
				rev=rev+array[i].charAt(j);
			}
			transposedString=transposedString+" "+rev;
		}
		return transposedString.trim();
	}
}
