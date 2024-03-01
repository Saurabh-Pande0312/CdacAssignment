class MaxMin{
	public static void main(String args[]){
	int[] array = {5, 4, 3, 9, 1, 7, 9};
	int max = array[0];
	int min = array[0];
	
	for(int i = 0 ; i<7 ; i++){
		if (max > array[i]){
		max = array[i];
}
}
	for(int i = 0 ; i<7 ; i++){
		if (min < array[i]){
		min = array[i];
}
}
	System.out.println("The max value in the array is "+max);
	System.out.println("The min value in the array is "+min);
	
}
}