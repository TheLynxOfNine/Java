import java.util.*;
import java.io.*;
import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        //File Reader = read the contents of a file as a stream of char one by one read() 
        // returns an int val which contains the byte val when read() returns -1 there is no more data ot be read

        try {
            FileReader reader = new FileReader("secret_message.txt");
            int data = reader.read();
            while (data != -1) {
                System.out.print((char) data);
                data = reader.read();
            }
            reader.close();

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
