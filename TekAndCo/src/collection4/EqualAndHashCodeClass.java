package collection4;

import java.util.HashSet;
import java.util.Set;

public class EqualAndHashCodeClass {
	public static void main(String[] args) {
		Student student1 = new Student("1", "Ashish", "ashish@gmail.com", 30);
		Student student2 = new Student("1", "Ashish", "ashish@gmail.com", 30);
		Student student3 = new Student("3", "Sam", "sam@gmail.com", 23);
		 
		Set<Student> setStudents = new HashSet<Student>();
		 
		setStudents.add(student1);
		setStudents.add(student2);
		setStudents.add(student3);
		setStudents.forEach(student -> System.out.println(student));
	}

}
