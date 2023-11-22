package recursion;
import java.util.Scanner;
public class fact {

    public int factiteration(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
    public int factrecursive(int n){
        if(n==0){
            return 1;
        }
        return factrecursive(n-1)*n;
    }
    public static void main(String args[]){
        fact f=new fact();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(f.factiteration(n));
        System.out.println(f.factrecursive(n));
    }
}
