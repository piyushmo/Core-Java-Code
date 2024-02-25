 class CPU {
   public void start(){
	   System.out.println("System on");
   }
    public void Stop(){
	   System.out.println("System off");
   }
   
}

public class Computer {
	
	CPU cpuu;
	
	public Computer(CPU cpuu){
		this.cpuu = cpuu;
	}
	public static void main(String [] args){
 // CPU part-of Computer.
    Computer cpu = new Computer("cpuu");
	cpu.start();
	cpu.Stop();
	
	
//System.out.println("cpu");
	}   
}
