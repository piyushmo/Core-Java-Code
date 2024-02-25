 class Festival1                          //IS-A 
 {
	 public void cracker()
	 {
		 System.out.println("Diwali is festival of cracker");
	 }
	 public void light()
	 {
		 System.out.println("Diwali is festival home lighting");
	 }
	 public void sweet()
	 {
		 System.out.println("Diwali is festival of Sweets");
	 }
 }
 class Pooja1                    //HAS-A ( Abstraction class achive ithe kel)
 {
	 public void laxamipuja(){
		 System.out.println("Laxamipuja are in home and shops");
	 }
	 public void dhanteras(){
		 System.out.println("purchesing new Gold");
	 }
 }
class Diwali1 extends Festival1
{
	public static void main(String args[]){
     Diwali1 diwali = new Diwali1();      //IS-A Calling   (child class cha Obj. bnvla)
	 diwali.cracker();
	 diwali.light();
	 diwali.sweet();
	 Pooja1 puja = new Pooja1();            //HAS-A Calling  (HAS-A class cha Obj. bnvla)
	 puja.laxamipuja();
	 puja.dhanteras();
	 
	}
}
	