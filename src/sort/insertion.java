package sort;
//time complexity=O(n^2)
import java.util.*;
public class insertion {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();

        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        //insertion

        for(int i=0;i<size;i++){
            int current=arr[i];
            int j=i-1;
            while (j>=0 && current<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }

            //placement
            arr[j+1]=current;
        }
        //print
        for(int i=0;i<size;i++){
            System.out.print(arr[i]);
        }

    }
}
