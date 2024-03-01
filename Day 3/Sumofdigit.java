import java.util.Scanner;
class Sumofdigit{
	public static void main(String args []){
	int n,d,sum=0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number: ");
	n= sc.nextInt();
	while(n>0){	
		d=n%10;
		sum=sum+d;
		n=n/10;
}
	System.out.println("Sum of Digits:"+sum);
}
}