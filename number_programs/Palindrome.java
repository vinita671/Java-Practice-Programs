public class Palindrome {
    public static void main(String[] args) {
        int num=12321;
        System.out.println(isPalindrome(num));
    }
    private static String isPalindrome(int num){
        int temp=num;
        int rev=0;
        while(temp>0){
            int rem=temp%10;
            rev=rev*10+rem;
            temp=temp/10;

        }
        if(num==rev){
            return rev+"  is palindrome number";
        }
        return "not palindrome";
    }
}
