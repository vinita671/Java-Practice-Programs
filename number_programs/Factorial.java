public class Factorial {
    public static void main(String[] args) {

        System.out.println("Factorial of 5 is:" + factorial(5));
         System.out.println("Factorial of 5 is:" + factorial(7));
          System.out.println("Factorial of 5 is:" + factorial(4));
    }
    
public static int factorial(int num) {
    int factorial=1;
    for (int i = 1; i <=num; i++) {
        factorial*=i;
    }
    return  factorial;
}

}
/*
 * 
 * 
 * 
 * 
*/