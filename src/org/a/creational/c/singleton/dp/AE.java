package org.a.creational.c.singleton.dp;

class AE {
	private static AE obj=new AE(); //Early instance will be created at load time
	private AE()
	{
		
	}
	public static AE getA()
	{
		return obj;
	}
	public void doSomething()
	{
		System.out.println("Early Instance");
	}

}
