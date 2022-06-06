package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputStream {

	public static void main(String[] args) {
		try {
			FileInputStream ip=new FileInputStream("C:\\Users\\MANJARI\\Desktop\\manjari.jpg");
			FileOutputStream op=new FileOutputStream("C:\\Users\\MANJARI\\Desktop\\new.jpg");
			int read=ip.read();
			while(read!=-1)
			{
				op.write(read);
				read=ip.read();
			}
			op.flush();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
