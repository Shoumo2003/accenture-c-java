import java.util.HashMap;

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<Character, Integer> m = new HashMap<>();

        for (int i = 0; i < s.length(); i++)
            m.put(s.charAt(i), m.getOrDefault(s.charAt(i), 0) + 1);

        for (int i = 0; i < t.length(); i++) {
            if (!m.containsKey(t.charAt(i))) return false;

            if (m.get(t.charAt(i)) == 0) return false;

            m.put(t.charAt(i), m.get(t.charAt(i)) - 1);
        }

        return true;
    }
}

