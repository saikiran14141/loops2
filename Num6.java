package com.loops2;

public class Num6 {
	public void multipleOfNum(int n)
	{
		for(int i=10; i>=1; i--)
		{
			System.out.println(n+"x"+i+"="+n*i);
		}
	}
	public static void main(String[] args) {
		Num6 num6 = new Num6();
		num6.multipleOfNum(6);
	}

}
