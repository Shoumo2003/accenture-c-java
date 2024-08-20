import java.util.*;

public class pickNotPick2 {
    static int maxi = 0;

    static void solve(int idx, ArrayList<Integer> arr, ArrayList<Integer> aux) {
        if (idx == arr.size()) { // edge case
            if (maxi < aux.size()) maxi = aux.size();
            return;
        }

        if (aux.isEmpty() || aux.get(aux.size() - 1) * 3 == arr.get(idx)) { // pick
            aux.add(arr.get(idx));
            solve(idx + 1, arr, aux);
            aux.remove(aux.size() - 1);
        }

        solve(idx + 1, arr, aux); // not pick
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(scanner.nextInt());
        }

        ArrayList<Integer> aux = new ArrayList<>();
        int idx = 0;

        solve(idx, arr, aux);

        System.out.println(maxi);

        scanner.close();
    }
}

