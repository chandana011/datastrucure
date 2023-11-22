package array;

import java.util.ArrayList;

public class subsequence {

    static void fun(int ind,ArrayList<Integer> list,int arr[],int n){
        if(ind==n){
            for(int i:list){
                System.out.print(i);
            }
            System.out.println();
            return;
        }

        list.add(arr[ind]);
        fun(ind+1,list,arr,n);
        list.remove(arr[ind]);

        fun(ind+1,list,arr,n);
    }

    public static void main(String[] args) {
        int arr[]={3,1,2};
        int n=3;
        ArrayList<Integer> list=new ArrayList<>();
        fun(0,list,arr,n);
    }
}
