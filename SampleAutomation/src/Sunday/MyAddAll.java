package Sunday;


import java.util.*; 
public class MyAddAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	ArrayList<String> al = new ArrayList<String>();
	al.add("datta");
	al.add("dasharath");
	al.add("kolekar");
	
	
	ArrayList<String> al2 = new ArrayList<String>();
	al2.add("hadalaga");
	al2.add("belgaum");
	
	al.addAll(al2);
	Iterator itr=al.iterator(); 
	
	  while(itr.hasNext()){  
	   System.out.println(itr.next());
	    
		
	}
	}
}
	
	
		
	



