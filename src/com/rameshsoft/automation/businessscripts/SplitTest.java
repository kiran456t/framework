package com.rameshsoft.automation.businessscripts;

public class SplitTest {
public static void main(String[] args) {
	
	String cell = 

			"java,selenium,test,hello,practice,job,success,practice is mandatory,practice";
	
	String[] s = cell.split(",");
	int aCount = 0;
	for(String st : s)
	{
		System.out.println(st);
		char[] ch =st.toCharArray();
		
		for(char c : ch)
		{
			if (c == 'a') {
				aCount++;
			}
		}
	}
	System.out.println("A Count is : " +aCount);
	
	
}
}
