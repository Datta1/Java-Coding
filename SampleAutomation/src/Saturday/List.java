package Saturday;
import java.util.ArrayList;
import java.util.*;

public class List{


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String> ();
		list.add("datta");
		list.add("kolekar");
		list.add("datta1");
		list.add("datta2");
		
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			}
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
			}
		
		

	}

}
