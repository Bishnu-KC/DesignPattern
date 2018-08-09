package org.a.creational.c.singleton.dp;

import java.io.Serializable;
/*

class AL implements Serializable {
	 private static AL obj;
	 private AL()
	 {
		 
	 }
	 public static AL getAL()
	 {
		 if(obj==null)
		 {
			 synchronized(Singleton.class)
			 {
				 obj=new Singleton();
			 }
		 }
	 }
	 protected Object readResolve()
	 {
		 return getAL();
	 }
	 return obj;

	 public void doSomething()
	 {
		 System.out.println("Lazy Instation");
	 }
}
*/