import java.util.ArrayList;
import java.util.List;
import java.util.Map;
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

    @Override
    public String toString() {
        return "Bogie[ID=" + id + ", Type=" + type + ", Capacity=" + capacity + "]";
    }
}

class UseCase12TrainConsistMgmnt {

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println(" UC12 - Group Bogies using Streams ");
        System.out.println("==========================================\n");

        List<Bogie> trainConsist = new ArrayList<>();
        trainConsist.add(new Bogie("BG101", "Sleeper", 72));
        trainConsist.add(new Bogie("BG102", "AC Chair", 56));
        trainConsist.add(new Bogie("BG103", "First Class", 24));
        trainConsist.add(new Bogie("BG104", "Sleeper", 72));
        trainConsist.add(new Bogie("BG105", "General", 90));
        trainConsist.add(new Bogie("BG106", "AC Chair", 56));

        System.out.println("Original Train Consist:");
        trainConsist.forEach(System.out::println);

        Map<String, List<Bogie>> bogiesByType = trainConsist.stream()
                .collect(Collectors.groupingBy(Bogie::getType));

        System.out.println("\nBogies Grouped by Type:");
        bogiesByType.forEach((type, list) -> {
            System.out.println(type + ": " + list);
        });

        Map<String, Long> bogieCountByType = trainConsist.stream()
                .collect(Collectors.groupingBy(Bogie::getType, Collectors.counting()));

        System.out.println("\nBogie Count by Type:");
        System.out.println(bogieCountByType);

        System.out.println("\nUC12 stream grouping operations completed successfully...");
    }
}