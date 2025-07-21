class Method2{

public static void main(String[]args){

System.out.println("main starts");

m1();
int a=m2();
String b=m3();

System.out.println("main ends");
}

public static void m1(){
System.out.println("m1 method");
return;// compiler will add by default
}
public static int m2(){
System.out.println("m2 method");
return 10;
}

public static String m3(){
System.out.println("m3 method");
return "hello";
}


}