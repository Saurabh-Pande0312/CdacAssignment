import java.util.Scanner;
class Primeornot{
	public static void main(String args []){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number: ");
	int n= sc.nextInt();
	int p=0;

	for(int i=1 ; i<=n; i++){
	if(n%i==0){
	p++;
}
}
	if(p==2){
	System.out.println("The number is prime");
}
	else{
	System.out.println("The number is not prime");
	
}
}
}