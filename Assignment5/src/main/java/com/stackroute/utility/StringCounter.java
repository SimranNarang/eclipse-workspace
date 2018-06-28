package com.stackroute.utility;

import java.util.HashMap;
import java.util.Map;

public class StringCounter {
	public String stringCounter(String array[]) {
		Map<String,Integer> counter = new HashMap<>();
		Map<String,Boolean> results = new HashMap<>();
		
		for (String string : array) {
			if(counter.containsKey(string)) {
				counter.put(string, counter.get(string)+1);
			}else {
				counter.put(string, 1);
			}
		}
		
		counter.forEach((key,value)->{
			if(value>=2) {
				results.put(key,true);
			}else {
				results.put(key,false);
			}
		});
		return results.toString();
	}

}
