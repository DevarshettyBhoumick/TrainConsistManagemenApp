import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Bogie {
    String id;
    String type;
    int capacity;

    Bogie(String id, String type, int capacity) {
        this.id = id;
        this.type = type;
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "Bogie[ID=" + id + ", Type=" + type + ", Capacity=" + capacity + "]";
    }
}

 class UseCase11TrainConsistMgmnt {

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println(" UC11 - Transform Bogie Data using Streams ");
        System.out.println("==========================================\n");

        List<Bogie> trainConsist = new ArrayList<>();
        trainConsist.add(new Bogie("BG101", "Sleeper", 72));
        trainConsist.add(new Bogie("BG102", "AC Chair", 56));
        trainConsist.add(new Bogie("BG103", "First Class", 24));
        trainConsist.add(new Bogie("BG104", "General", 90));

        System.out.println("Original Train Consist:");
        trainConsist.forEach(System.out::println);

        List<String> bogieIds = trainConsist.stream()
                .map(b -> b.id)
                .collect(Collectors.toList());

        System.out.println("\nExtracted Bogie IDs (Map to String):");
        System.out.println(bogieIds);

        List<String> upperCaseTypes = trainConsist.stream()
                .map(b -> b.getType().toUpperCase())
                .collect(Collectors.toList());

        System.out.println("\nBogie Types in Uppercase:");
        System.out.println(upperCaseTypes);

        int totalCapacity = trainConsist.stream()
                .mapToInt(Bogie::getCapacity)
                .sum();

        System.out.println("\nTotal Passenger Capacity of Train: " + totalCapacity);

        double averageCapacity = trainConsist.stream()
                .mapToInt(Bogie::getCapacity)
                .average()
                .orElse(0.0);

        System.out.println("Average Bogie Capacity: " + averageCapacity);

        System.out.println("\nUC11 stream transformation completed successfully...");
    }
}