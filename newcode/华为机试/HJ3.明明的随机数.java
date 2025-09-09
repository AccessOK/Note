/**
 * @nc app=nowcoder id=3245215fffb84b7b81285493eae92ff0 topic=37 question=21226 lang=Java
 * 2025-05-05 13:40:50
 * https://www.nowcoder.com/practice/3245215fffb84b7b81285493eae92ff0?tpId=37&tqId=21226
 * [HJ3] 明明的随机数
 */

/** @nc code=start */

import java.util.Arrays;
import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=Integer.parseInt(scanner.nextLine());
        }
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            if(i==0||i>0&&nums[i]!=nums[i-1]){
                System.out.println(nums[i]);
            }
        }
    }
}

/** @nc code=end */
