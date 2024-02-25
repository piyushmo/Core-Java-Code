//HAS-A Type
//private inner class
class Mother{
	public void solveProblem(){
		System.out.println("Family");
	}

	
 private class MyFamily{
		public void myFamilyProblem(){
			System.out.println("String Problem");
		}
}
}


		
class Father{
	public static void main(String args[]){
	Mother mother = new Mother();
    mother.solveProblem();
	}
}
	