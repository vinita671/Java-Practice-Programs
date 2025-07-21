class calculator{
public static void main(String[] args){
int a=100;
int b=20;
System.out.println(add(a,b)); //100+20=120
System.out.println(sub(a,b)); //100-20=120
System.out.println(multiply(a,b)); //100*20=2000
System.out.println(division(a,b)); //100/20=5
System.out.println(remainder(a,b)); //100%20=0
System.out.println(power(b)); //20*20=400
}
public static int add(int a,int b){
int c=a+b;
return c;
}
public static int sub(int a ,int b){
int c=a+b;
return c;
}
public static  double multiply(double a,double b){
double c=a*b;
return c;
}
public static double division(double a,double b){
double c=a/b;
return c;
}
public static int remainder(int a,int b){
int c=a%b;
return c;
}
public static int power(int a,int b){
int c=b*b;
return c;
}
}