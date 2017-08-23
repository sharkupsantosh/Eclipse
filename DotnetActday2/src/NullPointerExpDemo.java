
public class NullPointerExpDemo {
	public static void main(String[] args) {
        
        doSomething(null);
        
    }
	private static String doSomething(final String param) {
        try {
			System.out.println(param.toString());
		} 
        catch (Exception e) {
			throw new NullPointerException(" Object reference not set to an instance of an object.");
		}
        return "";
    }
}
