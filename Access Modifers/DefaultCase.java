//Access Modifier / Non-Access specifier
//Case-1 - Default case

class DefaultCase{
	//default variable declaration
	int a;
	int b;
	
	public DefaultCase(int a, int b){
		this.a = a;
		this.b = b;
		System.out.println("Default class:" + a + " :: " +b );
	}
	public static void main (String args[]){
		DefaultCase dc = new DefaultCase(10, 20);
	}
}