class TryCatchDemo5{
	public void division(Integer a , Integer b){
		if(a!=null && b!=null){
			try{
				Integer c = a/b;
				System.out.println("Division :"+c);
			}
			catch(ArithmeticException e){
				e.printStackTrace();
			}
			catch(NullPointerException e){
				e.printStackTrace();
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
		else{
			System.out.println("Value a = " +a+ "\nValue b = " +b);
		}
	}
	public static void main(String args[]){
		TryCatchDemo5 tryCatchDemo5 = new TryCatchDemo5();
		tryCatchDemo5.division(10,null);
	}
}