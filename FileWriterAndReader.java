package com.company;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;  
public class FileWriterAndReader {  
    public static void main(String args[]){
    	File f=new File("C:\\Users\\MANJARI\\Desktop\\kashini\\manjari.txt");
        try {
    		f.createNewFile();	
    		FileWriter Fw=new FileWriter(f,true);
    		Fw.write(97);     //ASCII value 
    		Fw.write("How are you");   //next line :we have to give \n for every statement(drawback for FileWriter)
    		Fw.flush(); 						// overcome:bufferwriter ,
    		Fw.close();
//    	   FileReader fr=new FileReader(f);
//    	   int output=fr.read();
//    	   while(output!=-1)
//    	   {
//    		   //System.out.println(output);
//    		   System.out.print((char)output);
//    		    output=fr.read();
//    	   }
    		 FileReader fr=new FileReader(f);
    		 char ch[]=new char[(int) f.length()];
    		 fr.read(ch);
    		 for(char ch1:ch)
    		 {
    			 System.out.println(ch1);
    		 }
    	} catch (IOException e) {
    		// TODO Auto-generated catch block
    		e.printStackTrace();
    	}
    }
}