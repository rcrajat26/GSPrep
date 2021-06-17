package mathematics;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AddFraction {
    /*
    INPUT:
    fraction1 - [2, 3];
    fraction2 - [1, 2];
    OUTPUT: Hint-  {2/3 +1/2}
    result = [7,6]
     */

    public static void main(String[] args) throws FileNotFoundException {
        File input = new File("C:\\Users\\Rajat_Chikkodikar\\Desktop\\My files\\Projects\\GSIncubation\\src\\main\\java\\mathematics\\scratch.txt");
        Scanner sc = new Scanner(input);
        int[] num1 = new int[2];
        int[] num2 = new int[2];
        num1[0] = sc.nextInt();
        num1[1] = sc.nextInt();
        if(num1[1] == 0){
            System.out.println("Invalid input");
            return;
        }
        num2[0] = sc.nextInt();
        num2[1] = sc.nextInt();
        if(num2[1] == 0){
            System.out.println("Invalid input");
            return;
        }

        int[] res;
        res = sumOfFractions(num1,num2);

        System.out.println("[ "+res[0]+" , "+res[1]+" ]");
    }
    static int[] sumOfFractions(int[] num1, int[] num2) {

        int res[] = new int[2];
        res[1] = lcm(num1[1],num2[1]);
        res[0] = num1[0]*(res[1]/num1[1])+num2[0]*(res[1]/num2[1]);

        return res;
    }

    private static int lcm(int a, int b) {
        int max,step,lcm=1;
        if(a > b){
            max = step = a;
        }
        else{
            max = step = b;
        }

        while(a!= 0) {
            if(max % a == 0 && max % b == 0) {
                lcm = max;
                break;
            }
            max += step;
        }
        return lcm;
    }
}
