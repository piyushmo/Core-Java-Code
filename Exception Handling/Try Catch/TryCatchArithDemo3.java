//With Try and Multiple Catch - Exception Handling
class TryCatchArithDemo3{
	public void division(){
		int a = 10;
		int b = 0;
		
		try{
			int c = a/b;
			System.out.println("Division :"+c);
		}
		catch(ArithmeticException e){
			//System.out.println(e);
			e.printstackTrace();
		}
		catch(Exception e){
			e.printstackTrace();
			//System.out.println(e);
		}
	}
	public static void main(String args[]){
		TryCatchArithDemo3 tryCatchArithDemo3 = new TryCatchArithDemo3();
		tryCatchArithDemo3.division();
	}
}