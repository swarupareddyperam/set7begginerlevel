/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int n,i,count=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(i=2;i<n;++i)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==0)
		System.out.println("yes");
		else
		System.out.println("no");
	}
}
