class Method3{

public static void main(String[]args){

System.out.println("main starts");

m1();
int a=m2();
System.out.println("m2 method return"+a);
String b=m3();
System.out.println("m3 method return"+b);
System.out.println("main ends");
}

public static void m1(){

}
public static int m2(){

return 10;
}

public static String m3(){

return "hello";
}


}