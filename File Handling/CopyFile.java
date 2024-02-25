import java.io.*;

//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.IOException;

class CopyFile
{
	public static void main(String args[]) throws IOException
	{
		FileInputStream r = new FileInputStream("C:\\Users\\Piyush More\\OneDrive\\Desktop\\JavaClassRoomProgram\\File Handling\\ContentCopy.txt");
		FileOutputStream w = new FileOutputStream("C:\\Users\\Piyush More\\OneDrive\\Desktop\\JavaClassRoomProgram\\File Handling\\ContentCopyKelaFilePnCreateKeli.txt");
		
		int i;
		while((i=r.read())!=-1)
		{
			w.write((char)i);
		}
		System.out.println("Data Copies Successfully....!");
	}
}