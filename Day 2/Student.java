class Student{
	String name;
	int marks1;
	int marks2;
	int marks3;
	
	
	void getDetails(String n, int m1, int m2 , int m3){
	name = n;
	marks1 = m1;
	marks2 = m2;
	marks3 = m3;
}
	void getSum(){
	int sum = marks1+marks2+marks3;
	System.out.println("Student total marks obtained:       " +sum);
	
}
	void getAverage(){
	int sum = marks1+marks2+marks3;
	int average = sum/3;
	System.out.println("the average marks of the student is " +average);
}
	void getStudentDetails(){
	System.out.println("Student's Name:                     " +name);
	System.out.println("Student's marks in first  subject:  " +marks1);
	System.out.println("Student's marks in second subject:  " +marks2);
	System.out.println("Student's marks in third  subject:  " +marks3);
}
		
	public static void main(String args[]){
		Student s= new Student();
		s.getDetails("Saurabh", 91, 92, 93);
		s.getStudentDetails();
		s.getSum();
		s.getAverage();
}
}