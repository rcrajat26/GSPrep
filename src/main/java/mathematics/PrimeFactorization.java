package mathematics;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class PrimeFactorization {

    static List<Integer> primes = new LinkedList<>();

    public static void main(String[] args) throws FileNotFoundException {

        File input = new File("C:\\Users\\Rajat_Chikkodikar\\Desktop\\My files\\Projects\\GSIncubation\\src\\main\\java\\mathematics\\_scratch.txt");
        Scanner sc = new Scanner(input);

        double num = sc.nextDouble();
        setUpPrimes();

        List<Integer> res = primeFac(num);
        System.out.println(res);
    }

    public static List<Integer> primeFac(double num) {
        List<Integer> factors = new ArrayList<>();

        int i=0,prime=1;
        double temp = num;

        while (temp!=1) {
            try {
                prime = primes.get(i);
            } catch (IndexOutOfBoundsException e) {
                boolean isPrime=true;
                for(int j=primes.get(i-1)+1;j<=num;j++) {
                    for(int k=2;k*k<=j;k++) {
                        if(j%k == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                    if(isPrime) {
                        primes.add(j);
                        break;
                    }
                    isPrime=true;
                }
                prime = primes.get(i);
            } catch (Exception e) {
                System.out.println("Error!");
            }
            while(temp % prime == 0) {
                temp/=prime;
                factors.add(prime);
            }
            i++;
        }
        return factors;
    }

    public static void setUpPrimes() {
        primes.add(2);
        primes.add(3);
        primes.add(5);
        primes.add(7);
        primes.add(11);
    }
}
