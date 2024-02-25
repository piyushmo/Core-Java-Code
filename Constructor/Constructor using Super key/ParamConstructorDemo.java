class ParamConstructor{
	public ParamConstructor(){
		System.out.println("From Super Class");
	}
}
public class ParamConstructorDemo extends ParamConstructor
{
	public ParamConstructorDemo()
	{
		super();
		System.out.println("From Super Class");
	}
	public static void main(String args[])
	{
		ParamConstructorDemo paramConstructorDemo = new ParamConstructorDemo();
	}
}