package com.rslakra.appsuite.jdk5scjp.serialization;

import java.io.Serializable;
import java.io.*;

class Dog implements Serializable {
	private Collar theCollar;
	private int dogSize;
	private final int iFinal = 10;

	public Dog(Collar collar, int size) {
		theCollar = collar;
		dogSize = size;
	}

	public Collar getCollar() { return theCollar; }
	
	public int getIFinal() { return iFinal; }
}

class Collar implements Serializable {
	private int collarSize;
	
	public Collar(int size) { collarSize = size; }
	
	public int getCollarSize() { return collarSize; }
}

public class SerializeDog {
	public static void main(String[] args) {
		Collar c = new Collar(3);
		Dog d = new Dog(c, 5);
		System.out.println("before: collar size is " + d.getCollar().getCollarSize());
		try {
			FileOutputStream fs = new FileOutputStream("testSer.ser");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(d);
			os.close();
		} catch (Exception e) { e.printStackTrace(); }
		try {
			FileInputStream fis = new FileInputStream("testSer.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			d = (Dog) ois.readObject();
			ois.close();
		} catch (Exception e) { e.printStackTrace(); }
		
		System.out.println("after: iFinal : " + d.getIFinal());
		System.out.println("after: collar size is " + d.getCollar().getCollarSize());
	}
}
