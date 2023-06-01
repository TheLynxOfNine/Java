import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        // int numbers[] = {33, 5, 7, 24, 6,};
        int numbers[] = {5, 2, 8, 4, 9};
        System.out.println(Arrays.toString(numbers));

        int sum = 0;
        double average = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            // convert the int sum into a double to get the accurate average
            average = (double) sum / numbers.length;
            // checker
            System.out.println("from the loop: " + average);
        }
        // output
        System.out.println(sum);
        System.out.println(average);
    } 
}
