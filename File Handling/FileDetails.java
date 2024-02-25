import java.io.*;
class FileDetails
{
	public static void main(String args[])
	{
		File f = new File("C:\\Users\\Piyush More\\OneDrive\\Desktop\\JavaClassRoomProgram\\File Handling\\FCFH.txt");
	if(f.exists())
	{
      System.out.println("File name:"+f.getName());
	  System.out.println("File Location:"+f.getAbsolutePath());
	  System.out.println("File Writeable:"+f.canWrite());
	  System.out.println("File Readable:"+f.canRead());
	  System.out.println("File Size:"+f.length());
    }
    else
	{
      System.out.println("File does not Exist");
    }
	}
}	