class Default1{
	int a, b;
	private Default1(int a, int b){
		this.a = a;
		this.b = b;
		System.out.println("Value of a=" +a+ "and b="+b);
	}
	public static void main(String args[]){
		Default1 d = new Default1(10 , 20);
	}
}