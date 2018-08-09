package org.a.creational.b.abstractfactory.dp;

public class HDFC implements Bank {
	private final String BNAME;
	public HDFC()
	{
		BNAME="HDFC BANK";
	}
	public String getBankName()
	{
		return BNAME;
	}

}
