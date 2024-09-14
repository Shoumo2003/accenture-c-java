import java.util.HashSet;

class happyNumbers {
    private HashSet<Integer> m = new HashSet<>();

    public boolean isHappy(int n) {
        System.out.println(n);
        if (n == 1) return true;

        if (m.contains(n)) return false;
        m.add(n);
        int newNum = 0;

        while (n > 0) {
            int x = n % 10;
            newNum += (x * x);
            n /= 10;
        }

        return isHappy(newNum);
    }
}