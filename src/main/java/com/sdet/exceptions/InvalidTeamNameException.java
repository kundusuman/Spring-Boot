package com.sdet.exceptions;

public class InvalidTeamNameException extends Exception 
{
	public InvalidTeamNameException(){};
	public String toString()
	{
		return "Invalid team name please check your input";
	}
}
