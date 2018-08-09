package org.a.creational.b.abstractfactory.dp;

public abstract class AbstractFactory {
	public abstract Bank getBank(String bank);
	public abstract Loan getLoan(String loan);

}
