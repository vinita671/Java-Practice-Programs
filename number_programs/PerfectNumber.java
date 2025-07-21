public class PerfectNumber {
    
    public static void main(String[] args) {
        

      for (int j = 1; j<=100; j++) {
        int num=j;
        int sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0)
            sum+=i;
        }
          if(sum==num) 
          System.out.println(sum+"is a perfect number") ;
             }

           
        }
    }

/**
 * Perfect Number Program
 * A profect number is a positive integer that is equal
 * to the sum of its proper divisors(excluding)
 * 
 * 
 * 
*/