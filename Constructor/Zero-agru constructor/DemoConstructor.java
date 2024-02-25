class DemoConst{
	DemoConst(){
		System.out.println("0-argument constructor");
	}
	DemoConst(int a, int b){
		System.out.println(" parameterize constructor");
	}
}
class DemoConstructor extends DemoConst{
	 DemoConstructor(){
		 super();
	 }
	DemoConstructor(int a){
		super(10,20);
		System.out.println(" parameterize constructor---2");
		
		System.out.println(" value a:"+a);
	}
	public static void main(String args[]){
		DemoConstructor demoConstructor = new DemoConstructor();
		DemoConstructor d = new DemoConstructor(30);
	}
}