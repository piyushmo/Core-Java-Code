// Write on File
import java.io.*;
class FileWriterData
{
	public static void main(String agrs[])
	{
		try
		{
			FileWriter fw = new FileWriter("C:\\Users\\Piyush More\\OneDrive\\Desktop\\JavaClassRoomProgram\\File Handling\\FirstWriteData.txt");
		    try
			{
				fw.write("Java Programming Language is the Best");
			}
			finally
			{
				fw.close();
			}
			System.out.println("Successfully Data Wrote in File");
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}
			