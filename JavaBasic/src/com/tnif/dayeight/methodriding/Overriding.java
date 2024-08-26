package com.tnif.dayeight.methodriding;

public class Overriding {

	public static void main(String[] args) {
		Rbi rbi;
		rbi = new Sbi();
		System.out.println(rbi.getRate());
		rbi = new Icic();
		System.out.println(rbi.getRate());
		rbi = new Hdfc();
		System.out.println(rbi.getRate());

	}

}
