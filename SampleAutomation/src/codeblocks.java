import net.sourceforge.htmlunit.corejs.javascript.tools.debugger.Main;

public class codeblocks {
	
	void doSomething() {
	    int a;

	    {
	        int b;
	       b=3;
	    }

	    a = 2;
	   // b = 3; // Illegal because the variable b is declared in an inner scope.
	    
	System.out.println(a);
	
}
	

public static void main(String[] args) {
	codeblocks codeblocks = new codeblocks();
	codeblocks.doSomething();
	
}




}