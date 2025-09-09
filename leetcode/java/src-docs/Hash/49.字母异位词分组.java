
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=49 lang=java
 *
 * [49] 字母异位词分组
 *
 * https://leetcode.cn/problems/group-anagrams/description/
 *
 * algorithms
 * Medium (69.81%)
 * Likes:    2293
 * Dislikes: 0
 * Total Accepted:    1.1M
 * Total Submissions: 1.6M
 * Testcase Example:  '["eat","tea","tan","ate","nat","bat"]'
 *
 * 给你一个字符串数组，请你将 字母异位词 组合在一起。可以按任意顺序返回结果列表。
 * 
 * 字母异位词 是由重新排列源单词的所有字母得到的一个新单词。
 * 
 * 
 * 
 * 示例 1:
 * 
 * 
 * 输入: strs = ["eat", "tea", "tan", "ate", "nat", "bat"]
 * 输出: [["bat"],["nat","tan"],["ate","eat","tea"]]
 * 
 * 示例 2:
 * 
 * 
 * 输入: strs = [""]
 * 输出: [[""]]
 * 
 * 
 * 示例 3:
 * 
 * 
 * 输入: strs = ["a"]
 * 输出: [["a"]]
 * 
 * 
 * 
 * 提示：
 * 
 * 
 * 1 <= strs.length <= 10^4
 * 0 <= strs[i].length <= 100
 * strs[i] 仅包含小写字母
 * 
 * 
 */

// @lc code=start
class Solution {
public  List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new HashMap<>();
        for(String str:strs){
            String key=DiString(str);
            List<String> list;
            if(map.containsKey(key)){
                //获取现存列表
                list=map.get(key);
            }else{
                //不存在则添加
                list=new ArrayList<>();
            }
            list.add(str);
            map.put(key, list);
        }
        //处理map数据
        List<List<String>> result=new ArrayList<>();
        for(String key:map.keySet()){
            result.add(map.get(key));
        }
        return result;
    }
    //返回按字典序排序之后的字符串
    public static String DiString(String string){
        char[] chars=string.toCharArray();
        Arrays.sort(chars);
        return String.valueOf(chars);
    }
}
// @lc code=end

