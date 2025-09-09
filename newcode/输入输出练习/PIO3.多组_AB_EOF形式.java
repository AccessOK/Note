/**
 * @nc app=nowcoder id=295063bf1bce4c2e819a8f18a5efcd20 topic=372 question=10979354 lang=Java
 * 2025-04-20 18:17:06
 * https://www.nowcoder.com/practice/295063bf1bce4c2e819a8f18a5efcd20?tpId=372&tqId=10979354
 * [PIO3] 多组_A+B_EOF形式
 */

/** @nc code=start */

import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            int a=in.nextInt();
            int b=in.nextInt();
            System.out.println(a+b);
        }
    }
}

/** @nc code=end */
