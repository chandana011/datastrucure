package sorting_udemy;

import java.util.Scanner;

public class selection {
    public void selectionsort(int a[],int n){
        for(int i=0;i<n-1;i++){
            int position=i;
            for(int j=i+1;j<n;j++)
                if(a[j]<a[position])
                    position=j;
            int temp=a[i];
            a[i]=a[position];
            a[position]=temp;
        }

    }
    public void display(int a[],int n){
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
            System.out.println();
        }
    }

    public static void main(String args[]){
        selection s=new selection();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("original array:");
        s.display(a,n);
        s.selectionsort(a,n);
        System.out.print("after selection sort");
        s.display(a,n);
    }
}
