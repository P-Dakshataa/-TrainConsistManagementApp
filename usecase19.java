import java.util.Scanner;

public class usecase19 {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("UC19 - Binary Search for Bogie ID");
        System.out.println("======================================\n");

        // Sorted array of bogie IDs
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

        int low = 0;
        int high = bogieIds.length - 1;
        boolean found = false;

        // Binary Search
        while (low <= high) {
            int mid = (low + high) / 2;

            int result = searchKey.compareTo(bogieIds[mid]);

            if (result == 0) {
                found = true;
                break;
            } else if (result > 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        // Display result
        if (found) {
            System.out.println("Bogie ID found: " + searchKey);
        } else {
            System.out.println("Bogie ID not found.");
        }

        System.out.println("\nUC19 searching completed...");
        scanner.close();
    }
}
