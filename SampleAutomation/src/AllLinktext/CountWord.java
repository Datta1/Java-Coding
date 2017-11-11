package AllLinktext;
import java.lang.StringBuffer;
public class CountWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//code to reverse  the word in given sentences
		String s = "my name is Datta datta kolekar yar";
		StringBuffer x = new StringBuffer(s);
		StringBuffer reverse = x.reverse();
		System.out.println(reverse);
		
		
		//code to read word in sentences.
	int	count = 1;
	
	for (int i = 0; i < s.length()-1; i++) {
		if ((s.charAt(i)== ' ') && (s.charAt(i+1)!= ' ')) {
			count++;
			
		}
		
	}

	System.out.println("the total number words in the given string is= "+count);
	}

}
