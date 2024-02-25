import java.io.*;
class FileRename
{
	public static void main(String args[])
	{
	    File f = new File("C:\\Users\\Piyush More\\OneDrive\\Desktop\\JavaClassRoomProgram\\File Handling\\Piyush.txt");
	    File r = new File("C:\\Users\\Piyush More\\OneDrive\\Desktop\\JavaClassRoomProgram\\File Handling\\More.txt");
	    if(f.exists())
	    {
		    System.out.println(f.renameTo(r));
	    }
	    else
	    {
		    System.out.println("File doesn't exist");
	    }
	}
}
	
	