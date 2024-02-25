//Parameterized Constructor
class Pc
{
	int x,y;
	Pc(int a, int b){   //parameterized Constructor
	   x=a ;
	   y=b ;
	}
	
	Pc(int a, String b){   //parameterized Constructor diffrent data type
	   System.out.println(a+ " " +b);
	}
	void show(){
		System.out.println(x+ " " +y);
	}
}
class ParaConstruct{
	public static void main(String args[]){
		Pc ref = new Pc(10 , 20);
		Pc r = new Pc(777, "Piyush");
		ref.show();
	}
}
