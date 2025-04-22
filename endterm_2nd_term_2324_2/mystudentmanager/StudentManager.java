package endterm_2nd_term_2324_2.mystudentmanager;

public class StudentManager {
    // Singleton pattern
    private static StudentManager instance;

    private MyList studentList;

    private StudentManager() {
        instance = this;
        studentList = new MyLinkedList();
    }

    public static StudentManager getInstance() {
        if (instance == null) {
            return new StudentManager();
        }

        return instance;
    }

    public MyList getStudentList() {
        return studentList;
    }

    /**
     * Thêm sinh viên vào cuối danh sách.
     * @param student
     */
    public void append(Student student) {
        studentList.insertAtEnd(student);
    }

    /**
     * Thêm sinh viên vào danh sách ở vị trí index.
     * @param student
     * @param index
     */
    public void add(Student student, int index) {
        studentList.insertAtPosition(student, index);
    }

    /**
     * Bỏ sinh viên ở vị trí index.
     * @param index
     */
    public void remove(int index) {
        studentList.remove(index);
    }

    /**
     * Bỏ sinh viên như tham số truyền vào.
     * @param student
     */
    public void remove(Student student) {
        MyIterator iterator = studentList.iterator();

        int index = 0;
        while (iterator.hasNext()) {
            Student currentStudent = (Student) iterator.next();
            if (currentStudent.getId().equals(student.getId())) {
                studentList.remove(index);
                return;
            }
            index++;
        }
    }

    /**
     * Lấy ra sinh viên ở vị trí index
     * @param index
     * @return
     */
    public Student studentAt(int index) {
        if (index >= studentList.size()) {
            return null;
        }

        MyIterator iterator = studentList.iterator();

        int currentIndex = 0;
        Student currentStudent = null;
        while (currentIndex != index) {
            currentStudent = (Student) iterator.next();
            index++;
        }

        return currentStudent;
    }

    /**
     * Lọc ra những sinh viên có điểm trung bình trên 15 điểm.
     * @return
     */
    public MyList filterStudentsByAverageGrade() {
        MyLinkedList result = new MyLinkedList();
        MyIterator iterator = studentList.iterator();

        while (iterator.hasNext()) {
            Student student = (Student) iterator.next();
            if (student.getAverageGrade() > 15) {
                result.insertAtEnd(student);
            }
        }
        return result;
    }

    /**
     * Lọc ra những sinh viên có điểm toán trên 5 điểm.
     * @return
     */
    public MyList filterStudentsByMathGrade() {
        MyLinkedList result = new MyLinkedList();
        MyIterator iterator = studentList.iterator();

        while (iterator.hasNext()) {
            Student student = (Student) iterator.next();
            if (student.getMathsGrade() > 5) {
                result.insertAtEnd(student);
            }
        }
        return result;
    }
}
