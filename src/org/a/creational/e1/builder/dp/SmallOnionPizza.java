package org.a.creational.e1.builder.dp;

public class SmallOnionPizza extends VegPizza{
	 @Override  
	    public float price() {  
	        return 120.0f;  
	    }  
	    @Override  
	    public String name() {  
	        return  "Onion Pizza";  
	    }  
	    @Override  
	    public String size() {  
	       return  "Small Size";  
	    }

}
