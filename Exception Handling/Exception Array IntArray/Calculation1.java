abstract class MathOperation
{
	public void add(int a,int b)
	{
		int c=a+b;
		System.out.println("Addition is:"+c);
	}
	public abstract void division(int a,int b) throws Exception;
}
class Calculation1 extends MathOperation
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
		Calculation1 calculation1 = new Calculation1();
		calculation1.add(10,20);
		calculation1.division(2,0);
	}
}
	