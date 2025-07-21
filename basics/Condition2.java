class Condition2{

public static void main(String[]args){
int num=6;
System.out.println(isEven(num));
}

public  static String isEven(int value){

	if(value%2==0){
		return "even number - "+value;
	}else{
		
		return "odd number - "+value;
	}
	
}
}