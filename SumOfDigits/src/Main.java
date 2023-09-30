import java.util.Scanner;
	public class Main

	{

	public static void calculateSumOfDigits(int n) 
	{
	// your code here
		int rem =0;
		int sum=0;
		while(n!=0)
		{
			rem=n%10;
			sum=sum+rem;
	      	n=n/10;
		}
		System.out.println("The Sum of Individual digits of a Number is "+sum);
	}
	public static void main(String[] args)
	{
    System.out.println("Enter a number to find its individual Digit's sum:");
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	calculateSumOfDigits(n);
	}
	}

