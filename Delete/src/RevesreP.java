import java.util.Scanner;

public class RevesreP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num, digit, rev = 0;
		System.out.println("Enter number");
		Scanner sc = new Scanner(System.in);
	num = sc.nextInt();
		
		
		while(num > 0) {
			
			digit = num % 10;
			rev = (rev*10)+digit;
			
			num = num/10;
		}
		
		System.out.println("Reverse num is "+rev);
	}

}
