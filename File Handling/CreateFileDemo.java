              /* File Created*/

import java.io.*;
class CreateFileDemo
{
	public static void main(String args[]) //throws IOException //(try catch nasel ghyacha tr)
	{
		File f = new File("C:\\Users\\Piyush More\\OneDrive\\Desktop\\JavaClassRoomProgram\\File Handling\\FirstFile.txt");
		try
		{
		if(f.createNewFile())
		{
			System.out.println("File Successfully Created..!");
		}
		else
		{
			System.out.println("File Already Created..!");
		}
		}
		
		catch(IOException e){
			System.out.println(e);
		}
	}
}