import java.util.Scanner;

public class rockPaperScissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();

        if (A.equals("rock")) {
            System.out.println("paper");
        } else if (A.equals("paper")) {
            System.out.println("scissor");
        } else {
            System.out.println("rock");
        }

        sc.close();
    }    
}
