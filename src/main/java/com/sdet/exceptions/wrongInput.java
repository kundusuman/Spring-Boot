package com.sdet.exceptions;

public class wrongInput extends Exception
{
	String str="";
	wrongInput(){}
	public wrongInput(String str)
	{
		str=str;
	}
	public String toString()
	{
		return ("enter " + str + " carefully");
	}

}
