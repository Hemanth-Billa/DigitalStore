package audio;


import java.util.Scanner;

import home_screen.Main_Home;

public class Smart_Speakers {
	public static String ob[]=new String[100];
	public static float ob1[]=new float[100];static int i=0;private static final String RESET = "\033[0m";  // Text Reset
	static Scanner sc=new Scanner(System.in);
	static boolean b=true;
	public static void display()
	{ System.out.println(RESET);
		System.out.println("\t\t\t\t"+"                                                                                     \r\n"
				+"\t\t\t\t"+ "          *@@.                             @@@@@@(.                          .@@*         \r\n"
				+"\t\t\t\t"+ "          @@*     @@&                      @@(   @@@@@@@@             &@@     *@@         \r\n"
				+"\t\t\t\t"+ "         @@@     @@@     @@@               @@(         &@@     @@@     @@@     @@@        \r\n"
				+"\t\t\t\t"+ "        ,@@     #@@     %@@                @@(  &@@@@@. @@,     @@&     @@#     @@,       \r\n"
				+"\t\t\t\t"+ "        @@@     @@@     @@/                @@(  @@@  #@@@@,     /@@     @@@     @@@       \r\n"
				+"\t\t\t\t"+ "        @@@     @@,    *@@                 @@(  @@@    @@@,      @@*    ,@@     @@@       \r\n"
				+"\t\t\t\t"+ "        @@@     @@*    ,@@                 @@(  @@@     @@,      @@,    *@@     @@@       \r\n"
				+"\t\t\t\t"+ "        @@@     @@@     @@&            %@@@@@(  @@@             %@@     @@@     @@@       \r\n"
				+"\t\t\t\t"+ "        .@@     *@@     ,@@.      @@@@@%,,,/%   @@@            .@@*     @@*     @@.       \r\n"
				+"\t\t\t\t"+ "         @@@     @@@      @.     @@#            @@@            .@      @@@     @@@        \r\n"
				+"\t\t\t\t"+ "          @@&     @@(            @@#            @@*                   /@@     &@@         \r\n"
				+"\t\t\t\t"+ "           @@/                    &@@@@%/,*#@@@@@   @@@@@&/                  /@@          \r\n"
				+"\t\t\t\t"+ "                        /@@@@@@@       (&&&#,            (@@@@@@@@(                       \r\n"
				+"\t\t\t\t"+ "                    @@@@@.                                       .@@@@@                   \r\n"
				+"\t\t\t\t"+ "                  @@@.       @@@@@@@@@@@@         @@@@@@@@@@@@       .@@@                 \r\n"
				+"\t\t\t\t"+ "                 @@@         @@@/    ,@@@/       /@@@,    /@@@         @@@                \r\n"
				+"\t\t\t\t"+ "                 @@@/          .@@@@@@#             (@@@@@@.          *@@@                \r\n"
				+"\t\t\t\t"+ "                 @@@@@@(                                           (@@@@@@                \r\n"
				+"\t\t\t\t"+ "                 @@@, *@@@@@@#                               #@@@@@@* ,@@@                \r\n"
				+"\t\t\t\t"+ "                 @@@@@@.    .@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@.     @@@@@@                \r\n"
				+"\t\t\t\t"+ "                 @@@  #@@@@@&.     * SMART SPEAKERS *        .&@@@@@#  &@@                \r\n"
				+"\t\t\t\t"+ "                 @@@        %@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%        &@@                \r\n"
				+"\t\t\t\t"+ "                 @@@                   __________                      &@@                \r\n"
				+"\t\t\t\t"+ "                 @@@                  | 1.GOOGLE |                     @@@                \r\n"
				+"\t\t\t\t"+ "                  @@@                 | 2.AMAZON |                    @@@                 \r\n"
				+"\t\t\t\t"+ "                    @@@@%             | 3.EXIT   |                %@@@@                   \r\n"
				+"\t\t\t\t"+ "                       ,@@@@@@@%,      ----------         ,%@@@@@@@,                      \r\n"
				+"\t\t\t\t"+ "                              .%@@@@@@@@@@@@@@@@@@@@@@@@@@@%.");
		 System.out.println(RESET); Displayswitch();
		  
	}
	public static void Displayswitch()
	{ System.out.println(RESET);
		System.out.print("PLEASE ENTER YOUR PREFERRED BRAND :  ");
		int c=sc.nextInt();
		boolean b=true;
		do
		{
			switch(c)
			{
			case 1:Googlemenu(); b=false; break;
			case 2:Amazonmenu(); b=false; break;
			case 3: Main_Home.audios(); b=false;  break;
			default: 
			{
				System.out.println();
				System.out.print("\t\t\t\t\t\t\t\t   "+"PLEASE ENTER VALID OPTION...");
				System.out.println();
		        display(); b=false; break;
			}
		
	
	        }
			}while(b==true);
		
	}
	
