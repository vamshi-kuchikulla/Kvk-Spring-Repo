package com.lambda;

public class StringTest1 {
	public static void main(String[] args) {
		String s = "instrument";
		String s5 ="investment";
		
		//important methods
	   System.out.println(s5.equals("INVESTMENT"));	
	   System.out.println(s5.equalsIgnoreCase("INVESTMENT"));	
	   
       System.out.println(s.length());
       System.out.println(s.indexOf("t"));
       
       System.out.println(s.toUpperCase());
       System.out.println(s.toLowerCase());
       System.out.println(s.charAt(4));
       System.out.println(s.toCharArray());
       System.out.println(s.substring(4));
       System.out.println(s.substring(4,9));
       
       String s6 = "    hi how are you   ";
       System.out.println(s6.trim());
       System.out.println(s6.trim());
       
       //philndrome
       StringBuffer s1 =new StringBuffer("constent");
       System.out.println(s1.reverse());
       
       //important constructors
       char[] ch = {'a','b','c','d','e'};
       String s2 = new String(ch);
       System.out.println(s2);
       System.out.println(s2.replace('a', 'b'));
       
       byte[] b = {65, 75, 85,112};
       String s3 = new String(b);
       System.out.println(s3);
       
       String s4 = s.concat("systems");
       //s4  = s+"system";
       //s4 += "system";
       
       System.out.println(s4);
       
       //value of int string
       int i = 89;
       String v = String.valueOf(i);
       System.out.println(v);
	}
}
