package org.a.creational.b.abstractfactory.dp;

public class ICICI implements Bank{
	
	private final String BNAME;
	ICICI()
	{
		BNAME="ICICI BANK";
	}
	public String getBankName()
	{
		return BNAME;
	}

}
