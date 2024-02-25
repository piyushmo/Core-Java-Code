abstract class Cpu{
	public void Start(){
		System.out.println("CPU Start");
	}
	public void Off(){
		System.out.println("CPU Shutdown");
	}
	  //abstract void refresh();
}

public class computerPc extends Cpu{
	public void refresh(){
		//System.out.println("Computer Refresh");
	}
	public static void main(String[] args){
	
	computerPc pC = new computerPc();
	pC.Start();
	pC.refresh();
	pC.Off();
	}
	
}