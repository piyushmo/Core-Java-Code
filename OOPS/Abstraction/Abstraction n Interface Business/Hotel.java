class Hotel extends Business{
	                               //(--------Hotel own concreate methods------------------)
	public void chef(){
		System.out.println("Every Hotel-business requires Chef");
	}
	public void paymentMethod(){
		System.out.println("Payment Method - Online and Offline");
	}
	                              //(-------------implement the abstract method in subclass----------------)
	public void businessName(){
		System.out.println("Name of Business");
	}
	public void businessLocation(){
		System.out.println("Loaction Depend on your Business");
	}
	//(---------------Main Method ----------------)
	public static void main(String args[]){
                                   //Object Create
		Hotel h = new Hotel();  
		
		h.research();              //Concrete method Called
		h.landPurchese ();         //Interface implemented Method called
	    h.marketing();            //Interface implemented Method called
		h.customerCare();        //Concrete method Called
    //Hotel Own method called
	    h.chef();                 
		h.paymentMethod();        
    // Abstract Method called
		h.businessName();          
		h.businessLocation();
	}
}