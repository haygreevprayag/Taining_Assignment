package com.oops.project;



public class DoWhile
{
public static void main(String[] args)
{
	int i =1;

	do
	{
	System.out.print((char)i+"\t");
	if (i % 10 == 0)
	System.out.println("");
	i++;
	}while (i <=122);

}
}
