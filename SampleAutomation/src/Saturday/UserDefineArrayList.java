package Saturday;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class UserDefineArrayList {
int a ;
int b;

 UserDefineArrayList(int a,int b) {
	 this.a=a;
	 this.b=b;
	 
	// TODO Auto-generated constructor stub
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserDefineArrayList s1 = new UserDefineArrayList(3, 3);
		UserDefineArrayList s2 = new UserDefineArrayList(3, 3);
		UserDefineArrayList s3 = new UserDefineArrayList(3, 3);
		UserDefineArrayList s4 = new UserDefineArrayList(3, 3);
		
		//cretaing array and itrate value and print result.
		ArrayList<UserDefineArrayList> list = new ArrayList<UserDefineArrayList> ();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		
		Iterator itr = list.iterator();
		
		while (itr.hasNext()) {
			UserDefineArrayList ud = (UserDefineArrayList)itr.next();
			System.out.println(ud.a);
			System.out.println(ud.b);
			
		}
		
		
		
		};
		}

