// Java code to implement above approach

public class TwoDistinctEven {
    // Divide number into 2 even parts
    static boolean divNum(int n) {
        return (n <= 2 ? false : (n % 2 == 0));
    }

    // Driven Program
    public static void main(String[] args) {
        int n = 8;
        System.out.println(divNum(n) ? "YES" : "NO");
    }
}

