package lab12.mylist;

public class TestMyList {
    public static void main(String[] args) {
        System.out.println("Test: MyArrayList");
        testMyArrayList();

        System.out.println("--------------------");

        System.out.println("Test: MyLinkedList");
        testMyLinkedList();
    }

    public static void testMyArrayList() {
        /*
         * TODO
         * Tạo ra một list kiểu MyArrayList có các phần tử dữ liệu kiểu Double.
         * Sử dụng BasicStatistic để tính các đại lượng thống kê cơ bản (max, min, kỳ vọng, phương sai).
         * In ra terminal các thông tin về dữ liệu và các đại lượng thống kê.
         */

        MyArrayList myArrayList = new MyArrayList();

        for (int i = 0; i < 6; i++) {
            myArrayList.append((double) i);
        }
        System.out.println(myArrayList);

        myArrayList.insert(69, 2);
        System.out.println(myArrayList);

        myArrayList.remove(5);
        System.out.println(myArrayList);

        myArrayList.remove(69);
        myArrayList.insert(420, 69);

        BasicStatistic basicStatistic = new BasicStatistic(myArrayList);

        System.out.println("Max: " + basicStatistic.max());
        System.out.println("Min: " + basicStatistic.min());
        System.out.println("Mean: " + basicStatistic.mean());
        System.out.println("Variance: " + basicStatistic.variance());
    }

    public static void testMyLinkedList() {
        /*
         * TODO
         * Tạo ra một list kiểu MyLinkedList có các phần tử dữ liệu kiểu Double.
         * Sử dụng BasicStatistic để tính các đại lượng thống kê cơ bản (max, min, kỳ vọng, phương sai).
         * In ra terminal các thông tin về dữ liệu và các đại lượng thống kê.
         */

        MyLinkedList myLinkedList = new MyLinkedList();

        for (int i = 0; i < 6; i++) {
            myLinkedList.append(i);
        }
        System.out.println(myLinkedList);

        myLinkedList.insert(69, 2);
        System.out.println(myLinkedList);

        myLinkedList.remove(5);
        System.out.println(myLinkedList);

        myLinkedList.remove(69);
        myLinkedList.insert(420, 69);

        BasicStatistic basicStatistic = new BasicStatistic(myLinkedList);

        System.out.println("Max: " + basicStatistic.max());
        System.out.println("Min: " + basicStatistic.min());
        System.out.println("Mean: " + basicStatistic.mean());
        System.out.println("Variance: " + basicStatistic.variance());
    }
}
