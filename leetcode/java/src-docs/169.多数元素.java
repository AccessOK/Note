
import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=169 lang=java
 *
 * [169] 多数元素
 *
 * https://leetcode.cn/problems/majority-element/description/
 *
 * algorithms
 * Easy (66.77%)
 * Likes:    2498
 * Dislikes: 0
 * Total Accepted:    1.3M
 * Total Submissions: 1.9M
 * Testcase Example:  '[3,2,3]'
 *
 * 给定一个大小为 n 的数组 nums ，返回其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。
 * 
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 * 
 * 
 * 
 * 示例 1：
 * 
 * 
 * 输入：nums = [3,2,3]
 * 输出：3
 * 
 * 示例 2：
 * 
 * 
 * 输入：nums = [2,2,1,1,1,2,2]
 * 输出：2
 * 
 * 
 * 
 * 提示：
 * 
 * 
 * n == nums.length
 * 1 <= n <= 5 * 10^4
 * -10^9 <= nums[i] <= 10^9
 * 
 * 
 * 
 * 
 * 进阶：尝试设计时间复杂度为 O(n)、空间复杂度为 O(1) 的算法解决此问题。
 * 
 */

// @lc code=start
class Solution {
    public int majorityElement(int[] nums) {
        // //最值排序算法之后输出值:超时
        // //找到最中间的值，找中位数
        // for (int i = 0; i < nums.length-1; i++){
        //     int min=i;
        //     //找到i值之后最小的数
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[j]<nums[min]){
        //             min=j;
        //         }
        //     }
        //     int t=nums[i];
        //     nums[i]=nums[min];
        //     nums[min]=t;
        //     if(i>nums.length+1){
        //         break;
        //     }
        // }
        // return nums[nums.length/2];


        //遍历数据的总数量
        Map<Integer,Integer> numMap=new HashMap();
        for(int i=0;i<nums.length;i++){
            //获取当前的数量
            int number=0;
            if(numMap.containsKey(nums[i])){
                number=numMap.get(nums[i]);
            }
            number++;
            if(number>nums.length/2){
                return nums[i];
            }else{
                numMap.put(nums[i], number++);
            }
        }
        return 0;
    }
}
// @lc code=end

