package com.tnif.dayfive.abstraction;

public abstract class Shape {
	protected float area;
	abstract void calArea();
	void show()
	{
		System.out.println("Area of shape is " + area);
	}

}
