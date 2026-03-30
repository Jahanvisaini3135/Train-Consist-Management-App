import java.util.*;


class GoodsBogie {
    String type;
    String cargo;

    public GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    public String getType() {
        return type;
    }

    public String getCargo() {
        return cargo;
    }

    @Override
    public String toString() {
        return "Type: " + type + ", Cargo: " + cargo;
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<GoodsBogie> bogieList = new ArrayList<>();


        System.out.print("Enter number of goods bogies: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Bogie " + (i + 1));

            System.out.print("Enter bogie type (Cylindrical/Open/Box): ");
            String type = sc.nextLine();

            System.out.print("Enter cargo type (Petroleum/Coal/Grain): ");
            String cargo = sc.nextLine();

            bogieList.add(new GoodsBogie(type, cargo));
        }


        System.out.println("\n--- Goods Bogie List ---");
        bogieList.forEach(System.out::println);


        boolean isSafe = bogieList.stream()
                .allMatch(b -> {
                    // Rule: Cylindrical → only Petroleum
                    if (b.getType().equalsIgnoreCase("Cylindrical")) {
                        return b.getCargo().equalsIgnoreCase("Petroleum");
                    }
                    return true; // Other types allowed any cargo
                });


        System.out.println("\n--- Safety Compliance Result ---");

        if (isSafe) {
            System.out.println("Train is SAFETY COMPLIANT ✅");
        } else {
            System.out.println("Train is NOT SAFE ❌");
        }


        System.out.println("\n--- Original List After Validation (Unchanged) ---");
        bogieList.forEach(System.out::println);

        sc.close();
    }
}