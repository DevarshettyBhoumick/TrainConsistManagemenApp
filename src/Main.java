import java.util.ArrayList;
import java.util.List;

 class UseCase14TrainConsistMgmnt {

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println(" UC14 - Final Train Consist Summary ");
        System.out.println("==========================================\n");

        List<String> finalConsist = new ArrayList<>();
        finalConsist.add("Engine (E101)");
        finalConsist.add("Sleeper (S1)");
        finalConsist.add("Sleeper (S2)");
        finalConsist.add("AC Chair (A1)");
        finalConsist.add("First Class (F1)");
        finalConsist.add("Cargo (C1)");
        finalConsist.add("Guard Van (G1)");

        System.out.println("Finalized Train Formation:");
        for (int i = 0; i < finalConsist.size(); i++) {
            System.out.println("Position " + (i + 1) + ": " + finalConsist.get(i));
        }

        System.out.println("\nTotal Bogies Attached: " + finalConsist.size());
        System.out.println("Train Status: READY FOR DEPARTURE");

        System.out.println("\n==========================================");
        System.out.println(" End of Train Consist Management App ");
        System.out.println("==========================================");
    }
}