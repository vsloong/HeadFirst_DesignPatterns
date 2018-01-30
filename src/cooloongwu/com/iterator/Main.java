package cooloongwu.com.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
//        ArrayList<MenuItem> breakfastItems = pancakeHouseMenu.getMenuItems();

        DinerMenu dinerMenu = new DinerMenu();
//        MenuItem[] menuItems = dinerMenu.getMenuItems();

        CafeMenu cafeMenu = new CafeMenu();
//
//        for (int i = 0; i < breakfastItems.size(); i++) {
//            MenuItem menuItem = breakfastItems.get(i);
//
//            System.out.println(menuItem.getName() + " ");
//            System.out.println(menuItem.getPrice() + " ");
//            System.out.println(menuItem.getDescription() + " ");
//
//            System.out.println("=========================");
//
//        }
//
//        for (int i = 0; i < menuItems.length; i++) {
//            MenuItem menuItem = menuItems[i];
//
//            if (menuItem != null) {
//                System.out.println(menuItem.getName() + " ");
//                System.out.println(menuItem.getPrice() + " ");
//                System.out.println(menuItem.getDescription() + " ");
//
//                System.out.println("=========================");
//            }
//        }

        Waitress waitress = new Waitress(cafeMenu, dinerMenu, pancakeHouseMenu);
        waitress.printMenu();
    }

}
