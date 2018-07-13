package com.rameshsoft.automation.businessscripts;

public class CloneTest implements Cloneable
{
	int a;
	String name;
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Object a = new String("RameshSoft");
		System.out.println("RunTime Object type of a is : " +a.getClass().getName());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*CloneTest t = new CloneTest();
		System.out.println(t.a+"...."+t.name);
		
		CloneTest t1 =(CloneTest)t.clone();
		t1.a = 99;
		t1.name = "java";
		System.out.println(t1.a+"...."+t1.name);
		System.out.println(t.hashCode());
		System.out.println(t1.hashCode());
		t.a=1100;
		t.name = "selenium";
		System.out.println(t.a+"...."+t.name);*/
	}
}
