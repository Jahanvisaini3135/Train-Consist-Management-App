import java.util.Scanner;

public class TrainConsistManagementApp {


    public static void bubbleSort(int[] capacities) {
        int n = capacities.length;


        for (int i = 0; i < n - 1; i++) {


            for (int j = 0; j < n - i - 1; j++) {


                if (capacities[j] > capacities[j + 1]) {


                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }
    }


    public static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Train Consist Management App (UC16 - Bubble Sort) ===");

        try {

            System.out.print("Enter number of passenger bogies: ");
            int n = Integer.parseInt(scanner.nextLine());

            int[] capacities = new int[n];


            System.out.println("Enter capacities:");
            for (int i = 0; i < n; i++) {
                capacities[i] = Integer.parseInt(scanner.nextLine());
            }


            System.out.print("\nOriginal capacities: ");
            printArray(capacities);

            bubbleSort(capacities);


            System.out.print("Sorted capacities: ");
            printArray(capacities);

        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter numeric values only.");
        } finally {
            scanner.close();
            System.out.println("\n🚆 Sorting operation completed.");
        }
    }
}