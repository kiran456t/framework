package com.rameshsoft.automation.supporters;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TextUtility {

	private String filePath;
	private FileWriter fileWriter;
	private BufferedWriter bufferedWriter;
	private FileReader fileReader;
	private BufferedReader bufferedReader;
	public TextUtility(String filePath) throws IOException
	{
		this.filePath = filePath;
		File file = new File(filePath);
		if (file.createNewFile()) 
			System.out.println("file is created");
		else
			System.out.println("Return exists one");
		fileWriter = new FileWriter(file);
		bufferedWriter = new BufferedWriter(fileWriter);
		fileReader = new FileReader(file);
		bufferedReader = new BufferedReader(fileReader);
	}
	
	public void writeIntData(int data) throws IOException {
		if (bufferedWriter!=null) {
			bufferedWriter.write(data);
			bufferedWriter.flush();
		}
	}
	
	public void writeStringData(String data) throws IOException {
		if (bufferedWriter!=null) {
			bufferedWriter.write(data);
			bufferedWriter.flush();
		}
	}
	
	public String readOneLine() throws IOException
	{
		String data = null;
		if (bufferedReader!=null) {
			data = bufferedReader.readLine();
		}
		return data;
	}
	
	public List getTotalFileData() throws IOException {
		List fileData = new ArrayList();
		String data = null;
		if (bufferedReader!= null) {
			while(bufferedReader!=null)
			{
				data = bufferedReader.readLine();
				fileData.add(data);
			}
		}
		return fileData;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
