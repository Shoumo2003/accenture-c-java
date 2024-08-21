import java.util.Scanner;

public class areaOfCanopy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();

        float area = 3.14f * d * d;

        if (area - (int) area <= 0.5) {
            System.out.println((int) area);
        } else {
            System.out.println((int) area + 1);
        }

        sc.close();
    }
}
