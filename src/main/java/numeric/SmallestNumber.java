package numeric;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) throws FileNotFoundException {
        File input = new File("C:\\Users\\Rajat_Chikkodikar\\Desktop\\My files\\Projects\\GSIncubation\\src\\main\\java\\numeric\\_scratch");
        Scanner sc = new Scanner(input);

        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i=0;i<size;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Smallest number is: "+smallest(arr));
    }

    private static int smallest(int[] arr) {

        int smallest = Integer.MAX_VALUE;
        sortK(arr,0,arr.length-1);
        return arr[0];
    }
    static void sortK(int[] arr,int l, int r) {

        if(l<r) {
            int mp = sort(arr, l, r);
            sortK(arr, l, mp - 1);
            sortK(arr, mp + 1, r);
        }
    }

    private static int sort(int[] arr, int l, int r) {
        if(arr.length==1) {
            return 0;
        }

        int pivot = r;
        int i=l-1,j=l;



        while (j<=r-1) {
            if(arr[j]<arr[pivot]) {
                int tmp = arr[i+1];
                arr[i+1] = arr[j];
                arr[j] = tmp;
                i++;
            }
            j++;
        }
        int tmp = arr[pivot];
        arr[pivot] = arr[i+1];
        arr[i+1] = tmp;
        return i+1;

    }
}
