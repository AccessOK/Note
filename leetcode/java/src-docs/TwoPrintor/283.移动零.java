/*
 * @lc app=leetcode.cn id=283 lang=java
 *
 * [283] 移动零
 *
 * https://leetcode.cn/problems/move-zeroes/description/
 *
 * algorithms
 * Easy (64.01%)
 * Likes:    2662
 * Dislikes: 0
 * Total Accepted:    1.8M
 * Total Submissions: 2.9M
 * Testcase Example:  '[0,1,0,3,12]'
 *
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * 
 * 请注意 ，必须在不复制数组的情况下原地对数组进行操作。
 * 
 * 
 * 
 * 示例 1:
 * 
 * 
 * 输入: nums = [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 * 
 * 
 * 示例 2:
 * 
 * 
 * 输入: nums = [0]
 * 输出: [0]
 * 
 * 
 * 
 * 提示:
 * 
 * 
 * 
 * 1 <= nums.length <= 10^4
 * -2^31 <= nums[i] <= 2^31 - 1
 * 
 * 
 * 
 * 
 * 进阶：你能尽量减少完成的操作次数吗？
 * 
 */

// @lc code=start
class Solution {
    public void moveZeroes(int[] nums) {
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==0){
        //         for(int j=i+1;j<nums.length;j++){
        //             if(nums[j]!=0){
        //                 nums[i]=nums[j];
        //                 nums[j]=0;
        //                 break;
        //             }
        //         }
        //     }
        // }

        //双指针表示
        int left=0,right=0;
        while(right<nums.length){
            if(nums[right]!=0){
                if(right!=left){
                    int tmp=nums[left];
                    nums[left]=nums[right];
                    nums[right]=tmp;
                }
                left++;
            }
            right++;
        }
    }
}
// @lc code=end

