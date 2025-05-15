package com.loops2;

public class Num2 {
	String res="";
	public String multipleNumber(int n)
	{
		for(int i=1; i<=10; i++)
		{
			System.out.print(n*i+",");
		}
		return res;
	}
public static void main(String[] args) {
	Num2 obj1= new Num2();
	obj1.multipleNumber(7);
	}
}
