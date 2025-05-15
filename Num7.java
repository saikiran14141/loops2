package com.loops2;

public class Num7 {
	public void printDiv()
	{
		for(int i=0; i<=100; i++)
		{
			if(i%4!=0)
			{
				System.out.print(i+",");
			}
		}
	}
	public static void main(String[] args) {
		Num7 num7 = new Num7();
		num7.printDiv();
		

	}

}
