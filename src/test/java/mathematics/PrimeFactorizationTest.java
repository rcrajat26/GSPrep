package mathematics;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PrimeFactorizationTest {

    @Test
    void bigPrime() {

        Integer[] exp = {97};
        PrimeFactorization.setUpPrimes();

        List<Integer> expected = Arrays.asList(exp);
        List<Integer> actual = PrimeFactorization.primeFac(97);

        assertEquals(expected,actual);
    }
    @Test
    void multiFactorNum() {
        Integer[] exp = {2,7,7};
        PrimeFactorization.setUpPrimes();

        List<Integer> expected = Arrays.asList(exp);
        List<Integer> actual = PrimeFactorization.primeFac(98);

        assertEquals(expected,actual);
    }

}