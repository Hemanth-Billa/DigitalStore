package home_appliances;

import java.util.Scanner;

import home_screen.Main_Home;

public class Washing_Machines 
{
	public static String ob[]=new String[100];
	public static float ob1[]=new float[100];static int i=0;
	static Scanner sc  = new Scanner(System.in); private static final String RESET = "\033[0m";  // Text Reset
	static boolean b=true;
	//====================================================================================================================================================================
	public static void WashingMachines()
	{ System.out.println(RESET);
		System.out.println("                                                                                                                                           ");
		System.out.println(" \t         ####################################################         \t\t               ##########################################   ");
		System.out.println(" \t        #/|#                 #  ____           #  ___   ___  #        \t\t              #                                         #   ");
		System.out.println(" \t       #/ |#     __________  # |    |  ___     # [_O_] [_O_] #        \t\t             #       ############################      ##   ");
		System.out.println(" \t      #/  |#    |----------| # |____| |_o_|    # [_O_] [_O_] #        \t\t            #       #                          #      # #   ");
		System.out.println(" \t     #/   |#____|__________|_#_________________#_____________#        \t\t           #       #                          #      #  #   ");
		System.out.println(" \t    #/    |#                                                 #        \t\t          #       #      ############        #      #  /#   ");
		System.out.println(" \t    #     |#                                                 #        \t\t         #       #      #           #       #      #  //#   ");
		System.out.println(" \t    #     |#                                                 #        \t\t        #       ############################      #  // #   ");
		System.out.println(" \t    #     |#                                                 #        \t\t       #   _________   ___   ___   ___   ___     #  //  #   ");
		System.out.println(" \t    #     |#                                                 #        \t\t      #   (_________) [_o_] [_o_] [_o_] [_o_]   #  //   #   ");
		System.out.println(" \t    #     |#                                                 #        \t\t     #                                         #  //    #   ");
		System.out.println(" \t    #     |#                                                 #        \t\t     ########################################### //     #   ");
		System.out.println(" \t    #     |#            ** * * * * * * * * * * * **          #        \t\t     #_________________________________________#//      #   ");
		System.out.println(" \t    #     |#          ** * * * * * * * * * * * * * **        #        \t\t     #-----------------------------------------#/       #   ");
		System.out.println(" \t    #     |#         **                             **       #        \t\t     #                                         #        #   ");
		System.out.println(" \t    #     |#        **                            ** **      #        \t\t     #                                         #        #   ");
		System.out.println(" \t    #     |#       **                            **   **     #        \t\t     #                                         #        #   ");
		System.out.println(" \t    #     |#      **                            **     **    #        \t\t     #                                         #        #   ");
		System.out.println(" \t    #     |#      **                            **     **    #        \t\t     #                                         #        #   ");
		System.out.println(" \t    #     |#      **                            **     **    #        \t\t     #                                         #        #   ");
		System.out.println(" \t    #     |#       **                            **   **     #        \t\t     #                                         #        #   ");
		System.out.println(" \t    #     |#        **                            ** **      #        \t\t     #                                         #        #   ");
		System.out.println(" \t    #     |#         **                             **       #        \t\t     #                                         #        #   ");
		System.out.println(" \t    #     |#            ** * * * * * * * * * * * **          #        \t\t     #                                         #       #    ");
		System.out.println(" \t    #     |#                                                 #        \t\t     #                                         #      #    ");
		System.out.println(" \t    #     |#                                                 #        \t\t     #                                         #     #   ");
		System.out.println(" \t     #    |#                                                 #        \t\t     #                                         #    #   ");
		System.out.println(" \t      #   |#         1. FRONT LOAD WASHING MACHINES          #        \t\t     #       2. TOP LOAD WASHING MACHINES      #   #    ");
		System.out.println(" \t       #  |#                                                 #        \t\t     #                                         #  #   ");
		System.out.println(" \t        # |#                                                 #        \t\t     #                                         # #    ");
		System.out.println(" \t         #|#                                                 #        \t\t     #                                         ##   ");
		System.out.println(" \t          |###################################################        \t\t     ###########################################     ");
		System.out.println("                                                                                                                                    ");
		System.out.println("                                                                                                                                   ");
		System.out.println("                                                                            3)  EXIT                                    ");
		System.out.println();
		 System.out.println(RESET);		purchase();
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
			case 1:Frontloadmenu(); b=false; break;
			case 2:Toploadmenu(); b=false; break;
			case 3:Main_Home.home$Appliances();b=false; break;
				default: 
				{
					System.out.println();
					System.out.print("\t\t\t\t\t\t\t\t     "+"PLEASE ENTER VALID OPTION..."+"\n");
					WashingMachines();
				}
		    }
		}while(b==true);
	}
//=======================================================================================================================================================================+
	public static void Frontloadmenu()
	{ System.out.println(RESET);
		System.out.println("\t\t\t\t\t\t"+"                      FRONT LOAD WASHING MACHINES                           ");  
		 System.out.println("\t\t\t\t\t\t"+"                   -----------------------------                      ");  
		 System.out.println("\t\t\t\t\t\t"+"                       1.Between 20k - 40k                         ");  
		 System.out.println("\t\t\t\t\t\t"+"                       2.Above 40k                   ");
		 System.out.println("\t\t\t\t\t\t"+"                       3.EXIT FRONT LOAD                              ");
		 System.out.println(RESET); Frontload_switch();
	}
