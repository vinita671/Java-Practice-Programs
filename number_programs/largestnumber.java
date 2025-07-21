public class largestnumber {
    public static void main(String[] args) {
        
        int a=18;
        int b=10;
        int c=14;

        int result=(a>b)?(a>c?a:c):(b>c?b:c);
        int result1=(a<b)?(a<c?a:c):(b<c?b:c);
        System.out.println("Largest Number is:" +result);
        System.out.println("Smallest Number is:" +result1);
        
    }
}
