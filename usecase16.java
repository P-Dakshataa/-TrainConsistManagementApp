public class usecase16 {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("UC16 - Sort Passenger Bogies by Capacity");
        System.out.println("======================================\n");

        // Passenger bogie capacities
        int[] capacities = {72, 56, 24, 70, 60};

        System.out.print("Before Sorting: ");
        for (int capacity : capacities) {
            System.out.print(capacity + " ");
        }

        // Bubble Sort
        for (int i = 0; i < capacities.length - 1; i++) {
            for (int j = 0; j < capacities.length - i - 1; j++) {
                if (capacities[j] > capacities[j + 1]) {

                    // Swap values
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }

        System.out.print("\n\nAfter Sorting: ");
        for (int capacity : capacities) {
            System.out.print(capacity + " ");
        }

        System.out.println("\n\nUC16 sorting completed...");
    }
}
