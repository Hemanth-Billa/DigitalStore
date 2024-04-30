package home_appliances;

import java.util.Scanner;

import home_screen.Main_Home;
public class Refrigerator 
{
	public 	static String ob[]=new String[100];
	public static float ob1[]=new float[100];static int i=0;
	static Scanner sc  = new Scanner(System.in); private static final String RESET = "\033[0m";  // Text Reset
	static boolean b=true;
//====================================================================================================================================================================
	public static void Refrigerators()
	{ System.out.println(RESET);
		System.out.println("\t   "+"\t\t\t\t\t\t"+" @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("\t   "+"\t\t\t\t\t\t"+"@@@                                    @@@");
		System.out.println("\t   "+"\t\t\t\t\t\t"+"@@@  @@@                               @@@");
		System.out.println("\t   "+"\t\t\t\t\t\t"+"@@@  @ @                               @@@");
		System.out.println("\t   "+"\t\t\t\t\t\t"+"@@@  @ @      REFRIGERATORS            @@@");
		System.out.println("\t   "+"\t\t\t\t\t\t"+"@@@  @ @                               @@@");
		System.out.println("\t   "+"\t\t\t\t\t\t"+"@@@  @@@                               @@@");
		System.out.println("\t   "+"\t\t\t\t\t\t"+"@@@                                    @@@");
		System.out.println("\t   "+"\t\t\t\t\t\t"+"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("\t   "+"\t\t\t\t\t\t"+"@@@                                    @@@");
		System.out.println("\t   "+"\t\t\t\t\t\t"+"@@@  @@@                               @@@");
		System.out.println("\t   "+"\t\t\t\t\t\t"+"@@@  @ @                               @@@");
		System.out.println("\t   "+"\t\t\t\t\t\t"+"@@@  @ @                               @@@");
		System.out.println("\t   "+"\t\t\t\t\t\t"+"@@@  @ @                               @@@");
		System.out.println("\t   "+"\t\t\t\t\t\t"+"@@@  @ @                               @@@");
		System.out.println("\t   "+"\t\t\t\t\t\t"+"@@@  @ @                               @@@");
		System.out.println("\t   "+"\t\t\t\t\t\t"+"@@@  @@@                               @@@");
		System.out.println("\t   "+"\t\t\t\t\t\t"+"@@@                                    @@@");
		System.out.println("\t   "+"\t\t\t\t\t\t"+"@@@     1.SINGLE DOOR REFRIGERATORS    @@@");
		System.out.println("\t   "+"\t\t\t\t\t\t"+"@@@     2.DOUBLE DOOR REFRIGERATORS    @@@");
		System.out.println("\t   "+"\t\t\t\t\t\t"+"@@@     3.EXIT FROM REFRIGERATOR       @@@");
		System.out.println("\t   "+"\t\t\t\t\t\t"+"@@@                                    @@@");
		System.out.println("\t   "+"\t\t\t\t\t\t"+"@@@                                    @@@");
		System.out.println("\t   "+"\t\t\t\t\t\t"+"@@@                                    @@@");
		System.out.println("\t   "+"\t\t\t\t\t\t"+"@@@                                    @@@");
		System.out.println("\t   "+"\t\t\t\t\t\t"+"@@@                                    @@@");
		System.out.println("\t   "+"\t\t\t\t\t\t"+"@@@                                    @@@");
		System.out.println("\t   "+"\t\t\t\t\t\t"+"@@@                                    @@@");
		System.out.println("\t   "+"\t\t\t\t\t\t"+"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("\t   "+"\t\t\t\t\t\t"+"  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("\t   "+"\t\t\t\t\t\t"+"   @@@@@@@@                    @@@@@@@@");
		System.out.println();
		 System.out.println(RESET);purchase();
	}
//====================================================================================================================================================================
	public static void purchase()
	{
		System.out.print("PLEASE SELECT YOUR PREFERRED MODEL[1-3] : ");
		boolean b=true;
		do
		{
			int c=sc.nextInt();
			switch(c)
			{
			case 1:Single_Door_menu(); b=false; break;
			case 2:Double_Door_menu(); b=false; break;
			case 3:Main_Home.home$Appliances(); b=false; break;
			default: 
				{
					System.out.println("\n"+"\t\tPlease enter valid option ."+"\n");
					Refrigerators();
				}
			}
		}while(b==true);
	}
//====================================================================================================================================================================
	public static void Single_Door_menu()
	{ System.out.println(RESET);
		System.out.println("\t\t\t\t\t\t"+"                      SINGLE DOOR REFRIGERATOR                           ");  
		 System.out.println("\t\t\t\t\t\t"+"                   ---------------------------                      ");  
		 System.out.println("\t\t\t\t\t\t"+"                       1.Between 8k - 15k                         ");  
		 System.out.println("\t\t\t\t\t\t"+"                       2.Between 15k - 30k                   ");
		 System.out.println("\t\t\t\t\t\t"+"                       3.EXIT FROM SINGLE DOOR                            ");
		 System.out.println(RESET); Single_Door_switch();
	}
//====================================================================================================================================================================
	public static void Single_Door_switch()
	{
		System.out.print("PLEASE ENTER THE PRICE RANGE  :");
		 
		 do
		 {
			int p=sc.nextInt();
			switch(p) 
			{
			case 1: Single_Door_8k15k(); b=false; break;
			case 2: Single_Door_15k30k();  b=false; break;
			case 3: Refrigerators();;b=false; break;
		    default:
		    	{
		    		System.out.println("Please enter valid option.");
		    		Single_Door_menu(); 
		    	}
			}
		 }while(b==true);
	}
//====================================================================================================================================================================
	public static void Single_Door_8k15k()
	{ System.out.println(RESET);
		 System.out.println("\t   "+" ____________________________________________________________________________________________________________________________________");  
		 System.out.println("\t   "+"|                                                                                                                                    |");  
		 System.out.println("\t   "+"|          _______________________________         _______________________________         _______________________________           |");  
		 System.out.println("\t   "+"|         |  HISENSE 44 LITRES  1 STAR    |       |  KELVINATOR 45 LITRES         |       |   HAIER 181 LITRES 2 STAR     |          |");  
		 System.out.println("\t   "+"|         |-------------------------------|       |-------------------------------|       |-------------------------------|          |");  
		 System.out.println("\t   "+"|         |.Wire Type Door Balcony        |       |.2 Star Mini Bar               |       |.Stabilizer Free Operation     |          |");  
		 System.out.println("\t   "+"|         |.Direct Cooling                |       |     Single Door Refigerator   |       |.2 Star Energy Saving rating   |          |");  
		 System.out.println("\t   "+"|         |.Ecofriendly (R600a)           |       |.Stabilizer Free               |       |.Defrsot Button                |          |");  
		 System.out.println("\t   "+"|         |.Stabilizer Free Refrigerant   |       |.Eco Friendly & Reversible Door|       |.Large Vegetable Box           |          |");  
		 System.out.println("\t   "+"|         |.Fixed Door Gasket             |       |.Seperated Chiller Compartment |       |.Reciprocating Compressor      |          |");  
		 System.out.println("\t   "+"|         |.Direct cool Mini Bar          |       |.Fixed Door Gasket             |       |.Spill Proof Toughened Glass   |          |");  
		 System.out.println("\t   "+"|         |.PRICE  :  7,490.00/-          |       |. PRICE  :  8,990.00/-         |       |.   PRICE  :  11,890.00/-      |          |");  
		 System.out.println("\t   "+"|         |_______________________________|       |_______________________________|       |_______________________________|          |");  
		 System.out.println("\t   "+"|                                                                                                                                    |");  
		 System.out.println("\t   "+"|                       1.                                          2.                                       3.                      |");  
		 System.out.println("\t   "+"|                                                                                                                                    |");  
		 System.out.println("\t   "+"|                                                                                                                                    |");  
		 System.out.println("\t   "+"|          _______________________________         _______________________________         _______________________________           |");  
		 System.out.println("\t   "+"|         |   HAIER 190 LITRES 2 STAR     |       | HISENSE 156 LITRES  2 STAR    |       |                               |          |");  
		 System.out.println("\t   "+"|         |-------------------------------|       |-------------------------------|       |                               |          |");  
		 System.out.println("\t   "+"|         |.Stabilizer Free Operation     |       |.Stabilizer Free Operation     |       |                               |          |");  
		 System.out.println("\t   "+"|         |.2 Star Energy Saving rating   |       |.2 Star Energy Saving rating   |       |             EXIT              |          |");  
		 System.out.println("\t   "+"|         |.Toughened Glass Shelves       |       |.Large Vegetable Box           |       |            ------             |          |");  
		 System.out.println("\t   "+"|         |.Anti-Fungal Gasket            |       |.Fixed Door Gasket             |       |                               |          |");  
		 System.out.println("\t   "+"|         |.Diamond edge freezing tech..  |       |.Reciprocating Compressor      |       |                               |          |");  
		 System.out.println("\t   "+"|         |.Ideal for Small Families      |       |.With Defrsot Button           |       |                               |          |");  
		 System.out.println("\t   "+"|         |.  PRICE  :  12,590.00/-       |       |. PRICE  :  10,590.00/-        |       |                               |          |");  
		 System.out.println("\t   "+"|         |_______________________________|       |_______________________________|       |_______________________________|          |");
		 System.out.println("\t   "+"|                                                                                                                                    |");  
		 System.out.println("\t   "+"|                     4.                                        5.                                       6.                          |");  
		 System.out.println("\t   "+"|                                                                                                                                    |");  	 
		 System.out.println("\t   "+"|____________________________________________________________________________________________________________________________________|");  
		 
		 System.out.println(RESET); Single_Door_8k15k_switch(); 
	}
//====================================================================================================================================================================
	public static void Single_Door_8k15k_switch()
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="HISENSE 44 LITRES  1STAR";  ob1[i++]=7490;
						          System.out.print("Do you want to continue shopping in this Budget (Between 8k - 15k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
				 		  do
				 		  {
				 			char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
				 			switch(c1)	
							{
							case 'y':Single_Door_8k15k(); b=false; break; // MADE CHANGES HEREE
							case 'n':Single_Door_menu(); b=false; break; // MADE CHANGES HEREE
				 			default : System.out.print("Please enter valid option: ");
							}
				 		  }while(b==true);  break;
						 case 'n':
							 {
								 System.out.print("Do you want to see another model in this Budget (Between 8k - 15k) [y/n or Y/N]:");  //MADE CHANGES HERE
									do
									{
										char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									switch(c1)	
									{
									case 'y':Single_Door_8k15k(); b=false; break; //MADE CHANGES HERE
									case 'n':
										{
											System.out.print("Do you want to continue in SINGLE DOOR REFRIGERATOR [y/n or Y/N]:"); //MADE CHANGES HERE
											do 
											{
												char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
												switch(c2)
												{
												case 'y': Single_Door_menu(); b=false; break;
												case 'n': Refrigerators(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="KELVINATOR 45 LITRES";  ob1[i++]=8990;
					   System.out.print("Do you want to continue shopping in this Budget (Between 8k - 15k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						   switch(c1)	
						   {
						   case 'y':Single_Door_8k15k(); b=false; break; // MADE CHANGES HEREE
						   case 'n':Single_Door_menu(); b=false; break; // MADE CHANGES HEREE
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);  break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this Budget (Between 8k - 15k) [y/n or Y/N]:");  //MADE CHANGES HERE
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							   switch(c1)	
							   {
							   case 'y':Single_Door_8k15k(); b=false; break; //MADE CHANGES HERE
							   case 'n':
							   {
								   System.out.print("Do you want to continue in SINGLE DOOR REFRIGERATOR [y/n or Y/N]:"); //MADE CHANGES HERE
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c2)
									   {
									   case 'y': Single_Door_menu(); b=false; break;
									   case 'n': Refrigerators(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="HAIER 181 LITRES 2STAR";  ob1[i++]=11890;
					   System.out.print("Do you want to continue shopping in this Budget (Between 8k - 15k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						   switch(c1)	
						   {
						   case 'y':Single_Door_8k15k(); b=false; break; // MADE CHANGES HEREE
						   case 'n':Single_Door_menu(); b=false; break; // MADE CHANGES HEREE
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);  break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this Budget (Between 8k - 15k) [y/n or Y/N]:");  //MADE CHANGES HERE
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							   switch(c1)	
							   {
							   case 'y':Single_Door_8k15k(); b=false; break; //MADE CHANGES HERE
							   case 'n':
							   {
								   System.out.print("Do you want to continue in SINGLE DOOR REFRIGERATOR [y/n or Y/N]:"); //MADE CHANGES HERE
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c2)
									   {
									   case 'y': Single_Door_menu(); b=false; break;
									   case 'n': Refrigerators(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="HAIER 190 LITRES 2STAR";  ob1[i++]=12590;
					   System.out.print("Do you want to continue shopping in this Budget (Between 8k - 15k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						   switch(c1)	
						   {
						   case 'y':Single_Door_8k15k(); b=false; break; // MADE CHANGES HEREE
						   case 'n':Single_Door_menu(); b=false; break; // MADE CHANGES HEREE
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);  break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this Budget (Between 8k - 15k) [y/n or Y/N]:");  //MADE CHANGES HERE
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							   switch(c1)	
							   {
							   case 'y':Single_Door_8k15k(); b=false; break; //MADE CHANGES HERE
							   case 'n':
							   {
								   System.out.print("Do you want to continue in SINGLE DOOR REFRIGERATOR [y/n or Y/N]:"); //MADE CHANGES HERE
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c2)
									   {
									   case 'y': Single_Door_menu(); b=false; break;
									   case 'n': Refrigerators(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="HISENSE 156 LITRES 2STAR";  ob1[i++]=10590;
					   System.out.print("Do you want to continue shopping in this Budget (Between 8k - 15k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						   switch(c1)	
						   {
						   case 'y':Single_Door_8k15k(); b=false; break; // MADE CHANGES HEREE
						   case 'n':Single_Door_menu(); b=false; break; // MADE CHANGES HEREE
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);  break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this Budget (Between 8k - 15k) [y/n or Y/N]:");  //MADE CHANGES HERE
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							   switch(c1)	
							   {
							   case 'y':Single_Door_8k15k(); b=false; break; //MADE CHANGES HERE
							   case 'n':
							   {
								   System.out.print("Do you want to continue in SINGLE DOOR REFRIGERATOR [y/n or Y/N]:"); //MADE CHANGES HERE
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c2)
									   {
									   case 'y': Single_Door_menu(); b=false; break;
									   case 'n': Refrigerators(); b=false; break;
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
			   case 6:Single_Door_menu(); b=false; break;
			   default: System.out.print("PLEASE ENTER VALID OPTION: ");
			   }
		   }while(b==true); 
	}
//====================================================================================================================================================================
	public static void Single_Door_15k30k()
	{ System.out.println(RESET);
		 System.out.println("\t   "+" ____________________________________________________________________________________________________________________________________");  
		 System.out.println("\t   "+"|                                                                                                                                    |");  
		 System.out.println("\t   "+"|         _______________________________           _______________________________           _______________________________        |");  
		 System.out.println("\t   "+"|        |   SAMSUNG 192 LITRES 2 STAR   |         | SAMSUNG 183 LITRES 2 STAR     |         | HAIER 195 LITRES 3 STAR       |       |");  
		 System.out.println("\t   "+"|        |-------------------------------|         |-------------------------------|         |-------------------------------|       |");  
		 System.out.println("\t   "+"|        |.Stabilizer Free Operation     |         |.Direct Cool Refrigerator      |         |.Stabilizer Free Operation     |       |");  
		 System.out.println("\t   "+"|        |.Toughened Glass               |         |.Stabilizer Free Operation     |         |.Direct Cool Refrigerator      |       |");  
		 System.out.println("\t   "+"|        |.Anti Bacterial Gasket         |         |.Digital Inverter Compressor   |         |.Smart Home Invertor Connect   |       |");  
		 System.out.println("\t   "+"|        |.Large Capacity Vegetable Box  |         |.Toughened Glass Shelves       |         |.Anti Bacterial Gasket         |       |");  
		 System.out.println("\t   "+"|        |.Base Stand Drawer             |         |.Digital Inverter Compressor   |         |.Base Stand Drawer             |       |");  
		 System.out.println("\t   "+"|        |.Smart Home Invertor Connect   |         |.Anti Bacterial Gasket         |         |.Digital Inverter Compressor   |       |");  
		 System.out.println("\t   "+"|        |.1 Year Warranty               |         |.Base Stand Drawer             |         |.Toughened Glass Shelves       |       |");  
		 System.out.println("\t   "+"|        |. PRICE  :  18,390.00/-        |         |. PRICE  :  16,390.00/-        |         |. PRICE  :  19,390.00/-        |       |");  
		 System.out.println("\t   "+"|        |_______________________________|         |_______________________________|         |_______________________________|       |");  
		 System.out.println("\t   "+"|                                                                                                                                    |");  
		 System.out.println("\t   "+"|                     1.                                          2.                                        3.                       |");  
		 System.out.println("\t   "+"|         _______________________________           _______________________________           _______________________________        |");  
		 System.out.println("\t   "+"|        |    BPL 193 LITRES 3 STAR      |         | VOLTAS BEKO 195 LITRES 3 STAR |         |                               |       |");  
		 System.out.println("\t   "+"|        |-------------------------------|         |-------------------------------|         |                               |       |");  
		 System.out.println("\t   "+"|        |.Stabilizer Free Operation     |         |.Stabilizer Free Operation     |         |                               |       |");  
		 System.out.println("\t   "+"|        |.Direct Cool Refrigerator      |         |.Direct Cool Refrigerator      |         |                               |       |");  
		 System.out.println("\t   "+"|        |.R600a Refrigerant             |         |.Flat Back Design              |         |             EXIT              |       |");  
		 System.out.println("\t   "+"|        |.Silent Operation              |         |.R600a Refrigerant             |         |           --------            |       |");  
		 System.out.println("\t   "+"|        |.Flat Back Design              |         |.Large Capacity Vegetable Box  |         |                               |       |");  
		 System.out.println("\t   "+"|        |.Anti Bacterial Gasket         |         |.Smart Home Invertor Connect   |         |                               |       |");  
		 System.out.println("\t   "+"|        |.Base Stand Drawer             |         |.Anti Bacterial Gasket         |         |                               |       |");  
		 System.out.println("\t   "+"|        |. PRICE  :  22,390.00/-        |         |. PRICE  :  27,390.00/-        |         |                               |       |");  
		 System.out.println("\t   "+"|        |_______________________________|         |_______________________________|         |_______________________________|       |");
		 System.out.println("\t   "+"|                                                                                                                                    |");  
		 System.out.println("\t   "+"|                       4.                                         5.                                       6.                       |");  
		 System.out.println("\t   "+"|____________________________________________________________________________________________________________________________________|");  
		 
		 System.out.println(RESET);Single_Door_15k30k_switch(); 
	}
//====================================================================================================================================================================
	public static void Single_Door_15k30k_switch()
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SAMSUNG 192 LITRES 2STAR";  ob1[i++]=18390;
					   System.out.print("Do you want to continue shopping in this Budget (Between 15k - 30k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						   switch(c1)	
						   {
						   case 'y':Single_Door_15k30k(); b=false; break; // MADE CHANGES HEREE
						   case 'n':Single_Door_menu(); b=false; break; // MADE CHANGES HEREE
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);  break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this Budget (Between 15k - 30k) [y/n or Y/N]:");  //MADE CHANGES HERE
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							   switch(c1)	
							   {
							   case 'y':Single_Door_15k30k(); b=false; break; //MADE CHANGES HERE
							   case 'n':
							   {
								   System.out.print("Do you want to continue in SINGLE DOOR REFRIGERATOR [y/n or Y/N]:"); //MADE CHANGES HERE
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c2)
									   {
									   case 'y': Single_Door_menu(); b=false; break;
									   case 'n': Refrigerators(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SAMSUNG 183 LITRES 2STAR";  ob1[i++]=16390;
					   System.out.print("Do you want to continue shopping in this Budget (Between 15k - 30k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						   switch(c1)	
						   {
						   case 'y':Single_Door_15k30k(); b=false; break; // MADE CHANGES HEREE
						   case 'n':Single_Door_menu(); b=false; break; // MADE CHANGES HEREE
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);  break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this Budget (Between 15k - 30k) [y/n or Y/N]:");  //MADE CHANGES HERE
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							   switch(c1)	
							   {
							   case 'y':Single_Door_15k30k(); b=false; break; //MADE CHANGES HERE
							   case 'n':
							   {
								   System.out.print("Do you want to continue in SINGLE DOOR REFRIGERATOR [y/n or Y/N]:"); //MADE CHANGES HERE
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c2)
									   {
									   case 'y': Single_Door_menu(); b=false; break;
									   case 'n': Refrigerators(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="HAIER 195 LITRES 3STAR";  ob1[i++]=19390;
					   System.out.print("Do you want to continue shopping in this Budget (Between 15k - 30k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						   switch(c1)	
						   {
						   case 'y':Single_Door_15k30k(); b=false; break; // MADE CHANGES HEREE
						   case 'n':Single_Door_menu(); b=false; break; // MADE CHANGES HEREE
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);  break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this Budget (Between 15k - 30k) [y/n or Y/N]:");  //MADE CHANGES HERE
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							   switch(c1)	
							   {
							   case 'y':Single_Door_15k30k(); b=false; break; //MADE CHANGES HERE
							   case 'n':
							   {
								   System.out.print("Do you want to continue in SINGLE DOOR REFRIGERATOR [y/n or Y/N]:"); //MADE CHANGES HERE
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c2)
									   {
									   case 'y': Single_Door_menu(); b=false; break;
									   case 'n': Refrigerators(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="BPL 193 LITRES 3STAR";  ob1[i++]=22390;
					   System.out.print("Do you want to continue shopping in this Budget (Between 15k - 30k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						   switch(c1)	
						   {
						   case 'y':Single_Door_15k30k(); b=false; break; // MADE CHANGES HEREE
						   case 'n':Single_Door_menu(); b=false; break; // MADE CHANGES HEREE
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);  break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this Budget (Between 15k - 30k) [y/n or Y/N]:");  //MADE CHANGES HERE
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							   switch(c1)	
							   {
							   case 'y':Single_Door_15k30k(); b=false; break; //MADE CHANGES HERE
							   case 'n':
							   {
								   System.out.print("Do you want to continue in SINGLE DOOR REFRIGERATOR [y/n or Y/N]:"); //MADE CHANGES HERE
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c2)
									   {
									   case 'y': Single_Door_menu(); b=false; break;
									   case 'n': Refrigerators(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="VOLTAS BEKO 195 LITRES 3STAR";  ob1[i++]=27390;
					   System.out.print("Do you want to continue shopping in this Budget (Between 15k - 30k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						   switch(c1)	
						   {
						   case 'y':Single_Door_15k30k(); b=false; break; // MADE CHANGES HEREE
						   case 'n':Single_Door_menu(); b=false; break; // MADE CHANGES HEREE
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);  break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this Budget (Between 15k - 30k) [y/n or Y/N]:");  //MADE CHANGES HERE
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							   switch(c1)	
							   {
							   case 'y':Single_Door_15k30k(); b=false; break; //MADE CHANGES HERE
							   case 'n':
							   {
								   System.out.print("Do you want to continue in SINGLE DOOR REFRIGERATOR [y/n or Y/N]:"); //MADE CHANGES HERE
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c2)
									   {
									   case 'y': Single_Door_menu(); b=false; break;
									   case 'n': Refrigerators(); b=false; break;
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
			   case 6:Single_Door_menu(); b=false; break;
			   default: System.out.print("PLEASE ENTER VALID OPTION: ");
			   }
		   }while(b==true); 
	}
//====================================================================================================================================================================
	public static void Double_Door_menu()
	{ System.out.println(RESET);
		System.out.println("\t\t\t\t\t\t"+"                      DOUBLE DOOR REFRIGERATOR                           ");  
		 System.out.println("\t\t\t\t\t\t"+"                   ---------------------------                      ");  
		 System.out.println("\t\t\t\t\t\t"+"                       1.Between 20k - 40k                         ");  
		 System.out.println("\t\t\t\t\t\t"+"                       2.Between 40k - 80k                   ");
		 System.out.println("\t\t\t\t\t\t"+"                       3.EXIT FROM DOUBLE DOOR                           ");
		 System.out.println(RESET); Double_Door_switch();
	}
//====================================================================================================================================================================
	public static void Double_Door_switch()
	{
		System.out.print("PLEASE ENTER THE PRICE RANGE  :");
		 
		 do
		 {
			int p=sc.nextInt();
			switch(p) 
			{
			case 1: Double_Door_20k40k(); b=false; break;
			case 2: Double_Door_40k80k();  b=false; break;
			case 3: Refrigerators();b=false; break;
		    default:
		    	{
		    		System.out.println("Please enter valid option.");
		    		Single_Door_menu(); 
		    	}
			}
		 }while(b==true);
	}
//====================================================================================================================================================================
	public static void Double_Door_20k40k()
	{ System.out.println(RESET);
		 System.out.println("\t   "+" ____________________________________________________________________________________________________________________________________");  
		 System.out.println("\t   "+"|                                                                                                                                    |");  
		 System.out.println("\t   "+"|         _______________________________           _______________________________           _______________________________        |");  
		 System.out.println("\t   "+"|        |   HAIER 258 LITRES 3 STAR     |         |    LG 260 LLITRES 2 STAR      |         | WHIRLPOOL 265 LITRES 2 STAR   |       |");  
		 System.out.println("\t   "+"|        |-------------------------------|         |-------------------------------|         |-------------------------------|       |");  
		 System.out.println("\t   "+"|        |.Stabilizer Free Operation     |         |.Direct Cool Refrigerator      |         |.Stabilizer Free Operation     |       |");  
		 System.out.println("\t   "+"|        |.Toughened Glass               |         |.Stabilizer Free Operation     |         |.Direct Cool Refrigerator      |       |");  
		 System.out.println("\t   "+"|        |.Anti Bacterial Gasket         |         |.Digital Inverter Compressor   |         |.Smart Home Invertor Connect   |       |");  
		 System.out.println("\t   "+"|        |.Large Capacity Vegetable Box  |         |.Toughened Glass Shelves       |         |.Anti Bacterial Gasket         |       |");  
		 System.out.println("\t   "+"|        |.Base Stand Drawer             |         |.Digital Inverter Compressor   |         |.Base Stand Drawer             |       |");  
		 System.out.println("\t   "+"|        |.Smart Home Invertor Connect   |         |.Anti Bacterial Gasket         |         |.Digital Inverter Compressor   |       |");  
		 System.out.println("\t   "+"|        |.1 Year Warranty               |         |.Base Stand Drawer             |         |.Toughened Glass Shelves       |       |");  
		 System.out.println("\t   "+"|        |. PRICE  :  23,990.00/-        |         |. PRICE  :  25,990.00/-        |         |. PRICE  :  25,490.00/-        |       |");  
		 System.out.println("\t   "+"|        |_______________________________|         |_______________________________|         |_______________________________|       |");  
		 System.out.println("\t   "+"|                                                                                                                                    |");  
		 System.out.println("\t   "+"|                     1.                                          2.                                        3.                       |");  
		 System.out.println("\t   "+"|         _______________________________           _______________________________           _______________________________        |");  
		 System.out.println("\t   "+"|        |    LG 260 LITRES 2 STAR       |         |   SAMSUNG 253 LITRES 2 STAR   |         |                               |       |");  
		 System.out.println("\t   "+"|        |-------------------------------|         |-------------------------------|         |                               |       |");  
		 System.out.println("\t   "+"|        |.Stabilizer Free Operation     |         |.Stabilizer Free Operation     |         |                               |       |");  
		 System.out.println("\t   "+"|        |.Direct Cool Refrigerator      |         |.Direct Cool Refrigerator      |         |                               |       |");  
		 System.out.println("\t   "+"|        |.R600a Refrigerant             |         |.Flat Back Design              |         |             EXIT              |       |");  
		 System.out.println("\t   "+"|        |.Silent Operation              |         |.R600a Refrigerant             |         |           --------            |       |");  
		 System.out.println("\t   "+"|        |.Flat Back Design              |         |.Large Capacity Vegetable Box  |         |                               |       |");  
		 System.out.println("\t   "+"|        |.Anti Bacterial Gasket         |         |.Smart Home Invertor Connect   |         |                               |       |");  
		 System.out.println("\t   "+"|        |.Base Stand Drawer             |         |.Anti Bacterial Gasket         |         |                               |       |");  
		 System.out.println("\t   "+"|        |. PRICE  :  28,490.00/-        |         |. PRICE  :  29,990.00/-        |         |                               |       |");  
		 System.out.println("\t   "+"|        |_______________________________|         |_______________________________|         |_______________________________|       |");
		 System.out.println("\t   "+"|                                                                                                                                    |");  
		 System.out.println("\t   "+"|                    4.                                           5.                                         6.                      |");  
		 System.out.println("\t   "+"|____________________________________________________________________________________________________________________________________|");  
		 
		 System.out.println(RESET); Double_Door_20k40k_switch(); 
	}
//====================================================================================================================================================================
	public static void Double_Door_20k40k_switch()
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="HAIER 258 LITRES 3STAR";  ob1[i++]=23990;
					   System.out.print("Do you want to continue shopping in this Budget (Between 20k - 40k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						   switch(c1)	
						   {
						   case 'y':Double_Door_20k40k(); b=false; break; // MADE CHANGES HEREE
						   case 'n':Double_Door_menu(); b=false; break; // MADE CHANGES HEREE
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);  break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this Budget (Between 20k - 40k) [y/n or Y/N]:");  //MADE CHANGES HERE
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							   switch(c1)	
							   {
							   case 'y':Double_Door_20k40k(); b=false; break; //MADE CHANGES HERE
							   case 'n':
							   {
								   System.out.print("Do you want to continue in DOUBLE DOOR REFRIGERATOR [y/n or Y/N]:"); //MADE CHANGES HERE
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c2)
									   {
									   case 'y': Double_Door_menu(); b=false; break;
									   case 'n': Refrigerators(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="LG 260 LITRES 2STAR";  ob1[i++]=25990;
					   System.out.print("Do you want to continue shopping in this Budget (Between 20k - 40k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						   switch(c1)	
						   {
						   case 'y':Double_Door_20k40k(); b=false; break; // MADE CHANGES HEREE
						   case 'n':Double_Door_menu(); b=false; break; // MADE CHANGES HEREE
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);  break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this Budget (Between 20k - 40k) [y/n or Y/N]:");  //MADE CHANGES HERE
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							   switch(c1)	
							   {
							   case 'y':Double_Door_20k40k(); b=false; break; //MADE CHANGES HERE
							   case 'n':
							   {
								   System.out.print("Do you want to continue in DOUBLE DOOR REFRIGERATOR [y/n or Y/N]:"); //MADE CHANGES HERE
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c2)
									   {
									   case 'y': Double_Door_menu(); b=false; break;
									   case 'n': Refrigerators(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="WHIRLPOOL 265 LITRES 2STAR";  ob1[i++]=25490;
					   System.out.print("Do you want to continue shopping in this Budget (Between 20k - 40k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						   switch(c1)	
						   {
						   case 'y':Double_Door_20k40k(); b=false; break; // MADE CHANGES HEREE
						   case 'n':Double_Door_menu(); b=false; break; // MADE CHANGES HEREE
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);  break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this Budget (Between 20k - 40k) [y/n or Y/N]:");  //MADE CHANGES HERE
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							   switch(c1)	
							   {
							   case 'y':Double_Door_20k40k(); b=false; break; //MADE CHANGES HERE
							   case 'n':
							   {
								   System.out.print("Do you want to continue in DOUBLE DOOR REFRIGERATOR [y/n or Y/N]:"); //MADE CHANGES HERE
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c2)
									   {
									   case 'y': Double_Door_menu(); b=false; break;
									   case 'n': Refrigerators(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="LG 260 LITRES 2STAR";  ob1[i++]=28490;
					   System.out.print("Do you want to continue shopping in this Budget (Between 20k - 40k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						   switch(c1)	
						   {
						   case 'y':Double_Door_20k40k(); b=false; break; // MADE CHANGES HEREE
						   case 'n':Double_Door_menu(); b=false; break; // MADE CHANGES HEREE
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);  break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this Budget (Between 20k - 40k) [y/n or Y/N]:");  //MADE CHANGES HERE
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							   switch(c1)	
							   {
							   case 'y':Double_Door_20k40k(); b=false; break; //MADE CHANGES HERE
							   case 'n':
							   {
								   System.out.print("Do you want to continue in DOUBLE DOOR REFRIGERATOR [y/n or Y/N]:"); //MADE CHANGES HERE
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c2)
									   {
									   case 'y': Double_Door_menu(); b=false; break;
									   case 'n': Refrigerators(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SAMSUNG 253 LITRES 2STAR";  ob1[i++]=29990;
					   System.out.print("Do you want to continue shopping in this Budget (Between 20k - 40k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						   switch(c1)	
						   {
						   case 'y':Double_Door_20k40k(); b=false; break; // MADE CHANGES HEREE
						   case 'n':Double_Door_menu(); b=false; break; // MADE CHANGES HEREE
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);  break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this Budget (Between 20k - 40k) [y/n or Y/N]:");  //MADE CHANGES HERE
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							   switch(c1)	
							   {
							   case 'y':Double_Door_20k40k(); b=false; break; //MADE CHANGES HERE
							   case 'n':
							   {
								   System.out.print("Do you want to continue in DOUBLE DOOR REFRIGERATOR [y/n or Y/N]:"); //MADE CHANGES HERE
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c2)
									   {
									   case 'y': Double_Door_menu(); b=false; break;
									   case 'n': Refrigerators(); b=false; break;
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
			   case 6:Double_Door_menu(); b=false; break;
			   default: System.out.print("PLEASE ENTER VALID OPTION: ");
			   }
		   }while(b==true); 
	}
//====================================================================================================================================================================
	public static void Double_Door_40k80k()
	{ System.out.println(RESET);
		 System.out.println("\t   "+" ____________________________________________________________________________________________________________________________________");  
		 System.out.println("\t   "+"|                                                                                                                                    |");  
		 System.out.println("\t   "+"|         _______________________________           _______________________________           _______________________________        |");  
		 System.out.println("\t   "+"|        |  WHIRLPOOL 340 LITRES 3 STAR  |         |    BPL 450 LITRES 2 STAR      |         | WHIRLPOOL 325 LITRES 2 STAR   |       |");  
		 System.out.println("\t   "+"|        |-------------------------------|         |-------------------------------|         |-------------------------------|       |");  
		 System.out.println("\t   "+"|        |.Stabilizer Free Operation     |         |.Direct Cool Refrigerator      |         |.Stabilizer Free Operation     |       |");  
		 System.out.println("\t   "+"|        |.Toughened Glass               |         |.Stabilizer Free Operation     |         |.Direct Cool Refrigerator      |       |");  
		 System.out.println("\t   "+"|        |.Anti Bacterial Gasket         |         |.Digital Inverter Compressor   |         |.Smart Home Invertor Connect   |       |");  
		 System.out.println("\t   "+"|        |.Large Capacity Vegetable Box  |         |.Toughened Glass Shelves       |         |.Anti Bacterial Gasket         |       |");  
		 System.out.println("\t   "+"|        |.Base Stand Drawer             |         |.Digital Inverter Compressor   |         |.Base Stand Drawer             |       |");  
		 System.out.println("\t   "+"|        |.Smart Home Invertor Connect   |         |.Anti Bacterial Gasket         |         |.Digital Inverter Compressor   |       |");  
		 System.out.println("\t   "+"|        |.1 Year Warranty               |         |.Base Stand Drawer             |         |.Toughened Glass Shelves       |       |");  
		 System.out.println("\t   "+"|        |. PRICE  :  40,490.00/-        |         |. PRICE  :  40,990.00/-        |         |. PRICE  :  42,990.00/-        |       |");  
		 System.out.println("\t   "+"|        |_______________________________|         |_______________________________|         |_______________________________|       |");  
		 System.out.println("\t   "+"|                                                                                                                                    |");  
		 System.out.println("\t   "+"|                     1.                                          2.                                        3.                       |");  
		 System.out.println("\t   "+"|         _______________________________           _______________________________           _______________________________        |");  
		 System.out.println("\t   "+"|        |    LG 408 LITRES 2 STAR       |         |   BOSCH 559 LITRES 2 STAR     |         |                               |       |");  
		 System.out.println("\t   "+"|        |-------------------------------|         |-------------------------------|         |                               |       |");  
		 System.out.println("\t   "+"|        |.Stabilizer Free Operation     |         |.Stabilizer Free Operation     |         |                               |       |");  
		 System.out.println("\t   "+"|        |.Direct Cool Refrigerator      |         |.Direct Cool Refrigerator      |         |                               |       |");  
		 System.out.println("\t   "+"|        |.R600a Refrigerant             |         |.Flat Back Design              |         |             EXIT              |       |");  
		 System.out.println("\t   "+"|        |.Silent Operation              |         |.R600a Refrigerant             |         |           --------            |       |");  
		 System.out.println("\t   "+"|        |.Flat Back Design              |         |.Large Capacity Vegetable Box  |         |                               |       |");  
		 System.out.println("\t   "+"|        |.Anti Bacterial Gasket         |         |.Smart Home Invertor Connect   |         |                               |       |");  
		 System.out.println("\t   "+"|        |.Base Stand Drawer             |         |.Anti Bacterial Gasket         |         |                               |       |");  
		 System.out.println("\t   "+"|        |. PRICE  :  43,490.00/-        |         |. PRICE  :  82,990.00/-        |         |                               |       |");  
		 System.out.println("\t   "+"|        |_______________________________|         |_______________________________|         |_______________________________|       |");
		 System.out.println("\t   "+"|                                                                                                                                    |");  
		 System.out.println("\t   "+"|                    4.                                          5.                                         6.                       |");  
		 System.out.println("\t   "+"|____________________________________________________________________________________________________________________________________|");  
		 
		 System.out.println(RESET); Double_Door_40k80k_switch(); 
	}
//====================================================================================================================================================================
	public static void Double_Door_40k80k_switch()
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="WHIRLPOOL 340 LITRES 3STAR";  ob1[i++]=40490;
					   System.out.print("Do you want to continue shopping in this Budget (Between 40k - 80k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						   switch(c1)	
						   {
						   case 'y':Double_Door_40k80k(); b=false; break; // MADE CHANGES HEREE
						   case 'n':Double_Door_menu(); b=false; break; // MADE CHANGES HEREE
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);  break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this Budget (Between 40k - 80k) [y/n or Y/N]:");  //MADE CHANGES HERE
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							   switch(c1)	
							   {
							   case 'y':Double_Door_40k80k(); b=false; break; //MADE CHANGES HERE
							   case 'n':
							   {
								   System.out.print("Do you want to continue in DOUBLE DOOR REFRIGERATOR [y/n or Y/N]:"); //MADE CHANGES HERE
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c2)
									   {
									   case 'y': Double_Door_menu(); b=false; break;
									   case 'n': Refrigerators(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="BPL 450 LITRES 2STAR";  ob1[i++]=40990;
					   System.out.print("Do you want to continue shopping in this Budget (Between 40k - 80k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						   switch(c1)	
						   {
						   case 'y':Double_Door_40k80k(); b=false; break; // MADE CHANGES HEREE
						   case 'n':Double_Door_menu(); b=false; break; // MADE CHANGES HEREE
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);  break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this Budget (Between 40k - 80k) [y/n or Y/N]:");  //MADE CHANGES HERE
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							   switch(c1)	
							   {
							   case 'y':Double_Door_40k80k(); b=false; break; //MADE CHANGES HERE
							   case 'n':
							   {
								   System.out.print("Do you want to continue in DOUBLE DOOR REFRIGERATOR [y/n or Y/N]:"); //MADE CHANGES HERE
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c2)
									   {
									   case 'y': Double_Door_menu(); b=false; break;
									   case 'n': Refrigerators(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="WHIRLPOOL 325 LITRES 2STAR";  ob1[i++]=42990;
					   System.out.print("Do you want to continue shopping in this Budget (Between 40k - 80k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						   switch(c1)	
						   {
						   case 'y':Double_Door_40k80k(); b=false; break; // MADE CHANGES HEREE
						   case 'n':Double_Door_menu(); b=false; break; // MADE CHANGES HEREE
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);  break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this Budget (Between 40k - 80k) [y/n or Y/N]:");  //MADE CHANGES HERE
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							   switch(c1)	
							   {
							   case 'y':Double_Door_40k80k(); b=false; break; //MADE CHANGES HERE
							   case 'n':
							   {
								   System.out.print("Do you want to continue in DOUBLE DOOR REFRIGERATOR [y/n or Y/N]:"); //MADE CHANGES HERE
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c2)
									   {
									   case 'y': Double_Door_menu(); b=false; break;
									   case 'n': Refrigerators(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="LG 408 LITRES 2STAR";  ob1[i++]=43490;
					   System.out.print("Do you want to continue shopping in this Budget (Between 40k - 80k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						   switch(c1)	
						   {
						   case 'y':Double_Door_40k80k(); b=false; break; // MADE CHANGES HEREE
						   case 'n':Double_Door_menu(); b=false; break; // MADE CHANGES HEREE
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);  break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this Budget (Between 40k - 80k) [y/n or Y/N]:");  //MADE CHANGES HERE
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							   switch(c1)	
							   {
							   case 'y':Double_Door_40k80k(); b=false; break; //MADE CHANGES HERE
							   case 'n':
							   {
								   System.out.print("Do you want to continue in DOUBLE DOOR REFRIGERATOR [y/n or Y/N]:"); //MADE CHANGES HERE
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c2)
									   {
									   case 'y': Double_Door_menu(); b=false; break;
									   case 'n': Refrigerators(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="BOSCH 559 LITRES 2STAR";  ob1[i++]=82990;
					   System.out.print("Do you want to continue shopping in this Budget (Between 40k - 80k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						   switch(c1)	
						   {
						   case 'y':Double_Door_40k80k(); b=false; break; // MADE CHANGES HEREE
						   case 'n':Double_Door_menu(); b=false; break; // MADE CHANGES HEREE
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);  break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this Budget (Between 40k - 80k) [y/n or Y/N]:");  //MADE CHANGES HERE
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							   switch(c1)	
							   {
							   case 'y':Double_Door_40k80k(); b=false; break; //MADE CHANGES HERE
							   case 'n':
							   {
								   System.out.print("Do you want to continue in DOUBLE DOOR REFRIGERATOR [y/n or Y/N]:"); //MADE CHANGES HERE
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c2)
									   {
									   case 'y': Double_Door_menu(); b=false; break;
									   case 'n': Refrigerators(); b=false; break;
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
			   case 6:Double_Door_menu(); b=false; break;
			   default: System.out.print("PLEASE ENTER VALID OPTION: ");
			   }
		   }while(b==true); 
	}
//====================================================================================================================================================================
//	public static void main(String[] args) 
//	{
//		Refrigerators();
//	}
}
