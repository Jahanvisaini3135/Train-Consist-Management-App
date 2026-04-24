import java.util.Arrays;
import java.util.Scanner;

public class TrainConsistManagementApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Train Consist Management App (UC17 - Arrays.sort) ===");

        try {

            System.out.print("Enter number of bogies: ");
            int n = Integer.parseInt(scanner.nextLine());

            String[] bogieNames = new String[n];


            System.out.println("Enter bogie names:");
            for (int i = 0; i < n; i++) {
                bogieNames[i] = scanner.nextLine();
            }


            System.out.println("\nOriginal bogie names: " + Arrays.toString(bogieNames));


            Arrays.sort(bogieNames);

            System.out.println("Sorted bogie names: " + Arrays.toString(bogieNames));

        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter numeric values only.");
        } finally {
            scanner.close();
            System.out.println("\n🚆 Sorting completed using Arrays.sort().");
        }
    }
}