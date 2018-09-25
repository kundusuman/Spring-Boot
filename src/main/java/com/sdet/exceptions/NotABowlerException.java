package com.sdet.exceptions;

public class NotABowlerException extends Exception
{

	public NotABowlerException(){};
	public String toString()
	{
		return "Invalid Bowler please check your input";
	}


}
