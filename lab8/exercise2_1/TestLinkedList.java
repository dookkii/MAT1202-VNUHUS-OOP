package lab8.exercise2_1;

public class TestLinkedList {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        System.out.println(linkedList);
        System.out.println(linkedList.size());

        linkedList.add(4, 2);
        linkedList.add(5, 1);
        System.out.println(linkedList);
        System.out.println(linkedList.size());

        linkedList.remove(3);
        System.out.println(linkedList);
        System.out.println(linkedList.size());

        System.out.println(linkedList.get(0));
        System.out.println(linkedList.get(2));
        System.out.println(linkedList.get(3));
    }
}
