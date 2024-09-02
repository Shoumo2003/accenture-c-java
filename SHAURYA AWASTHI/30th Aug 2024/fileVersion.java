import java.util.*;

public class fileVersion {
    public static int solve(int n, List<String> arr) {
        int maxVer = -1;
        for (int i = 0; i < n; i++) {
            String s = arr.get(i);

            if (s.length() >= 6 && s.substring(0, 5).equals("File_"));
            int idx = 5, ver = 0;

            boolean valid = true;

            while (idx < s.length()) {
                if (s.charAt(idx) <= '9' && s.charAt(idx) >= '0') {
                    ver = ver * 10 + (s.charAt(idx) - '0');
                } else {
                    valid = false; 
                    break;
                } idx++;
            }

            if (valid) maxVer = Math.max(maxVer, ver);
        }

        return maxVer;
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<String> arr = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            arr.add(sc.next());
        }

        System.out.println(solve(n, arr));
        sc.close();
    }
}