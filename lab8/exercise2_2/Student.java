package lab8.exercise2_2;

import java.util.Objects;

public class Student implements Comparable<Student> {
    String name;
    String lastName;
    String phone;
    double average;

    public Student(String name, String lastName, String phone) {
        this.name = name;
        this.lastName = lastName;
        this.phone = phone;
        this.average = 4.0;
    }

    public Student(String name, String lastName, double average) {
        this.name = name;
        this.lastName = lastName;
        this.phone = "0969696969";
        this.average = average;
    }

    public Student(String name, String lastName, String phone, double average) {
        this.name = name;
        this.lastName = lastName;
        this.phone = phone;
        this.average = average;
    }

    @Override
    public int compareTo(Student s) {
        return (int) (average - s.average);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Student student = (Student) o;
        return Double.compare(student.average, average) == 0
                && Objects.equals(name, student.name)
                && Objects.equals(lastName, student.lastName)
                && Objects.equals(phone, student.phone);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, phone, average);
    }

    @Override
    public String toString() {
        return "Student[name=" + name + ",lastName=" + lastName + ",phone=" + phone + ",average=" + average + "]";
    }
}
