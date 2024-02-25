class PrivatConstructor1
{
	int a; 
	double b ; 
	String c;
	
	private PrivatConstructor1()
	{
		a = 10;
		b = 7.77;
		c = "Piyush";
		System.out.println(a+ "\n " +b+"\n " +c);
	}
}
class PrivatConstructor{
	public static void main(String args[])
	{
		PrivatConstructor1 pc = new PrivatConstructor1();
	}
}
		