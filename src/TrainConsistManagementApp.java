import java.util.LinkedList;
import java.util.Scanner;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Train Consist Management App ===");
        System.out.println("=== UC4: Maintain Ordered Train Consist ===");

        // Create LinkedList for train consist
        LinkedList<String> train = new LinkedList<>();

        // Adding initial bogies
        System.out.println("\nAdding initial bogies...");
        train.add("Engine");
        train.add("Sleeper");
        train.add("AC");
        train.add("Cargo");
        train.add("Guard");

        System.out.println("Initial Train Consist:");
        System.out.println(train);

        // Insert Pantry Car at position 2
        System.out.println("\nInserting Pantry Car at position 2...");
        train.add(2, "Pantry");

        System.out.println("After inserting Pantry:");
        System.out.println(train);

        // Remove first and last bogie
        System.out.println("\nRemoving first and last bogie...");
        train.removeFirst();
        train.removeLast();

        // Final train consist
        System.out.println("\nFinal Ordered Train Consist:");
        System.out.println(train);

        System.out.println("\nProgram continues...");

        scanner.close();
    }
}