package audio;

import java.util.Scanner;

import home_screen.Main_Home;

public class Wired_Earphones 
{
	public static String ob[]=new String[100];
	public static float ob1[]=new float[100];
	static Scanner sc = new Scanner(System.in);static int i=0;private static final String RESET = "\033[0m";  // Text Resetw
	static boolean b =true;
	//===========================================================================================================
	public static void wired()
	{ System.out.println(RESET);
		System.out.println("\t\t\t\t  "+"                                                                          ");
		System.out.println("\t\t\t\t  "+"                                                                       ");
		System.out.println("\t\t\t\t  "+"                         @@@@@@@@@@@                                  ");
		System.out.println("\t\t\t\t  "+"                @@@%%%%%%@          *@@@                                 ");
		System.out.println("\t\t\t\t  "+"             (@%        @@            @@                                 ");
		System.out.println("\t\t\t\t  "+"             %@(        @@            &@*        @@@@@@@@@#@#@             ");
		System.out.println("\t\t\t\t  "+"             (@#        @@            @@       @@@           @@*@@@@)     ");
		System.out.println("\t\t\t\t  "+"               ,@@@(@@@)@@@          @@@      @@#           @@      @@       ");
		System.out.println("\t\t\t\t  "+"                           @@@@@@@@ %@)       @@%           @@      @@      ");
		System.out.println("\t\t\t\t  "+"                               @@  @@,         (@@&   @@%#@@@@@#(@@@@         ");
		System.out.println("\t\t\t\t  "+"                               @@  @@            @&  @@     ");
		System.out.println("\t\t\t\t  "+"                               @@  @@            @&  @@            ");
		System.out.println("\t\t\t\t  "+"                               @@  @@     @      @@  @@          ");
		System.out.println("\t\t\t\t  "+"                                @@@@&     @      @@  @@        ");
		System.out.println("\t\t\t\t  "+"                                 @@       @        @@&                ");
		System.out.println("\t\t\t\t  "+"                                 @@      @@@       @@        ");
		System.out.println("\t\t\t\t  "+"                                 @@      @@@       @@         ");
		System.out.println("\t\t\t\t  "+"                                 @@      @@@       @@          ");
		System.out.println("\t\t\t\t  "+"                                 @@      @@@       @@         ");
		System.out.println("\t\t\t\t  "+"                                 @@      @@@       @@           ");
		System.out.println("\t\t\t\t  "+"                                          @                  ");
		System.out.println("\t\t\t\t  "+"                                          @                 ");
		System.out.println("\t\t\t\t  "+"                                  -----------------   ");
		System.out.println("\t\t\t\t  "+"                                 | WIRED EARPHONES |   ");
		System.out.println("\t\t\t\t  "+"                                  -----------------  ");
		System.out.println("\t\t\t\t  "+"                                 |  1)SKULLCANDY   |     ");
		System.out.println("\t\t\t\t  "+"                                 |  2)SENNHEISER   |      ");
		System.out.println("\t\t\t\t  "+"                                 |  3)SONY         |            ");
		System.out.println("\t\t\t\t  "+"                                 |  4)BOAT         |         ");
		System.out.println("\t\t\t\t  "+"                                 |  5)JBL          |       ");
		System.out.println("\t\t\t\t  "+"                                 |  6)BOULT AUDIO  |       ");
		System.out.println("\t\t\t\t  "+"                                 |  7)EXIT         |           ");
		System.out.println("\t\t\t\t  "+"                                  -----------------              ");
		System.out.println("\t\t\t\t  "+"                                                                                    "+"\n");
		 System.out.println(RESET);wiredSwitch();
		
	}
	//===========================================================================================================
	public static void wiredSwitch()
	{
		System.out.print("PLEASE SELECT YOUR PREFERRED BRAND[1-7] : ");
		boolean b=true;
		do
		{
			int c=sc.nextInt();
			switch(c)
			{
			case 1:skullcandymenu(); b=false; break;
			case 2:sennheisermenu(); b=false; break;
			case 3:sonymenu();  b=false; break;
			case 4:boatmenu();  b=false;  break;
			case 5:jblmenu();  b=false;  break;
			case 6:boultaudiomenu();   b=false;  break;
			case 7:Main_Home.audios(); b=false;  break;
			default: 
				{
					System.out.println();
					System.out.print("\t\t\t\t\t\t\t\t     "+"PLEASE ENTER VALID OPTION..."+"\n");
					System.out.println();
			        wired();
				}
			}
		}while(b==true);
		
	}
	//===========================================================================================================
	public static void skullcandymenu()
	{ System.out.println(RESET);
		 System.out.println("\t\t\t\t\t\t"+"                         SKULLCANDY     ");  
		 System.out.println("\t\t\t\t\t\t"+"                      ----------------  ");  
		 System.out.println("\t\t\t\t\t\t"+"                        1.Below 1k        ");  
		 System.out.println("\t\t\t\t\t\t"+"                        2.Above 2k        ");
		 System.out.println("\t\t\t\t\t\t"+"                        3.EXIT            ");
		 System.out.println(RESET); skullcandyswitch();
	}
	//===========================================================================================================
	public static void skullcandyswitch()
	{
		System.out.print("PLEASE ENTER THE PRICE RANGE  :");
		 
		 do
		 {
			int p=sc.nextInt();
			switch(p) 
			{
			case 1: skullcandy1k(); b=false; break;
			case 2: skullcandy2k(); b=false; break;
			case 3: wired();b=false; break;
		    default:
		    	{
		    		System.out.println("Please enter valid option.");
		    		skullcandymenu(); 
		    	}
			}
		 }while(b==true);
	}
	//=================================================================================================================
	public static void skullcandy1k()//I HAVE TO DO CHANGES IN SYSO
	{ System.out.println(RESET);
		 System.out.println("\t   "+" ___________________________________________________________________________________________________________________________________");  
		 System.out.println("\t   "+"|                                                                                                                                   |");  
		 System.out.println("\t   "+"|    ___________________       ___________________       ___________________       ___________________       ___________________    |");  
		 System.out.println("\t   "+"|   |1.SKC - HP 1505    |     |2.SKC - S2DUHZ     |     |3.SKC - SCS2DU     |     |4.SKC - S2IKFZ     |     |5.SKC - SPS107     |   |");  
		 System.out.println("\t   "+"|   |-------------------|     |-------------------|     |-------------------|     |-------------------|     |-------------------|   |");  
		 System.out.println("\t   "+"|   |.In Ear Canalphone |     |.In Ear Canalphone |     |.In Ear Canalphone |     |.In Ear Canalphone |     |.In Ear Canalphone |   |");  
		 System.out.println("\t   "+"|   |.WIRED             |     |.WIRED             |     |.WIRED             |     |.WIRED             |     |.WIRED             |   |");  
		 System.out.println("\t   "+"|   |.Inline Controls   |     |.Dynamic Drivers   |     |.10MM Drivers      |     |.Heavy Base        |     |.Inline Controls   |   |");  
		 System.out.println("\t   "+"|   |.Heavy Base        |     |.Gold Plated jack  |     |.Inbuilt Mic       |     |.Gold Plated jack  |     |.Dynamic Drivers   |   |");  
		 System.out.println("\t   "+"|   |.Max frequency     |     |.3.5mm Jack        |     |.20hz - 20khz freq |     |.Dynamic Drivers   |     |.Noise Cancellation|   |");  
		 System.out.println("\t   "+"|   |.20hz - 20khz      |     |.20hz - 20khz freq |     |.3.5mm Jack        |     |.20hz - 20khz freq |     |.Inbuilt Mic       |   |");  
		 System.out.println("\t   "+"|   |.PRICE : 350/-     |     |.PRICE : 499/-     |     |.PRICE : 599/-     |     |.PRICE : 699/-     |     |.PRICE : 799/-     |   |");  
		 System.out.println("\t   "+"|   |___________________|     |___________________|     |___________________|     |___________________|     |___________________|   |");  
		 System.out.println("\t   "+"|                                                                                                                                   |");  
		 System.out.println("\t   "+"|                                                                                                                                   |");  
		 System.out.println("\t   "+"|    ___________________       ___________________       ___________________       ___________________       ___________________    |");  
		 System.out.println("\t   "+"|   |6.SKC - S2DUYK     |     |7.SKC - PLUS M685  |     |8.SKC - SMOKIN BUDS|     |9.SKC - S2CDJY     |     |                   |   |");  
		 System.out.println("\t   "+"|   |-------------------|     |-------------------|     |-------------------|     |-------------------|     |                   |   |");  
		 System.out.println("\t   "+"|   |.In Ear Canalphone |     |.In Ear Canalphone |     |.In Ear Canalphone |     |.In Ear Canalphone |     |       10.         |   |");  
		 System.out.println("\t   "+"|   |.WIRED             |     |.WIRED             |     |.WIRED with 3.5MM  |     |.WIRED             |     |                   |   |");  
		 System.out.println("\t   "+"|   |.13MM Drivers      |     |.Noise Cancellation|     |.Noise Cancellation|     |.Noise Cancellation|     |       EXIT        |   |");  
		 System.out.println("\t   "+"|   |.20hz - 20khz freq |     |.Inline Controls   |     |.Inbuilt Mic       |     |.Gold Plated Jack  |     |     ---------     |   |");  
		 System.out.println("\t   "+"|   |.Heavy Base        |     |.Dynamic Drivers   |     |.18hz - 20khz      |     |.15hz - 20khz      |     |                   |   |");  
		 System.out.println("\t   "+"|   |.Tangle Free       |     |.3.5mm Jack        |     |.Tangle free       |     |14MM Dynamic Driver|     |                   |   |");  
		 System.out.println("\t   "+"|   |.PRICE : 849/-     |     |.PRICE :  899/-    |     |.PRICE : 949/-     |     |.PRICE : 999/-     |     |                   |   |");  
		 System.out.println("\t   "+"|   |___________________|     |___________________|     |___________________|     |___________________|     |___________________|   |");  
		 System.out.println("\t   "+"|                                                                                                                                   |");    
		 System.out.println("\t   "+"|___________________________________________________________________________________________________________________________________|"+"\n"); 
		 System.out.println(RESET); skullcandy1kswitch();
	}
	//===============================================================================================================
	public static void skullcandy1kswitch()
	{
		System.out.print("PLEASE CHOOSE YOUR PREFERRED MODEL :");
		 do
		 {
			 int m=sc.nextInt();
			 switch(m)
			 {
			 case 1:
				 {
					 System.out.print("Do you want to add it to cart [y/n or Y/N]:");
					 do
					 {
						 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c)
						 {
						 case 'y':System.out.println("Your Item is added to cart .");  ob[i]="SKULLCANDY HP 1505";ob1[i++]=350;
						          System.out.print("Do you want to continue shopping in this Budget (Below 1K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
				 		  do
				 		  {
				 			char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
				 			switch(c1)	
							{
							case 'y':skullcandy1k(); b=false; break; // MADE CHANGES HEREE
							case 'n':skullcandymenu(); b=false; break; // MADE CHANGES HEREE
				 			default : System.out.print("Please enter valid option: ");
							}
				 		  }while(b==true);  break;
						 case 'n':
							 {
								 System.out.print("Do you want to see another model in this Budget (Below 1K) [y/n or Y/N]:");  //MADE CHANGES HERE
									do
									{
										char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									switch(c1)	
									{
									case 'y':skullcandy1k(); b=false; break;
									case 'n':
										{
											System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
											do 
											{
												char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
												switch(c2)
												{
												case 'y': skullcandymenu(); b=false; break;
												case 'n': wired(); b=false; break;
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
				 System.out.print("Do you want to add it to cart [y/n or Y/N]:");
				 do
				 {
					 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					 switch(c)
					 {
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SKULLCANDY S2DUHZ";ob1[i++]=499;
					 System.out.print("Do you want to continue shopping in this Budget (Below 1K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':skullcandy1k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':skullcandymenu(); b=false; break; // MADE CHANGES HEREE
						 default : System.out.print("Please enter valid option: ");
						 }
					 }while(b==true);  break;
					 case 'n':
					 {
						 System.out.print("Do you want to see another model in this Budget (Below 1K) [y/n or Y/N]:");  //MADE CHANGES HERE
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':skullcandy1k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': skullcandymenu(); b=false; break;
									 case 'n': wired(); b=false; break;
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
				 System.out.print("Do you want to add it to cart [y/n or Y/N]:");
				 do
				 {
					 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					 switch(c)
					 {
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SKULLCANDY SCS2DU";ob1[i++]=599;
					 System.out.print("Do you want to continue shopping in this Budget (Below 1K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':skullcandy1k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':skullcandymenu(); b=false; break; // MADE CHANGES HEREE
						 default : System.out.print("Please enter valid option: ");
						 }
					 }while(b==true);  break;
					 case 'n':
					 {
						 System.out.print("Do you want to see another model in this Budget (Below 1K) [y/n or Y/N]:");  //MADE CHANGES HERE
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':skullcandy1k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': skullcandymenu(); b=false; break;
									 case 'n': wired(); b=false; break;
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
				 System.out.print("Do you want to add it to cart [y/n or Y/N]:");
				 do
				 {
					 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					 switch(c)
					 {
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SKULLCANDY S21KFZ";ob1[i++]=699;
					 System.out.print("Do you want to continue shopping in this Budget (Below 1K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':skullcandy1k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':skullcandymenu(); b=false; break; // MADE CHANGES HEREE
						 default : System.out.print("Please enter valid option: ");
						 }
					 }while(b==true);  break;
					 case 'n':
					 {
						 System.out.print("Do you want to see another model in this Budget (Below 1K) [y/n or Y/N]:");  //MADE CHANGES HERE
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':skullcandy1k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': skullcandymenu(); b=false; break;
									 case 'n': wired(); b=false; break;
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
				 System.out.print("Do you want to add it to cart [y/n or Y/N]:");
				 do
				 {
					 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					 switch(c)
					 {
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SKULLCANDY SPS107";ob1[i++]=799;
					 System.out.print("Do you want to continue shopping in this Budget (Below 1K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':skullcandy1k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':skullcandymenu(); b=false; break; // MADE CHANGES HEREE
						 default : System.out.print("Please enter valid option: ");
						 }
					 }while(b==true);  break;
					 case 'n':
					 {
						 System.out.print("Do you want to see another model in this Budget (Below 1K) [y/n or Y/N]:");  //MADE CHANGES HERE
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':skullcandy1k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': skullcandymenu(); b=false; break;
									 case 'n': wired(); b=false; break;
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
			 case 6:
			 {
				 System.out.print("Do you want to add it to cart [y/n or Y/N]:");
				 do
				 {
					 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					 switch(c)
					 {
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SKULLCANDY S2DUYK";ob1[i++]=849;
					 System.out.print("Do you want to continue shopping in this Budget (Below 1K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':skullcandy1k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':skullcandymenu(); b=false; break; // MADE CHANGES HEREE
						 default : System.out.print("Please enter valid option: ");
						 }
					 }while(b==true);  break;
					 case 'n':
					 {
						 System.out.print("Do you want to see another model in this Budget (Below 1K) [y/n or Y/N]:");  //MADE CHANGES HERE
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':skullcandy1k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': skullcandymenu(); b=false; break;
									 case 'n': wired(); b=false; break;
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
			 case 7:
			 {
				 System.out.print("Do you want to add it to cart [y/n or Y/N]:");
				 do
				 {
					 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					 switch(c)
					 {
					 case 'y':System.out.println("Your Item is added to cart .");  ob[i]="SKULLCANDY PLUS M685";ob1[i++]=899;
					 System.out.print("Do you want to continue shopping in this Budget (Below 1K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':skullcandy1k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':skullcandymenu(); b=false; break; // MADE CHANGES HEREE
						 default : System.out.print("Please enter valid option: ");
						 }
					 }while(b==true);  break;
					 case 'n':
					 {
						 System.out.print("Do you want to see another model in this Budget (Below 1K) [y/n or Y/N]:");  //MADE CHANGES HERE
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':skullcandy1k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': skullcandymenu(); b=false; break;
									 case 'n': wired(); b=false; break;
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
			 case 8:
			 {
				 System.out.print("Do you want to add it to cart [y/n or Y/N]:");
				 do
				 {
					 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					 switch(c)
					 {
					 case 'y':System.out.println("Your Item is added to cart .");  ob[i]="SKULLCANDY SMOKIN BUDS";ob1[i++]=949;
					 System.out.print("Do you want to continue shopping in this Budget (Below 1K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':skullcandy1k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':skullcandymenu(); b=false; break; // MADE CHANGES HEREE
						 default : System.out.print("Please enter valid option: ");
						 }
					 }while(b==true);  break;
					 case 'n':
					 {
						 System.out.print("Do you want to see another model in this Budget (Below 1K) [y/n or Y/N]:");  //MADE CHANGES HERE
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':skullcandy1k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': skullcandymenu(); b=false; break;
									 case 'n': wired(); b=false; break;
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
			 case 9:
			 {
				 System.out.print("Do you want to add it to cart [y/n or Y/N]:");
				 do
				 {
					 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					 switch(c)
					 {
					 case 'y':System.out.println("Your Item is added to cart .");  ob[i]="SKULLCANDY S2CDJY";ob1[i++]=999;
					 System.out.print("Do you want to continue shopping in this Budget (Below 1K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':skullcandy1k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':skullcandymenu(); b=false; break; // MADE CHANGES HEREE
						 default : System.out.print("Please enter valid option: ");
						 }
					 }while(b==true);  break;
					 case 'n':
					 {
						 System.out.print("Do you want to see another model in this Budget (Below 1K) [y/n or Y/N]:");  //MADE CHANGES HERE
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':skullcandy1k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': skullcandymenu(); b=false; break;
									 case 'n': wired(); b=false; break;
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
			 case 10:  skullcandymenu(); b=false; break;
			 default:  System.out.print("Please enter valid option:");
			 }
		 }while(b==true); 
	}
	//==============================================================================================================
	public static void skullcandy2k()//I HAVE TO DO CHANGES IN SYSO
	{ System.out.println(RESET);
		 System.out.println("\t   "+" ___________________________________________________________________________________________________________________________________");  
		 System.out.println("\t   "+"|                                                                                                                                   |");  
		 System.out.println("\t   "+"|    ___________________       ___________________       ___________________       ___________________       ___________________    |");  
		 System.out.println("\t   "+"|   |1.SKC - S2FXGM     |     |2.SKC - SET        |     |3.SKC - RIFF 2.0   |     |4.SKC 2XL SPOKE    |     |5.SKC - S2SBDY     |   |");  
		 System.out.println("\t   "+"|   |-------------------|     |-------------------|     |-------------------|     |-------------------|     |-------------------|   |");  
		 System.out.println("\t   "+"|   |.WIRED EARPHONES   |     |.WIRED EARPHONES   |     |.WIRED EARPHONES   |     |.WIRED EARPHONES   |     |.WIRED EARPHONES   |   |");  
		 System.out.println("\t   "+"|   |.In Ear Canalphone |     |.18hz - 20khz      |     |.In Ear Canalphone |     |.Dynamic Drivers   |     |.20hz - 20khz      |   |");  
		 System.out.println("\t   "+"|   |.3.5mm Jack        |     |.Noise Cancellation|     |.Dynamic Drivers   |     |.1.2 Meter Cable   |     |.Inline Controls   |   |");  
		 System.out.println("\t   "+"|   |.High Base         |     |.In Ear Canalphone |     |.Inline Controls   |     |.Tangle Free       |     |.Premium Base      |   |");  
		 System.out.println("\t   "+"|   |.Dynamic Drivers   |     |.In Built Mic      |     |.3.5mm Stereo      |     |.Noise Isolation   |     |.Noise Cancellation|   |");  
		 System.out.println("\t   "+"|   |.20hz - 20khz      |     |.Dynamic Drivers   |     |.Gold Plated jack  |     |.In the Ear        |     |.14MM Driver       |   |");  
		 System.out.println("\t   "+"|   |.PRICE : 2190/-    |     |.PRICE : 2599/-    |     |.PRICE : 3699/-    |     |.PRICE : 3799/-    |     |.PRICE : 3990/-    |   |");  
		 System.out.println("\t   "+"|   |___________________|     |___________________|     |___________________|     |___________________|     |___________________|   |");  
		 System.out.println("\t   "+"|                                                                                                                                   |");  
		 System.out.println("\t   "+"|                                                                                                                                   |");  
		 System.out.println("\t   "+"|    ___________________       ___________________       ___________________       ___________________                              |");  
		 System.out.println("\t   "+"|   |6.SKC - S2FFFM     |     |7.SKC - S2IKDY     |     |8.SKC - XTPLYO     |     |                   |                             |");  
		 System.out.println("\t   "+"|   |-------------------|     |-------------------|     |-------------------|     |                   |                             |");  
		 System.out.println("\t   "+"|   |.WIRED EARPHONES   |     |.WIRED EARPHONES   |     |.WIRED EARPHONES   |     |        9.         |                             |");  
		 System.out.println("\t   "+"|   |.In Ear Canalphone |     |.Tangle Free Cable |     |.Clip on fit       |     |                   |                             |");  
		 System.out.println("\t   "+"|   |.10MM Drivers      |     |.Noise Cancellation|     |.Noise Cancellation|     |       EXIT        |                             |");  
		 System.out.println("\t   "+"|   |.Braded Cable      |     |.Premium Base      |     |.Answer / End Call |     |     ---------     |                             |");  
		 System.out.println("\t   "+"|   |.3.5MM Stereo      |     |.14MM Driver       |     |.In Built Mic      |     |                   |                             |");  
		 System.out.println("\t   "+"|   |.Inline Controls   |     |.20hz - 20khz      |     |.13.3MM Drivers    |     |                   |                             |");  
		 System.out.println("\t   "+"|   |.PRICE : 4599/-    |     |.PRICE : 4690/-    |     |.PRICE :  4999/-   |     |                   |                             |");  
		 System.out.println("\t   "+"|   |___________________|     |___________________|     |___________________|     |___________________|                             |");  
		 System.out.println("\t   "+"|                                                                                                                                   |");    
		 System.out.println("\t   "+"|___________________________________________________________________________________________________________________________________|"+"\n"); 
		 System.out.println(RESET); skullcandy2kswitch();
	}
	//==============================================================================================================
	public static void skullcandy2kswitch()
	{
		System.out.print("PLEASE CHOOSE YOUR PREFERRED MODEL :");
		 do
		 {
			 int m=sc.nextInt();
			 switch(m)
			 {
			 case 1:
				 {
					 System.out.print("Do you want to add it to cart [y/n or Y/N]:");
					 do
					 {
						 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c)
						 {
						 case 'y':System.out.println("Your Item is added to cart .");  ob[i]="SKULLCANDY S2FXGM";ob1[i++]=2190;
						          System.out.print("Do you want to continue shopping in this Budget (Above 2K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
				 		  do
				 		  {
				 			char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
				 			switch(c1)	
							{
							case 'y':skullcandy2k(); b=false; break; // MADE CHANGES HEREE
							case 'n':skullcandymenu(); b=false; break; // MADE CHANGES HEREE
				 			default : System.out.print("Please enter valid option: ");
							}
				 		  }while(b==true);  break;
						 case 'n':
							 {
								 System.out.print("Do you want to see another model in this Budget (Above 2K) [y/n or Y/N]:");  //MADE CHANGES HERE
									do
									{
										char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									switch(c1)	
									{
									case 'y':skullcandy2k(); b=false; break;
									case 'n':
										{
											System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
											do 
											{
												char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
												switch(c2)
												{
												case 'y': skullcandymenu(); b=false; break;
												case 'n': wired(); b=false; break;
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
				 System.out.print("Do you want to add it to cart [y/n or Y/N]:");
				 do
				 {
					 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					 switch(c)
					 {
					 case 'y':System.out.println("Your Item is added to cart .");  ob[i]="SKULLCANDY SET";ob1[i++]=2599;
					 System.out.print("Do you want to continue shopping in this Budget (Above 2K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':skullcandy2k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':skullcandymenu(); b=false; break; // MADE CHANGES HEREE
						 default : System.out.print("Please enter valid option: ");
						 }
					 }while(b==true);  break;
					 case 'n':
					 {
						 System.out.print("Do you want to see another model in this Budget (Above 2K) [y/n or Y/N]:");  //MADE CHANGES HERE
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':skullcandy2k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': skullcandymenu(); b=false; break;
									 case 'n': wired(); b=false; break;
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
				 System.out.print("Do you want to add it to cart [y/n or Y/N]:");
				 do
				 {
					 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					 switch(c)
					 {
					 case 'y':System.out.println("Your Item is added to cart .");  ob[i]="SKULLCANDY RIFF 2.0";ob1[i++]=3699;
					 System.out.print("Do you want to continue shopping in this Budget (Above 2K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':skullcandy2k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':skullcandymenu(); b=false; break; // MADE CHANGES HEREE
						 default : System.out.print("Please enter valid option: ");
						 }
					 }while(b==true);  break;
					 case 'n':
					 {
						 System.out.print("Do you want to see another model in this Budget (Above 2K) [y/n or Y/N]:");  //MADE CHANGES HERE
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':skullcandy2k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': skullcandymenu(); b=false; break;
									 case 'n': wired(); b=false; break;
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
				 System.out.print("Do you want to add it to cart [y/n or Y/N]:");
				 do
				 {
					 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					 switch(c)
					 {
					 case 'y':System.out.println("Your Item is added to cart .");  ob[i]="SKULLCANDY 2XL SPOKE";ob1[i++]=3799;
					 System.out.print("Do you want to continue shopping in this Budget (Above 2K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':skullcandy2k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':skullcandymenu(); b=false; break; // MADE CHANGES HEREE
						 default : System.out.print("Please enter valid option: ");
						 }
					 }while(b==true);  break;
					 case 'n':
					 {
						 System.out.print("Do you want to see another model in this Budget (Above 2K) [y/n or Y/N]:");  //MADE CHANGES HERE
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':skullcandy2k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': skullcandymenu(); b=false; break;
									 case 'n': wired(); b=false; break;
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
				 System.out.print("Do you want to add it to cart [y/n or Y/N]:");
				 do
				 {
					 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					 switch(c)
					 {
					 case 'y':System.out.println("Your Item is added to cart .");  ob[i]="SKULLCANDY S2SBDY";ob1[i++]=3990;
					 System.out.print("Do you want to continue shopping in this Budget (Above 2K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':skullcandy2k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':skullcandymenu(); b=false; break; // MADE CHANGES HEREE
						 default : System.out.print("Please enter valid option: ");
						 }
					 }while(b==true);  break;
					 case 'n':
					 {
						 System.out.print("Do you want to see another model in this Budget (Above 2K) [y/n or Y/N]:");  //MADE CHANGES HERE
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':skullcandy2k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': skullcandymenu(); b=false; break;
									 case 'n': wired(); b=false; break;
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
			 case 6:
			 {
				 System.out.print("Do you want to add it to cart [y/n or Y/N]:");
				 do
				 {
					 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					 switch(c)
					 {
					 case 'y':System.out.println("Your Item is added to cart .");  ob[i]="SKULLCANDY S2FFFM";ob1[i++]=4599;
					 System.out.print("Do you want to continue shopping in this Budget (Above 2K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':skullcandy2k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':skullcandymenu(); b=false; break; // MADE CHANGES HEREE
						 default : System.out.print("Please enter valid option: ");
						 }
					 }while(b==true);  break;
					 case 'n':
					 {
						 System.out.print("Do you want to see another model in this Budget (Above 2K) [y/n or Y/N]:");  //MADE CHANGES HERE
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':skullcandy2k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': skullcandymenu(); b=false; break;
									 case 'n': wired(); b=false; break;
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
			 case 7:
			 {
				 System.out.print("Do you want to add it to cart [y/n or Y/N]:");
				 do
				 {
					 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					 switch(c)
					 {
					 case 'y':System.out.println("Your Item is added to cart .");  ob[i]="SKULLCANDY S2IKDY";ob1[i++]=4690;
					 System.out.print("Do you want to continue shopping in this Budget (Above 2K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':skullcandy2k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':skullcandymenu(); b=false; break; // MADE CHANGES HEREE
						 default : System.out.print("Please enter valid option: ");
						 }
					 }while(b==true);  break;
					 case 'n':
					 {
						 System.out.print("Do you want to see another model in this Budget (Above 2K) [y/n or Y/N]:");  //MADE CHANGES HERE
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':skullcandy2k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': skullcandymenu(); b=false; break;
									 case 'n': wired(); b=false; break;
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
			 case 8:
			 {
				 System.out.print("Do you want to add it to cart [y/n or Y/N]:");
				 do
				 {
					 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					 switch(c)
					 {
					 case 'y':System.out.println("Your Item is added to cart .");  ob[i]="SKULLCANDY XTPLYO";ob1[i++]=4999;
					 System.out.print("Do you want to continue shopping in this Budget (Above 2K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':skullcandy2k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':skullcandymenu(); b=false; break; // MADE CHANGES HEREE
						 default : System.out.print("Please enter valid option: ");
						 }
					 }while(b==true);  break;
					 case 'n':
					 {
						 System.out.print("Do you want to see another model in this Budget (Above 2K) [y/n or Y/N]:");  //MADE CHANGES HERE
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':skullcandy2k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': skullcandymenu(); b=false; break;
									 case 'n': wired(); b=false; break;
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
			 
			 case 9:  skullcandymenu(); b=false; break;
			 default:  System.out.print("Please enter valid option:");
			 }
		 }while(b==true); 
	}
	//===========================================================================================
	public static void sennheisermenu()
	{ System.out.println(RESET);
		 System.out.println("\t\t\t\t\t\t"+"                         SENNHEISER     ");  
		 System.out.println("\t\t\t\t\t\t"+"                      ------------------  ");  
		 System.out.println("\t\t\t\t\t\t"+"                      1.Between 1k - 5k        ");  
		 System.out.println("\t\t\t\t\t\t"+"                      2.Between 5k - 25k       ");
		 System.out.println("\t\t\t\t\t\t"+"                      3.EXIT            ");
		 System.out.println(RESET); sennheiserswitch();
	}
	//==========================================================================================
	public static void sennheiserswitch()
	{
		System.out.print("PLEASE ENTER THE PRICE RANGE  :");
		 
		 do
		 {
			int p=sc.nextInt();
			switch(p) 
			{
			case 1: sennheiser1k5k(); b=false; break;
			case 2: sennheiser5k25k(); b=false; break;
			case 3: wired();b=false; break;
		    default:
		    	{
		    		System.out.println("Please enter valid option.");
		    		sennheisermenu(); 
		    	}
			}
		 }while(b==true);
	}
	//==========================================================================================
	public static void sennheiser1k5k()// I HAVE TO DO CHANGES IN SYSO
	{ System.out.println(RESET);
		 System.out.println("\t   "+" ___________________________________________________________________________________________________________________________________");  
		 System.out.println("\t   "+"|                                                                                                                                   |");  
		 System.out.println("\t   "+"|    ___________________       ___________________       ___________________       ___________________       ___________________    |");  
		 System.out.println("\t   "+"|   |1.SENNHEISER CX 213|     |2.SENNHEISER CX 100|     |3.SENNHEISER CX 80S|     |4.SENNHEISER CX 300|     |5.SENNHEISER CX 400|   |");  
		 System.out.println("\t   "+"|   |-------------------|     |-------------------|     |-------------------|     |-------------------|     |-------------------|   |");  
		 System.out.println("\t   "+"|   |.WIRED EARPHONES   |     |.WIRED EARPHONES   |     |.WIRED EARPHONES   |     |.WIRED EARPHONES   |     |.WIRED EARPHONES   |   |");  
		 System.out.println("\t   "+"|   |.3.5MM Jack        |     |.Dynamic Drivers   |     |.Dynamic Drivers   |     |.19hz - 20khz      |     |.In Ear Canalphone |   |");  
		 System.out.println("\t   "+"|   |.Inline Controls   |     |.Noise Cancellation|     |.Stereo Speaker    |     |.Inline Controls   |     |.Noise Cancellation|   |");  
		 System.out.println("\t   "+"|   |.In Ear Canalphone |     |.In Built Mic      |     |.In Ear Canalphone |     |.Premium Base      |     |.Dynamic Drivers   |   |");  
		 System.out.println("\t   "+"|   |.25hz - 20khz      |     |.Tangle Free       |     |.17hz - 20khz      |     |.Noise Isolation   |     |.Noise Cancellation|   |");  
		 System.out.println("\t   "+"|   |.Stereo Speakers   |     |.17hz - 20khz      |     |.3.5MM Jack        |     |.14MM Drivers      |     |.Heavy Base        |   |");  
		 System.out.println("\t   "+"|   |.PRICE : 1099/-    |     |.PRICE : 1299/-    |     |.PRICE : 1999/-    |     |.PRICE : 2699/-    |     |.PRICE : 3499/-    |   |");  
		 System.out.println("\t   "+"|   |___________________|     |___________________|     |___________________|     |___________________|     |___________________|   |");  
		 System.out.println("\t   "+"|                                                                                                                                   |");  
		 System.out.println("\t   "+"|                                                                                                                                   |");  
		 System.out.println("\t   "+"|                                            ___________________       ___________________                                          |");  
		 System.out.println("\t   "+"|                                           |6.SENNHEISER M2 IEi|     |                   |                                         |");  
		 System.out.println("\t   "+"|                                           |-------------------|     |                   |                                         |");  
		 System.out.println("\t   "+"|                                           |.WIRED EARPHONES   |     |        7.         |                                         |");  
		 System.out.println("\t   "+"|                                           |.15hz - 22khz      |     |                   |                                         |");  
		 System.out.println("\t   "+"|                                           |.Noise Cancellation|     |       EXIT        |                                         |");  
		 System.out.println("\t   "+"|                                           |.13.3MM Drivers    |     |   -------------   |                                         |");  
		 System.out.println("\t   "+"|                                           |.Stereo Speakers   |     |                   |                                         |");  
		 System.out.println("\t   "+"|                                           |.Dolby Support     |     |                   |                                         |");  
		 System.out.println("\t   "+"|                                           |.PRICE : 4599/-    |     |                   |                                         |");  
		 System.out.println("\t   "+"|                                           |___________________|     |___________________|                                         |");  
		 System.out.println("\t   "+"|                                                                                                                                   |");    
		 System.out.println("\t   "+"|___________________________________________________________________________________________________________________________________|"+"\n"); 
		 System.out.println(RESET);sennheiser1k5kswitch();
	}
	//==========================================================================================
	public static void sennheiser1k5kswitch()
	{
		System.out.print("PLEASE CHOOSE YOUR PREFERRED MODEL :");
		 do
		 {
			 int m=sc.nextInt();
			 switch(m)
			 {
			 case 1:
			 {
				 System.out.print("Do you want to add it to cart [y/n or Y/N]:");
				 do
				 {
					 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					 switch(c)
					 {
					 case 'y':System.out.println("Your Item is added to cart .");  ob[i]="SENNHEISER CX 213";ob1[i++]=1099;
					          System.out.print("Do you want to continue shopping in this Budget (Below 5K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
			 		  do
			 		  {
			 			char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
			 			switch(c1)	
						{
						case 'y':sennheiser1k5k(); b=false; break; // MADE CHANGES HEREE
						case 'n':sennheisermenu(); b=false; break; // MADE CHANGES HEREE
			 			default : System.out.print("Please enter valid option: ");
						}
			 		  }while(b==true);  break;
					 case 'n':
						 {
							 System.out.print("Do you want to see another model in this Budget (Below 5K) [y/n or Y/N]:");  //MADE CHANGES HERE
								do
								{
									char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								switch(c1)	
								{
								case 'y':sennheiser1k5k(); b=false; break;
								case 'n':
									{
										System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
										do 
										{
											char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
											switch(c2)
											{
											case 'y': sennheisermenu(); b=false; break;
											case 'n': wired(); b=false; break;
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
				 System.out.print("Do you want to add it to cart [y/n or Y/N]:");
				 do
				 {
					 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					 switch(c)
					 {
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SENNHEISER CX 100";ob1[i++]=1299;
					 System.out.print("Do you want to continue shopping in this Budget (Below 5K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':sennheiser1k5k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':sennheisermenu(); b=false; break; // MADE CHANGES HEREE
						 default : System.out.print("Please enter valid option: ");
						 }
					 }while(b==true);  break;
					 case 'n':
					 {
						 System.out.print("Do you want to see another model in this Budget (Below 5K) [y/n or Y/N]:");  //MADE CHANGES HERE
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':sennheiser1k5k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': sennheisermenu(); b=false; break;
									 case 'n': wired(); b=false; break;
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
				 System.out.print("Do you want to add it to cart [y/n or Y/N]:");
				 do
				 {
					 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					 switch(c)
					 {
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SENNHEISER CX 80S";ob1[i++]=1999;
					 System.out.print("Do you want to continue shopping in this Budget (Below 5K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':sennheiser1k5k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':sennheisermenu(); b=false; break; // MADE CHANGES HEREE
						 default : System.out.print("Please enter valid option: ");
						 }
					 }while(b==true);  break;
					 case 'n':
					 {
						 System.out.print("Do you want to see another model in this Budget (Below 5K) [y/n or Y/N]:");  //MADE CHANGES HERE
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':sennheiser1k5k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': sennheisermenu(); b=false; break;
									 case 'n': wired(); b=false; break;
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
				 System.out.print("Do you want to add it to cart [y/n or Y/N]:");
				 do
				 {
					 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					 switch(c)
					 {
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SENNHEISER CX 300";ob1[i++]=2699;
					 System.out.print("Do you want to continue shopping in this Budget (Below 5K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':sennheiser1k5k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':sennheisermenu(); b=false; break; // MADE CHANGES HEREE
						 default : System.out.print("Please enter valid option: ");
						 }
					 }while(b==true);  break;
					 case 'n':
					 {
						 System.out.print("Do you want to see another model in this Budget (Below 5K) [y/n or Y/N]:");  //MADE CHANGES HERE
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':sennheiser1k5k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': sennheisermenu(); b=false; break;
									 case 'n': wired(); b=false; break;
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
				 System.out.print("Do you want to add it to cart [y/n or Y/N]:");
				 do
				 {
					 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					 switch(c)
					 {
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SENNHEISER CX 400";ob1[i++]=3499;
					 System.out.print("Do you want to continue shopping in this Budget (Below 5K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':sennheiser1k5k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':sennheisermenu(); b=false; break; // MADE CHANGES HEREE
						 default : System.out.print("Please enter valid option: ");
						 }
					 }while(b==true);  break;
					 case 'n':
					 {
						 System.out.print("Do you want to see another model in this Budget (Below 5K) [y/n or Y/N]:");  //MADE CHANGES HERE
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':sennheiser1k5k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': sennheisermenu(); b=false; break;
									 case 'n': wired(); b=false; break;
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
			 case 6:
			 {
				 System.out.print("Do you want to add it to cart [y/n or Y/N]:");
				 do
				 {
					 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					 switch(c)
					 {
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SENNHEISER M2 IEi";ob1[i++]=4599;
					 System.out.print("Do you want to continue shopping in this Budget (Below 5K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':sennheiser1k5k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':sennheisermenu(); b=false; break; // MADE CHANGES HEREE
						 default : System.out.print("Please enter valid option: ");
						 }
					 }while(b==true);  break;
					 case 'n':
					 {
						 System.out.print("Do you want to see another model in this Budget (Below 5K) [y/n or Y/N]:");  //MADE CHANGES HERE
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':sennheiser1k5k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': sennheisermenu(); b=false; break;
									 case 'n': wired(); b=false; break;
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
			 case 7:  sennheisermenu(); b=false; break;
			 default:  System.out.print("Please enter valid option:");
			 }
		 }while(b==true); 
	}
	//==========================================================================================
	public static void sennheiser5k25k() // I HAVE TO MAKE CXHANGES IN SYSO
	{ System.out.println(RESET);
		 System.out.println("\t   "+" ___________________________________________________________________________________________________________________________________");  
		 System.out.println("\t   "+"|                                                                                                                                   |");  
		 System.out.println("\t   "+"|    ___________________       ___________________       ___________________       ___________________       ___________________    |");  
		 System.out.println("\t   "+"|   |1.SENNHEISER IE40  |     |2.SENNHEISER M2 IEG|     |3.SENNHEISER CX 680|     |4.SENNHEISER CX 200|     |5.SENNHEISER AMBEO |   |");  
		 System.out.println("\t   "+"|   |-------------------|     |-------------------|     |-------------------|     |-------------------|     |-------------------|   |");  
		 System.out.println("\t   "+"|   |.WIRED EARPHONES   |     |.WIRED EARPHONES   |     |.WIRED EARPHONES   |     |.WIRED EARPHONES   |     |.WIRED EARPHONES   |   |");  
		 System.out.println("\t   "+"|   |.20hz - 18khz      |     |.11.3MM Drivers    |     |.Premium Base      |     |.20hz - 20khz      |     |.14MM Drivers      |   |");  
		 System.out.println("\t   "+"|   |.Dynamic Drivers   |     |.Noise Cancellation|     |.Dynamic Drivers   |     |.Noise Cancellation|     |.Inline Controls   |   |");  
		 System.out.println("\t   "+"|   |.High Base         |     |.15hz - 22khz      |     |.Inline Controls   |     |.Stereo Speakers   |     |.20hz - 20khz      |   |");  
		 System.out.println("\t   "+"|   |.In Ear Canalphone |     |.In Ear Canalphone |     |.Noise Cancellation|     |.Tangle Free Cable |     |.Noise Cancellation|   |");  
		 System.out.println("\t   "+"|   |.3.5MM Jack        |     |.Stereo Speakers   |     |.18hz - 20khz      |     |.Dynamic Drivers   |     |.3D Sound Effects  |   |");  
		 System.out.println("\t   "+"|   |.PRICE : 5190/-    |     |.PRICE : 6399/-    |     |.PRICE : 6999/-    |     |.PRICE : 7299/-    |     |.PRICE : 9990/-    |   |");  
		 System.out.println("\t   "+"|   |___________________|     |___________________|     |___________________|     |___________________|     |___________________|   | ");  
		 System.out.println("\t   "+"|                                                                                                                                   |");  
		 System.out.println("\t   "+"|                                                                                                                                   |");  
		 System.out.println("\t   "+"|    ___________________       ___________________       ___________________       ___________________                              |");  
		 System.out.println("\t   "+"|   |6.SENNHEISER IE 300|     |7.SENNHEISER IE 400|     |8.SENNHEISER IE 600|     |                   |                             |");  
		 System.out.println("\t   "+"|   |-------------------|     |-------------------|     |-------------------|     |                   |                             |");  
		 System.out.println("\t   "+"|   |.WIRED EARPHONES   |     |.WIRED EARPHONES   |     |.WIRED EARPHONES   |     |        9.         |                             |");  
		 System.out.println("\t   "+"|   |.6Hz - 20Khz       |     |.In Ear Canalphone |     |.Foldable Design   |     |                   |                             |");  
		 System.out.println("\t   "+"|   |.Dynamic Drivers   |     |.Noise Cancellation|     |.4Hz - 46500Hz     |     |       EXIT        |                             |");  
		 System.out.println("\t   "+"|   |.Premium Base      |     |.In Built Mic      |     |.13.9MM Drivers    |     |     ---------     |                             |");  
		 System.out.println("\t   "+"|   |.3.5MM Jack        |     |.Clear Sound       |     |.Noise Cancellation|     |                   |                             |");  
		 System.out.println("\t   "+"|   |.Tangle Free Cable |     |.Answer / End Calls|     |.In Ear Canalphone |     |                   |                             |");  
		 System.out.println("\t   "+"|   |.PRICE : 19599/-   |     |.PRICE : 20990/-   |     |.PRICE : 24999/-   |     |                   |                             |");  
		 System.out.println("\t   "+"|   |___________________|     |___________________|     |___________________|     |___________________|                             |");  
		 System.out.println("\t   "+"|                                                                                                                                   |");    
		 System.out.println("\t   "+"|___________________________________________________________________________________________________________________________________|"+"\n"); 
		 System.out.println(RESET); sennheiser5k25kswitch();
	}
	//===========================================================================================
	public static void sennheiser5k25kswitch()
	{
		System.out.print("PLEASE CHOOSE YOUR PREFERRED MODEL :");
		 do
		 {
			 int m=sc.nextInt();
			 switch(m)
			 {
			 case 1:
			 {
				 System.out.print("Do you want to add it to cart [y/n or Y/N]:");
				 do
				 {
					 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					 switch(c)
					 {
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SENNHEISER IE40";ob1[i++]=5190;
					          System.out.print("Do you want to continue shopping in this Budget (Above 5K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
			 		  do
			 		  {
			 			char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
			 			switch(c1)	
						{
						case 'y':sennheiser5k25k(); b=false; break; // MADE CHANGES HEREE
						case 'n':sennheisermenu(); b=false; break; // MADE CHANGES HEREE
			 			default : System.out.print("Please enter valid option: ");
						}
			 		  }while(b==true);  break;
					 case 'n':
						 {
							 System.out.print("Do you want to see another model in this Budget (Above 5K) [y/n or Y/N]:");  //MADE CHANGES HERE
								do
								{
									char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								switch(c1)	
								{
								case 'y':sennheiser5k25k(); b=false; break;
								case 'n':
									{
										System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
										do 
										{
											char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
											switch(c2)
											{
											case 'y': sennheisermenu(); b=false; break;
											case 'n': wired(); b=false; break;
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
				 System.out.print("Do you want to add it to cart [y/n or Y/N]:");
				 do
				 {
					 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					 switch(c)
					 {
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SENNHEISER M2 IEG";ob1[i++]=6399;
					 System.out.print("Do you want to continue shopping in this Budget (Above 5K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':sennheiser5k25k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':sennheisermenu(); b=false; break; // MADE CHANGES HEREE
						 default : System.out.print("Please enter valid option: ");
						 }
					 }while(b==true);  break;
					 case 'n':
					 {
						 System.out.print("Do you want to see another model in this Budget (Above 5K) [y/n or Y/N]:");  //MADE CHANGES HERE
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':sennheiser5k25k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': sennheisermenu(); b=false; break;
									 case 'n': wired(); b=false; break;
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
				 System.out.print("Do you want to add it to cart [y/n or Y/N]:");
				 do
				 {
					 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					 switch(c)
					 {
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SENNHEISER CX 680";ob1[i++]=6999;
					 System.out.print("Do you want to continue shopping in this Budget (Above 5K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':sennheiser5k25k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':sennheisermenu(); b=false; break; // MADE CHANGES HEREE
						 default : System.out.print("Please enter valid option: ");
						 }
					 }while(b==true);  break;
					 case 'n':
					 {
						 System.out.print("Do you want to see another model in this Budget (Above 5K) [y/n or Y/N]:");  //MADE CHANGES HERE
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':sennheiser5k25k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': sennheisermenu(); b=false; break;
									 case 'n': wired(); b=false; break;
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
				 System.out.print("Do you want to add it to cart [y/n or Y/N]:");
				 do
				 {
					 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					 switch(c)
					 {
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SENNHEISER CX 200";ob1[i++]=7299;
					 System.out.print("Do you want to continue shopping in this Budget (Above 5K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':sennheiser5k25k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':sennheisermenu(); b=false; break; // MADE CHANGES HEREE
						 default : System.out.print("Please enter valid option: ");
						 }
					 }while(b==true);  break;
					 case 'n':
					 {
						 System.out.print("Do you want to see another model in this Budget (Above 5K) [y/n or Y/N]:");  //MADE CHANGES HERE
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':sennheiser5k25k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': sennheisermenu(); b=false; break;
									 case 'n': wired(); b=false; break;
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
				 System.out.print("Do you want to add it to cart [y/n or Y/N]:");
				 do
				 {
					 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					 switch(c)
					 {
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SENNHEISER AMBEO";ob1[i++]=9990;
					 System.out.print("Do you want to continue shopping in this Budget (Above 5K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':sennheiser5k25k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':sennheisermenu(); b=false; break; // MADE CHANGES HEREE
						 default : System.out.print("Please enter valid option: ");
						 }
					 }while(b==true);  break;
					 case 'n':
					 {
						 System.out.print("Do you want to see another model in this Budget (Above 5K) [y/n or Y/N]:");  //MADE CHANGES HERE
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':sennheiser5k25k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': sennheisermenu(); b=false; break;
									 case 'n': wired(); b=false; break;
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
			 case 6:
			 {
				 System.out.print("Do you want to add it to cart [y/n or Y/N]:");
				 do
				 {
					 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					 switch(c)
					 {
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SENNHEISER IE 300";ob1[i++]=19599;
					 System.out.print("Do you want to continue shopping in this Budget (Above 5K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':sennheiser5k25k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':sennheisermenu(); b=false; break; // MADE CHANGES HEREE
						 default : System.out.print("Please enter valid option: ");
						 }
					 }while(b==true);  break;
					 case 'n':
					 {
						 System.out.print("Do you want to see another model in this Budget (Above 5K) [y/n or Y/N]:");  //MADE CHANGES HERE
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':sennheiser5k25k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': sennheisermenu(); b=false; break;
									 case 'n': wired(); b=false; break;
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
			 case 7:
			 {
				 System.out.print("Do you want to add it to cart [y/n or Y/N]:");
				 do
				 {
					 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					 switch(c)
					 {
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SENNHEISER IE 400";ob1[i++]=20990;
					 System.out.print("Do you want to continue shopping in this Budget (Above 5K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':sennheiser5k25k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':sennheisermenu(); b=false; break; // MADE CHANGES HEREE
						 default : System.out.print("Please enter valid option: ");
						 }
					 }while(b==true);  break;
					 case 'n':
					 {
						 System.out.print("Do you want to see another model in this Budget (Above 5K) [y/n or Y/N]:");  //MADE CHANGES HERE
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':sennheiser5k25k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': sennheisermenu(); b=false; break;
									 case 'n': wired(); b=false; break;
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
			 case 8:
			 {
				 System.out.print("Do you want to add it to cart [y/n or Y/N]:");
				 do
				 {
					 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					 switch(c)
					 {
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SENNHEISER IE 600";ob1[i++]=24999;
					 System.out.print("Do you want to continue shopping in this Budget (Above 5K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':sennheiser5k25k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':sennheisermenu(); b=false; break; // MADE CHANGES HEREE
						 default : System.out.print("Please enter valid option: ");
						 }
					 }while(b==true);  break;
					 case 'n':
					 {
						 System.out.print("Do you want to see another model in this Budget (Above 5K) [y/n or Y/N]:");  //MADE CHANGES HERE
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':sennheiser5k25k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': sennheisermenu(); b=false; break;
									 case 'n': wired(); b=false; break;
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
			 case 9:  sennheisermenu(); b=false; break;
			 default:  System.out.print("Please enter valid option:");
			 }
		 }while(b==true); 
	}
	//============================================================================================
	public static void sonymenu()
	{ System.out.println(RESET);
		 System.out.println("\t\t\t\t\t\t"+"                             SONY    ");  
		 System.out.println("\t\t\t\t\t\t"+"                      ------------------  ");  
		 System.out.println("\t\t\t\t\t\t"+"                      1.Between 1k - 2k        ");  
		 System.out.println("\t\t\t\t\t\t"+"                      2.Between 2k - 5k       ");
		 System.out.println("\t\t\t\t\t\t"+"                      3.Between 5k - 25k       ");
		 System.out.println("\t\t\t\t\t\t"+"                      4.EXIT            ");
		 System.out.println(RESET); sonyswitch();
	}
	//============================================================================================
	public static void sonyswitch()
	{
		System.out.print("PLEASE ENTER THE PRICE RANGE  :");
		 
		 do
		 {
			int p=sc.nextInt();
			switch(p) 
			{
			case 1: sony1k(); b=false; break;
			case 2: sony2k5k(); b=false; break;
			case 3: sony5k25k(); b=false; break;
			case 4: wired();b=false; break;
		    default:
		    	{
		    		System.out.println("Please enter valid option.");
		    		sonymenu(); 
		    	}
			}
		 }while(b==true);
	}
	//=============================================================================================
	public static void sony1k()// I HAVE TO CHANGE MATTER IN SYSO
	{ System.out.println(RESET);
		 System.out.println("\t   "+" ___________________________________________________________________________________________________________________________________");  
		 System.out.println("\t   "+"|                                                                                                                                   |");  
		 System.out.println("\t   "+"|    ___________________       ___________________       ___________________       ___________________       ___________________    |");  
		 System.out.println("\t   "+"|   |1.SONY MDR-XB30EX  |     |2.SONY MDR-EX110LP |     |3.SONY MDR-EX255AP |     |4.SONY MDR-AS410AP |     |5.SONY MDR-XB510AS |   |");  
		 System.out.println("\t   "+"|   |-------------------|     |-------------------|     |-------------------|     |-------------------|     |-------------------|   |");  
		 System.out.println("\t   "+"|   |.WIRED EARPHONES   |     |.WIRED EARPHONES   |     |.WIRED EARPHONES   |     |.WIRED EARPHONES   |     |.WIRED EARPHONES   |   |");  
		 System.out.println("\t   "+"|   |.8Hz - 22Khz       |     |.5Hz - 24Khz       |     |.5Hz - 25Khz       |     |.5Hz - 24Khz       |     |.4Hz - 24khz       |   |");  
		 System.out.println("\t   "+"|   |.Inline Controls   |     |.Dynamic Drivers   |     |.In Ear Canalphone |     |.Stereo Speakers   |     |.Inline Controls   |   |");  
		 System.out.println("\t   "+"|   |.In Ear Canalphone |     |.Dolby Support     |     |.Noise Cancellation|     |.Noise Cancellation|     |.Noise Isolation   |   |");  
		 System.out.println("\t   "+"|   |.Stereo Speakers   |     |.Premium Base      |     |.Inline Controls   |     |.Dolby Support     |     |.Noise Cancellation|   |");  
		 System.out.println("\t   "+"|   |.Heavy Base        |     |.In Ear CanalPhone |     |.Dynamic Drivers   |     |.Premium Base      |     |.Dolby Support     |   |");  
		 System.out.println("\t   "+"|   |.PRICE : 1099/-    |     |.PRICE : 1399/-    |     |.PRICE : 1599/-    |     |.PRICE : 1650/-    |     |.PRICE : 1699/-    |   |");  
		 System.out.println("\t   "+"|   |___________________|     |___________________|     |___________________|     |___________________|     |___________________|   |");  
		 System.out.println("\t   "+"|                                                                                                                                   |");  
		 System.out.println("\t   "+"|                                                                                                                                   |");  
		 System.out.println("\t   "+"|    ___________________       ___________________       ___________________       ___________________       ___________________    |");  
		 System.out.println("\t   "+"|   |6.SONY MDR-EX14AP  |     |7.SONY MDR-EX155AP |     |8.SONY MDR-EX150AP |     |9.SONY MDR-EX55AP  |     |                   |   |");  
		 System.out.println("\t   "+"|   |-------------------|     |-------------------|     |-------------------|     |-------------------|     |                   |   |");  
		 System.out.println("\t   "+"|   |.WIRED EARPHONES   |     |.WIRED EARPHONES   |     |.WIRED EARPHONES   |     |.WIRED EARPHONES   |     |       10.         |   |");  
		 System.out.println("\t   "+"|   |.8Hz - 22Khz       |     |.Premium Base      |     |.Dynamic Drivers   |     |.11.3MM Drivers    |     |                   |   |");  
		 System.out.println("\t   "+"|   |.Dynamic Drivers   |     |.Noise Cancellation|     |.Noise Cancellation|     |.Noise Cancellation|     |       EXIT        |   |");  
		 System.out.println("\t   "+"|   |.Tangle Free Cable |     |.5Hz - 24Khz       |     |.Noise Isolation   |     |.Tangle Free Cable |     |     ---------     |   |");  
		 System.out.println("\t   "+"|   |.Echo Reduction    |     |.In Ear Canalphone |     |.3.5MM Jack        |     |.Stereo Speakers   |     |                   |   |");  
		 System.out.println("\t   "+"|   |.Noise Cancellation|     |.Dolby Support     |     |.Stereo Speakers   |     |.Dolby Support     |     |                   |   |");  
		 System.out.println("\t   "+"|   |.PRICE : 1799/-    |     |.PRICE : 1800/-    |     |.PRICE : 1899/-    |     |.PRICE : 1999/-    |     |                   |   |");  
		 System.out.println("\t   "+"|   |___________________|     |___________________|     |___________________|     |___________________|     |___________________|   |");  
		 System.out.println("\t   "+"|                                                                                                                                   |");    
		 System.out.println("\t   "+"|___________________________________________________________________________________________________________________________________|"+"\n"); 
		 System.out.println(RESET); sony1kswitch();
	}
	//==============================================================================================
	public static void sony1kswitch()
	{
		System.out.print("PLEASE CHOOSE YOUR PREFERRED MODEL :");
		 do
		 {
			 int m=sc.nextInt();
			 switch(m)
			 {
			 case 1:
			 {
				 System.out.print("Do you want to add it to cart [y/n or Y/N]:");
				 do
				 {
					 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					 switch(c)
					 {
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SONY MDR-XB30EX";ob1[i++]=1099;
					          System.out.print("Do you want to continue shopping in this Budget (Below 2K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
			 		  do
			 		  {
			 			char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
			 			switch(c1)	
						{
						case 'y':sony1k(); b=false; break; // MADE CHANGES HEREE
						case 'n':sonymenu(); b=false; break; // MADE CHANGES HEREE
			 			default : System.out.print("Please enter valid option: ");
						}
			 		  }while(b==true);  break;
					 case 'n':
						 {
							 System.out.print("Do you want to see another model in this Budget (Below 2K) [y/n or Y/N]:");  //MADE CHANGES HERE
								do
								{
									char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								switch(c1)	
								{
								case 'y':sony1k(); b=false; break;
								case 'n':
									{
										System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
										do 
										{
											char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
											switch(c2)
											{
											case 'y': sonymenu(); b=false; break;
											case 'n': wired(); b=false; break;
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
				 System.out.print("Do you want to add it to cart [y/n or Y/N]:");
				 do
				 {
					 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					 switch(c)
					 {
					 case 'y':System.out.println("Your Item is added to cart .");  ob[i]="SONY MDR-EX110LP";ob1[i++]=1399;
					 System.out.print("Do you want to continue shopping in this Budget (Below 2K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':sony1k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':sonymenu(); b=false; break; // MADE CHANGES HEREE
						 default : System.out.print("Please enter valid option: ");
						 }
					 }while(b==true);  break;
					 case 'n':
					 {
						 System.out.print("Do you want to see another model in this Budget (Below 2K) [y/n or Y/N]:");  //MADE CHANGES HERE
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':sony1k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': sonymenu(); b=false; break;
									 case 'n': wired(); b=false; break;
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
				 System.out.print("Do you want to add it to cart [y/n or Y/N]:");
				 do
				 {
					 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					 switch(c)
					 {
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SONY MDR-EX255AP";ob1[i++]=1599;
					 System.out.print("Do you want to continue shopping in this Budget (Below 2K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':sony1k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':sonymenu(); b=false; break; // MADE CHANGES HEREE
						 default : System.out.print("Please enter valid option: ");
						 }
					 }while(b==true);  break;
					 case 'n':
					 {
						 System.out.print("Do you want to see another model in this Budget (Below 2K) [y/n or Y/N]:");  //MADE CHANGES HERE
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':sony1k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': sonymenu(); b=false; break;
									 case 'n': wired(); b=false; break;
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
				 System.out.print("Do you want to add it to cart [y/n or Y/N]:");
				 do
				 {
					 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					 switch(c)
					 {
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SONY MDR-AS410AP";ob1[i++]=1650;
					 System.out.print("Do you want to continue shopping in this Budget (Below 2K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':sony1k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':sonymenu(); b=false; break; // MADE CHANGES HEREE
						 default : System.out.print("Please enter valid option: ");
						 }
					 }while(b==true);  break;
					 case 'n':
					 {
						 System.out.print("Do you want to see another model in this Budget (Below 2K) [y/n or Y/N]:");  //MADE CHANGES HERE
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':sony1k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': sonymenu(); b=false; break;
									 case 'n': wired(); b=false; break;
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
				 System.out.print("Do you want to add it to cart [y/n or Y/N]:");
				 do
				 {
					 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					 switch(c)
					 {
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SONY MDR-XB510AS";ob1[i++]=1099;
					 System.out.print("Do you want to continue shopping in this Budget (Below 2K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':sony1k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':sonymenu(); b=false; break; // MADE CHANGES HEREE
						 default : System.out.print("Please enter valid option: ");
						 }
					 }while(b==true);  break;
					 case 'n':
					 {
						 System.out.print("Do you want to see another model in this Budget (Below 2K) [y/n or Y/N]:");  //MADE CHANGES HERE
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':sony1k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': sonymenu(); b=false; break;
									 case 'n': wired(); b=false; break;
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
			 case 6:
			 {
				 System.out.print("Do you want to add it to cart [y/n or Y/N]:");
				 do
				 {
					 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					 switch(c)
					 {
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SONY MDR-EX14AP";ob1[i++]=1799;
					 System.out.print("Do you want to continue shopping in this Budget (Below 2K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':sony1k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':sonymenu(); b=false; break; // MADE CHANGES HEREE
						 default : System.out.print("Please enter valid option: ");
						 }
					 }while(b==true);  break;
					 case 'n':
					 {
						 System.out.print("Do you want to see another model in this Budget (Below 2K) [y/n or Y/N]:");  //MADE CHANGES HERE
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':sony1k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': sonymenu(); b=false; break;
									 case 'n': wired(); b=false; break;
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
			 case 7:
			 {
				 System.out.print("Do you want to add it to cart [y/n or Y/N]:");
				 do
				 {
					 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					 switch(c)
					 {
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SONY MDR-EX155AP";ob1[i++]=1800;
					 System.out.print("Do you want to continue shopping in this Budget (Below 2K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':sony1k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':sonymenu(); b=false; break; // MADE CHANGES HEREE
						 default : System.out.print("Please enter valid option: ");
						 }
					 }while(b==true);  break;
					 case 'n':
					 {
						 System.out.print("Do you want to see another model in this Budget (Below 2K) [y/n or Y/N]:");  //MADE CHANGES HERE
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':sony1k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': sonymenu(); b=false; break;
									 case 'n': wired(); b=false; break;
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
			 case 8:
			 {
				 System.out.print("Do you want to add it to cart [y/n or Y/N]:");
				 do
				 {
					 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					 switch(c)
					 {
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SONY MDR-EX150AP";ob1[i++]=1899;
					 System.out.print("Do you want to continue shopping in this Budget (Below 2K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':sony1k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':sonymenu(); b=false; break; // MADE CHANGES HEREE
						 default : System.out.print("Please enter valid option: ");
						 }
					 }while(b==true);  break;
					 case 'n':
					 {
						 System.out.print("Do you want to see another model in this Budget (Below 2K) [y/n or Y/N]:");  //MADE CHANGES HERE
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':sony1k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': sonymenu(); b=false; break;
									 case 'n': wired(); b=false; break;
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
			 case 9:
			 {
				 System.out.print("Do you want to add it to cart [y/n or Y/N]:");
				 do
				 {
					 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					 switch(c)
					 {
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SONY MDR-EX55AP";ob1[i++]=1999;
					 System.out.print("Do you want to continue shopping in this Budget (Below 2K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':sony1k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':sonymenu(); b=false; break; // MADE CHANGES HEREE
						 default : System.out.print("Please enter valid option: ");
						 }
					 }while(b==true);  break;
					 case 'n':
					 {
						 System.out.print("Do you want to see another model in this Budget (Below 2K) [y/n or Y/N]:");  //MADE CHANGES HERE
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':sony1k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': sonymenu(); b=false; break;
									 case 'n': wired(); b=false; break;
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
			 case 10:  sonymenu(); b=false; break;
			 default:  System.out.print("Please enter valid option:");
			 }
		 }while(b==true); 
	}
	//================================================================================================
	public static void sony2k5k()
	{ System.out.println(RESET);
		 System.out.println("\t   "+" ___________________________________________________________________________________________________________________________________");  
		 System.out.println("\t   "+"|                                                                                                                                   |");  
		 System.out.println("\t   "+"|    ___________________       ___________________       ___________________       ___________________       ___________________    |");  
		 System.out.println("\t   "+"|   |1.SONY MDR-XB75AP  |     |2.SONY MDR-EX10LP  |     |3.SONY MDR-AS400iP |     |4.SONY MDR-XB70AP  |     |5.SONY MDR-NC31EM  |   |");  
		 System.out.println("\t   "+"|   |-------------------|     |-------------------|     |-------------------|     |-------------------|     |-------------------|   |");  
		 System.out.println("\t   "+"|   |.WIRED EARPHONES   |     |.WIRED EARPHONES   |     |.WIRED EARPHONES   |     |.WIRED EARPHONES   |     |.WIRED EARPHONES   |   |");  
		 System.out.println("\t   "+"|   |.Inline Controls   |     |.8Hz - 22Khz       |     |.5Hz - 24Khz       |     |.Inline Controls   |     |.In Ear CanalPhone |   |");  
		 System.out.println("\t   "+"|   |.Noise Cancellation|     |.Noise Cancellation|     |.13.3MM Drivers    |     |.Noise Cancellation|     |.Inline Controls   |   |");  
		 System.out.println("\t   "+"|   |.High Base         |     |.Dolby Support     |     |.Stereo Speakers   |     |.3.5MM Jack        |     |.Dynamic Drivers   |   |");  
		 System.out.println("\t   "+"|   |.Dynamic Drivers   |     |.Dynamic Drivers   |     |.Noise Cancellation|     |.Stereo Speakers   |     |.Noise Cancellation|   |");  
		 System.out.println("\t   "+"|   |.Stereo Speakers   |     |.In Ear CanalPhone |     |.In Line Controls  |     |.In Ear CanalPhone |     |.Premium Base      |   |");  
		 System.out.println("\t   "+"|   |.PRICE : 2190/-    |     |.PRICE : 2399/-    |     |.PRICE : 2799/-    |     |.PRICE : 3299/-    |     |.PRICE : 3990/-    |   |");  
		 System.out.println("\t   "+"|   |___________________|     |___________________|     |___________________|     |___________________|     |___________________|   |");  
		 System.out.println("\t   "+"|                                                                                                                                   |");  
		 System.out.println("\t   "+"|                                                                                                                                   |");  
		 System.out.println("\t   "+"|    ___________________       ___________________       ___________________       ___________________                              |");  
		 System.out.println("\t   "+"|   |6.SONY IER - H500A |     |7.SONY MDR-EX750AP |     |8.SONY MDR-EX10    |     |                   |                             |");  
		 System.out.println("\t   "+"|   |-------------------|     |-------------------|     |-------------------|     |                   |                             |");  
		 System.out.println("\t   "+"|   |.WIRED EARPHONES   |     |.WIRED EARPHONES   |     |.WIRED EARPHONES   |     |        9.         |                             |");  
		 System.out.println("\t   "+"|   |.Dynamic Drivers   |     |.5hz - 40Khz       |     |.Noise Isolation   |     |                   |                             |");  
		 System.out.println("\t   "+"|   |.Premium Base      |     |.Noise Cancellation|     |.Noise Cancellation|     |       EXIT        |                             |");  
		 System.out.println("\t   "+"|   |.In Ear CanalPhone |     |.Stereo Speakers   |     |.3.5MM Jack        |     |     ---------     |                             |");  
		 System.out.println("\t   "+"|   |.Noise Cancellation|     |.Dolby Support     |     |.In Ear CanalPhone |     |                   |                             |");  
		 System.out.println("\t   "+"|   |.Tangle Free Cable |     |.Premium Base      |     |.Stereo Speakers   |     |                   |                             |");  
		 System.out.println("\t   "+"|   |.PRICE : 4099/-    |     |.PRICE : 4590/-    |     |.PRICE : 4999/-    |     |                   |                             |");  
		 System.out.println("\t   "+"|   |___________________|     |___________________|     |___________________|     |___________________|                             |");  
		 System.out.println("\t   "+"|                                                                                                                                   |");    
		 System.out.println("\t   "+"|___________________________________________________________________________________________________________________________________|"+"\n"); 
		 System.out.println(RESET);	 sony2k5kswitch();
	}
	//=================================================================================================
	public static void sony2k5kswitch()
	{
		System.out.print("PLEASE CHOOSE YOUR PREFERRED MODEL :");
		 do
		 {
			 int m=sc.nextInt();
			 switch(m)
			 {
			 case 1:
			 {
				 System.out.print("Do you want to add it to cart [y/n or Y/N]:");
				 do
				 {
					 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					 switch(c)
					 {
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SONY MDR-XB75AP";ob1[i++]=2190;
					          System.out.print("Do you want to continue shopping in this Budget (Between 2K-5K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
			 		  do
			 		  {
			 			char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
			 			switch(c1)	
						{
						case 'y':sony2k5k(); b=false; break; // MADE CHANGES HEREE
						case 'n':sonymenu(); b=false; break; // MADE CHANGES HEREE
			 			default : System.out.print("Please enter valid option: ");
						}
			 		  }while(b==true);  break;
					 case 'n':
						 {
							 System.out.print("Do you want to see another model in this Budget (Between 2K-5K) [y/n or Y/N]:");  //MADE CHANGES HERE
								do
								{
									char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								switch(c1)	
								{
								case 'y':sony2k5k(); b=false; break;
								case 'n':
									{
										System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
										do 
										{
											char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
											switch(c2)
											{
											case 'y': sonymenu(); b=false; break;
											case 'n': wired(); b=false; break;
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
				 System.out.print("Do you want to add it to cart [y/n or Y/N]:");
				 do
				 {
					 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					 switch(c)
					 {
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SONY MDR-EX10LP";ob1[i++]=2399;
					 System.out.print("Do you want to continue shopping in this Budget (Between 2K-5K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':sony2k5k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':sonymenu(); b=false; break; // MADE CHANGES HEREE
						 default : System.out.print("Please enter valid option: ");
						 }
					 }while(b==true);  break;
					 case 'n':
					 {
						 System.out.print("Do you want to see another model in this Budget (Between 2K-5K) [y/n or Y/N]:");  //MADE CHANGES HERE
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':sony2k5k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': sonymenu(); b=false; break;
									 case 'n': wired(); b=false; break;
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
				 System.out.print("Do you want to add it to cart [y/n or Y/N]:");
				 do
				 {
					 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					 switch(c)
					 {
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SONY MDR-AS400iP";ob1[i++]=2799;
					 System.out.print("Do you want to continue shopping in this Budget (Between 2K-5K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':sony2k5k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':sonymenu(); b=false; break; // MADE CHANGES HEREE
						 default : System.out.print("Please enter valid option: ");
						 }
					 }while(b==true);  break;
					 case 'n':
					 {
						 System.out.print("Do you want to see another model in this Budget (Between 2K-5K) [y/n or Y/N]:");  //MADE CHANGES HERE
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':sony2k5k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': sonymenu(); b=false; break;
									 case 'n': wired(); b=false; break;
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
				 System.out.print("Do you want to add it to cart [y/n or Y/N]:");
				 do
				 {
					 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					 switch(c)
					 {
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SONY MDR-XB70AP";ob1[i++]=3299;
					 System.out.print("Do you want to continue shopping in this Budget (Between 2K-5K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':sony2k5k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':sonymenu(); b=false; break; // MADE CHANGES HEREE
						 default : System.out.print("Please enter valid option: ");
						 }
					 }while(b==true);  break;
					 case 'n':
					 {
						 System.out.print("Do you want to see another model in this Budget (Between 2K-5K) [y/n or Y/N]:");  //MADE CHANGES HERE
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':sony2k5k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': sonymenu(); b=false; break;
									 case 'n': wired(); b=false; break;
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
				 System.out.print("Do you want to add it to cart [y/n or Y/N]:");
				 do
				 {
					 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					 switch(c)
					 {
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SONY MDR-NC31EM";ob1[i++]=3990;
					 System.out.print("Do you want to continue shopping in this Budget (Between 2K-5K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':sony2k5k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':sonymenu(); b=false; break; // MADE CHANGES HEREE
						 default : System.out.print("Please enter valid option: ");
						 }
					 }while(b==true);  break;
					 case 'n':
					 {
						 System.out.print("Do you want to see another model in this Budget (Between 2K-5K) [y/n or Y/N]:");  //MADE CHANGES HERE
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':sony2k5k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': sonymenu(); b=false; break;
									 case 'n': wired(); b=false; break;
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
			 case 6:
			 {
				 System.out.print("Do you want to add it to cart [y/n or Y/N]:");
				 do
				 {
					 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					 switch(c)
					 {
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SONY IER-H500A";ob1[i++]=4099;
					 System.out.print("Do you want to continue shopping in this Budget (Between 2K-5K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':sony2k5k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':sonymenu(); b=false; break; // MADE CHANGES HEREE
						 default : System.out.print("Please enter valid option: ");
						 }
					 }while(b==true);  break;
					 case 'n':
					 {
						 System.out.print("Do you want to see another model in this Budget (Between 2K-5K) [y/n or Y/N]:");  //MADE CHANGES HERE
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':sony2k5k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': sonymenu(); b=false; break;
									 case 'n': wired(); b=false; break;
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
			 case 7:
			 {
				 System.out.print("Do you want to add it to cart [y/n or Y/N]:");
				 do
				 {
					 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					 switch(c)
					 {
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SONY MDR-XB750AP";ob1[i++]=4590;
					 System.out.print("Do you want to continue shopping in this Budget (Between 2K-5K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':sony2k5k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':sonymenu(); b=false; break; // MADE CHANGES HEREE
						 default : System.out.print("Please enter valid option: ");
						 }
					 }while(b==true);  break;
					 case 'n':
					 {
						 System.out.print("Do you want to see another model in this Budget (Between 2K-5K) [y/n or Y/N]:");  //MADE CHANGES HERE
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':sony2k5k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': sonymenu(); b=false; break;
									 case 'n': wired(); b=false; break;
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
			 case 8:
			 {
				 System.out.print("Do you want to add it to cart [y/n or Y/N]:");
				 do
				 {
					 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					 switch(c)
					 {
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SONY MDR-EX10";ob1[i++]=4999;
					 System.out.print("Do you want to continue shopping in this Budget (Between 2K-5K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':sony2k5k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':sonymenu(); b=false; break; // MADE CHANGES HEREE
						 default : System.out.print("Please enter valid option: ");
						 }
					 }while(b==true);  break;
					 case 'n':
					 {
						 System.out.print("Do you want to see another model in this Budget (Between 2K-5K) [y/n or Y/N]:");  //MADE CHANGES HERE
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':sony2k5k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': sonymenu(); b=false; break;
									 case 'n': wired(); b=false; break;
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
			 case 9:  sonymenu(); b=false; break;
			 default:  System.out.print("Please enter valid option:");
			 }
		 }while(b==true); 
	}
	//================================================================================================
	public static void sony5k25k() // I HAVE TO MAKE CHANGES IN SYSO
	{ System.out.println(RESET);
		 System.out.println("\t   "+" ___________________________________________________________________________________________________________________________________");  
		 System.out.println("\t   "+"|                                                                                                                                   |");  
		 System.out.println("\t   "+"|    ___________________       ___________________       ___________________       ___________________       ___________________    |");  
		 System.out.println("\t   "+"|   |1.SONY XBA-A1AP    |     |2.SONY MDR-EX750BNA|     |3.SONY MDR-EX100AP |     |4.SONY DR-EX14VP   |     |5.SONY MDR-NC750   |   |");  
		 System.out.println("\t   "+"|   |-------------------|     |-------------------|     |-------------------|     |-------------------|     |-------------------|   |");  
		 System.out.println("\t   "+"|   |.WIRED EARPHONES   |     |.WIRED EARPHONES   |     |.WIRED EARPHONES   |     |.WIRED EARPHONES   |     |.WIRED EARPHONES   |   |");  
		 System.out.println("\t   "+"|   |.Dynamic Drivers   |     |.5Hz - 20Khz freq  |     |.In Ear Canalphone |     |.Premium Base      |     |.Tangle Free Cable |   |");  
		 System.out.println("\t   "+"|   |.Inline Controls   |     |.Inline Controls   |     |.8Hz - 25Khz freq  |     |.14MM Drivers      |     |.Inline Controls   |   |");  
		 System.out.println("\t   "+"|   |.In Ear Canalphone |     |.Noise Cancellation|     |.Stereo Speakers   |     |.Tangle Free Cable |     |.Noise Insolation  |   |");  
		 System.out.println("\t   "+"|   |.High Quality Base |     |.Stereo Speakers   |     |.Inline Controls   |     |.Noise Cancellation|     |.Noise Cancellation|   |");  
		 System.out.println("\t   "+"|   |.3.5MM Jack        |     |.Dolby Support     |     |.Dynamic Drivers   |     |.3.5mm Jack        |     |.Premium 13mmDriver|   |");  
		 System.out.println("\t   "+"|   |.PRICE : 5099/-    |     |.PRICE : 5499/-    |     |.PRICE : 5799/-    |     |.PRICE : 6699/-    |     |.PRICE : 7599/-    |   |");  
		 System.out.println("\t   "+"|   |___________________|     |___________________|     |___________________|     |___________________|     |___________________|   |");  
		 System.out.println("\t   "+"|                                                                                                                                   |");  
		 System.out.println("\t   "+"|                                                                                                                                   |");  
		 System.out.println("\t   "+"|    ___________________       ___________________       ___________________       ___________________       ___________________    |");  
		 System.out.println("\t   "+"|   |6.SONY MDR-EX110AP |     |7.SONY MDR-AS800AP |     |8.SONY MDR-EX220LP |     |9.SONY MDR-EX300XP |     |                   |   |");  
		 System.out.println("\t   "+"|   |-------------------|     |-------------------|     |-------------------|     |-------------------|     |                   |   |");  
		 System.out.println("\t   "+"|   |.WIRED EARPHONES   |     |.WIRED EARPHONES   |     |.WIRED EARPHONES   |     |.WIRED EARPHONES   |     |        10.        |   |");  
		 System.out.println("\t   "+"|   |.Inline Controls   |     |.5Hz - 40Khz       |     |.Dynamic Drivers   |     |.Tangle Free Cable |     |                   |   |");  
		 System.out.println("\t   "+"|   |.In Ear Canalphone |     |.Noise Cancellation|     |.Noise Cancellation|     |.Noise Cancellation|     |       EXIT        |   |");  
		 System.out.println("\t   "+"|   |.Dynamic Drivers   |     |.Braded Cable      |     |.Noise Isolation   |     |.5Hz - 40Khz       |     |     ---------     |   |");  
		 System.out.println("\t   "+"|   |.In Built Mic      |     |.14MM Drivers      |     |.Stereo Speakers   |     |.Stereo Speakers   |     |                   |   |");  
		 System.out.println("\t   "+"|   |.Noise Cancellation|     |.High Quality Base |     |.3.5mm Jack        |     |.14MM Drivers      |     |                   |   |");  
		 System.out.println("\t   "+"|   |.PRICE : 9999/-    |     |.PRICE : 13499/-   |     |.PRICE : 23799/-   |     |.PRICE : 24999/-   |     |                   |   |");  
		 System.out.println("\t   "+"|   |___________________|     |___________________|     |___________________|     |___________________|     |___________________|   |");  
		 System.out.println("\t   "+"|                                                                                                                                   |");    
		 System.out.println("\t   "+"|___________________________________________________________________________________________________________________________________|"+"\n"); 
		 System.out.println(RESET); sony5k25kswitch();
	}
	//==================================================================================================
	public static void sony5k25kswitch()
	{
		System.out.print("PLEASE CHOOSE YOUR PREFERRED MODEL :");
		 do
		 {
			 int m=sc.nextInt();
			 switch(m)
			 {
			 case 1:
			 {
				 System.out.print("Do you want to add it to cart [y/n or Y/N]:");
				 do
				 {
					 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					 switch(c)
					 {
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SONY XBA-A1AP";ob1[i++]=5099;
					          System.out.print("Do you want to continue shopping in this Budget (Above 5K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
			 		  do
			 		  {
			 			char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
			 			switch(c1)	
						{
						case 'y':sony5k25k(); b=false; break; // MADE CHANGES HEREE
						case 'n':sonymenu(); b=false; break; // MADE CHANGES HEREE
			 			default : System.out.print("Please enter valid option: ");
						}
			 		  }while(b==true);  break;
					 case 'n':
						 {
							 System.out.print("Do you want to see another model in this Budget (Above 5K) [y/n or Y/N]:");  //MADE CHANGES HERE
								do
								{
									char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								switch(c1)	
								{
								case 'y':sony5k25k(); b=false; break;
								case 'n':
									{
										System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
										do 
										{
											char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
											switch(c2)
											{
											case 'y': sonymenu(); b=false; break;
											case 'n': wired(); b=false; break;
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
				 System.out.print("Do you want to add it to cart [y/n or Y/N]:");
				 do
				 {
					 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					 switch(c)
					 {
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SONY MDR-XB750BNA";ob1[i++]=5499;
					 System.out.print("Do you want to continue shopping in this Budget (Above 5K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':sony5k25k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':sonymenu(); b=false; break; // MADE CHANGES HEREE
						 default : System.out.print("Please enter valid option: ");
						 }
					 }while(b==true);  break;
					 case 'n':
					 {
						 System.out.print("Do you want to see another model in this Budget (Above 5K) [y/n or Y/N]:");  //MADE CHANGES HERE
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':sony5k25k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': sonymenu(); b=false; break;
									 case 'n': wired(); b=false; break;
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
				 System.out.print("Do you want to add it to cart [y/n or Y/N]:");
				 do
				 {
					 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					 switch(c)
					 {
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SONY MDR-EX100AP";ob1[i++]=5799;
					 System.out.print("Do you want to continue shopping in this Budget (Above 5K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':sony5k25k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':sonymenu(); b=false; break; // MADE CHANGES HEREE
						 default : System.out.print("Please enter valid option: ");
						 }
					 }while(b==true);  break;
					 case 'n':
					 {
						 System.out.print("Do you want to see another model in this Budget (Above 5K) [y/n or Y/N]:");  //MADE CHANGES HERE
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':sony5k25k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': sonymenu(); b=false; break;
									 case 'n': wired(); b=false; break;
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
				 System.out.print("Do you want to add it to cart [y/n or Y/N]:");
				 do
				 {
					 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					 switch(c)
					 {
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SONY DR-EX14VP";ob1[i++]=6699;
					 System.out.print("Do you want to continue shopping in this Budget (Above 5K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':sony5k25k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':sonymenu(); b=false; break; // MADE CHANGES HEREE
						 default : System.out.print("Please enter valid option: ");
						 }
					 }while(b==true);  break;
					 case 'n':
					 {
						 System.out.print("Do you want to see another model in this Budget (Above 5K) [y/n or Y/N]:");  //MADE CHANGES HERE
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':sony5k25k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': sonymenu(); b=false; break;
									 case 'n': wired(); b=false; break;
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
				 System.out.print("Do you want to add it to cart [y/n or Y/N]:");
				 do
				 {
					 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					 switch(c)
					 {
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SONY MDR-NC750";ob1[i++]=7599;
					 System.out.print("Do you want to continue shopping in this Budget (Above 5K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':sony5k25k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':sonymenu(); b=false; break; // MADE CHANGES HEREE
						 default : System.out.print("Please enter valid option: ");
						 }
					 }while(b==true);  break;
					 case 'n':
					 {
						 System.out.print("Do you want to see another model in this Budget (Above 5K) [y/n or Y/N]:");  //MADE CHANGES HERE
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':sony5k25k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': sonymenu(); b=false; break;
									 case 'n': wired(); b=false; break;
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
			 case 6:
			 {
				 System.out.print("Do you want to add it to cart [y/n or Y/N]:");
				 do
				 {
					 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					 switch(c)
					 {
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SONY MDR-EX110AP";ob1[i++]=9999;
					 System.out.print("Do you want to continue shopping in this Budget (Above 5K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':sony5k25k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':sonymenu(); b=false; break; // MADE CHANGES HEREE
						 default : System.out.print("Please enter valid option: ");
						 }
					 }while(b==true);  break;
					 case 'n':
					 {
						 System.out.print("Do you want to see another model in this Budget (Above 5K) [y/n or Y/N]:");  //MADE CHANGES HERE
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':sony5k25k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': sonymenu(); b=false; break;
									 case 'n': wired(); b=false; break;
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
			 case 7:
			 {
				 System.out.print("Do you want to add it to cart [y/n or Y/N]:");
				 do
				 {
					 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					 switch(c)
					 {
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SONY MDR-AS800AP";ob1[i++]=13499;
					 System.out.print("Do you want to continue shopping in this Budget (Above 5K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':sony5k25k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':sonymenu(); b=false; break; // MADE CHANGES HEREE
						 default : System.out.print("Please enter valid option: ");
						 }
					 }while(b==true);  break;
					 case 'n':
					 {
						 System.out.print("Do you want to see another model in this Budget (Above 5K) [y/n or Y/N]:");  //MADE CHANGES HERE
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':sony5k25k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': sonymenu(); b=false; break;
									 case 'n': wired(); b=false; break;
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
			 case 8:
			 {
				 System.out.print("Do you want to add it to cart [y/n or Y/N]:");
				 do
				 {
					 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					 switch(c)
					 {
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SONY MDR-EX220LP";ob1[i++]=23799;
					 System.out.print("Do you want to continue shopping in this Budget (Above 5K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':sony5k25k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':sonymenu(); b=false; break; // MADE CHANGES HEREE
						 default : System.out.print("Please enter valid option: ");
						 }
					 }while(b==true);  break;
					 case 'n':
					 {
						 System.out.print("Do you want to see another model in this Budget (Above 5K) [y/n or Y/N]:");  //MADE CHANGES HERE
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':sony5k25k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': sonymenu(); b=false; break;
									 case 'n': wired(); b=false; break;
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
			 case 9:
			 {
				 System.out.print("Do you want to add it to cart [y/n or Y/N]:");
				 do
				 {
					 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					 switch(c)
					 {
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SONY MDR-EX300XP";ob1[i++]=24999;
					 System.out.print("Do you want to continue shopping in this Budget (Above 5K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':sony5k25k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':sonymenu(); b=false; break; // MADE CHANGES HEREE
						 default : System.out.print("Please enter valid option: ");
						 }
					 }while(b==true);  break;
					 case 'n':
					 {
						 System.out.print("Do you want to see another model in this Budget (Above 5K) [y/n or Y/N]:");  //MADE CHANGES HERE
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':sony5k25k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': sonymenu(); b=false; break;
									 case 'n': wired(); b=false; break;
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
			 case 10:  sonymenu(); b=false; break;
			 default:  System.out.print("Please enter valid option:");
			 }
		 }while(b==true); 
	}
	//============================================================================================
	public static void boatmenu()
	{ System.out.println(RESET);
		 System.out.println("\t\t\t\t\t\t"+"                             BOAT     ");  
		 System.out.println("\t\t\t\t\t\t"+"                      ------------------  ");  
		 System.out.println("\t\t\t\t\t\t"+"                      1.Between 500 - 2k        ");  
		 System.out.println("\t\t\t\t\t\t"+"                      2.EXIT        ");
		 System.out.println(RESET); boatswitch();
	}
	//===========================================================================================
	public static void boatswitch()
	{
		System.out.print("PLEASE ENTER THE PRICE RANGE  :");
		 
		 do
		 {
			int p=sc.nextInt();
			switch(p) 
			{
			case 1: boat5h2k(); b=false; break;
			case 2: wired();b=false; break;
		    default:
		    	{
		    		System.out.println("Please enter valid option.");
		    		boatmenu(); 
		    	}
			}
		 }while(b==true);
	}
	//=============================================================================================
	public static void boat5h2k()// I HAVE TO CHANGE THE MATTER IS SYSO 
	{ System.out.println(RESET);
		 System.out.println("\t   "+" ___________________________________________________________________________________________________________________________________");  
		 System.out.println("\t   "+"|                                                                                                                                   |");  
		 System.out.println("\t   "+"|    ___________________       ___________________       ___________________       ___________________       ___________________    |");  
		 System.out.println("\t   "+"|   |1.BASSHEADS 225    |     |2.BASSHEADS 228    |     |3.BASSHEADS 242    |     |4.BASSHEADS 192    |     |5.BASSHEADS 152    |   |");  
		 System.out.println("\t   "+"|   |-------------------|     |-------------------|     |-------------------|     |-------------------|     |-------------------|   |");  
		 System.out.println("\t   "+"|   |.WIRED EARPHONES   |     |.WIRED EARPHONES   |     |.WIRED EARPHONES   |     |.WIRED EARPHONES   |     |.WIRED EARPHONES   |   |");  
		 System.out.println("\t   "+"|   |.20Hz - 20Khz freq |     |.Stereo Speakers   |     |.Dynamic Drivers   |     |.14MM Drivers      |     |.5Hz - 20Khz freq  |   |");  
		 System.out.println("\t   "+"|   |.Inline Controls   |     |.Inline Controls   |     |.In Ear Canalphone |     |.3.5MM Jack        |     |.Inline Controls   |   |");  
		 System.out.println("\t   "+"|   |.In Ear Canalphone |     |.Dynamic Drivers   |     |.5Hz - 20Khz freq  |     |.Inline controls   |     |.In Built Mic      |   |");  
		 System.out.println("\t   "+"|   |.High Quality Base |     |.20Hz - 20Khz freq |     |.Inline Controls   |     |.Premium Base      |     |.Noise Cancellation|   |");  
		 System.out.println("\t   "+"|   |.Stereo Speakers   |     |.Dolby Support     |     |.High Quality Base |     |.Stereo Speakers   |     |.In Ear CanalPhone |   |");  
		 System.out.println("\t   "+"|   |.PRICE : 599/-     |     |.PRICE : 699/-     |     |.PRICE : 799/-     |     |.PRICE : 899/-     |     |.PRICE : 1099/-    |   |");  
		 System.out.println("\t   "+"|   |___________________|     |___________________|     |___________________|     |___________________|     |___________________|   |");  
		 System.out.println("\t   "+"|                                                                                                                                   |");  
		 System.out.println("\t   "+"|                                                                                                                                   |");  
		 System.out.println("\t   "+"|    ___________________       ___________________       ___________________       ___________________       ___________________    |");  
		 System.out.println("\t   "+"|   |6.NIRVANAA TRES    |     |7.DSP 4000 MFi     |     |8.NIRVANAA DEUCE   |     |9.NIRVANAA DUO     |     |                   |   |");  
		 System.out.println("\t   "+"|   |-------------------|     |-------------------|     |-------------------|     |-------------------|     |                   |   |");  
		 System.out.println("\t   "+"|   |.WIRED EARPHONES   |     |.WIRED EARPHONES   |     |.WIRED EARPHONES   |     |.WIRED EARPHONES   |     |        10.        |   |");  
		 System.out.println("\t   "+"|   |.20Hz - 20Khz freq |     |.Dynamic Drivers   |     |.High Quality Base |     |.5Hz - 40Khz freq  |     |                   |   |");  
		 System.out.println("\t   "+"|   |.High Quality Base |     |.Noise Cancellation|     |.Noise Cancellation|     |.Noise Cancellation|     |       EXIT        |   |");  
		 System.out.println("\t   "+"|   |.Dolby Support     |     |.In Ear Canalphone |     |.Noise Isolation   |     |.Premium Base      |     |     ---------     |   |");  
		 System.out.println("\t   "+"|   |.Stereo Speakers   |     |.Inline Controls   |     |.In Ear Canalphone |     |.Stereo Speakers   |     |                   |   |");  
		 System.out.println("\t   "+"|   |.Noise Cancellation|     |.Dolby Support     |     |.14MM Drivers      |     |.Dolby Support     |     |                   |   |");  
		 System.out.println("\t   "+"|   |.PRICE : 1299/-    |     |.PRICE : 1499/-    |     |.PRICE : 1799/-    |     |.PRICE : 1999/-    |     |                   |   |");  
		 System.out.println("\t   "+"|   |___________________|     |___________________|     |___________________|     |___________________|     |___________________|   |");  
		 System.out.println("\t   "+"|                                                                                                                                   |");    
		 System.out.println("\t   "+"|___________________________________________________________________________________________________________________________________|"); 
		 System.out.println(RESET); boat5h2kswitch();
	}
	//=============================================================================================
	public static void boat5h2kswitch()
	{
		System.out.print("PLEASE CHOOSE YOUR PREFERRED MODEL :");
		 do
		 {
			 int m=sc.nextInt();
			 switch(m)
			 {
			 case 1:
			 {
				 System.out.print("Do you want to add it to cart [y/n or Y/N]:");
				 do
				 {
					 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					 switch(c)
					 {
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="BOAT BASSHEADS 225";ob1[i++]=599;
					          System.out.print("Do you want to continue shopping in this Budget (Below 2K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
			 		  do
			 		  {
			 			char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
			 			switch(c1)	
						{
						case 'y':boat5h2k(); b=false; break; // MADE CHANGES HEREE
						case 'n':boatmenu(); b=false; break; // MADE CHANGES HEREE
			 			default : System.out.print("Please enter valid option: ");
						}
			 		  }while(b==true);  break;
					 case 'n':
						 {
							 System.out.print("Do you want to see another model in this Budget (Below 2K) [y/n or Y/N]:");  //MADE CHANGES HERE
								do
								{
									char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								switch(c1)	
								{
								case 'y':boat5h2k(); b=false; break;
								case 'n':
									{
										System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
										do 
										{
											char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
											switch(c2)
											{
											case 'y': boatmenu(); b=false; break;
											case 'n': wired(); b=false; break;
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
				 System.out.print("Do you want to add it to cart [y/n or Y/N]:");
				 do
				 {
					 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					 switch(c)
					 {
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="BOAT BASSHEADS 228";ob1[i++]=699;
					 System.out.print("Do you want to continue shopping in this Budget (Below 2K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':boat5h2k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':boatmenu(); b=false; break; // MADE CHANGES HEREE
						 default : System.out.print("Please enter valid option: ");
						 }
					 }while(b==true);  break;
					 case 'n':
					 {
						 System.out.print("Do you want to see another model in this Budget (Below 2K) [y/n or Y/N]:");  //MADE CHANGES HERE
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':boat5h2k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': boatmenu(); b=false; break;
									 case 'n': wired(); b=false; break;
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
				 System.out.print("Do you want to add it to cart [y/n or Y/N]:");
				 do
				 {
					 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					 switch(c)
					 {
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="BOAT BASSHEADS 242";ob1[i++]=799;
					 System.out.print("Do you want to continue shopping in this Budget (Below 2K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':boat5h2k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':boatmenu(); b=false; break; // MADE CHANGES HEREE
						 default : System.out.print("Please enter valid option: ");
						 }
					 }while(b==true);  break;
					 case 'n':
					 {
						 System.out.print("Do you want to see another model in this Budget (Below 2K) [y/n or Y/N]:");  //MADE CHANGES HERE
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':boat5h2k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': boatmenu(); b=false; break;
									 case 'n': wired(); b=false; break;
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
				 System.out.print("Do you want to add it to cart [y/n or Y/N]:");
				 do
				 {
					 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					 switch(c)
					 {
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="BOAT BASSHEADS 192";ob1[i++]=899;
					 System.out.print("Do you want to continue shopping in this Budget (Below 2K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':boat5h2k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':boatmenu(); b=false; break; // MADE CHANGES HEREE
						 default : System.out.print("Please enter valid option: ");
						 }
					 }while(b==true);  break;
					 case 'n':
					 {
						 System.out.print("Do you want to see another model in this Budget (Below 2K) [y/n or Y/N]:");  //MADE CHANGES HERE
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':boat5h2k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': boatmenu(); b=false; break;
									 case 'n': wired(); b=false; break;
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
				 System.out.print("Do you want to add it to cart [y/n or Y/N]:");
				 do
				 {
					 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					 switch(c)
					 {
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="BOAT BASSHEADS 152";ob1[i++]=1099;
					 System.out.print("Do you want to continue shopping in this Budget (Below 2K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':boat5h2k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':boatmenu(); b=false; break; // MADE CHANGES HEREE
						 default : System.out.print("Please enter valid option: ");
						 }
					 }while(b==true);  break;
					 case 'n':
					 {
						 System.out.print("Do you want to see another model in this Budget (Below 2K) [y/n or Y/N]:");  //MADE CHANGES HERE
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':boat5h2k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': boatmenu(); b=false; break;
									 case 'n': wired(); b=false; break;
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
			 case 6:
			 {
				 System.out.print("Do you want to add it to cart [y/n or Y/N]:");
				 do
				 {
					 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					 switch(c)
					 {
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="BOAT NIRVANNA TRES";ob1[i++]=1299;
					 System.out.print("Do you want to continue shopping in this Budget (Below 2K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':boat5h2k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':boatmenu(); b=false; break; // MADE CHANGES HEREE
						 default : System.out.print("Please enter valid option: ");
						 }
					 }while(b==true);  break;
					 case 'n':
					 {
						 System.out.print("Do you want to see another model in this Budget (Below 2K) [y/n or Y/N]:");  //MADE CHANGES HERE
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':boat5h2k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': boatmenu(); b=false; break;
									 case 'n': wired(); b=false; break;
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
			 case 7:
			 {
				 System.out.print("Do you want to add it to cart [y/n or Y/N]:");
				 do
				 {
					 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					 switch(c)
					 {
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="BOAT DSP 4000 MFi";ob1[i++]=1499;
					 System.out.print("Do you want to continue shopping in this Budget (Below 2K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':boat5h2k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':boatmenu(); b=false; break; // MADE CHANGES HEREE
						 default : System.out.print("Please enter valid option: ");
						 }
					 }while(b==true);  break;
					 case 'n':
					 {
						 System.out.print("Do you want to see another model in this Budget (Below 2K) [y/n or Y/N]:");  //MADE CHANGES HERE
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':boat5h2k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': boatmenu(); b=false; break;
									 case 'n': wired(); b=false; break;
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
			 case 8:
			 {
				 System.out.print("Do you want to add it to cart [y/n or Y/N]:");
				 do
				 {
					 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					 switch(c)
					 {
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="BOAT NIRVANA DEUCE";ob1[i++]=1799;
					 System.out.print("Do you want to continue shopping in this Budget (Below 2K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':boat5h2k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':boatmenu(); b=false; break; // MADE CHANGES HEREE
						 default : System.out.print("Please enter valid option: ");
						 }
					 }while(b==true);  break;
					 case 'n':
					 {
						 System.out.print("Do you want to see another model in this Budget (Below 2K) [y/n or Y/N]:");  //MADE CHANGES HERE
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':boat5h2k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': boatmenu(); b=false; break;
									 case 'n': wired(); b=false; break;
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
			 case 9:
			 {
				 System.out.print("Do you want to add it to cart [y/n or Y/N]:");
				 do
				 {
					 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					 switch(c)
					 {
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="BOAT NIRVANAA DUA";ob1[i++]=1999;
					 System.out.print("Do you want to continue shopping in this Budget (Below 2K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':boat5h2k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':boatmenu(); b=false; break; // MADE CHANGES HEREE
						 default : System.out.print("Please enter valid option: ");
						 }
					 }while(b==true);  break;
					 case 'n':
					 {
						 System.out.print("Do you want to see another model in this Budget (Below 2K) [y/n or Y/N]:");  //MADE CHANGES HERE
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':boat5h2k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': boatmenu(); b=false; break;
									 case 'n': wired(); b=false; break;
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
			 case 10:  boatmenu(); b=false; break;
			 default:  System.out.print("Please enter valid option:");
			 }
		 }while(b==true); 
	}
	//============================================================================================
	public static void jblmenu()
	{ System.out.println(RESET);
		 System.out.println("\t\t\t\t\t\t"+"                             JBL     ");  
		 System.out.println("\t\t\t\t\t\t"+"                     ------------------  ");  
		 System.out.println("\t\t\t\t\t\t"+"                      1.Between 1k - 4k        ");  
		 System.out.println("\t\t\t\t\t\t"+"                      2.Between 4k - 10k        ");
		 System.out.println("\t\t\t\t\t\t"+"                      3.EXIT            ");
		 System.out.println(RESET); jblswitch();
	}
	//===================================================================================================
	public static void jblswitch()
	{
		System.out.print("PLEASE ENTER THE PRICE RANGE  :");
		 
		 do
		 {
			int p=sc.nextInt();
			switch(p) 
			{
			case 1: jbl1k4k(); b=false; break;
			case 2: jbl4k10k(); b=false; break;
			case 3: wired();b=false; break;
		    default:
		    	{
		    		System.out.println("Please enter valid option.");
		    		jblmenu(); 
		    	}
			}
		 }while(b==true);
	}
	//=================================================================================================
	public static void jbl1k4k() //  I HAVE TO MAKE CHANGES IN SYSO // MAke CHANGES DONT FORGET
	{ System.out.println(RESET);
		System.out.println("\t   "+" ___________________________________________________________________________________________________________________________________");  
		System.out.println("\t   "+"|                                                                                                                                   |");  
		System.out.println("\t   "+"|    ___________________       ___________________       ___________________       ___________________       ___________________    |");  
		System.out.println("\t   "+"|   |1.JBL C100SI       |     |2.JBL T50HI        |     |3.JBL C200SI       |     |4.JBL INSPIRE 300  |     |5.JBL ENDURANCE RUN|   |");  
		System.out.println("\t   "+"|   |-------------------|     |-------------------|     |-------------------|     |-------------------|     |-------------------|   |");  
		System.out.println("\t   "+"|   |.WIRED EARPHONES   |     |.WIRED EARPHONES   |     |.WIRED EARPHONES   |     |.WIRED EARPHONES   |     |.WIRED EARPHONES   |   |");  
		System.out.println("\t   "+"|   |.Inline Controls   |     |.Dynamic Drivers   |     |.20Hz - 20Khz      |     |.14MM Drivers      |     |.In Ear CanalPhone |   |");  
		System.out.println("\t   "+"|   |.Tangle Free Cable |     |.Noise Cancellation|     |.Inline Controls   |     |.Noise Cancellation|     |.Inline Controls   |   |");  
		System.out.println("\t   "+"|   |.High Base         |     |.Bradded Cable     |     |.Premium Base      |     |.3.5MM Jack        |     |.In Built Mic      |   |");  
		System.out.println("\t   "+"|   |.In Ear Canalphone |     |.Dolby Support     |     |.Noise Cancellation|     |.Noise Isolation   |     |.Noise Cancellation|   |");  
		System.out.println("\t   "+"|   |.Stereo Speakers   |     |.20Hz - 20Khz      |     |.Tangle Free Cable |     |.5Hz - 20Khz       |     |.High Quality Base |   |");  
		System.out.println("\t   "+"|   |.PRICE : 1090/-    |     |.PRICE : 1399/-    |     |.PRICE : 1799/-    |     |.PRICE : 2299/-    |     |.PRICE : 2990/-    |   |");  
		System.out.println("\t   "+"|   |___________________|     |___________________|     |___________________|     |___________________|     |___________________|   |");  
		System.out.println("\t   "+"|                                                                                                                                   |");  
		System.out.println("\t   "+"|                                                                                                                                   |");  
		System.out.println("\t   "+"|    ___________________       ___________________       ___________________       ___________________                              |");  
		System.out.println("\t   "+"|   |6.JBL TUNE 110     |     |7.JBL T160         |     |8.JBL T210         |     |                   |                             |");  
		System.out.println("\t   "+"|   |-------------------|     |-------------------|     |-------------------|     |                   |                             |");  
		System.out.println("\t   "+"|   |.WIRED EARPHONES   |     |.WIRED EARPHONES   |     |.WIRED EARPHONES   |     |        9.         |                             |");  
		System.out.println("\t   "+"|   |.11.3MM Drivers    |     |.Dynamic Drivers   |     |.In Ear CanalPhone |     |                   |                             |");  
		System.out.println("\t   "+"|   |.Noise Isolation   |     |.Noise Cancellation|     |.Noise Cancellation|     |       EXIT        |                             |");  
		System.out.println("\t   "+"|   |.Tangle Free Cable |     |.Inline Controls   |     |.Stereo Speakers   |     |     ---------     |                             |");  
		System.out.println("\t   "+"|   |.Gold Plated Jack  |     |.Stereo Speakers   |     |.Premium Base      |     |                   |                             |");  
		System.out.println("\t   "+"|   |.Premium Base      |     |.Dolby Support     |     |.14.3MM Drivers    |     |                   |                             |");  
		System.out.println("\t   "+"|   |.PRICE : 3199/-    |     |.PRICE : 3399/-    |     |.PRICE : 3999/-    |     |                   |                             |");  
		System.out.println("\t   "+"|   |___________________|     |___________________|     |___________________|     |___________________|                             |");  
		System.out.println("\t   "+"|                                                                                                                                   |");    
		System.out.println("\t   "+"|___________________________________________________________________________________________________________________________________|"); 
		 System.out.println(RESET);jbl1k4kswitch();		
	}
	public static void jbl1k4kswitch()
	{
		System.out.print("PLEASE CHOOSE YOUR PREFERRED MODEL :");
		 do
		 {
			 int m=sc.nextInt();
			 switch(m)
			 {
			 case 1:
			 {
				 System.out.print("Do you want to add it to cart [y/n or Y/N]:");
				 do
				 {
					 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					 switch(c)
					 {
					 case 'y':System.out.println("Your Item is added to cart .");  ob[i]="JBL C100SI";ob1[i++]=1090;
					          System.out.print("Do you want to continue shopping in this Budget (Below 4K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
			 		  do
			 		  {
			 			char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
			 			switch(c1)	
						{
						case 'y':jbl1k4k(); b=false; break; // MADE CHANGES HEREE
						case 'n':jblmenu(); b=false; break; // MADE CHANGES HEREE
			 			default : System.out.print("Please enter valid option: ");
						}
			 		  }while(b==true);  break;
					 case 'n':
						 {
							 System.out.print("Do you want to see another model in this Budget (Below 4K) [y/n or Y/N]:");  //MADE CHANGES HERE
								do
								{
									char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								switch(c1)	
								{
								case 'y':jbl1k4k(); b=false; break;
								case 'n':
									{
										System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
										do 
										{
											char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
											switch(c2)
											{
											case 'y': jblmenu(); b=false; break;
											case 'n': wired(); b=false; break;
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
				 System.out.print("Do you want to add it to cart [y/n or Y/N]:");
				 do
				 {
					 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					 switch(c)
					 {
					 case 'y':System.out.println("Your Item is added to cart .");  ob[i]="JBL T50HI";ob1[i++]=1399;
					 System.out.print("Do you want to continue shopping in this Budget (Below 4K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':jbl1k4k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':jblmenu(); b=false; break; // MADE CHANGES HEREE
						 default : System.out.print("Please enter valid option: ");
						 }
					 }while(b==true);  break;
					 case 'n':
					 {
						 System.out.print("Do you want to see another model in this Budget (Below 4K) [y/n or Y/N]:");  //MADE CHANGES HERE
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':jbl1k4k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': jblmenu(); b=false; break;
									 case 'n': wired(); b=false; break;
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
				 System.out.print("Do you want to add it to cart [y/n or Y/N]:");
				 do
				 {
					 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					 switch(c)
					 {
					 case 'y':System.out.println("Your Item is added to cart .");  ob[i]="JBL C200SI";ob1[i++]=1799;
					 System.out.print("Do you want to continue shopping in this Budget (Below 4K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':jbl1k4k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':jblmenu(); b=false; break; // MADE CHANGES HEREE
						 default : System.out.print("Please enter valid option: ");
						 }
					 }while(b==true);  break;
					 case 'n':
					 {
						 System.out.print("Do you want to see another model in this Budget (Below 4K) [y/n or Y/N]:");  //MADE CHANGES HERE
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':jbl1k4k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': jblmenu(); b=false; break;
									 case 'n': wired(); b=false; break;
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
				 System.out.print("Do you want to add it to cart [y/n or Y/N]:");
				 do
				 {
					 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					 switch(c)
					 {
					 case 'y':System.out.println("Your Item is added to cart .");  ob[i]="JBL INSPIRE 300";ob1[i++]=2299;
					 System.out.print("Do you want to continue shopping in this Budget (Below 4K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':jbl1k4k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':jblmenu(); b=false; break; // MADE CHANGES HEREE
						 default : System.out.print("Please enter valid option: ");
						 }
					 }while(b==true);  break;
					 case 'n':
					 {
						 System.out.print("Do you want to see another model in this Budget (Below 4K) [y/n or Y/N]:");  //MADE CHANGES HERE
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':jbl1k4k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': jblmenu(); b=false; break;
									 case 'n': wired(); b=false; break;
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
				 System.out.print("Do you want to add it to cart [y/n or Y/N]:");
				 do
				 {
					 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					 switch(c)
					 {
					 case 'y':System.out.println("Your Item is added to cart .");  ob[i]="JBL ENDURANCE RUN";ob1[i++]=2990;
					 System.out.print("Do you want to continue shopping in this Budget (Below 4K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':jbl1k4k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':jblmenu(); b=false; break; // MADE CHANGES HEREE
						 default : System.out.print("Please enter valid option: ");
						 }
					 }while(b==true);  break;
					 case 'n':
					 {
						 System.out.print("Do you want to see another model in this Budget (Below 4K) [y/n or Y/N]:");  //MADE CHANGES HERE
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':jbl1k4k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': jblmenu(); b=false; break;
									 case 'n': wired(); b=false; break;
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
			 case 6:
			 {
				 System.out.print("Do you want to add it to cart [y/n or Y/N]:");
				 do
				 {
					 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					 switch(c)
					 {
					 case 'y':System.out.println("Your Item is added to cart .");  ob[i]="JBL TUNE 110";ob1[i++]=3199;
					 System.out.print("Do you want to continue shopping in this Budget (Below 4K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':jbl1k4k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':jblmenu(); b=false; break; // MADE CHANGES HEREE
						 default : System.out.print("Please enter valid option: ");
						 }
					 }while(b==true);  break;
					 case 'n':
					 {
						 System.out.print("Do you want to see another model in this Budget (Below 4K) [y/n or Y/N]:");  //MADE CHANGES HERE
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':jbl1k4k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': jblmenu(); b=false; break;
									 case 'n': wired(); b=false; break;
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
			 case 7:
			 {
				 System.out.print("Do you want to add it to cart [y/n or Y/N]:");
				 do
				 {
					 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					 switch(c)
					 {
					 case 'y':System.out.println("Your Item is added to cart .");  ob[i]="JBL T160";ob1[i++]=3399;
					 System.out.print("Do you want to continue shopping in this Budget (Below 4K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':jbl1k4k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':jblmenu(); b=false; break; // MADE CHANGES HEREE
						 default : System.out.print("Please enter valid option: ");
						 }
					 }while(b==true);  break;
					 case 'n':
					 {
						 System.out.print("Do you want to see another model in this Budget (Below 4K) [y/n or Y/N]:");  //MADE CHANGES HERE
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':jbl1k4k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': jblmenu(); b=false; break;
									 case 'n': wired(); b=false; break;
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
			 case 8:
			 {
				 System.out.print("Do you want to add it to cart [y/n or Y/N]:");
				 do
				 {
					 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					 switch(c)
					 {
					 case 'y':System.out.println("Your Item is added to cart .");  ob[i]="JBL T210";ob1[i++]=3999;
					 System.out.print("Do you want to continue shopping in this Budget (Below 4K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':jbl1k4k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':jblmenu(); b=false; break; // MADE CHANGES HEREE
						 default : System.out.print("Please enter valid option: ");
						 }
					 }while(b==true);  break;
					 case 'n':
					 {
						 System.out.print("Do you want to see another model in this Budget (Below 4K) [y/n or Y/N]:");  //MADE CHANGES HERE
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':jbl1k4k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': jblmenu(); b=false; break;
									 case 'n': wired(); b=false; break;
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
			 case 9:  jblmenu(); b=false; break;
			 default:  System.out.print("Please enter valid option:");
			 }
		 }while(b==true); 
	}
	public static void jbl4k10k()
	{ System.out.println(RESET);
		 System.out.println("\t   "+" ___________________________________________________________________________________________________________________________________");  
		 System.out.println("\t   "+"|                                                                                                                                   |");  
		 System.out.println("\t   "+"|    ___________________       ___________________       ___________________       ___________________       ___________________    |");  
		 System.out.println("\t   "+"|   |1.JBL SYNCHROS S100|     |2.JBL FOCUS 300    |     |3.JBL T280A        |     |4.JBL J33A         |     |5.JBL J33I         |   |");  
		 System.out.println("\t   "+"|   |-------------------|     |-------------------|     |-------------------|     |-------------------|     |-------------------|   |");  
		 System.out.println("\t   "+"|   |.WIRED EARPHONES   |     |.WIRED EARPHONES   |     |.WIRED EARPHONES   |     |.WIRED EARPHONES   |     |.WIRED EARPHONES   |   |");  
		 System.out.println("\t   "+"|   |.Dynamic Drivers   |     |.20Hz - 20Khz      |     |.Inline Controls   |     |.Dynamic Drivers   |     |.4Hz - 40Khz freq  |   |");  
		 System.out.println("\t   "+"|   |.Inline Controls   |     |.Noise Cancellation|     |.Bradded Cable     |     |.Inline Controls   |     |.Noise Cancellation|   |");  
		 System.out.println("\t   "+"|   |.In Ear Canalphone |     |.14MM Drivers      |     |.Premium Base      |     |.In Built Mic      |     |.In Ear CanalPhone |   |");  
		 System.out.println("\t   "+"|   |.High Quality Base |     |.Tangle Free Cable |     |.Noise Cancellation|     |.Noise Isolation   |     |.Noise Isolation   |   |");  
		 System.out.println("\t   "+"|   |.Bradded Cable     |     |.In Ear CanalPhone |     |.5Hz - 20Khz Freq  |     |.High Quality Base |     |.Premium Base      |   |");  
		 System.out.println("\t   "+"|   |.PRICE : 4099/-    |     |.PRICE : 4799/-    |     |.PRICE : 5699/-    |     |.PRICE : 5999/-    |     |.PRICE : 8499/-    |   |");  
		 System.out.println("\t   "+"|   |___________________|     |___________________|     |___________________|     |___________________|     |___________________|   |");  
		 System.out.println("\t   "+"|                                                                                                                                   |");  
		 System.out.println("\t   "+"|                                                                                                                                   |");  
		 System.out.println("\t   "+"|                                            ___________________       ___________________                                          |");  
		 System.out.println("\t   "+"|                                           |6.JBL SYNCHROS REF |     |                   |                                         |");  
		 System.out.println("\t   "+"|                                           |-------------------|     |                   |                                         |");  
		 System.out.println("\t   "+"|                                           |.WIRED EARPHONES   |     |        7.         |                                         |");  
		 System.out.println("\t   "+"|                                           |.13.3MM Drivers    |     |                   |                                         |");  
		 System.out.println("\t   "+"|                                           |.Noise Cancellation|     |       EXIT        |                                         |");  
		 System.out.println("\t   "+"|                                           |.High Quality Base |     |   -------------   |                                         |");  
		 System.out.println("\t   "+"|                                           |.Tangle Free Cable |     |                   |                                         |");  
		 System.out.println("\t   "+"|                                           |.Dolby Support     |     |                   |                                         |");  
		 System.out.println("\t   "+"|                                           |.PRICE : 9999/-    |     |                   |                                         |");  
		 System.out.println("\t   "+"|                                           |___________________|     |___________________|                                         |");  
		 System.out.println("\t   "+"|                                                                                                                                   |");    
		 System.out.println("\t   "+"|___________________________________________________________________________________________________________________________________|"); 
		 System.out.println(RESET);	 jbl4k10kswitch();
	}
	//=============================================================================================================
	public static void jbl4k10kswitch()
	{
		System.out.print("PLEASE CHOOSE YOUR PREFERRED MODEL :");
		 do
		 {
			 int m=sc.nextInt();
			 switch(m)
			 {
			 case 1:
			 {
				 System.out.print("Do you want to add it to cart [y/n or Y/N]:");
				 do
				 {
					 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					 switch(c)
					 {
					 case 'y':System.out.println("Your Item is added to cart .");  ob[i]="JBL SYNCHROS S100";ob1[i++]=4099;
					 System.out.print("Do you want to continue shopping in this Budget (Above 4K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':jbl4k10k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':jblmenu(); b=false; break; // MADE CHANGES HEREE
						 default : System.out.print("Please enter valid option: ");
						 }
					 }while(b==true);  break;
					 case 'n':
					 {
						 System.out.print("Do you want to see another model in this Budget (Above 4K) [y/n or Y/N]:");  //MADE CHANGES HERE
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':jbl4k10k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': jblmenu(); b=false; break;
									 case 'n': wired(); b=false; break;
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
				 System.out.print("Do you want to add it to cart [y/n or Y/N]:");
				 do
				 {
					 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					 switch(c)
					 {
					 case 'y':System.out.println("Your Item is added to cart .");  ob[i]="JBL FOCUS 300";ob1[i++]=4799;
					 System.out.print("Do you want to continue shopping in this Budget (Above 4K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':jbl4k10k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':jblmenu(); b=false; break; // MADE CHANGES HEREE
						 default : System.out.print("Please enter valid option: ");
						 }
					 }while(b==true);  break;
					 case 'n':
					 {
						 System.out.print("Do you want to see another model in this Budget (Above 4K) [y/n or Y/N]:");  //MADE CHANGES HERE
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':jbl4k10k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': jblmenu(); b=false; break;
									 case 'n': wired(); b=false; break;
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
				 System.out.print("Do you want to add it to cart [y/n or Y/N]:");
				 do
				 {
					 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					 switch(c)
					 {
					 case 'y':System.out.println("Your Item is added to cart .");  ob[i]="JBL T280A";ob1[i++]=5699;
					 System.out.print("Do you want to continue shopping in this Budget (Above 4K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':jbl4k10k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':jblmenu(); b=false; break; // MADE CHANGES HEREE
						 default : System.out.print("Please enter valid option: ");
						 }
					 }while(b==true);  break;
					 case 'n':
					 {
						 System.out.print("Do you want to see another model in this Budget (Above 4K) [y/n or Y/N]:");  //MADE CHANGES HERE
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':jbl4k10k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': jblmenu(); b=false; break;
									 case 'n': wired(); b=false; break;
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
				 System.out.print("Do you want to add it to cart [y/n or Y/N]:");
				 do
				 {
					 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					 switch(c)
					 {
					 case 'y':System.out.println("Your Item is added to cart .");  ob[i]="JBL J33A";ob1[i++]=5999;
					 System.out.print("Do you want to continue shopping in this Budget (Above 4K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':jbl4k10k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':jblmenu(); b=false; break; // MADE CHANGES HEREE
						 default : System.out.print("Please enter valid option: ");
						 }
					 }while(b==true);  break;
					 case 'n':
					 {
						 System.out.print("Do you want to see another model in this Budget (Above 4K) [y/n or Y/N]:");  //MADE CHANGES HERE
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':jbl4k10k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': jblmenu(); b=false; break;
									 case 'n': wired(); b=false; break;
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
				 System.out.print("Do you want to add it to cart [y/n or Y/N]:");
				 do
				 {
					 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					 switch(c)
					 {
					 case 'y':System.out.println("Your Item is added to cart .");  ob[i]="JBL J33I";ob1[i++]=8499;
					 System.out.print("Do you want to continue shopping in this Budget (Above 4K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':jbl4k10k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':jblmenu(); b=false; break; // MADE CHANGES HEREE
						 default : System.out.print("Please enter valid option: ");
						 }
					 }while(b==true);  break;
					 case 'n':
					 {
						 System.out.print("Do you want to see another model in this Budget (Above 4K) [y/n or Y/N]:");  //MADE CHANGES HERE
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':jbl4k10k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': jblmenu(); b=false; break;
									 case 'n': wired(); b=false; break;
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
			 case 6:
			 {
				 System.out.print("Do you want to add it to cart [y/n or Y/N]:");
				 do
				 {
					 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					 switch(c)
					 {
					 case 'y':System.out.println("Your Item is added to cart .");  ob[i]="JBL SYNCHROS REF";ob1[i++]=9999;
					 System.out.print("Do you want to continue shopping in this Budget (Above 4K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':jbl4k10k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':jblmenu(); b=false; break; // MADE CHANGES HEREE
						 default : System.out.print("Please enter valid option: ");
						 }
					 }while(b==true);  break;
					 case 'n':
					 {
						 System.out.print("Do you want to see another model in this Budget (Above 4K) [y/n or Y/N]:");  //MADE CHANGES HERE
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':jbl4k10k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': jblmenu(); b=false; break;
									 case 'n': wired(); b=false; break;
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
			 case 7:  jblmenu(); b=false; break;
			 default:  System.out.print("Please enter valid option:");
			 }
		 }while(b==true); 

	}
	//============================================================================================
	public static void boultaudiomenu()
	{ System.out.println(RESET);
		System.out.println("\t\t\t\t\t\t"+"                           BOULTAUDIO     ");  
		 System.out.println("\t\t\t\t\t\t"+"                      ------------------  ");  
		 System.out.println("\t\t\t\t\t\t"+"                      1.Between 500 - 1k        ");  
		 System.out.println("\t\t\t\t\t\t"+"                      2.EXIT        ");
		 System.out.println(RESET); boultaudioswitch();
	}
	//======================================================================================================
	public static void boultaudioswitch()
	{
		System.out.print("PLEASE ENTER THE PRICE RANGE  :");
		 
		 do
		 {
			int p=sc.nextInt();
			switch(p) 
			{
			case 1: boultaudio5h1k(); b=false; break;
			case 2: wired();b=false; break;
		    default:
		    	{
		    		System.out.println("Please enter valid option.");
		    		boultaudiomenu(); 
		    	}
			}
		 }while(b==true);
	}
	//===========================================================================================================
	public static void boultaudio5h1k()
	{ System.out.println(RESET);
		 System.out.println("\t   "+" ___________________________________________________________________________________________________________________________________");  
		 System.out.println("\t   "+"|                                                                                                                                   |");  
		 System.out.println("\t   "+"|    ___________________       ___________________       ___________________       ___________________       ___________________    |");  
		 System.out.println("\t   "+"|   |1.BASSBUDS X1      |     |2.BASSWOOD         |     |3.BASSBUDS STROMX  |     |4.BASSBUDS X2      |     |5.AUDIO LOOP       |   |");  
		 System.out.println("\t   "+"|   |-------------------|     |-------------------|     |-------------------|     |-------------------|     |-------------------|   |");  
		 System.out.println("\t   "+"|   |.WIRED EARPHONES   |     |.WIRED EARPHONES   |     |.WIRED EARPHONES   |     |.WIRED EARPHONES   |     |.WIRED EARPHONES   |   |");  
		 System.out.println("\t   "+"|   |.Dynamic Drivers   |     |.20Hz - 20Khz freq |     |.Dynamic Drivers   |     |.In Ear CanalPhone |     |.Stereo Speakers   |   |");  
		 System.out.println("\t   "+"|   |.In Line Controls  |     |.10MM Drivers      |     |.In Line Controls  |     |.Bradded Cable     |     |.Tangle Free Cable |   |");  
		 System.out.println("\t   "+"|   |.High Base Speakers|     |.3.5MM Jack        |     |.Tangle Free Cable |     |.10.3MM Drivers    |     |.5Hz - 20Khz freq  |   |");  
		 System.out.println("\t   "+"|   |.In Ear CanalPhone |     |.Stereo Speakers   |     |.High Bass Buds    |     |.Noise Isolation   |     |.3.5MM Jack        |   |");  
		 System.out.println("\t   "+"|   |.30Hz - 15Khz freq |     |.In Built Mic      |     |.In Ear Canalphone |     |.Stereo Speakers   |     |.Dolby Support     |   |");  
		 System.out.println("\t   "+"|   |.PRICE : 529/-     |     |.PRICE : 599/-     |     |.PRICE : 649/-     |     |.PRICE : 699/-     |     |.PRICE : 739/-     |   |");  
		 System.out.println("\t   "+"|   |___________________|     |___________________|     |___________________|     |___________________|     |___________________|   |");  
		 System.out.println("\t   "+"|                                                                                                                                   |");  
		 System.out.println("\t   "+"|                                                                                                                                   |");  
		 System.out.println("\t   "+"|    ___________________       ___________________       ___________________       ___________________                              |");  
		 System.out.println("\t   "+"|   |6.AUDIO UFO        |     |7.BASSBUDS STROM   |     |8.AUDIO LOUPE      |     |                   |                             |");  
		 System.out.println("\t   "+"|   |-------------------|     |-------------------|     |-------------------|     |                   |                             |");  
		 System.out.println("\t   "+"|   |.WIRED EARPHONES   |     |.WIRED EARPHONES   |     |.WIRED EARPHONES   |     |        9.         |                             |");  
		 System.out.println("\t   "+"|   |.High Base Speakers|     |.Premium Bass      |     |.Dynamic Drivers   |     |                   |                             |");  
		 System.out.println("\t   "+"|   |.In Ear CanalPhone |     |.In Ear CanalPhone |     |.Noise Cancellation|     |       EXIT        |                             |");  
		 System.out.println("\t   "+"|   |.Stereo Speakers   |     |.14MM Drivers      |     |.4Hz - 40Khz freq  |     |     ---------     |                             |");  
		 System.out.println("\t   "+"|   |.Dynamic Drivers   |     |.Inline Controls   |     |.Stereo Speakers   |     |                   |                             |");  
		 System.out.println("\t   "+"|   |.Inline Controls   |     |.Tangle Free Cable |     |.Dolby Speakers    |     |                   |                             |");  
		 System.out.println("\t   "+"|   |.PRICE : 799/-     |     |.PRICE : 899/-     |     |.PRICE : 999/-     |     |                   |                             |");  
		 System.out.println("\t   "+"|   |___________________|     |___________________|     |___________________|     |___________________|                             |");  
		 System.out.println("\t   "+"|                                                                                                                                   |");    
		 System.out.println("\t   "+"|___________________________________________________________________________________________________________________________________|"); 
		 System.out.println(RESET); boultaudio5h1kswitch();
	}
	//===========================================================================================================================
	public static void boultaudio5h1kswitch()
	{
		System.out.print("PLEASE CHOOSE YOUR PREFERRED MODEL :");
		 do
		 {
			 int m=sc.nextInt();
			 switch(m)
			 {
			 case 1:
			 {
				 System.out.print("Do you want to add it to cart [y/n or Y/N]:");
				 do
				 {
					 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					 switch(c)
					 {
					 case 'y':System.out.println("Your Item is added to cart .");  ob[i]="BOULT BASSBUDS X1";ob1[i++]=529;
					          System.out.print("Do you want to continue shopping in this Budget (Below 1K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
			 		  do
			 		  {
			 			char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
			 			switch(c1)	
						{
						case 'y': boultaudio5h1k(); b=false; break; // MADE CHANGES HEREE
						case 'n':boultaudiomenu(); b=false; break; // MADE CHANGES HEREE
			 			default : System.out.print("Please enter valid option: ");
						}
			 		  }while(b==true);  break;
					 case 'n':
						 {
							 System.out.print("Do you want to see another model in this Budget (Below 1K) [y/n or Y/N]:");  //MADE CHANGES HERE
								do
								{
									char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								switch(c1)	
								{
								case 'y': boultaudio5h1k(); b=false; break;
								case 'n':
									{
										System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
										do 
										{
											char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
											switch(c2)
											{
											case 'y': boultaudiomenu(); b=false; break;
											case 'n': wired(); b=false; break;
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
				 System.out.print("Do you want to add it to cart [y/n or Y/N]:");
				 do
				 {
					 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					 switch(c)
					 {
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="BOULT BASSSWOOD";ob1[i++]=599;
					 System.out.print("Do you want to continue shopping in this Budget (Below 1K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y': boultaudio5h1k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':boultaudiomenu(); b=false; break; // MADE CHANGES HEREE
						 default : System.out.print("Please enter valid option: ");
						 }
					 }while(b==true);  break;
					 case 'n':
					 {
						 System.out.print("Do you want to see another model in this Budget (Below 1K) [y/n or Y/N]:");  //MADE CHANGES HERE
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y': boultaudio5h1k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': boultaudiomenu(); b=false; break;
									 case 'n': wired(); b=false; break;
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
				 System.out.print("Do you want to add it to cart [y/n or Y/N]:");
				 do
				 {
					 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					 switch(c)
					 {
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="BOULT STROMX";ob1[i++]=649;
					 System.out.print("Do you want to continue shopping in this Budget (Below 1K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y': boultaudio5h1k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':boultaudiomenu(); b=false; break; // MADE CHANGES HEREE
						 default : System.out.print("Please enter valid option: ");
						 }
					 }while(b==true);  break;
					 case 'n':
					 {
						 System.out.print("Do you want to see another model in this Budget (Below 1K) [y/n or Y/N]:");  //MADE CHANGES HERE
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y': boultaudio5h1k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': boultaudiomenu(); b=false; break;
									 case 'n': wired(); b=false; break;
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
				 System.out.print("Do you want to add it to cart [y/n or Y/N]:");
				 do
				 {
					 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					 switch(c)
					 {
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="BOULT X2";ob1[i++]=699;
					 System.out.print("Do you want to continue shopping in this Budget (Below 1K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y': boultaudio5h1k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':boultaudiomenu(); b=false; break; // MADE CHANGES HEREE
						 default : System.out.print("Please enter valid option: ");
						 }
					 }while(b==true);  break;
					 case 'n':
					 {
						 System.out.print("Do you want to see another model in this Budget (Below 1K) [y/n or Y/N]:");  //MADE CHANGES HERE
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y': boultaudio5h1k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': boultaudiomenu(); b=false; break;
									 case 'n': wired(); b=false; break;
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
				 System.out.print("Do you want to add it to cart [y/n or Y/N]:");
				 do
				 {
					 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					 switch(c)
					 {
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="BOULT AUDIO LOOP";ob1[i++]=739;
					 System.out.print("Do you want to continue shopping in this Budget (Below 1K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y': boultaudio5h1k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':boultaudiomenu(); b=false; break; // MADE CHANGES HEREE
						 default : System.out.print("Please enter valid option: ");
						 }
					 }while(b==true);  break;
					 case 'n':
					 {
						 System.out.print("Do you want to see another model in this Budget (Below 1K) [y/n or Y/N]:");  //MADE CHANGES HERE
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y': boultaudio5h1k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': boultaudiomenu(); b=false; break;
									 case 'n': wired(); b=false; break;
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
			 case 6:
			 {
				 System.out.print("Do you want to add it to cart [y/n or Y/N]:");
				 do
				 {
					 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					 switch(c)
					 {
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="BOULT AUDIO UFO";ob1[i++]=799;
					 System.out.print("Do you want to continue shopping in this Budget (Below 1K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y': boultaudio5h1k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':boultaudiomenu(); b=false; break; // MADE CHANGES HEREE
						 default : System.out.print("Please enter valid option: ");
						 }
					 }while(b==true);  break;
					 case 'n':
					 {
						 System.out.print("Do you want to see another model in this Budget (Below 1K) [y/n or Y/N]:");  //MADE CHANGES HERE
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y': boultaudio5h1k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': boultaudiomenu(); b=false; break;
									 case 'n': wired(); b=false; break;
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
			 case 7:
			 {
				 System.out.print("Do you want to add it to cart [y/n or Y/N]:");
				 do
				 {
					 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					 switch(c)
					 {
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="BOULT BASSBUDS STROMX";ob1[i++]=899;
					 System.out.print("Do you want to continue shopping in this Budget (Below 1K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y': boultaudio5h1k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':boultaudiomenu(); b=false; break; // MADE CHANGES HEREE
						 default : System.out.print("Please enter valid option: ");
						 }
					 }while(b==true);  break;
					 case 'n':
					 {
						 System.out.print("Do you want to see another model in this Budget (Below 1K) [y/n or Y/N]:");  //MADE CHANGES HERE
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y': boultaudio5h1k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': boultaudiomenu(); b=false; break;
									 case 'n': wired(); b=false; break;
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
			 case 8:
			 {
				 System.out.print("Do you want to add it to cart [y/n or Y/N]:");
				 do
				 {
					 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					 switch(c)
					 {
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="BOULT AUDIO LOUPE";ob1[i++]=999;
					 System.out.print("Do you want to continue shopping in this Budget (Below 1K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y': boultaudio5h1k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':boultaudiomenu(); b=false; break; // MADE CHANGES HEREE
						 default : System.out.print("Please enter valid option: ");
						 }
					 }while(b==true);  break;
					 case 'n':
					 {
						 System.out.print("Do you want to see another model in this Budget (Below 1K) [y/n or Y/N]:");  //MADE CHANGES HERE
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y': boultaudio5h1k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': boultaudiomenu(); b=false; break;
									 case 'n': wired(); b=false; break;
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
			 case 9:  boultaudiomenu(); b=false; break;
			 default:  System.out.print("Please enter valid option:");
			 }
		 }while(b==true); 
	}
	//============================================================================================
//	public static void main(String[] args) 
//	{
//		wired();
//	}

}
