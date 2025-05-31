import java.util.List;
import java.util.NoSuchElementException;

public class StudentsIterator implements Iterator<Student> {
    private int currentIndex;
    private final List<Student> students;

    public StudentsIterator(List<Student> students) {
        this.students = students;
        this.currentIndex = 0;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < students.size();
    }

    @Override
    public Student next() {
        if (!hasNext()) {
            throw new NoSuchElementException("No more students");
        }
        return students.get(currentIndex++);
    }
}