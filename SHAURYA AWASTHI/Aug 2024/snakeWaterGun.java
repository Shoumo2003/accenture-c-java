import java.util.Scanner;

public class snakeWaterGun {
    public static int solve(int n, String s) {
        StringBuilder A = new StringBuilder();
        StringBuilder B = new StringBuilder();
    
        StringBuilder word = new StringBuilder();
    
        boolean flag = false;
    
        for (int i = 0; i < s.length(); i++) {
            word.append(s.charAt(i));
    
            if (word.toString().equals("snake")) {
                if (flag) B.append("s");
                else A.append("s");
    
                flag = !flag;
                word.setLength(0);
            } else if (word.toString().equals("water")) {
                if (flag) B.append("w");
                else A.append("w");
    
                flag = !flag;
                word.setLength(0);
            } else if (word.toString().equals("gun")) {
                if (flag) B.append("g");
                else A.append("g");
    
                flag = !flag;
                word.setLength(0);
            }
        }

        System.out.println(A.toString());
        System.out.println(B.toString());

        int c = 0;

        for (int i = 0; i < n; i++) {
            if (B.charAt(i) == 's' && A.charAt(i) == 'g' || B.charAt(i) == 'w' && A.charAt(i) == 's' || B.charAt(i) == 'g' && A.charAt(i) == 'w') {
                c++;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        System.out.println(solve(n, s));
        sc.close();
    }
}