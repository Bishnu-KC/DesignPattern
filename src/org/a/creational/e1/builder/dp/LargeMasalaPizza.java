package org.a.creational.e1.builder.dp;

public class LargeMasalaPizza extends VegPizza{
	@Override  
    public float price() {  
        return 150.0f;  
    }  
  
    @Override  
    public String name() {  
      
        return  "Masala Pizza";  
      
    }  
  
    @Override  
    public String size() {  
       return  "Large Size";  
    }  

}
