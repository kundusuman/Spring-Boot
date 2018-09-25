package com.sdet.exceptions;

public class NotABatsmanException extends Exception
{

		public NotABatsmanException(){};
		public String toString()
		{
			return "Invalid Batsman please check your input";
		}
	

}
