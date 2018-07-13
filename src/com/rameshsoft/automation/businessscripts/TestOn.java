package com.rameshsoft.automation.businessscripts;

import java.util.ArrayList;

public class TestOn 
{
	String msg;
	public TestOn(String msg){
		this.msg=msg;
	}
	@Override
	public String toString()
	{
		return msg;
	}
	
public static void main(String[] args) {
	
	ArrayList a = new ArrayList();
	a.add("10");
	a.add("29");
	System.out.println(a.toString());
	System.out.println("Hashcde of ArrayList : " +a.hashCode());
	TestOn t = new TestOn("java");
	System.out.println(t.toString());
	System.out.println("Hashcode of TestOn : " +t.hashCode());
	
	TestOn t1 = new TestOn("selenium");
	TestOn t2 = new TestOn("practice");
	
	System.out.println("T1 :" +t1.hashCode());
	System.out.println("T2 :" +t2.hashCode());
	
	
	
	
	
	
	
	
	
	
	
}
}
