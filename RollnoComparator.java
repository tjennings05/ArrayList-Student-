import java.util.Comparator;

public class RollnoComparator implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        return Integer.compare(student1.getRollno(), student2.getRollno());
    }
}