/**
 * @nc app=nowcoder id=a35ce98431874e3a820dbe4b2d0508b1 topic=37 question=21225 lang=Java
 * 2025-04-24 00:01:39
 * https://www.nowcoder.com/practice/a35ce98431874e3a820dbe4b2d0508b1?tpId=37&tqId=21225
 * [HJ2] 计算某字符出现次数
 */

/** @nc code=start */

import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String line1=scanner.nextLine();
        String line2=scanner.nextLine();
        char cha=line2.charAt(0);
        char cha1=cha;
        char[] chars=line1.toCharArray();
        if(cha>='A'&&cha<='Z'){
            cha1=Character.toLowerCase(cha);
        }else if(cha>='a'&&cha<='z'){
            cha1=Character.toUpperCase(cha);
        }
        int result=0;
        for(char tmp:chars){
            if(tmp==cha||tmp==cha1){
                result++;
            }
        }
        System.out.println(result);
    }
}

/** @nc code=end */
