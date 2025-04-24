package midterm_2nd_term_2324_3.studentmanager;

import java.util.Comparator;

public interface StudentComparator extends Comparator<Student> {
    int compare(Student left, Student right);
}