	public static void Googlemenu()
	{ System.out.println(RESET);
		 System.out.println("\t\t\t\t\t\t"+"                         GOOGLE                          ");  
		 System.out.println("\t\t\t\t\t\t"+"                      -------------                      ");  
		 System.out.println("\t\t\t\t\t\t"+"                      1.Google 2k-3K                     ");  
		 System.out.println("\t\t\t\t\t\t"+"                      2.EXIT FROM GOOGLE                            ");
		 System.out.println(RESET); Google2k4k();
	}
	public static void Google2k4k()
	{
	System.out.print("PLEASE ENTER THE PRICE RANGE  :");
	do
	{
	int p=sc.nextInt();
	switch(p) 
	{
	case 1: Google4k(); b=false; break;
	case 2: display();b=false; break;
	default:
	{
		System.out.print("Please enter valid option:");
		Googlemenu(); 
		
	}
	}
	}while(b==true);
	}
	public static void Google4k()
	{ System.out.println(RESET);
		 System.out.println("\t\t\t"+" ____________________________________________________________________________________________________");  
		 System.out.println("\t\t\t"+"|                                                                                                    |");  
		 System.out.println("\t\t\t"+"|        _________________________         __________________________         ________________       |");  
		 System.out.println("\t\t\t"+"|       |   GOOGLE HOME MINI      |       | GOOGLE NEST MINI         |       |                |      |");  
		 System.out.println("\t\t\t"+"|       |-------------------------|       |--------------------------|       |                |      |");  
		 System.out.println("\t\t\t"+"|       |.Colour : charcoal       |       |.Colour : BLACK           |       |                |      |");  
		 System.out.println("\t\t\t"+"|       | FEATURES :              |       | FEATURES :               |       |                |      |");  
		 System.out.println("\t\t\t"+"|       |.15 watts Power Adaptor  |       |.45 watts Power Adaptor   |       |                |      |");  
		 System.out.println("\t\t\t"+"|       |.Google Assist 3 fair-   |       |.Google Assist 4 fair-    |       |      EXIT      |      |");  
		 System.out.println("\t\t\t"+"|       |    field microphone     |       |     field microphone     |       |    --------    |      |");  
		 System.out.println("\t\t\t"+"|       |.Warranty : 6 months     |       |.Warranty : 9 months      |       |                |      |");  
		 System.out.println("\t\t\t"+"|       |.Height: 5.67cm          |       |.Height: 5.7cm            |       |                |      |");  
		 System.out.println("\t\t\t"+"|       |.Width : 10.08           |       |.Width : 15.08            |       |                |      |");   
		 System.out.println("\t\t\t"+"|       |.PRICE : 2,570/-         |       |.PRICE : 3,000/-          |       |                |      |");  
		 System.out.println("\t\t\t"+"|       |_________________________|       |__________________________|       |________________|      |");   
		 System.out.println("\t\t\t"+"|                                                                                                    |");  
		 System.out.println("\t\t\t"+"|                  1.                              2.                             3.                 |");  
		 System.out.println("\t\t\t"+"|                                                                                                    |");  
		 System.out.println("\t\t\t"+"|____________________________________________________________________________________________________|");
		 
		 System.out.println(RESET);Googleswitch1();
	}
	public static void Googleswitch1()
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="GOOGLE HOME MINI";ob1[i++]=2570;
						          System.out.print("Do you want to continue shopping in this Budget (Below 4K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
				 		  do
				 		  {
				 			char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
				 			switch(c1)	
							{
							case 'y':Google4k(); b=false; break; // MADE CHANGES HEREE
							case 'n':Googlemenu(); b=false; break; // MADE CHANGES HEREE
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
									case 'y':Google4k(); b=false; break;
									case 'n':
										{
											System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
											do 
											{
												char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
												switch(c2)
												{
												case 'y': Googlemenu(); b=false; break;
												case 'n': display(); b=false; break;
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="GOOGLE NEST MINI";ob1[i++]=3000;
						 System.out.print("Do you want to continue shopping in this Budget (Below 4K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':Google4k(); b=false; break; // MADE CHANGES HEREE
							 case 'n':Googlemenu(); b=false; break; // MADE CHANGES HEREE
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
								 case 'y':Google4k(); b=false; break;
								 case 'n':
								 {
									 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
									 do 
									 {
										 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
										 switch(c2)
										 {
										 case 'y': Googlemenu(); b=false; break;
										 case 'n': display(); b=false; break;
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
				 case 3: display(); b=false; break;
					 default:  System.out.print("Please enter valid option:");
					 }
				 }while(b==true); 
		    	
	
		   }
	public static void Amazonmenu()
	{ System.out.println(RESET);
		 System.out.println("\t\t\t\t\t\t"+"                        AMAZON                        ");  
		 System.out.println("\t\t\t\t\t\t"+"                      -------------                      ");  
		 System.out.println("\t\t\t\t\t\t"+"                      1.Amazon 2K-10K                     ");  
		 System.out.println("\t\t\t\t\t\t"+"                      2.EXIT                             ");
		 System.out.println(RESET); Amazon2k10k();
	}
	  	
	public static void Amazon2k10k()
	{
	System.out.print("PLEASE ENTER THE PRICE RANGE  :");
	do
	{
	int p=sc.nextInt();
	switch(p) 
	{
	case 1: Amazon2k(); b=false; break;
	case 2: display();b=false; break;
	default:
	{
		System.out.print("Please enter valid option:");
		Googlemenu(); 
		
	}
	}
	}while(b==true);
	}
	public static void Amazon2k()
	{ System.out.println(RESET);
		System.out.println("\t\t"+" _________________________________________________________________________________________________________________________________");  
		 System.out.println("\t\t"+"|                                                                                                                                 |");  
		 System.out.println("\t\t"+"|   ___________________       ___________________       ___________________       ___________________       ___________________   |");  
		 System.out.println("\t\t"+"|  |  AMAZON ECHO DOT  |     |    AMAZON ECHO    |     | ECHO DOT 4TH GEN  |     | ECHO DOT 3RD GEN  |     |AMAZON ECHO SHOW 8 |  |");  
		 System.out.println("\t\t"+"|  |-------------------|     |-------------------|     |-------------------|     |-------------------|     |-------------------|  |");  
		 System.out.println("\t\t"+"|  |.Audio : 3.5mm     |     |.Audio : 3.5mm     |     |.Audio : 3.5mm     |     |.Audio : 3.5mm     |     |.Audio : 3.5mm     |  |");  
		 System.out.println("\t\t"+"|  | FEATURES : Alexa  |     | FEATURES : Alexa  |     | FEATURES : Alexa  |     | FEATURES :  Alexa |     | FEATURES : Alexa  |  |");  
		 System.out.println("\t\t"+"|  |.15 watts Power    |     |.15 watts Power    |     |.15 watts Power    |     |.15 watts Power    |     |.15 watts Power    |  |");  
		 System.out.println("\t\t"+"|  |.Warranty : 1 Year |     |.Warranty : 1 Year |     |.Warranty : 1 Year |     |.Warranty : 1 Year |     |.Warranty : 1 Year |  |");  
		 System.out.println("\t\t"+"|  |.Height: 4.318cms  |     |.Height: 8.82cms   |     |.Height: 4.37cms   |     |.Height: 13.5cms   |     |.Height: 14.5cm    |  |");  
		 System.out.println("\t\t"+"|  |.Width :9.95cms    |     |.Width :8.85cms    |     |.Width :9.9cms     |     |.Width :20cms      |     |.Width :9.9cms     |  |");  
		 System.out.println("\t\t"+"|  |.Price : 4190/-    |     |.Price : 5450/-    |     |.Price : 6599/-    |     |.Price : 4570/-    |     |.Price : 7499/-    |  |");  
		 System.out.println("\t\t"+"|  |___________________|     |___________________|     |___________________|     |___________________|     |___________________|  |");  
		 System.out.println("\t\t"+"|                                                                                                                                 |");  
		 System.out.println("\t\t"+"|           1.                         2.                       3.                        4.                         5.           |");  
		 System.out.println("\t\t"+"|                                          ___________________       ___________________                                          |");  
		 System.out.println("\t\t"+"|                                         |AMAZON ECHO 3RD GEN|     |                   |                                         |");  
		 System.out.println("\t\t"+"|                                         |-------------------|     |                   |                                         |");  
		 System.out.println("\t\t"+"|                                         |.Audio : 3.5mm     |     |                   |                                         |");  
		 System.out.println("\t\t"+"|                                         | FEATURES : Alexa  |     |                   |                                         |");  
		 System.out.println("\t\t"+"|                                         |.15 watts Power    |     |       EXIT        |                                         |");  
		 System.out.println("\t\t"+"|                                         |.Warranty : 1 Year |     |     ---------     |                                         |");  
		 System.out.println("\t\t"+"|                                         |.Height: 14.8cms   |     |                   |                                         |"); 
		 System.out.println("\t\t"+"|                                         |.Width :9.9cms     |     |                   |                                         |");  
		 System.out.println("\t\t"+"|                                         |.Price : 4590/-    |     |                   |                                         |");  
		 System.out.println("\t\t"+"|                                         |___________________|     |___________________|                                         |");  
		 System.out.println("\t\t"+"|                                                                                                                                 |");    
		 System.out.println("\t\t"+"|                                                  6.                         7.                                                  |");    
		 System.out.println("\t\t"+"|_________________________________________________________________________________________________________________________________|");
		 
		
	
		 System.out.println(RESET); Amazonswitch1();
	}
	
	public static void  Amazonswitch1()
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="AMAZON ECHO DOT";ob1[i++]=4190;
						          System.out.print("Do you want to continue shopping in this Budget (Below 10K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
				 		  do
				 		  {
				 			char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
				 			switch(c1)	
							{
							case 'y':Amazon2k(); b=false; break; // MADE CHANGES HEREE
							case 'n':Amazonmenu(); b=false; break; // MADE CHANGES HEREE
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
									case 'y':Amazon2k(); b=false; break;
									case 'n':
										{
											System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
											do 
											{
												char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
												switch(c2)
												{
												case 'y': Amazonmenu(); b=false; break;
												case 'n': display(); b=false; break;
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="AMAZON ECHO";ob1[i++]=5450;
						 System.out.print("Do you want to continue shopping in this Budget (Below 10K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':Amazon2k(); b=false; break; // MADE CHANGES HEREE
							 case 'n':Amazonmenu(); b=false; break; // MADE CHANGES HEREE
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
								 case 'y':Amazon2k(); b=false; break;
								 case 'n':
								 {
									 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
									 do 
									 {
										 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
										 switch(c2)
										 {
										 case 'y': Amazonmenu(); b=false; break;
										 case 'n': display(); b=false; break;
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="ECHO DOT 4TH GEN";ob1[i++]=6599;
						 System.out.print("Do you want to continue shopping in this Budget (Below 10K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':Amazon2k(); b=false; break; // MADE CHANGES HEREE
							 case 'n':Amazonmenu(); b=false; break; // MADE CHANGES HEREE
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
								 case 'y':Amazon2k(); b=false; break;
								 case 'n':
								 {
									 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
									 do 
									 {
										 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
										 switch(c2)
										 {
										 case 'y': Amazonmenu(); b=false; break;
										 case 'n': display(); b=false; break;
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="ECHO DOT 3RD GEN";ob1[i++]=4570;
						 System.out.print("Do you want to continue shopping in this Budget (Below 10K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':Amazon2k(); b=false; break; // MADE CHANGES HEREE
							 case 'n':Amazonmenu(); b=false; break; // MADE CHANGES HEREE
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
								 case 'y':Amazon2k(); b=false; break;
								 case 'n':
								 {
									 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
									 do 
									 {
										 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
										 switch(c2)
										 {
										 case 'y': Amazonmenu(); b=false; break;
										 case 'n': display(); b=false; break;
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="AMAZON ECHO SHOW 8";ob1[i++]=7499;
						 System.out.print("Do you want to continue shopping in this Budget (Below 10K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':Amazon2k(); b=false; break; // MADE CHANGES HEREE
							 case 'n':Amazonmenu(); b=false; break; // MADE CHANGES HEREE
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
								 case 'y':Amazon2k(); b=false; break;
								 case 'n':
								 {
									 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
									 do 
									 {
										 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
										 switch(c2)
										 {
										 case 'y': Amazonmenu(); b=false; break;
										 case 'n': display(); b=false; break;
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="AMAZON ECHO 3RD GEN";ob1[i++]=4590;
						 System.out.print("Do you want to continue shopping in this Budget (Below 10K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':Amazon2k(); b=false; break; // MADE CHANGES HEREE
							 case 'n':Amazonmenu(); b=false; break; // MADE CHANGES HEREE
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
								 case 'y':Amazon2k(); b=false; break;
								 case 'n':
								 {
									 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
									 do 
									 {
										 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
										 switch(c2)
										 {
										 case 'y': Amazonmenu(); b=false; break;
										 case 'n': display(); b=false; break;
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
				  case 7: display(); b=false; break;
					 default:  System.out.print("Please enter valid option:");
					 }
				 }while(b==true); 
		    	
	
		   }
//	public static void main(String []args)
//	{
//		//Smart_Speakers a=new Smart_Speakers();
//		display();
//	}


}

