import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Bogie {
    String id;
    String type;
    int capacity;

    Bogie(String id, String type, int capacity) {
        this.id = id;
        this.type = type;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Bogie[ID=" + id + ", Type=" + type + ", Capacity=" + capacity + "]";
    }
}

class CapacityComparator implements Comparator<Bogie> {
    @Override
    public int compare(Bogie b1, Bogie b2) {
        return Integer.compare(b1.capacity, b2.capacity);
    }
}

class TypeComparator implements Comparator<Bogie> {
    @Override
    public int compare(Bogie b1, Bogie b2) {
        return b1.type.compareTo(b2.type);
    }
}

 class UseCase9TrainConsistMgmnt {

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println(" UC9 - Advanced Sorting with Comparator ");
        System.out.println("==========================================\n");

        List<Bogie> trainConsist = new ArrayList<>();
        trainConsist.add(new Bogie("BG101", "Sleeper", 72));
        trainConsist.add(new Bogie("BG102", "AC Chair", 56));
        trainConsist.add(new Bogie("BG103", "First Class", 24));
        trainConsist.add(new Bogie("BG104", "General", 90));

        System.out.println("Original Bogie List:");
        for (Bogie b : trainConsist) {
            System.out.println(b);
        }

        trainConsist.sort(new CapacityComparator());
        System.out.println("\nSorted by Capacity (Ascending):");
        for (Bogie b : trainConsist) {
            System.out.println(b);
        }

        trainConsist.sort(new TypeComparator());
        System.out.println("\nSorted by Type (Alphabetical):");
        for (Bogie b : trainConsist) {
            System.out.println(b);
        }

        System.out.println("\nUC9 comparator operations completed...");
    }
}