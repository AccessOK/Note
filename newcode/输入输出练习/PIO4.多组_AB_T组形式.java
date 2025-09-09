/**
 * @nc app=nowcoder id=cc937d32225340469bfb60a0797bad77 topic=372 question=10979356 lang=Java
 * 2025-04-20 18:24:50
 * https://www.nowcoder.com/practice/cc937d32225340469bfb60a0797bad77?tpId=372&tqId=10979356
 * [PIO4] 多组_A+B_T组形式
 */

/** @nc code=start */

import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(int i=0;i<n;i++){
            int a = in.nextInt();
            int b= in.nextInt();
            System.out.println(a+b);
        }
    }
}

/** @nc code=end */
