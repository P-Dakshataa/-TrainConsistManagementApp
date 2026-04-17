import java.util.*;

public class usecase2 {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("UC2 - Add Passenger Bogies to Train");
        System.out.println("====================================\n");

        List<String> passengerBogies = new ArrayList<>();

        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("After Adding Bogies: " + passengerBogies);

        passengerBogies.remove("AC Chair");

        System.out.println("After Removing AC Chair: " + passengerBogies);

        boolean exists = passengerBogies.contains("Sleeper");
        System.out.println("Is Sleeper present: " + exists);

        System.out.println("Final Train Consist: " + passengerBogies);
    }
}
