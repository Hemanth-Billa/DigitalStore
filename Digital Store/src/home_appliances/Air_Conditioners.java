package home_appliances;

import java.util.Scanner;

import home_screen.Main_Home;

public class Air_Conditioners 
{
	public static String ob[]=new String[100];
	public static float ob1[]=new float[100];static int i=0;
	static Scanner sc  = new Scanner(System.in); private static final String RESET = "\033[0m";  // Text Reset
	static boolean b=true;
	public static void AirConditioners()
	{ System.out.println(RESET);
		System.out.println();
		System.out.println("\t\t\t"+"    @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@   \r\n"
				+"\t\t\t"+ "   @@@                                                                                         @@@\r\n"
				+"\t\t\t"+"   @@@                            * AIR CONDITIONERS *                                         @@@    \r\n"
				+"\t\t\t"+ "   @@@                                                                                         @@@  \r\n"
				+"\t\t\t"+ "   @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@  \r\n"
				+"\t\t\t"+ "   @@@                                                               (@@@................@@@   @@@  \r\n"
				+"\t\t\t"+ "   @@@                     1. 1 TON AIR CONDITIONERS                 (@@@@@@@@@@@@@@@@@@@@@@   @@@  \r\n"
				+"\t\t\t"+ "   @@@                     2. 1.5 TON AIR CONDITIONERS                (@@@@@@@@@@@@@@@@@@@@    @@@  \r\n"
				+"\t\t\t"+ "   @@@                     3. EXIT FROM AIR CONDITIONERS                                       @@@  \r\n"
				+"\t\t\t"+ "   @@@                                                               (@@@@@@*(@@@@@@*#@@@@@@   @@@  \r\n"
				+"\t\t\t"+ "   @@@                                                                                         @@@  \r\n"
				+"\t\t\t"+ "   @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@  \r\n"
				+"\t\t\t"+ "   @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@  \r\n"
				+"\t\t\t"+ "   @@@                                                                                         @@@  \r\n"
				+"\t\t\t"+ "   @@@       (@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#       @@@  \r\n"
				+"\t\t\t"+ "   @@@      @@@&                                                                     &@@@      @@@  \r\n"
				+"\t\t\t"+ "   @@@@     @@@&                                                                     %@@@     @@@@  \r\n"
				+"\t\t\t"+ "     %@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%    \r\n"
				+"\t\t\t"+ "                      .@.                                                   .@,                     \r\n"
				+"\t\t\t"+ "                      @@@         .@@@        @@@   @@@        &@@.         @@@                     \r\n"
				+"\t\t\t"+ "                      @@@         .@@@        @@@   @@@        @@@,         @@@                     \r\n"
				+"\t\t\t"+ "                      @@@         .@@@        @@@   @@@        @@@.         @@@                     \r\n"
				+"\t\t\t"+ "             @@@@@@@@@@@#         .@@@        @@@   @@@        @@@,         (@@@@@@@@@@@.           \r\n"
				+"\t\t\t"+ "             #%%%%%%%/            .@@@        @@@   @@@        @@@,            *%%%%%%%#            \r\n"
				+"\t\t\t"+ "                                  %@@@        @@@   @@@        @@@@                                 \r\n"
				+"\t\t\t"+ "                       (@@@@@@@@@@@@/         @@@   @@@         *@@@@@@@@@@@@%                      \r\n"
				+"\t\t\t"+ "                                             ,@@@   @@@,                                            \r\n"
				+"\t\t\t"+ "                                            &@@@     @@@@                                           \r\n"
				+"\t\t\t"+ "                                    @@@@@@@@@@.       .@@@@@@@@@@");
		 System.out.println(RESET);
		System.out.println();
		purchase();
	}
//======================================================================================================================================================
	public static void purchase()
	{
		System.out.print("PLEASE SELECT YOUR PREFERRED MODEL[1-3] : ");
		boolean b=true;
		do
		{
			int c=sc.nextInt();
			switch(c)
			{
			case 1:ton1menu(); b=false; break;
			case 2:ton1_5menu(); b=false; break;
			case 3:Main_Home.home$Appliances(); b=false; break;
			default: 
				{
					System.out.println();
					System.out.print("\t\t\t\t\t\t\t\t "+"PLEASE ENTER VALID OPTION..."+"\n");
					System.out.println();
			        AirConditioners();
				}
			}
		}while(b==true);
	}
	
//==============================================================================================================================================
	
	public static void ton1menu()
	{ System.out.println(RESET);
		 System.out.println("\t\t\t\t\t\t"+"                      1 TON AIR CONDITIONERS                           ");  
		 System.out.println("\t\t\t\t\t\t"+"                   ---------------------------                      ");  
		 System.out.println("\t\t\t\t\t\t"+"                       1.Between 25k - 30k                         ");  
		 System.out.println("\t\t\t\t\t\t"+"                       2.Between 30k - 40k                   ");
		 System.out.println("\t\t\t\t\t\t"+"                       3.EXIT FROM 1 TON ");
		 System.out.println(RESET); ton1switch();
	}
//==============================================================================================================================================	
	

