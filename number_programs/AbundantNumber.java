public class AbundantNumber {
    public static void main(String[] args) {
        int num = 12; // you can change number here
        int sum = 0;

        // Find sum of divisors
        for(int i = 1; i <= num / 2; i++) {
            if(num % i == 0) {
                sum += i;
            }
        }

        // Check if Abundant
        if(sum > num) {
            System.out.println(num + " is an Abundant Number.");
        } else {
            System.out.println(num + " is Not an Abundant Number.");
        }
    }
}
