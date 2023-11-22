package array;

import java.util.Arrays;
import java.util.Scanner;

public class sumsec {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int even[]=new int[n];
        int odd[]=new int[n];
        for(int i=0;i<n;i++){
            if(i%2==0){
                even[i]=arr[i];
            }
            else{
                odd[i]=arr[i];
            }
        }
        Arrays.sort(even);
        Arrays.sort(odd);

        System.out.print(even[n-2]+odd[n-2]);
    }
}
