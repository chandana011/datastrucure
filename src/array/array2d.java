package array;

import java.util.*;
public class array2d {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();

        int array[][]=new int[row][col];

        for(int i=0;i<row;i++){
            for( int j=0;j<col;j++){
                array[i][j]= sc.nextInt();
            }
        }
        // transpose of the array
        for(int j=0;j<col;j++){
            for( int i=0;i<row;i++){
                System.out.print(array[i][j]);
            }
            System.out.println(" ");
        }

    }
}
