import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Jan"));
        students.add(new Student("Paweł"));
        students.add(new Student("Oliwier"));

        University university = new University(students);
        Iterator<Student> iterator = university.createIterator();

        int countStudents = 0;
        while (iterator.hasNext()) {
            Student student = iterator.next();
            countStudents++;
            System.out.println("Student: " + student.getName());
        }
        System.out.println("Number of students: " + countStudents);
    }
}
