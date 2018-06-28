package com.stackroute.utility;

public class ReplacingCharacter {
	public String replacingCharacter(String string) {
		String replaced_d = string.replaceAll("d|D","f");
		String replacedString = replaced_d.replaceAll("l|L", "t");
		return replacedString;
		
	}

}
