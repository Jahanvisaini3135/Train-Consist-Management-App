import java.util.Scanner;

public class TrainConsistManagementApp {


    public static boolean searchBogie(String[] bogies, String key) {
        for (String bogie : bogies) {
            if (bogie.equals(key)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Train Consist Management App (UC20 - Exception Handling Search) ===");

        try {

            System.out.print("Enter number of bogies: ");
            int n = Integer.parseInt(scanner.nextLine());

            String[] bogies = new String[n];


            System.out.println("Enter bogie IDs:");
            for (int i = 0; i < n; i++) {
                bogies[i] = scanner.nextLine();
            }


            if (bogies.length == 0) {
                throw new IllegalStateException("Search not allowed: No bogies available in the train consist.");
            }


            System.out.print("\nEnter bogie ID to search: ");
            String key = scanner.nextLine();


            boolean found = searchBogie(bogies, key);


            if (found) {
                System.out.println("✅ Bogie found: " + key);
            } else {
                System.out.println("❌ Bogie not found: " + key);
            }

        } catch (IllegalStateException e) {
            System.out.println("⚠ Error: " + e.getMessage());

        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter numeric values only.");

        } finally {
            scanner.close();
            System.out.println("\n🚆 Search operation completed.");
        }
    }
}