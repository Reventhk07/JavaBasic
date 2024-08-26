package com.tnif.methodoverloading;

public class OverloadingDemo {

	public static void main(String[] args) {
		System.out.println("------------------------------------------------");
		Point p=new Point();
		System.out.println(p);
		Point p1= new Point(14.5f);
		System.out.println(p1);
		Point p2=new Point(12.5f, 20.50f);
		System.out.println(p2);
		System.out.println("---------------------------------------------------");
		System.out.println("Addtion of integers: " + Methodoverloading.add(10, 20));
		System.out.println("Addition of two float: "+ Methodoverloading.add(10.0f, 20.0f));
		System.out.println("Addition of one float and int: " + Methodoverloading.add(12.0f, 10));
		System.out.println("Addtion of one float and one int: "+ Methodoverloading.add(10, 12.0f));
		System.out.println("Addtion of String: " + Methodoverloading.add("hello", "world"));

		
	}

}
