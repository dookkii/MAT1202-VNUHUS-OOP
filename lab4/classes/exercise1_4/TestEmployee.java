package lab4.classes.exercise1_4;

public class TestEmployee {
    public static void main(String[] args) {
        Employee employee1 = new Employee(8, "Peter", "Tan", 2500);
        System.out.println(employee1);

        employee1.setSalary(999);
        System.out.println(employee1);
        System.out.println("ID is: " + employee1.getID());
        System.out.println("First name is: " + employee1.getFirstName());
        System.out.println("Last name is: " + employee1.getLastName());
        System.out.println("Salary is: " + employee1.getSalary());

        System.out.println("Name is: " + employee1.getName());
        System.out.println("Annual salary is: " + employee1.getAnnualSalary());

        System.out.println(employee1.raiseSalary(10));
        System.out.println(employee1);
    }
}
