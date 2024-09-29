import java.util.List;

class Solution {
    public int maxProfit(List<Integer> prices) {
        int no_st = 0;
        int one_st = 0 - prices.get(0);

        System.out.println(no_st + " " + one_st);

        for (int i = 1; i < prices.size(); i++) {
            no_st = Math.max(no_st, (one_st + prices.get(i)));
            one_st = Math.max(one_st, (no_st - prices.get(i)));
            System.out.println(no_st + " " + one_st);
        }
        return no_st;
    }
}