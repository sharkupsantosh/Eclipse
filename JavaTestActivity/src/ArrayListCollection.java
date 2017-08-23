import java.util.ArrayList;

import java.util.Iterator;
public class ArrayListCollection {
	public static void main(String args[]){  
		  ArrayList<String> al=new ArrayList<String>();  
		  al.add("This");  
		  al.add("is");  
		  al.add("Spartaa..!");  
		  ArrayList<String> al2=new ArrayList<String>();  
		  al2.add("Touch");  
		  al2.add("if");  
		  al2.add("u"); 
		  al2.add("can"); 
		  al.addAll(al2);//adding second list in first list  
		  Iterator itr=al.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
		 }  

}
