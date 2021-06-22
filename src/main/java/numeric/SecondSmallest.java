package numeric;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SecondSmallest {

    public static void main(String[] args) throws FileNotFoundException {
        File input = new File("C:\\Users\\Rajat_Chikkodikar\\Desktop\\My files\\Projects\\GSIncubation\\src\\main\\java\\numeric\\_scratch");
        Scanner sc = new Scanner(input);

        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i=0;i<size;i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(secSmallest(arr));
    }

    private static int secSmallest(int[] arr) {

        sortK(arr,0,arr.length-1);
        return arr[1];
    }

    private static void sortK(int[] arr, int l, int r) {
        if(l<r) {
            int mp = sort(arr,l,r);
            if(mp == 1) {
                return;
            }
            sortK(arr,l,mp-1);
            sortK(arr,mp+1,r);
        }

    }

    private static int sort(int[] arr, int l, int r) {
        int pivot = r;
        int i=l-1,j=l;

        while(j<r) {
            if(arr[pivot]>arr[j]) {
                int tmp = arr[j];
                arr[j] = arr[i+1];
                arr[i+1] = tmp;
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
