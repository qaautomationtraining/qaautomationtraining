package com.qaautomationtraining.main;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
	
	public static void main (String[] args) 
    { 
		List<String> s1 = new ArrayList<String>();
		s1.add("Kamal");
		System.out.println(s1.get(0));
		
        List<Integer> l1 = new ArrayList<Integer>(); 
        l1.add(0, 1);  
        l1.add(2);  
        System.out.println(l1); 
        
        l1.set(0, 5);    
        System.out.println(l1);  
   
        try {
        l1.remove(1);
        System.out.println(l1.get(1)); 
        System.out.println(l1);
        }catch(Exception e) {
        	System.out.println(e);
        }   
    }

}
