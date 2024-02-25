
class AnimalBody extends Body{
	public void walk(){
		System.out.println("Animal- Walk - for hand strength");
	}
	public void hair(){
		System.out.println("Animal- hair - Dark brown also");
	}
	public void skin(){
		System.out.println("Animal- Skin - Dark black also");
	}
	public void behaviour(){
		System.out.println("Animal- Behaviour - Aggressive depend upon animal");
	}
	public void lifeSpan(){
		System.out.println("Animal- LifeSpan - Depend upon animal health body");
	}

	public static void main(String agrs[]){      //Main Method 
		AnimalBody ab = new AnimalBody();
		ab.respiratory();
		ab.bloodCirculation();
		ab.brainInstruction();
		ab.walk();
		ab.hair();
		ab.skin();
		ab.behaviour();
		ab.lifeSpan();
	}
}
