package Day3;

public class ThisKeyword {


		int a;
		int b;
		
		void sample(int a , int b) {
			a=this.a;
			b=this.b;
		}
		
		void result() {

			System.out.println(a+b);
			System.out.println(b-a);
		}
			
			
		
		
		public static void main(String[] args) {
			ThisKeyword tk = new ThisKeyword();
			tk.sample(2, 3);
		    tk.result();
		}

	}

