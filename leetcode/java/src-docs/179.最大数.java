

/*
 * @lc app=leetcode.cn id=179 lang=java
 *
 * [179] 最大数
 *
 * https://leetcode.cn/problems/largest-number/description/
 *
 * algorithms
 * Medium (41.52%)
 * Likes:    1349
 * Dislikes: 0
 * Total Accepted:    264K
 * Total Submissions: 634.4K
 * Testcase Example:  '[10,2]'
 *
 * 给定一组非负整数 nums，重新排列每个数的顺序（每个数不可拆分）使之组成一个最大的整数。
 * 
 * 注意：输出结果可能非常大，所以你需要返回一个字符串而不是整数。
 * 
 * 
 * 
 * 示例 1：
 * 
 * 
 * 输入：nums = [10,2]
 * 输出："210"
 * 
 * 示例 2：
 * 
 * 
 * 输入：nums = [3,30,34,5,9]
 * 输出："9534330"
 * 
 * 
 * 
 * 
 * 提示：
 * 
 * 
 * 1 <= nums.length <= 100
 * 0 <= nums[i] <= 10^9
 * 
 * 
 */

// @lc code=start
class Solution {
    public String largestNumber(int[] nums) {
        String[] str=new String[nums.length];
        for(int i=0;i<nums.length;i++){
            str[i]=String.valueOf(nums[i]);
        }
        for(int i=0;i<str.length-1;i++){
            for(int j=i+1;j<str.length;j++){
                // 比较两个字符串拼接后的大小
                if((str[i]+str[j]).compareTo(str[j]+str[i])<0){
                    // 如果前者小于后者，则交换位置
                    String temp=str[i];
                    str[i]=str[j];
                    str[j]=temp;
                }
            }
        }
        // 如果最大数是0，直接返回"0"
        if(str[0].equals("0")){
            return "0";
        }
        StringBuilder max=new StringBuilder();
        for (String tmp : str) {
            max.append(tmp);
        }

        // 返回最大数
        return max.toString();
    }
}
// @lc code=end

