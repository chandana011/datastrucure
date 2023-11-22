package array;

import java.util.Scanner;

public class reverse {
    //using 2 points recursion
    static void f(int l,int r,int arr[]){
        if(l>=r){
            return;
        }
        int temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;

        f(l+1,r-1,arr);

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        f(0,n-1,arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
