package com.loops2;

public class Num {
	String res="";
	public String divisibleNumber() 
	{
		for(int i=1 ; i<=100;i++)
		{
			if(i%3==0 && i%5==0 )
			{
				System.out.print(i+",");
			}
		}
		return res;
	}
	public static void main(String[] args) {
		Num obj = new Num();
		obj.divisibleNumber();


	}

}
