//with Try and Catch 
class TryCatchArithDemo1{
	public void division(){
	int a = 10;
	int b = 0;
	
	try{
		int c = a/b;
		System.out.println("Division :"+c);
	}
	catch(ArithmeticException e){
		System.out.println(e);
	}
}
public static void main(String args[]){
	TryCatchArithDemo1 tryCatchArithDemo1 = new TryCatchArithDemo1();
	tryCatchArithDemo1.division();
}
}