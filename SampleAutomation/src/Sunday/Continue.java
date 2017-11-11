package Sunday;

public class Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for(int Count = 0;Count<=5;Count++){
			if(Count==3){
				System.out.println("Count is ==> " + Count);
				continue;				
				}

	}

}
	
	
	String days[] = { "Mon", "Tue", "Wed", "Thr", "Fri", "Sat", "Sun"};
		
	 
    // Enhanced for loop, this will automatically iterate on the array list 
    for (String dayName : days) {
      System.out.println("Days ==> "+ dayName);
    	}

    System.out.println("<==== Normal For Loop ====>");
    // Normal for loop
    for (int i=0; i < days.length; i++) {
        System.out.println("Days ==> "+ days[i]);
    	}
	}

	
}
