package audio;

import java.util.Scanner;

import home_screen.Main_Home;

public class Sound_Bars 
{
	public static String ob[]=new String[100];
	public static float ob1[]=new float[100];
	static Scanner sc=new Scanner(System.in);private static final String RESET = "\033[0m";  // Text Reset
	static boolean b=true;static int i=0;
//    public static void main(String[] args) 
//    {
//    	Main();
//    }
    public static void Main()
    { System.out.println(RESET);
	  System.out.println("\t\t"+"    \t\t\t               __ __ __ __ __ __ __ __ __ __ __ __ __ __ __ __                    ");	
	  System.out.println("\t\t"+"    \t\t\t              /                                               /|                  ");	
	  System.out.println("\t\t"+"    \t\t\t             /                                               / |                  ");	
	  System.out.println("\t\t"+"    \t\t\t            /                    ########                   /  |                  ");	
	  System.out.println("\t\t"+"    \t\t\t           /                     #    #                    /   |                             ##    ");	
	  System.out.println("\t\t"+"    \t\t\t          /                     #    #                    /    |                           ##      ");	
	  System.out.println("\t\t"+"    \t\t\t         /                     #    #                    /     |                         ##         ");   
	  System.out.println("\t\t"+"    \t\t\t        /                     #    # #                  /      |                       ##           ");	
	  System.out.println("\t\t"+"    \t\t\t       /                     # #   ###                 /       |                     ## ##         ");	
	  System.out.println("\t\t"+"    \t\t\t      /                      ###                      /        |                   ##   ##         ");	
	  System.out.println("\t\t"+"    \t\t\t     /                                               /         |                 ##     ##          ");	
	  System.out.println("\t\t"+"    \t\t\t    /__ __ __ __ __ __ __ __ __ __ __ __ __ __ __ __/          |               ####     ##          ");	
	  System.out.println("\t\t"+"    \t\t\t   |                                                |          |             ##  ##     ##          ");	
	  System.out.println("\t\t"+"    \t\t\t   |  ####                                    ####  |          |           ##    ##     ##          ");	
	  System.out.println("\t\t"+"    \t\t\t   |  ####                                    ####  |          |                 ##     ##          ");	
	  System.out.println("\t\t"+"    \t\t\t   |  ####                                    ####  |          |                 ##     ##           ");	
	  System.out.println("\t\t"+"    \t\t\t   |                                                |          |                 ##     ##           ");	
	  System.out.println("\t\t"+"    \t\t\t   |                                                |          |                 ##     ##           ");	
	  System.out.println("\t\t"+"    \t\t\t   |        SOUND BARS AND HOME THEATRE SYSTEMS     |          |                 ##     ##     ##    ");	
	  System.out.println("\t\t"+"    \t\t\t   |       -------------------------------------    |          |                 ##     ##      ##   ");	
	  System.out.println("\t\t"+"    \t\t\t   |                                                |          |                 ##     ##      ##   ");	
	  System.out.println("\t\t"+"    \t\t\t   |              1.SOUND BARS                      |          |                 ##       ######     ");	
	  System.out.println("\t\t"+"    \t\t\t   |              2.HOME THEATRE                    |          |            ##   ##       ");	
	  System.out.println("\t\t"+"    \t\t\t   |              3.EXIT                            |          |           ##    ##        ");	
	  System.out.println("\t\t"+"    \t\t\t   |                                                |          |           ##    ##");	
	  System.out.println("\t\t"+"    \t\t\t   |                                                |          |            ######   ");	
	  System.out.println("\t\t"+"    \t\t\t   |          ############################          |          |                ");	
	  System.out.println("\t\t"+"    \t\t\t   |          #                          #          |          |                 ");	
	  System.out.println("\t\t"+"    \t\t\t   |          #         # # # #          #          |          |                 ");	
	  System.out.println("\t\t"+"    \t\t\t   |          #        #       #         #          |          |                 ");	
	  System.out.println("\t\t"+"    \t\t\t   |          #       #   # #   #        #          |          |                  ");	
	  System.out.println("\t\t"+"    \t\t\t   |          #       #  #   #  #        #          |          |                  ");	
	  System.out.println("\t\t"+"    \t\t\t   |          #       #   # #   #        #          |         /                  ");	
	  System.out.println("\t\t"+"    \t\t\t   |          #        #       #         #          |        /                    ");	
	  System.out.println("\t\t"+"    \t\t\t   |          #         # # # #          #          |       /                    ");	
	  System.out.println("\t\t"+"    \t\t\t   |          #                          #          |      /                     ");	
	  System.out.println("\t\t"+"    \t\t\t   |          ############################          |     /                      ");	
	  System.out.println("\t\t"+"    \t\t\t   |                                                |    /                       ");	
	  System.out.println("\t\t"+"    \t\t\t   |  ####                                    ####  |   /                          ");	
	  System.out.println("\t\t"+"    \t\t\t   |  ####                                    ####  |  /                          ");	
	  System.out.println("\t\t"+"    \t\t\t   |  ####                                    ####  | /                            ");	
	  System.out.println("\t\t"+"    \t\t\t   |__ __ __ __ __ __ __ __ __ __ __ __ __ __ __ __ |/                            ");	
	  
	  System.out.println(RESET);
	  Mainswitch();
	  }
    public static void Mainswitch()
    {
    	System.out.print("PLEASE SELECT YOUR REQUIREMENT [1-3] :");
    	do
    	{
    		int n=sc.nextInt();	
    		switch(n)
    		{
    		case 1: Sound(); b=false; break;
    		case 2: Home(); b=false; break;
    		case 3: Main_Home.audios(); b=false; break; 
    		default : System.out.println();
			System.out.print("\t\t\t\t\t\t\t\t     "+"PLEASE ENTER VALID OPTION..."+"\n");
			System.out.println();
    		            Main();  b=false; break;
    		}
    		
    	}while(b==true);
    }
    public static void Sound()
    { System.out.println(RESET);
    	System.out.println("\t\t\t\t\t\t"+"                SOUND BARS               ");
    	System.out.println("\t\t\t\t\t\t"+"               -------------             ");
    	System.out.println("\t\t\t\t\t\t"+"              1. Between 10K-30K         ");
    	System.out.println("\t\t\t\t\t\t"+"              2. Above 30K               ");
    	System.out.println("\t\t\t\t\t\t"+"              3. Exit from Sound Bars                   ");
    	System.out.println("\t\t\t\t\t\t"+"                                         ");
    	 System.out.println(RESET);Soundswitch();
    }
    public static void Soundswitch()
    {
    	System.out.print("PLEASE ENTER THE PRICE RANGE :");
    	do 
    	{
    		int n=sc.nextInt();
    		switch(n)
    		{
    		case 1: Sound10K30K(); b=false; break;
    		case 2: Soundabove30K(); b=false; break;
    		case 3:  Main();  b=false; break;         //MADE CHANGES
    		default : System.out.print("Please Enter correct option : ");
    		}
    	}while(b==true);
    }
    public static void  Sound10K30K()
    { System.out.println(RESET);
    	System.out.println("   ______________________________________________________________________________________________________________________________________________________");
    	System.out.println("  |                                                                                                                                                      |");
    	System.out.println("  |                 1.                                  2.                                     3.                                  4.                    |");
    	System.out.println("  |     _____________________________        _____________________________        _____________________________        ____________________________      |");
    	System.out.println("  |    |  SAMSUNG HW-R550/XL 2.1     |      |  INFINITY(JBL) W200 2.1     |      |  ZEB-JUKE BAR 9200DWS PRO   |      |  ZEB-JUKE BAR 9450 PRO     |     |");
    	System.out.println("  |    |-----------------------------|      |-----------------------------|      |-----------------------------|      |----------------------------|     |");
    	System.out.println("  |    |.Powerful bass,Game Mode     |      |.160W PPO with sound woofer  |      |.16.51cms wireless woofer    |      |.5.1 Sound Bar,Dolby Audio  |     |");
    	System.out.println("  |    |.One Remote Control,HDMI     |      |.Deep Bass Sound             |      |.Quad 6.9cm drivers          |      |.Tripple Driver SoundBar    |     |");
    	System.out.println("  |    |.Surround sound Expansion    |      |.Wireless Subwoofer          |      |.Dual 1.9cm tweeters         |      |.16.51cm Subwoofer          |     |");
    	System.out.println("  |    |.Wireless Music Expansion    |      |.Wireless Bluetooth Streaming|      |.BT,USB,AUX,HDMI ARC,Opt i/p |      |.Dual Satellite Speakers    |     |");
    	System.out.println("  |    |.Samsung Audio Remote App    |      |.Plug and Play with USB 2.0  |      |.Volume/Media controls       |      |.Multi-connectivity options |     |");
    	System.out.println("  |    |.Wireless Connection with TV |      |.Aux and OPtical Input       |      |.Remote Control              |      |.Remote Control             |     |");
    	System.out.println("  |    |. PRICE  : 10,000.00/-       |      |. PRICE  :  10,899.00/-      |      |. PRICE  :  12,499.00/-      |      |. PRICE  :  15,999.00/-     |     |");
    	System.out.println("  |    |_____________________________|      |_____________________________|      |_____________________________|      |____________________________|     |");
    	System.out.println("  |                                                                                                                                                      |");
    	System.out.println("  |                                                                                                                                                      |");
    	System.out.println("  |               5.                                   6.                                     7.                                   8.                    |");
    	System.out.println("  |     _____________________________        _____________________________        _____________________________        ____________________________      |");
    	System.out.println("  |    | SONY HT-RT TALLBOY SOUNDBAR |      |  SONNY HT-S400  SOUNDBAR    |      | SAMSUNG hw-B450/XL SOUNDBAR |      |                            |     |");
    	System.out.println("  |    |-----------------------------|      |-----------------------------|      |-----------------------------|      |                            |     |");
    	System.out.println("  |    |.5.1 channel Immersive Sound |      |.Bluetooth Connectivity      |      |.Wireless SubWoofer Included |      |                            |     |");
    	System.out.println("  |    |.High Quality Dolby Digital  |      |.X-Balanced Speaker Uniit    |      |.Extra Bass bigger Sensations|      |                            |     |");
    	System.out.println("  |    |.Wireless ( NFC & BLUETOOTH )|      |.HDMI ARC connectiviy        |      |.One Remote for Total Control|      |           EXIT             |     |");
    	System.out.println("  |    |.Tall Boy Speakers           |      |.Optical connectiviy         |      |.Bluetooth TV Connection     |      |         --------           |     |");
    	System.out.println("  |    |.USB PLUG AND PLAY           |      |.S-FORCE PRO Front Sound     |      |.Game ,NIGHT Mode            |      |                            |     |");
    	System.out.println("  |    |.HDMI ARC Connectivity       |      |.Deeper Richer Bass Sound    |      |.Optimized sound for content |      |                            |     |");
    	System.out.println("  |    |. PRICE  :  18,690.00/-      |      |. PRICE  :  21,990.00/-      |      |. PRICE  :  16,990.00/-      |      |                            |     |");
    	System.out.println("  |    |_____________________________|      |_____________________________|      |_____________________________|      |____________________________|     |");
    	System.out.println("  |                                                                                                                                                      |");
    	System.out.println("  |                                                                                                                                                      |");
    	System.out.println("  |______________________________________________________________________________________________________________________________________________________|");
    	 System.out.println(RESET);Sound10K30Kswitch();
    }
    public static void Sound10K30Kswitch()
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SAMSUNG HW-R550/XL 2.1";ob1[i++]=10000;
						          System.out.print("Do you want to continue shopping in this Budget (Below 30K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
				 		  do
				 		  {
				 			char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
				 			switch(c1)	
							{
							case 'y':Sound10K30K(); b=false; break; // MADE CHANGES HEREE
							case 'n':Sound(); b=false; break; // MADE CHANGES HEREE
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
									case 'y':Sound10K30K(); b=false; break;
									case 'n':
										{
											System.out.print("Do you want to continue in SOUNDBARS [y/n or Y/N]:"); //MADE CHANGES HERE
											do 
											{
												char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
												switch(c2)
												{
												case 'y': Sound(); b=false; break;
												case 'n': Main(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="INFINITY(JBL) W200 2.1";ob1[i++]=10899;
					   System.out.print("Do you want to continue shopping in this Budget (Below 30K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						   switch(c1)	
						   {
						   case 'y':Sound10K30K(); b=false; break; // MADE CHANGES HEREE
						   case 'n':Sound(); b=false; break; // MADE CHANGES HEREE
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
							   case 'y':Sound10K30K(); b=false; break;
							   case 'n':
							   {
								   System.out.print("Do you want to continue in SOUNDBARS [y/n or Y/N]:"); //MADE CHANGES HERE
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c2)
									   {
									   case 'y': Sound(); b=false; break;
									   case 'n': Main(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="ZEB-JUKE BAR 9200DWS PRO";ob1[i++]=12499;
					   System.out.print("Do you want to continue shopping in this Budget (Below 30K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						   switch(c1)	
						   {
						   case 'y':Sound10K30K(); b=false; break; // MADE CHANGES HEREE
						   case 'n':Sound(); b=false; break; // MADE CHANGES HEREE
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
							   case 'y':Sound10K30K(); b=false; break;
							   case 'n':
							   {
								   System.out.print("Do you want to continue in SOUNDBARS [y/n or Y/N]:"); //MADE CHANGES HERE
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c2)
									   {
									   case 'y': Sound(); b=false; break;
									   case 'n': Main(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="ZEB-JUKE BAR 9450 PRO";ob1[i++]=15999;
					   System.out.print("Do you want to continue shopping in this Budget (Below 30K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						   switch(c1)	
						   {
						   case 'y':Sound10K30K(); b=false; break; // MADE CHANGES HEREE
						   case 'n':Sound(); b=false; break; // MADE CHANGES HEREE
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
							   case 'y':Sound10K30K(); b=false; break;
							   case 'n':
							   {
								   System.out.print("Do you want to continue in SOUNDBARS [y/n or Y/N]:"); //MADE CHANGES HERE
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c2)
									   {
									   case 'y': Sound(); b=false; break;
									   case 'n': Main(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SONY HT-RT TALLBOY SOUNDBAR";ob1[i++]=18690;
					   System.out.print("Do you want to continue shopping in this Budget (Below 30K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						   switch(c1)	
						   {
						   case 'y':Sound10K30K(); b=false; break; // MADE CHANGES HEREE
						   case 'n':Sound(); b=false; break; // MADE CHANGES HEREE
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
							   case 'y':Sound10K30K(); b=false; break;
							   case 'n':
							   {
								   System.out.print("Do you want to continue in SOUNDBARS [y/n or Y/N]:"); //MADE CHANGES HERE
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c2)
									   {
									   case 'y': Sound(); b=false; break;
									   case 'n': Main(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SONNY HT-S400 SOUNDBAR";ob1[i++]=21990;
					   System.out.print("Do you want to continue shopping in this Budget (Below 30K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						   switch(c1)	
						   {
						   case 'y':Sound10K30K(); b=false; break; // MADE CHANGES HEREE
						   case 'n':Sound(); b=false; break; // MADE CHANGES HEREE
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
							   case 'y':Sound10K30K(); b=false; break;
							   case 'n':
							   {
								   System.out.print("Do you want to continue in SOUNDBARS [y/n or Y/N]:"); //MADE CHANGES HERE
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c2)
									   {
									   case 'y': Sound(); b=false; break;
									   case 'n': Main(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SAMSUNG hw-B450/XL SOUNDBAR";ob1[i++]=16990;
					   System.out.print("Do you want to continue shopping in this Budget (Below 30K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						   switch(c1)	
						   {
						   case 'y':Sound10K30K(); b=false; break; // MADE CHANGES HEREE
						   case 'n':Sound(); b=false; break; // MADE CHANGES HEREE
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
							   case 'y':Sound10K30K(); b=false; break;
							   case 'n':
							   {
								   System.out.print("Do you want to continue in SOUNDBARS [y/n or Y/N]:"); //MADE CHANGES HERE
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c2)
									   {
									   case 'y': Sound(); b=false; break;
									   case 'n': Main(); b=false; break;
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
			   
			   case 8:  Sound(); b=false; break; //MADE CHANGES 
			   default : System.out.print("Please enter valid Option :");
			   }
		   }while(b==true);
    	    }
    public static void  Soundabove30K()
    {
    	 System.out.println(RESET);                                                                                                          
    	System.out.println("   ______________________________________________________________________________________________________________________________________________________");
    	System.out.println("  |                                                                                                                                                      |");
    	System.out.println("  |                 1.                                  2.                                     3.                                  4.                    |");
    	System.out.println("  |     _____________________________        _____________________________        _____________________________        ____________________________      |");
    	System.out.println("  |    |  BOSE TELEVISION SPEAKER    |      |    SAMSUNG HW-Q600B/XL      |      |   LG SP8A 3.1.2 CHANNEL     |      |  SAAMSUNG HW-B670/XL       |     |");
    	System.out.println("  |    |-----------------------------|      |-----------------------------|      |-----------------------------|      |----------------------------|     |");
    	System.out.println("  |    |.Powerful bass,Game Mode     |      |.260W PPO with sound woofer  |      |.16.51cms wireless woofer    |      |.7.1 Sound Bar,Dolby Audio  |     |");
    	System.out.println("  |    |.One Remote Control,HDMI     |      |.Deep Bass Sound             |      |.Quad 6.9cm drivers          |      |.Tripple Driver SoundBar    |     |");
    	System.out.println("  |    |.Surround sound Expansion    |      |.Wireless Subwoofer          |      |.Dual 1.9cm tweeters         |      |.16.51cm Subwoofer          |     |");
    	System.out.println("  |    |.Wireless Music Expansion    |      |.Wireless Bluetooth Streaming|      |.BT,USB,AUX,HDMI ARC,Opt i/p |      |.Dual Satellite Speakers    |     |");
    	System.out.println("  |    |.Samsung Audio Remote App    |      |.Plug and Play with USB 2.0  |      |.Volume/Media controls       |      |.Multi-connectivity options |     |");
    	System.out.println("  |    |.Wireless Connection with TV |      |.Aux and OPtical Input       |      |.Remote Control              |      |.Remote Control             |     |");
    	System.out.println("  |    |. PRICE  : 34,400.00/-       |      |. PRICE  :  34,990.00/-      |      |. PRICE  :  36,990.00/-      |      |. PRICE  :  32,999.00/-     |     |");
    	System.out.println("  |    |_____________________________|      |_____________________________|      |_____________________________|      |____________________________|     |");
    	System.out.println("  |                                                                                                                                                      |");
    	System.out.println("  |                                                                                                                                                      |");
    	System.out.println("  |               5.                                   6.                                     7.                                   8.                    |");
    	System.out.println("  |     _____________________________        _____________________________        _____________________________        ____________________________      |");
    	System.out.println("  |    | SONY HT-S700RF SOUNDBAR     |      | JBL 500PRO WITH DOLBY ATMOS |      |    SONY HT-A300 A SERIES    |      |                            |     |");
    	System.out.println("  |    |-----------------------------|      |-----------------------------|      |-----------------------------|      |                            |     |");
    	System.out.println("  |    |.5.1 channel Immersive Sound |      |.Bluetooth Connectivity      |      |.Wireless SubWoofer Included |      |                            |     |");
    	System.out.println("  |    |.High Quality Dolby Digital  |      |.X-Balanced Speaker Uniit    |      |.Extra Bass bigger Sensations|      |                            |     |");
    	System.out.println("  |    |.Wireless ( NFC & BLUETOOTH )|      |.HDMI ARC connectiviy        |      |.One Remote for Total Control|      |           EXIT             |     |");
    	System.out.println("  |    |.Tall Boy Speakers           |      |.Optical connectiviy         |      |.Bluetooth TV Connection     |      |         --------           |     |");
    	System.out.println("  |    |.USB PLUG AND PLAY           |      |.S-FORCE PRO Front Sound     |      |.Game ,NIGHT Mode            |      |                            |     |");
    	System.out.println("  |    |.HDMI ARC Connectivity       |      |.Deeper Richer Bass Sound    |      |.Optimized sound for content |      |                            |     |");
    	System.out.println("  |    |. PRICE  :  44,990.00/-      |      |. PRICE  :  49,990.00/-      |      |. PRICE  :  57,990.00/-      |      |                            |     |");
    	System.out.println("  |    |_____________________________|      |_____________________________|      |_____________________________|      |____________________________|     |");
    	System.out.println("  |                                                                                                                                                      |");
    	System.out.println("  |                                                                                                                                                      |");
    	System.out.println("  |______________________________________________________________________________________________________________________________________________________|");
    	 System.out.println(RESET);	Soundabove30Kswitch();
    }
    public static void Soundabove30Kswitch()
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="BOSE TELEVISION SPEAKER";ob1[i++]=34400;
						          System.out.print("Do you want to continue shopping in this Budget (Above 30K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
				 		  do
				 		  {
				 			char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
				 			switch(c1)	
							{
							case 'y':Soundabove30K(); b=false; break; // MADE CHANGES HEREE
							case 'n':Sound(); b=false; break; // MADE CHANGES HEREE
				 			default : System.out.print("Please enter valid option: ");
							}
				 		  }while(b==true);  break;
						 case 'n':
							 {
								 System.out.print("Do you want to see another model in this Budget (Above 30K) [y/n or Y/N]:");  //MADE CHANGES HERE
									do
									{
										char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									switch(c1)	
									{
									case 'y':Soundabove30K(); b=false; break;
									case 'n':
										{
											System.out.print("Do you want to continue in SOUNDBARS [y/n or Y/N]:"); //MADE CHANGES HERE
											do 
											{
												char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
												switch(c2)
												{
												case 'y': Sound(); b=false; break;
												case 'n': Main(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SAMSUNG HW-Q600B/XL";ob1[i++]=34990;
					   System.out.print("Do you want to continue shopping in this Budget (Above 30K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						   switch(c1)	
						   {
						   case 'y':Soundabove30K(); b=false; break; // MADE CHANGES HEREE
						   case 'n':Sound(); b=false; break; // MADE CHANGES HEREE
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);  break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this Budget (Above 30K) [y/n or Y/N]:");  //MADE CHANGES HERE
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							   switch(c1)	
							   {
							   case 'y':Soundabove30K(); b=false; break;
							   case 'n':
							   {
								   System.out.print("Do you want to continue in SOUNDBARS [y/n or Y/N]:"); //MADE CHANGES HERE
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c2)
									   {
									   case 'y': Sound(); b=false; break;
									   case 'n': Main(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="LG SP8A 3.1.2 CHANNEL";ob1[i++]=36999;
					   System.out.print("Do you want to continue shopping in this Budget (Above 30K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						   switch(c1)	
						   {
						   case 'y':Soundabove30K(); b=false; break; // MADE CHANGES HEREE
						   case 'n':Sound(); b=false; break; // MADE CHANGES HEREE
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);  break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this Budget (Above 30K) [y/n or Y/N]:");  //MADE CHANGES HERE
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							   switch(c1)	
							   {
							   case 'y':Soundabove30K(); b=false; break;
							   case 'n':
							   {
								   System.out.print("Do you want to continue in SOUNDBARS [y/n or Y/N]:"); //MADE CHANGES HERE
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c2)
									   {
									   case 'y': Sound(); b=false; break;
									   case 'n': Main(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SAAMSUNG HW-B670/XL";ob1[i++]=32999;
					   System.out.print("Do you want to continue shopping in this Budget (Above 30K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						   switch(c1)	
						   {
						   case 'y':Soundabove30K(); b=false; break; // MADE CHANGES HEREE
						   case 'n':Sound(); b=false; break; // MADE CHANGES HEREE
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);  break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this Budget (Above 30K) [y/n or Y/N]:");  //MADE CHANGES HERE
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							   switch(c1)	
							   {
							   case 'y':Soundabove30K(); b=false; break;
							   case 'n':
							   {
								   System.out.print("Do you want to continue in SOUNDBARS [y/n or Y/N]:"); //MADE CHANGES HERE
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c2)
									   {
									   case 'y': Sound(); b=false; break;
									   case 'n': Main(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SONY HT-S700RF SOUNDBAR";ob1[i++]=44990;
					   System.out.print("Do you want to continue shopping in this Budget (Above 30K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						   switch(c1)	
						   {
						   case 'y':Soundabove30K(); b=false; break; // MADE CHANGES HEREE
						   case 'n':Sound(); b=false; break; // MADE CHANGES HEREE
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);  break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this Budget (Above 30K) [y/n or Y/N]:");  //MADE CHANGES HERE
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							   switch(c1)	
							   {
							   case 'y':Soundabove30K(); b=false; break;
							   case 'n':
							   {
								   System.out.print("Do you want to continue in SOUNDBARS [y/n or Y/N]:"); //MADE CHANGES HERE
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c2)
									   {
									   case 'y': Sound(); b=false; break;
									   case 'n': Main(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="JBL 500PRO WITH DOLBY ATMOS";ob1[i++]=49990;
					   System.out.print("Do you want to continue shopping in this Budget (Above 30K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						   switch(c1)	
						   {
						   case 'y':Soundabove30K(); b=false; break; // MADE CHANGES HEREE
						   case 'n':Sound(); b=false; break; // MADE CHANGES HEREE
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);  break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this Budget (Above 30K) [y/n or Y/N]:");  //MADE CHANGES HERE
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							   switch(c1)	
							   {
							   case 'y':Soundabove30K(); b=false; break;
							   case 'n':
							   {
								   System.out.print("Do you want to continue in SOUNDBARS [y/n or Y/N]:"); //MADE CHANGES HERE
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c2)
									   {
									   case 'y': Sound(); b=false; break;
									   case 'n': Main(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SONY HT-A300 A SERIES";ob1[i++]=57990;
					   System.out.print("Do you want to continue shopping in this Budget (Above 30K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						   switch(c1)	
						   {
						   case 'y':Soundabove30K(); b=false; break; // MADE CHANGES HEREE
						   case 'n':Sound(); b=false; break; // MADE CHANGES HEREE
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);  break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this Budget (Above 30K) [y/n or Y/N]:");  //MADE CHANGES HERE
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							   switch(c1)	
							   {
							   case 'y':Soundabove30K(); b=false; break;
							   case 'n':
							   {
								   System.out.print("Do you want to continue in SOUNDBARS [y/n or Y/N]:"); //MADE CHANGES HERE
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c2)
									   {
									   case 'y': Sound(); b=false; break;
									   case 'n': Main(); b=false; break;
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
			   case 8:  Sound(); b=false; break;//MADE CHANGES
			   default : System.out.print("Please enter valid Option :");
			   }
		   }while(b==true);
    }
    
    public static void Home()
    { System.out.println(RESET);
    	System.out.println("\t\t\t\t\t\t"+"                HOME THEATRE                                ");
    	System.out.println("\t\t\t\t\t\t"+"               -------------                          ");
    	System.out.println("\t\t\t\t\t\t"+"              1. Between 20K-1Lakh                          ");
    	System.out.println("\t\t\t\t\t\t"+"              2. Above 1Lakh                           ");
    	System.out.println("\t\t\t\t\t\t"+"              3. Exit from Home Theatre                          ");	
    	 System.out.println(RESET);homeSwitch();      // MADE CHANGES HERE
    }
    public static void homeSwitch()
    {
    	System.out.print("PLEASE ENTER THE PRICE RANGE :");
    	do 
    	{
    		int n=sc.nextInt();
    		switch(n)
    		{
    		case 1: Home20K1L();; b=false; break;	//ADDED NEW METHOD AND MADE SOME CHANGES
    		case 2: Homeabove1L();; b=false; break;
    		case 3: Main();  b=false; break;
    		default : System.out.print(" Please Enter correct option : ");
    		}
    	}while(b==true);
    }
    public static void Home20K1L()
    { System.out.println(RESET);
    	System.out.println("   _____________________________________________________________________________________________________________________________________________");
    	System.out.println("  |                                                                                                                                             |");
    	System.out.println("  |                 1.                                  2.                                     3.                               4.              |");
    	System.out.println("  |     _____________________________        _____________________________        _____________________________        ___________________      |");
    	System.out.println("  |    | JBL CINEMA 510 HOME THEATRE |      |  BMB BASIC HOME THEATRE     |      |  BMB ADVANCED HOME THEATRE  |      |                   |     |");
    	System.out.println("  |    |-----------------------------|      |-----------------------------|      |-----------------------------|      |                   |     |");
    	System.out.println("  |    |.Powerful bass,Game Mode     |      |.160W PPO with sound woofer  |      |.16.51cms wireless woofer    |      |                   |     |");
    	System.out.println("  |    |.One Remote Control,HDMI     |      |.Deep Bass Sound             |      |.Quad 6.9cm drivers          |      |                   |     |");
    	System.out.println("  |    |.Surround sound Expansion    |      |.Wireless Subwoofer          |      |.Dual 1.9cm tweeters         |      |       EXIT        |     |");
    	System.out.println("  |    |.Wireless Music Expansion    |      |.Wireless Bluetooth Streaming|      |.BT,USB,AUX,HDMI ARC,Opt i/p |      |     ---------     |     |");
    	System.out.println("  |    |.Samsung Audio Remote App    |      |.Plug and Play with USB 2.0  |      |.Volume/Media controls       |      |                   |     |");
    	System.out.println("  |    |.Wireless Connection with TV |      |.Aux and OPtical Input       |      |.Remote Control              |      |                   |     |");
    	System.out.println("  |    |. PRICE  : 27,400.00 /-      |      |. PRICE  :  76,390.00/-      |      |. PRICE  :  93,390.00/-      |      |                   |     |");
    	System.out.println("  |    |_____________________________|      |_____________________________|      |_____________________________|      |___________________|     |");
    	System.out.println("  |                                                                                                                                             |");
    	System.out.println("  |                                                                                                                                             |");
    	System.out.println("  |_____________________________________________________________________________________________________________________________________________|");
    	
    	 System.out.println(RESET);Home20K1Lswitch();
    }
    public static void Home20K1Lswitch()
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="JBL CINEMA 510 HOME THEATRE";ob1[i++]=27400;
						          System.out.print("Do you want to continue shopping in this Budget (Below 1L) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
				 		  do
				 		  {
				 			char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
				 			switch(c1)	
							{
							case 'y':Home20K1L(); b=false; break; // MADE CHANGES HEREE
							case 'n': Home(); b=false; break; // MADE CHANGES HEREE
				 			default : System.out.print("Please enter valid option: ");
							}
				 		  }while(b==true);  break;
						 case 'n':
							 {
								 System.out.print("Do you want to see another model in this Budget (Below 1L) [y/n or Y/N]:");  //MADE CHANGES HERE
									do
									{
										char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									switch(c1)	
									{
									case 'y':Home20K1L(); b=false; break;
									case 'n':
										{
											System.out.print("Do you want to continue in HOME THEATRE [y/n or Y/N]:"); //MADE CHANGES HERE
											do 
											{
												char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
												switch(c2)
												{
												case 'y':  Home(); b=false; break;
												case 'n': Main(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="BMB BASIC HOME THEATRE";ob1[i++]=76390;
					   System.out.print("Do you want to continue shopping in this Budget (Below 1L) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						   switch(c1)	
						   {
						   case 'y':Home20K1L(); b=false; break; // MADE CHANGES HEREE
						   case 'n': Home(); b=false; break; // MADE CHANGES HEREE
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);  break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this Budget (Below 1L) [y/n or Y/N]:");  //MADE CHANGES HERE
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							   switch(c1)	
							   {
							   case 'y':Home20K1L(); b=false; break;
							   case 'n':
							   {
								   System.out.print("Do you want to continue in HOME THEATRE [y/n or Y/N]:"); //MADE CHANGES HERE
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c2)
									   {
									   case 'y':  Home(); b=false; break;
									   case 'n': Main(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="BMB ADVANCED HOME THEATRE";ob1[i++]=93390;
					   System.out.print("Do you want to continue shopping in this Budget (Below 1L) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						   switch(c1)	
						   {
						   case 'y':Home20K1L(); b=false; break; // MADE CHANGES HEREE
						   case 'n': Home(); b=false; break; // MADE CHANGES HEREE
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);  break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this Budget (Below 1L) [y/n or Y/N]:");  //MADE CHANGES HERE
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							   switch(c1)	
							   {
							   case 'y':Home20K1L(); b=false; break;
							   case 'n':
							   {
								   System.out.print("Do you want to continue in HOME THEATRE [y/n or Y/N]:"); //MADE CHANGES HERE
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c2)
									   {
									   case 'y':  Home(); b=false; break;
									   case 'n': Main(); b=false; break;
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
			  
			   case 4:  Home(); b=false; break;    // MADE CHANGES HERE
			   default : System.out.print("Please enter valid Option :");
			   }
		   }while(b==true);
 

    }
    public static void Homeabove1L()
    {        System.out.println(RESET);
    	System.out.println("   _____________________________________________________________________________________________________________________________________________");
    	System.out.println("  |                                                                                                                                             |");
    	System.out.println("  |                 1.                                  2.                                     3.                               4.              |");
    	System.out.println("  |     _____________________________        _____________________________        _____________________________        ___________________      |");
    	System.out.println("  |    |  BMB PREMIUM HOME THEATRE   |      |  BOSE LS600 HOME THEATRE    |      |  BOSE LS650 HOME THEATRE    |      |                   |     |");
    	System.out.println("  |    |-----------------------------|      |-----------------------------|      |-----------------------------|      |                   |     |");
    	System.out.println("  |    |.Powerful bass,Game Mode     |      |.360W PPO with sound woofer  |      |.16.51cms wireless woofer    |      |                   |     |");
    	System.out.println("  |    |.One Remote Control,HDMI     |      |.Deep Bass Sound             |      |.Quad 6.9cm drivers          |      |                   |     |");
    	System.out.println("  |    |.Surround sound Expansion    |      |.Wireless Subwoofer          |      |.Dual 1.9cm tweeters         |      |       EXIT        |     |");
    	System.out.println("  |    |.Wireless Music Expansion    |      |.Wireless Bluetooth Streaming|      |.BT,USB,AUX,HDMI ARC,Opt i/p |      |     ---------     |     |");
    	System.out.println("  |    |.Samsung Audio Remote App    |      |.Plug and Play with USB 3.0  |      |.Volume/Media controls       |      |                   |     |");
    	System.out.println("  |    |.Wireless Connection with TV |      |.Aux and OPtical Input       |      |.Remote Control              |      |                   |     |");
    	System.out.println("  |    |. PRICE  : 1,10,300.00/-     |      |. PRICE  :  2,64,600.00/-    |      |. PRICE  :  3,58,400.00/-    |      |                   |     |");
    	System.out.println("  |    |_____________________________|      |_____________________________|      |_____________________________|      |___________________|     |");
    	System.out.println("  |                                                                                                                                             |");
    	System.out.println("  |                                                                                                                                             |");
    	System.out.println("  |_____________________________________________________________________________________________________________________________________________|");
    	 System.out.println(RESET);Home1Lswitch();
    }
    public static void Home1Lswitch()
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="BMB PREMIUM HOME THEATRE";ob1[i++]=110300;
						          System.out.print("Do you want to continue shopping in this Budget (Above 1L) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
				 		  do
				 		  {
				 			char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
				 			switch(c1)	
							{
							case 'y':Homeabove1L(); b=false; break; // MADE CHANGES HEREE
							case 'n': Home(); b=false; break; // MADE CHANGES HEREE
				 			default : System.out.print("Please enter valid option: ");
							}
				 		  }while(b==true);  break;
						 case 'n':
							 {
								 System.out.print("Do you want to see another model in this Budget (Above 1L) [y/n or Y/N]:");  //MADE CHANGES HERE
									do
									{
										char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									switch(c1)	
									{
									case 'y':Homeabove1L(); b=false; break;
									case 'n':
										{
											System.out.print("Do you want to continue in HOME THEATRE [y/n or Y/N]:"); //MADE CHANGES HERE
											do 
											{
												char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
												switch(c2)
												{
												case 'y':  Home(); b=false; break;
												case 'n': Main(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="BOSE LS600 HOME THEATRE";ob1[i++]=264600;
					   System.out.print("Do you want to continue shopping in this Budget (Above 1L) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						   switch(c1)	
						   {
						   case 'y':Homeabove1L(); b=false; break; // MADE CHANGES HEREE
						   case 'n': Home(); b=false; break; // MADE CHANGES HEREE
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);  break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this Budget (Above 1L) [y/n or Y/N]:");  //MADE CHANGES HERE
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							   switch(c1)	
							   {
							   case 'y':Homeabove1L(); b=false; break;
							   case 'n':
							   {
								   System.out.print("Do you want to continue in HOME THEATRE [y/n or Y/N]:"); //MADE CHANGES HERE
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c2)
									   {
									   case 'y':  Home(); b=false; break;
									   case 'n': Main(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="BOSE LS650 HOME THEATRE";ob1[i++]=358400;
					   System.out.print("Do you want to continue shopping in this Budget (Above 1L) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						   switch(c1)	
						   {
						   case 'y':Homeabove1L(); b=false; break; // MADE CHANGES HEREE
						   case 'n': Home(); b=false; break; // MADE CHANGES HEREE
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);  break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this Budget (Above 1L) [y/n or Y/N]:");  //MADE CHANGES HERE
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							   switch(c1)	
							   {
							   case 'y':Homeabove1L(); b=false; break;
							   case 'n':
							   {
								   System.out.print("Do you want to continue in HOME THEATRE [y/n or Y/N]:"); //MADE CHANGES HERE
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c2)
									   {
									   case 'y':  Home(); b=false; break;
									   case 'n': Main(); b=false; break;
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
			   case 4:  Home(); b=false; break; // MADE CHANGES HERE
			   default : System.out.print("Please enter valid Option :");
			   }
		   }while(b==true);
    }
}
