package array;

import java.util.Scanner;
public class linear_search {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element to be search:");
        int x=sc.nextInt();

        for(int i=0;i<size;i++){
            if(arr[i]==x){
                System.out.println(i);
            }
        }
    }
}
