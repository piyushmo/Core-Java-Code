package Default.Defaults;

import Default.Defaults.DefaultDemo;

public class  {
	public static void main(String []args){
		DefaultDemo demo = new DefaultDemo();
		demo.setName("Piyush");
		System.out.println("Name is ::"+demo.getName());
		 
		int c=demo.add(10,20);
		System.out.println("Addition is :"+c);
	}
}