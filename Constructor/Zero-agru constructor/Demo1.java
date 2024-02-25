class DemoConstruct{
	DemoConstruct(){
		System.out.println("0-Argument Constructor");
	}
	DemoConstruct(int a,int b){
		System.out.println("Parameterize Constructor");
	}
}
class Demo1 extends DemoConstruct{
	Demo1(){
		super();
		System.out.println("0-Argument Constructor la call kela");
	}
	Demo1(int a){
		super(10,20);
		System.out.println("parameterized la call kela Constructor");
	}
	
    public static void main(String args[]){
	Demo1 demo = new Demo1();
    Demo1 d = new Demo1(30);
	}
}	