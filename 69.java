/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
/* Name of the */
class Ide
{
	public static void main (String[] args) throws java.lang.Exception
	{
	  int n,m,res;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		res=n-m;
		res=Math.abs(res);
		if(res%2==0)
		System.out.println("even");
		else
		System.out.println("odd");
	}
}
