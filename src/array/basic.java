package array;

import java.util.Scanner;

public class basic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Array elements entered by the user:");
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
        //reverse
        System.out.println("After reverse:");
        for(int i=array.length-1;i>=0;i--){
            System.out.println(array[i]);
        }

        scanner.close();
    }
}