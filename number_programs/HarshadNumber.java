public class HarshadNumber {

    public static void main(String[] args) {
       
        int num = 12;
        int temp=num;
        int sum = 0;

        while(num > 0){
            int rem = num % 10;
            sum += rem;
            num/= 10;
        }
       if(temp%sum == 0){
            System.out.println(sum + " is a Harshad Number.");
        } else {
            System.out.println(sum + " is NOT a Harshad Number.");
        }
    }
}
