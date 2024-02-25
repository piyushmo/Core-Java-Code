
abstract class MathOperation{
	public void add(int a, int b){
		int c = a+b;
		System.out.println("Addtion is : "+c);
	}
	
	public abstract void division(int a, int b) throws Exception;
}
class Calculation extends MathOperation
{
      public void division(int a, int b)
	  {
		  try
		  {
			  int c= a/b;
		      System.out.println("division is : "+c);
		  }
		  catch(ArithmeticException e){
			  System.out.println(e);
	      }
		  finally{
			  System.out.println("Any no is not able to divide/0");
		  }
	  }
	  public static void main(String args[])
	  {
		  Calculation calculation = new Calculation();
          calculation.add(10,20);
	      calculation.division(2,0);
	  }
}

	