class Student{
	private String name;
	
	public String getName(){
		return name;
	}
	public String setName(String name){
        return this.name = name;
	}
}

public class StudentTest1{
    public static void main (String args[]){
		Student student = new Student();
		student.setName("Piyush");
		System.out.println(student.getName());
	}
}
		
	