package com.loops2;

public class Num4 {
	public void printSumOfOddNum()
	{
		int n=0;
		for(int i=1; i<=30; i++ )
		{
			if(i%2==1)
			{
				n=n+i;
			}
		}
		System.out.println(n);
	}

	public static void main(String[] args) {
		Num4 num4 = new Num4();
		num4.printSumOfOddNum();

	}

}
