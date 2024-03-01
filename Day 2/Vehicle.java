class Vehicle{
	int price;
	String color;
	String model;
	
	Vehicle(int p, String c, String m){
		price = p;
		color = c;
		model = m;
}
	void display(){
		System.out.println("Price of the vehicle is " +price);
		System.out.println("Color of the vehicle is " +color);
		System.out.println("Model of the vehicle is " +model);

}

	public static void main(String args[]){
		Vehicle v = new Vehicle(900000, "blue", "dsg565");
		v.display();
}
}