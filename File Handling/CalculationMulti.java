import java.io.*;
 abstract class MathOpration{
	int c;
   public void add(int a, int b){
		 c = a+b;
		System.out.println("Addtion is : "+c);
	}
	
	public abstract void division(int x, int y) throws Exception;
}
class CalculationMulti extends MathOpration
{
	public void division(int x, int y)
	{
		try
		{ 
			System.out.println("File create");
			FileWriter f = new FileWriter("FileOutputDirect.txt");
	
			try
			{
				f.write("Addition id: "+c+"\n");
				try
				{
					int z = x/y;
					System.out.println("Division is : "+z);
					f.write("Division is: "+z);
				}
				catch(ArithmeticException e)
				{
				     f.write(e.toString());
				}
			}
			catch(IOException e)
			{
				System.out.println(e);
			}
			finally
			{
				f.close();
			}
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		
	}
	public static void main(String args[])
	{
		CalculationMulti cal =new CalculationMulti();
		cal.add(10,20);
		cal.division(10,2);   //0 dila tr exception yet & Exception hai direct file madhe print hot
	}
}