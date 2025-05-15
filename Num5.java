package com.loops2;

public class Num5 {
	public void printThirdNumber()
	{
		for(int i=5; i<=50; i=i+3)
		{
			System.out.print(i+",");
		}
	}

	public static void main(String[] args) {
		Num5 num5 = new Num5();
		num5.printThirdNumber();
	}

}
