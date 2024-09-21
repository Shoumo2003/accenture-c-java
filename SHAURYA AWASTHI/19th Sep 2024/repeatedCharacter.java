import java.util.Arrays;

class repeatedCharacter {
    public char repeatedCharacter(String s) {
        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return s.charAt(i);
            } else {
                freq[s.charAt(i) - 'a']++;
            }
        }

        return s.charAt(0);
    }
}

