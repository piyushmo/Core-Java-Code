class Product{
	private String productName;
	private long productPrice;
	
	public String getProductName(){
		return productName;
	}
	public void setProductName(String productName){
		this.productName = productName;
	}
	public String getProductPrice(){
		return productPrice;
	}
	public void setProductPrice(long productPrice){
		this.productPrice = productPrice;
	}
}

class setProductDetails{
	product product;
	public setProductDetails(){
		product = new Product();
		product.setProductName("Mobile Phone");
		product.setProductPrice(25000);
	}
	public Product getProduct(){
	return product;
	}
}

class GetProductDetails{
	public static void main(String args[]){
		setProductDetails spd = new setProductDetails();
		
		String name = spd.getProduct();
		getProductName();
		System.out.println("Product name" +name);
		
		long price = spd.getProduct();
		
		getProductPrice();
		System.out.println("Product price" +price);
	}
}
		
		