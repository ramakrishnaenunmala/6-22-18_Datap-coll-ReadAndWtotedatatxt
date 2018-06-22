package com.sample;

import java.util.Map;

public class HashMap {
	public static void main(String args[]){  
	
		java.util.HashMap<Integer,String> hm=new java.util.HashMap<Integer,String>();
		hm.put(108, "jamana");
		hm.put(106, "kamana");
		hm.put(105, "ramana");
	for (Map.Entry m : hm.entrySet()) {
		System.out.println(m.getKey()+""+m.getValue());
	}
	}
	
	
}