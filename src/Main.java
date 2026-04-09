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

 class UseCase10TrainConsistMgmnt {

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println(" UC10 - Filter Bogies using Streams ");
        System.out.println("==========================================\n");

        List<Bogie> trainConsist = new ArrayList<>();
        trainConsist.add(new Bogie("BG101", "Sleeper", 72));
        trainConsist.add(new Bogie("BG102", "AC Chair", 56));
        trainConsist.add(new Bogie("BG103", "First Class", 24));
        trainConsist.add(new Bogie("BG104", "Sleeper", 72));
        trainConsist.add(new Bogie("BG105", "General", 90));

        System.out.println("Original Train Consist:");
        trainConsist.forEach(System.out::println);

        List<Bogie> sleeperBogies = trainConsist.stream()
                .filter(b -> b.getType().equals("Sleeper"))
                .collect(Collectors.toList());

        System.out.println("\nFiltered Bogies (Type: Sleeper):");
        sleeperBogies.forEach(System.out::println);

        List<Bogie> highCapacityBogies = trainConsist.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());

        System.out.println("\nFiltered Bogies (Capacity > 60):");
        highCapacityBogies.forEach(System.out::println);

        long count = trainConsist.stream()
                .filter(b -> b.getCapacity() > 50)
                .count();

        System.out.println("\nNumber of bogies with capacity > 50: " + count);

        System.out.println("\nUC10 stream filtering completed successfully...");
    }
}