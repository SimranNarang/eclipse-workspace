package com.stackroute.utility;

import java.util.HashMap;

public class MapModifier {
	public HashMap<String, String> manipulateMap(HashMap<String, String> map){
		if(!map.get("val1").isEmpty()) {
			map.put("val2", map.get("val1"));
			map.put("val1", "");
		}
		return map;
	}
}
