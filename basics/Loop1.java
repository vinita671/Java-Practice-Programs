class Loop1{
public static void main(String[]args){
	System.out.println("while loop---------");
	loop1();
	System.out.println("do-while loop---------");
	loop2();
	System.out.println("for loop---------");
	loop3();
	}
	public static void loop1(){
	int a=0;
	while(a<11){
		System.out.println("hello world");
		a=a+2;
		
	}
	}
	public static void loop2(){
		int a=12;
	do{
		System.out.println("hello world");
		a=a+2;
		}while(a<11);
	}
	public static void loop3(){
		for(int a=0; a<11;a=a+2){
		System.out.println("hello world");	
		}
		
	}
}