package laptops_computers;

import java.util.Scanner;

import home_screen.Main_Home;

public class Monitors 
{
	public 	static String ob[]=new String[100];
	public 	static float ob1[]=new float[100];static int i=0;
		static Scanner sc  = new Scanner(System.in); private static final String RESET = "\033[0m";  // Text Reset
		static boolean b=true;
		
		public static void monitor()
		{ System.out.println(RESET);
			System.out.println("\t\t\t\t\t\t"+"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			System.out.println("\t\t\t\t\t\t"+"@@                                                       @@");
			System.out.println("\t\t\t\t\t\t"+"@@                                                       @@");
			System.out.println("\t\t\t\t\t\t"+"@@                                                       @@");
			System.out.println("\t\t\t\t\t\t"+"@@                     * MONITORS *                      @@");
			System.out.println("\t\t\t\t\t\t"+"@@                    ---------------                    @@");
			System.out.println("\t\t\t\t\t\t"+"@@                     1. BELOW 10K                      @@");
			System.out.println("\t\t\t\t\t\t"+"@@                     2. 10K - 20K                      @@");
			System.out.println("\t\t\t\t\t\t"+"@@                     3. EXIT                           @@");
			System.out.println("\t\t\t\t\t\t"+"@@                                                       @@");
			System.out.println("\t\t\t\t\t\t"+"@@                                                       @@");
			System.out.println("\t\t\t\t\t\t"+"@@                                                       @@");
			System.out.println("\t\t\t\t\t\t"+"@@                                                       @@");
			System.out.println("\t\t\t\t\t\t"+"@@                                                       @@");
			System.out.println("\t\t\t\t\t\t"+"@@                                                       @@");
			System.out.println("\t\t\t\t\t\t"+"@@                                                       @@");
			System.out.println("\t\t\t\t\t\t"+"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			System.out.println("\t\t\t\t\t\t"+"@@                                                       @@");
			System.out.println("\t\t\t\t\t\t"+" @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			System.out.println("\t\t\t\t\t\t"+"                          @@   @@                         ");
			System.out.println("\t\t\t\t\t\t"+"                        @@@     @@@                       ");
			System.out.println("\t\t\t\t\t\t"+"                 @@@@@@ @@       @@ @@@@@@                ");
			System.out.println("\t\t\t\t\t\t"+"                @@      @@@@@@@@@@@      @@              ");
			System.out.println("\t\t\t\t\t\t"+"                 @@@@                 @@@@               ");
			System.out.println("\t\t\t\t\t\t"+"                     @@@@@@@@@@@@@@@@@                     ");
			 System.out.println(RESET);purchase();
		}
		public static void purchase()
		{
			System.out.print("PLEASE ENTER THE PRICE RANGE  :");
			 
			 do
			 {
				int p=sc.nextInt();
				switch(p) 
				{
				case 1: monitorbelow10k(); b=false; break;
				case 2: monitor10k20k();  b=false; break;
				case 3:Main_Home.laptops$Monitors(); b=false; break;
			    default:
			    	{
			    		System.out.println();
						System.out.print("\t\t\t\t\t\t\t\t     "+"PLEASE ENTER VALID OPTION..."+"\n");
						System.out.println();
			    		monitor(); 
			    	}
				}
			 }while(b==true);
		}
		public static void monitorbelow10k()
		{ System.out.println(RESET);
			 System.out.println("\t   "+" ____________________________________________________________________________________________________________________________________");  
			 System.out.println("\t   "+"|                                                                                                                                    |");  
			 System.out.println("\t   "+"|          _______________________________         _______________________________         _______________________________           |");  
			 System.out.println("\t   "+"|         |   ZEBRONICS MT52-ZEB A19HD    |       |  LAPCARE LKTFWH7696 MONITOR   |       |     DELL D2020H MONITOR       |          |");  
			 System.out.println("\t   "+"|         |-------------------------------|       |-------------------------------|       |-------------------------------|          |");  
			 System.out.println("\t   "+"|         |.Slim and Glossy Design        |       |.Display Type : LED            |       |.Flicker-free Screen           |          |");  
			 System.out.println("\t   "+"|         |.Anti Glare / Wall Mountable   |       |.Aspect Ratio : 16:9           |       |.Adjustable Stand              |          |");  
			 System.out.println("\t   "+"|         |.Built-in Power Supply         |       |.Slim and Glossy Design        |       |.TN Panel / LCD Display        |          |");  
			 System.out.println("\t   "+"|         |.HDMI and VGA Input            |       |.Built-in Power Supply         |       |.1 VGA Port & HDMI 1.4(HDCP1.4)|          |");  
			 System.out.println("\t   "+"|         |.46.9 cm(18.5 inch)            |       |.50.8 CM (20 INCH)             |       |.49.53 cm(19.5 inch)           |          |");  
			 System.out.println("\t   "+"|         |.1366 x 768 Resolution         |       |.1600 x 900 Screen Resolution  |       |.1600 x 900 Screen Resolution  |          |");  
			 System.out.println("\t   "+"|         |.  PRICE  :  5,990.00/-        |       |. PRICE  :  6,450.00/-         |       |.  PRICE  : 7,090.00/-         |          |");  
			 System.out.println("\t   "+"|         |_______________________________|       |_______________________________|       |_______________________________|          |");  
			 System.out.println("\t   "+"|                                                                                                                                    |");  
			 System.out.println("\t   "+"|                       1.                                          2.                                       3.                      |");  
			 System.out.println("\t   "+"|                                                                                                                                    |");  
			 System.out.println("\t   "+"|                                                                                                                                    |");  
			 System.out.println("\t   "+"|          _______________________________         _______________________________         _______________________________           |");  
			 System.out.println("\t   "+"|         |   LG 19M38AB BLACK MONITOR    |       |    AOC E970SWN5 MONITOR       |       |                               |          |");  
			 System.out.println("\t   "+"|         |-------------------------------|       |-------------------------------|       |                               |          |");  
			 System.out.println("\t   "+"|         |.Display Type : LED            |       |.Display Type : LED            |       |                               |          |");  
			 System.out.println("\t   "+"|         |.Flicker-free Screen           |       |.Adjustable Stand              |       |             EXIT              |          |");  
			 System.out.println("\t   "+"|         |.HDMI and VGA Input            |       |.Anti Glare / Wall Mountable   |       |            ------             |          |");  
			 System.out.println("\t   "+"|         |.Built-in Power Supply         |       |.Slim and Glossy Design        |       |                               |          |");  
			 System.out.println("\t   "+"|         |.46.99 CM (18.5 INCH)          |       |.47.99 CM (18.5 INCH)          |       |                               |          |");  
			 System.out.println("\t   "+"|         |.1366 x 768 Screen Resolution  |       |.1366 x 768 Screen Resolution  |       |                               |          |");  
			 System.out.println("\t   "+"|         |.  PRICE  :  8,450.00/-        |       |. PRICE  :  9,590.00/-         |       |                               |          |");  
			 System.out.println("\t   "+"|         |_______________________________|       |_______________________________|       |_______________________________|          |");
			 System.out.println("\t   "+"|                                                                                                                                    |");  
			 System.out.println("\t   "+"|                     4.                                        5.                                       6.                          |");  
			 System.out.println("\t   "+"|                                                                                                                                    |");  	 
			 System.out.println("\t   "+"|____________________________________________________________________________________________________________________________________|");  
			 
			 System.out.println(RESET); monitorbelow10kswitch(); 
		}
		public static void monitorbelow10kswitch()
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
							 char c=sc.next().toLowerCase().charAt(0);
							 switch(c)
							 {
							 case 'y':System.out.println("Your Item is added to cart .");  ob[i]="ZEBRONICS MT52-ZEB A19HD";ob1[i++]=5990;
							 		  System.out.println("Do you want to continue shopping below 10k budget [y/n or Y/N] :");
							 		  do
							 		  {
							 			char c1=sc.next().toLowerCase().charAt(0);
							 			switch(c1)	
										{
										case 'y':monitorbelow10k(); b=false; break;
										case 'n':monitor(); b=false; break;
							 			default : System.out.print("Please enter valid option: ");
										}
							 		  }while(b==true); break;
							 case 'n':
								 {
									 System.out.print("Do you want to see another model in this budget [y/n or Y/N]  :"); 
										do
										{
											char c1=sc.next().toLowerCase().charAt(0);
										switch(c1)	
										{
										case 'y':monitorbelow10k(); b=false; break;
										case 'n':{
											System.out.print("Do you want to continue in below 10k budget [y/n or Y/N] :");
											do 
											{
												char c2=sc.next().toLowerCase().charAt(0);
												switch(c2)
												{
												case 'y': monitorbelow10k(); b=false; break;
												case 'n': monitor(); b=false; break;
												default:System.out.print("Please enter valid option:"); 
												}
											}while(b==true); b=false; break;
										        }
										default:System.out.print("Please enter valid option:");
										}
										}while(b==true); b=false; break;
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
						   char c=sc.next().toLowerCase().charAt(0);
						   switch(c)
						   {
						   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="LAPCARE LKTFWH7696 MONITOR";ob1[i++]=6450; 
						   System.out.println("Do you want to continue shopping below 10k budget [y/n or Y/N] :");
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);
							   switch(c1)	
							   {
							   case 'y':monitorbelow10k(); b=false; break;
							   case 'n':monitor(); b=false; break;
							   default : System.out.print("Please enter valid option: ");
							   }
						   }while(b==true);break;
						   case 'n':
						   {
							   System.out.print("Do you want to see another model in this budget [y/n or Y/N]  :"); 
							   do
							   {
								   char c1=sc.next().toLowerCase().charAt(0);
								   switch(c1)	
								   {
								   case 'y':monitorbelow10k(); b=false; break;
								   case 'n':{
									   System.out.print("Do you want to continue in below 10k budget [y/n or Y/N] :");
									   do 
									   {
										   char c2=sc.next().toLowerCase().charAt(0);
										   switch(c2)
										   {
										   case 'y': monitorbelow10k(); b=false; break;
										   case 'n': monitor(); b=false; break;
										   default:System.out.print("Please enter valid option:"); 
										   }
									   }while(b==true); b=false; break;
								   }
								   default:System.out.print("Please enter valid option:");
								   }
							   }while(b==true); b=false; break;
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
						   char c=sc.next().toLowerCase().charAt(0);
						   switch(c)
						   {
						   case 'y':System.out.println("Your Item is added to cart .");ob[i]="DELL D2020H MONITOR";ob1[i++]= 7090; 
						   System.out.println("Do you want to continue shopping below 10k budget [y/n or Y/N] :");
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);
							   switch(c1)	
							   {
							   case 'y':monitorbelow10k(); b=false; break;
							   case 'n':monitor(); b=false; break;
							   default : System.out.print("Please enter valid option: ");
							   }
						   }while(b==true);break;
						   case 'n':
						   {
							   System.out.print("Do you want to see another model in this budget [y/n or Y/N]  :"); 
							   do
							   {
								   char c1=sc.next().toLowerCase().charAt(0);
								   switch(c1)	
								   {
								   case 'y':monitorbelow10k(); b=false; break;
								   case 'n':{
									   System.out.print("Do you want to continue in below 10k budget [y/n or Y/N] :");
									   do 
									   {
										   char c2=sc.next().toLowerCase().charAt(0);
										   switch(c2)
										   {
										   case 'y': monitorbelow10k(); b=false; break;
										   case 'n': monitor(); b=false; break;
										   default:System.out.print("Please enter valid option:"); 
										   }
									   }while(b==true); b=false; break;
								   }
								   default:System.out.print("Please enter valid option:");
								   }
							   }while(b==true); b=false; break;
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
						   char c=sc.next().toLowerCase().charAt(0);
						   switch(c)
						   {
						   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="LG 19M38AB BLACK MONITOR";ob1[i++]= 8450;
						   System.out.println("Do you want to continue shopping below 10k budget [y/n or Y/N] :");
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);
							   switch(c1)	
							   {
							   case 'y':monitorbelow10k(); b=false; break;
							   case 'n':monitor(); b=false; break;
							   default : System.out.print("Please enter valid option: ");
							   }
						   }while(b==true);break;
						   case 'n':
						   {
							   System.out.print("Do you want to see another model in this budget [y/n or Y/N]  :"); 
							   do
							   {
								   char c1=sc.next().toLowerCase().charAt(0);
								   switch(c1)	
								   {
								   case 'y':monitorbelow10k(); b=false; break;
								   case 'n':{
									   System.out.print("Do you want to continue in below 10k budget [y/n or Y/N] :");
									   do 
									   {
										   char c2=sc.next().toLowerCase().charAt(0);
										   switch(c2)
										   {
										   case 'y': monitorbelow10k(); b=false; break;
										   case 'n': monitor(); b=false; break;
										   default:System.out.print("Please enter valid option:"); 
										   }
									   }while(b==true); b=false; break;
								   }
								   default:System.out.print("Please enter valid option:");
								   }
							   }while(b==true); b=false; break;
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
						   char c=sc.next().toLowerCase().charAt(0);
						   switch(c)
						   {
						   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="AOC E970SWN5 MONITOR";ob1[i++]= 9590;
						   System.out.println("Do you want to continue shopping below 10k budget [y/n or Y/N] :");
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);
							   switch(c1)	
							   {
							   case 'y':monitorbelow10k(); b=false; break;
							   case 'n':monitor(); b=false; break;
							   default : System.out.print("Please enter valid option: ");
							   }
						   }while(b==true);break;
						   case 'n':
						   {
							   System.out.print("Do you want to see another model in this budget [y/n or Y/N]  :"); 
							   do
							   {
								   char c1=sc.next().toLowerCase().charAt(0);
								   switch(c1)	
								   {
								   case 'y':monitorbelow10k(); b=false; break;
								   case 'n':{
									   System.out.print("Do you want to continue in below 10k budget [y/n or Y/N] :");
									   do 
									   {
										   char c2=sc.next().toLowerCase().charAt(0);
										   switch(c2)
										   {
										   case 'y': monitorbelow10k(); b=false; break;
										   case 'n': monitor(); b=false; break;
										   default:System.out.print("Please enter valid option:"); 
										   }
									   }while(b==true); b=false; break;
								   }
								   default:System.out.print("Please enter valid option:");
								   }
							   }while(b==true); b=false; break;
						   }
						   default:  System.out.print("Please enter valid option:");
						   
						   }
					   }while(b==true);  b=false; break; 
				   }
				   case 6:monitor(); b=false; break;
				   default: System.out.print("PLEASE ENTER VALID OPTION: ");
				   }
			   }while(b==true);
		}
		public static void monitor10k20k()
		{ System.out.println(RESET);
			 System.out.println("\t   "+" ____________________________________________________________________________________________________________________________________");  
			 System.out.println("\t   "+"|                                                                                                                                    |");  
			 System.out.println("\t   "+"|          _______________________________         _______________________________         _______________________________           |");  
			 System.out.println("\t   "+"|         |    LENOVO L24I-30 MONITOR     |       |    VIEWSONIC VX2458-C-MHD     |       |    SAMSUNG LC24F392FHWXXL     |          |");  
			 System.out.println("\t   "+"|         |-------------------------------|       |-------------------------------|       |-------------------------------|          |");  
			 System.out.println("\t   "+"|         |.Slim and Glossy Design        |       |.Display Type : LED            |       |.Flicker-free Screen           |          |");  
			 System.out.println("\t   "+"|         |.Anti Glare / Wall Mountable   |       |.Aspect Ratio : 16:9           |       |.Adjustable Stand              |          |");  
			 System.out.println("\t   "+"|         |.Built-in Power Supply         |       |.Slim and Glossy Design        |       |.TN Panel / LCD Display        |          |");  
			 System.out.println("\t   "+"|         |.HDMI and VGA Input            |       |.Built-in Power Supply         |       |.1 VGA Port & HDMI 1.4(HDCP1.4)|          |");  
			 System.out.println("\t   "+"|         |.46.9 cm(18.5 inch)            |       |.50.8 CM (20 INCH)             |       |.49.53 cm(19.5 inch)           |          |");  
			 System.out.println("\t   "+"|         |.1366 x 768 Resolution         |       |.1600 x 900 Screen Resolution  |       |.1600 x 900 Screen Resolution  |          |");  
			 System.out.println("\t   "+"|         |.  PRICE  :  11,990.00/-       |       |. PRICE  :  14,450.00/-        |       |.  PRICE  : 15,090.00/-        |          |");  
			 System.out.println("\t   "+"|         |_______________________________|       |_______________________________|       |_______________________________|          |");  
			 System.out.println("\t   "+"|                                                                                                                                    |");  
			 System.out.println("\t   "+"|                       1.                                          2.                                       3.                      |");  
			 System.out.println("\t   "+"|                                                                                                                                    |");  
			 System.out.println("\t   "+"|                                                                                                                                    |");  
			 System.out.println("\t   "+"|          _______________________________         _______________________________         _______________________________           |");  
			 System.out.println("\t   "+"|         | LG ULTRAGEAR 24GN600 MONITOR  |       |     ASUS VG259QR MONITOR      |       |                               |          |");  
			 System.out.println("\t   "+"|         |-------------------------------|       |-------------------------------|       |                               |          |");  
			 System.out.println("\t   "+"|         |.Display Type : LED            |       |.Display Type : LED            |       |                               |          |");  
			 System.out.println("\t   "+"|         |.Flicker-free Screen           |       |.Adjustable Stand              |       |             EXIT              |          |");  
			 System.out.println("\t   "+"|         |.HDMI and VGA Input            |       |.Anti Glare / Wall Mountable   |       |            ------             |          |");  
			 System.out.println("\t   "+"|         |.Built-in Power Supply         |       |.Slim and Glossy Design        |       |                               |          |");  
			 System.out.println("\t   "+"|         |.46.99 CM (18.5 INCH)          |       |.47.99 CM (18.5 INCH)          |       |                               |          |");  
			 System.out.println("\t   "+"|         |.1366 x 768 Screen Resolution  |       |.1366 x 768 Screen Resolution  |       |                               |          |");  
			 System.out.println("\t   "+"|         |.  PRICE  :  17,450.00/-       |       |. PRICE  :  16,590.00/-        |       |                               |          |");  
			 System.out.println("\t   "+"|         |_______________________________|       |_______________________________|       |_______________________________|          |");
			 System.out.println("\t   "+"|                                                                                                                                    |");  
			 System.out.println("\t   "+"|                     4.                                        5.                                       6.                          |");  
			 System.out.println("\t   "+"|                                                                                                                                    |");  	 
			 System.out.println("\t   "+"|____________________________________________________________________________________________________________________________________|");  
			 
			 System.out.println(RESET); monitor10k20kswitch(); 
		}
		public static void monitor10k20kswitch()
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
							 char c=sc.next().toLowerCase().charAt(0);
							 switch(c)
							 {
							 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="LENOVO L24I-30 MONITOR";ob1[i++]= 11990;
							 		  System.out.println("Do you want to continue shopping between 10k -20k budget [y/n or Y/N] :");
							 		  do
							 		  {
							 			char c1=sc.next().toLowerCase().charAt(0);
							 			switch(c1)	
										{
										case 'y':monitor10k20k(); b=false; break;
										case 'n':monitor(); b=false; break;
							 			default : System.out.print("Please enter valid option: ");
										}
							 		  }while(b==true);break;
							 case 'n':
								 {
									 System.out.print("Do you want to see another model in this budget [y/n or Y/N]  :"); 
										do
										{
											char c1=sc.next().toLowerCase().charAt(0);
										switch(c1)	
										{
										case 'y':monitor10k20k(); b=false; break;
										case 'n':{
											System.out.print("Do you want to continue in between 10k - 20k budget [y/n or Y/N] :");
											do 
											{
												char c2=sc.next().toLowerCase().charAt(0);
												switch(c2)
												{
												case 'y': monitor10k20k(); b=false; break;
												case 'n': monitor(); b=false; break;
												default:System.out.print("Please enter valid option:"); 
												}
											}while(b==true); b=false; break;
										        }
										default:System.out.print("Please enter valid option:");
										}
										}while(b==true); b=false; break;
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
						   char c=sc.next().toLowerCase().charAt(0);
						   switch(c)
						   {
						   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="VIEWSONIC VX2458-C-MHD";ob1[i++]= 14450;
						   System.out.println("Do you want to continue shopping between 10k -20k budget [y/n or Y/N] :");
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);
							   switch(c1)	
							   {
							   case 'y':monitor10k20k(); b=false; break;
							   case 'n':monitor(); b=false; break;
							   default : System.out.print("Please enter valid option: ");
							   }
						   }while(b==true);break;
						   case 'n':
						   {
							   System.out.print("Do you want to see another model in this budget [y/n or Y/N]  :"); 
							   do
							   {
								   char c1=sc.next().toLowerCase().charAt(0);
								   switch(c1)	
								   {
								   case 'y':monitor10k20k(); b=false; break;
								   case 'n':{
									   System.out.print("Do you want to continue in between 10k - 20k budget [y/n or Y/N] :");
									   do 
									   {
										   char c2=sc.next().toLowerCase().charAt(0);
										   switch(c2)
										   {
										   case 'y': monitor10k20k(); b=false; break;
										   case 'n': monitor(); b=false; break;
										   default:System.out.print("Please enter valid option:"); 
										   }
									   }while(b==true); b=false; break;
								   }
								   default:System.out.print("Please enter valid option:");
								   }
							   }while(b==true); b=false; break;
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
						   char c=sc.next().toLowerCase().charAt(0);
						   switch(c)
						   {
						   case 'y':System.out.println("Your Item is added to cart .");ob[i]="SAMSUNG LC24F392FHWXXL";ob1[i++]=15090;
						   System.out.println("Do you want to continue shopping between 10k -20k budget [y/n or Y/N] :");
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);
							   switch(c1)	
							   {
							   case 'y':monitor10k20k(); b=false; break;
							   case 'n':monitor(); b=false; break;
							   default : System.out.print("Please enter valid option: ");
							   }
						   }while(b==true);break;
						   case 'n':
						   {
							   System.out.print("Do you want to see another model in this budget [y/n or Y/N]  :"); 
							   do
							   {
								   char c1=sc.next().toLowerCase().charAt(0);
								   switch(c1)	
								   {
								   case 'y':monitor10k20k(); b=false; break;
								   case 'n':{
									   System.out.print("Do you want to continue in between 10k - 20k budget [y/n or Y/N] :");
									   do 
									   {
										   char c2=sc.next().toLowerCase().charAt(0);
										   switch(c2)
										   {
										   case 'y': monitor10k20k(); b=false; break;
										   case 'n': monitor(); b=false; break;
										   default:System.out.print("Please enter valid option:"); 
										   }
									   }while(b==true); b=false; break;
								   }
								   default:System.out.print("Please enter valid option:");
								   }
							   }while(b==true); b=false; break;
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
						   char c=sc.next().toLowerCase().charAt(0);
						   switch(c)
						   {
						   case 'y':System.out.println("Your Item is added to cart .");ob[i]="LG ULTRAGEAR 24GN600 MONITOR";ob1[i++]=  17450;
						   System.out.println("Do you want to continue shopping between 10k -20k budget [y/n or Y/N] :");
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);
							   switch(c1)	
							   {
							   case 'y':monitor10k20k(); b=false; break;
							   case 'n':monitor(); b=false; break;
							   default : System.out.print("Please enter valid option: ");
							   }
						   }while(b==true);break;
						   case 'n':
						   {
							   System.out.print("Do you want to see another model in this budget [y/n or Y/N]  :"); 
							   do
							   {
								   char c1=sc.next().toLowerCase().charAt(0);
								   switch(c1)	
								   {
								   case 'y':monitor10k20k(); b=false; break;
								   case 'n':{
									   System.out.print("Do you want to continue in between 10k - 20k budget [y/n or Y/N] :");
									   do 
									   {
										   char c2=sc.next().toLowerCase().charAt(0);
										   switch(c2)
										   {
										   case 'y': monitor10k20k(); b=false; break;
										   case 'n': monitor(); b=false; break;
										   default:System.out.print("Please enter valid option:"); 
										   }
									   }while(b==true); b=false; break;
								   }
								   default:System.out.print("Please enter valid option:");
								   }
							   }while(b==true); b=false; break;
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
						   char c=sc.next().toLowerCase().charAt(0);
						   switch(c)
						   {
						   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="ASUS VG259QR MONITOR";ob1[i++]=16590;
						   System.out.println("Do you want to continue shopping between 10k -20k budget [y/n or Y/N] :");
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);
							   switch(c1)	
							   {
							   case 'y':monitor10k20k(); b=false; break;
							   case 'n':monitor(); b=false; break;
							   default : System.out.print("Please enter valid option: ");
							   }
						   }while(b==true);break;
						   case 'n':
						   {
							   System.out.print("Do you want to see another model in this budget [y/n or Y/N]  :"); 
							   do
							   {
								   char c1=sc.next().toLowerCase().charAt(0);
								   switch(c1)	
								   {
								   case 'y':monitor10k20k(); b=false; break;
								   case 'n':{
									   System.out.print("Do you want to continue in between 10k - 20k budget [y/n or Y/N] :");
									   do 
									   {
										   char c2=sc.next().toLowerCase().charAt(0);
										   switch(c2)
										   {
										   case 'y': monitor10k20k(); b=false; break;
										   case 'n': monitor(); b=false; break;
										   default:System.out.print("Please enter valid option:"); 
										   }
									   }while(b==true); b=false; break;
								   }
								   default:System.out.print("Please enter valid option:");
								   }
							   }while(b==true); b=false; break;
						   }
						   default:  System.out.print("Please enter valid option:");
						   
						   }
					   }while(b==true);  b=false; break; 
				   }
				   case 6:monitor(); b=false; break;
				   default: System.out.print("PLEASE ENTER VALID OPTION: ");
				   }
			   }while(b==true);
		}
	//==================================================================================================	
//		public static void main(String[] args) 
//		{
//			monitor();
//		}

	}

	//======================================================================================================================================================================================


