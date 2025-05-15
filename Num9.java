package com.loops2;

public class Num9 {
	public void printDivi()
	{
		for(int i=1;i<=50;i++)
		{
			if(i%4==0 || i%6==0)
			{
				System.out.print(i+",");
			}
		}
	}
	public static void main(String[] args) {
		Num9 num9 = new Num9();
		num9.printDivi();

	}

}
