package hashing;

import java.util.HashSet;

public class intersectionofarray {
    public static void intersection(int a1[],int a2[]){
        int n1=a1.length;
        int n2=a2.length;

        HashSet<Integer> set=new HashSet<>();

        for(int i=0;i<n1;i++){
            set.add(a1[i]);
        }
        int count=0;
        for(int i=0;i<n2;i++){
            if(set.contains(a2[i])){
                count++;
                System.out.println(a2[i]);

                set.remove(a2[i]);

            }
        }
        System.out.println();
        System.out.println(count);

    }
    public static void main(String[] args) {
        int a1[]={7,3,9};
        int a2[]={6,3,9,2,9,4};
        intersection(a1,a2);
    }
}
