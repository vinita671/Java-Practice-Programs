class Condition3{
public static void main(String[]args){
char gender='F';
System.out.println(findGender(gender));
}
public static String findGender(char value){
	if(value=='F')
		return "female";
	else if (value=='M')
		return "male";
	else if(value=='0')
		return "others";
	else
		return "provide correct value";
}
}