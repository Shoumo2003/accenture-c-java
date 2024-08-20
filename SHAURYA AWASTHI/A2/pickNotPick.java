import java.util.*;

public class pickNotPick {
    static int maxi = 0;

    static void solve(int idx, ArrayList<Integer> arr, ArrayList<Integer> aux, int k) {
        if (idx == arr.size()) { // edge case
            if (maxi < aux.size()) maxi = aux.size();
            return;
        }

        if (aux.isEmpty() || (arr.get(idx) - aux.get(aux.size() - 1)) % k == 0) { // pick
            aux.add(arr.get(idx));
            solve(idx + 1, arr, aux, k); // pick
            aux.remove(aux.size() - 1);
        }

        solve(idx + 1, arr, aux, k); // not pick
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(scanner.nextInt());
        }

        ArrayList<Integer> aux = new ArrayList<>();
        int idx = 0;

        solve(idx, arr, aux, k);

        System.out.println(maxi);

        scanner.close();
    }
}

