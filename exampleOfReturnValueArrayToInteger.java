// class Solution {
//     public int[] leftRightDifference(int[] nums) {
//         List<Integer> ans = new ArrayList<>();
//         int n = nums.length;
//         int leftSum = 0;
//         int rightSum = 0;

//         for (int i = 0; i < n; i++) {
//             rightSum += nums[i];
//         }

//         for (int i = 0; i < n; i++) {
//             rightSum -= nums[i];
//             ans.add(Math.abs(leftSum - rightSum));
//             leftSum += nums[i];
//         }

//         // Convert the list to an array
//         return ans.stream().mapToInt(Integer::intValue).toArray();
//     }
// }