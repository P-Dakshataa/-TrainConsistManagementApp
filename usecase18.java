import java.util.Scanner;

public class usecase18 {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("UC18 - Linear Search for Bogie ID");
        System.out.println("======================================\n");

        // Array of bogie IDs
        String[] bogieIds = {
                "BG101",
                "BG205",
                "BG309",
                "BG412",
                "BG550"
        };

        Scanner scanner = new Scanner(System.in);

        // Accept bogie ID to search
        System.out.print("Enter Bogie ID to search: ");
        String searchKey = scanner.nextLine();

        boolean found = false;

        // Linear Search
        for (String id : bogieIds) {
            if (id.equals(searchKey)) {
                found = true;
                break;
            }
        }

        // Display result
        if (found) {
            System.out.println("Bogie ID found: " + searchKey);
        } else {
            System.out.println("Bogie ID not found.");
        }

        System.out.println("\nUC18 searching completed...");

        scanner.close();
    }
}