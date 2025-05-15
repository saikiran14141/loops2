package com.loops2;

public class Num10 {
	public void printDivNum()
	{
		int n=0;
		System.out.println("Numbers");
		System.out.println("------------");
		for(int i=1;i<=100;i++)
		{
			
			if(i%9==0)
			{
				
				System.out.print(i+",");
				n=n+1;
				
			}
			
			
		}
		System.out.println();
		System.out.println();
		System.out.println("Count");
		System.out.println("----------");
		System.out.println(n);
	}

	public static void main(String[] args) {
		Num10 num10 = new Num10();
		num10.printDivNum();
	}

}
