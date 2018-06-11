package com.datawin;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		List<String> v = new Vector<String>();
		v.add("kvk");
		v.add("kvr");
		v.add("ksk");
		v.add("ksr");
		((Vector<String>) v).addElement("kumar");  
		
		Enumeration<String> e = ((Vector<String>) v).elements();
		while(e.hasMoreElements()) {
		System.out.println(e.nextElement());
		}
		
		Stack<String> st = new Stack<String>();
		st.push("hyd");
		st.push("Mumbai");
		st.push("Pune");
		st.push("chennaui");
		System.out.println(st);
		System.out.println(st.search("hyd"));
		System.out.println(st.search("g"));
		
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i=0; i<=10; i++) {
			al.add(i);
		}
		System.out.println(al);
		
		Iterator<Integer> itr = al.iterator();
		while(itr.hasNext()) {
			Integer I = (Integer) itr.next();
			if(I%2==0) {
				System.out.println(I);
			}else {
			itr.remove();
			}
		}

		
	}
}
