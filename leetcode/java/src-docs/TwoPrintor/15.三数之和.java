
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=15 lang=java
 *
 * [15] 三数之和
 *
 * https://leetcode.cn/problems/3sum/description/
 *
 * algorithms
 * Medium (39.31%)
 * Likes:    7567
 * Dislikes: 0
 * Total Accepted:    2.4M
 * Total Submissions: 6.1M
 * Testcase Example:  '[-1,0,1,2,-1,-4]'
 *
 * 给你一个整数数组 nums ，判断是否存在三元组 [nums[i], nums[j], nums[k]] 满足 i != j、i != k 且 j !=
 * k ，同时还满足 nums[i] + nums[j] + nums[k] == 0 。请你返回所有和为 0 且不重复的三元组。
 * 
 * 注意：答案中不可以包含重复的三元组。
 * 
 * 
 * 
 * 
 * 
 * 示例 1：
 * 
 * 
 * 输入：nums = [-1,0,1,2,-1,-4]
 * 输出：[[-1,-1,2],[-1,0,1]]
 * 解释：
 * nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0 。
 * nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0 。
 * nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0 。
 * 不同的三元组是 [-1,0,1] 和 [-1,-1,2] 。
 * 注意，输出的顺序和三元组的顺序并不重要。
 * 
 * 
 * 示例 2：
 * 
 * 
 * 输入：nums = [0,1,1]
 * 输出：[]
 * 解释：唯一可能的三元组和不为 0 。
 * 
 * 
 * 示例 3：
 * 
 * 
 * 输入：nums = [0,0,0]
 * 输出：[[0,0,0]]
 * 解释：唯一可能的三元组和为 0 。
 * 
 * 
 * 
 * 
 * 提示：
 * 
 * 
 * 3 <= nums.length <= 3000
 * -10^5 <= nums[i] <= 10^5
 * 
 * 
 */

// @lc code=start
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //数组排序
        Arrays.sort(nums);
        //存储结果
        List<List<Integer>> tmpResult=new ArrayList<>();
        Map<String,List<Integer>> map=new HashMap<>();
        //特殊数据处理
        if(nums.length<3||nums[0]>nums[nums.length-1]||nums[0]>0||nums[nums.length-1]<0){
            return tmpResult;
        }
        ///a<=0 c>=0
        if(nums[0]==nums[nums.length-1]&&nums[0]!=0){
            return tmpResult;
        }        
        if(nums[0]==nums[nums.length-1]&&nums[0]==0){
            List<Integer> e=new ArrayList<>();
            e.add(0);
            e.add(0);
            e.add(0);
            tmpResult.add(e);
            return tmpResult;
        }
        //a<=b<=c
        //遍历最小的数，a<0
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=0){
                if(i!=0&&nums[i]==nums[i-1])continue;
                //遍历最大的数,c>0
                for(int j=nums.length-1;j>i+1;j--){
                    if(nums[j]>=0){
                        if(j!=nums.length-1&&nums[j]==nums[j+1])continue;
                        //寻找目标值 target=0-a-c,
                        int target=0-nums[i]-nums[j];
                        //优化target查询
                        if(target<nums[i])continue;
                        if(target>nums[j])continue;
                        if(findTarget(nums, target, i+1, j-1)){
                            List<Integer> e=new ArrayList<>();
                            e.add(nums[i]);
                            e.add(target);
                            e.add(nums[j]);
                            map.put(e.toString(), e);
                        }
                    }else{
                        break;
                    }
                }
            }else{
                break;
            }
        }
        //result 去重
        if(!map.isEmpty()){
            List<List<Integer>> result=new ArrayList<>();
            for(String str:map.keySet()){
                result.add(map.get(str));
            }
            return result;
        }else{
            return tmpResult;
        }
    }

    public static boolean  findTarget(int[] nums,int target,int left,int right){
        for(int i=left;i<=right;i++){
            if(nums[i]==target){
                return true;
            }
        }
        return false;
    }
}
// @lc code=end

