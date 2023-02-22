package com.singletondemo;

public class Singleton {
	
//program to restrict user to create multiple objects and can only create only one object.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello world");
		Abc obj1= Abc.getInstance();
		Abc.a=5;
		Abc obj2= Abc.getInstance();

		obj2.a=10;
		System.out.println(obj1.a+" "+obj2.a+" "+Abc.a);
	}
}

class Abc{
	static Abc abc;
	static int a;
	private Abc() {
		System.out.println("Object called");
	}
	
	public static Abc getInstance() {
		if(abc==null) {
		abc=new Abc();
		}
		System.out.println("Object created");
		return abc;
	}
}


