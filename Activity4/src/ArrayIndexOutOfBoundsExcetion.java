//accessing an array element that does not exist here a[3] is not present.

public class ArrayIndexOutOfBoundsExcetion {
	
	 public static void main(String args[])
	  {
	    int data[] = { 12, 31, 45 };  
	 
	    try
	    {
	      int d1 = data[3];                          
	      System.out.println("The data is " + d1);
	    }
	    catch(ArrayIndexOutOfBoundsException e)
	    {
	      System.out.println("The Requested array element is out of the provided array size..! "  + e );
	    }	    
	  }

}
