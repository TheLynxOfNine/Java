import java.util.*;
import java.io.*;
import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Scanner scanner = new Scanner(System.in);
    // surround the dangerous code with try block
    try {

            System.out.println("Enter a whole number to divide: ");
            int x = scanner.nextInt();

            System.out.println("Enter a whole number to divide by: ");
            int y = scanner.nextInt();

            int z = x/y;

            System.out.println("result: " + z);
        }
        catch (ArithmeticException e) {
            System.out.println("You can't divide by zero! IDIOT!");
        }
        catch (InputMismatchException e) {
            System.out.println("PLEASE ENTER A NUMBER!!");
        }
        catch (Exception e) {
            // catching all the exceptions
            System.out.println("Something went wrong...");
        }
        finally {
            // System.out.println("This will always print");
            scanner.close();
        }
    }
}
