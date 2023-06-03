import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        int numbers[] = {8, 3, 6, 2, 5};

        System.out.println("Unsorted Array of Numbers: ");
        for (int a = 0; a < numbers.length; a++) {
            System.out.print(numbers[a] + " ");
        }
        System.out.println(" ");
        
        System.out.println("Sorted Array of Numbers:");
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println(" ");

        String names[] = {"Sam", "Jennie", "Ryan", "Zayn"};

        System.out.println("Unsorted Array of Names:");
        for (int z = 0; z < names.length; z++) {
            System.out.print(names[z] + " ");
        }

        System.out.println(" ");
        Arrays.sort(names);
        System.out.println("Sorted Array of Names:");
        for (int n = 0; n < names.length; n++) {
            System.out.print(names[n] + " ");
        }
    } 
}
