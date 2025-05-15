package com.loops2;

public class Num8 {
	public void printCube()
	{
		for(int i=1; i<=10; i++)
		{
			System.out.println(i+"^3"+" = "+i*i*i);
		}
	}

	public static void main(String[] args) {
		Num8 num8 = new Num8();
		num8.printCube();

	}

}
