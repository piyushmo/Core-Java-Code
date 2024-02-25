public class NestedTryCatch{
	public void arrayArithmaticOperation(int[] intArray){
		 
		try{
			for(int i=0 ; i<intArray.length ; i++){
				System.out.println(intArray[i]);
			}
		System.out.println("************");
		int b[] = intArray;
		System.out.println("************");
		try{
			for(int i=0 ; i<b.length ; i++){
				int divResult = b[i]/0;
				System.out.println("Division Result"+divResult);
			}
		catch(ArithmeticException e){
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}
		catch(NullPointerException e){
			System.out.println(e);
		}
		catch(Exception e){
			System.out.println("Exception occured is ::"+c);
		}
		}
		}
	
		public static void main(String args[]){
			int[] intArray= {1,2,3,4,5,0};
			NestedTryCatch nestedTryCatch = new NestedTryCatch();
			nestedTryCatch.arrayArithmaticOperation(a);
		}
}