import java.util.*;

public class halloweenCandy {
    public static int solve(int n, List<Integer> candy, int h) {
        int low = 1;
        int high = Collections.max(candy);
        int c = 0;

        while (low <= high) {
            int mid = (low + high) / 2;
            int rh = 0;

            for (int i = 0; i < n; i++) {
                rh += candy.get(i) / mid + (candy.get(i) % mid != 0 ? 1 : 0);
            }

            if (rh > h) {
                low = mid + 1;
            } else { // valid ans
                c = mid;
                high = mid - 1; // in search of lesser c value;
            }
        }

        return c;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> candy = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            candy.add(scanner.nextInt());
        }
        int h = scanner.nextInt();

        System.out.println(solve(n, candy, h));
        scanner.close();
    }
}

