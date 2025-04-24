package exam_2324_2nd_midterm_3.studentmanager;

import java.util.Comparator;

public interface StudentComparator extends Comparator<Student> {
    int compare(Student left, Student right);
}