	public static void ton1switch()
	{
		System.out.print("PLEASE ENTER THE PRICE RANGE  :");
		 
		 do
		 {
			int p=sc.nextInt();
			switch(p) 
			{
			case 1: ton1_25k30k(); b=false; break;
			case 2: ton1_30k40k();  b=false; break;
			case 3: AirConditioners();b=false; break;
		    default:
		    	{
		    		System.out.println("Please enter valid option.");
		    		ton1menu(); 
		    	}
			}
		 }while(b==true);
	}
//==============================================================================================================================================
	public static void ton1_25k30k()
	{ System.out.println(RESET);
		 System.out.println("\t   "+" _________________________________________________________________________________________________________________________________");    
		 System.out.println("\t   "+"|                                                                                                                                 |");  
		 System.out.println("\t   "+"|            _________________________                _________________________             _________________________             |");  
		 System.out.println("\t   "+"|           |  GODREJ  3 STAR AC      |              |     HAIER 4 STAR AC     |           |   SAMSUNG 3 STAR AC     |            |");  
		 System.out.println("\t   "+"|           |-------------------------|              |-------------------------|           |-------------------------|            |");  
		 System.out.println("\t   "+"|           |.SplitAcStyle : Compact  |              |.SplitAcStyle : Compact  |           |.SplitAcStyle : Compact  |            |");  
		 System.out.println("\t   "+"|           |.Brand     : Godrej      |              |.Brand     : Haier       |           |.Brand     : Samsung     |            |");  
		 System.out.println("\t   "+"|           |.Height    : 22.2        |              |.Height    : 23.2        |           |.Height    : 22.2        |            |");  
		 System.out.println("\t   "+"|           |.Width main: 80cm        |              |.Width main: 80cm        |           |.Width main: 80cm        |            |");  
		 System.out.println("\t   "+"|           |.Colour    : White       |              |.Colour    : White       |           |.Colour    : White       |            |");  
		 System.out.println("\t   "+"|           |.BEE STAR  : 3star       |              |.BEE STAR  : 4star       |           |.BEE STAR  : 3star       |            |");  
		 System.out.println("\t   "+"|           |.Warranty  : 1Year       |              |.Warranty  : 5Year       |           |.Warranty  : 1Year       |            |");  
		 System.out.println("\t   "+"|           |.PRICE     : 28,990/-    |              |.PRICE     : 26,990/-    |           |.PRICE     : 25,990/-    |            |");  
		 System.out.println("\t   "+"|           |_________________________|              |_________________________|           |_________________________|            |");  
		 System.out.println("\t   "+"|                                                                                                                                 |");   
		 System.out.println("\t   "+"|                       1.                                        2.                                   3.                         |");  
		 System.out.println("\t   "+"|                                                                                                                                 |");  
		 System.out.println("\t   "+"|            _________________________                _________________________             _________________________             |");  
		 System.out.println("\t   "+"|           |  KELVINATOR 4 STAR AC   |              |    HISENSE 3 STAR AC    |           |                         |            |");  
		 System.out.println("\t   "+"|           |-------------------------|              |-------------------------|           |                         |            |");  
		 System.out.println("\t   "+"|           |.SplitAcStyle : Compact  |              |.SplitAcStyle : Compact  |           |                         |            |");  
		 System.out.println("\t   "+"|           |.Brand     : Kelvinator  |              |.Brand     : Hisense     |           |                         |            |");  
		 System.out.println("\t   "+"|           |.Height    : 23.2        |              |.Height    : 22.2        |           |         Exit            |            |");  
		 System.out.println("\t   "+"|           |.Width main: 80cm        |              |.Width main: 80cm        |           |                         |            |");  
		 System.out.println("\t   "+"|           |.Colour    : White       |              |.Colour    : White       |           |                         |            |");  
		 System.out.println("\t   "+"|           |.BEE STAR  : 4star       |              |.BEE STAR  : 3star       |           |                         |            |");  
		 System.out.println("\t   "+"|           |.Warranty  : 3Year       |              |.Warranty  : 1Year       |           |                         |            |");  
		 System.out.println("\t   "+"|           |.Price     : 29,990/-    |              |.Price     : 28,990/-    |           |                         |            |");  
		 System.out.println("\t   "+"|           |_________________________|              |_________________________|           |_________________________|            |");  
		 System.out.println("\t   "+"|                                                                                                                                 |");    
		 System.out.println("\t   "+"|                      4.                                         5.                                     6.                       |");  	 
		 System.out.println("\t   "+"|_________________________________________________________________________________________________________________________________|");
		 
		 System.out.println(RESET); ton1_25k30kswitch(); 
	}
//==============================================================================================================================================
	public static void ton1_25k30kswitch()
	{
		System.out.println("PLEASE CHOOSE YOUR PREFERRED MODEL :");
		   do
		   {
			   int m=sc.nextInt();
			   switch(m)
			   {
			   case 1:
				 {
					 System.out.print("Do you want to add it to cart [y/n or Y/N]:"); //MADE CHANGES
					 do
					 {
						 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c)
						 {
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="GODREJ 3 STAR AC";  ob1[i++]=28990; 
						          System.out.print("Do you want to continue shopping in this Budget (Between 25k - 30k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
				 		  do
				 		  {
				 			char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
				 			switch(c1)	
							{
							case 'y':ton1_25k30k(); b=false; break; // MADE CHANGES HEREE
							case 'n':ton1menu(); b=false; break; // MADE CHANGES HEREE
				 			default : System.out.print("Please enter valid option: ");
							}
				 		  }while(b==true);  break;
						 case 'n':
							 {
								 System.out.print("Do you want to see another model in this Budget (Between 25k - 30k) [y/n or Y/N]:");  //MADE CHANGES HERE
									do
									{
										char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									switch(c1)	
									{
									case 'y':ton1_25k30k(); b=false; break;
									case 'n':
										{
											System.out.print("Do you want to continue in 1 TON AIR CONDITIONERS [y/n or Y/N]:"); //MADE CHANGES HERE
											do 
											{
												char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
												switch(c2)
												{
												case 'y': ton1menu(); b=false; break;
												case 'n': AirConditioners(); b=false; break;
												default:System.out.print("Please enter valid option:"); 
												}
											}while(b==true); b=false; break;
											
										}
									default:System.out.print("Please enter valid option:");
									}
									}while(b==true);  b=false; break;
							 }
						 default:  System.out.print("Please enter valid option:");
						 
						 }
					 }while(b==true);  b=false; break;
				 }
			   case 2:
			   {
				   System.out.print("Do you want to add it to cart [y/n or Y/N]:"); //MADE CHANGES
				   do
				   {
					   char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					   switch(c)
					   {
					   case 'y':System.out.println("Your Item is added to cart .");  ob[i]="HAIER 4 STAR AC" ;  ob1[i++]=26990;
					   System.out.print("Do you want to continue shopping in this Budget (Between 25k - 30k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						   switch(c1)	
						   {
						   case 'y':ton1_25k30k(); b=false; break; // MADE CHANGES HEREE
						   case 'n':ton1menu(); b=false; break; // MADE CHANGES HEREE
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);  break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this Budget (Between 25k - 30k) [y/n or Y/N]:");  //MADE CHANGES HERE
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							   switch(c1)	
							   {
							   case 'y':ton1_25k30k(); b=false; break;
							   case 'n':
							   {
								   System.out.print("Do you want to continue in 1 TON AIR CONDITIONERS [y/n or Y/N]:"); //MADE CHANGES HERE
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c2)
									   {
									   case 'y': ton1menu(); b=false; break;
									   case 'n': AirConditioners(); b=false; break;
									   default:System.out.print("Please enter valid option:"); 
									   }
								   }while(b==true); b=false; break;
								   
							   }
							   default:System.out.print("Please enter valid option:");
							   }
						   }while(b==true);  b=false; break;
					   }
					   default:  System.out.print("Please enter valid option:");
					   
					   }
				   }while(b==true);  b=false; break;
			   }
			   case 3:
			   {
				   System.out.print("Do you want to add it to cart [y/n or Y/N]:"); //MADE CHANGES
				   do
				   {
					   char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					   switch(c)
					   {
					   case 'y':System.out.println("Your Item is added to cart .");  ob[i]="SAMSUNG 3 STAR AC" ; ob1[i++]=25990;
					   System.out.print("Do you want to continue shopping in this Budget (Between 25k - 30k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						   switch(c1)	
						   {
						   case 'y':ton1_25k30k(); b=false; break; // MADE CHANGES HEREE
						   case 'n':ton1menu(); b=false; break; // MADE CHANGES HEREE
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);  break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this Budget (Between 25k - 30k) [y/n or Y/N]:");  //MADE CHANGES HERE
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							   switch(c1)	
							   {
							   case 'y':ton1_25k30k(); b=false; break;
							   case 'n':
							   {
								   System.out.print("Do you want to continue in 1 TON AIR CONDITIONERS [y/n or Y/N]:"); //MADE CHANGES HERE
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c2)
									   {
									   case 'y': ton1menu(); b=false; break;
									   case 'n': AirConditioners(); b=false; break;
									   default:System.out.print("Please enter valid option:"); 
									   }
								   }while(b==true); b=false; break;
								   
							   }
							   default:System.out.print("Please enter valid option:");
							   }
						   }while(b==true);  b=false; break;
					   }
					   default:  System.out.print("Please enter valid option:");
					   
					   }
				   }while(b==true);  b=false; break;
			   }
			   case 4:
			   {
				   System.out.print("Do you want to add it to cart [y/n or Y/N]:"); //MADE CHANGES
				   do
				   {
					   char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					   switch(c)
					   {
					   case 'y':System.out.println("Your Item is added to cart .");  ob[i]="KELVINATOR 4 STAR AC";   ob1[i++]=29990;
					   System.out.print("Do you want to continue shopping in this Budget (Between 25k - 30k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						   switch(c1)	
						   {
						   case 'y':ton1_25k30k(); b=false; break; // MADE CHANGES HEREE
						   case 'n':ton1menu(); b=false; break; // MADE CHANGES HEREE
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);  break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this Budget (Between 25k - 30k) [y/n or Y/N]:");  //MADE CHANGES HERE
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							   switch(c1)	
							   {
							   case 'y':ton1_25k30k(); b=false; break;
							   case 'n':
							   {
								   System.out.print("Do you want to continue in 1 TON AIR CONDITIONERS [y/n or Y/N]:"); //MADE CHANGES HERE
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c2)
									   {
									   case 'y': ton1menu(); b=false; break;
									   case 'n': AirConditioners(); b=false; break;
									   default:System.out.print("Please enter valid option:"); 
									   }
								   }while(b==true); b=false; break;
								   
							   }
							   default:System.out.print("Please enter valid option:");
							   }
						   }while(b==true);  b=false; break;
					   }
					   default:  System.out.print("Please enter valid option:");
					   
					   }
				   }while(b==true);  b=false; break;
			   }
			   case 5:
			   {
				   System.out.print("Do you want to add it to cart [y/n or Y/N]:"); //MADE CHANGES
				   do
				   {
					   char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					   switch(c)
					   {
					   case 'y':System.out.println("Your Item is added to cart .");  ob[i]="HISENSE 3 STAR AC"; ob1[i++]=28990;
					   System.out.print("Do you want to continue shopping in this Budget (Between 25k - 30k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						   switch(c1)	
						   {
						   case 'y':ton1_25k30k(); b=false; break; // MADE CHANGES HEREE
						   case 'n':ton1menu(); b=false; break; // MADE CHANGES HEREE
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);  break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this Budget (Between 25k - 30k) [y/n or Y/N]:");  //MADE CHANGES HERE
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							   switch(c1)	
							   {
							   case 'y':ton1_25k30k(); b=false; break;
							   case 'n':
							   {
								   System.out.print("Do you want to continue in 1 TON AIR CONDITIONERS [y/n or Y/N]:"); //MADE CHANGES HERE
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c2)
									   {
									   case 'y': ton1menu(); b=false; break;
									   case 'n': AirConditioners(); b=false; break;
									   default:System.out.print("Please enter valid option:"); 
									   }
								   }while(b==true); b=false; break;
								   
							   }
							   default:System.out.print("Please enter valid option:");
							   }
						   }while(b==true);  b=false; break;
					   }
					   default:  System.out.print("Please enter valid option:");
					   
					   }
				   }while(b==true);  b=false; break;
			   }
			   case 6:ton1menu(); b=false; break;
			   default: System.out.print("PLEASE ENTER VALID OPTION: ");
			   }
		   }while(b==true); 
	   }
	
