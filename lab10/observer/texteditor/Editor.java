package lab10.observer.texteditor;

import java.io.File;

public class Editor {
    public EventManager events;
    private File file;

    public Editor() {
        this.events = new EventManager();
    }

    void openFile(String path) {
        file = new File(path);
        events.notify("open", file.getName());
    }

    void saveFile() {
        events.notify("save", file.getName());
    }
}
