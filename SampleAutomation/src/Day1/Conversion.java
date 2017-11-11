package Day1;


 
import java.util.Scanner;


public class Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	System.out.println(Integer.parseInt("100"));
		int b = 12;     
		System.out.println(String.valueOf(b));
		 float f = 12.13145F;     
		 System.out.println(String.valueOf(f)); 
		 
		 //start with method 
		 String s = "Datta Kolekar";
		if (s.startsWith("Da")) {
			System.out.println("datta");
			
			//String Myname = (datta + " " + kolekar);
			
			//String Myname = ("datta".split("kolekar") ;
			String Name = "datta";
			String Income = "1000000";
			System.out.println(Name + " " + Income);
			
			int a = 3 % 2;     
			int d = 11 % 3;     
			int c = 7 % -3; 
			System.out.println(a);    
		    System.out.println(d);     
		    System.out.println(c);
		    
		    int n = 10;
		    int m = 20;
		    if (n==10 & m==30) {
		    	System.out.println("correct result");
				}
		    else {
				System.out.println("wrong result");
			}
		    
		    if (n % 2 == 0) {
		    
		    	System.out.println("even");
		    }
		    	else {
		    		System.out.println("odd");
		    	}
// read the input from console and give me output
		    		Scanner sc=new Scanner(System.in);
		    		System.out.println("what is your name");
		    		sc.nextLine();
		    		sc.nextInt();
		    		System.out.println("team");
		    		sc.next();
		    		
				
		    
		
		} 
		 
		} 

}

