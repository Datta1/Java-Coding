package Day2;

import java.security.PublicKey;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Swap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//decalre 3 variable
		int a = 2;
		int b= 3;
		System.out.println("brfore a and "+a);
		System.out.println("before b is  "+b);
		int temp;
		
	//move from a to temp
		temp =a;
		a=b;
		b=temp;
		System.out.println("after a and "+a);
		System.out.println("after b is  "+b);
		
		

	}

}
