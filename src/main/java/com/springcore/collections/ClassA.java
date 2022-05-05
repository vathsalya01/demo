package com.springcore.collections;

public class ClassA {
	private int x;
	private ClassB obj;
	
	
	public ClassA() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public ClassB getObj() {
		return obj;
	}
	public void setObj(ClassB obj) {
		this.obj = obj;
	}
	@Override
	public String toString() {
		return "ClassA [x=" + x + ", obj=" + obj + "]";
	}
	
	
}
