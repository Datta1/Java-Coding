
package Sunday;
import java.util.Collections;
import java.util.*;
import java.util.concurrent.locks.*;
import java.util.function.*;

public class DemoVerify{  
 public static void main(String args[]){  
  
  LinkedList<String> al=new LinkedList<String>();  
  
  al.add("Ravi");  
  al.add("Vijay");  
  al.add("Ravi");  
  al.add("Ajay");  
  al.add(1, "datta");
  
  
  Iterator<String> itr=al.iterator();  
 
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  }  
 }  
}  