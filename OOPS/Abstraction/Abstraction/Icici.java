class Icici extends Bank{
	    public void time(){
			System.out.println("ICICI- Open Time,Lunch Time, Close Time");
		}
		public void uniform(){
			System.out.println("ICICI- Uniform Diffrent Colors");
		}
		public void idCardD(){
			System.out.println("ICICI- ID Card Design");
		}
		public void location(){
			System.out.println("ICICI- Dffrent location");
		}
		public static void main(String args[]){
			Icici ic = new Icici();
			ic.deposit();
			ic.withdraw();
			ic.acOpen();
			ic.time();
			ic.uniform();
			ic.idCardD();
			ic.location();
		}
}