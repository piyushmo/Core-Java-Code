class Student{
	//(-------Private Data Tyepe----------)
	private String name;
	private int age;
	private float percentage;
	private long mobileno;
	
	//(-------get Method----------)
	
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public float getPercentage(){
		return percentage;
	}
	public long getMobileNo(){
		return mobileno;
	}
	
	//(-------set Method----------)
	
	public String setName(String name){
		return this.name=name;
	}
	public int setAge(int age){
		return this.age = age;
	}
	public float setPercentage(float percentage){
		return this.percentage = percentage;
	}
    public long setMobileNo(long mobileno){
		return this.mobileno = mobileno;
	}
}
public class StudentTest{
	public static void main(String args[]){
		Student s = new Student();
		s.setName("Piyush");
		System.out.println(s.getName());
		
		s.setAge(25);
		System.out.println(s.getAge());
		
		s.setPercentage(88.75f);
		System.out.println(s.getPercentage());
		
		s.setMobileNo(8888666270l);
		System.out.println(s.getMobileNo());
	}
}
	