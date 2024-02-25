class CopyCon
{
	int a;
	String b;
	
	CopyCon(){
		a = 10;
		b = 20;
		System.out.println(a+ " " +b);
	}
	
	CopyCon(CopyCon ref){
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