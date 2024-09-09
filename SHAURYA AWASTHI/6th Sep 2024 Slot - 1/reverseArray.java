import java.util.*;

public class reverseArray {
    public static void rotate(List<Integer> nums, int k) {
        k = k % nums.size();
        Collections.reverse(nums);
        Collections.reverse(nums.subList(0, k));
        Collections.reverse(nums.subList(k, nums.size()));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> nums = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            nums.add(scanner.nextInt());
        }
        int k = scanner.nextInt();
        rotate(nums, k);
        scanner.close();
    }
}

