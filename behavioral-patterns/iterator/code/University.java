import java.util.List;

public class University implements Iterable<Student> {
    private List<Student> students;

    public University(List<Student> students) {
        this.students = students;
    }

    @Override
    public Iterator<Student> createIterator() {
        return new StudentsIterator(students);
    }
}
