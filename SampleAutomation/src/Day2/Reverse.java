package Day2;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String original = null,reverse = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string value");
        sc.nextLine();
        
        int length = original.length();
        for (int i = length-1; i >= 0; i--) {
        	original=reverse+original.charAt(i);
        	System.out.println("reverse string value is  "+original);
			
		}
        
	}

}
