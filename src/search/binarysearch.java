package search;

import java.util.*;

public class binarysearch {
     public int bisearch(int a[],int n,int x){
         int l=0;
         int r=n-1;
         while(l<=r){
             int mid=(l+r)/2;
             if(x==a[mid])
                 return mid;
             else if(x<a[mid])
                 r=mid-1;
             else if(x>a[mid])
                 l=mid+1;
         }
         return -1;
     }

    public static void main(String args[]) {
        binarysearch l = new binarysearch();
        //int a[]={1,2,3,4,};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);//sort the array
        int found = l.bisearch(a, n, x);
        System.out.println("result:"+found);
    }
}
