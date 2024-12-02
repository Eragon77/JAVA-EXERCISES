package package4;

import java.util.ArrayList;
import java.util.Collections;

public class StudentMain {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Alice"));
        students.add(new Student("bob"));
        students.add(new Student("Charlie"));
        students.add(new Student("Bob"));

        // Sort the list (uses compareTo method)
        Collections.sort(students);

        // Print sorted list
        System.out.println("Sorted students: " + students);
    }
}

