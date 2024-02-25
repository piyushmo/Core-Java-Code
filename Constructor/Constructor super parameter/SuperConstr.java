class SuperConstructor{
	public SuperConstructor(int a, int b){
		System.out.println("Super Class" +a+ " " +b);
	}
}
public class SuperConstr extends SuperConstructor{
	public SuperConstr(){
		super(10,20);
		System.out.println("Sub Class");
	}
	public static void main(String args[]){
		SuperConstr superConstr = new SuperConstr();
	}
}