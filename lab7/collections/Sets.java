package lab7.collections;

import java.util.*;

public class Sets {
    public static Set<Integer> intersectionManual(Set<Integer> first, Set<Integer> second) {
        Set<Integer> intersectionSet = new HashSet<>();

        for (Integer number : first) {
            if (second.contains(number)) {
                intersectionSet.add(number);
            }
        }

        return intersectionSet;
    }

    public static Set<Integer> unionManual(Set<Integer> first, Set<Integer> second) {
        Set<Integer> unionSet = new HashSet<>(first);

        for (Integer number : second) {
            if (!first.contains(number)) {
                unionSet.add(number);
            }
        }

        return unionSet;
    }

    public static Set<Integer> intersection(Set<Integer> first, Set<Integer> second) {
        Set<Integer> intersectionSet = new HashSet<>(first);
        intersectionSet.retainAll(second);
        return intersectionSet;
    }

    public static Set<Integer> union(Set<Integer> first, Set<Integer> second) {
        Set<Integer> unionSet = new HashSet<>(first);
        unionSet.addAll(second);
        return unionSet;
    }

    public static List<Integer> toList(Set<Integer> source) {
        return new ArrayList<>(source);
    }

    public static List<Integer> removeDuplicates(List<Integer> source) {
        Set<Integer> set = new HashSet<>(source);
        return new ArrayList<>(set);
    }

    public static List<Integer> removeDuplicatesManual(List<Integer> source) {
        List<Integer> newList = new ArrayList<>();

        for (Integer number : source) {
            if (!newList.contains(number)) {
                newList.add(number);
            }
        }

        return newList;
    }

    public static String firstRecurringCharacter(String s) {
        Set<Character> seen = new HashSet<>();

        for (char character : s.toCharArray()) {
            if (seen.contains(character)) {
                return String.valueOf(character);
            }

            seen.add(character);
        }

        return null;
    }

    public static Set<Character> allRecurringChars(String s) {
        Set<Character> seen = new HashSet<>();
        Set<Character> recurringChars = new HashSet<>();

        for (char character : s.toCharArray()) {
            if (seen.contains(character)) {
                recurringChars.add(character);
            }

            seen.add(character);
        }

        return recurringChars;
    }

    public static Integer[] toArray(Set<Integer> source) {
        return source.toArray(new Integer[0]);
    }

    public static int getFirst(TreeSet<Integer> source) {
        return source.getFirst();
    }

    public static int getLast(TreeSet<Integer> source) {
        return source.getLast();
    }

    public static int getGreater(TreeSet<Integer> source, int value) {
        return source.higher(value);
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);
        System.out.println("Intersection (manually): " + intersectionManual(set1, set2));
        System.out.println("Intersection: " + intersection(set1, set2));
        System.out.println("Union (manually): " + unionManual(set1, set2));
        System.out.println("Union: " + union(set1, set2));
        System.out.println("set1 to list: " + toList(set1));
        System.out.println("set2 to list: " + toList(set2));
        System.out.println("set1 to array: " + Arrays.toString(toArray(set1)));

        List<Integer> list3 = new ArrayList<>();
        list3.add(69);
        list3.add(69);
        list3.add(1);
        list3.add(2);
        list3.add(420);
        list3.add(420);
        System.out.println("list3:" + list3);
        System.out.println("Remove Duplicates (manually): " + removeDuplicatesManual(list3));
        System.out.println("Remove Duplicates:  " + removeDuplicates(list3));

        System.out.println("First Recurring Character of 'abaco': " + firstRecurringCharacter("abaco"));
        System.out.println("Recurring Characters of 'mamma': " + allRecurringChars("mamma"));

        TreeSet<Integer> tree = new TreeSet<>();
        tree.add(10);
        tree.add(20);
        tree.add(30);
        tree.add(40);

        System.out.println("First item of tree: " + getFirst(tree));
        System.out.println("Last item of tree: " + getLast(tree));
        System.out.println("First item greater than 20 of tree: " + getGreater(tree, 20));
    }
}
