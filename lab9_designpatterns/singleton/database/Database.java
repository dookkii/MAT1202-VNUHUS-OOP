package lab9_designpatterns.singleton.database;

public class Database {
    private static Database instance;
    private String data;
    private boolean isEmpty;

    private Database() {
        isEmpty = true;
    }

    public static Database getInstance() {
        if (instance == null) {
            System.out.println("Creating a new Database instance.");
            instance = new Database();
        }

        System.out.println("Returning the current Database instance.");
        return instance;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
        isEmpty = false;

        System.out.println("Data is set.");
    }

    public void removeData() {
        data = null;
        isEmpty = true;

        System.out.println("Data is removed.");
    }

    public String toString() {
        return "Empty: " + isEmpty + ", Data: " + data;
    }
}
