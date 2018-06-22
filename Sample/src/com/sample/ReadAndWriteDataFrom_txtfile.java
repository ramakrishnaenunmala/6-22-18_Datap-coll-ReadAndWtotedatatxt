package com.sample;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ReadAndWriteDataFrom_txtfile implements Serializable
{
	int empNo= 101;
	String name="ramki";
}
class Demo{
	public static void main(String[] args) {
		
		try {
			
			ReadAndWriteDataFrom_txtfile obj=new ReadAndWriteDataFrom_txtfile();
			FileOutputStream fos=new FileOutputStream("C:\\Users\\QAP22\\Desktop\\exampl1_001.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(obj);
			oos.close();
			fos.close();
			
			FileInputStream fis=new FileInputStream("C:\\Users\\QAP22\\Desktop\\exampl1_002.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			ReadAndWriteDataFrom_txtfile obj2=(ReadAndWriteDataFrom_txtfile) ois.readObject();
			System.out.println(obj2.empNo+ "\t" + obj2.name);
			fis.close();
			ois.close();
			} 
		catch (Exception e) {
		System.err.println(e);
		}
	}
}
