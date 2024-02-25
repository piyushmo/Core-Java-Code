import java.io.*;
class CreateFile
{
	public static void main(String args[])
	{
		File f = new File("C:\\Users\\Piyush More\\OneDrive\\Desktop\\JavaClassRoomProgram\\File Handling\\FCFH.txt");
		try
		{
		    if(f.createNewFile())
		    {
		       System.out.println("File Is Created...!");
		    }
		    else
		    {
			   System.out.println("Already File Created...!");
		    }
		}
		catch(IOException e){
			System.out.println(e);
		}
	}
}
		