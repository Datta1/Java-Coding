package Sunday;
import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;

public class DemoListInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list = new ArrayList<String> ();
		list.add("datta");
		list.add("kolekar");
		list.add("datta1");
		list.add("datta2");
		
		ListIterator <String>itr = list.listIterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			}
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
			}
		System.out.println("completed forrword iteration");
		
		while (itr.hasPrevious()) {
			System.out.println(itr.previous());
			//System.out.println("completed reverse iteration");
			}
		System.out.println("completed reverse iteration");

	}

}
