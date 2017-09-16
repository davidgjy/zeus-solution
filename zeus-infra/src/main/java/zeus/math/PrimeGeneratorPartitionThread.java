package zeus.math;

/**
 * Created by KG on 2017/6/26.
 */

public class PrimeGeneratorPartitionThread extends Thread {

    private int lowerNumber;
    private int upperNumber;

    public PrimeGeneratorPartitionThread(int lowerNumber, int upperNumber) {
        this.lowerNumber = lowerNumber;
        this.upperNumber = upperNumber;
    }

    /**
     * Central method of the class
     */
    @Override
    public void run() {
        long number = lowerNumber;

        // This bucle never ends... until is interrupted
        while (number <= upperNumber) {
            if (isPrime(number)) {
                System.out.printf("Number %d is Prime \n", number);
            }

            // When is interrupted, write a message and ends
            if (isInterrupted()) {
                System.out.printf("The Prime Generator has been Interrupted \n");
                return;
            }
            number++;
        }
    }

    /**
     * Method that calculate if a number is prime or not
     *
     * @param number : The number
     * @return A boolean value. True if the number is prime, false if not.
     */
    private boolean isPrime(long number) {
        if (number <= 2) {
            return true;
        }
        for (long i = 2; i < number; i++) {
            if ((number % i) == 0) {
                return false;
            }
        }
        return true;
    }

}
