import java.util.Hashtable;
import java.util.Set;
import java.util.Iterator;

public class HashtableIterator {	 
	 public static void main(String[] args) {	 	    	 
	    Hashtable<String, String> hashtable = new Hashtable<String, String>();
	    hashtable.put("1", "Data One");
	    hashtable.put("2", "Data Two");
	    hashtable.put("3", "Data Three");
	    hashtable.put("4", "Data Four");
	    hashtable.put("5", "Data Five");	 
	    System.out.println("Hashtable contains The Following Data:\n");
	    Set<String> keys = hashtable.keySet();
	    Iterator<String> itr = keys.iterator();
	    while (itr.hasNext()) { 
	    String Temp = itr.next();
	    System.out.println("Key: "+Temp+" & Value: "+hashtable.get(Temp));
	    
	    }
	    
	 }

}
