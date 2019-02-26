package HashSetExample;

import java.util.HashSet;
import java.util.Set;

/**Since Student doesn't override equals(),
 *  there are 5 objects in the HashSet*/
public class HashSetDemo {
	public static void main(String[] args) {
		 
        Set<Student> students = new HashSet<Student>();
        Set<Student2> students2 = new HashSet<Student2>();

        students.add(new Student(1));
        students.add(new Student(3));
        students.add(new Student(4));
        students.add(new Student(1));
        students.add(new Student(3));
        
        System.out.println("Students 1");

        for (Student student : students) {
			System.out.println(student.rollNumber);
		}
        
        students2.add(new Student2(1));
        students2.add(new Student2(3));
        students2.add(new Student2(4));
        students2.add(new Student2(1));
        students2.add(new Student2(3));
        
        
        System.out.println();
        
        System.out.println("Duplicate elements as Student1 doesnt"
        		+ "implement equals and hashcide");
        System.out.println("The size now is");
        System.out.println(students.size());
        
        System.out.println();
        
        System.out.println("As Student2 overrides equals and hascode"
        		+ "elements are not repeated");

        System.out.println("Students 2");
        for (Student2 student2 : students2) {
			System.out.println(student2.rollNumber);
		}
        
        System.out.println("After overriding equals and hascode");

        System.out.println("The size now is");
        
        System.out.println(students2.size());
    }
}
