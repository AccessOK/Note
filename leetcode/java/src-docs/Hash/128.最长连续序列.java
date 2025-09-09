
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=128 lang=java
 *
 * [128] 最长连续序列
 *
 * https://leetcode.cn/problems/longest-consecutive-sequence/description/
 *
 * algorithms
 * Medium (50.26%)
 * Likes:    2567
 * Dislikes: 0
 * Total Accepted:    1.1M
 * Total Submissions: 2.2M
 * Testcase Example:  '[100,4,200,1,3,2]'
 *
 * 给定一个未排序的整数数组 nums ，找出数字连续的最长序列（不要求序列元素在原数组中连续）的长度。
 * 
 * 请你设计并实现时间复杂度为 O(n) 的算法解决此问题。
 * 
 * 
 * 
 * 示例 1：
 * 
 * 
 * 输入：nums = [100,4,200,1,3,2]
 * 输出：4
 * 解释：最长数字连续序列是 [1, 2, 3, 4]。它的长度为 4。
 * 
 * 示例 2：
 * 
 * 
 * 输入：nums = [0,3,7,2,5,8,4,6,0,1]
 * 输出：9
 * 
 * 
 * 示例 3：
 * 
 * 
 * 输入：nums = [1,0,1,2]
 * 输出：3
 * 
 * 
 * 
 * 
 * 提示：
 * 
 * 
 * 0 <= nums.length <= 10^5
 * -10^9 <= nums[i] <= 10^9
 * 
 * 
 */

// @lc code=start
class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums==null||nums.length<1){
            return 0;
        }
        Map<Integer,Integer> map=new HashMap<>();
        int maxCount=1;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int key=nums[i];
            //当前数据有上一位数据
            if(map.containsKey(key-1)){
                int value=map.get(key-1);
                map.put(key,value+1);
                //找到最大的count
                if(value+1>maxCount){
                    maxCount=value+1;
                }
            }
            //当前数据没有上一位数据
            else{
                map.put(key,1);    
            }
        }
        return maxCount;
    }
}
// @lc code=end

