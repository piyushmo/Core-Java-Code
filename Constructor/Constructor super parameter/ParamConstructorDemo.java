//parameterized Construction with Super()

class ParamConstructor{
	
	public ParamConstructor(int x , int y){
		System.out.println("From Super Class" +x+ " " +y);
	}
}
public class ParamConstructorDemo extends ParamConstructor
{

	public ParamConstructorDemo()
	{
		super(10 , 20);
		System.out.println("From Sub Class");
	}
	public static void main(String args[])
	{
		ParamConstructorDemo paramConstructorDemo = new ParamConstructorDemo();
	}
	
}