package com.stackroute.utility;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexFindText {
	public List<String> IndexStrings(String input,String substring){
		List<String> occurence = new ArrayList<String>();
			Pattern pattern = Pattern.compile(substring,Pattern.CASE_INSENSITIVE);
			Matcher matcher = pattern.matcher(input);
			while(matcher.find()) {
				occurence.add(matcher.start()+"-"+matcher.end());
			}
		
		return occurence;
		
	}

}
