	package Saturday;
	
	public class Encapsulation {
		
		private String name;
		
		
	 public String getName(String name) {
		 this.name=name;
		return name;
		}
	public String setName(String name) {
			return this.name = name;
		}
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Encapsulation e= new Encapsulation();
			System.out.println(e.getName("kolekar"));
			System.out.println(e.setName("datta"));
	
		}
	
	}
