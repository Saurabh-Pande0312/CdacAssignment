class Average{
	public static void main(String args[]){
	int[] array = {5, 4, 3, 9, 1, 7, 9};
	float x = 0;
	double a;
	for(int i = 0 ; i<7 ; i++){
		x = array[i] + x ;		
	
}
	System.out.println("The sum of the number in the array is " +x);
	a = x/7;
	System.out.println("The average of the of the sum of the number present in the array is "+a);

}
}