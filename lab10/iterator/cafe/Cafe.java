package lab10.iterator.cafe;

import java.util.ArrayList;

public class Cafe {
    public static void main(String[] args) {
        System.out.println("\nMENU\n-- --\nBREAKFAST");
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        ArrayList<String> breakfastItems = pancakeHouseMenu.getMenuItems();

        for (String menuItem : breakfastItems) {
            System.out.println(menuItem);
        }

        System.out.println("\nLUNCH");
        DinerMenu dinerMenu = new DinerMenu();
        String[] lunchItems = dinerMenu.getMenuItems();

        for (String menuItem : lunchItems) {
            System.out.println(menuItem);
        }

        Iterator pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator dinerIterator = dinerMenu.createIterator();

        System.out.println("\nMENU (with iterators)\n-- --\nBREAKFAST");
        printMenu(pancakeIterator);
        System.out.println("\nLUNCH");
        printMenu(dinerIterator);
    }

    private static void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            String menuItem = (String) iterator.next();
            System.out.println(menuItem);
        }
    }
}
