package com.loops2;

public class Num3 {
	public void printEven()
	{
		int n=0;
		for(int i =1; i<=50; i++)
		{
			if(i%2==0)
			{
				n=n+1;
			}
		}
		System.out.println(n);
		
	}
	public static void main(String[] args) {
		Num3 num3 = new Num3();
		num3.printEven();
	}

}
