import java.util.*;


class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}


class PassengerBogie {
    String type;
    int capacity;

    public PassengerBogie(String type, int capacity) throws InvalidCapacityException {
        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than zero");
        }
        this.type = type;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Type: " + type + ", Capacity: " + capacity;
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<PassengerBogie> bogieList = new ArrayList<>();


        System.out.print("Enter number of passenger bogies: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            try {
                System.out.println("\nEnter details for Bogie " + (i + 1));

                System.out.print("Enter bogie type (Sleeper/AC Chair/First Class): ");
                String type = sc.nextLine();

                System.out.print("Enter seating capacity: ");
                int capacity = sc.nextInt();
                sc.nextLine();


                PassengerBogie bogie = new PassengerBogie(type, capacity);

                bogieList.add(bogie);
                System.out.println("Bogie added successfully ✅");

            } catch (InvalidCapacityException e) {
                System.out.println("Error: " + e.getMessage() + " ❌");
                System.out.println("Bogie NOT added. Please enter valid data.");
            }
        }


        System.out.println("\n--- Valid Passenger Bogies ---");

        if (bogieList.isEmpty()) {
            System.out.println("No valid bogies added.");
        } else {
            bogieList.forEach(System.out::println);
        }

        sc.close();
    }
}