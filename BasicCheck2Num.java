import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        int numbers[] = {-1, 5, 29, 12, 6};
        System.out.println(Arrays.toString(numbers));
        System.out.println("Result: " + check(numbers));
    }

    public static boolean check(int[] numbers) {
        for (int number : numbers)
            if (number == -1 || number == 0) {
                return true;
            }
        return false;
    }
}
