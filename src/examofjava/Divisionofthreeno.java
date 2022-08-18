package examofjava;

import java.util.Scanner;

public class Divisionofthreeno {
	
	public static void main(String[] args) {
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of a");
		a=sc.nextInt();
		int b;
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter value of b");
		b=sc.nextInt();
		int c;
		Scanner SC=new Scanner(System.in);
		System.out.println("Enter value of c");
		c=sc.nextInt();
		 int n=0;
		for(int i=a;i<=b;i++)
		{
			if(i%c==0)
			{
			   n++;
			}
		} 
		System.out.println(n);
	}
}
