class Person{
	int age = 54;
	float height = 172.6f;
	double weight = 78.85d;
	
	Person(int a){
		age = a;
			
}

	Person(float h){
		height = h;

}

	Person(double w){
		weight = w;
} 
	void display(){
		System.out.println("\nAge    is "+age);
		System.out.println("height is " + height + " cm ");
		System.out.println("Weight is " + weight + "kg\n");
}
	public static void main(String args[]){
		Person p1 = new Person(22);
		Person p2 = new Person(198.5f);
		Person p3 = new Person(95.86d);
		p1.display();
		p2.display();
		p3.display();



}
}