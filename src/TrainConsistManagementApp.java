import java.util.Scanner;


class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}


abstract class GoodsBogie {
    protected String shape;
    protected String cargo;

    public GoodsBogie(String shape) {
        this.shape = shape;
    }


    public void assignCargo(String cargoType) {
        try {
            System.out.println("\nAttempting to assign cargo: " + cargoType + " to " + shape + " bogie");


            if (shape.equalsIgnoreCase("Rectangular") &&
                    cargoType.equalsIgnoreCase("Petroleum")) {

                throw new CargoSafetyException("Unsafe cargo! Petroleum cannot be assigned to Rectangular bogie.");
            }


            this.cargo = cargoType;
            System.out.println("✅ Cargo assigned successfully: " + cargoType);

        } catch (CargoSafetyException e) {

            System.out.println("❌ Error: " + e.getMessage());

        } finally {

            System.out.println("🔍 Assignment attempt completed for " + shape + " bogie.");
        }
    }

    public String getCargo() {
        return cargo;
    }
}


class RectangularBogie extends GoodsBogie {
    public RectangularBogie() {
        super("Rectangular");
    }
}


class CylindricalBogie extends GoodsBogie {
    public CylindricalBogie() {
        super("Cylindrical");
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        GoodsBogie rectangular = new RectangularBogie();
        GoodsBogie cylindrical = new CylindricalBogie();

        System.out.println("=== Train Consist Management App (UC15) ===");

        try {

            System.out.print("\nEnter cargo for Rectangular Bogie: ");
            String cargo1 = scanner.nextLine();
            rectangular.assignCargo(cargo1);


            System.out.print("\nEnter cargo for Cylindrical Bogie: ");
            String cargo2 = scanner.nextLine();
            cylindrical.assignCargo(cargo2);


            System.out.print("\nEnter another cargo for Cylindrical Bogie: ");
            String cargo3 = scanner.nextLine();
            cylindrical.assignCargo(cargo3);

        } finally {
            scanner.close();
            System.out.println("\n🚆 Application execution completed safely.");
        }
    }
}