//==============================================================================================================================================
	public static void ton1_30k40k()
	{ System.out.println(RESET);
		 System.out.println("\t   "+" _________________________________________________________________________________________________________________________________");     
		 System.out.println("\t   "+"|                                                                                                                                 |");  
		 System.out.println("\t   "+"|                                                                                                                                 |");  
		 System.out.println("\t   "+"|            _________________________                _________________________             _________________________             |");  
		 System.out.println("\t   "+"|           |   SAMSUNG 3 STAR AC     |              |   KELVINATOR 4 STAR AC  |           |   SAMSUNG 4 STAR AC     |            |");  
		 System.out.println("\t   "+"|           |-------------------------|              |-------------------------|           |-------------------------|            |");  
		 System.out.println("\t   "+"|           |.SplitAcStyle : Compact  |              |.SplitAcStyle : Compact  |           |.SplitAcStyle : Compact  |            |");  
		 System.out.println("\t   "+"|           |.Brand     : Samsung     |              |.Brand     : Kelvinator  |           |.Brand     : Samsung     |            |");  
		 System.out.println("\t   "+"|           |.Height    : 26.2        |              |.Height    : 23.2        |           |.Height    : 22.2        |            |");  
		 System.out.println("\t   "+"|           |.Width main: 82cm        |              |.Width main: 87cm        |           |.Width main: 82cm        |            |");  
		 System.out.println("\t   "+"|           |.Colour    : White       |              |.Colour    : White       |           |.Colour    : White       |            |");  
		 System.out.println("\t   "+"|           |.BEE STAR  : 3star       |              |.BEE STAR  : 4star       |           |.BEE STAR  : 4star       |            |");  
		 System.out.println("\t   "+"|           |.Warranty  : 4Year       |              |.Warranty  : 5Year       |           |.Warranty  : 1Year       |            |");  
		 System.out.println("\t   "+"|           |.PRICE     : 30,490/-    |              |.Price     : 35,990/-    |           |.Price     : 33,990/-    |            |");  
		 System.out.println("\t   "+"|           |_________________________|              |_________________________|           |_________________________|            |");  
		 System.out.println("\t   "+"|                                                                                                                                 |");   
		 System.out.println("\t   "+"|                        1.                                        2.                                    3.                       |");  
		 System.out.println("\t   "+"|                                                                                                                                 |");  
		 System.out.println("\t   "+"|            _________________________                _________________________             ________________________              |");  
		 System.out.println("\t   "+"|           |  KELVINATOR 3 STAR AC   |              |   SAMSUNG 5 STAR AC     |           |                        |             |");  
		 System.out.println("\t   "+"|           |-------------------------|              |-------------------------|           |                        |             |");  
		 System.out.println("\t   "+"|           |.SplitAcStyle : Compact  |              |.SplitAcStyle : Compact  |           |                        |             |");  
		 System.out.println("\t   "+"|           |.Brand     : Kelvinator  |              |.Brand     : Samsung     |           |                        |             |");  
		 System.out.println("\t   "+"|           |.Height    : 23.2        |              |.Height    : 22.2        |           |         Exit           |             |");  
		 System.out.println("\t   "+"|           |.Width main: 87cm        |              |.Width main: 80cm        |           |       ---------        |             |");  
		 System.out.println("\t   "+"|           |.Colour    : White       |              |.Colour    : White       |           |                        |             |");  
		 System.out.println("\t   "+"|           |.BEE STAR  : 3star       |              |.BEE STAR  : 5star       |           |                        |             |");  
		 System.out.println("\t   "+"|           |.Warranty  : 3Year       |              |.Warranty  : 1Year       |           |                        |             |");  
		 System.out.println("\t   "+"|           |.Price     : 39,990/-    |              |.PRICE     : 38,990/-    |           |                        |             |");  
		 System.out.println("\t   "+"|           |_________________________|              |_________________________|           |________________________|             |");  
		 System.out.println("\t   "+"|                                                                                                                                 |");    
		 System.out.println("\t   "+"|                        4.                                       5.                                    6.                        |");  
		 System.out.println("\t   "+"|                                                                                                                                 |");  	 
		 System.out.println("\t   "+"|_________________________________________________________________________________________________________________________________|");   
		 System.out.println(RESET); ton1_30k40kswitch(); 
	}
