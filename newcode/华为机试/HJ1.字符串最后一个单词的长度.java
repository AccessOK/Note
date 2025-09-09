/**
 * @nc app=nowcoder id=8c949ea5f36f422594b306a2300315da topic=37 question=21224 lang=Java
 * 2025-04-20 00:12:08
 * https://www.nowcoder.com/practice/8c949ea5f36f422594b306a2300315da?tpId=37&tqId=21224
 * [HJ1] 字符串最后一个单词的长度
 */

/** @nc code=start */

import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String input = in.nextLine();
        String[] result=input.split(" ");
        int length=result.length;
        String last=result[length-1];
        System.out.println(last.length());
    }
}

/** @nc code=end */
