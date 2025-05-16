package lab9_designpatterns.singleton.example;

public class Classroom {
    private static Classroom instance;
    private static final int MAX_STUDENTS = 2;
    private int numberOfStudents;

    private Classroom() {
        numberOfStudents = 0;
    }

    public static Classroom getInstance() {
        if (instance == null) {
            System.out.println("Creating unique instance of Classroom.");
            instance = new Classroom();
        }

        System.out.println("Returning instance of Classroom.");
        return instance;
    }

    public void addStudent() {
        if (numberOfStudents == MAX_STUDENTS) {
            System.out.println("Classroom is full.");
            return;
        }

        numberOfStudents++;
    }

    public void removeStudent() {
        if (numberOfStudents == 0) {
            System.out.println("Classroom is empty.");
            return;
        }

        numberOfStudents--;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }
}
