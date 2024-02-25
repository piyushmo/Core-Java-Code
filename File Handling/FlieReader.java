import java.io.*;
class FlieReader
{
	public static void main(String args[])
	{
		try
		{
			FileReader r = new FileReader("C:\\Users\\Piyush More\\OneDrive\\Desktop\\JavaClassRoomProgram\\File Handling\\FileInData.txt");
				try
				{
					int i;
					while((i=r.read())!=-1)
					{
						System.out.print((char)i);
					}
				}
				finally
				{
					r.close();
				}
		}
		catch(IOException e){
			System.out.println("Exception Handle..!" +e);
		}
	}
}
