import java.io.*;

class createFile1
{
	public static void main(String args[])
	{
		File f = new File("C:\\Users\\Piyush More\\OneDrive\\Desktop\\JavaClassRoomProgram\\File Handling\\FHFC.txt");
		try
		{
		   if(f.createNewFile())
		   {
			  System.out.println("File Successful Created..!");
		   }
		   else
		   {
			  System.out.println("File Already Exist..!");
		   }
		}
		catch(IOException e){
			System.out.println(e);
		}
	}
}