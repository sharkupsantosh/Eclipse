
public class CopyArrayWithoutArrFunc {
	 public static void main(String[] args)
	    {
		 	
	        int a[] = {1,2,3,4,5,6,7,8,9,10};
		 	
	        int b[] = new int[a.length];	 
	        
	        for (int i=0; i<a.length; i++)
	        b[i] = a[i];

	        System.out.println("Contents of Original A Array ");
	        for (int i=0; i<a.length; i++)
	            System.out.print(a[i] + " ");
	 
	        System.out.println("\n\nContents of Copied B Array ");
	        for (int i=0; i<b.length; i++)
	            System.out.print(b[i] + " ");
	    }

}