//================================================================================================================================================
	public static void ton1_30k40kswitch()
	{
		System.out.println("PLEASE CHOOSE YOUR PREFERRED MODEL :");
		   do
		   {
			   int m=sc.nextInt();
			   switch(m)
			   {
			   case 1:
			   {
				   System.out.print("Do you want to add it to cart [y/n or Y/N]:"); //MADE CHANGES
				   do
				   {
					   char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					   switch(c)
					   {
					   case 'y':System.out.println("Your Item is added to cart .");  ob[i]="SAMSUNG 3 STAR AC";  ob1[i++]=30490;
					   System.out.print("Do you want to continue shopping in this Budget (Between 30k - 40k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						   switch(c1)	
						   {
						   case 'y':ton1_30k40k(); b=false; break; // MADE CHANGES HEREE
						   case 'n':ton1menu(); b=false; break; // MADE CHANGES HEREE
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);  break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this Budget (Between 30k - 40k) [y/n or Y/N]:");  //MADE CHANGES HERE
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							   switch(c1)	
							   {
							   case 'y':ton1_30k40k(); b=false; break; //MADE CHANGES HERE
							   case 'n':
							   {
								   System.out.print("Do you want to continue in 1 TON AIR CONDITIONERS [y/n or Y/N]:"); //MADE CHANGES HERE
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c2)
									   {
									   case 'y': ton1menu(); b=false; break;
									   case 'n': AirConditioners(); b=false; break;
									   default:System.out.print("Please enter valid option:"); 
									   }
								   }while(b==true); b=false; break;
								   
							   }
							   default:System.out.print("Please enter valid option:");
							   }
						   }while(b==true);  b=false; break;
					   }
					   default:  System.out.print("Please enter valid option:");
					   
					   }
				   }while(b==true);  b=false; break;
			   }
			   case 2:
			   {
				   System.out.print("Do you want to add it to cart [y/n or Y/N]:"); //MADE CHANGES
				   do
				   {
					   char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					   switch(c)
					   {
					   case 'y':System.out.println("Your Item is added to cart .");  ob[i]="KELVINATOR 4 STAR AC";  ob1[i++]=35990;
					   System.out.print("Do you want to continue shopping in this Budget (Between 30k - 40k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						   switch(c1)	
						   {
						   case 'y':ton1_30k40k(); b=false; break; // MADE CHANGES HEREE
						   case 'n':ton1menu(); b=false; break; // MADE CHANGES HEREE
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);  break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this Budget (Between 30k - 40k) [y/n or Y/N]:");  //MADE CHANGES HERE
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							   switch(c1)	
							   {
							   case 'y':ton1_30k40k(); b=false; break; //MADE CHANGES HERE
							   case 'n':
							   {
								   System.out.print("Do you want to continue in 1 TON AIR CONDITIONERS [y/n or Y/N]:"); //MADE CHANGES HERE
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c2)
									   {
									   case 'y': ton1menu(); b=false; break;
									   case 'n': AirConditioners(); b=false; break;
									   default:System.out.print("Please enter valid option:"); 
									   }
								   }while(b==true); b=false; break;
								   
							   }
							   default:System.out.print("Please enter valid option:");
							   }
						   }while(b==true);  b=false; break;
					   }
					   default:  System.out.print("Please enter valid option:");
					   
					   }
				   }while(b==true);  b=false; break;
			   }
			   case 3:
			   {
				   System.out.print("Do you want to add it to cart [y/n or Y/N]:"); //MADE CHANGES
				   do
				   {
					   char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					   switch(c)
					   {
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SAMSUNG 4 STAR AC"; ob1[i++]=33990;
					   System.out.print("Do you want to continue shopping in this Budget (Between 30k - 40k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						   switch(c1)	
						   {
						   case 'y':ton1_30k40k(); b=false; break; // MADE CHANGES HEREE
						   case 'n':ton1menu(); b=false; break; // MADE CHANGES HEREE
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);  break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this Budget (Between 30k - 40k) [y/n or Y/N]:");  //MADE CHANGES HERE
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							   switch(c1)	
							   {
							   case 'y':ton1_30k40k(); b=false; break; //MADE CHANGES HERE
							   case 'n':
							   {
								   System.out.print("Do you want to continue in 1 TON AIR CONDITIONERS [y/n or Y/N]:"); //MADE CHANGES HERE
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c2)
									   {
									   case 'y': ton1menu(); b=false; break;
									   case 'n': AirConditioners(); b=false; break;
									   default:System.out.print("Please enter valid option:"); 
									   }
								   }while(b==true); b=false; break;
								   
							   }
							   default:System.out.print("Please enter valid option:");
							   }
						   }while(b==true);  b=false; break;
					   }
					   default:  System.out.print("Please enter valid option:");
					   
					   }
				   }while(b==true);  b=false; break;
			   }
			   case 4:
			   {
				   System.out.print("Do you want to add it to cart [y/n or Y/N]:"); //MADE CHANGES
				   do
				   {
					   char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					   switch(c)
					   {
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="KELVINATOR 3 STAR AC";  ob1[i++]=39990;
					   System.out.print("Do you want to continue shopping in this Budget (Between 30k - 40k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						   switch(c1)	
						   {
						   case 'y':ton1_30k40k(); b=false; break; // MADE CHANGES HEREE
						   case 'n':ton1menu(); b=false; break; // MADE CHANGES HEREE
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);  break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this Budget (Between 30k - 40k) [y/n or Y/N]:");  //MADE CHANGES HERE
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							   switch(c1)	
							   {
							   case 'y':ton1_30k40k(); b=false; break; //MADE CHANGES HERE
							   case 'n':
							   {
								   System.out.print("Do you want to continue in 1 TON AIR CONDITIONERS [y/n or Y/N]:"); //MADE CHANGES HERE
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c2)
									   {
									   case 'y': ton1menu(); b=false; break;
									   case 'n': AirConditioners(); b=false; break;
									   default:System.out.print("Please enter valid option:"); 
									   }
								   }while(b==true); b=false; break;
								   
							   }
							   default:System.out.print("Please enter valid option:");
							   }
						   }while(b==true);  b=false; break;
					   }
					   default:  System.out.print("Please enter valid option:");
					   
					   }
				   }while(b==true);  b=false; break;
			   }
			   case 5:
			   {
				   System.out.print("Do you want to add it to cart [y/n or Y/N]:"); //MADE CHANGES
				   do
				   {
					   char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					   switch(c)
					   {
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SAMSUNG 5 STAR AC"; ob1[i++]=38990;
					   System.out.print("Do you want to continue shopping in this Budget (Between 30k - 40k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						   switch(c1)	
						   {
						   case 'y':ton1_30k40k(); b=false; break; // MADE CHANGES HEREE
						   case 'n':ton1menu(); b=false; break; // MADE CHANGES HEREE
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);  break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this Budget (Between 30k - 40k) [y/n or Y/N]:");  //MADE CHANGES HERE
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							   switch(c1)	
							   {
							   case 'y':ton1_30k40k(); b=false; break; //MADE CHANGES HERE
							   case 'n':
							   {
								   System.out.print("Do you want to continue in 1 TON AIR CONDITIONERS [y/n or Y/N]:"); //MADE CHANGES HERE
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c2)
									   {
									   case 'y': ton1menu(); b=false; break;
									   case 'n': AirConditioners(); b=false; break;
									   default:System.out.print("Please enter valid option:"); 
									   }
								   }while(b==true); b=false; break;
								   
							   }
							   default:System.out.print("Please enter valid option:");
							   }
						   }while(b==true);  b=false; break;
					   }
					   default:  System.out.print("Please enter valid option:");
					   
					   }
				   }while(b==true);  b=false; break;
			   }
			   case 6:ton1menu(); b=false; break;
			   default: System.out.print("PLEASE ENTER VALID OPTION: ");
			   }
		   }while(b==true); 
	}
