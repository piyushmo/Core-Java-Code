package Default.Defaults;

class DefaultDemo{
	private String name;
	private String mobileNo;
	
	public void setName(String name)
	{
		this.name = name;
	}
	public void setMobileNo(String mobileNo)
	{ 
		this.mobileNo = mobileNo;
	}
	public String getName()
	{
		 return name;
	}
	public String getMobileNo()
	{
		 return mobileNo;
	}
	int add (int a, int b)
	{
		 return a+b;
	}
	DefaultDemo()
	{
		 mobileNo="8888666270";
		 System.out.println("Mobile No :"+mobileNo);
	}
}	 