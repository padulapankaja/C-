package q1;
import java.util.Scanner;


public class Main {
	private static Scanner scan;

	
	
	
	public static void main(String[] args)
	{
		Menu m1 = new Menu();
		Conversion con = new Conversion();
		
		m1.displayConversionSubMenu();
		
					scan = new Scanner(System.in);
					System.out.print("Enter Your Option");
						
					int n = scan.nextInt();
					while(n!=0){
						scan = new Scanner(System.in);
						System.out.print("Enter Your Option");	
						int nn = scan.nextInt();
							if(nn== 1 | nn==2 | nn== 3 |nn== 4 | nn== 5| nn== 6 | nn==0 )
							{
								System.out.print("Enter Your Value");
								float  values = scan.nextFloat();
						
						
								switch(nn)
								{
								case 1: System.out.println("Grams To Ounces ");
										con.GramsToOunces(values);
										break;
								case 2: System.out.println("Oun To Grams");
										con.GramsToOunces(values);
										break;
								case 3: System.out.println("Kg To Stone ");
										con.GramsToOunces(values);
										break;
								case 4: System.out.println("Stone To Kg");
										con.GramsToOunces(values);
										break;
								case 5: System.out.println("Pounds To Gram");
										con.GramsToOunces(values);
										break;
								case 6: System.out.println("Gram To Pound");
										con.GramsToOunces(values);
										break;
								case 0 :
									
									 System.exit(0);
									 break;
								}
								m1.displayConversionSubMenu();
					}
					else {	
					System.out.println("Enter Valid Option");
					continue;
					}
		}
					
	}
}
