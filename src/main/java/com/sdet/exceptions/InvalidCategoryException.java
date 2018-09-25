package com.sdet.exceptions;

public class InvalidCategoryException extends Exception 
{
	public InvalidCategoryException(){};
	public String toString()
	{
		return "Invalid category name please check your input";
	}
}
