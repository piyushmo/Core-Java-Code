public class Mother{

	int amount;
	
	String problemStatement;
	
	double result;

	double mul;
	
	//getter & setters  
		
	public String solveMyFamilyProblem(String problem){
		
	/*MyFamilyProblem myProblem = new MyFamilyProblem();
	
	myProblem.getMoney(50000);*/
	
	
	amount = new MyFamilyProblem().getMoney(100000);
	
	
	problemStatement = new MyFamilyProblem().getProblem(" Money Required ");
	
	result = new MyFamilyProblem().add(20,40);
	
	System.out.println("*********************");
	
	System.out.println("Problem in Mother family :: "+problem);
	
	
	mul = new MyFamilyProblem().multiplication(30,30);
	
	System.out.println("Multiplication :: "+mul);
	
	return problem;
	
}

private class MyFamilyProblem{
	
	public int getMoney(int money){
	
		System.out.println("getMoney called  ::" +money);
		return money;
	}	
	
	public String getProblem(String problemName){
	
		System.out.println("getProblem() called  :: "+problemName);
		
		return problemName;
	}	
	
	double add(double x, double y){
		
		double z = x+y;
		
		System.out.println("Addition is :: "+z);
		
		return z;
	}	
	
	private double multiplication(double a, double b){
		
		double z = a*b;
		
		System.out.println("Addition is :: "+z);
		
		return z;
	}
  }

}