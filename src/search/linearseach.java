package search;

import java.util.Scanner;

public class linearseach {
    public int linear(int a[],int n,int x){
        int index=0;
        while(index<n){
            if(a[index]==x){
                return index;
            }
            index++;
        }
        return -1;
    }
    public static void main(String args[]){
        linearseach l=new linearseach();
        //int a[]={1,2,3,4,};
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int found=l.linear(a,n,x);
        System.out.println(found);
    }
}
