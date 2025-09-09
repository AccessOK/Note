/**
 * @nc app=nowcoder id=a561ad77e7bb45679db2bd7317fded84 topic=372 question=10979357 lang=Java
 * 2025-04-20 18:26:38
 * https://www.nowcoder.com/practice/a561ad77e7bb45679db2bd7317fded84?tpId=372&tqId=10979357
 * [PIO5] 多组_A+B_零尾模式
 */

/** @nc code=start */

import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a,b;
        while(true){
            a = in.nextInt();
            b= in.nextInt();
            if(a==0&&b==0){
                break;
            }
            System.out.println(a+b);
        }
    }
}

/** @nc code=end */
