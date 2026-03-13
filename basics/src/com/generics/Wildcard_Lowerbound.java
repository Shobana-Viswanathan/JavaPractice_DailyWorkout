package com.generics;

import java.util.ArrayList;
import java.util.List;

public class Wildcard_Lowerbound {

	public static void main(String[] args) {
	
		    List<Integer>ints=new ArrayList<>();
		    ints.add(3);
		    ints.add(5);
		    ints.add(10);
		    addNumbers(ints);
		    
			}
			public static void  addNumbers(List<? super Integer>list) {
				for(int i=1;i<=10;i++) {
					list.add(i);
				}
				
				System.out.println(list);
			}		
			
	}


