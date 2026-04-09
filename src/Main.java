import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

 class UseCase7TrainConsistMgmnt {

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println(" UC7 - Search and Sort Bogies ");
        System.out.println("==========================================\n");

        List<String> bogies = new ArrayList<>();
        bogies.add("Sleeper");
        bogies.add("AC Chair");
        bogies.add("First Class");
        bogies.add("General");

        System.out.println("Original Bogie List:");
        System.out.println(bogies);

        Collections.sort(bogies);
        System.out.println("\nBogies after Sorting (Alphabetical):");
        System.out.println(bogies);

        String searchBogie = "AC Chair";
        int index = Collections.binarySearch(bogies, searchBogie);
        System.out.println("\nSearching for '" + searchBogie + "':");
        System.out.println("Found at index: " + index);

        Collections.reverse(bogies);
        System.out.println("\nBogies after Reversing:");
        System.out.println(bogies);

        Collections.shuffle(bogies);
        System.out.println("\nBogies after Shuffling:");
        System.out.println(bogies);

        System.out.println("\nUC7 search and sort operations completed...");
    }
}