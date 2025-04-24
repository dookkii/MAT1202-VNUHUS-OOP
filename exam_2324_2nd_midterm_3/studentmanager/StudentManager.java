package exam_2324_2nd_midterm_3.studentmanager;

import java.util.*;

public class StudentManager {
    // Singleton pattern
    private static StudentManager instance;

    private List<Student> studentList;

    private StudentManager() {
        instance = this;
        studentList = new ArrayList<>();
    }

    public static StudentManager getInstance() {
        if (instance == null) {
            return new StudentManager();
        }

        return instance;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    /**
     * Thêm sinh viên vào cuối danh sách.
     * @param student
     */
    public void append(Student student) {
        studentList.addLast(student);
    }

    /**
     * Thêm sinh viên vào danh sách ở vị trí index.
     * @param student
     * @param index
     */
    public void add(Student student, int index) {
        studentList.add(index, student);
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
        studentList.remove(student);
    }

    /**
     * Lấy ra sinh viên ở vị trí index
     * @param index
     * @return
     */
    public Student studentAt(int index) {
        return studentList.get(index);
    }

    /**
     * Sắp xếp danh sách sinh viên theo thứ tự tăng dần theo tên,
     * nếu tên như nhau thì sắp xếp theo họ.
     * Sử dụng giao diện StudentComparable để sắp xếp.
     * @return
     */
    public List<Student> sortStudentByName() {
        List<Student> sortedList = new ArrayList<>(studentList);

        Collections.sort(sortedList);

        return sortedList;
    }

    /**
     * Sắp xếp danh sách sinh viên theo thứ tự điểm toán tăng dần.
     * Sử dụng giao diện StudentComparator để sắp xếp.
     * @return
     */
    public List<Student> sortMathsGradeIncreasing() {
        List<Student> sortedList = new ArrayList<>(studentList);

        Collections.sort(sortedList, new StudentComparator() {
            @Override
            public int compare(Student left, Student right) {
                return Double.compare(left.getMathsGrade(), right.getMathsGrade());
            }
        });

        return sortedList;
    }

    /**
     * Sắp xếp danh sách sinh viên theo thứ tự điểm toán giảm dần.
     * Sử dụng giao diện StudentComparator để sắp xếp.
     * @return
     */
    public List<Student> sortMathsGradeDecreasing() {
        List<Student> sortedList = new ArrayList<>(studentList);

        Collections.sort(sortedList, new StudentComparator() {
            @Override
            public int compare(Student left, Student right) {
                return Double.compare(right.getMathsGrade(), left.getMathsGrade());
            }
        });

        return sortedList;
    }

    /**
     * Sắp xếp danh sách sinh viên theo thứ tự điểm lý tăng dần.
     * Sử dụng giao diện StudentComparator để sắp xếp.
     * @return
     */
    public List<Student> sortPhysicsGradeIncreasing() {
        List<Student> sortedList = new ArrayList<>(studentList);

        Collections.sort(sortedList, new StudentComparator() {
            @Override
            public int compare(Student left, Student right) {
                return Double.compare(left.getPhysicsGrade(), right.getPhysicsGrade());
            }
        });

        return sortedList;
    }

    /**
     * Sắp xếp danh sách sinh viên theo thứ tự điểm lý giảm dần.
     * Sử dụng giao diện StudentComparator để sắp xếp.
     * @return
     */
    public List<Student> sortPhysicsGradeDecreasing() {
        List<Student> sortedList = new ArrayList<>(studentList);

        Collections.sort(sortedList, new StudentComparator() {
            @Override
            public int compare(Student left, Student right) {
                return Double.compare(right.getPhysicsGrade(), left.getPhysicsGrade());
            }
        });

        return sortedList;
    }

    /**
     * Sắp xếp danh sách sinh viên theo thứ tự điểm hóa tăng dần.
     * Sử dụng giao diện StudentComparator để sắp xếp.
     * @return
     */
    public List<Student> sortChemistryGradeIncreasing() {
        List<Student> sortedList = new ArrayList<>(studentList);

        Collections.sort(sortedList, new StudentComparator() {
            @Override
            public int compare(Student left, Student right) {
                return Double.compare(left.getChemistryGrade(), right.getChemistryGrade());
            }
        });

        return sortedList;
    }

    /**
     * Sắp xếp danh sách sinh viên theo thứ tự điểm hóa giảm dần.
     * Sử dụng giao diện StudentComparator để sắp xếp.
     * @return
     */
    public List<Student> sortChemistryGradeDecreasing() {
        List<Student> sortedList = new ArrayList<>(studentList);

        Collections.sort(sortedList, new StudentComparator() {
            @Override
            public int compare(Student left, Student right) {
                return Double.compare(right.getChemistryGrade(), left.getChemistryGrade());
            }
        });

        return sortedList;
    }

    /**
     * Sắp xếp danh sách sinh viên theo thứ tự điểm trung bình tăng dần.
     * Sử dụng giao diện StudentComparator để sắp xếp.
     * @return
     */
    public List<Student> sortAverageGradeIncreasing() {
        List<Student> sortedList = new ArrayList<>(studentList);

        Collections.sort(sortedList, new StudentComparator() {
            @Override
            public int compare(Student left, Student right) {
                return Double.compare(left.getAverageGrade(), right.getAverageGrade());
            }
        });

        return sortedList;
    }

    /**
     * Sắp xếp danh sách sinh viên theo thứ tự điểm trung bình giảm dần.
     * Sử dụng giao diện StudentComparator để sắp xếp.
     * @return
     */
    public List<Student> sortAverageGradeDecreasing() {
        List<Student> sortedList = new ArrayList<>(studentList);

        Collections.sort(sortedList, new StudentComparator() {
            @Override
            public int compare(Student left, Student right) {
                return Double.compare(right.getAverageGrade(), left.getAverageGrade());
            }
        });

        return sortedList;
    }

    /**
     * Lọc ra howMany sinh viên có điểm trung bình cao nhất.
     * @param howMany
     * @return
     */
    public List<Student> filterStudentsHighestAverageGrade(int howMany) {
        List<Student> sortedStudents = sortAverageGradeDecreasing();
        List<Student> result = new ArrayList<>();

        for (int i = 0; i < howMany; i++) {
            result.add(sortedStudents.get(i));
        }

        return result;
    }

    /**
     * Lọc ra howMany sinh viên có điểm trung bình thấp nhất.
     * @param howMany
     * @return
     */
    public List<Student> filterStudentsLowestAverageGrade(int howMany) {
        List<Student> sortedStudents = sortAverageGradeIncreasing();
        List<Student> result = new ArrayList<>();

        for (int i = 0; i < howMany; i++) {
            result.add(sortedStudents.get(i));
        }

        return result;
    }

    public static String idOfStudentsToString(List<Student> countryList) {
        StringBuilder idOfStudents = new StringBuilder();
        idOfStudents.append("[");
        for (Student country : countryList) {
            idOfStudents.append(country.getId()).append(" ");
        }
        return idOfStudents.toString().trim() + "]";
    }

    public static void print(List<Student> studentList) {
        StringBuilder studentsString = new StringBuilder();
        studentsString.append("[\n");
        for (Student student : studentList) {
            studentsString.append(student.toString()).append("\n");
        }
        System.out.print(studentsString.toString().trim() + "\n]");
    }
}
