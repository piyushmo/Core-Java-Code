public abstract class Body implements Life{
	public void born(){
		System.out.println("Life is begin.....!");
	}
	public void respiratory(){
		System.out.println("Inhale and Exhale");
	}
	public void bloodCirculation(){
		System.out.println("Blood Circulation");
	}
	public void brainInstruction(){
		System.out.println("Brain Instruction");
	}
    public void death(){
		System.out.println("End of Life......");
	} 
    public static void bodyPart(){                //Static method pn add keli aahe
		System.out.println("bodyPart......");
	}   	
            		
	abstract void walk();
	abstract void hair();
	abstract void skin();
	abstract void behaviour();
	abstract void lifeSpan();
}
