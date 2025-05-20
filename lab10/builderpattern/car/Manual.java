package lab10.builderpattern.car;

public class Manual {
    private String content = "";

    public void addSection(String section) {
        content += section + "\n";
    }

    @Override
    public String toString() {
        return "Manual:\n" + content;
    }
}
