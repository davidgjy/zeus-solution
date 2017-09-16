package zeus.test.math;

import zeus.math.PrimeGenerator;

import java.util.Scanner;

/**
 * Created by KG on 2017/6/26.
 */

public class PrimeGeneratorNormalTest {
    public static void main(String[] args) {

        System.out.println("Please input upper number to calculate primes: ");
        Scanner sc = new Scanner(System.in);
        int upperNumber = sc.nextInt();

        // Launch the prime numbers generator
        PrimeGenerator pg = new PrimeGenerator(upperNumber);
        pg.run();
    }
}
