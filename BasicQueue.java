import java.util.*;
import java.io.*;
import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Queue<String> stack = new LinkedList<String>();
        Queue<String> items = new LinkedList<String>();
        items.addAll(Arrays.asList("Java", "Python", "C++")); // adding multiple items to a stack
        items.add("Ruby"); // single push to a queue ends up at the start
        System.out.println("Stack: " + items); // printing the stack

        System.out.println();
        String topElement = items.remove(); // removes the first item
        System.out.println("Removed item: " + topElement);

        System.out.println();
        System.out.println("New Stack: " + items);

        System.out.println();
        String peekElement = items.peek();
        System.out.println("Peeked item: " + peekElement); // gets the top item without removing

        System.out.println();
        boolean isEmpty = items.isEmpty();
        System.out.println("Is the stack empty? " + isEmpty);
        isEmpty = stack.isEmpty();
        System.out.println("Is the stack empty? " + isEmpty);
    }
}
