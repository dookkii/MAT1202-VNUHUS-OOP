package hus.oop.studentmanager;

public class Student {
    private String id;
    private String lastname;
    private String firstname;
    private int yearOfBirth;
    private double mathsGrade;
    private double physicsGrade;
    private double chemistryGrade;

    private Student() {}

    public static class StudentBuilder {
        private String id;
        private String lastname;
        private String firstname;
        private int yearOfBirth;
        private double mathsGrade;
        private double physicsGrade;
        private double chemistryGrade;

        public StudentBuilder(String id) {
            /* TODO */
        }

        public StudentBuilder withLastname(String lastname) {
            /* TODO */
        }

        public StudentBuilder withFirstname(String firstname) {
            /* TODO */
        }

        public StudentBuilder withYearOfBirth(int yearOfBirth) {
            /* TODO */
        }

        public StudentBuilder withMathsGrade(double mathsGrade) {
            /* TODO */
        }

        public StudentBuilder withPhysicsGrade(double physicsGrade) {
            /* TODO */
        }

        public StudentBuilder withChemistryGrade(double chemistryGrade) {
            /* TODO */
        }

        public Student build() {
            Student student = new Student();
            student.id = this.id;
            student.lastname = this.lastname;
            student.firstname = this.firstname;
            student.yearOfBirth = this.yearOfBirth;
            student.mathsGrade = this.mathsGrade;
            student.physicsGrade = this.physicsGrade;
            student.chemistryGrade = this.chemistryGrade;
            return student;
        }
    }

    public String getId() {
        /* TODO */
    }

    public String getLastname() {
        /* TODO */
    }

    public String getFirstname() {
        /* TODO */
    }

    public int getYearOfBirth() {
        /* TODO */
    }

    public double getMathsGrade() {
        /* TODO */
    }

    public double getPhysicsGrade() {
        /* TODO */
    }

    public double getChemistryGrade() {
        /* TODO */
    }

    public double getAverageGrade() {
        /* TODO */
    }
}
