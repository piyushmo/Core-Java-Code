class SamsungMobile extends Product{              // IS-A relationship
	public void modelNo(){                        //abstract method implement
		System.out.println("modelNo - Diffrent Product Number ");
	}
	public void size(){
		System.out.println("size - Diffrent Product Size");
	}
	public void color(){
		System.out.println("color - Diffrent Product Color");
	}
	public void weight(){
		System.out.println("weight - Diffrent Product weight");
	}
	public static void main(String args[]){         //Main method SamsungMobile
		SamsungMobile sm = new SamsungMobile();
		sm.packing();
		sm.on();
		sm.off();
		sm.modelNo();
		sm.size();
		sm.color();
		sm.weight();
		sm.customerServices();
	}
}