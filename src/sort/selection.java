package sort;
//time complexity=O(n^2)
import java.util.Scanner;
public class selection {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int size= sc.nextInt();

        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        //selection
        for(int i=0;i<size-1;i++){
            int smallest=i;
            for(int j=i+1;j<size;j++){
                if(arr[smallest]>arr[j]){
                    smallest=j;
                }
            }
            //swap
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }

        //print
        for(int i=0;i<size;i++){
            System.out.print(arr[i]);
        }
    }
}
