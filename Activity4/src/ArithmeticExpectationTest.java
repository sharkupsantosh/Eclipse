//dividing an integer with zero is handled by this arithmetic exception
public class ArithmeticExpectationTest {
	 public static void main(String args[])
	  {
	    int a =10, b = 0, c;
	    
	    try
	    {
	      c = a/b;
	      System.out.println(c);  
	    }
	    
	    catch(ArithmeticException e)
	    {
	      System.out.println("Do not divide by zero sir."  + e );
	    }
	   
	  }

}
