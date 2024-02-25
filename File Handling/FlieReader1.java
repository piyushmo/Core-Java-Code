import java.io.*;
class FlieReader1
{
	public static void main(String args[]) throws IOException
	{
			FileReader r = new FileReader("C:\\Users\\Piyush More\\OneDrive\\Desktop\\JavaClassRoomProgram\\File Handling\\FileInData.txt");
					int i;
					while((i=r.read())!=-1)
					{
						System.out.print((char)i);
					}
	}
}
