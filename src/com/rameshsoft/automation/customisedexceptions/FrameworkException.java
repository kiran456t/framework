package com.rameshsoft.automation.customisedexceptions;

public class FrameworkException extends Exception
{

	private static final long serialVersionUID = 1L;
	
	public FrameworkException()
	{
		
	}
	public FrameworkException(String msg)
	{
		super(msg);
	}
}
