import java.util.*;
import java.io.*;
import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        // file = an abstract rep of file and directory pathnames
        
        File file = new File("secret_message.txt");

        // checking if there is a file
        if (file.exists()) {
            System.out.println("That file exist");
            System.out.println(file.getPath()); // displays the file path
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
            // file.delete();
        }
        else {
            System.out.println("File does not exist");
        }
    }
}
