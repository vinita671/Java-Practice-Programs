class LoopTask1{
public static void main(String[]args){
	printEven();
	
}
public static void printEven(){
	int num=1;
	while(num<=50){
		
		if(num%2==0)
		System.out.print(num+" , ");
        num++;//num=num+1;	
		
	}
		
}

}