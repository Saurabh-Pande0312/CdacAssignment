class Matr{
	public static void main(String[] args){
		int m1[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int m2[][] = {{9,8,7},{6,5,4},{3,2,1}};

		int sum[][] = new int[3][3];
		int col = m1[0].length;
		int row = m1.length;

		for(int i = 0; i< row; i++){
		for (int j =1; j<=col; j++){
			sum[i][j] = m1[i][j] + m2[i][j];

		}
	}

		for(int i = 1; i<= row; i++){
		for (int j =1; j<=col; j++){
			System.out.print(sum[i][j]+" ");
			
		}




}	
}
}