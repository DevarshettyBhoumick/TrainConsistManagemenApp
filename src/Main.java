import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Bogie implements Comparable<Bogie> {
    String id;
    String type;
    int capacity;

    Bogie(String id, String type, int capacity) {
        this.id = id;
        this.type = type;
        this.capacity = capacity;
    }

    @Override
    public int compareTo(Bogie other) {
        return Integer.compare(this.capacity, other.capacity);
    }

    @Override
    public String toString() {
        return "Bogie[ID=" + id + ", Type=" + type + ", Capacity=" + capacity + "]";
    }
}

 class UseCase8TrainConsistMgmnt {

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println(" UC8 - Custom Bogie Objects and Sorting ");
        System.out.println("==========================================\n");

        List<Bogie> trainConsist = new ArrayList<>();

        trainConsist.add(new Bogie("BG101", "Sleeper", 72));
        trainConsist.add(new Bogie("BG102", "AC Chair", 56));
        trainConsist.add(new Bogie("BG103", "First Class", 24));
        trainConsist.add(new Bogie("BG104", "General", 90));

        System.out.println("Original Bogie List (By Insertion):");
        for (Bogie b : trainConsist) {
            System.out.println(b);
        }

        Collections.sort(trainConsist);

        System.out.println("\nSorted Bogie List (By Capacity - Ascending):");
        for (Bogie b : trainConsist) {
            System.out.println(b);
        }

        System.out.println("\nUC8 custom object operations completed...");
    }
}