package recursion;
import java.util.Scanner;
public class printsum {

    public static void sum(int i,int n,int sum){
        //i=starting number
        //n=last number
        //sum=print sum if all numbers between i and n,
        if(i>n){
            //sum=sum+i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        sum(i+1,n,sum);

    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        int n=sc.nextInt();
        int sum=0;
        sum(i,n,sum);
    }
}
