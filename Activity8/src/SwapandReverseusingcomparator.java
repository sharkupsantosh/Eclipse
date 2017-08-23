import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student{    
    private String name;
    private int Mark;     
    public Student(String n, int s){
        this.name = n;
        this.Mark = s;
    }     
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getMark() {
        return Mark;
    }
    public void setMark(int Mark) {
        this.Mark = Mark;
    }
    public String toString(){
        return "Name: "+this.name+"  Mark: "+this.Mark;
    }
}

class MarkComp implements Comparator<Student>{
	 
    @Override
    public int compare(Student e1, Student e2) {
        if(e1.getMark() < e2.getMark()){
            return 1;
        } else {
            return -1;
        }
    }
}

public class SwapandReverseusingcomparator {
	public static void main(String a[]){
        
        List<Student> list = new ArrayList<Student>();
        list.add(new Student("Santosh",90));
        list.add(new Student("Krishna",78));
        list.add(new Student("Maar",98));
        list.add(new Student("Kaba",65)); 
        System.out.println("Entries Before Swapping: ");
        for(Student e:list){
            System.out.println(e);
        }
        Collections.sort(list,new MarkComp());        
        System.out.println("\n Entries After Swapping: ");
        for(Student e:list){
            System.out.println(e);
        }
        System.out.println("\n Entries After Reversing: ");
        Collections.reverse(list);
        for(Student e:list){
            System.out.println(e);
        }
        
    }

}