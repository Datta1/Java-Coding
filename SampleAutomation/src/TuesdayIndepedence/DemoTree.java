package TuesdayIndepedence;

import java.util.Map.Entry;
import java.util.TreeMap;

import com.gargoylesoftware.htmlunit.javascript.host.Map;

public class DemoTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<Integer,String> hm=new TreeMap<Integer,String>();  
		  hm.put(100,"Amit");  
		  hm.put(102,"Ravi");  
		  hm.put(101,"Vijay");  
		  hm.put(103,"Rahul");  
		  
//		  for(Entry<Integer, String> m:hm.entrySet()){  
//		   System.out.println(m.getKey()+" "+m.getValue());  
//		   
//		  
//		  for(Entry<Integer, String> m1:hm.entrySet()){ 
//		  hm.remove(101);
//		  System.out.println(m1.getKey()+" "+m1.getValue()); 
//		  }
//		  }
		  hm.remove(102);
		  System.out.println("Values after remove: "+ hm);  
		 }  
		

	}


