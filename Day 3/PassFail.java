import java.util.Scanner;
class PassFail{
	public static void main(String args []){
	int result;
	Scanner r = new Scanner(System.in);
	System.out.println("Enter score out of 100:");
	result = r.nextInt();

	if(result>40){
		System.out.println("Passed");
}

	else{
		System.out.println("Failed");
}
}
}