class Box{
	float height;
	float width;
	float breadth;

	Box(float h, float w, float b){
		height  = h;
		width   = w;
		breadth = b;

}
	void getVolume(){
	float vol = height*width*breadth;
	System.out.println("Volume of the box " +vol);
}
	void getArea(){
	float area = 2*height*width + 2*width*breadth + 2*height*breadth;
	System.out.println("Surface Area of the box " +area);
}

	public static void main(String args[]){
		Box box1 = new Box(2.3f,4.5f,8.9f);
		Box box2 = new Box(3.6f,5.9f,8.4f);
		box1.getVolume();
		box2.getVolume();
		box1.getArea();
		box2.getArea();
}
}