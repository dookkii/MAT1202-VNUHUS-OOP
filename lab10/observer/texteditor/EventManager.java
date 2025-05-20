package lab10.observer.texteditor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EventManager {
    private HashMap<String, List<EventListener>> listeners = new HashMap<>();

    public void subscribe(String eventType, EventListener listener) {
        listeners.computeIfAbsent(eventType, x -> new ArrayList<>()).add(listener);
    }

    public void unsubscribe(String eventType, EventListener listener) {
        List<EventListener> users = listeners.get(eventType);

        if (users != null) {
            users.remove(listener);
        }
    }

    public void notify(String eventType, String data) {
        for (EventListener listener : listeners.get(eventType)) {
            listener.update(data);
        }
    }
}
