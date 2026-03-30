import java.util.*;
import java.util.stream.Collectors;


class Bogie {
    String type;
    int capacity;

    public Bogie(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "Type: " + type + ", Capacity: " + capacity;
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Bogie> bogieList = new ArrayList<>();


        System.out.print("Enter number of bogies: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Bogie " + (i + 1));

            System.out.print("Enter bogie type: ");
            String type = sc.nextLine();

            System.out.print("Enter seating capacity: ");
            int capacity = sc.nextInt();
            sc.nextLine();

            bogieList.add(new Bogie(type, capacity));
        }

       System.out.println("\n--- Original Bogie List ---");
        bogieList.forEach(System.out::println);

        int threshold = 60;


        long startLoop = System.nanoTime();

        List<Bogie> loopResult = new ArrayList<>();
        for (Bogie b : bogieList) {
            if (b.getCapacity() > threshold) {
                loopResult.add(b);
            }
        }

        long endLoop = System.nanoTime();
        long loopTime = endLoop - startLoop;


        long startStream = System.nanoTime();

        List<Bogie> streamResult = bogieList.stream()
                .filter(b -> b.getCapacity() > threshold)
                .collect(Collectors.toList());

        long endStream = System.nanoTime();
        long streamTime = endStream - startStream;

        System.out.println("\n--- Loop Filtering Result ---");
        loopResult.forEach(System.out::println);

        System.out.println("\n--- Stream Filtering Result ---");
        streamResult.forEach(System.out::println);


        System.out.println("\n--- Performance Comparison ---");
        System.out.println("Loop Execution Time   : " + loopTime + " ns");
        System.out.println("Stream Execution Time : " + streamTime + " ns");


        System.out.println("\n--- Result Comparison ---");
        if (loopResult.size() == streamResult.size()) {
            System.out.println("Both approaches produce SAME results ✅");
        } else {
            System.out.println("Mismatch in results ❌");
        }

        sc.close();
    }
}