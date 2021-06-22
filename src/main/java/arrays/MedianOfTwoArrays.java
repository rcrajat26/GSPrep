package arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MedianOfTwoArrays {

    public static void main(String[] args) throws FileNotFoundException {
        File input = new File("C:\\Users\\Rajat_Chikkodikar\\Desktop\\My files\\Projects\\GSIncubation\\src\\main\\java\\arrays\\_scratch");
        Scanner sc = new Scanner(input);

        int nA = sc.nextInt();
        int[] A = new int[nA];
        for(int i=0;i<nA;i++) {
            A[i]=sc.nextInt();
        }
        int nB = sc.nextInt();
        int[] B = new int[nB];
        for(int i=0;i<nB;i++) {
            B[i]=sc.nextInt();
        }

        System.out.println(median(A,B));
    }

    private static double median(int[] a, int[] b) {
        int tot = a.length+b.length;
        int size = (tot/2)+1;
        int[] arr = new int[size];

        int i=0,j=0,k=0;
        while(i<a.length&&j<b.length) {
            if(a[i]<=b[j]) {
                arr[k]=a[i++];
                k++;
            }
            else {
                arr[k]=b[j++];
                k++;
            }
        }

        while(i<a.length&&k<size-1) {
            arr[k]=a[i++];
            k++;
        }
        while(j<b.length&&k<size-1) {
            arr[k]=a[j++];
            k++;
        }

        if(size%2 == 0) {
            return arr[size-1];
        }
        else {
            return (arr[size-2]+arr[size-1])/2.0;
        }
    }
}
