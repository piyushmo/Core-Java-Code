package com.exmpl.collection;
import java.io.BufferedReader;
import java.io.File;
import java.io.*;

public class SurveyFileRead {
	public void surveyCVCFilereader(File file) {
		BufferedReader bufferedReader;
		try {
			bufferedReader = new BufferedReader(new FileReader(file));
			String line;
			while((line=bufferedReader.readLine())!= null) {
				System.out.println(line);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		SurveyFileRead surveyFileRead = new SurveyFileRead();
		String fileName = "C:\\Users\\Piyush More\\OneDrive\\Desktop\\JavaClassRoomProgram\\Collection Freamework\\project\\survey.csv";
		File file = new File(fileName);
		surveyFileRead.surveyCVCFilereader(file);

	}

}
