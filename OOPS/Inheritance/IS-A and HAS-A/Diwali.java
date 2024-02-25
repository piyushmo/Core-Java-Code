class Diwali extends Festival
{
	public static void main(String args[]){
     Diwali diwali = new Diwali();      //IS-A Calling   (child class cha Obj. bnvla)
	 diwali.cracker();
	 diwali.light();
	 diwali.sweet();
	 Pooja puja = new Pooja();            //HAS-A Calling  (HAS-A class cha Obj. bnvla)
	 puja.laxamipuja();
	 puja.dhanteras();
	 
	}
}