package recursion;
import java.net.StandardSocketOptions;
import java.util.*;
public class printnum {
    public static void printsum(int n){

        if(n==0){
            return;
        }
        System.out.println(n);
        printsum(n-1);
    }


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        printsum(n);

    }


}
