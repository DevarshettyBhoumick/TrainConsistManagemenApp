import java.util.TreeMap;
import java.util.Map;

 class UseCase6TrainConsistMgmnt {

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println(" UC6 - Maintain Sorted Bogie IDs ");
        System.out.println("==========================================\n");

        TreeMap<String, String> sortedBogieMap = new TreeMap<>();

        sortedBogieMap.put("BG104", "General");
        sortedBogieMap.put("BG101", "Sleeper");
        sortedBogieMap.put("BG103", "First Class");
        sortedBogieMap.put("BG102", "AC Chair");

        System.out.println("Bogie Map (Sorted by ID):");
        System.out.println(sortedBogieMap);

        System.out.println("\nFirst Bogie in Sequence: " + sortedBogieMap.firstKey());
        System.out.println("Last Bogie in Sequence: " + sortedBogieMap.lastKey());

        System.out.println("\nBogie Sequence Summary:");
        for (Map.Entry<String, String> entry : sortedBogieMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " -> Type: " + entry.getValue());
        }

        System.out.println("\nUC6 sorted mapping operations completed...");
    }
}