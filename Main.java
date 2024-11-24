import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void selectionSort(List<Student> students, Comparator<Student> comparator) {
        int n = students.size();

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (comparator.compare(students.get(j), students.get(minIndex)) < 0) {
                    minIndex = j;
                }
            }
            Collections.swap(students, i, minIndex);
        }
    }

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        // Add 10 student objects to the ArrayList
        students.add(new Student(101, "John", "123 Main St"));
        students.add(new Student(102, "Alice", "456 Elm St"));
        students.add(new Student(103, "Bob", "789 Oak St"));
        students.add(new Student(104, "Eve", "101 Pine St"));
        students.add(new Student(105, "Charlie", "202 Cedar St"));
        students.add(new Student(106, "David", "303 Maple St"));
        students.add(new Student(107, "Fiona", "404 Birch St"));
        students.add(new Student(108, "Grace", "505 Redwood St"));
        students.add(new Student(109, "Henry", "606 Cypress St"));
        students.add(new Student(110, "Isabel", "707 Sequoia St"));

        // Sort by name using the NameComparator
        selectionSort(students, new NameComparator());
        System.out.println("Sorted by Name:");
        for (Student student : students) {
            System.out.println(student);
        }

        // Sort by roll number using the RollnoComparator
        selectionSort(students, new RollnoComparator());
        System.out.println("\nSorted by Roll Number:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}