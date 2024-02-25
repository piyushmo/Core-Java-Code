class Engineer{                  //IS-A
	public void branch()
	{
		System.out.println("IT Branch");
	}
}
class Skill{                     //HAS-A
	public void coding()
	{
		System.out.println("JAVA Coding Skill");
	}
}
class Student extends Engineer   //Child class extend parent class
{
	public static void main(String agrs[]){
		
	Student e = new Student();
	e.branch();
	Skill s = new Skill();
	s.coding();
	}
}
	