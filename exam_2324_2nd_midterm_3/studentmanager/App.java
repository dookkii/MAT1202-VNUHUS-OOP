package exam_2324_2nd_midterm_3.studentmanager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class App {
    private static final String COMMA_DELIMITER = ",";
    private static StudentManager studentManager = StudentManager.getInstance();

    public static void readListData(String filePath) {
        BufferedReader dataReader = null;
        try {
            String line;
            dataReader = new BufferedReader(new FileReader(filePath));

            // Read file line by line?
            while ((line = dataReader.readLine()) != null) {
                List<String> dataList = parseDataLineToList(line);
                if (dataList.size() != 7) {
                    continue;
                }

                if (dataList.get(0).equals("id")) {
                    continue;
                }

                /*
                TODO

                - Đọc được dữ liệu, tạo ra các đối tượng sinh viên ở đây, và cho vào đối tượng được tạo ra từ
                lớp StudentManager để quản lý.
                - Đối tượng tạo ra từ lớp StudentManager là duy nhất trong chương trình, do dùng Singleton Pattern,
                và được tạo ra bằng cách gọi hàm StudentManager.getInstance().
                */

                Student newStudent = new Student.StudentBuilder(dataList.get(0))
                        .withLastname(dataList.get(1))
                        .withFirstname(dataList.get(2))
                        .withYearOfBirth(Integer.parseInt(dataList.get(3)))
                        .withMathsGrade(Double.parseDouble(dataList.get(4)))
                        .withPhysicsGrade(Double.parseDouble(dataList.get(5)))
                        .withChemistryGrade(Double.parseDouble(dataList.get(6)))
                        .build();

                studentManager.append(newStudent);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (dataReader != null)
                    dataReader.close();
            } catch (IOException crunchifyException) {
                crunchifyException.printStackTrace();
            }
        }
    }

    public static List<String> parseDataLineToList(String dataLine) {
        List<String> result = new ArrayList<>();
        if (dataLine != null) {
            String[] splitData = dataLine.split(COMMA_DELIMITER);
            for (int i = 0; i < splitData.length; i++) {
                result.add(splitData[i]);
            }
        }
        return result;
    }

    public static String[] parseDataLineToArray(String dataLine) {
        if (dataLine == null) {
            return null;
        }

        return dataLine.split(COMMA_DELIMITER);
    }

    public static void main(String[] args) {
        init();

        System.out.println("Original Data:");
        testOriginalData();

        /* Yêu cầu:
        - Hoàn thiện code chương trình theo mẫu và theo yêu cầu đã cho.
        - Viết code để test cho tất cả các hàm test.

        - Thực hiện chạy từng hàm test, lưu kết quả chạy chương trình và file text được đặt tên
          là <TenSinhVien_MaSinhVien_StudentManager>.txt (Ví dụ, NguyenVanA_123456_StudentManager.txt).
        - Nén các file source code và file text kết quả chạy chương trình vào file zip có tên
          <TenSinhVien_MaSinhVien_StudentManager>.zip (Ví dụ, NguyenVanA_123456_StudentManager.zip),
          nộp lên classroom.
         */
        System.out.println("\n\nSort: Maths Grade, Increasing");
        testSortMathsGradeIncreasing();
        System.out.println("\n\nSort: Maths Grade, Decreasing");
        testSortMathsGradeDecreasing();
        System.out.println("\n\nSort: Physics Grade, Increasing");
        testSortPhysicsGradeIncreasing();
        System.out.println("\n\nSort: Physics Grade, Decreasing");
        testSortPhysicsGradeDecreasing();
        System.out.println("\n\nSort: Chemistry Grade, Increasing");
        testSortChemistryGradeIncreasing();
        System.out.println("\n\nSort: Chemistry Grade, Decreasing");
        testSortChemistryGradeDecreasing();
        System.out.println("\n\nSort: Average Grade, Increasing");
        testSortAverageGradeIncreasing();
        System.out.println("\n\nSort: Average Grade, Decreasing");
        testSortAverageGradeDecreasing();
        System.out.println("\n\nFilter: 10 Highest Average Grade");
        testFilterStudentsHighestAverageGrade(10);
        System.out.println("\n\nFilter: 10 Lowest Average Grade");
        testFilterStudentsLowestAverageGrade(10);
    }

    public static void init() {
        String filePath = "data/students.csv";
        readListData(filePath);
    }

    public static void testOriginalData() {
        String studentIds = StudentManager.idOfStudentsToString(StudentManager.getInstance().getStudentList());
        System.out.print(studentIds);
    }

    public static void testSortMathsGradeIncreasing() {
        String studentIds = StudentManager.idOfStudentsToString(
                StudentManager.getInstance().sortMathsGradeIncreasing()
        );
        System.out.print(studentIds);
    }

    public static void testSortMathsGradeDecreasing() {
        String studentIds = StudentManager.idOfStudentsToString(
                StudentManager.getInstance().sortMathsGradeDecreasing()
        );
        System.out.print(studentIds);
    }

    public static void testSortPhysicsGradeIncreasing() {
        String studentIds = StudentManager.idOfStudentsToString(
                StudentManager.getInstance().sortPhysicsGradeIncreasing()
        );
        System.out.print(studentIds);
    }

    public static void testSortPhysicsGradeDecreasing() {
        String studentIds = StudentManager.idOfStudentsToString(
                StudentManager.getInstance().sortPhysicsGradeDecreasing()
        );
        System.out.print(studentIds);
    }

    public static void testSortChemistryGradeIncreasing() {
        String studentIds = StudentManager.idOfStudentsToString(
                StudentManager.getInstance().sortChemistryGradeIncreasing()
        );
        System.out.print(studentIds);
    }

    public static void testSortChemistryGradeDecreasing() {
        String studentIds = StudentManager.idOfStudentsToString(
                StudentManager.getInstance().sortChemistryGradeDecreasing()
        );
        System.out.print(studentIds);
    }

    public static void testSortAverageGradeIncreasing() {
        String studentIds = StudentManager.idOfStudentsToString(
                StudentManager.getInstance().sortAverageGradeIncreasing()
        );
        System.out.print(studentIds);
    }

    public static void testSortAverageGradeDecreasing() {
        String studentIds = StudentManager.idOfStudentsToString(
                StudentManager.getInstance().sortAverageGradeDecreasing()
        );
        System.out.print(studentIds);
    }

    public static void testFilterStudentsHighestAverageGrade(int howMany) {
        String studentIds = StudentManager.idOfStudentsToString(
                StudentManager.getInstance().filterStudentsHighestAverageGrade(howMany)
        );
        System.out.print(studentIds);
    }

    public static void testFilterStudentsLowestAverageGrade(int howMany) {
        String studentIds = StudentManager.idOfStudentsToString(
                StudentManager.getInstance().filterStudentsLowestAverageGrade(howMany)
        );
        System.out.print(studentIds);
    }
}
