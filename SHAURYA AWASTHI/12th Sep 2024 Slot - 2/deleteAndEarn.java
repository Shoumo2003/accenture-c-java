import java.util.HashMap;

class deleteAndEarn {
    public int DeleteAndEarn(int[] nums) {
        int mx = 0;
        for (int num : nums) {
            mx = Math.max(mx, num);
        }
        HashMap<Integer, Integer> val = new HashMap<>();
        for (int i : nums) {
            val.put(i, val.getOrDefault(i, 0) + i);
        }
        int pick = val.getOrDefault(1, 0);
        int notpick = 0;
        for (int i = 2; i <= mx; ++i) {
            int newPick = notpick + val.getOrDefault(i, 0);
            int newNotpick = Math.max(pick, notpick);
            notpick = newNotpick;
            pick = newPick;    
        }
        return Math.max(pick, notpick);
    }
}

