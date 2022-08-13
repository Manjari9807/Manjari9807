package com.company;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class BufferWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("C:\\Users\\MANJARI\\Desktop\\kashini\\manjari.txt");
		try {
		FileWriter fw = new FileWriter (f,true);//append .dont delete previous one
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("hi ");
	    bw.flush();
	    bw.newLine();
	    bw.write("hw r u");
	    bw.flush();
	    FileReader fr=new FileReader(f);
	    BufferedReader br=new BufferedReader(fr);
	    	String Line=br.readLine();
	    	int sentencecount=0;
	    	int wordcount=0;
	    	int charcount=0;
	    	int linecount=0;
	    	while(Line!=null)
	    	{
	    		String[] sentence=Line.split("[.]");
	    		sentencecount=sentencecount+sentence.length;
	    		String[] word=Line.split(" ");
	    		charcount=charcount+Line.length();
	    		linecount++;
	    		System.out.println(Line);
		    	Line=br.readLine();
		    	}
	    	System.out.println(sentencecount);
	    	System.out.println(charcount);
	    	System.out.println(linecount);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
