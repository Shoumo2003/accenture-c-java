import java.util.Scanner;

public class maxFavSongs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();

        int n = s.length();

        int count = 0, maxi = 0, i = 0, j = -1;

        while (j < k - 1) {
            if (s.charAt(++j) == 'a') count++;
        }
        maxi = count;

        while (j < n -1) {
            if (s.charAt(i++) == 'a') count--;
            if (s.charAt(++j) == 'a') count++;
            maxi = Math.max(maxi, count);
        }

        System.out.println(maxi);
        sc.close();
    }    
}
