package testing;

import java.util.ArrayList;
import java.util.Collections;

public class TestSort2 {
	public static void main(String[] args) {
		ArrayList<Student> li = new ArrayList<Student>();
		li.add(new Student(2000,23,"Btech"));
		li.add(new Student(45,34,"Btech"));
		li.add(new Student(1000,24,"Btech"));
		li.add(new Student(99,18,"Btech"));
		
		System.out.println("Before Sorting: ");
		for(Student stud : li) {
			System.out.println("RollNo: "+stud.rollno+" Age: "+stud.age+"Course: "+stud.course);
		}
		
		ArrayList<String> str = new ArrayList<String>();
		str.add("Shanu");
		str.add("shivi");
		str.add("shizuka");
		
		// Collections.sort() method can be used only on Collections lists. 
		// And if that list contains UserDefined objects (i.e not like String , Integer ) then that user defined data type(class) whose object is
		// to be made must Implement the Comparable Interface
		
		Collections.sort(li); // As li is of Student Type ,so Student class must be implementing the Comparable interface's compareTo() method.
		
		Collections.sort(str);
		
		System.out.println("Printing the student list after sorting by help of Comparable interface");
		
		for(Student stud : li) {
			System.out.println("RollNo: "+stud.rollno+" Age: "+stud.age+"Course: "+stud.course);
		}
		for(String iter: str) {
			System.out.println(iter);
		}
		System.out.println("Testing : "+1/2);
	}
	
}
