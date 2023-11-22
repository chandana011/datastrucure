package array;
import java.util.*;
public class setbit {
    public static void main(String[] args) {
        int decimalNumber = 8; // Change this to the number you want to convert
        String binary = Integer.toBinaryString(decimalNumber);
        System.out.println("Decimal: " + decimalNumber);
        System.out.println("Binary: " + binary);
    }
}

//public class setbit {
//    public static void main(String[] args) {
//        String binaryString = "101010"; // Replace with your binary string
//
//        // Use Integer.parseInt() with base 2 to convert to integer
//        int decimalNumber = Integer.parseInt(binaryString, 8);
//
//        System.out.println("Binary: " + binaryString);
//        System.out.println("Decimal: " + decimalNumber);
//    }
//}
