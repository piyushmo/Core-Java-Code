//Polymorphism - Method Overloading -
class A{
	void add(){
		int a=10, b=20, c;
		c = a+b;
		System.out.println("Default add c="+c);
	}
	void add(int x , int y){
		int z;
		z = x+y;
		System.out.println("same para add z="+z);
	}
	void add(int p , double q){
		double r;
		r = p+q;
		System.out.println(" diff para add r="+r);
	}
	
	public static void main(String args[]){
		A r = new A();
		r.add();
		r.add(50,40);
		r.add(10,11.11);
		//System.out.println(add);
	}
}
	