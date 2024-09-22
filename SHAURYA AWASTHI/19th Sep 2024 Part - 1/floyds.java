public class floyds {
    public static void main(String[] args) {
        int N = 5; // You can set N to any desired value
        int ans = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= i; j++) {
                ans++;
                System.out.print(ans + " ");
            }
            System.out.println();
        }
    }
}

