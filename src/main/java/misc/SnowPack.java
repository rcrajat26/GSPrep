package misc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SnowPack {

    public static void main(String[] args) throws FileNotFoundException {

        File input = new File("C:\\Users\\Rajat_Chikkodikar\\Desktop\\My files\\Projects\\GSIncubation\\src\\main\\java\\misc\\_scratch");
        Scanner sc = new Scanner(input);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println(snow(arr));
    }
    static int snow(int[] arr)
    {
        int n = arr.length;
        int left[] = new int[n];
        int right[] = new int[n];

        int snow = 0;

        left[0] = arr[0];
        for (int i = 1; i < n; i++)
            left[i] = Math.max(left[i - 1], arr[i]);

        right[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--)
            right[i] = Math.max(right[i + 1], arr[i]);

        for (int i = 0; i < n; i++)
            snow += Math.min(left[i], right[i]) - arr[i];

        return snow;
    }
}
