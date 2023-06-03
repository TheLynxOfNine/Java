import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        int numbers[] = {-1, 5, 29, 12, 6};
        System.out.println(Arrays.toString(numbers));
        System.out.println("Result: " + check(numbers, 5));
        System.out.println("Result: " + check(numbers, 1));
    }

    public static boolean check(int[] numbers, int item) {
        for (int n : numbers)
            if (n == item) {
                return true;
            }
        return false;
    }
}
