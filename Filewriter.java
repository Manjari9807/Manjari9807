package com.company;
import java.io.File;
import java.io.FileWriter;

import java.io.IOException;
public class Filewriter {

	public static void main(String[] args) {
		
    File f=new File("C:\\Users\\MANJARI\\Desktop\\kashini\\manjari.txt");
    try {
		f.createNewFile();
		FileWriter Fw=new FileWriter(f);
		Fw.write(97);     //ASCII value 
		Fw.write(" \n hi");   //next line :we have to give \n for every statement(drawback for FileWriter)
		Fw.flush(); 						// overcome:bufferwriter ,
		Fw.close();
	
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
