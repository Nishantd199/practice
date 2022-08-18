package examofjava;

import java.util.Scanner;

public class Evenandodd {
	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num = Sc.nextInt();
	if(num%2==0)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("odd");
		}
}
}
