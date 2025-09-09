import java.util.Scanner;
public class Main {
    private static int replace(char ch){
        if(ch<'9'&&ch>'0'){
            return ch-'0';
        }else{
            return ch-'A';
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        char[] line=in.nextLine().toCharArray();
        int count=line.length;
        for(int i=2;i<count;i++){
            int num=replace(line[i]);
            System.out.println(num);
        }
    }

}   