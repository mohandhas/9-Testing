package com.accolite.TestAssignment;

public class FizzBuzz {
	
	public FizzBuzz() {
		
	}
	 
	public String checkResult(int i)
	{
		
			if(i%3==0 && i%5==0)
			{
				return "FizzBuzz";
			}
			else if(i%5==0)
			{
				return "Buzz";
			}
			else if(i%3==0)
			{
				return "Fizz";
			}
				return i+"";
	}
}
