import java.util.*;
import java.io.*;
import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        
        LinkedList<String> cars = new LinkedList<String>();
        cars.addAll(Arrays.asList("Volvo", "Ford", "Mazda"));
        System.out.println(cars);

        LinkedList<String> shoppingList = new LinkedList<String>();
        ShopList(shoppingList); // calling the METHOD ShopList

        System.out.println();
        shoppingList.removeLast(); // removing last item from the LinkedList shoppingList
        System.out.println("Removed");
        System.out.println(shoppingList);

        System.out.println();
        shoppingList.addFirst("Water"); // adding on the first part of the LinkedList shoppingList
        System.out.println("Added First");
        System.out.println(shoppingList);

        System.out.println();
        shoppingList.addLast("Dog Food"); // adding on the last part of the LinkedList shopppingList
        System.out.println("Added Last");
        System.out.println(shoppingList);

        System.out.println();
        shoppingList.removeFirst();  // removing first item from the LinkedList shoppingList
        System.out.println("Removed");
        System.out.println(shoppingList);

        System.out.println();
        System.out.println("Starter Item");
        System.out.println(shoppingList.getFirst()); // getting the first item

        System.out.println();
        System.out.println("Ending Item");
        System.out.println(shoppingList.getLast()); // getting the last item
    }

    public static void ShopList(LinkedList<String> shoppingList) {

        System.out.println();
        System.out.println("Items to buy:");
        shoppingList.addAll(Arrays.asList("Eggs", "Bacon", "Bread"));
        shoppingList.add("Hotdogs");
        for (String item : shoppingList) {
            System.out.println(item);
        }
    }
}
