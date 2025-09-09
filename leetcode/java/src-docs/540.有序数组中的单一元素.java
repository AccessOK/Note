/*
 * @lc app=leetcode.cn id=540 lang=java
 *
 * [540] 有序数组中的单一元素
 *
 * https://leetcode.cn/problems/single-element-in-a-sorted-array/description/
 *
 * algorithms
 * Medium (60.62%)
 * Likes:    745
 * Dislikes: 0
 * Total Accepted:    155.8K
 * Total Submissions: 257K
 * Testcase Example:  '[1,1,2,3,3,4,4,8,8]'
 *
 * 给你一个仅由整数组成的有序数组，其中每个元素都会出现两次，唯有一个数只会出现一次。
 * 
 * 请你找出并返回只出现一次的那个数。
 * 
 * 你设计的解决方案必须满足 O(log n) 时间复杂度和 O(1) 空间复杂度。
 * 
 * 
 * 
 * 示例 1:
 * 
 * 
 * 输入: nums = [1,1,2,3,3,4,4,8,8]
 * 输出: 2
 * 
 * 
 * 示例 2:
 * 
 * 
 * 输入: nums =  [3,3,7,7,10,11,11]
 * 输出: 10
 * 
 * 
 * 
 * 
 * 
 * 
 * 提示:
 * 
 * 
 * 1 <= nums.length <= 10^5
 * 0 <= nums[i] <= 10^5
 * 
 * 
 */

// @lc code=start
class Solution {
    public int singleNonDuplicate(int[] nums) {
        int result=0;
        //遍历找出和左右都不相等的数
        // if(nums.length==1){
        //     result=nums[0];
        // }else{
        //     for(int i=1;i<nums.length;i++){
        //         if(nums[i-1]!=nums[i]){
        //             result=nums[i-1];
        //             break;
        //         }else{
        //             i++;
        //         }
        //         result=nums[nums.length-1];
        //     }
        // }
        // return result;


        //异或，两数相同为0，0和异或为x
        // for(int i=0;i<nums.length;i++){
        //     result=result^nums[i];
        // }
        // return result;

        //二分
        int l=0;
        int r=nums.length-1;
        int m=(l+r)/2;
        while(l<r){
            //左侧偶数个
            if(m%2==0){
                //若左侧全部是有序数对，单个数字在右侧
                if(nums[m]==nums[m+1]){
                    l=m+1;
                }else{
                    r=m;
                }
            }else{
                //左侧奇数个数字，单个数字在左
                if(nums[m]==nums[m+1]){
                    r=m;
                }else{
                    l=m+1;
                }
            }
            m=(l+r)/2;
        }
        return nums[m];
    }
}
// @lc code=end

