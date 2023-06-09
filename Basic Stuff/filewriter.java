import java.util.*;
import java.io.*;
import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        try {
            FileWriter writer = new FileWriter("secret_message.txt");
            writer.write("Roses are red \nViolets are blue\nBooty booty booty\nrockin everywhere");
            writer.append("\n(A poem by me)");
            writer.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
