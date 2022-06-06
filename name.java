package com.company;
import java.io.FileReader;
import java.io.IOException;  
public class name {  
    public static void main(String args[]){
    	try {
          FileReader fr=new FileReader("C:\\Users\\MANJARI\\Desktop\\kashini\\manjari.txt");    
          int i;    
          while((i=fr.read())!=-1)    
          System.out.print((char)i);    
          fr.close(); 
          
    }  catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}  
}    }