//==============================================================================================================================================	

	public static void ton1_5menu()
	{ System.out.println(RESET);
		System.out.println("\t\t\t\t\t\t"+"                      1.5 TON AIR CONDITIONERS                            ");  
		 System.out.println("\t\t\t\t\t\t"+"                   ---------------------------                      ");  
		 System.out.println("\t\t\t\t\t\t"+"                      1.Between 30k - 40k                         ");  
		 System.out.println("\t\t\t\t\t\t"+"                      2.Between 40k - 60k                   ");
		 System.out.println("\t\t\t\t\t\t"+"                      3.EXIT  FROM 1.5 TON                              ");
		 System.out.println(RESET);	 ton1_5switch();
	}
//===================================================================================================================================================
	public static void ton1_5switch()
	{
		System.out.print("PLEASE ENTER THE PRICE RANGE  :");
		 
		 do
		 {
			int p=sc.nextInt();
			switch(p) 
			{
			case 1: ton1_5_30k40k(); b=false; break;
			case 2: ton1_5_40k60k();  b=false; break;
			case 3: AirConditioners();b=false; break;
		    default:
		    	{
		    		System.out.println("Please enter valid option.");
		    		ton1_5menu(); 
		    	}
			}
		 }while(b==true);
	}
//===================================================================================================================================================

	public static void ton1_5_30k40k()
	{ System.out.println(RESET);
		 System.out.println("\t   "+" _________________________________________________________________________________________________________________________________");     
		 System.out.println("\t   "+"|                                                                                                                                 |");  
		 System.out.println("\t   "+"|           _________________________               _________________________              _________________________              |");  
		 System.out.println("\t   "+"|          |  HISENSE 4 STAR AC      |             |    HAIER 5 STAR AC      |            |  PANASONIC 3 STAR AC    |             |");  
		 System.out.println("\t   "+"|          |-------------------------|             |-------------------------|            |-------------------------|             |");  
		 System.out.println("\t   "+"|          |.SplitAcStyle : Compact  |             |.SplitAcStyle : Compact  |            |.SplitAcStyle : Compact  |             |");  
		 System.out.println("\t   "+"|          |.Brand     : Hisense     |             |.Brand     : Haier       |            |.Brand     : Panasonic   |             |");  
		 System.out.println("\t   "+"|          |.Height    : 27.2        |             |.Height    : 55cm        |            |.Height    : 22.2        |             |");  
		 System.out.println("\t   "+"|          |.Width main: 82cm        |             |.Width main: 91cm        |            |.Width main: 82cm        |             |");  
		 System.out.println("\t   "+"|          |.Colour    : White       |             |.Colour    : White       |            |.Colour    : White       |             |");  
		 System.out.println("\t   "+"|          |.BEE STAR  : 4star       |             |.BEE STAR  : 3star       |            |.BEE STAR  : 3star       |             |");  
		 System.out.println("\t   "+"|          |.Warranty  : 4Year       |             |.Warranty  : 5Year       |            |.Warranty  : 1Year       |             |");  
		 System.out.println("\t   "+"|          |.PRICE     : 30,490/-    |             |.PRICE     : 34,990/-    |            |.PRICE     : 33,990/-    |             |");  
		 System.out.println("\t   "+"|          |_________________________|             |_________________________|            |_________________________|             |");  
		 System.out.println("\t   "+"|                                                                                                                                 |");   
		 System.out.println("\t   "+"|                    1.                                        2.                                      3.                         |");  
		 System.out.println("\t   "+"|                                                                                                                                 |");  
		 System.out.println("\t   "+"|           _________________________               _________________________              _________________________              |");  
		 System.out.println("\t   "+"|          |     HAIER 4 STAR AC     |             |  KELVINATOR 5 STAR AC   |            |                         |             |");  
		 System.out.println("\t   "+"|          |-------------------------|             |-------------------------|            |                         |             |");  
		 System.out.println("\t   "+"|          |.SplitAcStyle : Compact  |             |.SplitAcStyle : Compact  |            |                         |             |");  
		 System.out.println("\t   "+"|          |.Brand     : Haier       |             |.Brand     : Kelvinator  |            |                         |             |");  
		 System.out.println("\t   "+"|          |.Height    : 23.2        |             |.Height    : 22.2        |            |         Exit            |             |");  
		 System.out.println("\t   "+"|          |.Width main: 87cm        |             |.Width main: 80cm        |            |       -----------       |             |");  
		 System.out.println("\t   "+"|          |.Colour    : White       |             |.Colour    : White       |            |                         |             |");  
		 System.out.println("\t   "+"|          |.BEE STAR  : 4star       |             |.BEE STAR  : 5star       |            |                         |             |");  
		 System.out.println("\t   "+"|          |.Warranty  : 3Year       |             |.Warranty  : 1Year       |            |                         |             |");  
		 System.out.println("\t   "+"|          |.PRICE     : 36,990/-    |             |.PRICE     : 38,990/-    |            |                         |             |");  
		 System.out.println("\t   "+"|          |_________________________|             |_________________________|            |_________________________|             |");  
		 System.out.println("\t   "+"|                                                                                                                                 |");    
		 System.out.println("\t   "+"|                     4.                                       5.                                       6.                        |"); 	 
		 System.out.println("\t   "+"|                                                                                                                                 |"); 	 
		 System.out.println("\t   "+"|_________________________________________________________________________________________________________________________________|");  
		 System.out.println(RESET);	
		 ton1_5_30k40kswitch(); 
	}
