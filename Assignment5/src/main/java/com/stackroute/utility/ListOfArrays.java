package com.stackroute.utility;

import java.util.ArrayList;

public class ListOfArrays {
	public ArrayList<String> listofArrays(ArrayList<String> list,String find,String replace){
		list.set(list.indexOf(find),replace);
		return list;
	}
}
