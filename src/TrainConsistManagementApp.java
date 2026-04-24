import java.util.Scanner;

public class TrainConsistManagementApp {


    public static boolean linearSearch(String[] bogieIds, String key) {

        for (int i = 0; i < bogieIds.length; i++) {


            if (bogieIds[i].equals(key)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Train Consist Management App (UC18 - Linear Search) ===");

        try {

            System.out.print("Enter number of bogies: ");
            int n = Integer.parseInt(scanner.nextLine());

            String[] bogieIds = new String[n];


            System.out.println("Enter bogie IDs:");
            for (int i = 0; i < n; i++) {
                bogieIds[i] = scanner.nextLine();
            }


            System.out.print("\nEnter bogie ID to search: ");
            String searchKey = scanner.nextLine();


            boolean found = linearSearch(bogieIds, searchKey);


            if (found) {
                System.out.println("✅ Bogie ID found: " + searchKey);
            } else {
                System.out.println("❌ Bogie ID not found: " + searchKey);
            }

        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter numeric values only.");
        } finally {
            scanner.close();
            System.out.println("\n🚆 Search operation completed.");
        }
    }
}