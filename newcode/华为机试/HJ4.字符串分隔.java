/**
 * @nc app=nowcoder id=d9162298cb5a437aad722fccccaae8a7 topic=37 question=21227 lang=Java
 * 2025-05-25 22:16:25
 * https://www.nowcoder.com/practice/d9162298cb5a437aad722fccccaae8a7?tpId=37&tqId=21227
 * [HJ4] 字符串分隔
 */

/** @nc code=start */

import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String line=in.nextLine();
        int count=line.length()/8;
        StringBuilder tmpString=new StringBuilder(8);
        for(int i=0;i<count;i++){
            tmpString.delete(0,8);
            tmpString.append(line.substring(i*8, i*8+8));
            System.out.println(tmpString);
        }
        if(line.length()%8!=0){
            tmpString.delete(0,8);
            tmpString.append(line.substring(count*8,line.length()));
            for(int i=line.length()%8;i<8;i++){
                tmpString.append("0");
            }
            System.out.println(tmpString);
        }
    }
}

/** @nc code=end */
