package sort;

//time complexity=O(n^2)
import java.util.*;
public class bubble {
    public  static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int size= sc.nextInt();

        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        //bubble sort
        for(int i=0;i<size-1;i++){  //outer loop -counter
            for(int j=0;j<size-i-1;j++){        //inner loop
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        //print
        for(int i=0;i<size;i++){
            System.out.print(arr[i]);
        }

    }

}
