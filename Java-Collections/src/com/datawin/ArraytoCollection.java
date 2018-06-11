package com.datawin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraytoCollection {
	
	public static List<String> toList(String[] array){
		if(array == null) {
			return new ArrayList<String>(0);
		}else {
			int size = array.length;
			ArrayList<String> al = new ArrayList<String>(size);
			for(int i=0; i<size; i++) {
				al.add(array[i]);
			}
			return al;
		}
	}
	
	public static void main(String[] args) {
		String[] str = {"kvk1","kvr1","ks11","ktk1","ktr1","kar1"};
		
       List<String> citys = Arrays.asList(str);
       for(String s: citys) {
    	   System.out.println(s.toString());
       }
	
       List<String> city = toList(str);
      
       Collections.sort(city);
       System.out.println("Sorted ArrayList in Ascending order in Java : " +city);

       Collections.sort(city, Collections.reverseOrder());
       
       System.out.println("Sorted ArrayList in Descending order in Java : " +city);
	}
}
