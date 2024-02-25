class CharArray
{
	public void display()
	{
		char[] cArr = new char[4];
		cArr[0] = 'J';
		cArr[1] = 'A';
		cArr[2] = 'V';
		cArr[3] = 'A';
		
		for(int i=0; i<4 ; i++)
		{
			System.out.println(cArr[i]);
		}
		
	}
	public static void main(String args[])
	{
		CharArray ca = new CharArray();
		ca.display();
	}
}
		