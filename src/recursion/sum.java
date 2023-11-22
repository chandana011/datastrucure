package recursion;
import java.util.Scanner;
public class sum {

    public static int sumn(int n){
        return (n*(n+1))/2;
    }

    public int sumiteration(int n){
        int total=0;
        int i=1;
        while(i<=n){
            total=total+i;
            i=i+1;
        }
        return total;
    }

    public int sumrecursion(int n){
        if (n == 0) {
            return 0;
        }
        return sumrecursion(n-1)+n;
    }

    public static void main(String args[]){
        sum s=new sum();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        System.out.println(sum.sumn(n));
        System.out.println(s.sumiteration(n));
        System.out.println(s.sumrecursion(n));
    }
}
