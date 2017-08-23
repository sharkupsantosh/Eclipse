import java.util.*;;

public class FibonnaciSeries {
@SuppressWarnings("resource")
public static void main(String[] args) {
        
        int first = 0;
        int second = 1;        
        Scanner in = new Scanner(System.in);        
        System.out.println("Enter no. elements to print in a Fibonacci series :");
        int n = in.nextInt();        
        System.out.println("Fibonacci series \n");
        System.out.print(first + " "+ second + " ");        
        int next;        
        int i = 2;        
        while(i < n) {            
            next = first + second;            
            System.out.print(next + " ");            
            first = second;
            second = next;            
            i++;
        }        
    }
}
