package lab7.collections;

import java.util.*;

public class Maps {
    public static int count(Map<Integer, Integer> map) {
        return map.size();
    }

    public static void empty(Map<Integer, Integer> map) {
        map.clear();
    }

    public static boolean contains(Map<Integer, Integer> map, int key) {
        return map.containsKey(key);
    }

    public static boolean containsKeyValue(Map<Integer, Integer> map, int key, int value) {
        return map.containsKey(key) && map.containsValue(value);
    }

    public static Set<Integer> keySet(Map<Integer, Integer> map) {
        return map.keySet();
    }

    public static Collection<Integer> values(Map<Integer, Integer> map) {
        return map.values();
    }

    public static String getColor(int value) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(0, "black");
        map.put(1, "white");
        map.put(2, "red");

        return map.get(value);
    }

    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 2);
        map.put(3, 4);
        map.put(5, 6);

        System.out.println("Map: " + map);
        System.out.println("Map size: " + count(map));

        empty(map);
        System.out.println("Empty map: " + map);

        map.put(1, 2);
        map.put(3, 4);
        map.put(5, 6);
        System.out.println("Contains: " + contains(map, 2));
        System.out.println("Contains: " + contains(map, 3));
        System.out.println("Contains Key Value: " + containsKeyValue(map, 3, 4));
        System.out.println("Contains Key Value: " + containsKeyValue(map, 222, 333));
        System.out.println("Key set: " + keySet(map));
        System.out.println("Value set: " + values(map));

        System.out.println("Get color: " + getColor(0));
        System.out.println("Get color: " + getColor(1));
        System.out.println("Get color: " + getColor(2));
        System.out.println("Get color: " + getColor(69));
    }
}
