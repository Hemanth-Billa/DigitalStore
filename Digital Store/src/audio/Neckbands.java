package audio;

import java.util.Scanner;

import home_screen.Main_Home;

public class Neckbands {
	public static String ob[]=new String[100];
	public static float ob1[]=new float[100];
	static Scanner sc  = new Scanner(System.in); private static final String RESET = "\033[0m";  // Text Reset
	static boolean b=true;static int i=0;
	public static void neckband()
	{ System.out.println(RESET);
		System.out.println("\t\t\t\t\t\t                       @@@@&&&&&&&&&@@@@@");
		System.out.println("\t\t\t\t\t\t                  @&@@    -----------    @@&@");
		System.out.println("\t\t\t\t\t\t               @&@         NECKBANDS         @&@");
		System.out.println("\t\t\t\t\t\t            @&@           -----------           @&@");
		System.out.println("\t\t\t\t\t\t          @&              1. SONY                 &&@");
		System.out.println("\t\t\t\t\t\t        @&                2. SENNHEISER             &&&");
		System.out.println("\t\t\t\t\t\t       &@                 3. ZEBRONICS                @&");
		System.out.println("\t\t\t\t\t\t      %                   4. BOAT                       %");
		System.out.println("\t\t\t\t\t\t     %                    5. JBL                         %");
		System.out.println("\t\t\t\t\t\t    %& @@                 6. BOULT AUDIO             .@@ @&");
		System.out.println("\t\t\t\t\t\t    %      &              7. EXIT FROM NECKBANDS    #     .%");
		System.out.println("\t\t\t\t\t\t   #&       %                                      /       %%");
		System.out.println("\t\t\t\t\t\t   #@       .                                     %       @%%");
		System.out.println("\t\t\t\t\t\t   @&                                             @        %&");
		System.out.println("\t\t\t\t\t\t   &%       &                                     .       &%&");
		System.out.println("\t\t\t\t\t\t   &&      (                                      %      %#%");
		System.out.println("\t\t\t\t\t\t   %%     .                                       &      &&");
		System.out.println("\t\t\t\t\t\t   (%    &       ,,,/ #%           %#/%*.,/            &%&&");
		System.out.println("\t\t\t\t\t\t    %./   #      #/*. (%%&&       @&&%%, (,        *  %*%&&");
		System.out.println("\t\t\t\t\t\t     %.#  %       ##(# @@/          @@@&###&         #(.&&");
		System.out.println("\t\t\t\t\t\t      &%%%&@                               &         @%%%%");
		System.out.println("\t\t\t\t\t\t       &%%%&%        &                    #         %&%%%");
		System.out.println("\t\t\t\t\t\t        &,,% %        @                 /          %&,,&");
		System.out.println("\t\t\t\t\t\t         %#,&& @                         &        @,,%%");
		System.out.println("\t\t\t\t\t\t          @/.%&   @  %#                    @  #% @/.,%");
		System.out.println("\t\t\t\t\t\t           &//%&                                @,,./%");
		System.out.println("\t\t\t\t\t\t            &/.%&                              @,&.%");
		System.out.println("\t\t\t\t\t\t             &%%%&                            @&%%%");
		System.out.println("\t\t\t\t\t\t              &(.(                            %,%#");
		 System.out.println(RESET);
		purchase();
		
	}
	public static void purchase()
	{
		System.out.print("PLEASE SELECT YOUR PREFERRED BRAND[1-7] : ");
		boolean b=true;
		do
		{
			int c=sc.nextInt();
			switch(c)
			{
			case 1:sonymenu(); b=false; break;
			case 2:sennheisermenu(); b=false; break;
			case 3:zebronicsmenu();  b=false; break;
			case 4:boatmenu();  b=false;  break;
			case 5:jblmenu();  b=false;  break;
			case 6:boultaudiomenu();   b=false;  break;
			case 7:Main_Home.audios(); b=false;  break;
			default: 
				{
					System.out.println();
					System.out.print("\t\t\t\t\t\t\t\t   "+"PLEASE ENTER VALID OPTION..."+"\n");
			        neckband();
				}
			}
		}while(b==true);
		
	}
	public static void sonymenu()
	{ System.out.println(RESET);
		 System.out.println("\t\t\t\t\t\t"+"                            SONY                            ");  
		 System.out.println("\t\t\t\t\t\t"+"                      ----------------                      ");  
		 System.out.println("\t\t\t\t\t\t"+"                      1.Between 2K - 5k                         ");  
		 System.out.println("\t\t\t\t\t\t"+"                      2.Above 5k                    ");
		 System.out.println("\t\t\t\t\t\t"+"                      3.EXIT FROM SONY                            ");
		 System.out.println(RESET); sonyswitch();
	}
	public static void sonyswitch()
	{
		System.out.print("PLEASE ENTER THE PRICE RANGE  :");
		 
		 do
		 {
			int p=sc.nextInt();
			switch(p) 
			{
			case 1: sony2k5k(); b=false; break;
			case 2: sony5k(); b=false; break;
			case 3: neckband();b=false; break;
		    default:
		    	{
		    		System.out.println("Please enter valid option.");
		    		sonymenu(); 
		    	}
			}
		 }while(b==true);
	}
	public static void sony2k5k()
	{ System.out.println(RESET);
		 System.out.println("\t   "+" ____________________________________________________________________________________________________________________________________");  
		 System.out.println("\t   "+"|                                                                                                                                    |");  
		 System.out.println("\t   "+"|    ____________________       ___________________       ___________________       ___________________       ___________________    |");  
		 System.out.println("\t   "+"|   |1.SONY WI-C100      |     |2.SONY WI-C200     |     |3.SONY WI-C310     |     |4.SONY MDR-XB50BS  |     |                   |   |");  
		 System.out.println("\t   "+"|   |--------------------|     |-------------------|     |-------------------|     |-------------------|     |                   |   |");  
		 System.out.println("\t   "+"|   |.WIRELESS           |     |.WIRELESS          |     |.WIRELESS          |     |.WIRELESS          |     |        5.         |   |");  
		 System.out.println("\t   "+"|   |.Version: 5.0       |     |.Version: 5.0      |     |.Version: 5.0      |     |.Version: 5.0      |     |                   |   |");  
		 System.out.println("\t   "+"|   |.Range : 10meters   |     |.Inline Controls   |     |.Inline Controls   |     |.Noise Cancellation|     |       EXIT        |   |");  
		 System.out.println("\t   "+"|   |.TalkTime:25 Hours  |     |.TalkTime:15Hours  |     |.TalkTime:15Hours  |     |.TalkTime:8.5Hours |     |     --------      |   |");  
		 System.out.println("\t   "+"|   |.StandbyTime:180Hrs |     |.StandbyTime:200Hrs|     |.StandbyTime:200Hrs|     |.StandbyTime:170Hrs|     |                   |   |");  
		 System.out.println("\t   "+"|   |.Inline Controls    |     |.Chargingtime:3Hrs |     |.Chargingtime:3Hrs |     |.Chargingtime:2Hrs |     |                   |   |");  
		 System.out.println("\t   "+"|   |.PRICE : 2199/-     |     |.PRICE : 2599/-    |     |.PRICE : 3599/-    |     |.PRICE : 3899/-    |     |                   |   |");  
		 System.out.println("\t   "+"|   |____________________|     |___________________|     |___________________|     |___________________|     |___________________|   |");  
		 System.out.println("\t   "+"|                                                                                                                                    |");  			 
		 System.out.println("\t   "+"|____________________________________________________________________________________________________________________________________|");  
		 System.out.println(RESET);sony2k5kswitch(); 
	}
	public static void sony2k5kswitch()
	{
		 System.out.println("PLEASE CHOOSE YOUR PREFERRED MODEL :");
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SONY WI-C100";ob1[i++]=2199;
						          System.out.print("Do you want to continue shopping in this Budget (Below 5K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
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
								 System.out.print("Do you want to see another model in this Budget (Below 5K) [y/n or Y/N]:");  //MADE CHANGES HERE
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
												case 'n': neckband(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SONY WI-C200";ob1[i++]=2599;
					   System.out.print("Do you want to continue shopping in this Budget (Below 5K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
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
						   System.out.print("Do you want to see another model in this Budget (Below 5K) [y/n or Y/N]:");  //MADE CHANGES HERE
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
									   case 'n': neckband(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SONY WI-C310";ob1[i++]=3599;
					   System.out.print("Do you want to continue shopping in this Budget (Below 5K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
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
						   System.out.print("Do you want to see another model in this Budget (Below 5K) [y/n or Y/N]:");  //MADE CHANGES HERE
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
									   case 'n': neckband(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SONY MDR-XB50BS";ob1[i++]=3899;
					   System.out.print("Do you want to continue shopping in this Budget (Below 5K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
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
						   System.out.print("Do you want to see another model in this Budget (Below 5K) [y/n or Y/N]:");  //MADE CHANGES HERE
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
									   case 'n': neckband(); b=false; break;
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
			   
			   case 5:sonymenu(); b=false; break;
			   default: System.out.print("PLEASE ENTER VALID OPTION: ");
			   }
		   }while(b==true); 
	   }
	
	public static void sony5k()
	{ System.out.println(RESET);
		 System.out.println("\t   "+" ____________________________________________________________________________________________________________________________________");  
		 System.out.println("\t   "+"|                                                                                                                                    |");  
		 System.out.println("\t   "+"|    ____________________       ___________________       ___________________       ___________________       ___________________    |");  
		 System.out.println("\t   "+"|   |1.SONY MDR-XB70BT   |     |2.SONY WI-SP500    |     |3.SONY MDR-XB80BS  |     |4.SONY WI-1000XM2  |     |                   |   |");  
		 System.out.println("\t   "+"|   |--------------------|     |-------------------|     |-------------------|     |-------------------|     |                   |   |");  
		 System.out.println("\t   "+"|   |.WIRELESS           |     |.WIRELESS          |     |.WIRELESS          |     |.WIRELESS          |     |        5.         |   |");  
		 System.out.println("\t   "+"|   |.Version: 5.2       |     |.Version: 5.0      |     |.Version: 5.0      |     |.Version: 5.2      |     |                   |   |");  
		 System.out.println("\t   "+"|   |.Range : 10meters   |     |.Inline Controls   |     |.Noise Cancellation|     |.Noise Cancellation|     |       EXIT        |   |");  
		 System.out.println("\t   "+"|   |.Noise Cancellation |     |.TalkTime:8Hours   |     |.TalkTime:9Hours   |     |.TalkTime:8.5Hours |     |     --------      |   |");  
		 System.out.println("\t   "+"|   |.StandbyTime:180Hrs |     |.StandbyTime:200Hrs|     |.StandbyTime:200Hrs|     |.StandbyTime:170Hrs|     |                   |   |");  
		 System.out.println("\t   "+"|   |.Inline Controls    |     |.Chargingtime:2Hrs |     |.Chargingtime:3Hrs |     |.Chargingtime:2Hrs |     |                   |   |");  
		 System.out.println("\t   "+"|   |.PRICE : 6590/-     |     |.PRICE : 8199/-    |     |.PRICE : 9499/-    |     |.PRICE : 21990/-   |     |                   |   |");  
		 System.out.println("\t   "+"|   |____________________|     |___________________|     |___________________|     |___________________|     |___________________|   |");  
		 System.out.println("\t   "+"|                                                                                                                                    |");  			 
		 System.out.println("\t   "+"|____________________________________________________________________________________________________________________________________|");  
		 System.out.println(RESET); sony5kswitch(); 
	}
	public static void sony5kswitch()
	{
		System.out.println("PLEASE CHOOSE YOUR PREFERRED MODEL :");
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SONY MDR-XB70BT";ob1[i++]=6590;
						          System.out.print("Do you want to continue shopping in this Budget (ABOVE 5K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
				 		  do
				 		  {
				 			char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
				 			switch(c1)	
							{
							case 'y':sony5k(); b=false; break; // MADE CHANGES HEREE
							case 'n':sonymenu(); b=false; break; // MADE CHANGES HEREE
				 			default : System.out.print("Please enter valid option: ");
							}
				 		  }while(b==true);  break;
						 case 'n':
							 {
								 System.out.print("Do you want to see another model in this Budget (ABOVE 5K) [y/n or Y/N]:");  //MADE CHANGES HERE
									do
									{
										char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									switch(c1)	
									{
									case 'y':sony5k(); b=false; break;
									case 'n':
										{
											System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
											do 
											{
												char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
												switch(c2)
												{
												case 'y': sonymenu(); b=false; break;
												case 'n': neckband(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SONY WI-SP500";ob1[i++]=8199;
					   System.out.print("Do you want to continue shopping in this Budget (ABOVE 5K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						   switch(c1)	
						   {
						   case 'y':sony5k(); b=false; break; // MADE CHANGES HEREE
						   case 'n':sonymenu(); b=false; break; // MADE CHANGES HEREE
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);  break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this Budget (ABOVE 5K) [y/n or Y/N]:");  //MADE CHANGES HERE
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							   switch(c1)	
							   {
							   case 'y':sony5k(); b=false; break;
							   case 'n':
							   {
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c2)
									   {
									   case 'y': sonymenu(); b=false; break;
									   case 'n': neckband(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SONY MDR-XB80BS";ob1[i++]=9499;
					   System.out.print("Do you want to continue shopping in this Budget (ABOVE 5K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						   switch(c1)	
						   {
						   case 'y':sony5k(); b=false; break; // MADE CHANGES HEREE
						   case 'n':sonymenu(); b=false; break; // MADE CHANGES HEREE
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);  break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this Budget (ABOVE 5K) [y/n or Y/N]:");  //MADE CHANGES HERE
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							   switch(c1)	
							   {
							   case 'y':sony5k(); b=false; break;
							   case 'n':
							   {
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c2)
									   {
									   case 'y': sonymenu(); b=false; break;
									   case 'n': neckband(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SONY WI-1000XM2";ob1[i++]=21990;
					   System.out.print("Do you want to continue shopping in this Budget (ABOVE 5K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						   switch(c1)	
						   {
						   case 'y':sony5k(); b=false; break; // MADE CHANGES HEREE
						   case 'n':sonymenu(); b=false; break; // MADE CHANGES HEREE
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);  break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this Budget (ABOVE 5K) [y/n or Y/N]:");  //MADE CHANGES HERE
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							   switch(c1)	
							   {
							   case 'y':sony5k(); b=false; break;
							   case 'n':
							   {
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c2)
									   {
									   case 'y': sonymenu(); b=false; break;
									   case 'n': neckband(); b=false; break;
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
			   
			   case 5:sonymenu(); b=false; break;
			   default: System.out.print("PLEASE ENTER VALID OPTION: ");
			   }
		   }while(b==true); 
	}
	public static void sennheisermenu()
	{ System.out.println(RESET);
		 System.out.println("\t\t\t\t\t\t"+"                         SENNHEISER                ");  
		 System.out.println("\t\t\t\t\t\t"+"                      ----------------             ");  
		 System.out.println("\t\t\t\t\t\t"+"                      1.Between 5K - 30k         ");  
		 System.out.println("\t\t\t\t\t\t"+"                      2.EXIT FROM SENNHEISER                     ");
		 System.out.println(RESET); sennheiserswitch();
	}
	public static void sennheiserswitch()
	{
			System.out.print("PLEASE ENTER THE PRICE RANGE  :");
			 
			 do
			 {
				int p=sc.nextInt();
				switch(p) 
				{
				case 1: sennheiser5k30k(); b=false; break;
				case 2: neckband(); b=false; break;
			    default:
			    	{
			    		System.out.println("Please enter valid option.");
			    		sennheisermenu();
			    	}
				}
			 }while(b==true);
	}
	public static void sennheiser5k30k()
	{ System.out.println(RESET);
		 System.out.println("\t   "+" ___________________________________________________________________________________________________________________________________");  
		 System.out.println("\t   "+"|                                                                                                                                   |");  
		 System.out.println("\t   "+"|    ___________________       ___________________       ___________________       ___________________       ___________________    |");  
		 System.out.println("\t   "+"|   |1.CX350BT          |     |2.CX 6.00BT        |     |3.MOMENTUM FREE    |     |4.CX 7.00BT        |     |5.CX SPORT         |   |");  
		 System.out.println("\t   "+"|   |-------------------|     |-------------------|     |-------------------|     |-------------------|     |-------------------|   |");  
		 System.out.println("\t   "+"|   |.WIRELESS          |     |.WIRELESS          |     |.WIRELESS          |     |.WIRELESS          |     |.WIRELESS          |   |");  
		 System.out.println("\t   "+"|   |.Version: 5.0      |     |.Version: 5.2      |     |.Version: 5.0      |     |.Version: 5.0      |     |.Version: 5.2      |   |");  
		 System.out.println("\t   "+"|   |.Range : 10meters  |     |.Noise Cancellation|     |.Range: 10 meters  |     |.Noise Cancellation|     |.Inline Controls   |   |");  
		 System.out.println("\t   "+"|   |.High Base         |     |.TalkTime:8Hours   |     |.TalkTime:6Hours   |     |.TalkTime:10Hours  |     |.TalkTime:8Hours   |   |");  
		 System.out.println("\t   "+"|   |.StandbyTime:300Hrs|     |.StandbyTime:250Hrs|     |.Noise Cancellation|     |.Noise Isolation   |     |.Noise Cancellation|   |");  
		 System.out.println("\t   "+"|   |.Chargingtime:2Hrs |     |.Chargingtime:2Hrs |     |.Chargingtime:1Hr  |     |.Chargingtime:1Hr  |     |.Chargingtime:2Hrs |   |");  
		 System.out.println("\t   "+"|   |.PRICE : 4990/-    |     |.PRICE : 5399/-    |     |.PRICE : 5799/-    |     |.PRICE : 7299/-    |     |.PRICE : 9990/-    |   |");  
		 System.out.println("\t   "+"|   |___________________|     |___________________|     |___________________|     |___________________|     |___________________|   |");  
		 System.out.println("\t   "+"|                                                                                                                                   |");  
		 System.out.println("\t   "+"|                                                                                                                                   |");  
		 System.out.println("\t   "+"|    ___________________       ___________________       ___________________       ___________________                              |");  
		 System.out.println("\t   "+"|   |6.M2IEBT           |     |7.MOMENTUM IN-EAR  |     |8.IE 80 S BT       |     |                   |                             |");  
		 System.out.println("\t   "+"|   |-------------------|     |-------------------|     |-------------------|     |                   |                             |");  
		 System.out.println("\t   "+"|   |.WIRELESS          |     |.WIRELESS          |     |.WIRELESS          |     |        9.         |                             |");  
		 System.out.println("\t   "+"|   |.Version: 5.2      |     |.Version: 5.2      |     |.Version: 5.2      |     |                   |                             |");  
		 System.out.println("\t   "+"|   |.Range : 15meters  |     |.Noise Cancellation|     |.Noise Cancellation|     |       EXIT        |                             |");  
		 System.out.println("\t   "+"|   |.TalkTime:7Hours   |     |.TalkTime:10Hours  |     |.TalkTime:15Hours  |     |     ---------     |                             |");  
		 System.out.println("\t   "+"|   |.StandbyTime:300Hrs|     |.StandbyTime:300Hrs|     |.StandbyTime:350Hrs|     |                   |                             |");  
		 System.out.println("\t   "+"|   |.Inline Controls   |     |.Chargingtime:1Hr  |     |.Chargingtime:1Hrs |     |                   |                             |");  
		 System.out.println("\t   "+"|   |.PRICE : 9599/-    |     |.PRICE : 19990/-   |     |.PRICE : 32999/-   |     |                   |                             |");  
		 System.out.println("\t   "+"|   |___________________|     |___________________|     |___________________|     |___________________|                             |");  
		 System.out.println("\t   "+"|                                                                                                                                   |");    
		 System.out.println("\t   "+"|___________________________________________________________________________________________________________________________________|");
		 System.out.println(RESET); sennheiser5k30kswitch();
	}
	public static void sennheiser5k30kswitch()
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
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SENNHEISER CX350BT";ob1[i++]=4990;
					          System.out.print("Do you want to continue shopping in this Budget (Below 30K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
			 		  do
			 		  {
			 			char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
			 			switch(c1)	
						{
						case 'y':sennheiser5k30k(); b=false; break; // MADE CHANGES HEREE
						case 'n':sennheisermenu(); b=false; break; // MADE CHANGES HEREE
			 			default : System.out.print("Please enter valid option: ");
						}
			 		  }while(b==true);  break;
					 case 'n':
						 {
							 System.out.print("Do you want to see another model in this Budget (Below 30K) [y/n or Y/N]:");  //MADE CHANGES HERE
								do
								{
									char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								switch(c1)	
								{
								case 'y':sennheiser5k30k(); b=false; break;
								case 'n':
									{
										System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
										do 
										{
											char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
											switch(c2)
											{
											case 'y': sennheisermenu(); b=false; break;
											case 'n': neckband(); b=false; break;
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
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SENNHEISER CX 6.00BT";ob1[i++]=5399;
					 System.out.print("Do you want to continue shopping in this Budget (Below 30K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':sennheiser5k30k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':sennheisermenu(); b=false; break; // MADE CHANGES HEREE
						 default : System.out.print("Please enter valid option: ");
						 }
					 }while(b==true);  break;
					 case 'n':
					 {
						 System.out.print("Do you want to see another model in this Budget (Below 30K) [y/n or Y/N]:");  //MADE CHANGES HERE
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':sennheiser5k30k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': sennheisermenu(); b=false; break;
									 case 'n': neckband(); b=false; break;
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
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SENNHEISER MOMENTUM FREE";ob1[i++]=5799;
					 System.out.print("Do you want to continue shopping in this Budget (Below 30K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':sennheiser5k30k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':sennheisermenu(); b=false; break; // MADE CHANGES HEREE
						 default : System.out.print("Please enter valid option: ");
						 }
					 }while(b==true);  break;
					 case 'n':
					 {
						 System.out.print("Do you want to see another model in this Budget (Below 30K) [y/n or Y/N]:");  //MADE CHANGES HERE
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':sennheiser5k30k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': sennheisermenu(); b=false; break;
									 case 'n': neckband(); b=false; break;
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
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SENNHEISER CX 7.00BT";ob1[i++]=7299;
					 System.out.print("Do you want to continue shopping in this Budget (Below 30K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':sennheiser5k30k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':sennheisermenu(); b=false; break; // MADE CHANGES HEREE
						 default : System.out.print("Please enter valid option: ");
						 }
					 }while(b==true);  break;
					 case 'n':
					 {
						 System.out.print("Do you want to see another model in this Budget (Below 30K) [y/n or Y/N]:");  //MADE CHANGES HERE
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':sennheiser5k30k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': sennheisermenu(); b=false; break;
									 case 'n': neckband(); b=false; break;
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
				 System.out.print("Do you want to add it to cart: [y/n or Y/N]:");
				 do
				 {
					 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					 switch(c)
					 {
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SENNHEISER CX SPORT";ob1[i++]=9990;
					 System.out.print("Do you want to continue shopping in this Budget (Below 30K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':sennheiser5k30k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':sennheisermenu(); b=false; break; // MADE CHANGES HEREE
						 default : System.out.print("Please enter valid option: ");
						 }
					 }while(b==true);  break;
					 case 'n':
					 {
						 System.out.print("Do you want to see another model in this Budget (Below 30K) [y/n or Y/N]:");  //MADE CHANGES HERE
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':sennheiser5k30k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': sennheisermenu(); b=false; break;
									 case 'n': neckband(); b=false; break;
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
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SENNHEISER M2IEBT";ob1[i++]=9599;
					 System.out.print("Do you want to continue shopping in this Budget (Below 30K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':sennheiser5k30k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':sennheisermenu(); b=false; break; // MADE CHANGES HEREE
						 default : System.out.print("Please enter valid option: ");
						 }
					 }while(b==true);  break;
					 case 'n':
					 {
						 System.out.print("Do you want to see another model in this Budget (Below 30K) [y/n or Y/N]:");  //MADE CHANGES HERE
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':sennheiser5k30k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': sennheisermenu(); b=false; break;
									 case 'n': neckband(); b=false; break;
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
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SENNHEISER MOMENTUM IN-EAR";ob1[i++]=19990;
					 System.out.print("Do you want to continue shopping in this Budget (Below 30K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':sennheiser5k30k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':sennheisermenu(); b=false; break; // MADE CHANGES HEREE
						 default : System.out.print("Please enter valid option: ");
						 }
					 }while(b==true);  break;
					 case 'n':
					 {
						 System.out.print("Do you want to see another model in this Budget (Below 30K) [y/n or Y/N]:");  //MADE CHANGES HERE
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':sennheiser5k30k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': sennheisermenu(); b=false; break;
									 case 'n': neckband(); b=false; break;
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
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SENNHEISER IE 80 S BT";ob1[i++]=32999;
					 System.out.print("Do you want to continue shopping in this Budget (Below 30K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':sennheiser5k30k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':sennheisermenu(); b=false; break; // MADE CHANGES HEREE
						 default : System.out.print("Please enter valid option: ");
						 }
					 }while(b==true);  break;
					 case 'n':
					 {
						 System.out.print("Do you want to see another model in this Budget (Below 30K) [y/n or Y/N]:");  //MADE CHANGES HERE
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':sennheiser5k30k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': sennheisermenu(); b=false; break;
									 case 'n': neckband(); b=false; break;
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
	public static void zebronicsmenu()
	{ System.out.println(RESET);
		 System.out.println("\t\t\t\t\t\t"+"                         ZEBRONICS               ");  
		 System.out.println("\t\t\t\t\t\t"+"                      ----------------             ");  
		 System.out.println("\t\t\t\t\t\t"+"                      1.Between 1K - 4k         ");  
		 System.out.println("\t\t\t\t\t\t"+"                      2.EXIT FROM ZEBRONICS                      ");
		 System.out.println(RESET); zebronicsswitch();
	}
	public static void zebronicsswitch()
	{
		System.out.print("PLEASE ENTER THE PRICE RANGE  :");
		 
		 do
		 {
			int p=sc.nextInt();
			switch(p) 
			{
			case 1: zebronics1k4k(); b=false; break;
			case 2: neckband(); b=false; break;
		    default:
		    	{
		    		System.out.println("Please enter valid option.");
		    		zebronicsmenu(); 
		    	}
			}
		 }while(b==true);
	}
	public static void zebronics1k4k()
	{ System.out.println(RESET);
		 System.out.println("\t   "+" ___________________________________________________________________________________________________________________________________");  
		 System.out.println("\t   "+"|                                                                                                                                   |");  
		 System.out.println("\t   "+"|    ___________________       ___________________       ___________________       ___________________       ___________________    |");  
		 System.out.println("\t   "+"|   |1.ZEB-EVOLVE       |     |2.ZEB-SYMPHONY     |     |3.ZEB-FASHION      |     |4.ZEB-YOGA 90 PRO  |     |5.ZEB BH330        |   |");  
		 System.out.println("\t   "+"|   |-------------------|     |-------------------|     |-------------------|     |-------------------|     |-------------------|   |");  
		 System.out.println("\t   "+"|   |.WIRELESS          |     |.WIRELESS          |     |.WIRELESS          |     |.WIRELESS          |     |.WIRELESS          |   |");  
		 System.out.println("\t   "+"|   |.Version: 4.2      |     |.Version: 5.0      |     |.Version: 4.2      |     |.Version: 5.0      |     |.Version: 5.2      |   |");  
		 System.out.println("\t   "+"|   |.Inline Controls   |     |.Inline Controls   |     |.Range: 10 meters  |     |.Active Pairing    |     |.Inline Controls   |   |");  
		 System.out.println("\t   "+"|   |.In Ear            |     |.TalkTime:13Hours  |     |.TalkTime:3.5Hours |     |.TalkTime:9Hours   |     |.TalkTime:8Hours   |   |");  
		 System.out.println("\t   "+"|   |.StandbyTime:100Hrs|     |.StandbyTime:15Days|     |.Inline Controls   |     |.Range: 10 meters  |     |.Noise Cancellation|   |");  
		 System.out.println("\t   "+"|   |.Chargingtime:2Hrs |     |.Chargingtime:2Hrs |     |.Chargingtime:2Hrs |     |.Chargingtime:1Hr  |     |.Chargingtime:2Hrs |   |");  
		 System.out.println("\t   "+"|   |.PRICE : 999/-     |     |.PRICE : 1199/-    |     |.PRICE : 1399/-    |     |.PRICE : 1699/-    |     |.PRICE : 2599/-    |   |");  
		 System.out.println("\t   "+"|   |___________________|     |___________________|     |___________________|     |___________________|     |___________________|   |");  
		 System.out.println("\t   "+"|                                                                                                                                   |");  
		 System.out.println("\t   "+"|                                                                                                                                   |");  
		 System.out.println("\t   "+"|    ___________________       ___________________       ___________________       ___________________       ___________________    |");  
		 System.out.println("\t   "+"|   |6.ZEB-JUMBO        |     |7.ZEB-YOGA N2      |     |8.ZEB-BH330        |     |9.ZEB-MONK         |     |                   |   |");  
		 System.out.println("\t   "+"|   |-------------------|     |-------------------|     |-------------------|     |-------------------|     |                   |   |");  
		 System.out.println("\t   "+"|   |.WIRELESS          |     |.WIRELESS          |     |.WIRELESS          |     |.WIRELESS          |     |       10.         |   |");  
		 System.out.println("\t   "+"|   |.Version: 5.0      |     |.Version: 5.2      |     |.Version: 5.0      |     |.Version: 5.0      |     |                   |   |");  
		 System.out.println("\t   "+"|   |.Range : 10meters  |     |.Noise Cancellation|     |.Noise Cancellation|     |.Noise Cancellation|     |       EXIT        |   |");  
		 System.out.println("\t   "+"|   |.TalkTime:6Hours   |     |.TalkTime:30Hours  |     |.Noise Isolation   |     |.TalkTime:30Hours  |     |     ---------     |   |");  
		 System.out.println("\t   "+"|   |.StandbyTime:200Hrs|     |.StandbyTime:280Hrs|     |.StandbyTime:300Hrs|     |.StandbyTime:290Hrs|     |                   |   |");  
		 System.out.println("\t   "+"|   |.Noise Cancellation|     |.Chargingtime:1Hr  |     |.Chargingtime:1Hr  |     |.Chargingtime:1Hr  |     |                   |   |");  
		 System.out.println("\t   "+"|   |.PRICE : 2999/-    |     |.PRICE : 3499/-    |     |.PRICE : 3799/-    |     |.PRICE : 3999/-    |     |                   |   |");  
		 System.out.println("\t   "+"|   |___________________|     |___________________|     |___________________|     |___________________|     |___________________|   |");  
		 System.out.println("\t   "+"|                                                                                                                                   |");    
		 System.out.println("\t   "+"|___________________________________________________________________________________________________________________________________|");
		 System.out.println(RESET); 
		 zebronics1k4kswitch();
	}
	public static void zebronics1k4kswitch()
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
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="ZEBRONICS EVOLVE";ob1[i++]=999;
					          System.out.print("Do you want to continue shopping in this Budget (Below 4K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
			 		  do
			 		  {
			 			char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
			 			switch(c1)	
						{
						case 'y':zebronics1k4k(); b=false; break; // MADE CHANGES HEREE
						case 'n':zebronicsmenu(); b=false; break; // MADE CHANGES HEREE
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
								case 'y':zebronics1k4k(); b=false; break;
								case 'n':
									{
										System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
										do 
										{
											char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
											switch(c2)
											{
											case 'y': zebronicsmenu(); b=false; break;
											case 'n': neckband(); b=false; break;
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
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="ZEBRONICS SYMPHONY";ob1[i++]=1199;
					 System.out.print("Do you want to continue shopping in this Budget (Below 4K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':zebronics1k4k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':zebronicsmenu(); b=false; break; // MADE CHANGES HEREE
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
							 case 'y':zebronics1k4k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': zebronicsmenu(); b=false; break;
									 case 'n': neckband(); b=false; break;
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
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="ZEBRONICS FASHION";ob1[i++]=1399;
					 System.out.print("Do you want to continue shopping in this Budget (Below 4K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':zebronics1k4k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':zebronicsmenu(); b=false; break; // MADE CHANGES HEREE
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
							 case 'y':zebronics1k4k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': zebronicsmenu(); b=false; break;
									 case 'n': neckband(); b=false; break;
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
					 case 'y':System.out.println("Your Item is added to cart .");  ob[i]="ZEBRONICS YOGA 90 PRO";ob1[i++]=1699;
					 System.out.print("Do you want to continue shopping in this Budget (Below 4K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':zebronics1k4k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':zebronicsmenu(); b=false; break; // MADE CHANGES HEREE
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
							 case 'y':zebronics1k4k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': zebronicsmenu(); b=false; break;
									 case 'n': neckband(); b=false; break;
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
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="ZEBRONICS BH330";ob1[i++]=2599;
					 System.out.print("Do you want to continue shopping in this Budget (Below 4K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':zebronics1k4k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':zebronicsmenu(); b=false; break; // MADE CHANGES HEREE
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
							 case 'y':zebronics1k4k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': zebronicsmenu(); b=false; break;
									 case 'n': neckband(); b=false; break;
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
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="ZEBRONICS JUMBO";ob1[i++]=2999;
					 System.out.print("Do you want to continue shopping in this Budget (Below 4K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':zebronics1k4k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':zebronicsmenu(); b=false; break; // MADE CHANGES HEREE
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
							 case 'y':zebronics1k4k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': zebronicsmenu(); b=false; break;
									 case 'n': neckband(); b=false; break;
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
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="ZEBRONICS YOGA N2";ob1[i++]=3499;
					 System.out.print("Do you want to continue shopping in this Budget (Below 4K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':zebronics1k4k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':zebronicsmenu(); b=false; break; // MADE CHANGES HEREE
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
							 case 'y':zebronics1k4k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': zebronicsmenu(); b=false; break;
									 case 'n': neckband(); b=false; break;
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
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="ZEBRONICS BH330";ob1[i++]=3799;
					 System.out.print("Do you want to continue shopping in this Budget (Below 4K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':zebronics1k4k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':zebronicsmenu(); b=false; break; // MADE CHANGES HEREE
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
							 case 'y':zebronics1k4k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': zebronicsmenu(); b=false; break;
									 case 'n': neckband(); b=false; break;
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
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="ZEBRONICS MONK";ob1[i++]=3999;
					 System.out.print("Do you want to continue shopping in this Budget (Below 4K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':zebronics1k4k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':zebronicsmenu(); b=false; break; // MADE CHANGES HEREE
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
							 case 'y':zebronics1k4k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': zebronicsmenu(); b=false; break;
									 case 'n': neckband(); b=false; break;
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
			 case 10:  zebronicsmenu(); b=false; break;
			 default:  System.out.print("Please enter valid option:");
			 }
		 }while(b==true); 
	}
	public static void boatmenu()
	{ System.out.println(RESET);
		System.out.println("\t\t\t\t\t\t"+"                             BOAT               ");  
		 System.out.println("\t\t\t\t\t\t"+"                      ----------------             ");  
		 System.out.println("\t\t\t\t\t\t"+"                      1.Between 1K - 4k         ");  
		 System.out.println("\t\t\t\t\t\t"+"                      2.EXIT FROM BOAT                     ");
		 System.out.println(RESET);	 boatswitch();
	}
	public static void boatswitch()
	{
		System.out.print("PLEASE ENTER THE PRICE RANGE  :");
		 
		 do
		 {
			int p=sc.nextInt();
			switch(p) 
			{
			case 1: boat1k4k(); b=false; break;
			case 2: neckband(); b=false; break;
		    default:
		    	{
		    		System.out.println("Please enter valid option.");
		    		boatmenu(); 
		    	}
			}
		 }while(b==true);
	}
	public static void boat1k4k()
	{ System.out.println(RESET);
		 System.out.println("\t   "+" ___________________________________________________________________________________________________________________________________");  
		 System.out.println("\t   "+"|                                                                                                                                   |");  
		 System.out.println("\t   "+"|    ___________________       ___________________       ___________________       ___________________       ___________________    |");  
		 System.out.println("\t   "+"|   |1.ROCKERZ 525      |     |2.ROCKERZ 238 PRO  |     |3.ROCKERZ 195 PRO  |     |4.ROCKERZ 261      |     |5.ROCKERZ 205 PRO  |   |");  
		 System.out.println("\t   "+"|   |-------------------|     |-------------------|     |-------------------|     |-------------------|     |-------------------|   |");  
		 System.out.println("\t   "+"|   |.WIRELESS          |     |.WIRELESS          |     |.WIRELESS          |     |.WIRELESS          |     |.WIRELESS          |   |");  
		 System.out.println("\t   "+"|   |.Version: 5.0      |     |.Version: 5.0      |     |.Version: 5.0      |     |.Version: 5.0      |     |.Version: 5.2      |   |");  
		 System.out.println("\t   "+"|   |.Inline Controls   |     |.Range:  10 meters |     |.Range: 10 meters  |     |.Inline Controls   |     |.Inline Controls   |   |");  
		 System.out.println("\t   "+"|   |.In Ear Canalphone |     |.TalkTime:13Hours  |     |.TalkTime:15 Hours |     |.TalkTime:8Hours   |     |.TalkTime:8Hours   |   |");  
		 System.out.println("\t   "+"|   |.StandbyTime:85hrs |     |.StandbyTime:100hrs|     |.Noise Cancellation|     |.Range: 10 meters  |     |.Noise Cancellation|   |");  
		 System.out.println("\t   "+"|   |.Chargingtime:2Hrs |     |.Chargingtime:2Hrs |     |.Chargingtime:2Hrs |     |.Chargingtime:2Hrs |     |.Chargingtime:2Hrs |   |");  
		 System.out.println("\t   "+"|   |.PRICE : 1099/-    |     |.PRICE : 1199/-    |     |.PRICE : 1499/-    |     |.PRICE : 1699/-    |     |.PRICE : 2599/-    |   |");  
		 System.out.println("\t   "+"|   |___________________|     |___________________|     |___________________|     |___________________|     |___________________|   |");  
		 System.out.println("\t   "+"|                                                                                                                                   |");  
		 System.out.println("\t   "+"|                                                                                                                                   |");  
		 System.out.println("\t   "+"|    ___________________       ___________________       ___________________       ___________________       ___________________    |");  
		 System.out.println("\t   "+"|   |6.ROCKERZ 255 MAX  |     |7.ROCKERZ 230      |     |8.ROCKERZ 295 V2   |     |9.ROCKERZ 385 PRO  |     |                   |   |");  
		 System.out.println("\t   "+"|   |-------------------|     |-------------------|     |-------------------|     |-------------------|     |                   |   |");  
		 System.out.println("\t   "+"|   |.WIRELESS          |     |.WIRELESS          |     |.WIRELESS          |     |.WIRELESS          |     |       10.         |   |");  
		 System.out.println("\t   "+"|   |.Version: 5.3      |     |.Version: 5.3      |     |.Version: 5.0      |     |.Version: 5.3      |     |                   |   |");  
		 System.out.println("\t   "+"|   |.Range : 10meters  |     |.Noise Cancellation|     |.Noise Cancellation|     |.Noise Cancellation|     |       EXIT        |   |");  
		 System.out.println("\t   "+"|   |.TalkTime:60Hours  |     |.TalkTime:30Hours  |     |.TalkTime:12Hours  |     |.TalkTime:30Hours  |     |     ---------     |   |");  
		 System.out.println("\t   "+"|   |.StandbyTime:200Hrs|     |.StandbyTime:280Hrs|     |.StandbyTime:300Hrs|     |.StandbyTime:290Hrs|     |                   |   |");  
		 System.out.println("\t   "+"|   |.Chargingtime:1Hr  |     |.Chargingtime:1Hr  |     |.Chargingtime:1Hr  |     |.Chargingtime:1Hr  |     |                   |   |");  
		 System.out.println("\t   "+"|   |.PRICE : 2999/-    |     |.PRICE : 3499/-    |     |.PRICE : 3799/-    |     |.PRICE : 3999/-    |     |                   |   |");  
		 System.out.println("\t   "+"|   |___________________|     |___________________|     |___________________|     |___________________|     |___________________|   |");  
		 System.out.println("\t   "+"|                                                                                                                                   |");    
		 System.out.println("\t   "+"|___________________________________________________________________________________________________________________________________|");
		 System.out.println(RESET); 
		 boatswitch1k4k();
	}
	public static void boatswitch1k4k()
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
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="BOAT ROCKERZ 525";ob1[i++]=1099;
					          System.out.print("Do you want to continue shopping in this Budget (Below 4K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
			 		  do
			 		  {
			 			char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
			 			switch(c1)	
						{
						case 'y':boat1k4k(); b=false; break; // MADE CHANGES HEREE
						case 'n':boatmenu(); b=false; break; // MADE CHANGES HEREE
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
								case 'y':boat1k4k(); b=false; break;
								case 'n':
									{
										System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
										do 
										{
											char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
											switch(c2)
											{
											case 'y': boatmenu(); b=false; break;
											case 'n': neckband(); b=false; break;
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
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="BOAT ROCKERZ 238 PRO";ob1[i++]=1199;
					 System.out.print("Do you want to continue shopping in this Budget (Below 4K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':boat1k4k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':boatmenu(); b=false; break; // MADE CHANGES HEREE
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
							 case 'y':boat1k4k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': boatmenu(); b=false; break;
									 case 'n': neckband(); b=false; break;
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
				 System.out.print("Do you want to add it to cart: [y/n or Y/N]:");
				 do
				 {
					 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					 switch(c)
					 {
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="BOAT ROCKERZ 195 PRO";ob1[i++]=1499;
					 System.out.print("Do you want to continue shopping in this Budget (Below 4K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':boat1k4k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':boatmenu(); b=false; break; // MADE CHANGES HEREE
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
							 case 'y':boat1k4k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': boatmenu(); b=false; break;
									 case 'n': neckband(); b=false; break;
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
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="BOAT ROCKERZ 261";ob1[i++]=1699;
					 System.out.print("Do you want to continue shopping in this Budget (Below 4K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':boat1k4k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':boatmenu(); b=false; break; // MADE CHANGES HEREE
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
							 case 'y':boat1k4k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': boatmenu(); b=false; break;
									 case 'n': neckband(); b=false; break;
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
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="BOAT ROCKERZ 205 PRO";ob1[i++]=2599;
					 System.out.print("Do you want to continue shopping in this Budget (Below 4K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':boat1k4k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':boatmenu(); b=false; break; // MADE CHANGES HEREE
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
							 case 'y':boat1k4k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': boatmenu(); b=false; break;
									 case 'n': neckband(); b=false; break;
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
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="BOAT ROCKERZ 255 MAX";ob1[i++]=2999;
					 System.out.print("Do you want to continue shopping in this Budget (Below 4K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':boat1k4k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':boatmenu(); b=false; break; // MADE CHANGES HEREE
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
							 case 'y':boat1k4k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': boatmenu(); b=false; break;
									 case 'n': neckband(); b=false; break;
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
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="BOAT ROCKERZ 230";ob1[i++]=3499;
					 System.out.print("Do you want to continue shopping in this Budget (Below 4K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':boat1k4k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':boatmenu(); b=false; break; // MADE CHANGES HEREE
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
							 case 'y':boat1k4k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': boatmenu(); b=false; break;
									 case 'n': neckband(); b=false; break;
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
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="BOAT ROCKERZ 295 V2";ob1[i++]=3799;
					 System.out.print("Do you want to continue shopping in this Budget (Below 4K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':boat1k4k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':boatmenu(); b=false; break; // MADE CHANGES HEREE
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
							 case 'y':boat1k4k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': boatmenu(); b=false; break;
									 case 'n': neckband(); b=false; break;
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
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="BOAT ROCKERZ 385 PRO";ob1[i++]=3999;
					 System.out.print("Do you want to continue shopping in this Budget (Below 4K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':boat1k4k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':boatmenu(); b=false; break; // MADE CHANGES HEREE
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
							 case 'y':boat1k4k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': boatmenu(); b=false; break;
									 case 'n': neckband(); b=false; break;
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
	public static void jblmenu()
	{ System.out.println(RESET);
		 System.out.println("\t\t\t\t\t\t"+"                             JBL               ");  
		 System.out.println("\t\t\t\t\t\t"+"                      ------------------      ");  
		 System.out.println("\t\t\t\t\t\t"+"                       1.Between 2K -10k      ");  
		 System.out.println("\t\t\t\t\t\t"+"                       2.EXIT FROM JBL               ");
		 System.out.println(RESET); jblswitch();
	}
	public static void jblswitch()
	{
		System.out.print("PLEASE ENTER THE PRICE RANGE  :");
		 
		 do
		 {
			int p=sc.nextInt();
			switch(p) 
			{
			case 1: jbl2k10k(); b=false; break;
			case 2: neckband(); b=false; break;
		    default:
		    	{
		    		System.out.println("Please enter valid option.");
		    		jblmenu(); 
		    	}
			}
		 }while(b==true);
	}
	public static void jbl2k10k()
	{ System.out.println(RESET);
		 System.out.println("\t   "+" ___________________________________________________________________________________________________________________________________");  
		 System.out.println("\t   "+"|                                                                                                                                   |");  
		 System.out.println("\t   "+"|    ___________________       ___________________       ___________________       ___________________       ___________________    |");  
		 System.out.println("\t   "+"|   |1.DUET ARC         |     |2.LIVE 25BT        |     |3.TUNE 215BT       |     |4.TUNE 115BT       |     |5.EVEREST 110      |   |");  
		 System.out.println("\t   "+"|   |-------------------|     |-------------------|     |-------------------|     |-------------------|     |-------------------|   |");  
		 System.out.println("\t   "+"|   |.WIRELESS          |     |.WIRELESS          |     |.WIRELESS          |     |.WIRELESS          |     |.WIRELESS          |   |");  
		 System.out.println("\t   "+"|   |.Version: 5.0      |     |.Version: 5.0      |     |.Version: 5.0      |     |.Version: 5.0      |     |.Version: 5.2      |   |");  
		 System.out.println("\t   "+"|   |.Inline Controls   |     |.Noise Cancellation|     |.Range: 10 meters  |     |.Inline Controls   |     |.Noise Cancellation|   |");  
		 System.out.println("\t   "+"|   |.In Ear Canalphone |     |.TalkTime:8Hours   |     |.TalkTime:15 Hours |     |.TalkTime:8Hours   |     |.TalkTime:15Hours  |   |");  
		 System.out.println("\t   "+"|   |.TalkTime:10hrs    |     |.StandbyTime:100hrs|     |.Noise Cancellation|     |.Noise Isolation   |     |.Noise Isolation   |   |");  
		 System.out.println("\t   "+"|   |.Chargingtime:2Hrs |     |.Chargingtime:2Hrs |     |.Chargingtime:1Hrs |     |.Chargingtime:1Hrs |     |.Chargingtime:2Hrs |   |");  
		 System.out.println("\t   "+"|   |.PRICE : 2799/-    |     |.PRICE : 3299/-    |     |.PRICE : 3999/-    |     |.PRICE : 4699/-    |     |.PRICE : 9499/-    |   |");  
		 System.out.println("\t   "+"|   |___________________|     |___________________|     |___________________|     |___________________|     |___________________|   |");  
		 System.out.println("\t   "+"|                                                                                                                                   |");  
		 System.out.println("\t   "+"|                                                                                                                                   |");  
		 System.out.println("\t   "+"|                                            ___________________       ___________________                                          |");  
		 System.out.println("\t   "+"|                                           |6.UNDER ARMOR      |     |                   |                                         |");  
		 System.out.println("\t   "+"|                                           |-------------------|     |                   |                                         |");  
		 System.out.println("\t   "+"|                                           |.WIRELESS          |     |        7.         |                                         |");  
		 System.out.println("\t   "+"|                                           |.Version: 5.3      |     |                   |                                         |");  
		 System.out.println("\t   "+"|                                           |.Noise Cancellation|     |       EXIT        |                                         |");  
		 System.out.println("\t   "+"|                                           |.TalkTime:15Hours  |     |   -------------   |                                         |");  
		 System.out.println("\t   "+"|                                           |.StandbyTime:200Hrs|     |                   |                                         |");  
		 System.out.println("\t   "+"|                                           |.Chargingtime:1Hr  |     |                   |                                         |");  
		 System.out.println("\t   "+"|                                           |.PRICE : 9999/-    |     |                   |                                         |");  
		 System.out.println("\t   "+"|                                           |___________________|     |___________________|                                         |");  
		 System.out.println("\t   "+"|                                                                                                                                   |");    
		 System.out.println("\t   "+"|___________________________________________________________________________________________________________________________________|");
		 
		 System.out.println(RESET);	jblswitch2k10k();
	}
	public static void jblswitch2k10k()
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
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="JBL DUET ARC";ob1[i++]=2799;
					          System.out.print("Do you want to continue shopping in this Budget (Below 10K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
			 		  do
			 		  {
			 			char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
			 			switch(c1)	
						{
						case 'y':jbl2k10k(); b=false; break; // MADE CHANGES HEREE
						case 'n':jblmenu(); b=false; break; // MADE CHANGES HEREE
			 			default : System.out.print("Please enter valid option: ");
						}
			 		  }while(b==true);  break;
					 case 'n':
						 {
							 System.out.print("Do you want to see another model in this Budget (Below 10K) [y/n or Y/N]:");  //MADE CHANGES HERE
								do
								{
									char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								switch(c1)	
								{
								case 'y':jbl2k10k(); b=false; break;
								case 'n':
									{
										System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
										do 
										{
											char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
											switch(c2)
											{
											case 'y': jblmenu(); b=false; break;
											case 'n': neckband(); b=false; break;
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
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="JBL LIVE 25BT";ob1[i++]=3299;
					 System.out.print("Do you want to continue shopping in this Budget (Below 10K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':jbl2k10k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':jblmenu(); b=false; break; // MADE CHANGES HEREE
						 default : System.out.print("Please enter valid option: ");
						 }
					 }while(b==true);  break;
					 case 'n':
					 {
						 System.out.print("Do you want to see another model in this Budget (Below 10K) [y/n or Y/N]:");  //MADE CHANGES HERE
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':jbl2k10k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': jblmenu(); b=false; break;
									 case 'n': neckband(); b=false; break;
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
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="JBL TUNE 215BT";ob1[i++]=3999;
					 System.out.print("Do you want to continue shopping in this Budget (Below 10K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':jbl2k10k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':jblmenu(); b=false; break; // MADE CHANGES HEREE
						 default : System.out.print("Please enter valid option: ");
						 }
					 }while(b==true);  break;
					 case 'n':
					 {
						 System.out.print("Do you want to see another model in this Budget (Below 10K) [y/n or Y/N]:");  //MADE CHANGES HERE
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':jbl2k10k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': jblmenu(); b=false; break;
									 case 'n': neckband(); b=false; break;
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
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="JBL TUNE 115BT";ob1[i++]=4699;
					 System.out.print("Do you want to continue shopping in this Budget (Below 10K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':jbl2k10k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':jblmenu(); b=false; break; // MADE CHANGES HEREE
						 default : System.out.print("Please enter valid option: ");
						 }
					 }while(b==true);  break;
					 case 'n':
					 {
						 System.out.print("Do you want to see another model in this Budget (Below 10K) [y/n or Y/N]:");  //MADE CHANGES HERE
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':jbl2k10k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': jblmenu(); b=false; break;
									 case 'n': neckband(); b=false; break;
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
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="JBL EVEREST 110";ob1[i++]=9499;
					 System.out.print("Do you want to continue shopping in this Budget (Below 10K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':jbl2k10k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':jblmenu(); b=false; break; // MADE CHANGES HEREE
						 default : System.out.print("Please enter valid option: ");
						 }
					 }while(b==true);  break;
					 case 'n':
					 {
						 System.out.print("Do you want to see another model in this Budget (Below 10K) [y/n or Y/N]:");  //MADE CHANGES HERE
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':jbl2k10k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': jblmenu(); b=false; break;
									 case 'n': neckband(); b=false; break;
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
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="JBL UNDER ARMOR";ob1[i++]=9999;
					 System.out.print("Do you want to continue shopping in this Budget (Below 10K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':jbl2k10k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':jblmenu(); b=false; break; // MADE CHANGES HEREE
						 default : System.out.print("Please enter valid option: ");
						 }
					 }while(b==true);  break;
					 case 'n':
					 {
						 System.out.print("Do you want to see another model in this Budget (Below 10K) [y/n or Y/N]:");  //MADE CHANGES HERE
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':jbl2k10k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': jblmenu(); b=false; break;
									 case 'n': neckband(); b=false; break;
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
	
	public static void boultaudiomenu()
	{ System.out.println(RESET);
		 System.out.println("\t\t\t\t\t\t"+"                         BOULT AUDIO         ");  
		 System.out.println("\t\t\t\t\t\t"+"                      ------------------      ");  
		 System.out.println("\t\t\t\t\t\t"+"                       1. Below 2K       ");  
		 System.out.println("\t\t\t\t\t\t"+"                       2. EXIT FROM BOULT               ");
		 System.out.println(RESET); boultaudioswitch();
	}
	public static void boultaudioswitch()
	{
		System.out.print("PLEASE ENTER THE PRICE RANGE  :");
		 
		 do
		 {
			int p=sc.nextInt();
			switch(p) 
			{
			case 1: boultaudio1k2k(); b=false; break;
			case 2: neckband(); b=false; break;
		    default:
		    	{
		    		System.out.println("Please enter valid option.");
		    		boultaudiomenu(); 
		    	}
			}
		 }while(b==true);
	}
	public static void boultaudio1k2k()
	{ System.out.println(RESET);
		 System.out.println("\t   "+" ___________________________________________________________________________________________________________________________________");  
		 System.out.println("\t   "+"|                                                                                                                                   |");  
		 System.out.println("\t   "+"|    ___________________       ___________________       ___________________       ___________________       ___________________    |");  
		 System.out.println("\t   "+"|   |1.PROBASS YCHARGE  |     |2.X CHARGE         |     |3.PROBASS ESCAPE   |     |4.PROBASS CURVE-X  |     |5.PROBASS ZCHARGE  |   |");  
		 System.out.println("\t   "+"|   |-------------------|     |-------------------|     |-------------------|     |-------------------|     |-------------------|   |");  
		 System.out.println("\t   "+"|   |.WIRELESS          |     |.WIRELESS          |     |.WIRELESS          |     |.WIRELESS          |     |.WIRELESS          |   |");  
		 System.out.println("\t   "+"|   |.Version: 5.0      |     |.Version: 5.0      |     |.Version: 5.0      |     |.Version: 5.0      |     |.Version: 5.2      |   |");  
		 System.out.println("\t   "+"|   |.Noise Cancellation|     |.Inline Controls   |     |.Range: 10 meters  |     |.Inline Controls   |     |.Noise Cancellation|   |");  
		 System.out.println("\t   "+"|   |.Foldable Design   |     |.TalkTime:10Hours  |     |.TalkTime:15 Hours |     |.TalkTime:12Hours  |     |.TalkTime:15Hours  |   |");  
		 System.out.println("\t   "+"|   |.TalkTime:10hrs    |     |.StandbyTime:100hrs|     |.Inline Controls   |     |.Active Pairing    |     |.Noise Isolation   |   |");  
		 System.out.println("\t   "+"|   |.Chargingtime:2Hrs |     |.Chargingtime:2Hrs |     |.Chargingtime:1Hrs |     |.Chargingtime:1Hrs |     |.Chargingtime:2Hrs |   |");  
		 System.out.println("\t   "+"|   |.PRICE : 1199/-    |     |.PRICE : 1299/-    |     |.PRICE : 1499/-    |     |.PRICE : 1699/-    |     |.PRICE : 1799/-    |   |");  
		 System.out.println("\t   "+"|   |___________________|     |___________________|     |___________________|     |___________________|     |___________________|   |");  
		 System.out.println("\t   "+"|                                                                                                                                   |");  
		 System.out.println("\t   "+"|                                                                                                                                   |");  
		 System.out.println("\t   "+"|                              ___________________       ___________________       ___________________                              |");  
		 System.out.println("\t   "+"|                             |6.PROBASS FLOW X   |     |7.PROBASS BUSTER   |     |                   |                             |");  
		 System.out.println("\t   "+"|                             |-------------------|     |-------------------|     |                   |                             |");  
		 System.out.println("\t   "+"|                             |.WIRELESS          |     |.WIRELESS          |     |        8.         |                             |");  
		 System.out.println("\t   "+"|                             |.Version: 5.2      |     |.Version: 5.3      |     |                   |                             |");  
		 System.out.println("\t   "+"|                             |.Noise Cancellation|     |.Noise Isolation   |     |       EXIT        |                             |");  
		 System.out.println("\t   "+"|                             |.TalkTime:10Hours  |     |.TalkTime:15Hours  |     |   -------------   |                             |");  
		 System.out.println("\t   "+"|                             |.StandbyTime:250Hrs|     |.StandbyTime:300Hrs|     |                   |                             |");  
		 System.out.println("\t   "+"|                             |.Chargingtime:1Hr  |     |.Chargingtime:1Hr  |     |                   |                             |");  
		 System.out.println("\t   "+"|                             |.PRICE : 1899/-    |     |.PRICE : 1999/-    |     |                   |                             |");  
		 System.out.println("\t   "+"|                             |___________________|     |___________________|     |___________________|                             |");  
		 System.out.println("\t   "+"|                                                                                                                                   |");    
		 System.out.println("\t   "+"|___________________________________________________________________________________________________________________________________|");
		 
		 System.out.println(RESET);	 boultaudioswitch1k2k();
	}
	public static void boultaudioswitch1k2k()
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
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="BOULT AUDIO PROBASS YCHARGE";ob1[i++]=1199;
					          System.out.print("Do you want to continue shopping in this Budget (Below 2K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
			 		  do
			 		  {
			 			char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
			 			switch(c1)	
						{
						case 'y':boultaudio1k2k(); b=false; break; // MADE CHANGES HEREE
						case 'n':boultaudiomenu(); b=false; break; // MADE CHANGES HEREE
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
								case 'y':boultaudio1k2k(); b=false; break;
								case 'n':
									{
										System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
										do 
										{
											char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
											switch(c2)
											{
											case 'y': boultaudiomenu(); b=false; break;
											case 'n': neckband(); b=false; break;
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
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="BOULT AUDIO X CHARGE";ob1[i++]=1299;
					 System.out.print("Do you want to continue shopping in this Budget (Below 2K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':boultaudio1k2k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':boultaudiomenu(); b=false; break; // MADE CHANGES HEREE
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
							 case 'y':boultaudio1k2k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': boultaudiomenu(); b=false; break;
									 case 'n': neckband(); b=false; break;
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
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="BOULT AUDIO PROBASS ESCAPE";ob1[i++]=1499;
					 System.out.print("Do you want to continue shopping in this Budget (Below 2K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':boultaudio1k2k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':boultaudiomenu(); b=false; break; // MADE CHANGES HEREE
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
							 case 'y':boultaudio1k2k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': boultaudiomenu(); b=false; break;
									 case 'n': neckband(); b=false; break;
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
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="BOULT AUDIO PROBASS CURVE-X";ob1[i++]=1699;
					 System.out.print("Do you want to continue shopping in this Budget (Below 2K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':boultaudio1k2k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':boultaudiomenu(); b=false; break; // MADE CHANGES HEREE
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
							 case 'y':boultaudio1k2k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': boultaudiomenu(); b=false; break;
									 case 'n': neckband(); b=false; break;
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
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="BOULT AUDIO PROBASS ZCHARGE";ob1[i++]=1799;
					 System.out.print("Do you want to continue shopping in this Budget (Below 2K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':boultaudio1k2k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':boultaudiomenu(); b=false; break; // MADE CHANGES HEREE
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
							 case 'y':boultaudio1k2k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': boultaudiomenu(); b=false; break;
									 case 'n': neckband(); b=false; break;
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
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="BOULT AUDIO PROBASS FLOW X";ob1[i++]=1899;
					 System.out.print("Do you want to continue shopping in this Budget (Below 2K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':boultaudio1k2k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':boultaudiomenu(); b=false; break; // MADE CHANGES HEREE
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
							 case 'y':boultaudio1k2k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': boultaudiomenu(); b=false; break;
									 case 'n': neckband(); b=false; break;
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
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="BOULT AUDIO PROBASS BUSTER";ob1[i++]=1999;
					 System.out.print("Do you want to continue shopping in this Budget (Below 2K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':boultaudio1k2k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':boultaudiomenu(); b=false; break; // MADE CHANGES HEREE
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
							 case 'y':boultaudio1k2k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': boultaudiomenu(); b=false; break;
									 case 'n': neckband(); b=false; break;
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
			
			 case 8:  boultaudiomenu(); b=false; break;
			 default:  System.out.print("Please enter valid option:");
			 }
		 }while(b==true); 
	}

//	public static void main(String[] args) throws InterruptedException 
//	{
//		neckband();
//	}

}

