import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class Bogie {
    String id;
    String type;
    int capacity;

    Bogie(String id, String type, int capacity) {
        this.id = id;
        this.type = type;
        this.capacity = capacity;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Bogie[ID=" + id + ", Type=" + type + ", Capacity=" + capacity + "]";
    }
}
 class UseCase13TrainConsistMgmnt {

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println(" UC13 - Using Optional to Handle Bogies ");
        System.out.println("==========================================\n");

        List<Bogie> trainConsist = new ArrayList<>();
        trainConsist.add(new Bogie("BG101", "Sleeper", 72));
        trainConsist.add(new Bogie("BG102", "AC Chair", 56));

        String searchId = "BG101";
        Optional<Bogie> foundBogie = findBogieById(trainConsist, searchId);

        foundBogie.ifPresentOrElse(
                b -> System.out.println("Bogie Found: " + b),
                () -> System.out.println("Bogie with ID " + searchId + " not found.")
        );

        String missingId = "BG999";
        Optional<Bogie> missingBogie = findBogieById(trainConsist, missingId);

        Bogie defaultBogie = missingBogie.orElse(new Bogie("DEFAULT", "General", 0));
        System.out.println("\nSearching for " + missingId + " (using orElse):");
        System.out.println("Result: " + defaultBogie);

        System.out.println("\nUC13 Optional handling completed successfully...");
    }

    public static Optional<Bogie> findBogieById(List<Bogie> list, String id) {
        return list.stream()
                .filter(b -> b.getId().equals(id))
                .findFirst();
    }
}