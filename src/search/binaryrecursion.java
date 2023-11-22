package search;

import java.util.Arrays;
import java.util.Scanner;

public class binaryrecursion {
    public int bisearch(int a[],int x,int l,int r){
        if(l>r)
            return -1;
        else{
            int m=(l+r)/2;
            if(x==a[m])
                return m;
            else if(x<a[m])
                return bisearch(a,x,l,m-1);
            else if(x>a[m])
                return bisearch(a,x,m+1,r);
        }
        return -1;
    }
    public static void main(String args[]) {
        binaryrecursion l = new binaryrecursion();
        //int a[]={1,2,3,4,};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);//sort the array
        int found = l.bisearch(a, x, 0,n-1);
        System.out.println("result:" + found);
    }
}
