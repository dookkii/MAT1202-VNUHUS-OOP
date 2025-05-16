package lab9_designpatterns.singleton.database;

public class DatabaseController {
    public static void main(String[] args) {
        Database database = Database.getInstance();

        System.out.println("[Database 1] " + database);
        database.setData("123456");
        System.out.println("[Database 1] " + database);
        database.removeData();
        System.out.println("[Database 1] " + database);

        System.out.println();

        Database database2 = Database.getInstance();
        System.out.println("Is Database 2 is the same as Database 1: " + (database == database2));
    }
}
