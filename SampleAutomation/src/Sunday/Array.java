package Sunday;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] s1 = new String[5];
		s1[0]="datta";
		s1[1]="datta1";
		s1[2]="datta2";
		s1[3]="datta3";
		s1[4]="datta4";	
//		s1[5]="datta5";	
//		s1[6]="datta6";
		int number = s1.length;
		System.out.println(number);
		System.out.println(s1[0]);
		
		
		//read all values
		
		for (int i = 0; i < s1.length-1; i++) {
			System.out.println("values of s1 is stores" + i +" "  + s1[i]);
			
		}
		
		}

}
