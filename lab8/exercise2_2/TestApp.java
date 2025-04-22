package lab8.exercise2_2;

public class TestApp {
    public static void main(String[] args) {
        PhoneBook pb = new PhoneBookMap();
        pb.addPerson(new Student("Nicola", "Bicocchi", "34567"));
        pb.addPerson(new Student("Marco", "Rizzo", "45243"));
        pb.addPerson(new Student("Luisa", "Poppi", "24564"));

        System.out.println(pb.searchByName("Marco"));
        System.out.println(pb.searchByLastName("Poppi"));

        System.out.println(pb.searchByName("1111"));

        pb.deleteByNumber("24564");
        System.out.println(pb.searchByLastName("Poppi"));

        PhoneBook pbl = new PhoneBookList();
        pbl.addPerson(new Student("Nicola", "Bicocchi", "34567"));
        pbl.addPerson(new Student("Marco", "Rizzo", "45243"));
        pbl.addPerson(new Student("Luisa", "Poppi", "24564"));

        System.out.println(pbl.searchByName("Marco"));
        System.out.println(pbl.searchByLastName("Poppi"));

        System.out.println(pbl.searchByName("1111"));

        pbl.deleteByNumber("24564");
        System.out.println(pbl.searchByLastName("Poppi"));
    }
}
