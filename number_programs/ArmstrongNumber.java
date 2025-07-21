
public class ArmstrongNumber {
    public static void main(String[] args){
     if (isArmstrong(143)){
        System.out.println("The number is an Armstrong number");
     }   
     else{
        System.out.println("The number is not an Armstrong number");
     }
    }
    public static boolean isArmstrong(int num){
        int temp = num;
        int temp1 = num;
        int sum=0;
        int c=0;
        while(num>0){//finding the num of digits
            int r=num%10;
             c++;
             num=num/10;
        }
        while(temp>0){//calculating the armstrong sum
            int rem=temp%10;
            sum+=Math.pow(rem,c);
            temp/=10;
        }
        if(sum==temp1)
        return true;
        else
        return false;
    }
}

