/* File Information*/
import java.io.*;			 
class FileInfo
{
	public static void main(String args[])
	{
		File file= new File("C:\\Users\\Piyush More\\OneDrive\\Desktop\\JavaClassRoomProgram\\File Handling\\FirstFile.txt");
    if(file.exists())
	{
		System.out.println("File Info :"+file.getName());
		System.out.println("File Location :"+file.getAbsolutePath());
		System.out.println("File Writeable :"+file.canWrite());
		System.out.println("File Readable :" +file.canRead());
		System.out.println("File Size :" +file.length());
		
	}
    else
	{
		System.out.println("File Not Exists");
	}
	}
}	