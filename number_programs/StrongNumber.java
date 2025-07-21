public class StrongNumber {

    public static void main(String[] args) {

        System.out.println("Checking Strong Numbers between 1 to 100:");

        for(int i = 1; i <= 100; i++) {
            int num = i;
            int temp = num;
            int sum = 0;

            while(num > 0){
                int rem = num % 10;
                sum += factorial(rem);
                num /= 10;
            }

            if(temp == sum){
                System.out.println(temp + " is a Strong Number");
            } else {
                System.out.println(temp + " is NOT a Strong Number");
            }
        }
    }

    public static int factorial(int num) {
        int factorial = 1;
        for(int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
