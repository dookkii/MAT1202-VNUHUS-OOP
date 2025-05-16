package lab9_designpatterns.singleton.example;

public class ClassroomController {
    public static void main(String[] args) {
        Classroom classroom1 = Classroom.getInstance();

        System.out.println("[Classroom 1] " + classroom1.getNumberOfStudents() + " students.");

        System.out.println("Added a student.");
        classroom1.addStudent();
        System.out.println("[Classroom 1] " + classroom1.getNumberOfStudents() + " students.");

        System.out.println("Added a student.");
        classroom1.addStudent();
        System.out.println("[Classroom 1] " + classroom1.getNumberOfStudents() + " students.");

        System.out.println("Added a student.");
        classroom1.addStudent();
        System.out.println("[Classroom 1] " + classroom1.getNumberOfStudents() + " students.");

        System.out.println("Removed a student.");
        classroom1.removeStudent();
        System.out.println("[Classroom 1] " + classroom1.getNumberOfStudents() + " students.");

        System.out.println("Removed a student.");
        classroom1.removeStudent();
        System.out.println("[Classroom 1] " + classroom1.getNumberOfStudents() + " students.");

        System.out.println("Removed a student.");
        classroom1.removeStudent();
        System.out.println("[Classroom 1] " + classroom1.getNumberOfStudents() + " students.");

        System.out.println();
        Classroom classroom2 = Classroom.getInstance();
        System.out.println("Is Classroom 2 is the same as Classroom 1: " + (classroom1 == classroom2));
    }
}
