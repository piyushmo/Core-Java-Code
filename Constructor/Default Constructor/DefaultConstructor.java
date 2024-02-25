class Default{
	int a;
	String b;
	boolean c;
	
	Default(){        
		a = 10;
		b = "Piyush";
		c = true;
	}
	void show(){
		System.out.println(a+ " " +b+ " " +c);
	}
}
class DefaultConstructor{
	public static void main(String[] args){
		Default ref = new Default();
		ref.show();
	}
}