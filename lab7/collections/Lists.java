package lab7.collections;

import java.util.*;

public class Lists {
    public static void insertFirst(List<Integer> list, int value) {
        list.addFirst(value);
    }

    public static void insertLast(List<Integer> list, int value) {
        list.addLast(value);
    }

    public static void replace(List<Integer> list, int value) {
        list.set(3, value);
    }

    public static void removeThird(List<Integer> list) {
        list.remove(3);
    }

    public static void removeEvil(List<Integer> list) {
        list.removeIf(number -> number == 666);
    }

    public static List<Integer> generateSquare() {
        List<Integer> squareList = new ArrayList<>();

        for (int number = 1; number <= 10; number++) {
            squareList.add(number * number);
        }

        return squareList;
    }

    public static boolean contains(List<Integer> list, int value) {
        return list.contains(value);
    }

    public static void copy(List<Integer> source, List<Integer> target) {
        int length = source.size();

        for (int index = 0; index < length; index++) {
            target.add(source.get(index));
        }
    }

    public static void reverse(List<Integer> list) {
        Collections.reverse(list);
    }

    public static void reverseManual(List<Integer> list) {
        int length = list.size();

        for (int indexLeft = 0, indexRight = length - 1; indexLeft <= length / 2; indexLeft++, indexRight--) {
            int tmp = list.get(indexLeft);
            list.set(indexLeft, indexRight);
            list.set(indexRight, tmp);
        }
    }

    public static void insertBeginningEnd(LinkedList<Integer> list, int value) {
        list.addFirst(value);
        list.addLast(value);
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(666);
        list.add(666);
        list.add(4);
        list.add(5);

        System.out.println("List: " + list);
        insertFirst(list, 69);
        System.out.println("Insert First: " + list);
        insertLast(list, 69420);
        System.out.println("Insert Last: " + list);
        replace(list, 100);
        System.out.println("Replace: " + list);
        removeThird(list);
        System.out.println("Remove third: " + list);
        removeEvil(list);
        System.out.println("Remove evil: " + list);
        System.out.println("Generate square: " + generateSquare());
        System.out.println("Contains (69420): " + contains(list, 69420));

        List<Integer> newList = new ArrayList<>();
        copy(list, newList);
        System.out.println("Copy: " + newList);

        reverse(list);
        System.out.println("Reverse: " + list);
        reverseManual(newList);
        System.out.println("Reverse (manually): " + newList);

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(3);
        linkedList.addLast(4);
        System.out.println("Linked list: " + linkedList);
        insertBeginningEnd(linkedList, 1234);
        System.out.println("Insert beginning end: " + linkedList);
    }
}
