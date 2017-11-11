package Day2;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		if (a<0) {
			System.out.println("this is an negative number good to go for factorial");
			}
		else {
			System.out.println("positive number");
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("eneter number");
		sc.nextInt();
		
		
		int fact=1;
		for (int i = 1; i < 5; i++) {

			fact=fact*i;
			System.out.println("factorial is "+fact);
			
		}

	}

}
