abstract class Engine{
	public void Start(){
		System.out.println("Engine Start");
	}
	public void Stop(){
		System.out.println("Engine Stop");
	}
	  abstract void shiftGear();
}
public class petrolEngine extends Engine{
	public void shiftGear(){
		System.out.println("Engine gear shifted");
	}
	public static void main(String args[]){
	System.out.println("main()");
	petrolEngine pEngin = new petrolEngine();
	pEngin.Start();
	pEngin.shiftGear();
	pEngin.Stop();
	}
	
}