//=======================================================================================================================================================================
	public static void Frontload_switch()
	{
		System.out.print("PLEASE ENTER THE PRICE RANGE :");
		 
		 do
		 {
			int p=sc.nextInt();
			switch(p) 
			{
			case 1: Frontload_20k40k(); b=false; break;
			case 2: Frontload_above40k();  b=false; break;
			case 3: WashingMachines();b=false; break;
		    default:
		    	{
		    		System.out.println("Please enter valid option.");
		    		Frontloadmenu(); 
		    	}
			}
		 }while(b==true);
	}  
//=======================================================================================================================================================================
	public static void Frontload_20k40k()
	{ System.out.println(RESET);
		 System.out.println("\t   "+" _________________________________________________________________________________________________________________________________");  
		 System.out.println("\t   "+"|                                                                                                                                 |");  
		 System.out.println("\t   "+"|                                                                                                                                 |");  
		 System.out.println("\t   "+"|            _________________________                _________________________             _________________________             |");
		 System.out.println("\t   "+"|           |         ONIDA           |              |        SAMSUNG          |           |         ONIDA           |            |");
		 System.out.println("\t   "+"|           |-------------------------|              |-------------------------|           |-------------------------|            |");  
		 System.out.println("\t   "+"|           |  Model    : T75CgN1     |              |  Model    : WXGFHH2544  |           |  Model    : Wt85B4200gg |            |");  
		 System.out.println("\t   "+"|           |  Capacity : 7.5kgs      |              |  Capacity : 8.5kgs      |           |  Capacity : 8.5kgs      |            |");  
		 System.out.println("\t   "+"|           |  Control:Fully Automatic|              |  Control:Fully Automatic|           |  Control:Fully Automatic|            |");  
		 System.out.println("\t   "+"|           |  Height   : 85CM        |              |  Height   : 80CM        |           |  Height   : 75CM        |            |");  
		 System.out.println("\t   "+"|           |  Type     : FRONT LOAD  |              |  Weight   : 24.5kg      |           |  Weight   : 24.5kg      |            |");  
		 System.out.println("\t   "+"|           |  Colour   : Grey        |              |  Colour   : Black       |           |  Colour   : White       |            |");  
		 System.out.println("\t   "+"|           |  Air Dry  : Yes         |              |  Air Dry  : Yes         |           |  Air Dry  : Yes         |            |");  
		 System.out.println("\t   "+"|           |  Display  : Digital     |              |  Warranty : 1 Year      |           |  Warranty : 1 Year      |            |");  
		 System.out.println("\t   "+"|           |  Max Spin Speed:700Rpm  |              |  Dispaly  : Digital     |           |  Max Spin Speed:700Rpm  |            |");  
		 System.out.println("\t   "+"|           |  Price    : 20990/-     |              |  Price    : 26990/-     |           |  Price    : 28990/-     |            |");  
		 System.out.println("\t   "+"|           |_________________________|              |_________________________|           |_________________________|            |");  
		 System.out.println("\t   "+"|                                                                                                                                 |");   
		 System.out.println("\t   "+"|                       1.                                        2.                                   3.                         |");  
		 System.out.println("\t   "+"|                                                                                                                                 |");  
		 System.out.println("\t   "+"|            _________________________                _________________________             _________________________             |");  
		 System.out.println("\t   "+"|           |           LG            |              |           LG            |           |                         |            |");
		 System.out.println("\t   "+"|           |-------------------------|              |-------------------------|           |                         |            |");  
		 System.out.println("\t   "+"|           |  Model    :KAS-X12310B  |              |  Model    : XNHSAT6AA08 |           |                         |            |");  
		 System.out.println("\t   "+"|           |  Capacity :8.5kgs       |              |  Capacity : 8.5kgs      |           |                         |            |");  
		 System.out.println("\t   "+"|           |  Control:Fully Automatic|              |  Control:FullY Automatic|           |                         |            |");  
		 System.out.println("\t   "+"|           |  Height   : 82CM        |              |  Height   : 75CM        |           |          EXIT           |            |");  
		 System.out.println("\t   "+"|           |  Weight   : 24.5kg      |              |  Width Main: 40CM       |           |        --------         |            |");  
		 System.out.println("\t   "+"|           |  Colour   : White       |              |  Colour    : White      |           |                         |            |");  
		 System.out.println("\t   "+"|           |  Air Dry  : Yes         |              |  Air dry   : Yes        |           |                         |            |");  
		 System.out.println("\t   "+"|           |  Warranty : 3 Years     |              |  Warranty  : 1 Year     |           |                         |            |");  
		 System.out.println("\t   "+"|           |  Dispaly  : Digital     |              |  Dispaly   : Digital    |           |                         |            |");  
		 System.out.println("\t   "+"|           |  Price    : 29990/-     |              |  Price     : 38990/-    |           |                         |            |");  
		 System.out.println("\t   "+"|           |_________________________|              |_________________________|           |_________________________|            |");  
		 System.out.println("\t   "+"|                                                                                                                                 |");    
		 System.out.println("\t   "+"|                      4.                                         5.                                     6.                       |");  	 
		 System.out.println("\t   "+"|_________________________________________________________________________________________________________________________________|");
		 System.out.println(RESET);	 
		 
		 Frontload_20k40kswitch(); 
	}
