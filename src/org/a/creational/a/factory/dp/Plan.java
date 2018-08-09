package org.a.creational.a.factory.dp;
import java.io.*;

public abstract class Plan {
	protected double rate;
	abstract void getRate();
	
	public void calculateBill(int units)
	{
		System.out.println(units*rate);
	}	

}// end of Plan class.
