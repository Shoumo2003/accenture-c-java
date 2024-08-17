import java.util.Scanner;

public class operation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.println(OperationBinaryString(str));
        sc.close();
    }

    public static int  OperationBinaryString(String str) {
        if (str.length() == 0) {
            return -1;
        }

        int res = str.charAt(0) - '0';
        for (int i = 1; i < str.length(); i++) {
            char prev = str.charAt(i);
            i++;

            if (prev == 'A') {
                res &= str.charAt(i) - '0';
            }
            else if (prev == 'B') {
                res |= str.charAt(i) - '0';
            }
            else {
                res ^= str.charAt(i) - '0';
            }
        }
        return res;
    }
}