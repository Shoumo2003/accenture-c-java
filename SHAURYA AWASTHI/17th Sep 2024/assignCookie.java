import java.util.Arrays;

class assignCookie {
    public int findContentChildren(int[] g, int[] s) {
        
        Arrays.sort(g);
        Arrays.sort(s);

        if (s.length == 0) return 0;

        int i = 0, j = 0, count = 0;

        while (i < s.length && j < g.length) {
            if (s[i] >= g[j]) {
                count++;
                i++;
                j++;
            } else {
                i++;
            }
        }

        return count;
    }
}

