import java.util.*;
import java.util.List;
import java.util.ArrayList;

public class peakElement {
    public static int solve(int n, List<Integer> arr) {
        if (n == 0) return -1;
        if (n == 1) return arr.get(0);

        if (arr.get(0) > arr.get(1)) return arr.get(0); 
        if (arr.get(n - 1) > arr.get(n - 2)) return arr.get(n - 1);
        
        for (int i = 1; i < n - 1; i++) {
            if (arr.get(i) > arr.get(i + 1)) return arr.get(i); 
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>(n);
        
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }

        System.out.println(solve(n, arr));
        sc.close();
    }
}