//=======================================================================================================================================================================
	public static void Frontload_20k40kswitch()
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="ONIDA WASHING MACHINE";  ob1[i++]=20990;
						          System.out.print("Do you want to continue shopping in this Budget (Between 20k - 40k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
				 		  do
				 		  {
				 			char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
				 			switch(c1)	
							{
							case 'y':Frontload_20k40k(); b=false; break; // MADE CHANGES HEREE
							case 'n':Frontloadmenu(); b=false; break; // MADE CHANGES HEREE
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
									case 'y':Frontload_20k40k(); b=false; break; //MADE CHANGES HERE
									case 'n':
										{
											System.out.print("Do you want to continue in FRONT LOAD WASHING MACHINES [y/n or Y/N]:"); //MADE CHANGES HERE
											do 
											{
												char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
												switch(c2)
												{
												case 'y': Frontloadmenu(); b=false; break;
												case 'n': WashingMachines(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SAMSUNG WASHING MACHINE"; ob1[i++]=26990;
					   System.out.print("Do you want to continue shopping in this Budget (Between 20k - 40k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						   switch(c1)	
						   {
						   case 'y':Frontload_20k40k(); b=false; break; // MADE CHANGES HEREE
						   case 'n':Frontloadmenu(); b=false; break; // MADE CHANGES HEREE
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
							   case 'y':Frontload_20k40k(); b=false; break; //MADE CHANGES HERE
							   case 'n':
							   {
								   System.out.print("Do you want to continue in FRONT LOAD WASHING MACHINES [y/n or Y/N]:"); //MADE CHANGES HERE
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c2)
									   {
									   case 'y': Frontloadmenu(); b=false; break;
									   case 'n': WashingMachines(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="ONIDA WASHING MACHINE"; ob1[i++]=28990;
					   System.out.print("Do you want to continue shopping in this Budget (Between 20k - 40k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						   switch(c1)	
						   {
						   case 'y':Frontload_20k40k(); b=false; break; // MADE CHANGES HEREE
						   case 'n':Frontloadmenu(); b=false; break; // MADE CHANGES HEREE
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
							   case 'y':Frontload_20k40k(); b=false; break; //MADE CHANGES HERE
							   case 'n':
							   {
								   System.out.print("Do you want to continue in FRONT LOAD WASHING MACHINES [y/n or Y/N]:"); //MADE CHANGES HERE
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c2)
									   {
									   case 'y': Frontloadmenu(); b=false; break;
									   case 'n': WashingMachines(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="LG WASHING MACHINE";  ob1[i++]=29990;
					   System.out.print("Do you want to continue shopping in this Budget (Between 20k - 40k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						   switch(c1)	
						   {
						   case 'y':Frontload_20k40k(); b=false; break; // MADE CHANGES HEREE
						   case 'n':Frontloadmenu(); b=false; break; // MADE CHANGES HEREE
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
							   case 'y':Frontload_20k40k(); b=false; break; //MADE CHANGES HERE
							   case 'n':
							   {
								   System.out.print("Do you want to continue in FRONT LOAD WASHING MACHINES [y/n or Y/N]:"); //MADE CHANGES HERE
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c2)
									   {
									   case 'y': Frontloadmenu(); b=false; break;
									   case 'n': WashingMachines(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="LG WASHING MACHINE";  ob1[i++]=38990;
					   System.out.print("Do you want to continue shopping in this Budget (Between 20k - 40k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						   switch(c1)	
						   {
						   case 'y':Frontload_20k40k(); b=false; break; // MADE CHANGES HEREE
						   case 'n':Frontloadmenu(); b=false; break; // MADE CHANGES HEREE
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
							   case 'y':Frontload_20k40k(); b=false; break; //MADE CHANGES HERE
							   case 'n':
							   {
								   System.out.print("Do you want to continue in FRONT LOAD WASHING MACHINES [y/n or Y/N]:"); //MADE CHANGES HERE
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c2)
									   {
									   case 'y': Frontloadmenu(); b=false; break;
									   case 'n': WashingMachines(); b=false; break;
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
			   case 6:Frontloadmenu(); b=false; break;
			   default: System.out.print("PLEASE ENTER VALID OPTION: ");
			   }
		   }while(b==true); 
	}
	
//=======================================================================================================================================================================
	public static void Frontload_above40k()
	{ System.out.println(RESET);
		 System.out.println("\t   "+" _________________________________________________________________________________________________________________________________");  
		 System.out.println("\t   "+"|                                                                                                                                 |");  
		 System.out.println("\t   "+"|                                                                                                                                 |");  
		 System.out.println("\t   "+"|            _________________________                _________________________             _________________________             |"); 
		 System.out.println("\t   "+"|           |          IFB            |              |         SAMSUNG         |           |           LG            |            |");
		 System.out.println("\t   "+"|           |-------------------------|              |-------------------------|           |-------------------------|            |");  
		 System.out.println("\t   "+"|           |  Model    : T75CgN1     |              |  Model    : WGBET252356 |           |  Model    : TWYSAVGSD72W|            |");  
		 System.out.println("\t   "+"|           |  Capacity : 6.5kgs      |              |  Capacity : 10.5kgs     |           |  Capacity : 8.5kgs      |            |");  
		 System.out.println("\t   "+"|           |  Control: SEMI Automatic|              |  Control:Fully Automatic|           |  Height   : 103CM       |            |");  
		 System.out.println("\t   "+"|           |  Height   : 120CM       |              |  Height   : 100CM       |           |  Dispaly  : Digital     |            |");  
		 System.out.println("\t   "+"|           |  Type     : FRONT LOAD  |              |  Weight   : 24.5kg      |           |  Weight   : 24.5kg      |            |");  
		 System.out.println("\t   "+"|           |  Colour   : Grey        |              |  Colour   : Black       |           |  Colour   : White       |            |");  
		 System.out.println("\t   "+"|           |  Air Dry  : Yes         |              |  Air Dry  : Yes         |           |  Air dry  : Yes         |            |");  
		 System.out.println("\t   "+"|           |  Dispaly  : Digital     |              |  Warranty : 1 Years     |           |  Warranty : 1 Years     |            |");  
		 System.out.println("\t   "+"|           |  Max Spin Speed:700Rpm  |              |  Dispaly  : Digital     |           |  Max Spin Speed:700Rpm  |            |");  
		 System.out.println("\t   "+"|           |  Price    : 40990/-     |              |  Price    : 46990/-     |           |  Price    : 56990/-     |            |");  
		 System.out.println("\t   "+"|           |_________________________|              |_________________________|           |_________________________|            |");  
		 System.out.println("\t   "+"|                                                                                                                                 |");   
		 System.out.println("\t   "+"|                       1.                                        2.                                   3.                         |");  
		 System.out.println("\t   "+"|                                                                                                                                 |");  
		 System.out.println("\t   "+"|            _________________________                _________________________             _________________________             |");  
		 System.out.println("\t   "+"|           |           LG            |              |        PANASONIC        |           |                         |            |");
		 System.out.println("\t   "+"|           |-------------------------|              |-------------------------|           |                         |            |");  
		 System.out.println("\t   "+"|           |  Model    : KAS-X12310B |              |  Model     : XVTASR5AFA |           |                         |            |");  
		 System.out.println("\t   "+"|           |  Capacity : 8.5kgs      |              |  Capacity  : 8.5kgs     |           |                         |            |");  
		 System.out.println("\t   "+"|           |  Control:Fully Automatic|              |  Control:Semi Automatic |           |                         |            |");  
		 System.out.println("\t   "+"|           |  Height   : 100 CM      |              |  Height    : 100CM      |           |          EXIT           |            |");  
		 System.out.println("\t   "+"|           |  Weight   : 24.5kg      |              |  Width Main: 80cm       |           |         ------          |            |");  
		 System.out.println("\t   "+"|           |  Colour   : White       |              |  Colour    : White      |           |                         |            |");  
		 System.out.println("\t   "+"|           |  Air dry  : Yes         |              |  Air Dry   : Yes        |           |                         |            |");  
		 System.out.println("\t   "+"|           |  Warranty : 3 Years     |              |  Warranty  : 1 Year     |           |                         |            |");  
		 System.out.println("\t   "+"|           |  Dispaly  : Digital     |              |  Dispaly   : Digital    |           |                         |            |");  
		 System.out.println("\t   "+"|           |  Price    : 48990/-     |              |  Price     : 58990/-    |           |                         |            |");  
		 System.out.println("\t   "+"|           |_________________________|              |_________________________|           |_________________________|            |");  
		 System.out.println("\t   "+"|                                                                                                                                 |");    
		 System.out.println("\t   "+"|                      4.                                         5.                                     6.                       |");  	 
		 System.out.println("\t   "+"|_________________________________________________________________________________________________________________________________|");
		 System.out.println(RESET); Frontload_above40kswitch();
	}
//=======================================================================================================================================================================
	public static void Frontload_above40kswitch()
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="IFB WASHING MACHINE";  ob1[i++]=40990;
					   System.out.print("Do you want to continue shopping in this Budget (Above 40k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						   switch(c1)	
						   {
						   case 'y':Frontload_above40k(); b=false; break; // MADE CHANGES HEREE
						   case 'n':Frontloadmenu(); b=false; break; // MADE CHANGES HEREE
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);  break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this Budget (Above 40k) [y/n or Y/N]:");  //MADE CHANGES HERE
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							   switch(c1)	
							   {
							   case 'y':Frontload_above40k(); b=false; break; //MADE CHANGES HERE
							   case 'n':
							   {
								   System.out.print("Do you want to continue in FRONT LOAD WASHING MACHINES [y/n or Y/N]:"); //MADE CHANGES HERE
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c2)
									   {
									   case 'y': Frontloadmenu(); b=false; break;
									   case 'n': WashingMachines(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SAMSUNG WASHING MACHINE";  ob1[i++]=46990;
					   System.out.print("Do you want to continue shopping in this Budget (Above 40k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						   switch(c1)	
						   {
						   case 'y':Frontload_above40k(); b=false; break; // MADE CHANGES HEREE
						   case 'n':Frontloadmenu(); b=false; break; // MADE CHANGES HEREE
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);  break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this Budget (Above 40k) [y/n or Y/N]:");  //MADE CHANGES HERE
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							   switch(c1)	
							   {
							   case 'y':Frontload_above40k(); b=false; break; //MADE CHANGES HERE
							   case 'n':
							   {
								   System.out.print("Do you want to continue in FRONT LOAD WASHING MACHINES [y/n or Y/N]:"); //MADE CHANGES HERE
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c2)
									   {
									   case 'y': Frontloadmenu(); b=false; break;
									   case 'n': WashingMachines(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="LG WASHING MACHINE";  ob1[i++]=56990;
					   System.out.print("Do you want to continue shopping in this Budget (Above 40k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						   switch(c1)	
						   {
						   case 'y':Frontload_above40k(); b=false; break; // MADE CHANGES HEREE
						   case 'n':Frontloadmenu(); b=false; break; // MADE CHANGES HEREE
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);  break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this Budget (Above 40k) [y/n or Y/N]:");  //MADE CHANGES HERE
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							   switch(c1)	
							   {
							   case 'y':Frontload_above40k(); b=false; break; //MADE CHANGES HERE
							   case 'n':
							   {
								   System.out.print("Do you want to continue in FRONT LOAD WASHING MACHINES [y/n or Y/N]:"); //MADE CHANGES HERE
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c2)
									   {
									   case 'y': Frontloadmenu(); b=false; break;
									   case 'n': WashingMachines(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="LG WASHING MACHINE";  ob1[i++]=48990;
					   System.out.print("Do you want to continue shopping in this Budget (Above 40k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						   switch(c1)	
						   {
						   case 'y':Frontload_above40k(); b=false; break; // MADE CHANGES HEREE
						   case 'n':Frontloadmenu(); b=false; break; // MADE CHANGES HEREE
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);  break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this Budget (Above 40k) [y/n or Y/N]:");  //MADE CHANGES HERE
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							   switch(c1)	
							   {
							   case 'y':Frontload_above40k(); b=false; break; //MADE CHANGES HERE
							   case 'n':
							   {
								   System.out.print("Do you want to continue in FRONT LOAD WASHING MACHINES [y/n or Y/N]:"); //MADE CHANGES HERE
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c2)
									   {
									   case 'y': Frontloadmenu(); b=false; break;
									   case 'n': WashingMachines(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="PANASONIC WASHING MACHINE";  ob1[i++]=58990;
					   System.out.print("Do you want to continue shopping in this Budget (Above 40k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						   switch(c1)	
						   {
						   case 'y':Frontload_above40k(); b=false; break; // MADE CHANGES HEREE
						   case 'n':Frontloadmenu(); b=false; break; // MADE CHANGES HEREE
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);  break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this Budget (Above 40k) [y/n or Y/N]:");  //MADE CHANGES HERE
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							   switch(c1)	
							   {
							   case 'y':Frontload_above40k(); b=false; break; //MADE CHANGES HERE
							   case 'n':
							   {
								   System.out.print("Do you want to continue in FRONT LOAD WASHING MACHINES [y/n or Y/N]:"); //MADE CHANGES HERE
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c2)
									   {
									   case 'y': Frontloadmenu(); b=false; break;
									   case 'n': WashingMachines(); b=false; break;
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
			   case 6:Frontloadmenu(); b=false; break;
			   default: System.out.print("PLEASE ENTER VALID OPTION: ");
			   }
		   }while(b==true);
	}
//==================================================================================================================================================================
	public static void Toploadmenu()
	{ System.out.println(RESET);
		System.out.println("\t\t\t\t\t\t"+"                      TOP LOAD WASHING MACHINES                           ");  
		 System.out.println("\t\t\t\t\t\t"+"                   -----------------------------                      ");  
		 System.out.println("\t\t\t\t\t\t"+"                       1.Between 10k - 20k                         ");  
		 System.out.println("\t\t\t\t\t\t"+"                       2.Between 20k - 40k                   ");
		 System.out.println("\t\t\t\t\t\t"+"                       3.EXIT FROM TOP LOAD                             ");
		 System.out.println(RESET); Toploadswitch();
	}
//=====================================================================================================================================================================
	public static void Toploadswitch()
	{
		System.out.print("PLEASE ENTER THE PRICE RANGE  :");
		 
		 do
		 {
			int p=sc.nextInt();
			switch(p) 
			{
			case 1: Topload10k20k(); b=false; break;
			case 2: Topload20k40k();  b=false; break;
			case 3: WashingMachines();b=false; break;
		    default:
		    	{
		    		System.out.println("Please enter valid option.");
		    		Toploadmenu(); 
		    	}
			}
		 }while(b==true);
	}
	
//=====================================================================================================================================================================
	public static void Topload10k20k()
	{  System.out.println(RESET);
		
	     System.out.println("\t   "+" _________________________________________________________________________________________________________________________________");  
		 System.out.println("\t   "+"|                                                                                                                                 |");  
		 System.out.println("\t   "+"|                                                                                                                                 |");  
		 System.out.println("\t   "+"|            _________________________                _________________________             _________________________             |");
		 System.out.println("\t   "+"|           |         ONIDA           |              |        SAMSUNG          |           |         ONIDA           |            |");
		 System.out.println("\t   "+"|           |-------------------------|              |-------------------------|           |-------------------------|            |");  
		 System.out.println("\t   "+"|           |  Model    : T75CgN6     |              |  Model    : XM45TSAFA   |           |  Model    : WtGVSDA22   |            |");  
		 System.out.println("\t   "+"|           |  Capacity : 8.5kgs      |              |  Capacity : 8.5kgs      |           |  Capacity : 8.5kgs      |            |");  
		 System.out.println("\t   "+"|           |  Control:Fully Automatic|              |  Control:Fully Automatic|           |  Control:Semi Automatic |            |");  
		 System.out.println("\t   "+"|           |  Height   : 85CM        |              |  Height   : 87CM        |           |  Height   : 75CM        |            |");  
		 System.out.println("\t   "+"|           |  Type     : TOP LOAD    |              |  Weight   : 24.5kg      |           |  Weight   : 24.5kg      |            |");  
		 System.out.println("\t   "+"|           |  Colour   : Grey        |              |  Colour   : Black       |           |  Colour   : White       |            |");  
		 System.out.println("\t   "+"|           |  Air Dry  : Yes         |              |  Air Dry  : Yes         |           |  Air Dry  : Yes         |            |");  
		 System.out.println("\t   "+"|           |  Display  : Digital     |              |  Warranty : 1 Year      |           |  Warranty : 1Year       |            |");  
		 System.out.println("\t   "+"|           |  Max Spin Speed:700Rpm  |              |  Dispaly  : Digital     |           |  Max Spin Speed:800Rpm  |            |");  
		 System.out.println("\t   "+"|           |  Price    : 10990/-     |              |  Price    : 12990/-     |           |  Price    : 14990/-     |            |");  
		 System.out.println("\t   "+"|           |_________________________|              |_________________________|           |_________________________|            |");  
		 System.out.println("\t   "+"|                                                                                                                                 |");   
		 System.out.println("\t   "+"|                       1.                                        2.                                   3.                         |");  
		 System.out.println("\t   "+"|                                                                                                                                 |");  
		 System.out.println("\t   "+"|            _________________________                _________________________             _________________________             |");  
		 System.out.println("\t   "+"|           |           IFB           |              |        PANASONIC        |           |                         |            |");
		 System.out.println("\t   "+"|           |-------------------------|              |-------------------------|           |                         |            |");  
		 System.out.println("\t   "+"|           |  Model    : X12310B     |              |  Model    : Wt85CGB49   |           |                         |            |");  
		 System.out.println("\t   "+"|           |  Capacity : 6.5kgs      |              |  Capacity : 8.5kgs      |           |                         |            |");  
		 System.out.println("\t   "+"|           |  Control:Fully Automatic|              |  Control:Fully Automatic|           |                         |            |");  
		 System.out.println("\t   "+"|           |  Height   : 82CM        |              |  Height   : 75CM        |           |          EXIT           |            |");  
		 System.out.println("\t   "+"|           |  Weight   : 24.5kg      |              |  Width Main: 40CM       |           |        --------         |            |");  
		 System.out.println("\t   "+"|           |  Colour   : White       |              |  Colour    : Red        |           |                         |            |");  
		 System.out.println("\t   "+"|           |  Air Dry  : Yes         |              |  Air dry   : Yes        |           |                         |            |");  
		 System.out.println("\t   "+"|           |  Warranty : 3Year       |              |  Warranty  : 1Year      |           |                         |            |");  
		 System.out.println("\t   "+"|           |  Dispaly  : Digital     |              |  Dispaly   : Digital    |           |                         |            |");  
		 System.out.println("\t   "+"|           |  Price    : 15990/-     |              |  Price     : 18990/-    |           |                         |            |");  
		 System.out.println("\t   "+"|           |_________________________|              |_________________________|           |_________________________|            |");  
		 System.out.println("\t   "+"|                                                                                                                                 |");    
		 System.out.println("\t   "+"|                      4.                                         5.                                     6.                       |");  	 
		 System.out.println("\t   "+"|_________________________________________________________________________________________________________________________________|"); 		
		 System.out.println(RESET);Topload10k20switch();
	}
//=====================================================================================================================================================================
	public static void Topload10k20switch()
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="ONIDA WASHING MACHINE";  ob1[i++]=10990;
					   System.out.print("Do you want to continue shopping in this Budget (Between 10k - 20k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						   switch(c1)	
						   {
						   case 'y':Topload10k20k(); b=false; break; // MADE CHANGES HEREE
						   case 'n':Toploadmenu(); b=false; break; // MADE CHANGES HEREE
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);  break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this Budget (Between 10k - 20k) [y/n or Y/N]:");  //MADE CHANGES HERE
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							   switch(c1)	
							   {
							   case 'y':Topload10k20k(); b=false; break; //MADE CHANGES HERE
							   case 'n':
							   {
								   System.out.print("Do you want to continue in TOP LOAD WASHING MACHINES [y/n or Y/N]:"); //MADE CHANGES HERE
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c2)
									   {
									   case 'y': Toploadmenu(); b=false; break;
									   case 'n': WashingMachines(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SAMSUNG WASHING MACHINE";  ob1[i++]=12990;
					   System.out.print("Do you want to continue shopping in this Budget (Between 10k - 20k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						   switch(c1)	
						   {
						   case 'y':Topload10k20k(); b=false; break; // MADE CHANGES HEREE
						   case 'n':Toploadmenu(); b=false; break; // MADE CHANGES HEREE
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);  break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this Budget (Between 10k - 20k) [y/n or Y/N]:");  //MADE CHANGES HERE
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							   switch(c1)	
							   {
							   case 'y':Topload10k20k(); b=false; break; //MADE CHANGES HERE
							   case 'n':
							   {
								   System.out.print("Do you want to continue in TOP LOAD WASHING MACHINES [y/n or Y/N]:"); //MADE CHANGES HERE
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c2)
									   {
									   case 'y': Toploadmenu(); b=false; break;
									   case 'n': WashingMachines(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="ONIDA WASHING MACHINE";  ob1[i++]=14990;
					   System.out.print("Do you want to continue shopping in this Budget (Between 10k - 20k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						   switch(c1)	
						   {
						   case 'y':Topload10k20k(); b=false; break; // MADE CHANGES HEREE
						   case 'n':Toploadmenu(); b=false; break; // MADE CHANGES HEREE
						   default : System.out.print("Please enter valid option: ");
						   }
						   
					   }while(b==true);  break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this Budget (Between 10k - 20k) [y/n or Y/N]:");  //MADE CHANGES HERE
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							   switch(c1)	
							   {
							   case 'y':Topload10k20k(); b=false; break; //MADE CHANGES HERE
							   case 'n':
							   {
								   System.out.print("Do you want to continue in TOP LOAD WASHING MACHINES [y/n or Y/N]:"); //MADE CHANGES HERE
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c2)
									   {
									   case 'y': Toploadmenu(); b=false; break;
									   case 'n': WashingMachines(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="IFB WASHING MACHINE";  ob1[i++]=15990;
					   System.out.print("Do you want to continue shopping in this Budget (Between 10k - 20k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						   switch(c1)	
						   {
						   case 'y':Topload10k20k(); b=false; break; // MADE CHANGES HEREE
						   case 'n':Toploadmenu(); b=false; break; // MADE CHANGES HEREE
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);  break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this Budget (Between 10k - 20k) [y/n or Y/N]:");  //MADE CHANGES HERE
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							   switch(c1)	
							   {
							   case 'y':Topload10k20k(); b=false; break; //MADE CHANGES HERE
							   case 'n':
							   {
								   System.out.print("Do you want to continue in TOP LOAD WASHING MACHINES [y/n or Y/N]:"); //MADE CHANGES HERE
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c2)
									   {
									   case 'y': Toploadmenu(); b=false; break;
									   case 'n': WashingMachines(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="PANASONIC WASHING MACHINE";  ob1[i++]=18990;
					   System.out.print("Do you want to continue shopping in this Budget (Between 10k - 20k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						   switch(c1)	
						   {
						   case 'y':Topload10k20k(); b=false; break; // MADE CHANGES HEREE
						   case 'n':Toploadmenu(); b=false; break; // MADE CHANGES HEREE
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);  break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this Budget (Between 10k - 20k) [y/n or Y/N]:");  //MADE CHANGES HERE
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							   switch(c1)	
							   {
							   case 'y':Topload10k20k(); b=false; break; //MADE CHANGES HERE
							   case 'n':
							   {
								   System.out.print("Do you want to continue in TOP LOAD WASHING MACHINES [y/n or Y/N]:"); //MADE CHANGES HERE
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c2)
									   {
									   case 'y': Toploadmenu(); b=false; break;
									   case 'n': WashingMachines(); b=false; break;
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
			   case 6:Toploadmenu(); b=false; break;
			   default: System.out.print("PLEASE ENTER VALID OPTION: ");
			   }
		   }while(b==true);
	}
//=====================================================================================================================================================================
	public static void Topload20k40k()
	{ System.out.println(RESET);
		 System.out.println("\t   "+" _________________________________________________________________________________________________________________________________");  
		 System.out.println("\t   "+"|                                                                                                                                 |");  
		 System.out.println("\t   "+"|                                                                                                                                 |");  
		 System.out.println("\t   "+"|            _________________________                _________________________             _________________________             |");
		 System.out.println("\t   "+"|           |          LG             |              |        SAMSUNG          |           |         ONIDA           |            |");
		 System.out.println("\t   "+"|           |-------------------------|              |-------------------------|           |-------------------------|            |");  
		 System.out.println("\t   "+"|           |  Model    : T75CgN100CD |              |  Model    : QREC3TYX8S0 |           |  Model    : HYR83NCBCS  |            |");  
		 System.out.println("\t   "+"|           |  Capacity : 7.5kgs      |              |  Capacity : 8.5kgs      |           |  Capacity : 8.5kgs      |            |");  
		 System.out.println("\t   "+"|           |  Control:Fully Automatic|              |  Control:Fully Automatic|           |  Control:Semi Automatic |            |");  
		 System.out.println("\t   "+"|           |  Height   : 85CM        |              |  Height   : 90CM        |           |  Height   : 85CM        |            |");  
		 System.out.println("\t   "+"|           |  Type     : TOP LOAD    |              |  Weight   : 24.5kg      |           |  Weight   : 24.5kg      |            |");  
		 System.out.println("\t   "+"|           |  Colour   : Grey        |              |  Colour   : Black       |           |  Colour   : White       |            |");  
		 System.out.println("\t   "+"|           |  Air Dry  : Yes         |              |  Air Dry  : Yes         |           |  Air Dry  : Yes         |            |");  
		 System.out.println("\t   "+"|           |  Display  : Digital     |              |  Warranty : 1 Year      |           |  Warranty : 1 Year      |            |");  
		 System.out.println("\t   "+"|           |  Max Spin Speed:900Rpm  |              |  Dispaly  : Digital     |           |  Max Spin Speed:900Rpm  |            |");  
		 System.out.println("\t   "+"|           |  Price    : 22990/-     |              |  Price    : 27990/-     |           |  Price    : 29990/-     |            |");  
		 System.out.println("\t   "+"|           |_________________________|              |_________________________|           |_________________________|            |");  
		 System.out.println("\t   "+"|                                                                                                                                 |");   
		 System.out.println("\t   "+"|                       1.                                        2.                                   3.                         |");  
		 System.out.println("\t   "+"|                                                                                                                                 |");  
		 System.out.println("\t   "+"|            _________________________                _________________________             _________________________             |");  
		 System.out.println("\t   "+"|           |           IFB           |              |        WHIRLPOOL        |           |                         |            |");
		 System.out.println("\t   "+"|           |-------------------------|              |-------------------------|           |                         |            |");  
		 System.out.println("\t   "+"|           |  Model    :KXJUAH864    |              |  Model    : Xt85JUH8SS  |           |                         |            |");  
		 System.out.println("\t   "+"|           |  Capacity :8.5kgs       |              |  Capacity : 9.5kgs      |           |                         |            |");  
		 System.out.println("\t   "+"|           |  Control:Fully Automatic|              |  Control:Fully Automatic|           |                         |            |");  
		 System.out.println("\t   "+"|           |  Height   : 90CM        |              |  Height   : 95CM        |           |          EXIT           |            |");  
		 System.out.println("\t   "+"|           |  Weight   : 24.5kg      |              |  Width Main: 45CM       |           |        --------         |            |");  
		 System.out.println("\t   "+"|           |  Colour   : Purple      |              |  Colour    : White      |           |                         |            |");  
		 System.out.println("\t   "+"|           |  Air Dry  : Yes         |              |  Air dry   : Yes        |           |                         |            |");  
		 System.out.println("\t   "+"|           |  Warranty : 3 Years     |              |  Warranty  : 1 Year     |           |                         |            |");  
		 System.out.println("\t   "+"|           |  Dispaly  : Digital     |              |  Dispaly   : Digital    |           |                         |            |");  
		 System.out.println("\t   "+"|           |  Price    : 32990/-     |              |  Price     : 38990/-    |           |                         |            |");  
		 System.out.println("\t   "+"|           |_________________________|              |_________________________|           |_________________________|            |");  
		 System.out.println("\t   "+"|                                                                                                                                 |");    
		 System.out.println("\t   "+"|                      4.                                         5.                                     6.                       |");  	 
		 System.out.println("\t   "+"|_________________________________________________________________________________________________________________________________|");
		 System.out.println(RESET);
					 Topload20k40kswitch();
	}
//=====================================================================================================================================================================
	public static void Topload20k40kswitch()
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="LG WASHING MACHINE";  ob1[i++]=22990;
					   System.out.print("Do you want to continue shopping in this Budget (Between 20k - 40k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						   switch(c1)	
						   {
						   case 'y':Topload20k40k(); b=false; break; // MADE CHANGES HEREE
						   case 'n':Toploadmenu(); b=false; break; // MADE CHANGES HEREE
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
							   case 'y':Topload20k40k(); b=false; break; //MADE CHANGES HERE
							   case 'n':
							   {
								   System.out.print("Do you want to continue in TOP LOAD WASHING MACHINES [y/n or Y/N]:"); //MADE CHANGES HERE
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c2)
									   {
									   case 'y': Toploadmenu(); b=false; break;
									   case 'n': WashingMachines(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SAMSUNG WASHING MACHINE";  ob1[i++]=27990;
					   System.out.print("Do you want to continue shopping in this Budget (Between 20k - 40k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						   switch(c1)	
						   {
						   case 'y':Topload20k40k(); b=false; break; // MADE CHANGES HEREE
						   case 'n':Toploadmenu(); b=false; break; // MADE CHANGES HEREE
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
							   case 'y':Topload20k40k(); b=false; break; //MADE CHANGES HERE
							   case 'n':
							   {
								   System.out.print("Do you want to continue in TOP LOAD WASHING MACHINES [y/n or Y/N]:"); //MADE CHANGES HERE
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c2)
									   {
									   case 'y': Toploadmenu(); b=false; break;
									   case 'n': WashingMachines(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="ONIDA WASHING MACHINE";  ob1[i++]=29990;
					   System.out.print("Do you want to continue shopping in this Budget (Between 20k - 40k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						   switch(c1)	
						   {
						   case 'y':Topload20k40k(); b=false; break; // MADE CHANGES HEREE
						   case 'n':Toploadmenu(); b=false; break; // MADE CHANGES HEREE
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
							   case 'y':Topload20k40k(); b=false; break; //MADE CHANGES HERE
							   case 'n':
							   {
								   System.out.print("Do you want to continue in TOP LOAD WASHING MACHINES [y/n or Y/N]:"); //MADE CHANGES HERE
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c2)
									   {
									   case 'y': Toploadmenu(); b=false; break;
									   case 'n': WashingMachines(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="IFB WASHING MACHINE";  ob1[i++]=32990;
					   System.out.print("Do you want to continue shopping in this Budget (Between 20k - 40k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						   switch(c1)	
						   {
						   case 'y':Topload20k40k(); b=false; break; // MADE CHANGES HEREE
						   case 'n':Toploadmenu(); b=false; break; // MADE CHANGES HEREE
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
							   case 'y':Topload20k40k(); b=false; break; //MADE CHANGES HERE
							   case 'n':
							   {
								   System.out.print("Do you want to continue in TOP LOAD WASHING MACHINES [y/n or Y/N]:"); //MADE CHANGES HERE
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c2)
									   {
									   case 'y': Toploadmenu(); b=false; break;
									   case 'n': WashingMachines(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="WHIRLPOOL WASHING MACHINE";  ob1[i++]=38990;
					   System.out.print("Do you want to continue shopping in this Budget (Between 20k - 40k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						   switch(c1)	
						   {
						   case 'y':Topload20k40k(); b=false; break; // MADE CHANGES HEREE
						   case 'n':Toploadmenu(); b=false; break; // MADE CHANGES HEREE
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
							   case 'y':Topload20k40k(); b=false; break; //MADE CHANGES HERE
							   case 'n':
							   {
								   System.out.print("Do you want to continue in TOP LOAD WASHING MACHINES [y/n or Y/N]:"); //MADE CHANGES HERE
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c2)
									   {
									   case 'y': Toploadmenu(); b=false; break;
									   case 'n': WashingMachines(); b=false; break;
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
			   case 6:Toploadmenu(); b=false; break;
			   default: System.out.print("PLEASE ENTER VALID OPTION: ");
			   }
		   }while(b==true);
	}	
//=====================================================================================================================================================================
//	public static void main(String[] args)
//	{
//		WashingMachines();
//	}


}



