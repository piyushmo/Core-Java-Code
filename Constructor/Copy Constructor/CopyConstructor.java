//Copy Constructor
class CopyCon
{
	                         //Instance variable
	int a;
	String b;
	
	CopyCon(){                 // constrictor
		a = 10;
		b = "Piyush";
		System.out.println(a+ " " +b);
	}
	
	CopyCon(CopyCon ref){       // Copy Constructor 
		a = ref.a;
		b = ref.b;
		System.out.println(a+ " " +b);
	}
}

class CopyConstructor
{
	public static void main(String args[]){
		CopyCon r = new CopyCon();
		CopyCon r2 = new CopyCon(r);
	}
}