//This example demonstrates the HashMap class
package com.collections;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashmapDemo {

	public static void main(String[] args) {
		
		    LinkedHashMap<String,Double>tm=new LinkedHashMap<String,Double>();
		    System.out.println("Size of the HashMap is "+tm.size());
		    tm.put("John Doe", 4343.43);
		    tm.put("Tom Smith", 145.23);
		    tm.put("Jane Baker", 1450.78);
		    tm.put("Raiph Smith", -18.76);
		    System.out.println("Elements in the HashMap "+tm);
		    System.out.println("Size of the HashMap is "+tm.size());
		    Set<Map.Entry<String,Double>>set=tm.entrySet();
		    for(Map.Entry<String, Double>me : set){
		    	System.out.println(me.getKey()+":"+me.getValue());
		    	
		    }
			
			}


}
