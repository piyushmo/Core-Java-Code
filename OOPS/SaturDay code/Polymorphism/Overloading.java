//Polymorphism - Method Overloading
class Overloading{
	public int show(int a, int b){
		System.out.println("10");
		return a;
	}
	public float show(float a, float b){
		System.out.println("7.7");
		return a;
	}
	public static void main(String args[]){
		Overloading ol = new Overloading();
		ol.show(2,5);
		ol.show(1.1f,2.2f);
	}
}
	