//===================================================================================================================================================
	public static void ton1_5_30k40kswitch()
	{
		System.out.println("PLEASE CHOOSE YOUR PREFERRED MODEL :");
		   do
		   {
			   int m=sc.nextInt();
			   switch(m)
			   {
			   case 1:
			   {
				   System.out.print("Do you want to add it to cart [y/n or Y/N]:"); //MADE CHANGES
				   do
				   {
					   char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					   switch(c)
					   {
					   case 'y':System.out.println("Your Item is added to cart .");  ob[i]="HISENSE 4 STAR AC"; ob1[i++]=30490;
					   System.out.print("Do you want to continue shopping in this Budget (Between 30k - 40k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						   switch(c1)	
						   {
						   case 'y':ton1_5_30k40k(); b=false; break; // MADE CHANGES HEREE
						   case 'n':ton1_5menu(); b=false; break; // MADE CHANGES HEREE
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);  break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this Budget (Between 30k - 40k) [y/n or Y/N]:");  //MADE CHANGES HERE
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							   switch(c1)	
							   {
							   case 'y':ton1_5_30k40k(); b=false; break; //MADE CHANGES HERE
							   case 'n':
							   {
								   System.out.print("Do you want to continue in 1.5 TON AIR CONDITIONERS [y/n or Y/N]:"); //MADE CHANGES HERE
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c2)
									   {
									   case 'y': ton1_5menu(); b=false; break;
									   case 'n': AirConditioners(); b=false; break;
									   default:System.out.print("Please enter valid option:"); 
									   }
								   }while(b==true); b=false; break;
								   
							   }
							   default:System.out.print("Please enter valid option:");
							   }
						   }while(b==true);  b=false; break;
					   }
					   default:  System.out.print("Please enter valid option:");
					   
					   }
				   }while(b==true);  b=false; break;
			   }
			   case 2:
			   {
				   System.out.print("Do you want to add it to cart [y/n or Y/N]:"); //MADE CHANGES
				   do
				   {
					   char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					   switch(c)
					   {
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="HAIER 5 STAR AC"; ob1[i++]=34990;
					   System.out.print("Do you want to continue shopping in this Budget (Between 30k - 40k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						   switch(c1)	
						   {
						   case 'y':ton1_5_30k40k(); b=false; break; // MADE CHANGES HEREE
						   case 'n':ton1_5menu(); b=false; break; // MADE CHANGES HEREE
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);  break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this Budget (Between 30k - 40k) [y/n or Y/N]:");  //MADE CHANGES HERE
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							   switch(c1)	
							   {
							   case 'y':ton1_5_30k40k(); b=false; break; //MADE CHANGES HERE
							   case 'n':
							   {
								   System.out.print("Do you want to continue in 1.5 TON AIR CONDITIONERS [y/n or Y/N]:"); //MADE CHANGES HERE
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c2)
									   {
									   case 'y': ton1_5menu(); b=false; break;
									   case 'n': AirConditioners(); b=false; break;
									   default:System.out.print("Please enter valid option:"); 
									   }
								   }while(b==true); b=false; break;
								   
							   }
							   default:System.out.print("Please enter valid option:");
							   }
						   }while(b==true);  b=false; break;
					   }
					   default:  System.out.print("Please enter valid option:");
					   
					   }
				   }while(b==true);  b=false; break;
			   }
			   case 3:
			   {
				   System.out.print("Do you want to add it to cart [y/n or Y/N]:"); //MADE CHANGES
				   do
				   {
					   char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					   switch(c)
					   {
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="PANASONIC 3 STAR AC"; ob1[i++]=33990;
					   System.out.print("Do you want to continue shopping in this Budget (Between 30k - 40k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						   switch(c1)	
						   {
						   case 'y':ton1_5_30k40k(); b=false; break; // MADE CHANGES HEREE
						   case 'n':ton1_5menu(); b=false; break; // MADE CHANGES HEREE
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);  break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this Budget (Between 30k - 40k) [y/n or Y/N]:");  //MADE CHANGES HERE
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							   switch(c1)	
							   {
							   case 'y':ton1_5_30k40k(); b=false; break; //MADE CHANGES HERE
							   case 'n':
							   {
								   System.out.print("Do you want to continue in 1.5 TON AIR CONDITIONERS [y/n or Y/N]:"); //MADE CHANGES HERE
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c2)
									   {
									   case 'y': ton1_5menu(); b=false; break;
									   case 'n': AirConditioners(); b=false; break;
									   default:System.out.print("Please enter valid option:"); 
									   }
								   }while(b==true); b=false; break;
								   
							   }
							   default:System.out.print("Please enter valid option:");
							   }
						   }while(b==true);  b=false; break;
					   }
					   default:  System.out.print("Please enter valid option:");
					   
					   }
				   }while(b==true);  b=false; break;
			   }
			   case 4:
			   {
				   System.out.print("Do you want to add it to cart [y/n or Y/N]:"); //MADE CHANGES
				   do
				   {
					   char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					   switch(c)
					   {
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="HAIER 4 STAR AC"; ob1[i++]=36990;
					   System.out.print("Do you want to continue shopping in this Budget (Between 30k - 40k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						   switch(c1)	
						   {
						   case 'y':ton1_5_30k40k(); b=false; break; // MADE CHANGES HEREE
						   case 'n':ton1_5menu(); b=false; break; // MADE CHANGES HEREE
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);  break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this Budget (Between 30k - 40k) [y/n or Y/N]:");  //MADE CHANGES HERE
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							   switch(c1)	
							   {
							   case 'y':ton1_5_30k40k(); b=false; break; //MADE CHANGES HERE
							   case 'n':
							   {
								   System.out.print("Do you want to continue in 1.5 TON AIR CONDITIONERS [y/n or Y/N]:"); //MADE CHANGES HERE
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c2)
									   {
									   case 'y': ton1_5menu(); b=false; break;
									   case 'n': AirConditioners(); b=false; break;
									   default:System.out.print("Please enter valid option:"); 
									   }
								   }while(b==true); b=false; break;
								   
							   }
							   default:System.out.print("Please enter valid option:");
							   }
						   }while(b==true);  b=false; break;
					   }
					   default:  System.out.print("Please enter valid option:");
					   
					   }
				   }while(b==true);  b=false; break;
			   }
			   case 5:
			   {
				   System.out.print("Do you want to add it to cart [y/n or Y/N]:"); //MADE CHANGES
				   do
				   {
					   char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					   switch(c)
					   {
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="KELVINATOR 5 STAR AC"; ob1[i++]=38990;
					   System.out.print("Do you want to continue shopping in this Budget (Between 30k - 40k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						   switch(c1)	
						   {
						   case 'y':ton1_5_30k40k(); b=false; break; // MADE CHANGES HEREE
						   case 'n':ton1_5menu(); b=false; break; // MADE CHANGES HEREE
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);  break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this Budget (Between 30k - 40k) [y/n or Y/N]:");  //MADE CHANGES HERE
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							   switch(c1)	
							   {
							   case 'y':ton1_5_30k40k(); b=false; break; //MADE CHANGES HERE
							   case 'n':
							   {
								   System.out.print("Do you want to continue in 1.5 TON AIR CONDITIONERS [y/n or Y/N]:"); //MADE CHANGES HERE
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c2)
									   {
									   case 'y': ton1_5menu(); b=false; break;
									   case 'n': AirConditioners(); b=false; break;
									   default:System.out.print("Please enter valid option:"); 
									   }
								   }while(b==true); b=false; break;
								   
							   }
							   default:System.out.print("Please enter valid option:");
							   }
						   }while(b==true);  b=false; break;
					   }
					   default:  System.out.print("Please enter valid option:");
					   
					   }
				   }while(b==true);  b=false; break;
			   }
			   case 6:ton1_5menu(); b=false; break;
			   default: System.out.print("PLEASE ENTER VALID OPTION: ");
			   }
		   }while(b==true); 
	}
