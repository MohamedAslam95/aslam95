import java.util.Scanner;


public class ScannerTest 
{

 
public static void main(String[] arg)
 {



	Scanner input = new Scanner(System.in);


//Test Command



	System.out.print("Enter an Integer between 0 and 1000: 

	int num = input.nextInt();

 //test 2 command is created other person
	int t=0; //test

	t+=num%10; //5

	num/=10; //12

	t+=num%10; //7

	num/=10; //1

	t+=num%10; //8



	System.out.println("This Output is:"+t);


	}

}