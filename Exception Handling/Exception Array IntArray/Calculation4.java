//Multiple Exception using throws 

//case-5 SubType 
abstract class MathOperation
{
	public void add(int a,int b)
	{
		int c=a+b;
		System.out.println("Addition is:"+c);
	}
	public abstract void division(int a,int b) throws Exception, ArithmeticException;  //Sequence
}
class Calculation4 extends MathOperation
{
	public void division(int a,int b)
	{
		try
		{
		int c=a/b;
		System.out.println("Division is:"+c);
		throw new ArithmeticException();     //and ithe jr Fkt Exception ghetl tr error deto.    
		}
		finally{
			System.out.println("Not Divide by zero");
		}
	}
	public static void main(String args[])
	{
		Calculation4 calculation4 = new Calculation4();
		calculation4.add(10,20);
		calculation4.division(2,0);
	}
}
	