//===================================================================================================================================================
	public static void ton1_5_40k60k()
	{ System.out.println(RESET);
		 System.out.println("\t   "+" _________________________________________________________________________________________________________________________________");    
		 System.out.println("\t   "+"|                                                                                                                                 |");  
		 System.out.println("\t   "+"|           _________________________              _________________________              _________________________               |");  
		 System.out.println("\t   "+"|          |  SAMSUNG 4 STAR AC      |            |       LG 3 STAR AC      |            |   SAMSUNG 3 STAR AC     |              |");  
		 System.out.println("\t   "+"|          |-------------------------|            |-------------------------|            |-------------------------|              |");  
		 System.out.println("\t   "+"|          |.SplitAcStyle : Compact  |            |.SplitAcStyle : Compact  |            |.SplitAcStyle : Compact  |              |");  
		 System.out.println("\t   "+"|          |.Brand     : Samsung     |            |.Brand     : LG          |            |.Brand     : Samsung     |              |");  
		 System.out.println("\t   "+"|          |.Height    : 27.2        |            |.Height    : 55cm        |            |.Height    : 22.2        |              |");  
		 System.out.println("\t   "+"|          |.Width main: 82cm        |            |.Width main: 91cm        |            |.Width main: 82cm        |              |");  
		 System.out.println("\t   "+"|          |.Colour    : White       |            |.Colour    : White       |            |.Colour    : White       |              |");  
		 System.out.println("\t   "+"|          |.BEE STAR  : 4star       |            |.BEE STAR  : 3star       |            |.BEE STAR  : 3star       |              |");  
		 System.out.println("\t   "+"|          |.Warranty  : 4Year       |            |.Warranty  : 5Year       |            |.Warranty  : 1Year       |              |");  
		 System.out.println("\t   "+"|          |.PRICE     : 44,490/-    |            |.PRICE     : 53,990/-    |            |.PRICE     : 59,990/-    |              |");  
		 System.out.println("\t   "+"|          |_________________________|            |_________________________|            |_________________________|              |");  
		 System.out.println("\t   "+"|                                                                                                                                 |");   
		 System.out.println("\t   "+"|                       1.                                      2.                                    3.                          |");  
		 System.out.println("\t   "+"|                                                                                                                                 |");  
		 System.out.println("\t   "+"|           _________________________              _________________________              _________________________               |");  
		 System.out.println("\t   "+"|          | PANASONIC  4 STAR AC    |            |  SAMSUNG (2022 LAUNCH)  |            |                         |              |");  
		 System.out.println("\t   "+"|          |-------------------------|            |-------------------------|            |                         |              |");  
		 System.out.println("\t   "+"|          |.SplitAcStyle : Compact  |            |.SplitAcStyle : Compact  |            |                         |              |");  
		 System.out.println("\t   "+"|          |.Brand     : Panasonic   |            |.Brand     : Samsung     |            |                         |              |");  
		 System.out.println("\t   "+"|          |.Height    : 23.2        |            |.Height    : 22.2        |            |          EXIT           |              |");  
		 System.out.println("\t   "+"|          |.Width main: 87cm        |            |.Width main: 80cm        |            |        ---------        |              |");  
		 System.out.println("\t   "+"|          |.Colour    : White       |            |.Colour    : White       |            |                         |              |");  
		 System.out.println("\t   "+"|          |.BEE STAR  : 4star       |            |.BEE STAR  : 5star       |            |                         |              |");  
		 System.out.println("\t   "+"|          |.Warranty  : 3Year       |            |.Warranty  : 1Year       |            |                         |              |");  
		 System.out.println("\t   "+"|          |.PRICE     : 41,990/-    |            |.PRICE     : 58,990/-    |            |                         |              |");  
		 System.out.println("\t   "+"|          |_________________________|            |_________________________|            |_________________________|              |");  
		 System.out.println("\t   "+"|                                                                                                                                 |");    
		 System.out.println("\t   "+"|                       4.                                      5.                                     6.                         |");    
		 System.out.println("\t   "+"|                                                                                                                                 |");  	 
		 System.out.println("\t   "+"|_________________________________________________________________________________________________________________________________|"); 
		 System.out.println(RESET);
		ton1_5_40k60kswitch(); 
	}
