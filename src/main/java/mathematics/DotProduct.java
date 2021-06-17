package mathematics;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DotProduct {

    public static void main(String[] args) throws FileNotFoundException {

        File input = new File("C:\\Users\\Rajat_Chikkodikar\\Desktop\\My files\\Projects\\GSIncubation\\src\\main\\java\\mathematics\\scratch.txt");
        Scanner sc = new Scanner(input);

        int arrSize = sc.nextInt();

        int[] arr1 = new int[arrSize];
        int[] arr2 = new int[arrSize];

        for(int i=0;i<arrSize;i++) {
            arr1[i] = sc.nextInt();
        }

        for(int i=0;i<arrSize;i++) {
            arr2[i] = sc.nextInt();
        }

        long res = dotProduct(arr1,arr2);

        System.out.println("Dot product: "+res);
    }

    static long dotProduct(int[] arr1, int[] arr2) {

        long dotProd=0;
        for(int i=0;i< arr1.length;i++) {
            dotProd += arr1[i]*arr2[i];
        }
        return dotProd;
    }
}
