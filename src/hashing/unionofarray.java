package hashing;
import java.util.*;
public class unionofarray {
    public static void union(int a1[],int a2[]){
        int n1=a1.length;
        int n2=a2.length;
        HashSet<Integer> set=new HashSet<>();

        for(int i=0;i<n1;i++){
            set.add(a1[i]);
        }
        for(int i=0;i<n2;i++){
            set.add(a2[i]);
        }

        System.out.println(set.size());
        System.out.print(set+" ");
    }
    public static void main(String[] args) {
        int a1[]={7,3,9};
        int a2[]={6,3,9,2,9,4};
        union(a1,a2);
    }

}
