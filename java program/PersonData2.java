class PersonData2{
int a;
String Name;
float Salary;
static String branch = "BE";

 PersonData2(int a, String Name, float Salary, String branch){
	
	this.a=a;
	this.Name=Name;
	this.Salary=Salary;
	this.branch=branch;
		
}

public String toString(){
	
	//return":a:"+this.a+":Name:"+this.Name+":Salary:"+this.Salary+":branch:"+branch;
    return "PersonData2[a=" + a +", Name=" + Name + ", Salary=" + Salary + ",	 branch=" + branch + "]";
}

public static void main(String []args){
	PersonData2 personData=new PersonData2(40,"Piyush",10000,"BE");
	System.out.println(personData);
	System.out.println(PersonData2.branch);
}
}