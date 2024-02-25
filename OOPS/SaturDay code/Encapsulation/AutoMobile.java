class Car{
	private String name;
	private int number;
	private float price;
	
	
	//get method
	public String getName(){
		return name;
	}
	public int getNumber(){
		return number;
	}
	public float getPrice(){
		return price;
	}
	
	//set Method
	public String setName(String name){
		return this.name = name;
	}
	public int setNumber(int number){
		return this.number = number;
	}
	public float setPrice(float price){
		return this.price = price;
    }
}
public class AutoMobile{
	public static void main(String args[]){
		Car c = new Car();
		c.setName("TATA Harrier");
		System.out.println("Brand Name:-" + c.getName());
		
		c.setNumber(8888);
		System.out.println("CAR Number:-" + c.getNumber());
		
		c.setPrice(1000000f);
		System.out.println("CAR Price:-0" + c.getPrice());
	}
}