package org.a.creational.e1.builder.dp;
import java.io.IOException; 

public class BuilderDemo {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
	    
        OrderBuilder builder=new OrderBuilder();  
          
        OrderedItems orderedItems=builder.preparePizza();  
          
        orderedItems.showItems();  
          
        System.out.println("\n");  
        System.out.println("Total Cost : "+ orderedItems.getCost());  
          
    }

	}


