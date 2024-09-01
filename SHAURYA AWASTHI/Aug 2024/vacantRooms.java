import java.util.Scanner;

public class vacantRooms {

    public static int countVacantRooms(int[] reservedRooms, int reservedCount, int totalRooms) {
        // Assuming reserved rooms are unique
        int[] roomNumbers = new int[totalRooms];
        for (int i = 0; i < reservedCount; i++) {
            roomNumbers[reservedRooms[i] - 1] = 1; // Mark room as occupied
        }

        int vacantCount = 0;
        for (int i = 0; i < totalRooms; i++) {
            if (roomNumbers[i] == 0) {
                vacantCount++;
            }
        }

        return vacantCount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the total number of rooms: ");
        int totalRooms = scanner.nextInt();

        System.out.print("Enter the number of reserved rooms: ");
        int reservedCount = scanner.nextInt();

        int[] reservedRooms = new int[reservedCount];
        System.out.println("Enter the reserved room numbers:");
        for (int i = 0; i < reservedCount; i++) {
            reservedRooms[i] = scanner.nextInt();
        }

        int vacantRooms = countVacantRooms(reservedRooms, reservedCount, totalRooms);
        System.out.println("Total number of vacant rooms: " + vacantRooms);

        scanner.close();
    }
}
