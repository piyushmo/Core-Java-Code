class Father1{
   public static void main(String []args){
	Mother mother=new Mother();
	System.out.println("calling Mother class");
	mother.solveProblem();
   }
}
class Mother{
	public static void main(String []args){
		Mother mother=new Mother();
		mother.solveProblem();
	}
	public void solveProblem(){
		System.out.println("before my family problem()call");
		MyFamily.MyFamilyProblem("Money");
		System.out.println("after my family problem()call");
	}
	static private class MyFamily{
		public static String MyFamilyProblem(String problem){
		System.out.println("Parameter passed"+problem);
		return problem;
		}
	}
	}