import java.lang.reflect.Field;
public class ObjectsusingReflection {
	public static void main(String args[]) throws Exception {
		FieldTest ft = new FieldTest();
		Class ftClass = ft.getClass();

		Field f1 = ftClass.getDeclaredField("pub");
		f1.set(ft, "This is Public Data");
		String str1 = (String) f1.get(ft);
		System.out.println("Public field: " + str1);

		Field f2 = ftClass.getDeclaredField("pro");
		f2.set(ft, "This is protected data");
		String str2 = (String) f2.get(ft);
		System.out.println("\nProtected field: " + str2);
	}
	
}
