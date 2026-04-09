import java.util.HashMap;
import java.util.Map;

 class UseCase5TrainConsistMgmnt {

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println(" UC5 - Map Bogie IDs to Bogie Types ");
        System.out.println("==========================================\n");

        Map<String, String> bogieMap = new HashMap<>();

        bogieMap.put("BG101", "Sleeper");
        bogieMap.put("BG102", "AC Chair");
        bogieMap.put("BG103", "First Class");
        bogieMap.put("BG104", "General");

        System.out.println("Bogie Map (ID -> Type):");
        System.out.println(bogieMap);

        String bogieId = "BG102";
        System.out.println("\nSearching for Bogie ID: " + bogieId);
        if (bogieMap.containsKey(bogieId)) {
            System.out.println("Bogie Type for " + bogieId + " is: " + bogieMap.get(bogieId));
        }

        bogieMap.remove("BG104");
        System.out.println("\nAfter Removing BG104:");
        System.out.println(bogieMap);

        System.out.println("\nFinal Bogie Assignment Summary:");
        for (Map.Entry<String, String> entry : bogieMap.entrySet()) {
            System.out.println("Bogie ID: " + entry.getKey() + " | Type: " + entry.getValue());
        }

        System.out.println("\nUC5 mapping operations completed successfully...");
    }
}