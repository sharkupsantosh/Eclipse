import java.lang.reflect.*;


public class PrivateMethodAccess {
	public static void main(String args[])throws Exception{  
		Class c=PrivateMethodDemo.class;  
		Object obj=c.newInstance();  
		  
		Method m=c.getDeclaredMethod("cube",new Class[]{int.class});  
		m.setAccessible(true);  
		m.invoke(obj,4);  
		}

}
