class A{
	public void add(){
	    int a=10, b=20, c;
        c=a+b;	
	    System.out.println(c);
	}
	public void add(int x, int y){
		int z;
		z=x+y;
		System.out.println(z);
	}
	public void add(int p, double q){
		double r;
		r=p+q;
		System.out.println(r);
	}
	public static void main(String args[]){
		A a = new  A();
		
		a.add();
		a.add(5,5);
		a.add(2, 2.12);
	}
}