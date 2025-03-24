package lab5.inheritance.exercise1_2;

public class TestPerson {
    public static void main(String[] args) {
        Person person = new Person("A", "69420 B");
        System.out.println(person);

        Student student = new Student("C", "334 Nguyen Trai", "KHMTTT", 1, 18500000);
        System.out.println(student);

        Staff staff = new Staff("E", "334 Nguyen Trai", "VNUHUS", 4000000);
        System.out.println(staff);

        person.setAddress("888 Nguyen Du");
        System.out.println("Updated Person Address: " + person.getAddress());

        student.setProgram("KHDL");
        System.out.println("Updated Student Program: " + student.getProgram());

        staff.setPay(12000000);
        System.out.println("Updated Staff Pay: " + staff.getPay());
    }
}
