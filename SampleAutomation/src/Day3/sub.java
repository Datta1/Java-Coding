package Day3;

class sub extends SuperKeyword{  

  int speed = 200;  

 void  Bike6(){  
System.out.println(speed);
    System.out.println(super.speed);  

  }  

  public static void main(String args[]){  

   sub s = new sub();
   s.Bike6();

 }  

}  