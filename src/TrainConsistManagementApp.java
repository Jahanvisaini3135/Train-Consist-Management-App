import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class TrainConsistManagementApp{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter Train ID (Format: TRN-1234): ");
        String trainId = sc.nextLine();

        System.out.print("Enter Cargo Code (Format: PET-AB): ");
        String cargoCode = sc.nextLine();


        String trainIdRegex = "TRN-\\d{4}";
        String cargoCodeRegex = "PET-[A-Z]{2}";


        Pattern trainPattern = Pattern.compile(trainIdRegex);
        Pattern cargoPattern = Pattern.compile(cargoCodeRegex);


        Matcher trainMatcher = trainPattern.matcher(trainId);
        Matcher cargoMatcher = cargoPattern.matcher(cargoCode);


        boolean isTrainValid = trainMatcher.matches();
        boolean isCargoValid = cargoMatcher.matches();


        System.out.println("\n--- Validation Results ---");

        if (isTrainValid) {
            System.out.println("Train ID is VALID ✅");
        } else {
            System.out.println("Train ID is INVALID ❌");
        }

        if (isCargoValid) {
            System.out.println("Cargo Code is VALID ✅");
        } else {
            System.out.println("Cargo Code is INVALID ❌");
        }


        if (isTrainValid && isCargoValid) {
            System.out.println("\nAll inputs are valid. Proceeding with system operations...");
        } else {
            System.out.println("\nInvalid input detected. Please correct the format.");
        }

        sc.close();
    }
}