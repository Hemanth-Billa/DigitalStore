package home_appliances;

import java.util.Scanner;

import home_screen.Main_Home;

public class Fans 
{
	public static String ob[]=new String[100];
	public static float ob1[]=new float[100];static int i=0;
	static Scanner sc  = new Scanner(System.in); private static final String RESET = "\033[0m";  // Text Reset
	static boolean b=true;
//=======================================================================================================
	public static void fans()
	{ System.out.println(RESET);
		System.out.println("\t\t"+"                                                          @@@@                                                          \r\n"
				+"\t\t"+ "                                                          @@@@                                                          \r\n"
				+"\t\t"+ "                                                          @@@@                                                          \r\n"
				+"\t\t"+ "                                                          @@@@                                                          \r\n"
				+"\t\t"+ "                                                          @@@@                                                          \r\n"
				+"\t\t"+ "                                                          @@@@                                                          \r\n"
				+"\t\t"+ "         .@@@@@@@@@,                                      @@@@                                      .@@@@@@@@@.         \r\n"
				+"\t\t"+ "      @@@&         %@@@@                                  @@@@                                  @@@@%         &@@@      \r\n"
				+"\t\t"+ "    @@@                %@@@@@                            ,@@@@@                            @@@@@                 @@@    \r\n"
				+"\t\t"+ "    @@                      @@@@@&                    @@@(     @@@*                   %@@@@(                      @@    \r\n"
				+"\t\t"+ "    /@@%                         @@@@@&             &@@          /@@             %@@@@#                         %@@(    \r\n"
				+"\t\t"+ "       /@@@@@@#                       %@@@@#       ,@@            #@@       (@@@@/                       #@@@@@@/       \r\n"
				+"\t\t"+ "             .@@#@@@@@@(                   (@@@@/  @@%&@@@@@@@@@@@%@@  *@@@@/                   (@@@@@@#@@.             \r\n"
				+"\t\t"+ "                      ,@@#@@@@@@%             .@@@@*.               .@@@@&             %@@@@@@#@@*                      \r\n"
				+"\t\t"+ "                                (@@@@@@@@%.  %@@    1.CEILING FANS     ,@@  .%@@@@@@@@(                                \r\n"
				+"\t\t"+ "                                          *@@@@@  2.TABLES AND EXHAUST *@@@@/                                          \r\n"
				+"\t\t"+ "                                              #@@   3.EXIT FROM FANS  @@@                                              \r\n"
				+"\t\t"+ "                                                /@@@,               @@@@                                                \r\n"
				+"\t\t"+ "                                                    %@@@@@@@@@@@@@@@                                                    \r\n"
				+"\t\t"+ "                                                    @@            @@                                                    \r\n"
				+"\t\t"+ "                                                   *@@            (@@                                                   \r\n"
				+"\t\t"+ "                                                   @@,             @@                                                   \r\n"
				+"\t\t"+ "                                                   #@@*          ,@@@                                                   \r\n"
				+"\t\t"+ "                                                      .#@@@@@@@@%. ");
		System.out.println();
		 System.out.println(RESET);
		purchase();
	}
//=======================================================================================================
	public static void purchase()
	{
		System.out.print("PLEASE SELECT YOUR PREFERRED MODEL[1-3] : ");
		boolean b=true;
		do
		{
			int c=sc.nextInt();
			switch(c)
			{
			case 1:Ceiling_fans_menu(); b=false; break;
			case 2:Tables_Exhaust_fans_menu(); b=false; break;
			case 3:Main_Home.home$Appliances(); b=false; break;
			default: 
				{
					System.out.println();
					System.out.print("\t\t\t\t\t\t\t\t  "+"PLEASE ENTER VALID OPTION..."+"\n");
					System.out.println();
					fans();
				}
			}
		}while(b==true);
	}
//=======================================================================================================
	public static void Ceiling_fans_menu()
	{ System.out.println(RESET);
		System.out.println("\t\t\t\t\t\t"+"                           CEILING FANS                           ");  
		 System.out.println("\t\t\t\t\t\t"+"                   ---------------------------                      ");  
		 System.out.println("\t\t\t\t\t\t"+"                       1.Between 1k - 4k                         ");  
		 System.out.println("\t\t\t\t\t\t"+"                       2.Between 4k - 8k                   ");
		 System.out.println("\t\t\t\t\t\t"+"                       3.EXIT FROM CEILING FANS                            ");
		 System.out.println(RESET); Ceiling_fans_switch();
	}
//=======================================================================================================
	public static void Ceiling_fans_switch()
	{
		System.out.print("PLEASE ENTER THE PRICE RANGE  :");
		 
		 do
		 {
			int p=sc.nextInt();
			switch(p) 
			{
			case 1: Ceiling_fans_1k4k(); b=false; break;
			case 2: Ceiling_fans_4k8k();  b=false; break;
			case 3: fans();b=false; break;
		    default:
		    	{
		    		System.out.println("Please enter valid option.");
		    		Ceiling_fans_menu(); 
		    	}
			}
		 }while(b==true);
	}
//=======================================================================================================
	public static void Ceiling_fans_1k4k()
	{ System.out.println(RESET);
		 System.out.println("\t   "+" _________________________________________________________________________________________________________________________________");   
		 System.out.println("\t   "+"|                                                                                                                                 |");  
		 System.out.println("\t   "+"|            _________________________                _________________________              _________________________            |");  
		 System.out.println("\t   "+"|           |    BRAND : CROMPTON     |              |     BRAND : USHA        |            |    BRAND :  LONGWAY     |           |");  
		 System.out.println("\t   "+"|           |-------------------------|              |-------------------------|            |-------------------------|           |");  
		 System.out.println("\t   "+"|           |.Sweep : 1200mm          |              |.Sweep : 1200mm          |            |.Sweep : 1200mm          |           |");  
		 System.out.println("\t   "+"|           |.ISIN  : ELXOTDL5Q2      |              |.ISIN  : ELXOTDL5Q2      |            |.ISIN  : ELXOTDL5Q2      |           |");  
		 System.out.println("\t   "+"|           |.RPM   : 370             |              |.RPM   : 370             |            |.Air Delivery: 205       |           |");  
		 System.out.println("\t   "+"|           |.Air Delivery: 205       |              |.Air Delivery: 205       |            |.Colour      : Brown     |           |");  
		 System.out.println("\t   "+"|           |.Colour      : Brown     |              |.Colour      : Brown     |            |.Noise level : 75W       |           |");  
		 System.out.println("\t   "+"|           |.Noise level : 75W       |              |.Noise level : 75W       |            |.RPM         : 370       |           |");  
		 System.out.println("\t   "+"|           |.Warranty    : 2Year     |              |.Warranty    : 5Year     |            |.Warranty    : 1Year     |           |");  
		 System.out.println("\t   "+"|           |.PRICE       : 1,090/-   |              |.PRICE       : 1,990/-   |            |.PRICE       : 2,090/-   |           |");  
		 System.out.println("\t   "+"|           |_________________________|              |_________________________|            |_________________________|           |");  
		 System.out.println("\t   "+"|                                                                                                                                 |");   
		 System.out.println("\t   "+"|                       1.                                       2.                                     3.                        |");  
		 System.out.println("\t   "+"|                                                                                                                                 |");  
		 System.out.println("\t   "+"|            _________________________                _________________________              _________________________            |");  
		 System.out.println("\t   "+"|           |     BRAND : BAJAJ       |              | BRAND : ORIENT-ELECTRIC |            |                         |           |");  
		 System.out.println("\t   "+"|           |-------------------------|              |-------------------------|            |                         |           |");  
		 System.out.println("\t   "+"|           |.Sweep : 1200mm          |              |.Sweep  : 1200mm         |            |                         |           |");  
		 System.out.println("\t   "+"|           |.ISIN  : ELXOTDL5Q2      |              |.ISIN   : ELXOTDL5Q2     |            |                         |           |");  
		 System.out.println("\t   "+"|           |.RPM   : 370             |              |.RPM    : 370            |            |         EXIT            |           |");  
		 System.out.println("\t   "+"|           |.Air Delivery: 205       |              |.Air Delivery: 205       |            |       ----------        |           |");  
		 System.out.println("\t   "+"|           |.Colour      : Brown     |              |.Colour      : White     |            |                         |           |");  
		 System.out.println("\t   "+"|           |.Noise level : 75W       |              |.Noise level : 75W       |            |                         |           |");  
		 System.out.println("\t   "+"|           |.Warranty    : 3Year     |              |.Warranty    : 1Year     |            |                         |           |");  
		 System.out.println("\t   "+"|           |.Price       : 2,990/-   |              |.Price       : 3,990/-   |            |                         |           |");  
		 System.out.println("\t   "+"|           |_________________________|              |_________________________|            |_________________________|           |");  
		 System.out.println("\t   "+"|                                                                                                                                 |");    
		 System.out.println("\t   "+"|                      4.                                        5.                                      6.                       |");  
		 System.out.println("\t   "+"|                                                                                                                                 |"); 	 
		 System.out.println("\t   "+"|_________________________________________________________________________________________________________________________________|"); 
		 
		 System.out.println(RESET); Ceiling_fans_1k4k_switch();
	}
//=======================================================================================================
	public static void Ceiling_fans_1k4k_switch()
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="CROMPTON FAN"; ob1[i++]=1090;
						          System.out.print("Do you want to continue shopping in this Budget (Between 1k - 4k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
				 		  do
				 		  {
				 			char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
				 			switch(c1)	
							{
							case 'y':Ceiling_fans_1k4k(); b=false; break; // MADE CHANGES HEREE
							case 'n':Ceiling_fans_menu(); b=false; break; // MADE CHANGES HEREE
				 			default : System.out.print("Please enter valid option: ");
							}
				 		  }while(b==true);  break;
						 case 'n':
							 {
								 System.out.print("Do you want to see another model in this Budget (Between 1k - 4k) [y/n or Y/N]:");  //MADE CHANGES HERE
									do
									{
										char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									switch(c1)	
									{
									case 'y':Ceiling_fans_1k4k(); b=false; break;
									case 'n':
										{
											System.out.print("Do you want to continue in CEILING FANS [y/n or Y/N]:"); //MADE CHANGES HERE
											do 
											{
												char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
												switch(c2)
												{
												case 'y': Ceiling_fans_menu(); b=false; break;
												case 'n': fans(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="USHA FAN";  ob1[i++]=1990;
					   System.out.print("Do you want to continue shopping in this Budget (Between 1k - 4k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						   switch(c1)	
						   {
						   case 'y':Ceiling_fans_1k4k(); b=false; break; // MADE CHANGES HEREE
						   case 'n':Ceiling_fans_menu(); b=false; break; // MADE CHANGES HEREE
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);  break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this Budget (Between 1k - 4k) [y/n or Y/N]:");  //MADE CHANGES HERE
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							   switch(c1)	
							   {
							   case 'y':Ceiling_fans_1k4k(); b=false; break;
							   case 'n':
							   {
								   System.out.print("Do you want to continue in CEILING FANS [y/n or Y/N]:"); //MADE CHANGES HERE
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c2)
									   {
									   case 'y': Ceiling_fans_menu(); b=false; break;
									   case 'n': fans(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="LONGWAY FAN"; ob1[i++]=2090;
					   System.out.print("Do you want to continue shopping in this Budget (Between 1k - 4k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						   switch(c1)	
						   {
						   case 'y':Ceiling_fans_1k4k(); b=false; break; // MADE CHANGES HEREE
						   case 'n':Ceiling_fans_menu(); b=false; break; // MADE CHANGES HEREE
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);  break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this Budget (Between 1k - 4k) [y/n or Y/N]:");  //MADE CHANGES HERE
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							   switch(c1)	
							   {
							   case 'y':Ceiling_fans_1k4k(); b=false; break;
							   case 'n':
							   {
								   System.out.print("Do you want to continue in CEILING FANS [y/n or Y/N]:"); //MADE CHANGES HERE
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c2)
									   {
									   case 'y': Ceiling_fans_menu(); b=false; break;
									   case 'n': fans(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="BAJAJ FAN"; ob1[i++]=2990;
					   System.out.print("Do you want to continue shopping in this Budget (Between 1k - 4k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						   switch(c1)	
						   {
						   case 'y':Ceiling_fans_1k4k(); b=false; break; // MADE CHANGES HEREE
						   case 'n':Ceiling_fans_menu(); b=false; break; // MADE CHANGES HEREE
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);  break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this Budget (Between 1k - 4k) [y/n or Y/N]:");  //MADE CHANGES HERE
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							   switch(c1)	
							   {
							   case 'y':Ceiling_fans_1k4k(); b=false; break;
							   case 'n':
							   {
								   System.out.print("Do you want to continue in CEILING FANS [y/n or Y/N]:"); //MADE CHANGES HERE
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c2)
									   {
									   case 'y': Ceiling_fans_menu(); b=false; break;
									   case 'n': fans(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart .");  ob[i]="ORIENT-ELECTRIC FAN";  ob1[i++]=3990;
					   System.out.print("Do you want to continue shopping in this Budget (Between 1k - 4k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						   switch(c1)	
						   {
						   case 'y':Ceiling_fans_1k4k(); b=false; break; // MADE CHANGES HEREE
						   case 'n':Ceiling_fans_menu(); b=false; break; // MADE CHANGES HEREE
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);  break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this Budget (Between 1k - 4k) [y/n or Y/N]:");  //MADE CHANGES HERE
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							   switch(c1)	
							   {
							   case 'y':Ceiling_fans_1k4k(); b=false; break;
							   case 'n':
							   {
								   System.out.print("Do you want to continue in CEILING FANS [y/n or Y/N]:"); //MADE CHANGES HERE
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c2)
									   {
									   case 'y': Ceiling_fans_menu(); b=false; break;
									   case 'n': fans(); b=false; break;
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
			   case 6:Ceiling_fans_menu(); b=false; break;
			   default: System.out.print("PLEASE ENTER VALID OPTION: ");
			   }
		   }while(b==true); 
	}
//=======================================================================================================
	public static void Ceiling_fans_4k8k()
	{ System.out.println(RESET);
		 System.out.println("\t   "+" _________________________________________________________________________________________________________________________________");  
		 System.out.println("\t   "+"|                                                                                                                                 |");  
		 System.out.println("\t   "+"|                                                                                                                                 |");  
		 System.out.println("\t   "+"|           _________________________               _________________________               _________________________             |");  
		 System.out.println("\t   "+"|          |    BRAND : CROMPTON     |             |     BRAND : BAJAJ       |             |      BRAND : USHA       |            |");  
		 System.out.println("\t   "+"|          |-------------------------|             |-------------------------|             |-------------------------|            |");  
		 System.out.println("\t   "+"|          |.Sweep : 1200mm          |             |.Sweep : 1200mm          |             |.Sweep : 1200mm          |            |");  
		 System.out.println("\t   "+"|          |.ISIN  : ELXOTDL5Q2      |             |.ISIN  : ELXOTDL5Q2      |             |.ISIN  : ELXOTDL5Q2      |            |");  
		 System.out.println("\t   "+"|          |.RPM   : 370             |             |.RPM   : 370             |             |.RPM   : 370             |            |");  
		 System.out.println("\t   "+"|          |.Air Delivery: 205       |             |.Air Delivery: 205       |             |.Air Delivery: 205       |            |");  
		 System.out.println("\t   "+"|          |.Colour      : Brown     |             |.Colour      : Brown     |             |.Colour      : Brown     |            |");  
		 System.out.println("\t   "+"|          |.Noise level : 75W       |             |.Noise level : 75W       |             |.Noise level : 75W       |            |");  
		 System.out.println("\t   "+"|          |.Warranty    : 2Year     |             |.Warranty    : 5Year     |             |.Warranty    : 3Year     |            |");  
		 System.out.println("\t   "+"|          |.Price       : 4,090/-   |             |.PRICE       : 5,990/-   |             |.PRICE       : 6,990/-   |            |");  
		 System.out.println("\t   "+"|          |_________________________|             |_________________________|             |_________________________|            |");  
		 System.out.println("\t   "+"|                                                                                                                                 |");   
		 System.out.println("\t   "+"|                       1.                                      2.                                      3.                        |");  
		 System.out.println("\t   "+"|                                                                                                                                 |");  
		 System.out.println("\t   "+"|                                                   _________________________                                                     |");  
		 System.out.println("\t   "+"|                                                  |                         |                                                    |");  
		 System.out.println("\t   "+"|                                                  |                         |                                                    |");  
		 System.out.println("\t   "+"|                                                  |                         |                                                    |");  
		 System.out.println("\t   "+"|                                                  |                         |                                                    |");  
		 System.out.println("\t   "+"|                                                  |         Exit            |                                                    |");  
		 System.out.println("\t   "+"|                                                  |                         |                                                    |");  
		 System.out.println("\t   "+"|                                                  |                         |                                                    |");  
		 System.out.println("\t   "+"|                                                  |                         |                                                    |");  
		 System.out.println("\t   "+"|                                                  |                         |                                                    |");  
		 System.out.println("\t   "+"|                                                  |                         |                                                    |");  
		 System.out.println("\t   "+"|                                                  |_________________________|                                                    |");  
		 System.out.println("\t   "+"|                                                                                                                                 |");    
		 System.out.println("\t   "+"|                                                                4.                                                               |");  
		 System.out.println("\t   "+"|                                                                                                                                 |");  	 
		 System.out.println("\t   "+"|_________________________________________________________________________________________________________________________________|");  
		
		 System.out.println(RESET); 
		 Ceiling_fans_4k8k_switch();
	}
//=======================================================================================================
	public static void Ceiling_fans_4k8k_switch()
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
					   case 'y':System.out.println("Your Item is added to cart .");  ob[i]="CROMPTON FAN";  ob1[i++]=4090;
					   System.out.print("Do you want to continue shopping in this Budget (Between 4k - 8k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						   switch(c1)	
						   {
						   case 'y':Ceiling_fans_4k8k(); b=false; break; // MADE CHANGES HEREE
						   case 'n':Ceiling_fans_menu(); b=false; break; // MADE CHANGES HEREE
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);  break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this Budget (Between 4k - 8k) [y/n or Y/N]:");  //MADE CHANGES HERE
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							   switch(c1)	
							   {
							   case 'y':Ceiling_fans_4k8k(); b=false; break;
							   case 'n':
							   {
								   System.out.print("Do you want to continue in CEILING FANS [y/n or Y/N]:"); //MADE CHANGES HERE
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c2)
									   {
									   case 'y': Ceiling_fans_menu(); b=false; break;
									   case 'n': fans(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="BAJAJ FAN"; ob1[i++]=5990;
					   System.out.print("Do you want to continue shopping in this Budget (Between 4k - 8k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						   switch(c1)	
						   {
						   case 'y':Ceiling_fans_4k8k(); b=false; break; // MADE CHANGES HEREE
						   case 'n':Ceiling_fans_menu(); b=false; break; // MADE CHANGES HEREE
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);  break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this Budget (Between 4k - 8k) [y/n or Y/N]:");  //MADE CHANGES HERE
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							   switch(c1)	
							   {
							   case 'y':Ceiling_fans_4k8k(); b=false; break;
							   case 'n':
							   {
								   System.out.print("Do you want to continue in CEILING FANS [y/n or Y/N]:"); //MADE CHANGES HERE
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c2)
									   {
									   case 'y': Ceiling_fans_menu(); b=false; break;
									   case 'n': fans(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart .");  ob[i]="USHA FAN";  ob1[i++]=6990;
					   System.out.print("Do you want to continue shopping in this Budget (Between 4k - 8k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						   switch(c1)	
						   {
						   case 'y':Ceiling_fans_4k8k(); b=false; break; // MADE CHANGES HEREE
						   case 'n':Ceiling_fans_menu(); b=false; break; // MADE CHANGES HEREE
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);  break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this Budget (Between 4k - 8k) [y/n or Y/N]:");  //MADE CHANGES HERE
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							   switch(c1)	
							   {
							   case 'y':Ceiling_fans_4k8k(); b=false; break;
							   case 'n':
							   {
								   System.out.print("Do you want to continue in CEILING FANS [y/n or Y/N]:"); //MADE CHANGES HERE
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c2)
									   {
									   case 'y': Ceiling_fans_menu(); b=false; break;
									   case 'n': fans(); b=false; break;
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
			   case 4:Ceiling_fans_menu(); b=false; break;
			   default: System.out.print("PLEASE ENTER VALID OPTION: ");
			   }
		   }while(b==true);
	}
//=======================================================================================================
	public static void Tables_Exhaust_fans_menu()
	{ System.out.println(RESET);
		System.out.println("\t\t\t\t\t\t"+"                       TABLES AND EXHAUST FANS                         ");  
		 System.out.println("\t\t\t\t\t\t"+"                   ---------------------------                      ");  
		 System.out.println("\t\t\t\t\t\t"+"                       1.Between 1k - 3k                         ");  
		 System.out.println("\t\t\t\t\t\t"+"                       2.EXIT FROM                             ");
		 System.out.println("\t\t\t\t\t\t"+"                      TABLES AND EXHAUST FANS                             ");
		 System.out.println(RESET); Tables_Exhaust_fans_switch();
	}
//=======================================================================================================
	public static void Tables_Exhaust_fans_switch()
	{
		System.out.print("PLEASE ENTER THE PRICE RANGE  :");
		 
		 do
		 {
			int p=sc.nextInt();
			switch(p) 
			{
			case 1: Tables_Exhaust_fans_1k3k(); b=false; break;
			case 2: fans();b=false; break;
		    default:
		    	{
		    		System.out.println("Please enter valid option.");
		    		Tables_Exhaust_fans_menu();; 
		    	}
			}
		 }while(b==true);
	}
//=======================================================================================================
	public static void Tables_Exhaust_fans_1k3k()
	{ System.out.println(RESET);
		 System.out.println("\t   "+" _________________________________________________________________________________________________________________________________");  
		 System.out.println("\t   "+"|                                                                                                                                 |");  
		 System.out.println("\t   "+"|                                                                                                                                 |");  
		 System.out.println("\t   "+"|             _________________________              _________________________              _________________________             |");  
		 System.out.println("\t   "+"|            | BRAND : ORIENT-ELECTRIC |            |      BRAND : BAJAJ      |            |      BRAND : USHA       |            |");  
		 System.out.println("\t   "+"|            |-------------------------|            |-------------------------|            |-------------------------|            |");  
		 System.out.println("\t   "+"|            |.Sweep : 1200mm          |            |.Sweep : 1200mm          |            |.Sweep : 1200mm          |            |");  
		 System.out.println("\t   "+"|            |.ISIN  : ELXOTDL5Q2      |            |.ISIN  : ELXOTDL5Q2      |            |.SIN   : ELXOTDL5Q2      |            |");  
		 System.out.println("\t   "+"|            |.RPM   : 370             |            |.RPM   : 370             |            |.Air Delivery: 205       |            |");  
		 System.out.println("\t   "+"|            |.Air Delivery: 205       |            |.Air Delivery: 205       |            |.Colour      : Brown     |            |");  
		 System.out.println("\t   "+"|            |.Colour      : Brown     |            |.Colour      : Brown     |            |.Noise level : 75W       |            |");  
		 System.out.println("\t   "+"|            |.Noise level : 75W       |            |.Noise level : 75W       |            |.RPM         : 370       |            |");  
		 System.out.println("\t   "+"|            |.Warranty    : 2Year     |            |.Warranty    : 5Year     |            |.Warranty    : 1Year     |            |");  
		 System.out.println("\t   "+"|            |.PRICE       : 2,090/-   |            |.PRICE       : 2,990/-   |            |.PRICE       : 1,990/-   |            |");  
		 System.out.println("\t   "+"|            |_________________________|            |_________________________|            |_________________________|            |");  
		 System.out.println("\t   "+"|                                                                                                                                 |");   
		 System.out.println("\t   "+"|                          1.                                     2.                                    3.                        |");  
		 System.out.println("\t   "+"|                                                                                                                                 |");  
		 System.out.println("\t   "+"|             _________________________              _________________________              _________________________             |");  
		 System.out.println("\t   "+"|            |     BRAND : LONGWAY     |            |    BRAND : CROMPTON     |            |                         |            |");  
		 System.out.println("\t   "+"|            |-------------------------|            |-------------------------|            |                         |            |");  
		 System.out.println("\t   "+"|            |.Sweep : 1200mm          |            |.Sweep : 1200mm          |            |                         |            |");  
		 System.out.println("\t   "+"|            |.ISIN  : ELXOTDL5Q2      |            |.ISIN  : ELXOTDL5Q2      |            |                         |            |");  
		 System.out.println("\t   "+"|            |.RPM   : 370             |            |.RPM   : 370             |            |           EXIT          |            |");  
		 System.out.println("\t   "+"|            |.Air Delivery: 205       |            |.Air Delivery: 205       |            |                         |            |");  
		 System.out.println("\t   "+"|            |.Colour      : Brown     |            |.Colour      : White     |            |         ---------       |            |");  
		 System.out.println("\t   "+"|            |.Noise level : 75W       |            |.Noise level : 75W       |            |                         |            |");  
		 System.out.println("\t   "+"|            |.Warranty    : 3Year     |            |.Warranty    : 1Year     |            |                         |            |");  
		 System.out.println("\t   "+"|            |.PRICE       : 2,990/-   |            |.PRICE       : 2,990/-   |            |                         |            |");  
		 System.out.println("\t   "+"|            |_________________________|            |_________________________|            |_________________________|            |");  
		 System.out.println("\t   "+"|                                                                                                                                 |");    
		 System.out.println("\t   "+"|                           4.                                    5.                                     6.                       |");  
		 System.out.println("\t   "+"|                                                                                                                                 |");   	 
		 System.out.println("\t   "+"|_________________________________________________________________________________________________________________________________|");  
		 
		 System.out.println(RESET); Tables_Exhaust_fans_1k3k_switch();
	}
//=======================================================================================================
	public static void Tables_Exhaust_fans_1k3k_switch()
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
					   case 'y':System.out.println("Your Item is added to cart .");  ob[i]="ORIENT-ELECTRIC TABLE FAN";  ob1[i++]=2090;
					   System.out.print("Do you want to continue shopping in this Budget (Between 1k - 3k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						   switch(c1)	
						   {
						   case 'y':Tables_Exhaust_fans_1k3k(); b=false; break; // MADE CHANGES HEREE
						   case 'n':Tables_Exhaust_fans_menu(); b=false; break; // MADE CHANGES HEREE
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);  break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this Budget (Between 1k - 3k) [y/n or Y/N]:");  //MADE CHANGES HERE
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							   switch(c1)	
							   {
							   case 'y':Tables_Exhaust_fans_1k3k(); b=false; break;
							   case 'n':
							   {
								   System.out.print("Do you want to continue in TABLES AND EXHAUST FANS [y/n or Y/N]:"); //MADE CHANGES HERE
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c2)
									   {
									   case 'y': Tables_Exhaust_fans_menu(); b=false; break;
									   case 'n': fans(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="BAJAJ TABLE FAN";  ob1[i++]=2990;
					   System.out.print("Do you want to continue shopping in this Budget (Between 1k - 3k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						   switch(c1)	
						   {
						   case 'y':Tables_Exhaust_fans_1k3k(); b=false; break; // MADE CHANGES HEREE
						   case 'n':Tables_Exhaust_fans_menu(); b=false; break; // MADE CHANGES HEREE
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);  break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this Budget (Between 1k - 3k) [y/n or Y/N]:");  //MADE CHANGES HERE
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							   switch(c1)	
							   {
							   case 'y':Tables_Exhaust_fans_1k3k(); b=false; break;
							   case 'n':
							   {
								   System.out.print("Do you want to continue in TABLES AND EXHAUST FANS [y/n or Y/N]:"); //MADE CHANGES HERE
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c2)
									   {
									   case 'y': Tables_Exhaust_fans_menu(); b=false; break;
									   case 'n': fans(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="USHA TABLE FAN";  ob1[i++]=1990;
					   System.out.print("Do you want to continue shopping in this Budget (Between 1k - 3k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						   switch(c1)	
						   {
						   case 'y':Tables_Exhaust_fans_1k3k(); b=false; break; // MADE CHANGES HEREE
						   case 'n':Tables_Exhaust_fans_menu(); b=false; break; // MADE CHANGES HEREE
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);  break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this Budget (Between 1k - 3k) [y/n or Y/N]:");  //MADE CHANGES HERE
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							   switch(c1)	
							   {
							   case 'y':Tables_Exhaust_fans_1k3k(); b=false; break;
							   case 'n':
							   {
								   System.out.print("Do you want to continue in TABLES AND EXHAUST FANS [y/n or Y/N]:"); //MADE CHANGES HERE
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c2)
									   {
									   case 'y': Tables_Exhaust_fans_menu(); b=false; break;
									   case 'n': fans(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="LONGWAY TABLE FAN";  ob1[i++]=2990;
					   System.out.print("Do you want to continue shopping in this Budget (Between 1k - 3k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						   switch(c1)	
						   {
						   case 'y':Tables_Exhaust_fans_1k3k(); b=false; break; // MADE CHANGES HEREE
						   case 'n':Tables_Exhaust_fans_menu(); b=false; break; // MADE CHANGES HEREE
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);  break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this Budget (Between 1k - 3k) [y/n or Y/N]:");  //MADE CHANGES HERE
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							   switch(c1)	
							   {
							   case 'y':Tables_Exhaust_fans_1k3k(); b=false; break;
							   case 'n':
							   {
								   System.out.print("Do you want to continue in TABLES AND EXHAUST FANS [y/n or Y/N]:"); //MADE CHANGES HERE
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c2)
									   {
									   case 'y': Tables_Exhaust_fans_menu(); b=false; break;
									   case 'n': fans(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="CROMPTON EXHAUST FAN";  ob1[i++]=2990;
					   System.out.print("Do you want to continue shopping in this Budget (Between 1k - 3k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						   switch(c1)	
						   {
						   case 'y':Tables_Exhaust_fans_1k3k(); b=false; break; // MADE CHANGES HEREE
						   case 'n':Tables_Exhaust_fans_menu(); b=false; break; // MADE CHANGES HEREE
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);  break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this Budget (Between 1k - 3k) [y/n or Y/N]:");  //MADE CHANGES HERE
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							   switch(c1)	
							   {
							   case 'y':Tables_Exhaust_fans_1k3k(); b=false; break;
							   case 'n':
							   {
								   System.out.print("Do you want to continue in TABLES AND EXHAUST FANS [y/n or Y/N]:"); //MADE CHANGES HERE
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c2)
									   {
									   case 'y': Tables_Exhaust_fans_menu(); b=false; break;
									   case 'n': fans(); b=false; break;
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
			   case 6:Tables_Exhaust_fans_menu(); b=false; break;
			   default: System.out.print("PLEASE ENTER VALID OPTION: ");
			   }
		   }while(b==true);
	}
//=======================================================================================================
//	public static void main(String[] args)
//	{
//		fans();
//	}

}
