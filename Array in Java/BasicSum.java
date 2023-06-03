import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        int numbers[] = {33, 5, 7, 2};
        System.out.println(Arrays.toString(numbers));
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        System.out.println(sum);
    } 
}
