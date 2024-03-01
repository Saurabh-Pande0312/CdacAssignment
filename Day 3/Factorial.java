import java.util.Scanner;
class Factorial{

	public static void main(String args []){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number: ");
	int j = sc.nextInt();
	int f = 1;
	
	for(int i = 1; i<=j; i++){
	f=f*i;
	
}
	System.out.println("Factorial of "+j+" is \n"+f);
}
}