package hashing;

import java.util.Iterator;
import java.util.Scanner;
import  java.util.HashSet;
public class basic {
    public static void main(String[] args) {
       /* Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        while(x-->0){
            int num=sc.nextInt();
        }*/

        HashSet<Integer> set =new HashSet<>();
        //insert
       // set.add(1);

        /* Search--contains
        if(set.contains(1)){
        print("yes it contains 1");
        }

        if(!set.contains(1)){
        print("doesn't exist");
        }
        
         */

        /*
        to delete
        set.remove(1)
         */

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(6);
        set.add(5);
        set.add(4);
        set.add(4);

        Iterator it= set.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }



    }
}
