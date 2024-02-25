abstract class Business implements Investment{
	
	public void research(){               //(-----------Concrete method For Business----------)
		System.out.println("Every business requires research");
	}
	
	public void landPurchese(){           //(-------------Interface--Implement----------------)
		System.out.println("Every Business need a Location");
	}
	
	public void marketing(){             //(-------------Interface--Implement----------------)
		System.out.println("Every business needs a marketing.");
	}
	
	public void customerCare(){        //(-----------Concrete method For Business----------)
		System.out.println("Dealing with a customer");
	}
	
	//(------------Abstract Method-------------)
	abstract void businessName();
	abstract void businessLocation();
}