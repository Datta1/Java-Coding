package Day2;
import java.util.Scanner;

public class LargeThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int b;
		int c;
		System.out.println("enter three integer number");
		Scanner scanner = new Scanner(System.in);
		a=scanner.nextInt();
		b=scanner.nextInt();
		c=scanner.nextInt();
				
		
		
//		int a = 1;
//		int b = 2;
//		int c= 3;
		
		if (a>b && a>c) {
			System.out.println("a is greater");
			}
		else if (b>a && b>c) {
			System.out.println("b is greater");
			}
		
		else if (c>a && c>b) {
			System.out.println("c is greater");
			
		} else {
			System.out.println("number is not valid");

		}
		
		
		
	}

}
