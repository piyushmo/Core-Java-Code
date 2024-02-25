	
class HumanBody extends Body{                               // Child extends parent class IS-A Relationship
	public void walk(){                                     //Abstract class body declare
		System.out.println("Human - Walk - for Fitness body "); 
	}
	public void hair(){
		System.out.println("Human - hair - Black generally");
	}
	public void skin(){
		System.out.println("Human - Skin - Medium brown most of the");
	}
	public void behaviour(){
		System.out.println("Human - Behaviour - is depend on Human Mentality");
	}
	public void lifeSpan(){
		System.out.println("Human - Life Span - Depend upon human health body");
	}

	public static void main(String agrs[]){      //Main Method 
		HumanBody hb = new HumanBody();          //Object create new keyword 
		hb.respiratory();                         //refrence variable through Call method
		hb.bloodCirculation();                     //parent class chya concrete method la call kel aahe
		hb.brainInstruction();
		hb.walk();                                 //Abstract method la call kel refrence method through
		hb.hair(); 
		hb.skin();
		hb.behaviour();
		hb.lifeSpan();
	}
}
		
		