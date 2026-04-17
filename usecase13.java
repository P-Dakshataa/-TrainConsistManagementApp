import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class usecase13 {

    // Bogie model
    static class Bogie {
        String type;
        int capacity;

        Bogie(String type, int capacity) {
            this.type = type;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println(" UC13 - Performance Comparison (Loops vs Streams) ");
        System.out.println("==========================================\n");

        // Create large test dataset
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 50));
        bogies.add(new Bogie("First Class", 30));
        bogies.add(new Bogie("Sleeper", 80));
        bogies.add(new Bogie("AC Chair", 65));
        bogies.add(new Bogie("Sleeper", 90));

        // Loop-based filtering
        long loopStart = System.nanoTime();

        List<Bogie> loopResult = new ArrayList<>();
        for (Bogie bogie : bogies) {
            if (bogie.capacity > 60) {
                loopResult.add(bogie);
            }
        }

        long loopEnd = System.nanoTime();
        long loopExecutionTime = loopEnd - loopStart;

        // Stream-based filtering
        long streamStart = System.nanoTime();

        List<Bogie> streamResult = bogies.stream()
                .filter(bogie -> bogie.capacity > 60)
                .collect(Collectors.toList());

        long streamEnd = System.nanoTime();
        long streamExecutionTime = streamEnd - streamStart;

        // Display results
        System.out.println("Loop Execution Time (ns): " + loopExecutionTime);
        System.out.println("Stream Execution Time (ns): " + streamExecutionTime);

        System.out.println("\nUC13 performance benchmarking completed...");
    }
}
