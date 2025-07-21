public class Prime {
    public static void main(String[] args) {

        int position = 15; // Find the 15th prime number
        int count = 0;

        for (int i = 2; i <= 1000; i++) { // Start from 2 because 1 is not a prime number
            if (isPrime(i)) {
                count++;
                if (count == position) {
                    System.out.println("The " + position + "th prime number is: " + i);
                    break;
                }
            }
        }

    }

    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
