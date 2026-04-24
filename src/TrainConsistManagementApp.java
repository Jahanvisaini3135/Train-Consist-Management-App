import java.util.Arrays;
import java.util.Scanner;

public class TrainConsistManagementApp {

    public static boolean binarySearch(String[] bogieIds, String key) {

        int left = 0;
        int right = bogieIds.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            int comparison = bogieIds[mid].compareTo(key);

            if (comparison == 0) {
                return true; // Found
            } else if (comparison < 0) {
                left = mid + 1; // Search right half
            } else {
                right = mid - 1; // Search left half
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Train Consist Management App (UC19 - Binary Search) ===");

        try {

            System.out.print("Enter number of bogies: ");
            int n = Integer.parseInt(scanner.nextLine());

            String[] bogieIds = new String[n];


            System.out.println("Enter bogie IDs:");
            for (int i = 0; i < n; i++) {
                bogieIds[i] = scanner.nextLine();
            }


            Arrays.sort(bogieIds);

            System.out.println("\nSorted bogie IDs: " + Arrays.toString(bogieIds));


            System.out.print("Enter bogie ID to search: ");
            String searchKey = scanner.nextLine();


            boolean found = binarySearch(bogieIds, searchKey);


            if (found) {
                System.out.println("✅ Bogie ID found: " + searchKey);
            } else {
                System.out.println("❌ Bogie ID not found: " + searchKey);
            }

        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter numeric values only.");
        } finally {
            scanner.close();
            System.out.println("\n🚆 Binary search operation completed.");
        }
    }
}