public class Address {
    
	 int flatNO;
	 String city;
	 String buildingName;
	 
	 
	public Address(int flatNO, String city, String buildingName) {
		super();
		this.flatNO = flatNO;
		this.city = city;
		this.buildingName = buildingName;
		
		
	}
	@Override
	public String toString() {
		return "Address [flatNO=" + flatNO + ", city=" + city + ", buildingName=" + buildingName + "]";
	}
	 
	
}