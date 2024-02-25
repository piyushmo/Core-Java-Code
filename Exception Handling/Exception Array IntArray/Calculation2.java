//Multiple Exception using throws 

abstract class MathOperation
{
	public void add(int a,int b)
	{
		int c=a+b;
		System.out.println("Addition is:"+c);
	}
	public abstract void division(int a,int b) throws ArithmeticException, Exception;
}
class Calculation2 extends MathOperation
{
	public void division(int a,int b)
	{
		try
		{
		int c=a/b;
		System.out.println("Division is:"+c);
		throw new ArithmeticException();
		}
		
		finally{
			System.out.println("Not Divide by zero");
		}
	}
	public static void main(String args[])
	{
		Calculation2 calculation2 = new Calculation2();
		calculation2.add(10,20);
		calculation2.division(2,0);
	}
}
	