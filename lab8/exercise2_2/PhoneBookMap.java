package lab8.exercise2_2;

import java.util.HashMap;

public class PhoneBookMap implements PhoneBook {
    HashMap<String, Student> phoneBook;

    public PhoneBookMap() {
        phoneBook = new HashMap<>();
    }

    public void addPerson(Student s) {
        phoneBook.put(s.getPhone(), s);
    }

    @Override
    public Student searchByName(String name) {
        for (Student student : phoneBook.values()) {
            if (student.getName().equals(name)) {
                return student;
            }
        }
        return null;
    }

    @Override
    public Student searchByLastName(String lastName) {
        for (Student student : phoneBook.values()) {
            if (student.getLastName().equals(lastName)) {
                return student;
            }
        }
        return null;
    }

    @Override
    public Student searchByNumber(String phone) {
        for (Student student : phoneBook.values()) {
            if (student.getPhone().equals(phone)) {
                return student;
            }
        }
        return null;
    }

    @Override
    public void deleteByNumber(String phone) {
        phoneBook.remove(phone);
    }
}
