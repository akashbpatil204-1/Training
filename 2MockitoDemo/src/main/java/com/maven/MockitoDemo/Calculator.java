package com.maven.MockitoDemo;

public class Calculator /*implements CalculatorService*/  {
	public int performCaculation(CalculatorService cs) 
	{
		System.out.println("Performing Calculation");
		return cs.add(10,20);
	}
}
