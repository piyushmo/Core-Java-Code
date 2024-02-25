//Overloading Addition Successful
//Method same parameter diffrent
class OverloadingAddition{
	int x;
	float y;
	public void add(int a, int b){
		x=a+b;
		System.out.println("addition"+x);  
	}
	public void add(int a, int b, int c){     //OverloadingAddition Successfull
		x=a+b+c;
		System.out.println("addition"+x);
	}
	public void add(float a, int b, int c){    //OverloadingAddition Successfull
		y=a+b+c;
		System.out.println("addition"+y);  
	}
	/*private void add(int a, int b, int c){     //error  add(int,int,int) is already defined in OverloadingAddition
		x=a+b+c;
		System.out.println("addition"+x);  
	}*/
	/*private int add(int a, int b, int c){        //error add(int,int,int) is already defined in OverloadingAddition  
		x=a+b+c;
		System.out.println("addition"+x);
	}*/		
	
	public static void main(String []args){
		OverloadingAddition ola = new OverloadingAddition();
		ola.add(10,10);
		ola.add(5,5,5);
		ola.add(.8f,8,8);
	}
}
	