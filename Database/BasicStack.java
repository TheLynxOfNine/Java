import java.util.*;
import java.io.*;
import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Stack<String> stack = new Stack<String>();
        Stack<String> items = new Stack<String>();
        items.addAll(Arrays.asList("Java", "Python", "C++")); // adding multiple items to a stack
        items.push("Ruby"); // single push to a stack ends up at the start
        System.out.println("Stack: " + items); // printing the stack

        System.out.println();
        String topElement = items.pop(); // removes the first item
        System.out.println("Removed item: " + topElement);

        System.out.println();
        System.out.println("New Stack: " + items);

        System.out.println();
        String peekElement = items.peek();
        System.out.println("Peeked item: " + peekElement); // gets the top item without removing

        System.out.println();
        boolean isEmpty = items.empty();
        System.out.println("Is the stack empty? " + isEmpty);
        boolean empty = stack.empty();
        System.out.println("Is the stack empty? " + empty);
    }
}
