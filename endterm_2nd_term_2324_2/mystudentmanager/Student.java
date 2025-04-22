package endterm_2nd_term_2324_2.mystudentmanager;

public class Student {
    private String id;
    private String lastname;
    private String firstname;
    private int yearOfBirth;
    private double mathsGrade;
    private double physicsGrade;
    private double chemistryGrade;

    private Student() {

    }

    public static class StudentBuilder {
        private String id;
        private String lastname;
        private String firstname;
        private int yearOfBirth;
        private double mathsGrade;
        private double physicsGrade;
        private double chemistryGrade;

        public StudentBuilder(String id) {
            this.id = id;
        }

        public StudentBuilder withLastname(String lastname) {
            this.lastname = lastname;
            return this;
        }

        public StudentBuilder withFirstname(String firstname) {
            this.firstname = firstname;
            return this;
        }

        public StudentBuilder withYearOfBirth(int yearOfBirth) {
            this.yearOfBirth = yearOfBirth;
            return this;
        }

        public StudentBuilder withMathsGrade(double mathsGrade) {
            this.mathsGrade = mathsGrade;
            return this;
        }

        public StudentBuilder withPhysicsGrade(double physicsGrade) {
            this.physicsGrade = physicsGrade;
            return this;
        }

        public StudentBuilder withChemistryGrade(double chemistryGrade) {
            this.chemistryGrade = chemistryGrade;
            return this;
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
        return id;
    }

    public String getLastname() {
        return lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public double getMathsGrade() {
        return mathsGrade;
    }

    public double getPhysicsGrade() {
        return physicsGrade;
    }

    public double getChemistryGrade() {
        return chemistryGrade;
    }

    public double getAverageGrade() {
        return (mathsGrade + physicsGrade + chemistryGrade) / 3;
    }

    @Override
    public String toString() {
        return "Student[id=" + id + ",lastname=" + lastname + ",firstname=" + firstname + ",yearOfBirth=" + yearOfBirth + ",mathsGrade=" + mathsGrade + ",physicsGrade=" + physicsGrade + ",chemistryGrade=" + chemistryGrade + ",average=" + getAverageGrade() + "]";
    }
}
