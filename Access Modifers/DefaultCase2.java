//Access Modifier / Non-Access specifier
//Case-1 - Default case

class DefaultCase2{
	//default variable declaration
	int a;
	float b;
	String c;
	
	public DefaultCase2(int a, float b ,String c){
		this.a = a;
		this.b = b;
		this.c = c;
		System.out.println("Default class: \n int : \7/ " + a + "\nfloat : " +b + " \nString: " +c );
	}
	public static void main (String args[]){
		DefaultCase2 dc = new DefaultCase2(10, 20.09f, "Piyush");
	}
}