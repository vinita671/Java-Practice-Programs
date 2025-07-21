public class PrintDigit {
    public static void main(String[] args) {
        int n=1234;
        int sum=0;
        int product=1;


        while(n>0){
            int rem=n%10;
            sum=sum+rem;
            product=product*rem;
            System.out.println(rem);
            n=n/10;
        }

        System.out.println("sum of digits"+sum);
        System.out.println("product of digits"+product);
    }
}
