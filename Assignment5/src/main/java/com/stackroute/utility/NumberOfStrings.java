package com.stackroute.utility;

import java.util.HashMap;
import java.util.Map;

public class NumberOfStrings {

	public String numberOfString(String string) {
		Map<String,Integer> counter = new HashMap<>();
		String words[] = string.trim().split("\\W|_");
		for (String strings : words) {
			System.out.println(strings);
			if(counter.containsKey(strings)&& !strings.isEmpty()) {
				counter.put(strings, counter.get(strings)+1);
			}else if(!strings.isEmpty()) {
				counter.put(strings,1);
			}
		}
		return counter.toString();
		
	}
}