//===================================================================================================================================================
	public static void ton1_5_40k60kswitch()
	{
		System.out.println("PLEASE CHOOSE YOUR PREFERRED MODEL :");
		   do
		   {
			   int m=sc.nextInt();
			   switch(m)
			   {
			   case 1:
			   {
				   System.out.print("Do you want to add it to cart [y/n or Y/N]:"); //MADE CHANGES
				   do
				   {
					   char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					   switch(c)
					   {
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SAMSUNG 4 STAR AC"; ob1[i++]=44490;
					   System.out.print("Do you want to continue shopping in this Budget (Between 40k - 60k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						   switch(c1)	
						   {
						   case 'y':ton1_5_40k60k(); b=false; break; // MADE CHANGES HEREE
						   case 'n':ton1_5menu(); b=false; break; // MADE CHANGES HEREE
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);  break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this Budget (Between 40k - 60k) [y/n or Y/N]:");  //MADE CHANGES HERE
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							   switch(c1)	
							   {
							   case 'y':ton1_5_40k60k(); b=false; break; //MADE CHANGES HERE
							   case 'n':
							   {
								   System.out.print("Do you want to continue in 1.5 TON AIR CONDITIONERS [y/n or Y/N]:"); //MADE CHANGES HERE
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c2)
									   {
									   case 'y': ton1_5menu(); b=false; break;
									   case 'n': AirConditioners(); b=false; break;
									   default:System.out.print("Please enter valid option:"); 
									   }
								   }while(b==true); b=false; break;
								   
							   }
							   default:System.out.print("Please enter valid option:");
							   }
						   }while(b==true);  b=false; break;
					   }
					   default:  System.out.print("Please enter valid option:");
					   
					   }
				   }while(b==true);  b=false; break;
			   }
			   case 2:
			   {
				   System.out.print("Do you want to add it to cart [y/n or Y/N]:"); //MADE CHANGES
				   do
				   {
					   char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					   switch(c)
					   {
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="LG 3 STAR AC"; ob1[i++]=53990;
					   System.out.print("Do you want to continue shopping in this Budget (Between 40k - 60k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						   switch(c1)	
						   {
						   case 'y':ton1_5_40k60k(); b=false; break; // MADE CHANGES HEREE
						   case 'n':ton1_5menu(); b=false; break; // MADE CHANGES HEREE
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);  break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this Budget (Between 40k - 60k) [y/n or Y/N]:");  //MADE CHANGES HERE
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							   switch(c1)	
							   {
							   case 'y':ton1_5_40k60k(); b=false; break; //MADE CHANGES HERE
							   case 'n':
							   {
								   System.out.print("Do you want to continue in 1.5 TON AIR CONDITIONERS [y/n or Y/N]:"); //MADE CHANGES HERE
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c2)
									   {
									   case 'y': ton1_5menu(); b=false; break;
									   case 'n': AirConditioners(); b=false; break;
									   default:System.out.print("Please enter valid option:"); 
									   }
								   }while(b==true); b=false; break;
								   
							   }
							   default:System.out.print("Please enter valid option:");
							   }
						   }while(b==true);  b=false; break;
					   }
					   default:  System.out.print("Please enter valid option:");
					   
					   }
				   }while(b==true);  b=false; break;
			   }
			   case 3:
			   {
				   System.out.print("Do you want to add it to cart [y/n or Y/N]:"); //MADE CHANGES
				   do
				   {
					   char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					   switch(c)
					   {
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SAMSUNG 3 STAR AC"; ob1[i++]=59990;
					   System.out.print("Do you want to continue shopping in this Budget (Between 40k - 60k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						   switch(c1)	
						   {
						   case 'y':ton1_5_40k60k(); b=false; break; // MADE CHANGES HEREE
						   case 'n':ton1_5menu(); b=false; break; // MADE CHANGES HEREE
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);  break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this Budget (Between 40k - 60k) [y/n or Y/N]:");  //MADE CHANGES HERE
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							   switch(c1)	
							   {
							   case 'y':ton1_5_40k60k(); b=false; break; //MADE CHANGES HERE
							   case 'n':
							   {
								   System.out.print("Do you want to continue in 1.5 TON AIR CONDITIONERS [y/n or Y/N]:"); //MADE CHANGES HERE
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c2)
									   {
									   case 'y': ton1_5menu(); b=false; break;
									   case 'n': AirConditioners(); b=false; break;
									   default:System.out.print("Please enter valid option:"); 
									   }
								   }while(b==true); b=false; break;
								   
							   }
							   default:System.out.print("Please enter valid option:");
							   }
						   }while(b==true);  b=false; break;
					   }
					   default:  System.out.print("Please enter valid option:");
					   
					   }
				   }while(b==true);  b=false; break;
			   }
			   case 4:
			   {
				   System.out.print("Do you want to add it to cart [y/n or Y/N]:"); //MADE CHANGES
				   do
				   {
					   char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					   switch(c)
					   {
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="PANASONIC 4 STAR AC"; ob1[i++]=41990;
					   System.out.print("Do you want to continue shopping in this Budget (Between 40k - 60k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						   switch(c1)	
						   {
						   case 'y':ton1_5_40k60k(); b=false; break; // MADE CHANGES HEREE
						   case 'n':ton1_5menu(); b=false; break; // MADE CHANGES HEREE
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);  break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this Budget (Between 40k - 60k) [y/n or Y/N]:");  //MADE CHANGES HERE
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							   switch(c1)	
							   {
							   case 'y':ton1_5_40k60k(); b=false; break; //MADE CHANGES HERE
							   case 'n':
							   {
								   System.out.print("Do you want to continue in 1.5 TON AIR CONDITIONERS [y/n or Y/N]:"); //MADE CHANGES HERE
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c2)
									   {
									   case 'y': ton1_5menu(); b=false; break;
									   case 'n': AirConditioners(); b=false; break;
									   default:System.out.print("Please enter valid option:"); 
									   }
								   }while(b==true); b=false; break;
								   
							   }
							   default:System.out.print("Please enter valid option:");
							   }
						   }while(b==true);  b=false; break;
					   }
					   default:  System.out.print("Please enter valid option:");
					   
					   }
				   }while(b==true);  b=false; break;
			   }
			   case 5:
			   {
				   System.out.print("Do you want to add it to cart [y/n or Y/N]:"); //MADE CHANGES
				   do
				   {
					   char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					   switch(c)
					   {
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SAMSUNG (2022 LAUNCH)"; ob1[i++]=58990;
					   System.out.print("Do you want to continue shopping in this Budget (Between 40k - 60k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						   switch(c1)	
						   {
						   case 'y':ton1_5_40k60k(); b=false; break; // MADE CHANGES HEREE
						   case 'n':ton1_5menu(); b=false; break; // MADE CHANGES HEREE
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);  break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this Budget (Between 40k - 60k) [y/n or Y/N]:");  //MADE CHANGES HERE
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							   switch(c1)	
							   {
							   case 'y':ton1_5_40k60k(); b=false; break; //MADE CHANGES HERE
							   case 'n':
							   {
								   System.out.print("Do you want to continue in 1.5 TON AIR CONDITIONERS [y/n or Y/N]:"); //MADE CHANGES HERE
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c2)
									   {
									   case 'y': ton1_5menu(); b=false; break;
									   case 'n': AirConditioners(); b=false; break;
									   default:System.out.print("Please enter valid option:"); 
									   }
								   }while(b==true); b=false; break;
								   
							   }
							   default:System.out.print("Please enter valid option:");
							   }
						   }while(b==true);  b=false; break;
					   }
					   default:  System.out.print("Please enter valid option:");
					   
					   }
				   }while(b==true);  b=false; break;
			   }
			   case 6:ton1_5menu(); b=false; break;
			   default: System.out.print("PLEASE ENTER VALID OPTION: ");
			   }
		   }while(b==true); 
	}
//===================================================================================================================================================
//	public static void main(String[] args) 
//	{
//		AirConditioners();
//
//	}

}
