package com.rameshsoft.automation.businessscripts;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextTest {
public static void main(String[] args) throws IOException {
	
	File file = new File("D:\\onlinepb2\\pb2framework\\src\\com\\rameshsoft\\automation\\businessscripts\\test.txt");
	boolean b = file.createNewFile();
	if (b) {
		System.out.println("File is created.....");
	}
	else
	{
		System.out.println("Returns exist file.....");
	}
	
	/*FileWriter fw = new FileWriter(file);
	BufferedWriter bw = new BufferedWriter(fw);
	bw.write("hello");
	bw.newLine();
	bw.write("java");
	bw.newLine();
	bw.write("selenium");
	bw.newLine();
	bw.write("practice");
	bw.newLine();
	bw.flush();
	*/
	
	FileReader fr = new FileReader(file);
	BufferedReader br = new BufferedReader(fr);
	int count = 0;
	while(br.ready())
	{
		count++;
		if (count==2) {
			System.out.println(br.readLine());
			break;
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
