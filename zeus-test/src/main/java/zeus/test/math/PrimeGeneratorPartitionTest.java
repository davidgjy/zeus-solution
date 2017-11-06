package zeus.test.math;

import zeus.math.PrimeGeneratorPartitionThread;

import java.util.Scanner;

/**
 * Created by KG on 2017/6/26.
 */

public class PrimeGeneratorPartitionTest {
    public static void main(String[] args) {

        System.out.println("Please input upper number to calculate primes: ");
        Scanner sc = new Scanner(System.in);
        int upperNumber = sc.nextInt();

        int threadNum = 50;
        int avgNum = upperNumber / threadNum;

        int low = 2;
        int up = avgNum;
        for (int i = 1; i <=threadNum; i++) {
            // Launch the prime numbers generator
            Thread task = new PrimeGeneratorPartitionThread(low, up);
            task.start();

            low = avgNum * i + 1;
            up = avgNum  * (i + 1);
            if (i == threadNum - 1) { up = upperNumber; }
        }
    }
}

