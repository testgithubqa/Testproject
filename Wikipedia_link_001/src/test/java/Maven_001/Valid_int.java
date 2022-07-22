package Maven_001;

import java.util.Scanner;

public class Valid_int {

	public static void main(String[] args)
	
	
	 {
		int n = 20;
		
		Scanner rdnum= new Scanner(System.in);
		System.out.println("Enter the number between 1 to 20");
		  
		
			int num =rdnum.nextInt();
			if (num<=n)
			
			{
			System.out.println("You entered the valid number" +num);
	 }
			else	
			{
			System.out.println("you entered invalid number" +num);
			}
	
	 }


}
		
		
	