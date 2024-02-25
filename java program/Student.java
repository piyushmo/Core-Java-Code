public class Address {
    
	 int flatNO;
	 String city;
	 String buildingName;
	 
	 
	public Address(int flatNO, String city, String buildingName) {
		super();
		this.flatNO = flatNO;
		this.city = city;
		this.buildingName = buildingName;
		
		
	}
	@Override
	public String toString() {
		return "Address [flatNO=" + flatNO + ", city=" + city + ", buildingName=" + buildingName + "]";
	}
	 
	
}
abstract class Person{
	public void walk() {
		
	}
	
public void eat() {
		
	}
abstract void behaviour();

}


public class Student extends Person {
	 
	int rollno;
	String name;
	Address address;
	
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", address=" + address + "]";
	}
	
	public Student(int a , String name, Address address) {
		this.rollno=a;
		this.name=name;
		this.address= address;
		
	}
	@Override
	void behaviour() {
		System.out.println("Different behaviour");
		
	}
	public static void main(String [] args) {
		//Address address= new Address(1,"Klyani","dev");
		Student student = new Student(1,"manasi",new Address(1,"Kalyani","Dev"));
		System.out.println(student);
		student.behaviour();
	}

}