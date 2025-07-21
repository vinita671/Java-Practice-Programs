public class AutomorphicNumber {

    public static void main(String[] args) {

       

        for (int j = 1; j <= 100; j++) {
            if (isAutomorphic(j)) {
                System.out.println(j+"is an automorphic number");
            }
        }
    }

    public static boolean isAutomorphic(int num){
        int sqr = num * num;

        while(num > 0){
            int rem = num % 10;
            int sqrRem = sqr % 10;

            if(rem != sqrRem){
                return false;
            }

            num /= 10;
            sqr /= 10;
        }
        return true;
    }
}
/*
 * an  automorphic number is a number whose square ends with the 
 * same digits as the number itself.
 * For example, 5 is an automorphic number becouse 5^2 = 35
 * 25 is an automorphic number becouse 
*/