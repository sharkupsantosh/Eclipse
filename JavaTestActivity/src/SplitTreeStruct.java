import java.util.Scanner;
public class SplitTreeStruct {
	public static void main(String[] args)
    {	
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in); 
        //Taking noOfRows value from the user 
        System.out.println("How Many Rows You Want In Your Pyramid?"); 
        int noOfRows = sc.nextInt(); 
        //Initializing rowCount with noOfRows 
        int rowCount = noOfRows; 
        System.out.println("Here Is The Pyramid"); 
        //Implementing the logic 
        for (int i = 0; i < noOfRows; i++)
        {             
            //Printing j where j value will be from 1 to rowCount 
            for (int j = 1; j <= rowCount; j++)             
            {
                System.out.print(j+" ");
            }            
            for (int j = 1; j <= i*2; j++)
            {
                System.out.print(" ");
                System.out.print(" ");
            }
            //Printing j where j value will be from rowCount-1 to 1
            if(i==0) 
            {
            	for (int j = rowCount-1; j >= 1; j--)
                {                 
                    System.out.print(j+" ");         
                }            	
            }            
            for (int j = rowCount; j >= 1; j--)
            {                 
                System.out.print(j+" ");                
            }             
            System.out.println(); 
            //Decrementing the rowCount
            rowCount--;
        }
    }
}