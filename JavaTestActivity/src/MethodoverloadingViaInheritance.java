//Method Overloading Using Inheritance
class Base
{
    public int f(int i)
    {
        System.out.print("The provided data is a integer and the calculated output : ");
        return i+10;
    }
} 
class Derived extends Base
{
    public double f(double i)
    {
        System.out.print("The provided data type is a double and the calculated output : ");
        return i*10;
    }
}

public class MethodoverloadingViaInheritance {
	public static void main(String args[])
    {		
		System.out.println("The provided data is 3 & 3.0\n");
		System.out.println("If its a integer it will add 10 \nIf its a double it will multiply 10\n");
        Derived obj = new Derived();
        System.out.println(obj.f(3.0));
        System.out.println(obj.f(3));
        
     }

}
