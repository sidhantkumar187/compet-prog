/*	Program to Learn the use of Comparable Interface.
 * 	First of all Comparable is an Interface which is used for the USER DEFINED data type to be compared according to some property(its member)
 * 	
 * 	contains a method to be implemented:
 * 						int compareTo(Object o):
 * 
 * 	which must return -ve or +ve or 0 by comparing values.
 * 
 * */

package testing;

public class Student implements Comparable<Student> {
	int rollno;
	int age;
	String course;
	public Student(int rollno, int age, String course) {
		super();
		this.rollno = rollno;
		this.age = age;
		this.course = course;
	}
	// The Mandatory method compareTo of Comparable interface so as to implement it.
	// It returns an integer by comparing the specified property value
	// 														i.e  Returns +ve if Greater , -ve if Smaller
	//														According to which the elements are sorted in the List.
	@Override
	public int compareTo(Student o) {
		return Integer.compare(this.rollno, o.rollno);
		// or use return (this.rollno - o.rollno);
	}
}
