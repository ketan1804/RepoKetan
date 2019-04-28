package abcdefg;

import java.util.Scanner;


public class FindNumb {
	static long r, sum=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc1=new Scanner(System.in);
System.out.println("Enter your requisite number");
long a=sc1.nextInt();

while (a>0)
		{
	r=a%10;
	sum=(sum*10)+r;
	a=a/10;	
		}

System.out.println("The required reverse number is " + sum);
sc1.close();

	}

}
