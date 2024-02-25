//Multiple Exception using throws 

//case-4 
abstract class MathOperation
{
	public void add(int a,int b)
	{
		int c=a+b;
		System.out.println("Addition is:"+c);
	}
	public abstract void division(int a,int b) throws ArithmeticException, Exception;
}
class Calculation3 extends MathOperation
{
	public void division(int a,int b)
	{
		try
		{
		int c=a/b;
		System.out.println("Division is:"+c);
		throw new Exception();     //Changed - ArithmeticException replace Exception error deto as
		}
		
		finally{
			System.out.println("Not Divide by zero");
		}
	}
	public static void main(String args[])
	{
		Calculation3 calculation3 = new Calculation3();
		calculation3.add(10,20);
		calculation3.division(2,0);
	}
}
	