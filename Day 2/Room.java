class Room{
	
	float height;
	float width;
	float breadth;

	void getVolume(float h, float w, float b){
	height = h;
	width = w;
	breadth = b;
	float volume = h*w*b;
	System.out.println(volume);
	}

	public  static void main(String arg[]){
	Room r = new Room();
	r.getVolume(4.5f,5.0f,6.0f);
	}
}