package com.rameshsoft.automation.businessscripts;

public class StringTest {
public static void main(String[] args) {
	
	String s = " hello,java ,selenium hello  ";
	//System.out.println(s);
	System.out.println(s.trim());
	String[] str = s.split(",");
	for(int i = 0; i<str.length;i++)
	{
		System.out.println(str[i]);
	}
	
	String s1 = "hello java";
	/*char[] ch = s1.toCharArray();
	
	for(int i =0;i<ch.length;i++){
		System.out.println(ch[i]);
	}*/
	
	String s2 = "java";
	System.out.println(s2.toUpperCase());
	System.out.println(s2.toLowerCase());
	
	
	
	
	
	
	
	
	
	
	
}
}
