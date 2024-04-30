package television;

import java.util.Scanner;

import home_screen.Main_Home;

public class Television 
{
	public static String ob[]=new String[100];
	public static float ob1[]=new float[100];static int i=0;
    static Scanner sc=new Scanner(System.in);private static final String RESET = "\033[0m";  // Text ResetS
    static boolean b = true;
    public static void tvList()
    { System.out.println(RESET);
    	System.out.println("\t\t\t\t\t\t"+" ___________________________________________________________");
		System.out.println("\t\t\t\t\t\t"+"|  _______________________________________________________  |");
		System.out.println("\t\t\t\t\t\t"+"| |                                                       | |");
		System.out.println("\t\t\t\t\t\t"+"| |                                                       | |");
		System.out.println("\t\t\t\t\t\t"+"| |                                                       | |");
		System.out.println("\t\t\t\t\t\t"+"| |                                                       | |");
		System.out.println("\t\t\t\t\t\t"+"| |                     * TELEVISION *                    | |");
		System.out.println("\t\t\t\t\t\t"+"| |                   ------------------                  | |");
		System.out.println("\t\t\t\t\t\t"+"| |                       1. LG                           | |");
		System.out.println("\t\t\t\t\t\t"+"| |                       2. SAMSUNG                      | |");
		System.out.println("\t\t\t\t\t\t"+"| |                       3. SONY                         | |");
		System.out.println("\t\t\t\t\t\t"+"| |                       4. XIOAMI                       | |");
		System.out.println("\t\t\t\t\t\t"+"| |                       5. REALME                       | |");
		System.out.println("\t\t\t\t\t\t"+"| |                       6. PANASONIC                    | |");
		System.out.println("\t\t\t\t\t\t"+"| |                       7. EXIT                         | |");
		System.out.println("\t\t\t\t\t\t"+"| |                                                       | |");
		System.out.println("\t\t\t\t\t\t"+"| |                                                       | |");
		System.out.println("\t\t\t\t\t\t"+"| |                                                       | |");
		System.out.println("\t\t\t\t\t\t"+"| |_______________________________________________________| |");
		System.out.println("\t\t\t\t\t\t"+"|___________________________________________________________|");
		System.out.println("\t\t\t\t\t\t"+"                        / /        \\ \\ ");
		System.out.println("\t\t\t\t\t\t"+"                       / /          \\ \\");
		 System.out.println(RESET); purchase();
    } 
    public static void purchase()
	{
		System.out.print("PLEASE SELECT YOUR PREFERRED BRAND : ");
		boolean b=true;
		do
		{
			int c=sc.nextInt();
			switch(c)
			{
			case 1:lgTv(); b=false; break;
			case 2:samsungTv(); b=false; break;
			case 3:sonyTv();;  b=false; break;
			case 4:xioamiTv();;  b=false;  break;
			case 5:realmeTv();  b=false;  break;
			case 6:panasonicTv();   b=false;  break;
			case 7:Main_Home.television();;;;b=false;  break;
			default: 
				{
					System.out.println();
					System.out.print("\t\t\t\t\t\t\t\t     "+"PLEASE ENTER VALID OPTION..."+"\n");
					System.out.println();
					tvList();
				}
			}
		}while(b==true);
		
	}
     public static void lgTv()
     { System.out.println(RESET);
    	 System.out.println("\t\t\t\t\t\t"+"                          LG                            ");
    	 System.out.println("\t\t\t\t\t\t"+"                      -------------                      ");
    	 System.out.println("\t\t\t\t\t\t"+"                    1) BELOW 40 INCHES                      ");
    	 System.out.println("\t\t\t\t\t\t"+"                    2) BETWEEN 40 - 50 INCHES                   ");
    	 System.out.println("\t\t\t\t\t\t"+"                    3) ABOVE 50 INCHES                   ");
    	 System.out.println("\t\t\t\t\t\t"+"                    4) EXIT                   ");
    	     	 
    	 System.out.print("PLEASE SELECT YOUR PREFERRED MODEL :"); System.out.println(RESET);
    	 do
    	 {
    		 int p=sc.nextInt();
    		 switch(p) 
    		 {
    		 case 1: lgTv1Display();; b=false; break;
    		 case 2: lgTv2Display(); b=false; break;
    		 case 3: lgTv3Display();;b=false; break;
    		 case 4: tvList();b=false; break;
    		 default:
    		 {
    			 System.out.println("Please enter valid option.");
    			 lgTv(); 
    		 }
    		 }
    	 }while(b==true);
     }
     public static void lgTv1Display()
     {  System.out.println(RESET);
		    System.out.println("     __________________________________________________________________________________________________________________________________________________");
	        System.out.println("    |  ________________________________    ________________________________    _________________________________    _________________________________  |");
	        System.out.println("    | |         LG 32LM563BPTC         |  |         LG 32LT340CBTB         |  |         LG 32LM562BPTA          |  |         LG 32LK536BPTB          | |");
	        System.out.println("    | |--------------------------------|  |--------------------------------|  |---------------------------------|  |---------------------------------| |");
	        System.out.println("    | | Inches : 32 Inches (82 CM)     |  | Inches : 32 inches (82 CM)     |  | Inches  : 32 inches (82 CM)     |  | Inches  : 32 inches (82 CM)     | |");
	        System.out.println("    | | Display: LED HD                |  | Display: LED HD                |  | Display : LED HD                |  | Display : LED HD                | |");
	        System.out.println("    | | Pixels : 4K,3480*2160 Display  |  | Pixels : 4K,3480*2160 Display  |  | Pixels  : 4K,3480*2160 Display  |  | Pixels  : 4K,3480*2160 Display  | |");
	        System.out.println("    | | Connections: Wifi,Internet     |  | Connections: Wifi,Internet     |  | Connections: Wifi,Internet      |  | Connections: Wifi,Internet      | |");
	        System.out.println("    | | Port   : 2 Usb Ports           |  | Port   : 2 Usb Ports           |  | Port    : 2 Usb Ports           |  | Port    : 2 Usb Ports           | |");
	        System.out.println("    | | Type   : Smart TV              |  | Type   : Smart TV              |  | Type    : Smart TV              |  | Type    : Smart TV              | |");
	        System.out.println("    | | PRICE  : Rs18,999/-            |  | PRICE  : Rs18,999/-            |  | PRICE   : Rs19,999/-            |  | PRICE   : Rs21,999/-            | |");
	        System.out.println("    | |________________________________|  |________________________________|  |_________________________________|  |_________________________________| |");
	        System.out.println("    |                                                                                                                                                  |");
	        System.out.println("    |               1.                                   2.                                 3.                                    4.                   |");
	        System.out.println("    |  ________________________________    ________________________________    _________________________________    _________________________________  |");
	        System.out.println("    | |          LG 40LF6300           |  |         LG 401JF672T           |  |          LG 42LW4500            |  |         LG 55UN7350P            | |");
	        System.out.println("    | |--------------------------------|  |--------------------------------|  |---------------------------------|  |---------------------------------| |");
	        System.out.println("    | | Inches  : 40 inches (106 cm)   |  | Inches  : 40 inches (101 cm)   |  | Inches  : 38 inches (127 cm)    |  | Inches  : 24 inches (127 cm)    | |");
	        System.out.println("    | | Display : LED HD               |  | Display : LED HD               |  | Display : LED HD                |  | Display : LED HD                | |");
	        System.out.println("    | | Pixels  : 4K,3480*2160 display |  | Pixels  : 4K,3480*2160 display |  | Pixels  : 4K,3480*2160 display  |  | Pixels  : 4K,3480*2160 display  | |");
	        System.out.println("    | | Connections : wifi,Internet    |  | Connections : wifi,Internet    |  | Connections : wifi,Internet     |  | Connections : wifi,Internet     | |");
	        System.out.println("    | | Port    : 2 usb ports          |  | Port    : 2 usb ports          |  | Port    : 2 usb ports           |  | Port    : 2 usb ports           | |");
	        System.out.println("    | | Type    : LED Full HD TV       |  | Type    : LED 4K TV            |  | Type    : LED Full HD TV        |  | Type    : LED 4k TV             | |");
	        System.out.println("    | | Price   : Rs28,999/-           |  | Price   : Rs16,999/-           |  | Price   : Rs19,999/-            |  | Price   : Rs21,999/-            | |");
	        System.out.println("    | |________________________________|  |________________________________|  |_________________________________|  |_________________________________| |");
	        System.out.println("    |                                                                                                                                                  |");
	        System.out.println("    |               5.                                   6.                                   7.                                    8.                 |");
	        System.out.println("    |                                                              _______________________                                                             |");
	        System.out.println("    |                                                             |                       |                                                            |");
	        System.out.println("    |                                                             |       9.EXIT          |                                                            |");
	        System.out.println("    |                                                             |_______________________|                                                            |");
	        System.out.println("    |__________________________________________________________________________________________________________________________________________________|");
	        
	        System.out.println(RESET); lgTv1();
     }
     public static void lgTv1()
     {
    	 System.out.println("PLEASE CHOOSE YOUR PREFERRED MODEL :");
		   do
		   {
			   int m=sc.nextInt();
			   switch(m)
			   {
			   case 1:
			   {
				   System.out.print("Do you want to add it to cart [y/n or Y/N]:"); //CHUSKO KANNA
					 do
					 {
						 char c=sc.next().toLowerCase().charAt(0);           //CHUSKO KANNA
						 switch(c)
						 {
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="LG 32INCHES TV";ob1[i++]=18999; 
						 		  System.out.println("Do you want to continue in Below 40 Inches [y/n or Y/N] :");  //CHUSKO KANNA
						 		  do
						 		  {
						 			char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						 			switch(c1)	
									{
									case 'y':lgTv1Display(); b=false; break;
									case 'n':lgTv(); b=false; break;
						 			default : System.out.print("Please enter valid option: ");
									}
						 		  }while(b==true);b=false; break;
						 case 'n':
							 {
								 System.out.print("Do you want to see another model in Below 40 Inches [y/n or Y/N]:");   //CHUSKO KANNA
									do
									{
										char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									switch(c1)	
									{
									case 'y':lgTv1Display(); b=false; break;
									case 'n':{
										System.out.print("Do you want to continue in this brand (LG) [y/n or Y/N]:");  //CHUSKO KANNA
										do 
										{
											char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
											switch(c2)
											{
											case 'y': lgTv(); b=false; break;
											case 'n': tvList(); b=false; break;
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
				   System.out.print("Do you want to add it to cart [y/n or Y/N]:"); //CHUSKO KANNA
				   do
				   {
					   char c=sc.next().toLowerCase().charAt(0);           //CHUSKO KANNA
					   switch(c)
					   {
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="LG 32INCHES TV";ob1[i++]=18999; 
					   System.out.println("Do you want to continue in Below 40 Inches [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':lgTv1Display(); b=false; break;
						   case 'n':lgTv(); b=false; break;
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in Below 40 Inches [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':lgTv1Display(); b=false; break;
							   case 'n':{
								   System.out.print("Do you want to continue in this brand (LG) [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': lgTv(); b=false; break;
									   case 'n': tvList(); b=false; break;
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
				   System.out.print("Do you want to add it to cart [y/n or Y/N]:"); //CHUSKO KANNA
				   do
				   {
					   char c=sc.next().toLowerCase().charAt(0);           //CHUSKO KANNA
					   switch(c)
					   {
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="LG 32INCHES TV";ob1[i++]=19999; 
					   System.out.println("Do you want to continue in Below 40 Inches [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':lgTv1Display(); b=false; break;
						   case 'n':lgTv(); b=false; break;
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in Below 40 Inches [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':lgTv1Display(); b=false; break;
							   case 'n':{
								   System.out.print("Do you want to continue in this brand (LG) [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': lgTv(); b=false; break;
									   case 'n': tvList(); b=false; break;
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
				   System.out.print("Do you want to add it to cart [y/n or Y/N]:"); //CHUSKO KANNA
				   do
				   {
					   char c=sc.next().toLowerCase().charAt(0);           //CHUSKO KANNA
					   switch(c)
					   {
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="LG 32INCHES TV";ob1[i++]=21999; 
					   System.out.println("Do you want to continue in Below 40 Inches [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':lgTv1Display(); b=false; break;
						   case 'n':lgTv(); b=false; break;
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in Below 40 Inches [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':lgTv1Display(); b=false; break;
							   case 'n':{
								   System.out.print("Do you want to continue in this brand (LG) [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': lgTv(); b=false; break;
									   case 'n': tvList(); b=false; break;
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
				   System.out.print("Do you want to add it to cart [y/n or Y/N]:"); //CHUSKO KANNA
				   do
				   {
					   char c=sc.next().toLowerCase().charAt(0);           //CHUSKO KANNA
					   switch(c)
					   {
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="LG 40INCHES TV";ob1[i++]=28999; 
					   System.out.println("Do you want to continue in Below 40 Inches [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':lgTv1Display(); b=false; break;
						   case 'n':lgTv(); b=false; break;
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in Below 40 Inches [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':lgTv1Display(); b=false; break;
							   case 'n':{
								   System.out.print("Do you want to continue in this brand (LG) [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': lgTv(); b=false; break;
									   case 'n': tvList(); b=false; break;
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
			   case 6:
			   {
				   System.out.print("Do you want to add it to cart [y/n or Y/N]:"); //CHUSKO KANNA
				   do
				   {
					   char c=sc.next().toLowerCase().charAt(0);           //CHUSKO KANNA
					   switch(c)
					   {
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="LG 40INCHES TV";ob1[i++]=16999; 
					   System.out.println("Do you want to continue in Below 40 Inches [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':lgTv1Display(); b=false; break;
						   case 'n':lgTv(); b=false; break;
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in Below 40 Inches [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':lgTv1Display(); b=false; break;
							   case 'n':{
								   System.out.print("Do you want to continue in this brand (LG) [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': lgTv(); b=false; break;
									   case 'n': tvList(); b=false; break;
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
			   case 7:
			   {
				   System.out.print("Do you want to add it to cart [y/n or Y/N]:"); //CHUSKO KANNA
				   do
				   {
					   char c=sc.next().toLowerCase().charAt(0);           //CHUSKO KANNA
					   switch(c)
					   {
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="LG 42INCHES TV";ob1[i++]=19999; 
					   System.out.println("Do you want to continue in Below 40 Inches [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':lgTv1Display(); b=false; break;
						   case 'n':lgTv(); b=false; break;
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in Below 40 Inches [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':lgTv1Display(); b=false; break;
							   case 'n':{
								   System.out.print("Do you want to continue in this brand (LG) [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': lgTv(); b=false; break;
									   case 'n': tvList(); b=false; break;
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
			   case 8:
			   {
				   System.out.print("Do you want to add it to cart [y/n or Y/N]:"); //CHUSKO KANNA
				   do
				   {
					   char c=sc.next().toLowerCase().charAt(0);           //CHUSKO KANNA
					   switch(c)
					   {
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="LG 24INCHES TV";ob1[i++]=21999; 
					   System.out.println("Do you want to continue in Below 40 Inches [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':lgTv1Display(); b=false; break;
						   case 'n':lgTv(); b=false; break;
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in Below 40 Inches [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':lgTv1Display(); b=false; break;
							   case 'n':{
								   System.out.print("Do you want to continue in this brand (LG) [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': lgTv(); b=false; break;
									   case 'n': tvList(); b=false; break;
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
			   case 9:lgTv(); b=false; break;
			   default: System.out.print("PLEASE ENTER VALID OPTION: ");
			   }
		   }while(b==true);
     }
     public static void lgTv2Display()
     { System.out.println(RESET);
	        System.out.println("     __________________________________________________________________________________________________________________________________________________");
	        System.out.println("    |  ________________________________    ________________________________    _________________________________    _________________________________  |");
	        System.out.println("    | |         LG 55UQ7500P           |  |         LG SSUP7500P           |  |         LG SOUQ8040P            |  |         LG 42LF553A             | |");
	        System.out.println("    | |--------------------------------|  |--------------------------------|  |---------------------------------|  |---------------------------------| |");
	        System.out.println("    | | Inches  : 40 inches (101 cm)   |  | Inches  : 40 inches (101 cm)   |  | Inches  : 42 inches (106 cm)    |  | Inches  : 42 inches (106 cm)    | |");
	        System.out.println("    | | Display : LED HD               |  | Display : LED HD               |  | Display : LED HD                |  | Display : LED HD                | |");
	        System.out.println("    | | Pixels  : 4K,3480*2160 display |  | Pixels  : 4K,3480*2160 display |  | Pixels  : 4K,3480*2160 display  |  | Pixels  : 4K,3480*2160 display  | |");
	        System.out.println("    | | Connections: wifi,Internet     |  | Connections : wifi,Internet    |  | Connections : wifi,Internet     |  | Connections : wifi,Internet     | |");
	        System.out.println("    | | Port    : 2 usb ports          |  | Port    : 2 usb ports          |  | Port    : 2 usb ports           |  | Port    : 2 usb ports           | |");
	        System.out.println("    | | Type    : Smart TV             |  | Type    : LED 4K TV            |  | Type    : Smart TV              |  | Type    : LED Full HD TV        | |");
	        System.out.println("    | | Price   : Rs18,999/-           |  | Price   : Rs28,999/-           |  | Price   : Rs38,999/-            |  | Price   : Rs48,999/-            | |");
	        System.out.println("    | |________________________________|  |________________________________|  |_________________________________|  |_________________________________| |");
	        System.out.println("    |                                                                                                                                                  |");
	        System.out.println("    |               1.                                   2.                                   3.                                    4.                 |");
	        System.out.println("    |  ________________________________    ________________________________    _________________________________    _________________________________  |");
	        System.out.println("    | |          LG 40LF6300           |  |         LG 401JF672T           |  |          LG 42LW4500            |  |         LG 55UN7350P            | |");
	        System.out.println("    | |--------------------------------|  |--------------------------------|  |---------------------------------|  |---------------------------------| |");
	        System.out.println("    | | Inches  : 42 inches (106 cm)   |  | Inches  : 40 inches (101 cm)   |  | Inches  : 50 inches (127 cm)    |  | Inches  : 50 inches (127 cm)    | |");
	        System.out.println("    | | Display : LED HD               |  | Display : LED HD               |  | Display : LED HD                |  | Display : LED HD                | |");
	        System.out.println("    | | Pixels  : 4K,3480*2160 display |  | Pixels  : 4K,3480*2160 display |  | Pixels  : 4K,3480*2160 display  |  | Pixels  : 4K,3480*2160 display  | |");
	        System.out.println("    | | Connections : wifi,Internet    |  | Connections : wifi,Internet    |  | Connections : wifi,Internet     |  | Connections : wifi,Internet     | |");
	        System.out.println("    | | Port    : 2 usb ports          |  | Port    : 2 usb ports          |  | Port    : 2 usb ports           |  | Port    : 2 usb ports           | |");
	        System.out.println("    | | Type    : LED Full HD TV       |  | Type    : LED 4K TV            |  | Type    : LED Full HD TV        |  | Type    : LED 4k TV             | |");
	        System.out.println("    | | Price   : Rs58,999/-           |  | Price   : Rs58,999/-           |  | Price   : Rs59,999/-            |  | Price   : Rs59,999/-            | |");
	        System.out.println("    | |________________________________|  |________________________________|  |_________________________________|  |_________________________________| |");
	        System.out.println("    |                                                                                                                                                  |");
	        System.out.println("    |               5.                                   6.                                   7.                                    8.                 |");
	        System.out.println("    |                                                              _______________________                                                             |");
	        System.out.println("    |                                                             |                       |                                                            |");
	        System.out.println("    |                                                             |       9.EXIT          |                                                            |");
	        System.out.println("    |                                                             |_______________________|                                                            |");
	        System.out.println("    |__________________________________________________________________________________________________________________________________________________|");
	        
	        System.out.println(RESET); lgTv2();
     }
     public static void lgTv2()
     {
    	 System.out.println("PLEASE CHOOSE YOUR PREFERRED MODEL :");
		   do
		   {
			   int m=sc.nextInt();
			   switch(m)
			   {
			   case 1:
			   {
				   System.out.print("Do you want to add it to cart [y/n or Y/N]:"); //CHUSKO KANNA
					 do
					 {
						 char c=sc.next().toLowerCase().charAt(0);           //CHUSKO KANNA
						 switch(c)
						 {
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="LG 40INCHES TV";ob1[i++]=18999; 
						 		  System.out.println("Do you want to continue in Between 40 - 50 Inches [y/n or Y/N] :");  //CHUSKO KANNA
						 		  do
						 		  {
						 			char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						 			switch(c1)	
									{
									case 'y':lgTv2Display(); b=false; break;
									case 'n':lgTv(); b=false; break;
						 			default : System.out.print("Please enter valid option: ");
									}
						 		  }while(b==true);b=false; break;
						 case 'n':
							 {
								 System.out.print("Do you want to see another model in Between 40 - 50 Inches [y/n or Y/N]:");   //CHUSKO KANNA
									do
									{
										char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									switch(c1)	
									{
									case 'y':lgTv2Display(); b=false; break; //CHUSKO KANNA
									case 'n':{
										System.out.print("Do you want to continue in this brand (LG) [y/n or Y/N]:");  //CHUSKO KANNA
										do 
										{
											char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
											switch(c2)
											{
											case 'y': lgTv(); b=false; break;
											case 'n': tvList(); b=false; break;
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
				   System.out.print("Do you want to add it to cart [y/n or Y/N]:"); //CHUSKO KANNA
				   do
				   {
					   char c=sc.next().toLowerCase().charAt(0);           //CHUSKO KANNA
					   switch(c)
					   {
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="LG 40INCHES TV";ob1[i++]=28999; 
					   System.out.println("Do you want to continue in Between 40 - 50 Inches [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':lgTv2Display(); b=false; break;
						   case 'n':lgTv(); b=false; break;
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in Between 40 - 50 Inches [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':lgTv2Display(); b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand (LG) [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': lgTv(); b=false; break;
									   case 'n': tvList(); b=false; break;
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
				   System.out.print("Do you want to add it to cart [y/n or Y/N]:"); //CHUSKO KANNA
				   do
				   {
					   char c=sc.next().toLowerCase().charAt(0);           //CHUSKO KANNA
					   switch(c)
					   {
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="LG 42INCHES TV";ob1[i++]=38999; 
					   System.out.println("Do you want to continue in Between 40 - 50 Inches [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':lgTv2Display(); b=false; break;
						   case 'n':lgTv(); b=false; break;
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in Between 40 - 50 Inches [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':lgTv2Display(); b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand (LG) [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': lgTv(); b=false; break;
									   case 'n': tvList(); b=false; break;
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
				   System.out.print("Do you want to add it to cart [y/n or Y/N]:"); //CHUSKO KANNA
				   do
				   {
					   char c=sc.next().toLowerCase().charAt(0);           //CHUSKO KANNA
					   switch(c)
					   {
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="LG 42INCHES TV";ob1[i++]=48999; 
					   System.out.println("Do you want to continue in Between 40 - 50 Inches [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':lgTv2Display(); b=false; break;
						   case 'n':lgTv(); b=false; break;
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in Between 40 - 50 Inches [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':lgTv2Display(); b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand (LG) [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': lgTv(); b=false; break;
									   case 'n': tvList(); b=false; break;
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
				   System.out.print("Do you want to add it to cart [y/n or Y/N]:"); //CHUSKO KANNA
				   do
				   {
					   char c=sc.next().toLowerCase().charAt(0);           //CHUSKO KANNA
					   switch(c)
					   {
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="LG 42INCHES TV";ob1[i++]=58999; 
					   System.out.println("Do you want to continue in Between 40 - 50 Inches [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':lgTv2Display(); b=false; break;
						   case 'n':lgTv(); b=false; break;
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in Between 40 - 50 Inches [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':lgTv2Display(); b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand (LG) [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': lgTv(); b=false; break;
									   case 'n': tvList(); b=false; break;
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
			   case 6:
			   {
				   System.out.print("Do you want to add it to cart [y/n or Y/N]:"); //CHUSKO KANNA
				   do
				   {
					   char c=sc.next().toLowerCase().charAt(0);           //CHUSKO KANNA
					   switch(c)
					   {
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="LG 40INCHES TV";ob1[i++]=58999; 
					   System.out.println("Do you want to continue in Between 40 - 50 Inches [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':lgTv2Display(); b=false; break;
						   case 'n':lgTv(); b=false; break;
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in Between 40 - 50 Inches [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':lgTv2Display(); b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand (LG) [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': lgTv(); b=false; break;
									   case 'n': tvList(); b=false; break;
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
			   case 7:
			   {
				   System.out.print("Do you want to add it to cart [y/n or Y/N]:"); //CHUSKO KANNA
				   do
				   {
					   char c=sc.next().toLowerCase().charAt(0);           //CHUSKO KANNA
					   switch(c)
					   {
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="LG 50INCHES TV";ob1[i++]=59999; 
					   System.out.println("Do you want to continue in Between 40 - 50 Inches [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':lgTv2Display(); b=false; break;
						   case 'n':lgTv(); b=false; break;
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in Between 40 - 50 Inches [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':lgTv2Display(); b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand (LG) [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': lgTv(); b=false; break;
									   case 'n': tvList(); b=false; break;
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
			   case 8:
			   {
				   System.out.print("Do you want to add it to cart [y/n or Y/N]:"); //CHUSKO KANNA
				   do
				   {
					   char c=sc.next().toLowerCase().charAt(0);           //CHUSKO KANNA
					   switch(c)
					   {
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="LG 50INCHES TV";ob1[i++]=59999; 
					   System.out.println("Do you want to continue in Between 40 - 50 Inches [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':lgTv2Display(); b=false; break;
						   case 'n':lgTv(); b=false; break;
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in Between 40 - 50 Inches [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':lgTv2Display(); b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand (LG) [y/n or Y/N]:");  //CHUSKO KANNA BRAND PERU MARCHALI
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': lgTv(); b=false; break; //CHUSKO KANNA BRAND METHOD MARCHALI 
									   case 'n': tvList(); b=false; break;
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
			   case 9:lgTv(); b=false; break;  //CHUSKO KANNA BRAND METHOD MARCHALI 
			   default: System.out.print("PLEASE ENTER VALID OPTION: ");
			   }
		   }while(b==true);
     }
     public static void lgTv3Display()
     {  System.out.println(RESET);
	        System.out.println("     __________________________________________________________________________________________________________________________________________________");
	        System.out.println("    |  ________________________________    ________________________________    _________________________________    _________________________________  |");
	        System.out.println("    | |          LG 55NAN083TP         |  |         LG 55NAN091TN          |  |         LG SOUN7300PT           |  |         LG SSSK8SOOPT           | |");
	        System.out.println("    | |--------------------------------|  |--------------------------------|  |---------------------------------|  |---------------------------------| |");
	        System.out.println("    | | Inches  : 55 inches (139 cm)   |  | Inches  : 55 inches (139 cm)   |  | Inches  : 55 inches (139 cm)    |  | Inches  : 55 inches (139 cm)    | |");
	        System.out.println("    | | Display : LED HD               |  | Display : LED HD               |  | Display : LED HD                |  | Display : LED HD                | |");
	        System.out.println("    | | Pixels  : 4K,3480*2160 display |  | Pixels  : 4K,3480*2160 display |  | Pixels  : 4K,3480*2160 display  |  | Pixels  : 4K,3480*2160 display  | |");
	        System.out.println("    | | Connections : wifi,Internet    |  | Connections : wifi,Internet    |  | Connections : wifi,Internet     |  | Connections : wifi,Internet     | |");
	        System.out.println("    | | Port    : 2 usb ports          |  | Port    : 2 usb ports          |  | Port    : 2 usb ports           |  | Port    : 2 usb ports           | |");
	        System.out.println("    | | Type    : LED 4k TV            |  | Type    : LED 4k TV            |  | Type    : LED 4k TV             |  | Type    : LED 4k TV             | |");
	        System.out.println("    | | Price   : Rs28,999/-           |  | Price   : Rs39,999/-           |  | Price   : Rs28,999/-            |  | Price   : Rs29,999/-            | |");
	        System.out.println("    | |________________________________|  |________________________________|  |_________________________________|  |_________________________________| |");
	        System.out.println("    |                                                                                                                                                  |");
	        System.out.println("    |               1.                                   2.                                 3.                                    4.                   |");
	        System.out.println("    |  ________________________________    ________________________________    _________________________________    _________________________________  |");
	        System.out.println("    | |         LG SOUQ80SOPS          |  |        LG 55UQ8020PSB          |  |         LG SSUQ8040PS           |  |           LG SOUN7300PT         | |");
	        System.out.println("    | |--------------------------------|  |--------------------------------|  |---------------------------------|  |---------------------------------| |");
	        System.out.println("    | | Inches  : 65 inches (165 cm)   |  | Inches  : 65 inches (165 cm)   |  | Inches  : 65 inches (165 cm)    |  | Inches  : 65 inches (165 cm)    | |");
	        System.out.println("    | | Display : LED HD               |  | Display : LED HD               |  | Display : LED HD                |  | Display : LED HD                | |");
	        System.out.println("    | | Pixels  : 4K,3480*2160 display |  | Pixels  : 4K,3480*2160 display |  | Pixels  : 4K,3480*2160 display  |  | Pixels  : 4K,3480*2160 display  | |");
	        System.out.println("    | | Connections : wifi,Internet    |  | Connections : wifi,Internet    |  | Connections : wifi,Internet     |  | Connections : wifi,Internet     | |");
	        System.out.println("    | | Port    : 2 usb ports          |  | Port    : 2 usb ports          |  | Port    : 2 usb ports           |  | Port    : 2 usb ports           | |");
	        System.out.println("    | | Type    : LED 4k TV            |  | Type    : LED 4k TV            |  | Type    : LED 4k TV             |  | Type    : LED 4k TV             | |");
	        System.out.println("    | | Price   : Rs59,999/-           |  | Price   : Rs60,999/-           |  | Price   : Rs72,999/-            |  | Price   : Rs78,999/-            | |");
	        System.out.println("    | |________________________________|  |________________________________|  |_________________________________|  |_________________________________| |");
	        System.out.println("    |                                                                                                                                                  |");
	        System.out.println("    |               5.                                   6.                                    7.                                    8.                |");
	        System.out.println("    |                                                              _______________________                                                             |");
	        System.out.println("    |                                                             |                       |                                                            |");
	        System.out.println("    |                                                             |       9.EXIT          |                                                            |");
	        System.out.println("    |                                                             |_______________________|                                                            |");
	        System.out.println("    |__________________________________________________________________________________________________________________________________________________|");
	        
	        System.out.println(RESET); lgTv3();
     }
     public static void lgTv3()
     {
    	 System.out.println("PLEASE CHOOSE YOUR PREFERRED MODEL :");
		   do
		   {
			   int m=sc.nextInt();
			   switch(m)
			   {
			   case 1:
			   {
				   System.out.print("Do you want to add it to cart [y/n or Y/N]:"); //CHUSKO KANNA
					 do
					 {
						 char c=sc.next().toLowerCase().charAt(0);           //CHUSKO KANNA
						 switch(c)
						 {
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="LG 55INCHES TV";ob1[i++]=28999; 
						 		  System.out.println("Do you want to continue in Above 50 Inches [y/n or Y/N] :");  //CHUSKO KANNA
						 		  do
						 		  {
						 			char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						 			switch(c1)	
									{
									case 'y':lgTv3Display(); b=false; break; //CHUSKO KANNA
									case 'n':lgTv(); b=false; break;	 	// CHUSKOOOOOOOOOOOOOOOOOOOOOOOOO
						 			default : System.out.print("Please enter valid option: ");
									}
						 		  }while(b==true);b=false; break;
						 case 'n':
							 {
								 System.out.print("Do you want to see another model in Above 50 Inches [y/n or Y/N]:");   //CHUSKO KANNA
									do
									{
										char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									switch(c1)	
									{
									case 'y':lgTv3Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAAAAAAAAAAAA
									case 'n':{
										System.out.print("Do you want to continue in this brand (LG) [y/n or Y/N]:");  //CHUSKO KANNA NAME MARCHALI
										do 
										{
											char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
											switch(c2)
											{
											case 'y': lgTv(); b=false; break; //CHUSKO KANN BRAND METHOD MARCHALI
											case 'n': tvList(); b=false; break;
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
				   System.out.print("Do you want to add it to cart [y/n or Y/N]:"); //CHUSKO KANNA
				   do
				   {
					   char c=sc.next().toLowerCase().charAt(0);           //CHUSKO KANNA
					   switch(c)
					   {
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="LG 55INCHES TV";ob1[i++]=39999; 
					   System.out.println("Do you want to continue in Above 50 Inches [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':lgTv3Display(); b=false; break; //CHUSKO KANNA
						   case 'n':lgTv(); b=false; break;	 	// CHUSKOOOOOOOOOOOOOOOOOOOOOOOOO
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in Above 50 Inches [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':lgTv3Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAAAAAAAAAAAA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand (LG) [y/n or Y/N]:");  //CHUSKO KANNA NAME MARCHALI
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': lgTv(); b=false; break; //CHUSKO KANN BRAND METHOD MARCHALI
									   case 'n': tvList(); b=false; break;
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
				   System.out.print("Do you want to add it to cart [y/n or Y/N]:"); //CHUSKO KANNA
				   do
				   {
					   char c=sc.next().toLowerCase().charAt(0);           //CHUSKO KANNA
					   switch(c)
					   {
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="LG 55INCHES TV";ob1[i++]=28999; 
					   System.out.println("Do you want to continue in Above 50 Inches [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':lgTv3Display(); b=false; break; //CHUSKO KANNA
						   case 'n':lgTv(); b=false; break;	 	// CHUSKOOOOOOOOOOOOOOOOOOOOOOOOO
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in Above 50 Inches [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':lgTv3Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAAAAAAAAAAAA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand (LG) [y/n or Y/N]:");  //CHUSKO KANNA NAME MARCHALI
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': lgTv(); b=false; break; //CHUSKO KANN BRAND METHOD MARCHALI
									   case 'n': tvList(); b=false; break;
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
				   System.out.print("Do you want to add it to cart [y/n or Y/N]:"); //CHUSKO KANNA
				   do
				   {
					   char c=sc.next().toLowerCase().charAt(0);           //CHUSKO KANNA
					   switch(c)
					   {
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="LG 55INCHES TV";ob1[i++]=29999; 
					   System.out.println("Do you want to continue in Above 50 Inches [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':lgTv3Display(); b=false; break; //CHUSKO KANNA
						   case 'n':lgTv(); b=false; break;	 	// CHUSKOOOOOOOOOOOOOOOOOOOOOOOOO
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in Above 50 Inches [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':lgTv3Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAAAAAAAAAAAA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand (LG) [y/n or Y/N]:");  //CHUSKO KANNA NAME MARCHALI
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': lgTv(); b=false; break; //CHUSKO KANN BRAND METHOD MARCHALI
									   case 'n': tvList(); b=false; break;
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
				   System.out.print("Do you want to add it to cart [y/n or Y/N]:"); //CHUSKO KANNA
				   do
				   {
					   char c=sc.next().toLowerCase().charAt(0);           //CHUSKO KANNA
					   switch(c)
					   {
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="LG 65INCHES TV";ob1[i++]=59999; 
					   System.out.println("Do you want to continue in Above 50 Inches [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':lgTv3Display(); b=false; break; //CHUSKO KANNA
						   case 'n':lgTv(); b=false; break;	 	// CHUSKOOOOOOOOOOOOOOOOOOOOOOOOO
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in Above 50 Inches [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':lgTv3Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAAAAAAAAAAAA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand (LG) [y/n or Y/N]:");  //CHUSKO KANNA NAME MARCHALI
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': lgTv(); b=false; break; //CHUSKO KANN BRAND METHOD MARCHALI
									   case 'n': tvList(); b=false; break;
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
			   case 6:
			   {
				   System.out.print("Do you want to add it to cart [y/n or Y/N]:"); //CHUSKO KANNA
				   do
				   {
					   char c=sc.next().toLowerCase().charAt(0);           //CHUSKO KANNA
					   switch(c)
					   {
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="LG 65INCHES TV";ob1[i++]=60999; 
					   System.out.println("Do you want to continue in Above 50 Inches [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':lgTv3Display(); b=false; break; //CHUSKO KANNA
						   case 'n':lgTv(); b=false; break;	 	// CHUSKOOOOOOOOOOOOOOOOOOOOOOOOO
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in Above 50 Inches [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':lgTv3Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAAAAAAAAAAAA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand (LG) [y/n or Y/N]:");  //CHUSKO KANNA NAME MARCHALI
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': lgTv(); b=false; break; //CHUSKO KANN BRAND METHOD MARCHALI
									   case 'n': tvList(); b=false; break;
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
			   case 7:
			   {
				   System.out.print("Do you want to add it to cart [y/n or Y/N]:"); //CHUSKO KANNA
				   do
				   {
					   char c=sc.next().toLowerCase().charAt(0);           //CHUSKO KANNA
					   switch(c)
					   {
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="LG 65INCHES TV";ob1[i++]=72999; 
					   System.out.println("Do you want to continue in Above 50 Inches [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':lgTv3Display(); b=false; break; //CHUSKO KANNA
						   case 'n':lgTv(); b=false; break;	 	// CHUSKOOOOOOOOOOOOOOOOOOOOOOOOO
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in Above 50 Inches [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':lgTv3Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAAAAAAAAAAAA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand (LG) [y/n or Y/N]:");  //CHUSKO KANNA NAME MARCHALI
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': lgTv(); b=false; break; //CHUSKO KANN BRAND METHOD MARCHALI
									   case 'n': tvList(); b=false; break;
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
			   case 8:
			   {
				   System.out.print("Do you want to add it to cart [y/n or Y/N]:"); //CHUSKO KANNA
				   do
				   {
					   char c=sc.next().toLowerCase().charAt(0);           //CHUSKO KANNA
					   switch(c)
					   {
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="LG 65INCHES TV";ob1[i++]=78999; 
					   System.out.println("Do you want to continue in Above 50 Inches [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':lgTv3Display(); b=false; break; //CHUSKO KANNA
						   case 'n':lgTv(); b=false; break;	 	// CHUSKOOOOOOOOOOOOOOOOOOOOOOOOO
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in Above 50 Inches [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':lgTv3Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAAAAAAAAAAAA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand (LG) [y/n or Y/N]:");  //CHUSKO KANNA NAME MARCHALI
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': lgTv(); b=false; break; //CHUSKO KANN BRAND METHOD MARCHALI
									   case 'n': tvList(); b=false; break;
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
			   case 9:lgTv(); b=false; break;  //CHUSKO KANNA BRAND METHOD MARCHALI 
			   default: System.out.print("PLEASE ENTER VALID OPTION: ");
			   }
		   }while(b==true);
     }
     public static void samsungTv()
     { System.out.println(RESET);
    	 System.out.println("\t\t\t\t\t\t"+"                          SAMSUNG                            ");
    	 System.out.println("\t\t\t\t\t\t"+"                      -------------                      ");
    	 System.out.println("\t\t\t\t\t\t"+"                    1) BELOW 40 INCHES                      ");
    	 System.out.println("\t\t\t\t\t\t"+"                    2) BETWEEN 40 - 50 INCHES                   ");
    	 System.out.println("\t\t\t\t\t\t"+"                    3) ABOVE 50 INCHES                   ");
    	 System.out.println("\t\t\t\t\t\t"+"                    4) EXIT                   ");	 
    	 System.out.print("PLEASE SELECT YOUR PREFERRED MODEL :"); System.out.println(RESET);
	       do
			 {
				int p=sc.nextInt();
				switch(p) 
				{
				case 1: samsungTv1Display();; b=false; break;
				case 2: samsungTv2Display(); b=false; break;
				case 3: samsungTv3Display();;b=false; break;
				case 4: tvList();b=false; break;
			    default:
			    	{
			    		System.out.println("Please enter valid option.");
			    		samsungTv(); 
			    	}
				}
			 }while(b==true);
     }
	 
     public static void samsungTv1Display()
     { System.out.println(RESET);
	 		System.out.println("     __________________________________________________________________________________________________________________________________________________");
	        System.out.println("    |  ________________________________    ________________________________    _________________________________    _________________________________  |");
	        System.out.println("    | |       SAMSUNG UA32T4410A       |  |       SAMSUNG UA32T4050A       |  |       SAMSUNG UA32T4600A        |  |       SAMSUNG UA32T4450A        | |");
		    System.out.println("    | |--------------------------------|  |--------------------------------|  |---------------------------------|  |---------------------------------| |");
	        System.out.println("    | | Inches  : 32 inches (81 cm)    |  | Inches  : 32 inches (81 cm)    |  | Inches  : 32 inches (81 cm)     |  | Inches  : 32 inches (81 cm)     | |");  
	        System.out.println("    | | Display : LED HD               |  | Display : LED HD               |  | Display : LED HD                |  | Display : LED HD                | |");
	        System.out.println("    | | Pixels  : 4K,3480*2160 display |  | Pixels  : 4K,3480*2160 display |  | Pixels  : 4K,3480*2160 display  |  | Pixels  : 4K,3480*2160 display  | |");
	        System.out.println("    | | Connections : wifi,Internet    |  | Connections : wifi,Internet    |  | Connections : wifi,Internet     |  | Connections : wifi,Internet     | |");
	        System.out.println("    | | Port    : 2 usb ports          |  | Port    : 2 usb ports          |  | Port    : 2 usb ports           |  | Port    : 2 usb ports           | |");
	        System.out.println("    | | Type    : LED HD Smart TV      |  | Type    : LED HD Smart TV      |  | Type    : LED HD Smart TV       |  | Type    : LED HD Smart TV       | |");
	        System.out.println("    | | Price   : Rs18,999/-           |  | Price   : Rs19,999/-           |  | Price   : Rs21,999/-            |  | Price   : Rs25,999/-            | |");
		    System.out.println("    | |________________________________|  |________________________________|  |_________________________________|  |_________________________________| |");
	        System.out.println("    |                                                                                                                                                  |");
	        System.out.println("    |               1.                                   2.                                 3.                                    4.                   |");
	        System.out.println("    |  ________________________________    ________________________________    _________________________________    _________________________________  |");
	        System.out.println("    | |       SAMSUNG UA32H4100        |  |       SAMSUNG UA32J4100A       |  |       SAMSUNG UA32T4340A        |  |       SAMSUNG UA32T4380A        | |");
		    System.out.println("    | |--------------------------------|  |--------------------------------|  |---------------------------------|  |---------------------------------| |");
	        System.out.println("    | | Inches  : 32 Inches (81 cm)    |  | Inches  : 32 Inches (81 cm)    |  | Inches  : 32 Inches (81 cm)     |  | Inches  : 32 Inches (81 cm)     | |");
	        System.out.println("    | | Display : LED HD               |  | Display : LED HD               |  | Display : LED HD                |  | Display : LED HD                | |");
	        System.out.println("    | | Pixels  : 4K,3480*2160 display |  | Pixels  : 4K,3480*2160 display |  | Pixels  : 4K,3480*2160 display  |  | Pixels  : 4K,3480*2160 display  | |");
	        System.out.println("    | | Connections : wifi,Internet    |  | Connections : wifi,Internet    |  | Connections : wifi,Internet     |  | Connections : wifi,Internet     | |");
	        System.out.println("    | | Port    : 2 usb ports          |  | Port    : 2 usb ports          |  | Port    : 2 usb ports           |  | Port    : 2 usb ports           | |");
	        System.out.println("    | | Type    : LED HD Smart TV      |  | Type    : LED HD Smart TV      |  | Type    : LED HD Smart TV       |  | Type    : LED HD Smart TV       | |");
	        System.out.println("    | | Price   : Rs27,999/-           |  | Price   : Rs29,999/-           |  | Price   : Rs32,999/-            |  | Price   : Rs40,999/-            | |");
		    System.out.println("    | |________________________________|  |________________________________|  |_________________________________|  |_________________________________| |");
	        System.out.println("    |                                                                                                                                                  |");
	        System.out.println("    |               5.                                   6.                                 7.                                    8.                   |");
	        System.out.println("    |                                                              _______________________                                                             |");
	        System.out.println("    |                                                             |                       |                                                            |");
	        System.out.println("    |                                                             |       9.EXIT          |                                                            |");
	        System.out.println("    |                                                             |_______________________|                                                            |");
	        System.out.println("    |__________________________________________________________________________________________________________________________________________________|");
	         System.out.println(RESET);
	        samsungTv1();
	        }
     public static void samsungTv1()
     {
    	 System.out.println("PLEASE CHOOSE YOUR PREFERRED MODEL :");
		   do
		   {
			   int m=sc.nextInt();
			   switch(m)
			   {
			   case 1:
			   {
				   System.out.print("Do you want to add it to cart [y/n or Y/N]:"); //CHUSKO KANNA
					 do
					 {
						 char c=sc.next().toLowerCase().charAt(0);           //CHUSKO KANNA
						 switch(c)
						 {
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SAMSUNG 32 INCHES";ob1[i++]=18999; 
						 		  System.out.println("Do you want to continue in Below 40 Inches [y/n or Y/N] :");  //CHUSKO KANNA
						 		  do
						 		  {
						 			char c1=sc.next().toLowerCase().charAt(0);  
						 			switch(c1)	
									{
									case 'y':samsungTv1Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAA
									case 'n':samsungTv(); b=false; break;	 	// CHUSKOOOOOOOOOOOOOOOOOOOOOOOOO
						 			default : System.out.print("Please enter valid option: ");
									}
						 		  }while(b==true);b=false; break;
						 case 'n':
							 {
								 System.out.print("Do you want to see another model in Below 40 Inches [y/n or Y/N]:");   //CHUSKO KANNAAAAAAAAAA
									do
									{
										char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									switch(c1)	
									{
									case 'y':samsungTv1Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAAAAAAAAAAAA
									case 'n':{
										System.out.print("Do you want to continue in this brand (SAMSUNG) [y/n or Y/N]:");  //CHUSKO KANNA NAME MARCHALI
										do 
										{
											char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
											switch(c2)
											{
											case 'y': samsungTv(); b=false; break; //CHUSKO KANN BRAND METHOD MARCHALIIIIIIIIIIIIIIIIIIIII
											case 'n': tvList(); b=false; break;
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
				   System.out.print("Do you want to add it to cart [y/n or Y/N]:"); //CHUSKO KANNA
				   do
				   {
					   char c=sc.next().toLowerCase().charAt(0);           //CHUSKO KANNA
					   switch(c)
					   {
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SAMSUNG 32 INCHES";ob1[i++]=19999; 
					   System.out.println("Do you want to continue in Below 40 Inches [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  
						   switch(c1)	
						   {
						   case 'y':samsungTv1Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAA
						   case 'n':samsungTv(); b=false; break;	 	// CHUSKOOOOOOOOOOOOOOOOOOOOOOOOO
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in Below 40 Inches [y/n or Y/N]:");   //CHUSKO KANNAAAAAAAAAA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':samsungTv1Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAAAAAAAAAAAA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand (SAMSUNG) [y/n or Y/N]:");  //CHUSKO KANNA NAME MARCHALI
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': samsungTv(); b=false; break; //CHUSKO KANN BRAND METHOD MARCHALIIIIIIIIIIIIIIIIIIIII
									   case 'n': tvList(); b=false; break;
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
				   System.out.print("Do you want to add it to cart [y/n or Y/N]:"); //CHUSKO KANNA
				   do
				   {
					   char c=sc.next().toLowerCase().charAt(0);           //CHUSKO KANNA
					   switch(c)
					   {
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SAMSUNG 32 INCHES";ob1[i++]=21999; 
					   System.out.println("Do you want to continue in Below 40 Inches [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  
						   switch(c1)	
						   {
						   case 'y':samsungTv1Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAA
						   case 'n':samsungTv(); b=false; break;	 	// CHUSKOOOOOOOOOOOOOOOOOOOOOOOOO
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in Below 40 Inches [y/n or Y/N]:");   //CHUSKO KANNAAAAAAAAAA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':samsungTv1Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAAAAAAAAAAAA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand (SAMSUNG) [y/n or Y/N]:");  //CHUSKO KANNA NAME MARCHALI
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': samsungTv(); b=false; break; //CHUSKO KANN BRAND METHOD MARCHALIIIIIIIIIIIIIIIIIIIII
									   case 'n': tvList(); b=false; break;
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
				   System.out.print("Do you want to add it to cart [y/n or Y/N]:"); //CHUSKO KANNA
				   do
				   {
					   char c=sc.next().toLowerCase().charAt(0);           //CHUSKO KANNA
					   switch(c)
					   {
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SAMSUNG 32 INCHES";ob1[i++]=25999; 
					   System.out.println("Do you want to continue in Below 40 Inches [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  
						   switch(c1)	
						   {
						   case 'y':samsungTv1Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAA
						   case 'n':samsungTv(); b=false; break;	 	// CHUSKOOOOOOOOOOOOOOOOOOOOOOOOO
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in Below 40 Inches [y/n or Y/N]:");   //CHUSKO KANNAAAAAAAAAA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':samsungTv1Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAAAAAAAAAAAA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand (SAMSUNG) [y/n or Y/N]:");  //CHUSKO KANNA NAME MARCHALI
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': samsungTv(); b=false; break; //CHUSKO KANN BRAND METHOD MARCHALIIIIIIIIIIIIIIIIIIIII
									   case 'n': tvList(); b=false; break;
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
				   System.out.print("Do you want to add it to cart [y/n or Y/N]:"); //CHUSKO KANNA
				   do
				   {
					   char c=sc.next().toLowerCase().charAt(0);           //CHUSKO KANNA
					   switch(c)
					   {
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SAMSUNG 32 INCHES";ob1[i++]=27999; 
					   System.out.println("Do you want to continue in Below 40 Inches [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  
						   switch(c1)	
						   {
						   case 'y':samsungTv1Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAA
						   case 'n':samsungTv(); b=false; break;	 	// CHUSKOOOOOOOOOOOOOOOOOOOOOOOOO
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in Below 40 Inches [y/n or Y/N]:");   //CHUSKO KANNAAAAAAAAAA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':samsungTv1Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAAAAAAAAAAAA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand (SAMSUNG) [y/n or Y/N]:");  //CHUSKO KANNA NAME MARCHALI
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': samsungTv(); b=false; break; //CHUSKO KANN BRAND METHOD MARCHALIIIIIIIIIIIIIIIIIIIII
									   case 'n': tvList(); b=false; break;
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
			   case 6:
			   {
				   System.out.print("Do you want to add it to cart [y/n or Y/N]:"); //CHUSKO KANNA
				   do
				   {
					   char c=sc.next().toLowerCase().charAt(0);           //CHUSKO KANNA
					   switch(c)
					   {
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SAMSUNG 32 INCHES";ob1[i++]=29999; 
					   System.out.println("Do you want to continue in Below 40 Inches [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  
						   switch(c1)	
						   {
						   case 'y':samsungTv1Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAA
						   case 'n':samsungTv(); b=false; break;	 	// CHUSKOOOOOOOOOOOOOOOOOOOOOOOOO
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in Below 40 Inches [y/n or Y/N]:");   //CHUSKO KANNAAAAAAAAAA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':samsungTv1Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAAAAAAAAAAAA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand (SAMSUNG) [y/n or Y/N]:");  //CHUSKO KANNA NAME MARCHALI
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': samsungTv(); b=false; break; //CHUSKO KANN BRAND METHOD MARCHALIIIIIIIIIIIIIIIIIIIII
									   case 'n': tvList(); b=false; break;
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
			   case 7:
			   {
				   System.out.print("Do you want to add it to cart [y/n or Y/N]:"); //CHUSKO KANNA
				   do
				   {
					   char c=sc.next().toLowerCase().charAt(0);           //CHUSKO KANNA
					   switch(c)
					   {
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SAMSUNG 32 INCHES";ob1[i++]=32999; 
					   System.out.println("Do you want to continue in Below 40 Inches [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  
						   switch(c1)	
						   {
						   case 'y':samsungTv1Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAA
						   case 'n':samsungTv(); b=false; break;	 	// CHUSKOOOOOOOOOOOOOOOOOOOOOOOOO
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in Below 40 Inches [y/n or Y/N]:");   //CHUSKO KANNAAAAAAAAAA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':samsungTv1Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAAAAAAAAAAAA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand (SAMSUNG) [y/n or Y/N]:");  //CHUSKO KANNA NAME MARCHALI
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': samsungTv(); b=false; break; //CHUSKO KANN BRAND METHOD MARCHALIIIIIIIIIIIIIIIIIIIII
									   case 'n': tvList(); b=false; break;
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
			   case 8:
			   {
				   System.out.print("Do you want to add it to cart [y/n or Y/N]:"); //CHUSKO KANNA
				   do
				   {
					   char c=sc.next().toLowerCase().charAt(0);           //CHUSKO KANNA
					   switch(c)
					   {
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SAMSUNG 32 INCHES";ob1[i++]=40999; 
					   System.out.println("Do you want to continue in Below 40 Inches [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  
						   switch(c1)	
						   {
						   case 'y':samsungTv1Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAA
						   case 'n':samsungTv(); b=false; break;	 	// CHUSKOOOOOOOOOOOOOOOOOOOOOOOOO
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in Below 40 Inches [y/n or Y/N]:");   //CHUSKO KANNAAAAAAAAAA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':samsungTv1Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAAAAAAAAAAAA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand (SAMSUNG) [y/n or Y/N]:");  //CHUSKO KANNA NAME MARCHALI
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': samsungTv(); b=false; break; //CHUSKO KANN BRAND METHOD MARCHALIIIIIIIIIIIIIIIIIIIII
									   case 'n': tvList(); b=false; break;
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
			   case 9:samsungTv(); b=false; break;  //CHUSKO KANNA BRAND METHOD MARCHALI 
			   default: System.out.print("PLEASE ENTER VALID OPTION: ");
			   }
		   }while(b==true);
     }
     public static void samsungTv2Display()
     { System.out.println(RESET);
	        System.out.println("     __________________________________________________________________________________________________________________________________________________");
   	        System.out.println("    |  ________________________________    ________________________________    _________________________________    _________________________________  |");
	        System.out.println("    | |       SAMSUNG UA50AUE60        |  |       SAMSUNG UA50AU7700       |  |       SAMSUNG UA55AUE60         |  |       SAMSUNG UA50AUE70         | |");
	        System.out.println("    | |--------------------------------|  |--------------------------------|  |---------------------------------|  |---------------------------------| |");
	        System.out.println("    | | Inches  : 40 inches (101 cm)   |  | Inches  : 40 inches (101 cm)   |  | Inches  : 42 inches (106 cm)    |  | Inches  : 42 inches (106 cm)    | |");
	        System.out.println("    | | Display : LED HD               |  | Display : LED HD               |  | Display : LED HD                |  | Display : LED HD                | |");
	        System.out.println("    | | Pixels  : 4K,3480*2160 display |  | Pixels  : 4K,3480*2160 display |  | Pixels  : 4K,3480*2160 display  |  | Pixels  : 4K,3480*2160 display  | |");
	        System.out.println("    | | Connections : wifi,Internet    |  | Connections : wifi,Internet    |  | Connections : wifi,Internet     |  | Connections : wifi,Internet     | |");
	        System.out.println("    | | Port    : 2 usb ports          |  | Port    : 2 usb ports          |  | Port    : 2 usb ports           |  | Port    : 2 usb ports           | |");
	        System.out.println("    | | Type    : Smart TV             |  | Type    : LED 4K TV            |  | Type    : Smart TV              |  | Type    : LED Full HD TV        | |");
	        System.out.println("    | | Price   : Rs18,999/-           |  | Price   :Rs20,999/-            |  | Price   : Rs23,999/-            |  | Price   : Rs25,999/-            | |");
	        System.out.println("    | |________________________________|  |________________________________|  |_________________________________|  |_________________________________| |");
	        System.out.println("    |                                                                                                                                                  |");
	        System.out.println("    |               1.                                   2.                                 3.                                    4.                   |");
	        System.out.println("    |  ________________________________    ________________________________    _________________________________    _________________________________  |");
	        System.out.println("    | |       SAMSUNG UA40M5100A       |  |       SAMSUNG UA40K5570A       |  |       SAMSUNG UA40M5100A        |  |       SAMSUNG UA40J5100A        | |");
	        System.out.println("    | |--------------------------------|  |--------------------------------|  |---------------------------------|  |---------------------------------| |");
	        System.out.println("    | | Inches  : 42 inches (106 cm)   |  | Inches  : 40 inches (101 cm)   |  | Inches  : 50 inches (127 cm)    |  | Inches  : 50 inches (127 cm)    | |");
	        System.out.println("    | | Display : LED HD               |  | Display : LED HD               |  | Display : LED HD                |  | Display : LED HD                | |");
	        System.out.println("    | | Pixels  : 4K,3480*2160 display |  | Pixels  : 4K,3480*2160 display |  | Pixels  : 4K,3480*2160 display  |  | Pixels  : 4K,3480*2160 display  | |");
	        System.out.println("    | | Connections :wifi,Internet     |  | Connections : wifi,Internet    |  | Connections : wifi,Internet     |  | Connections : wifi,Internet     | |");
	        System.out.println("    | | Port    : 2 usb ports          |  | Port    : 2 usb ports          |  | Port    : 2 usb ports           |  | Port    : 2 usb ports           | |");
	        System.out.println("    | | Type    : LED Full HD TV       |  | Type    : LED 4K TV            |  | Type    : LED Full HD TV        |  | Type    : LED 4k TV             | |");
	        System.out.println("    | | Price   : Rs28,999/-           |  | Price   : Rs29,999/-           |  | Price   : Rs31,999/-            |  | Price   : Rs39,999/-            | |");
	        System.out.println("    | |________________________________|  |________________________________|  |_________________________________|  |_________________________________| |");
	        System.out.println("    |                                                                                                                                                  |");
	        System.out.println("    |               5.                                   6.                                  7.                                       8.               |");
	        System.out.println("    |                                                              _______________________                                                             |");
	        System.out.println("    |                                                             |                       |                                                            |");
	        System.out.println("    |                                                             |       9.EXIT          |                                                            |");
	        System.out.println("    |                                                             |_______________________|                                                            |");
	        System.out.println("    |__________________________________________________________________________________________________________________________________________________|");
	        
	        System.out.println(RESET); samsungTv2();
     }
     public static void samsungTv2()
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SAMSUNG 40 INCHES";ob1[i++]=18999; 
						 		  System.out.println("Do you want to continue in Between 40 - 50 Inches [y/n or Y/N] :");  //CHUSKO KANNAAAAAAAAAA
						 		  do
						 		  {
						 			char c1=sc.next().toLowerCase().charAt(0);  
						 			switch(c1)	
									{
									case 'y':samsungTv2Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAA
									case 'n':samsungTv(); b=false; break;	 	// CHUSKOOOOOOOOOOOOOOOOOOOOOOOOO
						 			default : System.out.print("Please enter valid option: ");
									}
						 		  }while(b==true);b=false; break;
						 case 'n':
							 {
								 System.out.print("Do you want to see another model in Between 40 - 50 Inches [y/n or Y/N]:");   //CHUSKO KANNAAAAAAAAAA
									do
									{
										char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									switch(c1)	
									{
									case 'y':samsungTv2Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAAAAAAAAAAAA
									case 'n':{
										System.out.print("Do you want to continue in this brand (SAMSUNG) [y/n or Y/N]:");  //CHUSKO KANNA NAME MARCHALI
										do 
										{
											char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
											switch(c2)
											{
											case 'y': samsungTv(); b=false; break; //CHUSKO KANN BRAND METHOD MARCHALIIIIIIIIIIIIIIIIIIIII
											case 'n': tvList(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SAMSUNG 40 INCHES";ob1[i++]=20999;
					   System.out.println("Do you want to continue in Between 40 - 50 Inches [y/n or Y/N] :");  //CHUSKO KANNAAAAAAAAAA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  
						   switch(c1)	
						   {
						   case 'y':samsungTv2Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAA
						   case 'n':samsungTv(); b=false; break;	 	// CHUSKOOOOOOOOOOOOOOOOOOOOOOOOO
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in Between 40 - 50 Inches [y/n or Y/N]:");   //CHUSKO KANNAAAAAAAAAA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':samsungTv2Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAAAAAAAAAAAA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand (SAMSUNG) [y/n or Y/N]:");  //CHUSKO KANNA NAME MARCHALI
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': samsungTv(); b=false; break; //CHUSKO KANN BRAND METHOD MARCHALIIIIIIIIIIIIIIIIIIIII
									   case 'n': tvList(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SAMSUNG 42 INCHES";ob1[i++]=23999;
					   System.out.println("Do you want to continue in Between 40 - 50 Inches [y/n or Y/N] :");  //CHUSKO KANNAAAAAAAAAA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  
						   switch(c1)	
						   {
						   case 'y':samsungTv2Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAA
						   case 'n':samsungTv(); b=false; break;	 	// CHUSKOOOOOOOOOOOOOOOOOOOOOOOOO
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in Between 40 - 50 Inches [y/n or Y/N]:");   //CHUSKO KANNAAAAAAAAAA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':samsungTv2Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAAAAAAAAAAAA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand (SAMSUNG) [y/n or Y/N]:");  //CHUSKO KANNA NAME MARCHALI
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': samsungTv(); b=false; break; //CHUSKO KANN BRAND METHOD MARCHALIIIIIIIIIIIIIIIIIIIII
									   case 'n': tvList(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SAMSUNG 42 INCHES";ob1[i++]=25999;
					   System.out.println("Do you want to continue in Between 40 - 50 Inches [y/n or Y/N] :");  //CHUSKO KANNAAAAAAAAAA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  
						   switch(c1)	
						   {
						   case 'y':samsungTv2Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAA
						   case 'n':samsungTv(); b=false; break;	 	// CHUSKOOOOOOOOOOOOOOOOOOOOOOOOO
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in Between 40 - 50 Inches [y/n or Y/N]:");   //CHUSKO KANNAAAAAAAAAA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':samsungTv2Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAAAAAAAAAAAA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand (SAMSUNG) [y/n or Y/N]:");  //CHUSKO KANNA NAME MARCHALI
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': samsungTv(); b=false; break; //CHUSKO KANN BRAND METHOD MARCHALIIIIIIIIIIIIIIIIIIIII
									   case 'n': tvList(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SAMSUNG 42 INCHES";ob1[i++]=28999;
					   System.out.println("Do you want to continue in Between 40 - 50 Inches [y/n or Y/N] :");  //CHUSKO KANNAAAAAAAAAA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  
						   switch(c1)	
						   {
						   case 'y':samsungTv2Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAA
						   case 'n':samsungTv(); b=false; break;	 	// CHUSKOOOOOOOOOOOOOOOOOOOOOOOOO
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in Between 40 - 50 Inches [y/n or Y/N]:");   //CHUSKO KANNAAAAAAAAAA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':samsungTv2Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAAAAAAAAAAAA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand (SAMSUNG) [y/n or Y/N]:");  //CHUSKO KANNA NAME MARCHALI
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': samsungTv(); b=false; break; //CHUSKO KANN BRAND METHOD MARCHALIIIIIIIIIIIIIIIIIIIII
									   case 'n': tvList(); b=false; break;
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
			   case 6:
			   {
				   System.out.print("Do you want to add it to cart [y/n or Y/N]:"); 
				   do
				   {
					   char c=sc.next().toLowerCase().charAt(0);          
					   switch(c)
					   {
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SAMSUNG 40 INCHES";ob1[i++]=29999;
					   System.out.println("Do you want to continue in Between 40 - 50 Inches [y/n or Y/N] :");  //CHUSKO KANNAAAAAAAAAA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  
						   switch(c1)	
						   {
						   case 'y':samsungTv2Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAA
						   case 'n':samsungTv(); b=false; break;	 	// CHUSKOOOOOOOOOOOOOOOOOOOOOOOOO
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in Between 40 - 50 Inches [y/n or Y/N]:");   //CHUSKO KANNAAAAAAAAAA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':samsungTv2Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAAAAAAAAAAAA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand (SAMSUNG) [y/n or Y/N]:");  //CHUSKO KANNA NAME MARCHALI
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': samsungTv(); b=false; break; //CHUSKO KANN BRAND METHOD MARCHALIIIIIIIIIIIIIIIIIIIII
									   case 'n': tvList(); b=false; break;
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
			   case 7:
			   {
				   System.out.print("Do you want to add it to cart [y/n or Y/N]:"); 
				   do
				   {
					   char c=sc.next().toLowerCase().charAt(0);          
					   switch(c)
					   {
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SAMSUNG 50 INCHES";ob1[i++]=31999;
					   System.out.println("Do you want to continue in Between 40 - 50 Inches [y/n or Y/N] :");  //CHUSKO KANNAAAAAAAAAA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  
						   switch(c1)	
						   {
						   case 'y':samsungTv2Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAA
						   case 'n':samsungTv(); b=false; break;	 	// CHUSKOOOOOOOOOOOOOOOOOOOOOOOOO
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in Between 40 - 50 Inches [y/n or Y/N]:");   //CHUSKO KANNAAAAAAAAAA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':samsungTv2Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAAAAAAAAAAAA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand (SAMSUNG) [y/n or Y/N]:");  //CHUSKO KANNA NAME MARCHALI
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': samsungTv(); b=false; break; //CHUSKO KANN BRAND METHOD MARCHALIIIIIIIIIIIIIIIIIIIII
									   case 'n': tvList(); b=false; break;
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
			   case 8:
			   {
				   System.out.print("Do you want to add it to cart [y/n or Y/N]:"); 
				   do
				   {
					   char c=sc.next().toLowerCase().charAt(0);          
					   switch(c)
					   {
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SAMSUNG 50 INCHES";ob1[i++]=39999;
					   System.out.println("Do you want to continue in Between 40 - 50 Inches [y/n or Y/N] :");  //CHUSKO KANNAAAAAAAAAA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  
						   switch(c1)	
						   {
						   case 'y':samsungTv2Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAA
						   case 'n':samsungTv(); b=false; break;	 	// CHUSKOOOOOOOOOOOOOOOOOOOOOOOOO
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in Between 40 - 50 Inches [y/n or Y/N]:");   //CHUSKO KANNAAAAAAAAAA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':samsungTv2Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAAAAAAAAAAAA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand (SAMSUNG) [y/n or Y/N]:");  //CHUSKO KANNA NAME MARCHALI
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': samsungTv(); b=false; break; //CHUSKO KANN BRAND METHOD MARCHALIIIIIIIIIIIIIIIIIIIII
									   case 'n': tvList(); b=false; break;
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
			   case 9:samsungTv(); b=false; break;  //CHUSKO KANNA BRAND METHOD MARCHALI 
			   default: System.out.print("PLEASE ENTER VALID OPTION: ");
			   }
		   }while(b==true);
     }

     public static void samsungTv3Display()
     { System.out.println(RESET);
	    System.out.println("     __________________________________________________________________________________________________________________________________________________");
        System.out.println("    |  ________________________________    ________________________________    _________________________________    _________________________________  |");
        System.out.println("    | |       SAMSUNG UA55AU7600K      |  |       SAMSUNG UA55AU7700K      |  |       SAMSUNG UA55BU8570U       |  |       SAMSUNG UA55AU8000K       | |");
        System.out.println("    | |--------------------------------|  |--------------------------------|  |---------------------------------|  |---------------------------------| |");
        System.out.println("    | | Inches  : 55 inches (139 cm)   |  | Inches  : 55 inches (139 cm)   |  | Inches  : 55 inches (139 cm)    |  | Inches  : 55 inches (139 cm)    | |");
        System.out.println("    | | Display : LED HD               |  | Display : LED HD               |  | Display : LED HD                |  | Display : LED HD                | |");
        System.out.println("    | | Pixels  : 4K,3480*2160 display |  | Pixels  : 4K,3480*2160 display |  | Pixels  : 4K,3480*2160 display  |  | Pixels  : 4K,3480*2160 display  | |");
        System.out.println("    | | Connections : wifi,Internet    |  | Connections : wifi,Internet    |  | Connections : wifi,Internet     |  | Connections : wifi,Internet     | |");
        System.out.println("    | | Port    : 2 usb ports          |  | Port    : 2 usb ports          |  | Port    : 2 usb ports           |  | Port   : 2 usb ports            | |");
        System.out.println("    | | Type    : LED 4k TV            |  | Type    : LED 4k TV            |  | Type    : LED 4k TV             |  | Type   : LED 4k TV              | |");
        System.out.println("    | | Price   : Rs38,999/-           |  | Price   : Rs49,999/-           |  | Price   : Rs35,999/-            |  | Price  : Rs69,999/-             | |");
        System.out.println("    | |________________________________|  |________________________________|  |_________________________________|  |_________________________________| |");
        System.out.println("    |                                                                                                                                                  |");
        System.out.println("    |               1.                                   2.                                 3.                                    4.                   |");
        System.out.println("    |  ________________________________    ________________________________    _________________________________    _________________________________  |");
        System.out.println("    | |       SAMSUNG QA55Q60AAK       |  |       SAMSUNG QA55LS01BAK      |  |       SAMSUNG QA55LS03BAK       |  |      SAMSUNG QA55QN90BA         | |");
        System.out.println("    | |--------------------------------|  |--------------------------------|  |---------------------------------|  |---------------------------------| |");
        System.out.println("    | | Inches  : 65 inches (165 cm)   |  | Inches  : 65 inches (165 cm)   |  | Inches  : 65 inches (165 cm)    |  | Inches  : 65 inches (165 cm)    | |");
        System.out.println("    | | Display : LED HD               |  | Display : LED HD               |  | Display : LED HD                |  | Display : LED HD                | |");
        System.out.println("    | | Pixels  : 4K,3480*2160 display |  | Pixels  : 4K,3480*2160 display |  | Pixels  : 4K,3480*2160 display  |  | Pixels  : 4K,3480*2160 display  | |");
        System.out.println("    | | Connections : wifi,Internet    |  | Connections : wifi,Internet    |  | Connections : wifi,Internet     |  | Connections : wifi,Internet     | |");
        System.out.println("    | | Port    : 2 usb ports          |  | Port    : 2 usb ports          |  | Port    : 2 usb ports           |  | Port    : 2 usb ports           | |");
        System.out.println("    | | Type    : QLED 4k TV           |  | Type    : QED 4k TV            |  | Type    : QLED 4k TV            |  | Type    : NEO QLED 4k TV        | |"); 
        System.out.println("    | | Price   : Rs59,999/-           |  | Price   : Rs47,999/-           |  | Price   : Rs32,999/-            |  | Price   : Rs48,999/-            | |");
        System.out.println("    | |________________________________|  |________________________________|  |_________________________________|  |_________________________________| |");
        System.out.println("    |                                                                                                                                                  |");
        System.out.println("    |               5.                                    6.                                   7.                                    8.                |");
        System.out.println("    |                                                              _______________________                                                             |");
        System.out.println("    |                                                             |                       |                                                            |");
        System.out.println("    |                                                             |       9.EXIT          |                                                            |");
        System.out.println("    |                                                             |_______________________|                                                            |");
        System.out.println("    |__________________________________________________________________________________________________________________________________________________|");
        
        System.out.println(RESET);    samsungTv3();
	        }
     public static void samsungTv3()
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SAMSUNG 55 INCHES";ob1[i++]=38999;
						 		  System.out.println("Do you want to continue in Above 50 Inches [y/n or Y/N] :");  //CHUSKO KANNAAAAAAAAAA
						 		  do
						 		  {
						 			char c1=sc.next().toLowerCase().charAt(0);  
						 			switch(c1)	
									{
									case 'y':samsungTv3Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAA
									case 'n':samsungTv(); b=false; break;	 	// CHUSKOOOOOOOOOOOOOOOOOOOOOOOOO
						 			default : System.out.print("Please enter valid option: ");
									}
						 		  }while(b==true);b=false; break;
						 case 'n':
							 {
								 System.out.print("Do you want to see another model in Above 50 Inches [y/n or Y/N]:");   //CHUSKO KANNAAAAAAAAAA
									do
									{
										char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									switch(c1)	
									{
									case 'y':samsungTv3Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAAAAAAAAAAAA
									case 'n':{
										System.out.print("Do you want to continue in this brand (SAMSUNG) [y/n or Y/N]:");  //CHUSKO KANNA NAME MARCHALI
										do 
										{
											char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
											switch(c2)
											{
											case 'y': samsungTv(); b=false; break; //CHUSKO KANN BRAND METHOD MARCHALIIIIIIIIIIIIIIIIIIIII
											case 'n': tvList(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SAMSUNG 55 INCHES";ob1[i++]=49999;
					   System.out.println("Do you want to continue in Above 50 Inches [y/n or Y/N] :");  //CHUSKO KANNAAAAAAAAAA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  
						   switch(c1)	
						   {
						   case 'y':samsungTv3Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAA
						   case 'n':samsungTv(); b=false; break;	 	// CHUSKOOOOOOOOOOOOOOOOOOOOOOOOO
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in Above 50 Inches [y/n or Y/N]:");   //CHUSKO KANNAAAAAAAAAA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':samsungTv3Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAAAAAAAAAAAA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand (SAMSUNG) [y/n or Y/N]:");  //CHUSKO KANNA NAME MARCHALI
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': samsungTv(); b=false; break; //CHUSKO KANN BRAND METHOD MARCHALIIIIIIIIIIIIIIIIIIIII
									   case 'n': tvList(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SAMSUNG 55 INCHES";ob1[i++]=35999;
					   System.out.println("Do you want to continue in Above 50 Inches [y/n or Y/N] :");  //CHUSKO KANNAAAAAAAAAA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  
						   switch(c1)	
						   {
						   case 'y':samsungTv3Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAA
						   case 'n':samsungTv(); b=false; break;	 	// CHUSKOOOOOOOOOOOOOOOOOOOOOOOOO
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in Above 50 Inches [y/n or Y/N]:");   //CHUSKO KANNAAAAAAAAAA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':samsungTv3Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAAAAAAAAAAAA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand (SAMSUNG) [y/n or Y/N]:");  //CHUSKO KANNA NAME MARCHALI
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': samsungTv(); b=false; break; //CHUSKO KANN BRAND METHOD MARCHALIIIIIIIIIIIIIIIIIIIII
									   case 'n': tvList(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SAMSUNG 55 INCHES";ob1[i++]=69999;
					   System.out.println("Do you want to continue in Above 50 Inches [y/n or Y/N] :");  //CHUSKO KANNAAAAAAAAAA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  
						   switch(c1)	
						   {
						   case 'y':samsungTv3Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAA
						   case 'n':samsungTv(); b=false; break;	 	// CHUSKOOOOOOOOOOOOOOOOOOOOOOOOO
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in Above 50 Inches [y/n or Y/N]:");   //CHUSKO KANNAAAAAAAAAA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':samsungTv3Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAAAAAAAAAAAA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand (SAMSUNG) [y/n or Y/N]:");  //CHUSKO KANNA NAME MARCHALI
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': samsungTv(); b=false; break; //CHUSKO KANN BRAND METHOD MARCHALIIIIIIIIIIIIIIIIIIIII
									   case 'n': tvList(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SAMSUNG 65 INCHES";ob1[i++]=59999;
					   System.out.println("Do you want to continue in Above 50 Inches [y/n or Y/N] :");  //CHUSKO KANNAAAAAAAAAA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  
						   switch(c1)	
						   {
						   case 'y':samsungTv3Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAA
						   case 'n':samsungTv(); b=false; break;	 	// CHUSKOOOOOOOOOOOOOOOOOOOOOOOOO
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in Above 50 Inches [y/n or Y/N]:");   //CHUSKO KANNAAAAAAAAAA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':samsungTv3Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAAAAAAAAAAAA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand (SAMSUNG) [y/n or Y/N]:");  //CHUSKO KANNA NAME MARCHALI
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': samsungTv(); b=false; break; //CHUSKO KANN BRAND METHOD MARCHALIIIIIIIIIIIIIIIIIIIII
									   case 'n': tvList(); b=false; break;
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
			   case 6:
			   {
				   System.out.print("Do you want to add it to cart [y/n or Y/N]:"); 
				   do
				   {
					   char c=sc.next().toLowerCase().charAt(0);          
					   switch(c)
					   {
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SAMSUNG 65 INCHES";ob1[i++]=47999;
					   System.out.println("Do you want to continue in Above 50 Inches [y/n or Y/N] :");  //CHUSKO KANNAAAAAAAAAA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  
						   switch(c1)	
						   {
						   case 'y':samsungTv3Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAA
						   case 'n':samsungTv(); b=false; break;	 	// CHUSKOOOOOOOOOOOOOOOOOOOOOOOOO
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in Above 50 Inches [y/n or Y/N]:");   //CHUSKO KANNAAAAAAAAAA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':samsungTv3Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAAAAAAAAAAAA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand (SAMSUNG) [y/n or Y/N]:");  //CHUSKO KANNA NAME MARCHALI
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': samsungTv(); b=false; break; //CHUSKO KANN BRAND METHOD MARCHALIIIIIIIIIIIIIIIIIIIII
									   case 'n': tvList(); b=false; break;
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
			   case 7:
			   {
				   System.out.print("Do you want to add it to cart [y/n or Y/N]:"); 
				   do
				   {
					   char c=sc.next().toLowerCase().charAt(0);          
					   switch(c)
					   {
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SAMSUNG 65 INCHES";ob1[i++]=32999;
					   System.out.println("Do you want to continue in Above 50 Inches [y/n or Y/N] :");  //CHUSKO KANNAAAAAAAAAA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  
						   switch(c1)	
						   {
						   case 'y':samsungTv3Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAA
						   case 'n':samsungTv(); b=false; break;	 	// CHUSKOOOOOOOOOOOOOOOOOOOOOOOOO
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in Above 50 Inches [y/n or Y/N]:");   //CHUSKO KANNAAAAAAAAAA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':samsungTv3Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAAAAAAAAAAAA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand (SAMSUNG) [y/n or Y/N]:");  //CHUSKO KANNA NAME MARCHALI
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': samsungTv(); b=false; break; //CHUSKO KANN BRAND METHOD MARCHALIIIIIIIIIIIIIIIIIIIII
									   case 'n': tvList(); b=false; break;
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
			   case 8:
			   {
				   System.out.print("Do you want to add it to cart [y/n or Y/N]:"); 
				   do
				   {
					   char c=sc.next().toLowerCase().charAt(0);          
					   switch(c)
					   {
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SAMSUNG 65 INCHES";ob1[i++]=48999;
					   System.out.println("Do you want to continue in Above 50 Inches [y/n or Y/N] :");  //CHUSKO KANNAAAAAAAAAA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  
						   switch(c1)	
						   {
						   case 'y':samsungTv3Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAA
						   case 'n':samsungTv(); b=false; break;	 	// CHUSKOOOOOOOOOOOOOOOOOOOOOOOOO
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in Above 50 Inches [y/n or Y/N]:");   //CHUSKO KANNAAAAAAAAAA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':samsungTv3Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAAAAAAAAAAAA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand (SAMSUNG) [y/n or Y/N]:");  //CHUSKO KANNA NAME MARCHALI
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': samsungTv(); b=false; break; //CHUSKO KANN BRAND METHOD MARCHALIIIIIIIIIIIIIIIIIIIII
									   case 'n': tvList(); b=false; break;
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
			   case 9:samsungTv(); b=false; break;  //CHUSKO KANNA BRAND METHOD MARCHALI 
			   default: System.out.print("PLEASE ENTER VALID OPTION: ");
			   }
		   }while(b==true);
     }
     public static void sonyTv()
     {
    	 System.out.println(RESET);
    	 System.out.println("\t\t\t\t\t\t"+"                          SONY                            ");
    	 System.out.println("\t\t\t\t\t\t"+"                      -------------                      ");
    	 System.out.println("\t\t\t\t\t\t"+"                    1) BELOW 40 INCHES                      ");
    	 System.out.println("\t\t\t\t\t\t"+"                    2) BETWEEN 40 - 50 INCHES                   ");
    	 System.out.println("\t\t\t\t\t\t"+"                    3) ABOVE 50 INCHES                   ");
    	 System.out.println("\t\t\t\t\t\t"+"                    4) EXIT                   ");
    	     	 
    	 System.out.print("PLEASE SELECT YOUR PREFERRED MODEL :"); System.out.println(RESET);
    	 do
		 {
			int p=sc.nextInt();
			switch(p) 
			{
			case 1: sonyTv1Display();; b=false; break;
			case 2: sonyTv2Display(); b=false; break;
			case 3: sonyTv3Display();;b=false; break;
			case 4: tvList();b=false; break;
		    default:
		    	{
		    		System.out.println("Please enter valid option.");
		    		sonyTv(); 
		    	}
			}
		 }while(b==true);
    	 
     }
     public static void sonyTv1Display()
     { System.out.println(RESET);
	        System.out.println("     __________________________________________________________________________________________________________________________________________________");
	        System.out.println("    |                                                                                                                                                  |");
	        System.out.println("    |  ________________________________    ________________________________    _________________________________    _________________________________  |");
	        System.out.println("    | |       SONY BRAVIAKLV-32BX320   |  |       SONY BRAVIA KLV-32R422E  |  |       SONY BRAVIA KLV-32R412D   |  |                                 | |");
	        System.out.println("    | |--------------------------------|  |--------------------------------|  |---------------------------------|  |                                 | |");
	        System.out.println("    | | Inches  : 32 inches (81 cm)    |  | Inches  : 32 inches (81 cm)    |  | Inches  : 32 inches (81 cm)     |  |                                 | |");
	        System.out.println("    | | Display : LED HD               |  | Display : LED HD               |  | Display : LED HD                |  |                                 | |");
	        System.out.println("    | | Pixels  : 4K,3480*2160 display |  | Pixels  : 4K,3480*2160 display |  | Pixels  : 4K,3480*2160 display  |  |              EXIT               | |");
	        System.out.println("    | | Connections : wifi,Internet    |  | Connections : wifi,Internet    |  | Connections : wifi,Internet     |  |                                 | |");
	        System.out.println("    | | Port    : 2 usb ports          |  | Port    : 2 usb ports          |  | Port    : 2 usb ports           |  |                                 | |");
	        System.out.println("    | | Type    : Smart TV             |  | Type    : Smart TV             |  | Type    : Smart TV              |  |                                 | |");
	        System.out.println("    | | Price   : Rs18,999/-           |  | Price   : Rs19,999/-           |  | Price   : Rs25,999/-            |  |                                 | |");
	        System.out.println("    | |________________________________|  |________________________________|  |_________________________________|  |_________________________________| |");
	        System.out.println("    |                                                                                                                                                  |");
	        System.out.println("    |              1.                                      2.                                 3.                                    4.                 |");
	        System.out.println("    |__________________________________________________________________________________________________________________________________________________|");
	         System.out.println(RESET);
	        sonyTv1();
     }
     public static void sonyTv1()
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SONY BRAVIA 32 INCHES";ob1[i++]=18999;
						 		  System.out.println("Do you want to continue in Below 40 Inches [y/n or Y/N] :");  //CHUSKO KANNAAAAAAAAAA
						 		  do
						 		  {
						 			char c1=sc.next().toLowerCase().charAt(0);  
						 			switch(c1)	
									{
									case 'y':sonyTv1Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAA
									case 'n':sonyTv(); b=false; break;	 	// CHUSKOOOOOOOOOOOOOOOOOOOOOOOOO
						 			default : System.out.print("Please enter valid option: ");
									}
						 		  }while(b==true);b=false; break;
						 case 'n':
							 {
								 System.out.print("Do you want to see another model in Below 40 Inches [y/n or Y/N]:");   //CHUSKO KANNAAAAAAAAAA
									do
									{
										char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									switch(c1)	
									{
									case 'y':sonyTv1Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAAAAAAAAAAAA
									case 'n':{
										System.out.print("Do you want to continue in this brand (SONY) [y/n or Y/N]:");  //CHUSKO KANNA NAME MARCHALI
										do 
										{
											char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
											switch(c2)
											{
											case 'y': sonyTv(); b=false; break; //CHUSKO KANN BRAND METHOD MARCHALIIIIIIIIIIIIIIIIIIIII
											case 'n': tvList(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SONY BRAVIA 32 INCHES";ob1[i++]=19999;
					   System.out.println("Do you want to continue in Below 40 Inches [y/n or Y/N] :");  //CHUSKO KANNAAAAAAAAAA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  
						   switch(c1)	
						   {
						   case 'y':sonyTv1Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAA
						   case 'n':sonyTv(); b=false; break;	 	// CHUSKOOOOOOOOOOOOOOOOOOOOOOOOO
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in Below 40 Inches [y/n or Y/N]:");   //CHUSKO KANNAAAAAAAAAA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':sonyTv1Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAAAAAAAAAAAA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand (SONY) [y/n or Y/N]:");  //CHUSKO KANNA NAME MARCHALI
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': sonyTv(); b=false; break; //CHUSKO KANN BRAND METHOD MARCHALIIIIIIIIIIIIIIIIIIIII
									   case 'n': tvList(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SONY BRAVIA 32 INCHES";ob1[i++]=25999;
					   System.out.println("Do you want to continue in Below 40 Inches [y/n or Y/N] :");  //CHUSKO KANNAAAAAAAAAA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  
						   switch(c1)	
						   {
						   case 'y':sonyTv1Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAA
						   case 'n':sonyTv(); b=false; break;	 	// CHUSKOOOOOOOOOOOOOOOOOOOOOOOOO
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in Below 40 Inches [y/n or Y/N]:");   //CHUSKO KANNAAAAAAAAAA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':sonyTv1Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAAAAAAAAAAAA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand (SONY) [y/n or Y/N]:");  //CHUSKO KANNA NAME MARCHALI
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': sonyTv(); b=false; break; //CHUSKO KANN BRAND METHOD MARCHALIIIIIIIIIIIIIIIIIIIII
									   case 'n': tvList(); b=false; break;
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
			   case 4:sonyTv(); b=false; break;  //CHUSKO KANNA BRAND METHOD MARCHALI 
			   default: System.out.print("PLEASE ENTER VALID OPTION: ");
			   }
		   }while(b==true);
     }
     public static void sonyTv2Display()
     { System.out.println(RESET);
	        System.out.println("     __________________________________________________________________________________________________________________________________________________");
	        System.out.println("    |  ________________________________    ________________________________    _________________________________    _________________________________  |");
	        System.out.println("    | |       SONY KD-55A9F            |  |       SONY BRAVIA KLV-40W562D  |  |       SONY BRAVIA KLV-40R552C   |  |       SONY BRAVIA KDL-40R350E   | |");
	        System.out.println("    | |--------------------------------|  |--------------------------------|  |---------------------------------|  |---------------------------------| |");
	        System.out.println("    | | Inches  : 40 inches (101 cm)   |  | Inches  : 40 inches (101 cm)   |  | Inches  : 42 inches (106 cm)    |  | Inches  : 42 inches (106 cm)    | |");
	        System.out.println("    | | Display : LED HD               |  | Display : LED HD               |  | Display : LED HD                |  | Display : LED HD                | |");
	        System.out.println("    | | Pixels  : 4K,3480*2160 display |  | Pixels  : 4K,3480*2160 display |  | Pixels  : 4K,3480*2160 display  |  | Pixels  : 4K,3480*2160 display  | |");
	        System.out.println("    | | Connections : wifi,Internet    |  | Connections : wifi,Internet    |  | Connections : wifi,Internet     |  | Connections : wifi,Internet     | |");
	        System.out.println("    | | Port    : 2 usb ports          |  | Port    : 2 usb ports          |  | Port    : 2 usb ports           |  | Port    : 2 usb ports           | |");
	        System.out.println("    | | Type    : Smart TV             |  | Type    : LED 4K TV            |  | Type    : Smart TV              |  | Type    : LED Full HD TV        | |");
	        System.out.println("    | | Price   : Rs18,999/-           |  | Price   : Rs20,999/-           |  | Price   : Rs23,999/-            |  | Price   : Rs25,999/-            | |");
	        System.out.println("    | |________________________________|  |________________________________|  |_________________________________|  |_________________________________| |");
	        System.out.println("    |                                                                                                                                                  |");
	        System.out.println("    |               1.                                   2.                                   3.                                    4.                 |");
	        System.out.println("    |  ________________________________    ________________________________    _________________________________    _________________________________  |");
	        System.out.println("    | |       SONY BRAVIA KDL-40R350C  |  |       SONY BRAVIA KDL-42W800B  |  |       SONY BRAVIA KDL-40R470B   |  |                                 | |");
	        System.out.println("    | |--------------------------------|  |--------------------------------|  |---------------------------------|  |                                 | |");
	        System.out.println("    | | Inches  : 42 inches (106 cm)   |  | Inches  : 40 inches (101 cm)   |  | Inches  : 50 inches (127 cm)    |  |                                 | |");
	        System.out.println("    | | Display : LED HD               |  | Display : LED HD               |  | Display : LED HD                |  |                                 | |");
	        System.out.println("    | | Pixels  : 4K,3480*2160 display |  | Pixels  : 4K,3480*2160 display |  | Pixels  : 4K,3480*2160 display  |  |              EXIT               | |");
	        System.out.println("    | | Connections : wifi,Internet    |  | Connections : wifi,Internet    |  | Connections : wifi,Internet     |  |                                 | |");
	        System.out.println("    | | Port    : 2 usb ports          |  | Port    : 2 usb ports          |  | Port    : 2 usb ports           |  |                                 | |");
	        System.out.println("    | | Type    : LED Full HD TV       |  | Type    : LED 4K TV            |  | Type    : LED Full HD TV        |  |                                 | |");
	        System.out.println("    | | Price   : Rs28,999/-           |  | Price   : Rs29,999/-           |  | Price   : Rs31,999/-            |  |                                 | |");
	        System.out.println("    | |________________________________|  |________________________________|  |_________________________________|  |_________________________________| |");
	        System.out.println("    |                                                                                                                                                  |");
	        System.out.println("    |               5.                                   6.                                   7.                                    8.                 |");
	        System.out.println("    |__________________________________________________________________________________________________________________________________________________|");
	         System.out.println(RESET);
	        sonyTv2();
	        }
     public static void sonyTv2()
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SONY BRAVIA 40 INCHES";ob1[i++]=18999;
						 		  System.out.println("Do you want to continue in Between 40 - 50 Inches [y/n or Y/N] :");  //CHUSKO KANNAAAAAAAAAA
						 		  do
						 		  {
						 			char c1=sc.next().toLowerCase().charAt(0);  
						 			switch(c1)	
									{
									case 'y':sonyTv2Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAA
									case 'n':sonyTv(); b=false; break;	 	// CHUSKOOOOOOOOOOOOOOOOOOOOOOOOO
						 			default : System.out.print("Please enter valid option: ");
									}
						 		  }while(b==true);b=false; break;
						 case 'n':
							 {
								 System.out.print("Do you want to see another model in Between 40 - 50 Inches [y/n or Y/N]:");   //CHUSKO KANNAAAAAAAAAA
									do
									{
										char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									switch(c1)	
									{
									case 'y':sonyTv2Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAAAAAAAAAAAA
									case 'n':{
										System.out.print("Do you want to continue in this brand (SONY) [y/n or Y/N]:");  //CHUSKO KANNA NAME MARCHALI
										do 
										{
											char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
											switch(c2)
											{
											case 'y': sonyTv(); b=false; break; //CHUSKO KANN BRAND METHOD MARCHALIIIIIIIIIIIIIIIIIIIII
											case 'n': tvList(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SONY BRAVIA 40 INCHES";ob1[i++]=20999;
					   System.out.println("Do you want to continue in Between 40 - 50 Inches [y/n or Y/N] :");  //CHUSKO KANNAAAAAAAAAA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  
						   switch(c1)	
						   {
						   case 'y':sonyTv2Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAA
						   case 'n':sonyTv(); b=false; break;	 	// CHUSKOOOOOOOOOOOOOOOOOOOOOOOOO
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in Between 40 - 50 Inches [y/n or Y/N]:");   //CHUSKO KANNAAAAAAAAAA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':sonyTv2Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAAAAAAAAAAAA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand (SONY) [y/n or Y/N]:");  //CHUSKO KANNA NAME MARCHALI
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': sonyTv(); b=false; break; //CHUSKO KANN BRAND METHOD MARCHALIIIIIIIIIIIIIIIIIIIII
									   case 'n': tvList(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SONY BRAVIA 42 INCHES";ob1[i++]=23999;
					   System.out.println("Do you want to continue in Between 40 - 50 Inches [y/n or Y/N] :");  //CHUSKO KANNAAAAAAAAAA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  
						   switch(c1)	
						   {
						   case 'y':sonyTv2Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAA
						   case 'n':sonyTv(); b=false; break;	 	// CHUSKOOOOOOOOOOOOOOOOOOOOOOOOO
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in Between 40 - 50 Inches [y/n or Y/N]:");   //CHUSKO KANNAAAAAAAAAA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':sonyTv2Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAAAAAAAAAAAA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand (SONY) [y/n or Y/N]:");  //CHUSKO KANNA NAME MARCHALI
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': sonyTv(); b=false; break; //CHUSKO KANN BRAND METHOD MARCHALIIIIIIIIIIIIIIIIIIIII
									   case 'n': tvList(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SONY BRAVIA 42 INCHES";ob1[i++]=25999;
					   System.out.println("Do you want to continue in Between 40 - 50 Inches [y/n or Y/N] :");  //CHUSKO KANNAAAAAAAAAA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  
						   switch(c1)	
						   {
						   case 'y':sonyTv2Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAA
						   case 'n':sonyTv(); b=false; break;	 	// CHUSKOOOOOOOOOOOOOOOOOOOOOOOOO
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in Between 40 - 50 Inches [y/n or Y/N]:");   //CHUSKO KANNAAAAAAAAAA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':sonyTv2Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAAAAAAAAAAAA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand (SONY) [y/n or Y/N]:");  //CHUSKO KANNA NAME MARCHALI
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': sonyTv(); b=false; break; //CHUSKO KANN BRAND METHOD MARCHALIIIIIIIIIIIIIIIIIIIII
									   case 'n': tvList(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SONY BRAVIA 42 INCHES";ob1[i++]=28999;
					   System.out.println("Do you want to continue in Between 40 - 50 Inches [y/n or Y/N] :");  //CHUSKO KANNAAAAAAAAAA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  
						   switch(c1)	
						   {
						   case 'y':sonyTv2Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAA
						   case 'n':sonyTv(); b=false; break;	 	// CHUSKOOOOOOOOOOOOOOOOOOOOOOOOO
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in Between 40 - 50 Inches [y/n or Y/N]:");   //CHUSKO KANNAAAAAAAAAA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':sonyTv2Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAAAAAAAAAAAA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand (SONY) [y/n or Y/N]:");  //CHUSKO KANNA NAME MARCHALI
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': sonyTv(); b=false; break; //CHUSKO KANN BRAND METHOD MARCHALIIIIIIIIIIIIIIIIIIIII
									   case 'n': tvList(); b=false; break;
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
			   case 6:
			   {
				   System.out.print("Do you want to add it to cart [y/n or Y/N]:"); 
				   do
				   {
					   char c=sc.next().toLowerCase().charAt(0);          
					   switch(c)
					   {
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SONY BRAVIA 40 INCHES";ob1[i++]=29999;
					   System.out.println("Do you want to continue in Between 40 - 50 Inches [y/n or Y/N] :");  //CHUSKO KANNAAAAAAAAAA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  
						   switch(c1)	
						   {
						   case 'y':sonyTv2Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAA
						   case 'n':sonyTv(); b=false; break;	 	// CHUSKOOOOOOOOOOOOOOOOOOOOOOOOO
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in Between 40 - 50 Inches [y/n or Y/N]:");   //CHUSKO KANNAAAAAAAAAA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':sonyTv2Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAAAAAAAAAAAA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand (SONY) [y/n or Y/N]:");  //CHUSKO KANNA NAME MARCHALI
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': sonyTv(); b=false; break; //CHUSKO KANN BRAND METHOD MARCHALIIIIIIIIIIIIIIIIIIIII
									   case 'n': tvList(); b=false; break;
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
			   case 7:
			   {
				   System.out.print("Do you want to add it to cart [y/n or Y/N]:"); 
				   do
				   {
					   char c=sc.next().toLowerCase().charAt(0);          
					   switch(c)
					   {
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SONY BRAVIA 50 INCHES";ob1[i++]=31999;
					   System.out.println("Do you want to continue in Between 40 - 50 Inches [y/n or Y/N] :");  //CHUSKO KANNAAAAAAAAAA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  
						   switch(c1)	
						   {
						   case 'y':sonyTv2Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAA
						   case 'n':sonyTv(); b=false; break;	 	// CHUSKOOOOOOOOOOOOOOOOOOOOOOOOO
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in Between 40 - 50 Inches [y/n or Y/N]:");   //CHUSKO KANNAAAAAAAAAA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':sonyTv2Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAAAAAAAAAAAA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand (SONY) [y/n or Y/N]:");  //CHUSKO KANNA NAME MARCHALI
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': sonyTv(); b=false; break; //CHUSKO KANN BRAND METHOD MARCHALIIIIIIIIIIIIIIIIIIIII
									   case 'n': tvList(); b=false; break;
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
			   case 8:sonyTv(); b=false; break;  //CHUSKO KANNA BRAND METHOD MARCHALI 
			   default: System.out.print("PLEASE ENTER VALID OPTION: ");
			   }
		   }while(b==true);
     }

     public static void sonyTv3Display()
     { System.out.println(RESET);
			 System.out.println("     __________________________________________________________________________________________________________________________________________________");
			 System.out.println("    |  ________________________________    ________________________________    _________________________________    _________________________________  |");
		     System.out.println("    | |       SONY BRAVIA KD-55X74K    |  |       SONY BRAVIA KD-55X75K    |  |       SONY BRAVIA KD-55X75J     |  |       SONY BRAVIA KD-55X80K     | |");
		     System.out.println("    | |--------------------------------|  |--------------------------------|  |---------------------------------|  |---------------------------------| |");
		     System.out.println("    | | Inches  : 55 inches (139 cm)   |  | Inches  : 55 inches (139 cm)   |  | Inches  : 55 inches (139 cm)    |  | Inches  : 55 inches (139 cm)    | |");
		     System.out.println("    | | Display : LED HD               |  | Display : LED HD               |  | Display : LED HD                |  | Display  : LED HD               | |");
		     System.out.println("    | | Pixels  : 4K,3480*2160 display |  | Pixels  : 4K,3480*2160 display |  | Pixels  : 4K,3480*2160 display  |  | Pixels  : 4K,3480*2160 display  | |");
		     System.out.println("    | | Connections : wifi,Internet    |  | Connections : wifi,Internet    |  | Connections : wifi,Internet     |  | Connections : wifi,Internet     | |");
		     System.out.println("    | | Port    : 2 usb ports          |  | Port    : 2 usb ports          |  | Port    : 2 usb ports           |  | Port    : 2 usb ports           | |");
		     System.out.println("    | | Type    : LED 4k TV            |  | Typem   : LED 4k TV            |  | Type    : LED 4k TV             |  | Type    : LED 4k TV             | |");
		     System.out.println("    | | Price   : Rs28,999/-           |  | Price   : Rs39,999/-           |  | Price   : Rs38,999/-            |  | Price   : Rs49,999/-            | |");
		     System.out.println("    | |________________________________|  |________________________________|  |_________________________________|  |_________________________________| |");
		     System.out.println("    |                                                                                                                                                  |");
		     System.out.println("    |               1.                                   2.                                   3.                                    4.                 |");
		     System.out.println("    |  ________________________________    ________________________________    _________________________________    _________________________________  |");
		     System.out.println("    | |       SONY BRAVIA KD-55X85J    |  |       SONY BRAVIA KD-55X85K    |  |       SONY BRAVIA KD-55X9000H   |  |       Sony XR-55A80K            | |");
		     System.out.println("    | |--------------------------------|  |--------------------------------|  |---------------------------------|  |---------------------------------| |");
		     System.out.println("    | | Inches  : 65 inches (165 cm)   |  | Inches  : 65 inches (165 cm)   |  | Inches  : 65 inches (165 cm)    |  | Inches  : 65 inches (165 cm)    | |");
		     System.out.println("    | | Display : LED HD               |  | Display : LED HD               |  | Display : LED HD                |  | Display : LED HD                | |");
		     System.out.println("    | | Pixels  : 4K,3480*2160 display |  | Pixels  : 4K,3480*2160 display |  | Pixels  : 4K,3480*2160 display  |  | Pixels  : 4K,3480*2160 display  | |");
		     System.out.println("    | | Connections : wifi,Internet    |  | Connections : wifi,Internet    |  | Connections : wifi,Internet     |  | Connections : wifi,Internet     | |");
		     System.out.println("    | | Port    : 2 usb ports          |  | Port    : 2 usb ports          |  | Port    : 2 usb ports           |  | Port    : 2 usb ports           | |");
		     System.out.println("    | | Type    : QLED 4k TV           |  | Type    : QED 4k TV            |  | Type    : QLED 4k TV            |  | Type    : NEO QLED 4k TV        | |");
		     System.out.println("    | | Price   : Rs69,999/-           |  | Price   : Rs70,999/-           |  | Price   : Rs49,999/-            |  | Price   : Rs68,999/-            | |");
		     System.out.println("    | |________________________________|  |________________________________|  |_________________________________|  |_________________________________| |");
		     System.out.println("    |                                                                                                                                                  |");
		     System.out.println("    |               5.                                   6.                                   7.                                    8.                 |");
		     System.out.println("    |                                                              _______________________                                                             |");
		     System.out.println("    |                                                             |                       |                                                            |");
		     System.out.println("    |                                                             |       9.EXIT          |                                                            |");
		     System.out.println("    |                                                             |_______________________|                                                            |");
		     System.out.println("    |__________________________________________________________________________________________________________________________________________________|");
		     System.out.println(RESET);   
	        sonyTv3();
     }
     public static void sonyTv3()
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SONY BRAVIA 55 INCHES";ob1[i++]=28999;
						 		  System.out.println("Do you want to continue in Above 50 Inches [y/n or Y/N] :");  //CHUSKO KANNAAAAAAAAAA
						 		  do
						 		  {
						 			char c1=sc.next().toLowerCase().charAt(0);  
						 			switch(c1)	
									{
									case 'y':sonyTv3Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAA
									case 'n':sonyTv(); b=false; break;	 	// CHUSKOOOOOOOOOOOOOOOOOOOOOOOOO
						 			default : System.out.print("Please enter valid option: ");
									}
						 		  }while(b==true);b=false; break;
						 case 'n':
							 {
								 System.out.print("Do you want to see another model in Above 50 Inches [y/n or Y/N]:");   //CHUSKO KANNAAAAAAAAAA
									do
									{
										char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									switch(c1)	
									{
									case 'y':sonyTv3Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAAAAAAAAAAAA
									case 'n':{
										System.out.print("Do you want to continue in this brand (SONY) [y/n or Y/N]:");  //CHUSKO KANNA NAME MARCHALI
										do 
										{
											char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
											switch(c2)
											{
											case 'y': sonyTv(); b=false; break; //CHUSKO KANN BRAND METHOD MARCHALIIIIIIIIIIIIIIIIIIIII
											case 'n': tvList(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SONY BRAVIA 55 INCHES";ob1[i++]=39999;
					   System.out.println("Do you want to continue in Above 50 Inches [y/n or Y/N] :");  //CHUSKO KANNAAAAAAAAAA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  
						   switch(c1)	
						   {
						   case 'y':sonyTv3Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAA
						   case 'n':sonyTv(); b=false; break;	 	// CHUSKOOOOOOOOOOOOOOOOOOOOOOOOO
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in Above 50 Inches [y/n or Y/N]:");   //CHUSKO KANNAAAAAAAAAA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':sonyTv3Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAAAAAAAAAAAA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand (SONY) [y/n or Y/N]:");  //CHUSKO KANNA NAME MARCHALI
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': sonyTv(); b=false; break; //CHUSKO KANN BRAND METHOD MARCHALIIIIIIIIIIIIIIIIIIIII
									   case 'n': tvList(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SONY BRAVIA 55 INCHES";ob1[i++]=38999;
					   System.out.println("Do you want to continue in Above 50 Inches [y/n or Y/N] :");  //CHUSKO KANNAAAAAAAAAA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  
						   switch(c1)	
						   {
						   case 'y':sonyTv3Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAA
						   case 'n':sonyTv(); b=false; break;	 	// CHUSKOOOOOOOOOOOOOOOOOOOOOOOOO
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in Above 50 Inches [y/n or Y/N]:");   //CHUSKO KANNAAAAAAAAAA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':sonyTv3Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAAAAAAAAAAAA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand (SONY) [y/n or Y/N]:");  //CHUSKO KANNA NAME MARCHALI
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': sonyTv(); b=false; break; //CHUSKO KANN BRAND METHOD MARCHALIIIIIIIIIIIIIIIIIIIII
									   case 'n': tvList(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SONY BRAVIA 55 INCHES";ob1[i++]=49999;
					   System.out.println("Do you want to continue in Above 50 Inches [y/n or Y/N] :");  //CHUSKO KANNAAAAAAAAAA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  
						   switch(c1)	
						   {
						   case 'y':sonyTv3Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAA
						   case 'n':sonyTv(); b=false; break;	 	// CHUSKOOOOOOOOOOOOOOOOOOOOOOOOO
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in Above 50 Inches [y/n or Y/N]:");   //CHUSKO KANNAAAAAAAAAA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':sonyTv3Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAAAAAAAAAAAA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand (SONY) [y/n or Y/N]:");  //CHUSKO KANNA NAME MARCHALI
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': sonyTv(); b=false; break; //CHUSKO KANN BRAND METHOD MARCHALIIIIIIIIIIIIIIIIIIIII
									   case 'n': tvList(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SONY BRAVIA 65 INCHES";ob1[i++]=69999;
					   System.out.println("Do you want to continue in Above 50 Inches [y/n or Y/N] :");  //CHUSKO KANNAAAAAAAAAA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  
						   switch(c1)	
						   {
						   case 'y':sonyTv3Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAA
						   case 'n':sonyTv(); b=false; break;	 	// CHUSKOOOOOOOOOOOOOOOOOOOOOOOOO
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in Above 50 Inches [y/n or Y/N]:");   //CHUSKO KANNAAAAAAAAAA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':sonyTv3Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAAAAAAAAAAAA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand (SONY) [y/n or Y/N]:");  //CHUSKO KANNA NAME MARCHALI
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': sonyTv(); b=false; break; //CHUSKO KANN BRAND METHOD MARCHALIIIIIIIIIIIIIIIIIIIII
									   case 'n': tvList(); b=false; break;
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
			   case 6:
			   {
				   System.out.print("Do you want to add it to cart [y/n or Y/N]:"); 
				   do
				   {
					   char c=sc.next().toLowerCase().charAt(0);          
					   switch(c)
					   {
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SONY BRAVIA 65 INCHES";ob1[i++]=70999;
					   System.out.println("Do you want to continue in Above 50 Inches [y/n or Y/N] :");  //CHUSKO KANNAAAAAAAAAA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  
						   switch(c1)	
						   {
						   case 'y':sonyTv3Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAA
						   case 'n':sonyTv(); b=false; break;	 	// CHUSKOOOOOOOOOOOOOOOOOOOOOOOOO
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in Above 50 Inches [y/n or Y/N]:");   //CHUSKO KANNAAAAAAAAAA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':sonyTv3Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAAAAAAAAAAAA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand (SONY) [y/n or Y/N]:");  //CHUSKO KANNA NAME MARCHALI
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': sonyTv(); b=false; break; //CHUSKO KANN BRAND METHOD MARCHALIIIIIIIIIIIIIIIIIIIII
									   case 'n': tvList(); b=false; break;
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
			   case 7:
			   {
				   System.out.print("Do you want to add it to cart [y/n or Y/N]:"); 
				   do
				   {
					   char c=sc.next().toLowerCase().charAt(0);          
					   switch(c)
					   {
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SONY BRAVIA 65 INCHES";ob1[i++]=49999;
					   System.out.println("Do you want to continue in Above 50 Inches [y/n or Y/N] :");  //CHUSKO KANNAAAAAAAAAA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  
						   switch(c1)	
						   {
						   case 'y':sonyTv3Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAA
						   case 'n':sonyTv(); b=false; break;	 	// CHUSKOOOOOOOOOOOOOOOOOOOOOOOOO
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in Above 50 Inches [y/n or Y/N]:");   //CHUSKO KANNAAAAAAAAAA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':sonyTv3Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAAAAAAAAAAAA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand (SONY) [y/n or Y/N]:");  //CHUSKO KANNA NAME MARCHALI
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': sonyTv(); b=false; break; //CHUSKO KANN BRAND METHOD MARCHALIIIIIIIIIIIIIIIIIIIII
									   case 'n': tvList(); b=false; break;
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
			   case 8:
			   {
				   System.out.print("Do you want to add it to cart [y/n or Y/N]:"); 
				   do
				   {
					   char c=sc.next().toLowerCase().charAt(0);          
					   switch(c)
					   {
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SONY BRAVIA 65 INCHES";ob1[i++]=68999;
					   System.out.println("Do you want to continue in Above 50 Inches [y/n or Y/N] :");  //CHUSKO KANNAAAAAAAAAA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  
						   switch(c1)	
						   {
						   case 'y':sonyTv3Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAA
						   case 'n':sonyTv(); b=false; break;	 	// CHUSKOOOOOOOOOOOOOOOOOOOOOOOOO
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in Above 50 Inches [y/n or Y/N]:");   //CHUSKO KANNAAAAAAAAAA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':sonyTv3Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAAAAAAAAAAAA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand (SONY) [y/n or Y/N]:");  //CHUSKO KANNA NAME MARCHALI
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': sonyTv(); b=false; break; //CHUSKO KANN BRAND METHOD MARCHALIIIIIIIIIIIIIIIIIIIII
									   case 'n': tvList(); b=false; break;
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
			   case 9:sonyTv(); b=false; break;  //CHUSKO KANNA BRAND METHOD MARCHALI 
			   default: System.out.print("PLEASE ENTER VALID OPTION: ");
			   }
		   }while(b==true);
     }
     public static void xioamiTv()
     { System.out.println(RESET);
    	 System.out.println("\t\t\t\t\t\t"+"                          XIOAMI                            ");
    	 System.out.println("\t\t\t\t\t\t"+"                      -------------                      ");
    	 System.out.println("\t\t\t\t\t\t"+"                    1) BELOW 40 INCHES                      ");
    	 System.out.println("\t\t\t\t\t\t"+"                    2) BETWEEN 40 - 50 INCHES                   ");
    	 System.out.println("\t\t\t\t\t\t"+"                    3) EXIT                   ");
    	     	 
    	 System.out.print("PLEASE SELECT YOUR PREFERRED MODEL :"); System.out.println(RESET);
	       do
			 {
				int p=sc.nextInt();
				switch(p) 
				{
				case 1: xioamiTv1Display();; b=false; break;
				case 2: xioamiTv2Display(); b=false; break;
				case 3: tvList();b=false; break;
			    default:
			    	{
			    		System.out.println("Please enter valid option.");
			    		xioamiTv(); 
			    	}
				}
			 }while(b==true);
	     } 
     
     public static void xioamiTv1Display()
     { System.out.println(RESET);
		     System.out.println("     __________________________________________________________________________________________________________________________________________________");
		     System.out.println("    |  ________________________________    ________________________________    _________________________________    _________________________________  |");
		     System.out.println("    | |       Xiaomi Smart TV          |  |       Xiaomi Mi TV 4A Horizon  |  |       Xiaomi Mi TV 4A Pro       |  |       Xiaomi Smart TV 5A Pro    | |");
		     System.out.println("    | |--------------------------------|  |--------------------------------|  |---------------------------------|  |---------------------------------| |");
		     System.out.println("    | | Inches  : 32 inches            |  | Inches  : 32 inches            |  | Inches  : 24 inches             |  | Inches  : 40 inches             | |");
		     System.out.println("    | | Display : LED HD               |  | Display : LED HD               |  | Display : LED HD                |  | Display : LED HD                | |");
		     System.out.println("    | | Pixels  : 4K,3480*2160 display |  | Pixels  : 4K,3480*2160 display |  | Pixels  : 4K,3480*2160 display  |  | Pixels  : 4K,3480*2160 display  | |");
		     System.out.println("    | | Connections : wifi,Internet    |  | Connections : wifi,Internet    |  | Connections : wifi,Internet     |  | Connections : wifi,Internet     | |");
		     System.out.println("    | | Port    : 2 usb ports          |  | Port    : 2 usb ports          |  | Port    : 2 usb ports           |  | Port    : 2 usb ports           | |");
		     System.out.println("    | | Type    : LED 4k TV            |  | Type    : LED 4k TV            |  | Type    : LED 4k TV             |  | Type    : LED 4k TV             | |");
		     System.out.println("    | | Price   : Rs18,999/-           |  | Price   : Rs19,999/-           |  | Price   : Rs28,999/-            |  | Price   : Rs29,999/-            | |");
		     System.out.println("    | |________________________________|  |________________________________|  |_________________________________|  |_________________________________| |");
		     System.out.println("    |                                                                                                                                                  |");
		     System.out.println("    |               1.                                   2.                                   3.                                    4.                 |");
		     System.out.println("    |                                                                                                                                                  |");
		     System.out.println("    |                            ________________________________                        ________________________________                              |");
		     System.out.println("    |                           |       Xiaomi Mi TV 4C          |                      |                                |                             |");
		     System.out.println("    |                           |--------------------------------|                      |                                |                             |");
		     System.out.println("    |                           | Inches  : 35 inches            |                      |                                |                             |");
		     System.out.println("    |                           | Display : LED HD               |                      |                                |                             |");
		     System.out.println("    |                           | Pixels  : 4K,3480*2160 display |                      |              EXIT              |                             |");
		     System.out.println("    |                           | Connections : wifi,Internet    |                      |                                |                             |");
		     System.out.println("    |                           | Port    : 2 usb ports          |                      |                                |                             |"); 
		     System.out.println("    |                           | Type    : QLED 4k TV           |                      |                                |                             |");
		     System.out.println("    |                           | Price   : Rs29,999/-           |                      |                                |                             |");
		     System.out.println("    |                           |________________________________|                      |________________________________|                             |");
		     System.out.println("    |                                                                                                                                                  |");
		     System.out.println("    |                                          4.                                                       5.                                             |");
		     System.out.println("    |__________________________________________________________________________________________________________________________________________________|");
		     System.out.println(RESET); xioamiTv1();
     }
     public static void xioamiTv1()
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="XIAOMI 32 INCHES";ob1[i++]=18999;
						 		  System.out.println("Do you want to continue in Below 40 Inches [y/n or Y/N] :");  //CHUSKO KANNAAAAAAAAAA
						 		  do
						 		  {
						 			char c1=sc.next().toLowerCase().charAt(0);  
						 			switch(c1)	
									{
									case 'y':xioamiTv1Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAA
									case 'n':xioamiTv(); b=false; break;	 	// CHUSKOOOOOOOOOOOOOOOOOOOOOOOOO
						 			default : System.out.print("Please enter valid option: ");
									}
						 		  }while(b==true);b=false; break;
						 case 'n':
							 {
								 System.out.print("Do you want to see another model in Below 40 Inches [y/n or Y/N]:");   //CHUSKO KANNAAAAAAAAAA
									do
									{
										char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									switch(c1)	
									{
									case 'y':xioamiTv1Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAAAAAAAAAAAA
									case 'n':{
										System.out.print("Do you want to continue in this brand (XIOAMI) [y/n or Y/N]:");  //CHUSKO KANNA NAME MARCHALI
										do 
										{
											char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
											switch(c2)
											{
											case 'y': xioamiTv(); b=false; break; //CHUSKO KANN BRAND METHOD MARCHALIIIIIIIIIIIIIIIIIIIII
											case 'n': tvList(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="XIAOMI 32 INCHES";ob1[i++]=19999;
					   System.out.println("Do you want to continue in Below 40 Inches [y/n or Y/N] :");  //CHUSKO KANNAAAAAAAAAA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  
						   switch(c1)	
						   {
						   case 'y':xioamiTv1Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAA
						   case 'n':xioamiTv(); b=false; break;	 	// CHUSKOOOOOOOOOOOOOOOOOOOOOOOOO
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in Below 40 Inches [y/n or Y/N]:");   //CHUSKO KANNAAAAAAAAAA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':xioamiTv1Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAAAAAAAAAAAA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand (XIOAMI) [y/n or Y/N]:");  //CHUSKO KANNA NAME MARCHALI
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': xioamiTv(); b=false; break; //CHUSKO KANN BRAND METHOD MARCHALIIIIIIIIIIIIIIIIIIIII
									   case 'n': tvList(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="XIAOMI 24 INCHES";ob1[i++]=28999;
					   System.out.println("Do you want to continue in Below 40 Inches [y/n or Y/N] :");  //CHUSKO KANNAAAAAAAAAA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  
						   switch(c1)	
						   {
						   case 'y':xioamiTv1Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAA
						   case 'n':xioamiTv(); b=false; break;	 	// CHUSKOOOOOOOOOOOOOOOOOOOOOOOOO
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in Below 40 Inches [y/n or Y/N]:");   //CHUSKO KANNAAAAAAAAAA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':xioamiTv1Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAAAAAAAAAAAA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand (XIOAMI) [y/n or Y/N]:");  //CHUSKO KANNA NAME MARCHALI
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': xioamiTv(); b=false; break; //CHUSKO KANN BRAND METHOD MARCHALIIIIIIIIIIIIIIIIIIIII
									   case 'n': tvList(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="XIAOMI 40 INCHES";ob1[i++]=29999;
					   System.out.println("Do you want to continue in Below 40 Inches [y/n or Y/N] :");  //CHUSKO KANNAAAAAAAAAA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  
						   switch(c1)	
						   {
						   case 'y':xioamiTv1Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAA
						   case 'n':xioamiTv(); b=false; break;	 	// CHUSKOOOOOOOOOOOOOOOOOOOOOOOOO
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in Below 40 Inches [y/n or Y/N]:");   //CHUSKO KANNAAAAAAAAAA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':xioamiTv1Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAAAAAAAAAAAA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand (XIOAMI) [y/n or Y/N]:");  //CHUSKO KANNA NAME MARCHALI
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': xioamiTv(); b=false; break; //CHUSKO KANN BRAND METHOD MARCHALIIIIIIIIIIIIIIIIIIIII
									   case 'n': tvList(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="XIAOMI 35 INCHES";ob1[i++]=29999;
					   System.out.println("Do you want to continue in Below 40 Inches [y/n or Y/N] :");  //CHUSKO KANNAAAAAAAAAA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  
						   switch(c1)	
						   {
						   case 'y':xioamiTv1Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAA
						   case 'n':xioamiTv(); b=false; break;	 	// CHUSKOOOOOOOOOOOOOOOOOOOOOOOOO
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in Below 40 Inches [y/n or Y/N]:");   //CHUSKO KANNAAAAAAAAAA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':xioamiTv1Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAAAAAAAAAAAA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand (XIOAMI) [y/n or Y/N]:");  //CHUSKO KANNA NAME MARCHALI
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': xioamiTv(); b=false; break; //CHUSKO KANN BRAND METHOD MARCHALIIIIIIIIIIIIIIIIIIIII
									   case 'n': tvList(); b=false; break;
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
			   case 6:xioamiTv(); b=false; break;  //CHUSKO KANNA BRAND METHOD MARCHALI 
			   default: System.out.print("PLEASE ENTER VALID OPTION: ");
			   }
		   }while(b==true);
     }
     public static void xioamiTv2Display()
     { System.out.println(RESET);
	        System.out.println("     __________________________________________________________________________________________________________________________________________________");
	        System.out.println("    |  ________________________________    ________________________________    _________________________________    _________________________________  |");
	        System.out.println("    | |       Xiaomi Mi TV 4A Horizon  |  |       Xiaomi Mi TV 4X          |  |       Xiaomi Smart TV X Series  |  |       Xiaomi Mi TV 5X           | |");
	        System.out.println("    | |--------------------------------|  |--------------------------------|  |---------------------------------|  |---------------------------------| |");
	        System.out.println("    | | Inches  : 55 inches (139 cm)   |  | Inches  : 55 inches (139 cm)   |  | Inches  : 55 inches (139 cm)    |  | Inches  : 55 inches (139 cm)    | |");
	        System.out.println("    | | Display : LED HD               |  | Display : LED HD               |  | Display : LED HD                |  | Display : LED HD                | |");
	        System.out.println("    | | Pixels  : 4K,3480*2160 display |  | Pixels  : 4K,3480*2160 display |  | Pixels  : 4K,3480*2160 display  |  | Pixels  : 4K,3480*2160 display  | |");
	        System.out.println("    | | Connections : wifi,Internet    |  | Connections : wifi,Internet    |  | Connections : wifi,Internet     |  | Connections : wifi,Internet     | |");
	        System.out.println("    | | Port    : 2 usb ports          |  | Port    : 2 usb ports          |  | Port    : 2 usb ports           |  | Port    : 2 usb ports           | |");
	        System.out.println("    | | Type    : LED 4k TV            |  | Type    : LED 4k TV            |  | Type    : LED 4k TV             |  | Type    : LED 4k TV             | |");
	        System.out.println("    | | Price   : Rs38,999/-           |  | Price   : Rs49,999/-           |  | Price   : Rs48,999/-            |  | Price   : Rs69,999/-            | |");
	        System.out.println("    | |________________________________|  |________________________________|  |_________________________________|  |_________________________________| |");
	        System.out.println("    |                                                                                                                                                  |");
	        System.out.println("    |               1.                                   2.                                   3.                                    4.                 |");
	        System.out.println("    |                    ________________________________    ________________________________    _________________________________                     |");
	        System.out.println("    |                   |       Xiaomi Redmi Smart       |  |       Xiaomi Mi TV 4X          |  |                                 |                    |");
	        System.out.println("    |                   |--------------------------------|  |--------------------------------|  |                                 |                    |");
	        System.out.println("    |                   | Inches  : 65 inches (165 cm)   |  | Inches  : 65 inches (165 cm)   |  |                                 |                    |");
	        System.out.println("    |                   | Display : LED HD               |  | Display : LED HD               |  |                                 |                    |");
	        System.out.println("    |                   | Pixels  : 4K,3480*2160 display |  | Pixels  : 4K,3480*2160 display |  |             EXIT                |                    |");
	        System.out.println("    |                   | Connections : wifi,Internet    |  | Connections : wifi,Internet    |  |                                 |                    |");
	        System.out.println("    |                   | Port    : 2 usb ports          |  | Port    : 2 usb ports          |  |                                 |                    |"); 
	        System.out.println("    |                   | Type    : QLED 4k TV           |  | Type    : QLED 4k TV           |  |                                 |                    |"); 
	        System.out.println("    |                   | Price   : Rs79,999/-           |  | Price   : Rs89,999/-           |  |                                 |                    |");
	        System.out.println("    |                   |________________________________|  |________________________________|  |_________________________________|                    |");
	        System.out.println("    |                                                                                                                                                  |");
	        System.out.println("    |                                  5.                                   6.                                  7.                                     |");
	        System.out.println("    |__________________________________________________________________________________________________________________________________________________|");
	        
	        System.out.println(RESET);
	        xioamiTv2();
	        }
     public static void xioamiTv2()
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="XIAOMI 55 INCHES";ob1[i++]=38999;
						 		  System.out.println("Do you want to continue in Between 40 - 50 Inches [y/n or Y/N] :");  //CHUSKO KANNAAAAAAAAAA
						 		  do
						 		  {
						 			char c1=sc.next().toLowerCase().charAt(0);  
						 			switch(c1)	
									{
									case 'y':xioamiTv2Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAA
									case 'n':xioamiTv(); b=false; break;	 	// CHUSKOOOOOOOOOOOOOOOOOOOOOOOOO
						 			default : System.out.print("Please enter valid option: ");
									}
						 		  }while(b==true);b=false; break;
						 case 'n':
							 {
								 System.out.print("Do you want to see another model in Between 40 - 50 Inches [y/n or Y/N]:");   //CHUSKO KANNAAAAAAAAAA
									do
									{
										char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									switch(c1)	
									{
									case 'y':xioamiTv2Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAAAAAAAAAAAA
									case 'n':{
										System.out.print("Do you want to continue in this brand (XIOAMI) [y/n or Y/N]:");  //CHUSKO KANNA NAME MARCHALI
										do 
										{
											char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
											switch(c2)
											{
											case 'y': xioamiTv(); b=false; break; //CHUSKO KANN BRAND METHOD MARCHALIIIIIIIIIIIIIIIIIIIII
											case 'n': tvList(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="XIAOMI 55 INCHES";ob1[i++]=49999;
					   System.out.println("Do you want to continue in Between 40 - 50 Inches [y/n or Y/N] :");  //CHUSKO KANNAAAAAAAAAA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  
						   switch(c1)	
						   {
						   case 'y':xioamiTv2Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAA
						   case 'n':xioamiTv(); b=false; break;	 	// CHUSKOOOOOOOOOOOOOOOOOOOOOOOOO
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in Between 40 - 50 Inches [y/n or Y/N]:");   //CHUSKO KANNAAAAAAAAAA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':xioamiTv2Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAAAAAAAAAAAA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand (XIOAMI) [y/n or Y/N]:");  //CHUSKO KANNA NAME MARCHALI
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': xioamiTv(); b=false; break; //CHUSKO KANN BRAND METHOD MARCHALIIIIIIIIIIIIIIIIIIIII
									   case 'n': tvList(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="XIAOMI 55 INCHES";ob1[i++]=48999;
					   System.out.println("Do you want to continue in Between 40 - 50 Inches [y/n or Y/N] :");  //CHUSKO KANNAAAAAAAAAA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  
						   switch(c1)	
						   {
						   case 'y':xioamiTv2Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAA
						   case 'n':xioamiTv(); b=false; break;	 	// CHUSKOOOOOOOOOOOOOOOOOOOOOOOOO
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in Between 40 - 50 Inches [y/n or Y/N]:");   //CHUSKO KANNAAAAAAAAAA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':xioamiTv2Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAAAAAAAAAAAA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand (XIOAMI) [y/n or Y/N]:");  //CHUSKO KANNA NAME MARCHALI
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': xioamiTv(); b=false; break; //CHUSKO KANN BRAND METHOD MARCHALIIIIIIIIIIIIIIIIIIIII
									   case 'n': tvList(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="XIAOMI 55 INCHES";ob1[i++]=69999;
					   System.out.println("Do you want to continue in Between 40 - 50 Inches [y/n or Y/N] :");  //CHUSKO KANNAAAAAAAAAA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  
						   switch(c1)	
						   {
						   case 'y':xioamiTv2Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAA
						   case 'n':xioamiTv(); b=false; break;	 	// CHUSKOOOOOOOOOOOOOOOOOOOOOOOOO
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in Between 40 - 50 Inches [y/n or Y/N]:");   //CHUSKO KANNAAAAAAAAAA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':xioamiTv2Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAAAAAAAAAAAA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand (XIOAMI) [y/n or Y/N]:");  //CHUSKO KANNA NAME MARCHALI
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': xioamiTv(); b=false; break; //CHUSKO KANN BRAND METHOD MARCHALIIIIIIIIIIIIIIIIIIIII
									   case 'n': tvList(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="XIAOMI 65 INCHES";ob1[i++]=79999;
					   System.out.println("Do you want to continue in Between 40 - 50 Inches [y/n or Y/N] :");  //CHUSKO KANNAAAAAAAAAA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  
						   switch(c1)	
						   {
						   case 'y':xioamiTv2Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAA
						   case 'n':xioamiTv(); b=false; break;	 	// CHUSKOOOOOOOOOOOOOOOOOOOOOOOOO
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in Between 40 - 50 Inches [y/n or Y/N]:");   //CHUSKO KANNAAAAAAAAAA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  
							   switch(c1)	
							   {
							   case 'y':xioamiTv2Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAAAAAAAAAAAA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand (XIOAMI) [y/n or Y/N]:");  //CHUSKO KANNA NAME MARCHALI
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': xioamiTv(); b=false; break; //CHUSKO KANN BRAND METHOD MARCHALIIIIIIIIIIIIIIIIIIIII
									   case 'n': tvList(); b=false; break;
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
			   case 6:
			   {
				   System.out.print("Do you want to add it to cart [y/n or Y/N]:"); 
				   do
				   {
					   char c=sc.next().toLowerCase().charAt(0);          
					   switch(c)
					   {
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="XIAOMI 65 INCHES";ob1[i++]=89999;
					   System.out.println("Do you want to continue in Between 40 - 50 Inches [y/n or Y/N] :");  //CHUSKO KANNAAAAAAAAAA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  
						   switch(c1)	
						   {
						   case 'y':xioamiTv2Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAA
						   case 'n':xioamiTv(); b=false; break;	 	// CHUSKOOOOOOOOOOOOOOOOOOOOOOOOO
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in Between 40 - 50 Inches [y/n or Y/N]:");   //CHUSKO KANNAAAAAAAAAA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':xioamiTv2Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAAAAAAAAAAAA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand (XIOAMI) [y/n or Y/N]:");  //CHUSKO KANNA NAME MARCHALI
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': xioamiTv(); b=false; break; //CHUSKO KANN BRAND METHOD MARCHALIIIIIIIIIIIIIIIIIIIII
									   case 'n': tvList(); b=false; break;
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
			   case 7:xioamiTv(); b=false; break;  //CHUSKO KANNA BRAND METHOD MARCHALI 
			   default: System.out.print("PLEASE ENTER VALID OPTION: ");
			   }
		   }while(b==true);
     }
     public static void realmeTv()
     {
    	 System.out.println(RESET);
    	 System.out.println("\t\t\t\t\t\t"+"                          REALME                            ");
    	 System.out.println("\t\t\t\t\t\t"+"                      -------------                      ");
    	 System.out.println("\t\t\t\t\t\t"+"                    1) BELOW 40 INCHES                      ");
    	 System.out.println("\t\t\t\t\t\t"+"                    2) BETWEEN 40 - 50 INCHES                   ");
    	 System.out.println("\t\t\t\t\t\t"+"                    3) EXIT                   ");
    	     	 
    	 System.out.print("PLEASE SELECT YOUR PREFERRED MODEL :"); System.out.println(RESET);
    	 do
		 {
			int p=sc.nextInt();
			switch(p) 
			{
			case 1: realmeTv1Display();; b=false; break;
			case 2: realmeTv2Display(); b=false; break;
			case 3: tvList();b=false; break;
		    default:
		    	{
		    		System.out.println("Please enter valid option.");
		    		realmeTv();
		    	}
			}
		 }while(b==true);
     }
     public static void realmeTv1Display()
     { System.out.println(RESET);
	        System.out.println("     __________________________________________________________________________________________________________________________________________________");
	        System.out.println("    |                                                                                                                                                  |");
	        System.out.println("    |  ________________________________    ________________________________    _________________________________    _________________________________  |");
	        System.out.println("    | |       Realme Smart TV          |  |       Realme Smart TV Neo      |  |       Realme Smart TV core      |  |                                 | |");
	        System.out.println("    | |--------------------------------|  |--------------------------------|  |---------------------------------|  |                                 | |");
	        System.out.println("    | | Inches  : 32 inches (81 cm)    |  | Inches  : 32 inches (81 cm)    |  | Inches  : 32 inches (81 cm)     |  |                                 | |");
	        System.out.println("    | | Display : LED HD               |  | Display : LED HD               |  | Display : LED HD                |  |                                 | |");
	        System.out.println("    | | Pixels  : 4K,3480*2160 display |  | Pixels  : 4K,3480*2160 display |  | Pixels  : 4K,3480*2160 display  |  |              EXIT               | |");
	        System.out.println("    | | Connections : wifi,Internet    |  | Connections : wifi,Internet    |  | Connections : wifi,Internet     |  |                                 | |");
	        System.out.println("    | | Port    : 2 usb ports          |  | Port    : 2 usb ports          |  | Port    : 2 usb ports           |  |                                 | |");
	        System.out.println("    | | Type    :Smart TV              |  | Type    : Smart TV             |  | Type    : Smart TV              |  |                                 | |");
	        System.out.println("    | | Price   :Rs18,999/-            |  | Price   :Rs19,999/-            |  | Price   : Rs25,999/-            |  |                                 | |");
	        System.out.println("    | |________________________________|  |________________________________|  |_________________________________|  |_________________________________| |");
	        System.out.println("    |                                                                                                                                                  |");
	        System.out.println("    |               1.                                   2.                                   3.                                    4.                 |");
	        System.out.println("    |__________________________________________________________________________________________________________________________________________________|");
	         System.out.println(RESET);
	        realmeTv1();
	        
     }
     public static void realmeTv1()
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="REALME 32 INCHES";ob1[i++]=18999;
						 		  System.out.println("Do you want to continue in Below 40 Inches [y/n or Y/N] :");  //CHUSKO KANNAAAAAAAAAA
						 		  do
						 		  {
						 			char c1=sc.next().toLowerCase().charAt(0);  
						 			switch(c1)	
									{
									case 'y':realmeTv1Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAA
									case 'n':realmeTv(); b=false; break;	 	// CHUSKOOOOOOOOOOOOOOOOOOOOOOOOO
						 			default : System.out.print("Please enter valid option: ");
									}
						 		  }while(b==true);b=false; break;
						 case 'n':
							 {
								 System.out.print("Do you want to see another model in Below 40 Inches [y/n or Y/N]:");   //CHUSKO KANNAAAAAAAAAA
									do
									{
										char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									switch(c1)	
									{
									case 'y':realmeTv1Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAAAAAAAAAAAA
									case 'n':{
										System.out.print("Do you want to continue in this brand (REALME) [y/n or Y/N]:");  //CHUSKO KANNA NAME MARCHALI
										do 
										{
											char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
											switch(c2)
											{
											case 'y': realmeTv(); b=false; break; //CHUSKO KANN BRAND METHOD MARCHALIIIIIIIIIIIIIIIIIIIII
											case 'n': tvList(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="REALME 32 INCHES";ob1[i++]=19999;
					   System.out.println("Do you want to continue in Below 40 Inches [y/n or Y/N] :");  //CHUSKO KANNAAAAAAAAAA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  
						   switch(c1)	
						   {
						   case 'y':realmeTv1Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAA
						   case 'n':realmeTv(); b=false; break;	 	// CHUSKOOOOOOOOOOOOOOOOOOOOOOOOO
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in Below 40 Inches [y/n or Y/N]:");   //CHUSKO KANNAAAAAAAAAA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':realmeTv1Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAAAAAAAAAAAA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand (REALME) [y/n or Y/N]:");  //CHUSKO KANNA NAME MARCHALI
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': realmeTv(); b=false; break; //CHUSKO KANN BRAND METHOD MARCHALIIIIIIIIIIIIIIIIIIIII
									   case 'n': tvList(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="REALME 32 INCHES";ob1[i++]=25999;
					   System.out.println("Do you want to continue in Below 40 Inches [y/n or Y/N] :");  //CHUSKO KANNAAAAAAAAAA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  
						   switch(c1)	
						   {
						   case 'y':realmeTv1Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAA
						   case 'n':realmeTv(); b=false; break;	 	// CHUSKOOOOOOOOOOOOOOOOOOOOOOOOO
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in Below 40 Inches [y/n or Y/N]:");   //CHUSKO KANNAAAAAAAAAA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':realmeTv1Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAAAAAAAAAAAA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand (REALME) [y/n or Y/N]:");  //CHUSKO KANNA NAME MARCHALI
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': realmeTv(); b=false; break; //CHUSKO KANN BRAND METHOD MARCHALIIIIIIIIIIIIIIIIIIIII
									   case 'n': tvList(); b=false; break;
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
			   case 4:realmeTv(); b=false; break;  //CHUSKO KANNA BRAND METHOD MARCHALI 
			   default: System.out.print("PLEASE ENTER VALID OPTION: ");
			   }
		   }while(b==true);
     }

     public static void realmeTv2Display()
     { System.out.println(RESET);
	        System.out.println("     __________________________________________________________________________________________________________________________________________________");
	        System.out.println("    |                                                                                                                                                  |");
	        System.out.println("    |  ________________________________    ________________________________    _________________________________    _________________________________  |");
	        System.out.println("    | |       Realme Smart TV X        |  |       Realme Smart TV N        |  |       Realme Smart TV 50        |  |                                 | |");
	        System.out.println("    | |--------------------------------|  |--------------------------------|  |---------------------------------|  |                                 | |");
	        System.out.println("    | | Inches  : 40 inches            |  | Inches  : 42 inches            |  | Inches  : 50 inches             |  |                                 | |");
	        System.out.println("    | | Display : LED HD               |  | Display : LED HD               |  | Display : LED HD                |  |                                 | |");
	        System.out.println("    | | Pixels  : 4K,3480*2160 display |  | Pixels  : 4K,3480*2160 display |  | Pixels  : 4K,3480*2160 display  |  |              EXIT               | |");
	        System.out.println("    | | Connections : wifi,Internet    |  | Connections : wifi,Internet    |  | Connections : wifi,Internet     |  |                                 | |");
	        System.out.println("    | | Port    : 2 usb ports          |  | Port    : 2 usb ports          |  | Port    : 2 usb ports           |  |                                 | |");
	        System.out.println("    | | Type    : Smart TV             |  | Type    : Smart TV             |  | Type    : Smart TV              |  |                                 | |");
	        System.out.println("    | | Price   : Rs28,999/-           |  | Price   : Rs39,999/-           |  | Price   : Rs48,999/-            |  |                                 | |");
	        System.out.println("    | |________________________________|  |________________________________|  |_________________________________|  |_________________________________| |");
	        System.out.println("    |                                                                                                                                                  |");
	        System.out.println("    |               1.                                   2.                                   3.                                    4.                 |");
	        System.out.println("    |__________________________________________________________________________________________________________________________________________________|");
	         System.out.println(RESET);
	        realmeTv2();
     }
     public static void realmeTv2()
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="REALME 40 INCHES";ob1[i++]=28999;
						 		  System.out.println("Do you want to continue in Between 40 - 50 Inches [y/n or Y/N] :");  //CHUSKO KANNAAAAAAAAAA
						 		  do
						 		  {
						 			char c1=sc.next().toLowerCase().charAt(0);  
						 			switch(c1)	
									{
									case 'y':realmeTv2Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAA
									case 'n':realmeTv(); b=false; break;	 	// CHUSKOOOOOOOOOOOOOOOOOOOOOOOOO
						 			default : System.out.print("Please enter valid option: ");
									}
						 		  }while(b==true);b=false; break;
						 case 'n':
							 {
								 System.out.print("Do you want to see another model in Between 40 - 50 Inches [y/n or Y/N]:");   //CHUSKO KANNAAAAAAAAAA
									do
									{
										char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									switch(c1)	
									{
									case 'y':realmeTv2Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAAAAAAAAAAAA
									case 'n':{
										System.out.print("Do you want to continue in this brand (REALME) [y/n or Y/N]:");  //CHUSKO KANNA NAME MARCHALI
										do 
										{
											char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
											switch(c2)
											{
											case 'y': realmeTv(); b=false; break; //CHUSKO KANN BRAND METHOD MARCHALIIIIIIIIIIIIIIIIIIIII
											case 'n': tvList(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="REALME 42 INCHES";ob1[i++]=39999;
					   System.out.println("Do you want to continue in Between 40 - 50 Inches [y/n or Y/N] :");  //CHUSKO KANNAAAAAAAAAA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  
						   switch(c1)	
						   {
						   case 'y':realmeTv2Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAA
						   case 'n':realmeTv(); b=false; break;	 	// CHUSKOOOOOOOOOOOOOOOOOOOOOOOOO
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in Between 40 - 50 Inches [y/n or Y/N]:");   //CHUSKO KANNAAAAAAAAAA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':realmeTv2Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAAAAAAAAAAAA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand (REALME) [y/n or Y/N]:");  //CHUSKO KANNA NAME MARCHALI
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': realmeTv(); b=false; break; //CHUSKO KANN BRAND METHOD MARCHALIIIIIIIIIIIIIIIIIIIII
									   case 'n': tvList(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="REALME 50 INCHES";ob1[i++]=48999;
					   System.out.println("Do you want to continue in Between 40 - 50 Inches [y/n or Y/N] :");  //CHUSKO KANNAAAAAAAAAA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  
						   switch(c1)	
						   {
						   case 'y':realmeTv2Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAA
						   case 'n':realmeTv(); b=false; break;	 	// CHUSKOOOOOOOOOOOOOOOOOOOOOOOOO
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in Between 40 - 50 Inches [y/n or Y/N]:");   //CHUSKO KANNAAAAAAAAAA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':realmeTv2Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAAAAAAAAAAAA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand (REALME) [y/n or Y/N]:");  //CHUSKO KANNA NAME MARCHALI
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': realmeTv(); b=false; break; //CHUSKO KANN BRAND METHOD MARCHALIIIIIIIIIIIIIIIIIIIII
									   case 'n': tvList(); b=false; break;
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
			   case 4:realmeTv(); b=false; break;  //CHUSKO KANNA BRAND METHOD MARCHALI 
			   default: System.out.print("PLEASE ENTER VALID OPTION: ");
			   }
		   }while(b==true);
     }
     public static void panasonicTv()
     { System.out.println(RESET);
    	 System.out.println("\t\t\t\t\t\t"+"                        PANASONIC                            ");
    	 System.out.println("\t\t\t\t\t\t"+"                      -------------                      ");
    	 System.out.println("\t\t\t\t\t\t"+"                    1) BELOW 40 INCHES                      ");
    	 System.out.println("\t\t\t\t\t\t"+"                    2) BETWEEN 40 - 50 INCHES                   ");
    	 System.out.println("\t\t\t\t\t\t"+"                    3) ABOVE 50 INCHES                   ");
    	 System.out.println("\t\t\t\t\t\t"+"                    4) EXIT                   ");
    	     	 
    	 System.out.print("PLEASE SELECT YOUR PREFERRED MODEL :"); System.out.println(RESET);
 	    do
		 {
			int p=sc.nextInt();
			switch(p) 
			{
			case 1: panasonicTv1Display(); b=false; break;
			case 2: panasonicTv2Display(); b=false; break;
			case 3:panasonicTv3Display(); b=false; break;
			case 4: tvList();b=false; break;
		    default:
		    	{
		    		System.out.println("Please enter valid option.");
		    		panasonicTv();
		    	}
			}
		 }while(b==true);
     }
     public static void panasonicTv1Display()
     { System.out.println(RESET);
			 System.out.println("     __________________________________________________________________________________________________________________________________________________");
		     System.out.println("    |  ________________________________    ________________________________    _________________________________    _________________________________  |");
		     System.out.println("    | |       Panasonic TH-32LS560DX   |  |       Panasonic TH-32LS680DX   |  |       Panasonic TH-32LS550DX    |  |       Panasonic TH-32J200DX     | |");
		     System.out.println("    | |--------------------------------|  |--------------------------------|  |---------------------------------|  |---------------------------------| |");
		     System.out.println("    | | Inches  : 32 inches (82 cm)    |  | Inches  : 32 inches (82 cm)    |  | Inches  : 32 inches (81 cm)     |  | Inches  : 32 inches (81 cm)     | |");
		     System.out.println("    | | Display : LED HD               |  | Display : LED HD               |  | Display : LED HD                |  | Display : LED HD                | |");
		     System.out.println("    | | Pixels  : 4K,3480*2160 display |  | Pixels  : 4K,3480*2160 display |  | Pixels  : 4K,3480*2160 display  |  | Pixels  : 4K,3480*2160 display  | |");
		     System.out.println("    | | Connections : wifi,Internet    |  | Connections : wifi,Internet    |  | Connections : wifi,Internet     |  | Connections : wifi,Internet     | |");
		     System.out.println("    | | Port    : 2 usb ports          |  | Port    : 2 usb ports          |  | Port    : 2 usb ports           |  | Port    : 2 usb ports           | |");
		     System.out.println("    | | Type    : Smart TV             |  | Type    : Smart TV             |  | Type    : Smart TV              |  | Type    : Smart TV              | |");
		     System.out.println("    | | Price   : Rs18,999/-           |  | Price   : Rs18,999/-           |  | Price   : Rs19,999/-            |  | Price   : Rs21,999/-            | |");
		     System.out.println("    | |________________________________|  |________________________________|  |_________________________________|  |_________________________________| |");
		     System.out.println("    |                                                                                                                                                  |");
		     System.out.println("    |               1.                                   2.                                   3.                                    4.                 |");
		     System.out.println("    |  ________________________________    ________________________________    _________________________________    _________________________________  |");
		     System.out.println("    | |    Panasonic VIERA TH-32F4DX   |  |     Panasonic VIERA TH-32D00D  |  |    Panasonic VIERA TH-32D0DX    |  |     Panasonic S2 PROE           | |");
		     System.out.println("    | |--------------------------------|  |--------------------------------|  |---------------------------------|  |---------------------------------| |");
		     System.out.println("    | | Inches  : 32 inches (82 cm)    |  | Inches  : 32 inches (82 cm)    |  | Inches  : 32 inches (82 cm)     |  | Inches  :  38 inches            | |");
		     System.out.println("    | | Display : LED HD               |  | Display : LED HD               |  | Display : LED HD                |  | Display : LED HD                | |");
		     System.out.println("    | | Pixels  : 4K,3480*2160 display |  | Pixels  : 4K,3480*2160 display |  | Pixels  : 4K,3480*2160 display  |  | Pixels  : 4K,3480*2160 display  | |");
		     System.out.println("    | | Connections : wifi,Internet    |  | Connections : wifi,Internet    |  | Connections : wifi,Internet     |  | Connections : wifi,Internet     | |");
		     System.out.println("    | | Port    : 2 usb ports          |  | Port    : 2 usb ports          |  | Port    : 2 usb ports           |  | Port    : 2 usb ports           | |");
		     System.out.println("    | | Type    : Smart TV             |  | Type    : Smart TV             |  | Type    : Smart TV              |  | Type    : Smart TV              | |");
		     System.out.println("    | | Price   : Rs28,999/-           |  | Price   : Rs38,999/-           |  | Price   : Rs48,999/-            |  | Price   : Rs58,999/-            | |");
		     System.out.println("    | |________________________________|  |________________________________|  |_________________________________|  |_________________________________| |");
		     System.out.println("    |                                                                                                                                                  |");
		     System.out.println("    |               5.                                   6.                                   7.                                    8.                 |");
		     System.out.println("    |                                                              _______________________                                                             |");
		     System.out.println("    |                                                             |                       |                                                            |");
		     System.out.println("    |                                                             |       9.EXIT          |                                                            |");
		     System.out.println("    |                                                             |_______________________|                                                            |");
		     System.out.println("    |__________________________________________________________________________________________________________________________________________________|");
		      System.out.println(RESET);
	        panasonicTv1();
     }
     public static void panasonicTv1()
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="PANASONIC 32 INCHES";ob1[i++]=18999;
						 		  System.out.println("Do you want to continue in Below 40 Inches [y/n or Y/N] :");  //CHUSKO KANNAAAAAAAAAA
						 		  do
						 		  {
						 			char c1=sc.next().toLowerCase().charAt(0);  
						 			switch(c1)	
									{
									case 'y':panasonicTv1Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAA
									case 'n':panasonicTv(); b=false; break;	 	// CHUSKOOOOOOOOOOOOOOOOOOOOOOOOO
						 			default : System.out.print("Please enter valid option: ");
									}
						 		  }while(b==true);b=false; break;
						 case 'n':
							 {
								 System.out.print("Do you want to see another model in Below 40 Inches [y/n or Y/N]:");   //CHUSKO KANNAAAAAAAAAA
									do
									{
										char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									switch(c1)	
									{
									case 'y':panasonicTv1Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAAAAAAAAAAAA
									case 'n':{
										System.out.print("Do you want to continue in this brand (PANASONIC) [y/n or Y/N]:");  //CHUSKO KANNA NAME MARCHALI
										do 
										{
											char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
											switch(c2)
											{
											case 'y': panasonicTv(); b=false; break; //CHUSKO KANN BRAND METHOD MARCHALIIIIIIIIIIIIIIIIIIIII
											case 'n': tvList(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="PANASONIC 32 INCHES";ob1[i++]=18999;
					   System.out.println("Do you want to continue in Below 40 Inches [y/n or Y/N] :");  //CHUSKO KANNAAAAAAAAAA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  
						   switch(c1)	
						   {
						   case 'y':panasonicTv1Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAA
						   case 'n':panasonicTv(); b=false; break;	 	// CHUSKOOOOOOOOOOOOOOOOOOOOOOOOO
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in Below 40 Inches [y/n or Y/N]:");   //CHUSKO KANNAAAAAAAAAA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':panasonicTv1Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAAAAAAAAAAAA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand (PANASONIC) [y/n or Y/N]:");  //CHUSKO KANNA NAME MARCHALI
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': panasonicTv(); b=false; break; //CHUSKO KANN BRAND METHOD MARCHALIIIIIIIIIIIIIIIIIIIII
									   case 'n': tvList(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="PANASONIC 32 INCHES";ob1[i++]=19999;
					   System.out.println("Do you want to continue in Below 40 Inches [y/n or Y/N] :");  //CHUSKO KANNAAAAAAAAAA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  
						   switch(c1)	
						   {
						   case 'y':panasonicTv1Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAA
						   case 'n':panasonicTv(); b=false; break;	 	// CHUSKOOOOOOOOOOOOOOOOOOOOOOOOO
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in Below 40 Inches [y/n or Y/N]:");   //CHUSKO KANNAAAAAAAAAA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':panasonicTv1Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAAAAAAAAAAAA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand (PANASONIC) [y/n or Y/N]:");  //CHUSKO KANNA NAME MARCHALI
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': panasonicTv(); b=false; break; //CHUSKO KANN BRAND METHOD MARCHALIIIIIIIIIIIIIIIIIIIII
									   case 'n': tvList(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="PANASONIC 32 INCHES";ob1[i++]=21999;
					   System.out.println("Do you want to continue in Below 40 Inches [y/n or Y/N] :");  //CHUSKO KANNAAAAAAAAAA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  
						   switch(c1)	
						   {
						   case 'y':panasonicTv1Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAA
						   case 'n':panasonicTv(); b=false; break;	 	// CHUSKOOOOOOOOOOOOOOOOOOOOOOOOO
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in Below 40 Inches [y/n or Y/N]:");   //CHUSKO KANNAAAAAAAAAA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':panasonicTv1Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAAAAAAAAAAAA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand (PANASONIC) [y/n or Y/N]:");  //CHUSKO KANNA NAME MARCHALI
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': panasonicTv(); b=false; break; //CHUSKO KANN BRAND METHOD MARCHALIIIIIIIIIIIIIIIIIIIII
									   case 'n': tvList(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="PANASONIC 32 INCHES";ob1[i++]=28999;
					   System.out.println("Do you want to continue in Below 40 Inches [y/n or Y/N] :");  //CHUSKO KANNAAAAAAAAAA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  
						   switch(c1)	
						   {
						   case 'y':panasonicTv1Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAA
						   case 'n':panasonicTv(); b=false; break;	 	// CHUSKOOOOOOOOOOOOOOOOOOOOOOOOO
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in Below 40 Inches [y/n or Y/N]:");   //CHUSKO KANNAAAAAAAAAA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':panasonicTv1Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAAAAAAAAAAAA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand (PANASONIC) [y/n or Y/N]:");  //CHUSKO KANNA NAME MARCHALI
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': panasonicTv(); b=false; break; //CHUSKO KANN BRAND METHOD MARCHALIIIIIIIIIIIIIIIIIIIII
									   case 'n': tvList(); b=false; break;
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
			   case 6:
			   {
				   System.out.print("Do you want to add it to cart [y/n or Y/N]:"); 
				   do
				   {
					   char c=sc.next().toLowerCase().charAt(0);          
					   switch(c)
					   {
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="PANASONIC 32 INCHES";ob1[i++]=38999;
					   System.out.println("Do you want to continue in Below 40 Inches [y/n or Y/N] :");  //CHUSKO KANNAAAAAAAAAA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  
						   switch(c1)	
						   {
						   case 'y':panasonicTv1Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAA
						   case 'n':panasonicTv(); b=false; break;	 	// CHUSKOOOOOOOOOOOOOOOOOOOOOOOOO
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in Below 40 Inches [y/n or Y/N]:");   //CHUSKO KANNAAAAAAAAAA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':panasonicTv1Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAAAAAAAAAAAA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand (PANASONIC) [y/n or Y/N]:");  //CHUSKO KANNA NAME MARCHALI
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': panasonicTv(); b=false; break; //CHUSKO KANN BRAND METHOD MARCHALIIIIIIIIIIIIIIIIIIIII
									   case 'n': tvList(); b=false; break;
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
			   case 7:
			   {
				   System.out.print("Do you want to add it to cart [y/n or Y/N]:"); 
				   do
				   {
					   char c=sc.next().toLowerCase().charAt(0);          
					   switch(c)
					   {
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="PANASONIC 32 INCHES";ob1[i++]=48999;
					   System.out.println("Do you want to continue in Below 40 Inches [y/n or Y/N] :");  //CHUSKO KANNAAAAAAAAAA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  
						   switch(c1)	
						   {
						   case 'y':panasonicTv1Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAA
						   case 'n':panasonicTv(); b=false; break;	 	// CHUSKOOOOOOOOOOOOOOOOOOOOOOOOO
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in Below 40 Inches [y/n or Y/N]:");   //CHUSKO KANNAAAAAAAAAA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':panasonicTv1Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAAAAAAAAAAAA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand (PANASONIC) [y/n or Y/N]:");  //CHUSKO KANNA NAME MARCHALI
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': panasonicTv(); b=false; break; //CHUSKO KANN BRAND METHOD MARCHALIIIIIIIIIIIIIIIIIIIII
									   case 'n': tvList(); b=false; break;
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
			   case 8:
			   {
				   System.out.print("Do you want to add it to cart [y/n or Y/N]:"); 
				   do
				   {
					   char c=sc.next().toLowerCase().charAt(0);          
					   switch(c)
					   {
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="PANASONIC 38 INCHES";ob1[i++]=58999;
					   System.out.println("Do you want to continue in Below 40 Inches [y/n or Y/N] :");  //CHUSKO KANNAAAAAAAAAA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  
						   switch(c1)	
						   {
						   case 'y':panasonicTv1Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAA
						   case 'n':panasonicTv(); b=false; break;	 	// CHUSKOOOOOOOOOOOOOOOOOOOOOOOOO
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in Below 40 Inches [y/n or Y/N]:");   //CHUSKO KANNAAAAAAAAAA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':panasonicTv1Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAAAAAAAAAAAA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand (PANASONIC) [y/n or Y/N]:");  //CHUSKO KANNA NAME MARCHALI
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': panasonicTv(); b=false; break; //CHUSKO KANN BRAND METHOD MARCHALIIIIIIIIIIIIIIIIIIIII
									   case 'n': tvList(); b=false; break;
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
			   case 9:panasonicTv(); b=false; break;  //CHUSKO KANNA BRAND METHOD MARCHALI 
			   default: System.out.print("PLEASE ENTER VALID OPTION: ");
			   }
		   }while(b==true);
     }
     public static void panasonicTv2Display()
     { System.out.println(RESET);
    	     System.out.println("     __________________________________________________________________________________________________________________________________________________");
    	     System.out.println("    |  ________________________________    ________________________________    _________________________________    _________________________________  |");
        	 System.out.println("    | |       Panasonic TH-40LS670DX   |  |    Panasonic VIERA TH-40H50DX  |  |       Panasonic TH-42JS650DX    |  |     Panasonic VIERA TH-40E400D  | |");
    	     System.out.println("    | |--------------------------------|  |--------------------------------|  |---------------------------------|  |---------------------------------| |");
        	 System.out.println("    | | Inches  : 42 inches            |  | Inches  : 42 inches            |  | Inches  : 42 inches             |  | Inches  : 40 inches             | |");
        	 System.out.println("    | | Display : LED HD               |  | Display : LED HD               |  | Display : LED HD                |  | Display : LED HD                | |");
        	 System.out.println("    | | Pixels  : 4K,3480*2160 display |  | Pixels  : 4K,3480*2160 display |  | Pixels  : 4K,3480*2160 display  |  | Pixels  : 4K,3480*2160 display  | |");
        	 System.out.println("    | | Connections : wifi,Internet    |  | Connections : wifi,Internet    |  | Connections : wifi,Internet     |  | Connections : wifi,Internet     | |");
        	 System.out.println("    | | Port    : 2 usb ports          |  | Port    : 2 usb ports          |  | Port    : 2 usb ports           |  | Port    : 2 usb ports           | |");
        	 System.out.println("    | | Type    : Smart TV             |  | Type    : Smart TV             |  | Type    : Smart TV              |  | Type    : Smart TV              | |");
        	 System.out.println("    | | Price   : Rs18,999/-           |  | Price   : Rs18,999/-           |  | Price   : Rs19,999/-            |  | Price   : Rs21,999/-            | |");
    	     System.out.println("    | |________________________________|  |________________________________|  |_________________________________|  |_________________________________| |");
    	     System.out.println("    |                                                                                                                                                  |");
     	     System.out.println("    |               1.                                   2.                                 3.                                    4.                   |");
    	     System.out.println("    |  ________________________________    ________________________________    _________________________________    _________________________________  |");
        	 System.out.println("    | |       Panasonic TH-L40B6DX     |  |     Panasonic VIERA TH-A300DX  |  |     Panasonic VIERA TH-L50B6D   |  |    Panasonic VIERA TH-LB6D 50   | |");
    	     System.out.println("    | |--------------------------------|  |--------------------------------|  |---------------------------------|  |---------------------------------| |");
        	 System.out.println("    | | Inches  : 50 inches            |  | Inches  : 50 inches            |  | Inches  : 50 inches             |  | Inches  : 44 inches             | |");
        	 System.out.println("    | | Display : LED HD               |  | Display : LED HD               |  | Display : LED HD                |  | Display : LED HD                | |");
        	 System.out.println("    | | Pixels  : 4K,3480*2160 display |  | Pixels  : 4K,3480*2160 display |  | Pixels  : 4K,3480*2160 display  |  | Pixels  : 4K,3480*2160 display  | |");
        	 System.out.println("    | | Connections : wifi,Internet    |  | Connections : wifi,Internet    |  | Connections : wifi,Internet     |  | Connections : wifi,Internet     | |");
        	 System.out.println("    | | Port    : 2 usb ports          |  | Port    : 2 usb ports          |  | Port    : 2 usb ports           |  | Port    : 2 usb ports           | |");
        	 System.out.println("    | | Type    : Smart TV             |  | Type    : Smart TV             |  | Type    : Smart TV              |  | Type    : Smart TV              | |");
        	 System.out.println("    | | Price   : Rs28,999/-           |  | Price   : Rs38,999/-           |  | Price   : Rs48,999/-            |  | Price   : Rs58,999/-            | |");
    	     System.out.println("    | |________________________________|  |________________________________|  |_________________________________|  |_________________________________| |");
        	 System.out.println("    |                                                                                                                                                  |");
	    	 System.out.println("    |               5.                                   6.                                 7.                                    8.                   |");
	    	 System.out.println("    |                                                              _______________________                                                             |");
	      	 System.out.println("    |                                                             |                       |                                                            |");
	    	 System.out.println("    |                                                             |       9.EXIT          |                                                            |");
	    	 System.out.println("    |                                                             |_______________________|                                                            |");
	    	 System.out.println("    |__________________________________________________________________________________________________________________________________________________|");
	    	 
	    	 System.out.println(RESET);
    	 panasonicTv2();
     }
     public static void panasonicTv2()
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="PANASONIC 42 INCHES";ob1[i++]=18999;
						 		  System.out.println("Do you want to continue in Between 40 - 50 Inches [y/n or Y/N] :");  //CHUSKO KANNAAAAAAAAAA
						 		  do
						 		  {
						 			char c1=sc.next().toLowerCase().charAt(0);  
						 			switch(c1)	
									{
									case 'y':panasonicTv2Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAA
									case 'n':panasonicTv(); b=false; break;	 	// CHUSKOOOOOOOOOOOOOOOOOOOOOOOOO
						 			default : System.out.print("Please enter valid option: ");
									}
						 		  }while(b==true);b=false; break;
						 case 'n':
							 {
								 System.out.print("Do you want to see another model in Between 40 - 50 Inches [y/n or Y/N]:");   //CHUSKO KANNAAAAAAAAAA
									do
									{
										char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									switch(c1)	
									{
									case 'y':panasonicTv2Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAAAAAAAAAAAA
									case 'n':{
										System.out.print("Do you want to continue in this brand (PANASONIC) [y/n or Y/N]:");  //CHUSKO KANNA NAME MARCHALI
										do 
										{
											char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
											switch(c2)
											{
											case 'y': panasonicTv(); b=false; break; //CHUSKO KANN BRAND METHOD MARCHALIIIIIIIIIIIIIIIIIIIII
											case 'n': tvList(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="PANASONIC 42 INCHES";ob1[i++]=18999;
					   System.out.println("Do you want to continue in Between 40 - 50 Inches [y/n or Y/N] :");  //CHUSKO KANNAAAAAAAAAA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  
						   switch(c1)	
						   {
						   case 'y':panasonicTv2Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAA
						   case 'n':panasonicTv(); b=false; break;	 	// CHUSKOOOOOOOOOOOOOOOOOOOOOOOOO
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in Between 40 - 50 Inches [y/n or Y/N]:");   //CHUSKO KANNAAAAAAAAAA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':panasonicTv2Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAAAAAAAAAAAA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand (PANASONIC) [y/n or Y/N]:");  //CHUSKO KANNA NAME MARCHALI
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': panasonicTv(); b=false; break; //CHUSKO KANN BRAND METHOD MARCHALIIIIIIIIIIIIIIIIIIIII
									   case 'n': tvList(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="PANASONIC 42 INCHES";ob1[i++]=19999;
					   System.out.println("Do you want to continue in Between 40 - 50 Inches [y/n or Y/N] :");  //CHUSKO KANNAAAAAAAAAA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  
						   switch(c1)	
						   {
						   case 'y':panasonicTv2Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAA
						   case 'n':panasonicTv(); b=false; break;	 	// CHUSKOOOOOOOOOOOOOOOOOOOOOOOOO
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in Between 40 - 50 Inches [y/n or Y/N]:");   //CHUSKO KANNAAAAAAAAAA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':panasonicTv2Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAAAAAAAAAAAA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand (PANASONIC) [y/n or Y/N]:");  //CHUSKO KANNA NAME MARCHALI
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': panasonicTv(); b=false; break; //CHUSKO KANN BRAND METHOD MARCHALIIIIIIIIIIIIIIIIIIIII
									   case 'n': tvList(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="PANASONIC 40 INCHES";ob1[i++]=21999;
					   System.out.println("Do you want to continue in Between 40 - 50 Inches [y/n or Y/N] :");  //CHUSKO KANNAAAAAAAAAA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  
						   switch(c1)	
						   {
						   case 'y':panasonicTv2Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAA
						   case 'n':panasonicTv(); b=false; break;	 	// CHUSKOOOOOOOOOOOOOOOOOOOOOOOOO
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in Between 40 - 50 Inches [y/n or Y/N]:");   //CHUSKO KANNAAAAAAAAAA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':panasonicTv2Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAAAAAAAAAAAA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand (PANASONIC) [y/n or Y/N]:");  //CHUSKO KANNA NAME MARCHALI
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': panasonicTv(); b=false; break; //CHUSKO KANN BRAND METHOD MARCHALIIIIIIIIIIIIIIIIIIIII
									   case 'n': tvList(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="PANASONIC 50 INCHES";ob1[i++]=28999;
					   System.out.println("Do you want to continue in Between 40 - 50 Inches [y/n or Y/N] :");  //CHUSKO KANNAAAAAAAAAA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  
						   switch(c1)	
						   {
						   case 'y':panasonicTv2Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAA
						   case 'n':panasonicTv(); b=false; break;	 	// CHUSKOOOOOOOOOOOOOOOOOOOOOOOOO
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in Between 40 - 50 Inches [y/n or Y/N]:");   //CHUSKO KANNAAAAAAAAAA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':panasonicTv2Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAAAAAAAAAAAA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand (PANASONIC) [y/n or Y/N]:");  //CHUSKO KANNA NAME MARCHALI
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': panasonicTv(); b=false; break; //CHUSKO KANN BRAND METHOD MARCHALIIIIIIIIIIIIIIIIIIIII
									   case 'n': tvList(); b=false; break;
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
			   case 6:
			   {
				   System.out.print("Do you want to add it to cart [y/n or Y/N]:"); 
				   do
				   {
					   char c=sc.next().toLowerCase().charAt(0);          
					   switch(c)
					   {
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="PANASONIC 50 INCHES";ob1[i++]=38999;
					   System.out.println("Do you want to continue in Between 40 - 50 Inches [y/n or Y/N] :");  //CHUSKO KANNAAAAAAAAAA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  
						   switch(c1)	
						   {
						   case 'y':panasonicTv2Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAA
						   case 'n':panasonicTv(); b=false; break;	 	// CHUSKOOOOOOOOOOOOOOOOOOOOOOOOO
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in Between 40 - 50 Inches [y/n or Y/N]:");   //CHUSKO KANNAAAAAAAAAA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':panasonicTv2Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAAAAAAAAAAAA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand (PANASONIC) [y/n or Y/N]:");  //CHUSKO KANNA NAME MARCHALI
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': panasonicTv(); b=false; break; //CHUSKO KANN BRAND METHOD MARCHALIIIIIIIIIIIIIIIIIIIII
									   case 'n': tvList(); b=false; break;
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
			   case 7:
			   {
				   System.out.print("Do you want to add it to cart [y/n or Y/N]:"); 
				   do
				   {
					   char c=sc.next().toLowerCase().charAt(0);          
					   switch(c)
					   {
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="PANASONIC 42 INCHES";ob1[i++]=48999;
					   System.out.println("Do you want to continue in Between 40 - 50 Inches [y/n or Y/N] :");  //CHUSKO KANNAAAAAAAAAA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  
						   switch(c1)	
						   {
						   case 'y':panasonicTv2Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAA
						   case 'n':panasonicTv(); b=false; break;	 	// CHUSKOOOOOOOOOOOOOOOOOOOOOOOOO
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in Between 40 - 50 Inches [y/n or Y/N]:");   //CHUSKO KANNAAAAAAAAAA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':panasonicTv2Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAAAAAAAAAAAA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand (PANASONIC) [y/n or Y/N]:");  //CHUSKO KANNA NAME MARCHALI
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': panasonicTv(); b=false; break; //CHUSKO KANN BRAND METHOD MARCHALIIIIIIIIIIIIIIIIIIIII
									   case 'n': tvList(); b=false; break;
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
			   case 8:
			   {
				   System.out.print("Do you want to add it to cart [y/n or Y/N]:"); 
				   do
				   {
					   char c=sc.next().toLowerCase().charAt(0);          
					   switch(c)
					   {
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="PANASONIC 44 INCHES";ob1[i++]=58999;
					   System.out.println("Do you want to continue in Between 40 - 50 Inches [y/n or Y/N] :");  //CHUSKO KANNAAAAAAAAAA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  
						   switch(c1)	
						   {
						   case 'y':panasonicTv2Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAA
						   case 'n':panasonicTv(); b=false; break;	 	// CHUSKOOOOOOOOOOOOOOOOOOOOOOOOO
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in Between 40 - 50 Inches [y/n or Y/N]:");   //CHUSKO KANNAAAAAAAAAA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':panasonicTv2Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAAAAAAAAAAAA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand (PANASONIC) [y/n or Y/N]:");  //CHUSKO KANNA NAME MARCHALI
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': panasonicTv(); b=false; break; //CHUSKO KANN BRAND METHOD MARCHALIIIIIIIIIIIIIIIIIIIII
									   case 'n': tvList(); b=false; break;
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
			   case 9:panasonicTv(); b=false; break;  //CHUSKO KANNA BRAND METHOD MARCHALI 
			   default: System.out.print("PLEASE ENTER VALID OPTION: ");
			   }
		   }while(b==true);
     }
     public static void panasonicTv3Display()
     { System.out.println(RESET);
    	     System.out.println("     __________________________________________________________________________________________________________________________________________________");
    	     System.out.println("    |  ________________________________    ________________________________    _________________________________    _________________________________  |");
        	 System.out.println("    | |    Panasonic VIERA TH-AS670D   |  |      Panasonic TH-55JX750DX    |  |       Panasonic TH-55LX850DX    |  |       Panasonic TH-55LX750DX    | |");
    	     System.out.println("    | |--------------------------------|  |--------------------------------|  |---------------------------------|  |---------------------------------| |");
        	 System.out.println("    | | Inches  : 55 inches            |  | Inches  : 55 inches            |  | Inches  : 55 inches             |  | Inches  : 55 inches             | |");
        	 System.out.println("    | | Display : LED HD               |  | Display : LED HD               |  | Display : LED HD                |  | Display : LED HD                | |");
        	 System.out.println("    | | Pixels  : 4K,3480*2160 display |  | Pixels  : 4K,3480*2160 display |  | Pixels  : 4K,3480*2160 display  |  | Pixels  : 4K,3480*2160 display  | |");
        	 System.out.println("    | | Connections : wifi,Internet    |  | Connections : wifi,Internet    |  | Connections : wifi,Internet     |  | Connections : wifi,Internet     | |");
        	 System.out.println("    | | Port    : 2 usb ports          |  | Port    : 2 usb ports          |  | Port    : 2 usb ports           |  | Port    : 2 usb ports           | |");
        	 System.out.println("    | | Type    : Smart TV             |  | Type    : Smart TV             |  | Type    : Smart TV              |  | Type    : Smart TV              | |");
        	 System.out.println("    | | Price   : Rs38,999/-           |  | Price   : Rs28,999/-           |  | Price   : Rs39,999/-            |  | Price   : Rs51,999/-            | |");
	    	 System.out.println("    | |________________________________|  |________________________________|  |_________________________________|  |_________________________________| |");
	    	 System.out.println("    |                                                                                                                                                  |");
	    	 System.out.println("    |               1.                                   2.                                 3.                                    4.                   |");
	    	 System.out.println("    |  ________________________________    ________________________________    _________________________________    _________________________________  |");
        	 System.out.println("    | |     Panasonic TH-55LX700DX     |  |    Panasonic VIERA TH-DX650D   |  |    Panasonic VIERA TH-CX700D    |  |     Panasonic VIERA TH-CX40DX   | |");
        	 System.out.println("    | |--------------------------------|  |--------------------------------|  |---------------------------------|  |---------------------------------| |");
        	 System.out.println("    | | Inches  : 65 inches            |  | Inches  : 65 inches            |  | Inches  : 65 inches             |  | Inches  : 55 inches             | |");
        	 System.out.println("    | | Display : LED HD               |  | Display : LED HD               |  | Display : LED HD                |  | Display : LED HD                | |");
        	 System.out.println("    | | Pixels  : 4K,3480*2160 display |  | Pixels  : 4K,3480*2160 display |  | Pixels  : 4K,3480*2160 display  |  | Pixels  : 4K,3480*2160 display  | |");
        	 System.out.println("    | | Connections : wifi,Internet    |  | Connections : wifi,Internet    |  | Connections : wifi,Internet     |  | Connections : wifi,Internet     | |");
        	 System.out.println("    | | Port    : 2 usb ports          |  | Port    : 2 usb ports          |  | Port    : 2 usb ports           |  | Port    : 2 usb ports           | |");
        	 System.out.println("    | | Type    : Smart TV             |  | Type    : Smart TV             |  | Type    : Smart TV              |  | Type    : Smart TV              | |");
        	 System.out.println("    | | Price   : Rs48,999/-           |  | Price   : Rs58,999/-           |  | Price   : Rs68,999/-            |  | Price   : Rs58,999/-            | |");
	    	 System.out.println("    | |________________________________|  |________________________________|  |_________________________________|  |_________________________________| |");
	    	 System.out.println("    |                                                                                                                                                  |");
	    	 System.out.println("    |               5.                                   6.                                 7.                                    8.                   |");
	    	 System.out.println("    |                                                              _______________________                                                             |");
	    	 System.out.println("    |                                                             |                       |                                                            |");
	    	 System.out.println("    |                                                             |       9.EXIT          |                                                            |");
	    	 System.out.println("    |                                                             |_______________________|                                                            |");
	    	 System.out.println("    |__________________________________________________________________________________________________________________________________________________|");
	    	 
	    	 System.out.println(RESET);
    	 panasonicTv3();
    	 
     }
     public static void panasonicTv3()
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="PANASONIC 55 INCHES";ob1[i++]=38999;
						 		  System.out.println("Do you want to continue in Above 50 Inches [y/n or Y/N] :");  //CHUSKO KANNAAAAAAAAAA
						 		  do
						 		  {
						 			char c1=sc.next().toLowerCase().charAt(0);  
						 			switch(c1)	
									{
									case 'y':panasonicTv3Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAA
									case 'n':panasonicTv(); b=false; break;	 	// CHUSKOOOOOOOOOOOOOOOOOOOOOOOOO
						 			default : System.out.print("Please enter valid option: ");
									}
						 		  }while(b==true);b=false; break;
						 case 'n':
							 {
								 System.out.print("Do you want to see another model in Above 50 Inches [y/n or Y/N]:");   //CHUSKO KANNAAAAAAAAAA
									do
									{
										char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									switch(c1)	
									{
									case 'y':panasonicTv3Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAAAAAAAAAAAA
									case 'n':{
										System.out.print("Do you want to continue in this brand (PANASONIC) [y/n or Y/N]:");  //CHUSKO KANNA NAME MARCHALI
										do 
										{
											char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
											switch(c2)
											{
											case 'y': panasonicTv(); b=false; break; //CHUSKO KANN BRAND METHOD MARCHALIIIIIIIIIIIIIIIIIIIII
											case 'n': tvList(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="PANASONIC 55 INCHES";ob1[i++]=28999;
					   System.out.println("Do you want to continue in Above 50 Inches [y/n or Y/N] :");  //CHUSKO KANNAAAAAAAAAA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  
						   switch(c1)	
						   {
						   case 'y':panasonicTv3Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAA
						   case 'n':panasonicTv(); b=false; break;	 	// CHUSKOOOOOOOOOOOOOOOOOOOOOOOOO
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in Above 50 Inches [y/n or Y/N]:");   //CHUSKO KANNAAAAAAAAAA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':panasonicTv3Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAAAAAAAAAAAA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand (PANASONIC) [y/n or Y/N]:");  //CHUSKO KANNA NAME MARCHALI
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': panasonicTv(); b=false; break; //CHUSKO KANN BRAND METHOD MARCHALIIIIIIIIIIIIIIIIIIIII
									   case 'n': tvList(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="PANASONIC 55 INCHES";ob1[i++]=39999;
					   System.out.println("Do you want to continue in Above 50 Inches [y/n or Y/N] :");  //CHUSKO KANNAAAAAAAAAA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  
						   switch(c1)	
						   {
						   case 'y':panasonicTv3Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAA
						   case 'n':panasonicTv(); b=false; break;	 	// CHUSKOOOOOOOOOOOOOOOOOOOOOOOOO
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in Above 50 Inches [y/n or Y/N]:");   //CHUSKO KANNAAAAAAAAAA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':panasonicTv3Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAAAAAAAAAAAA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand (PANASONIC) [y/n or Y/N]:");  //CHUSKO KANNA NAME MARCHALI
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': panasonicTv(); b=false; break; //CHUSKO KANN BRAND METHOD MARCHALIIIIIIIIIIIIIIIIIIIII
									   case 'n': tvList(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="PANASONIC 55 INCHES";ob1[i++]=51999;
					   System.out.println("Do you want to continue in Above 50 Inches [y/n or Y/N] :");  //CHUSKO KANNAAAAAAAAAA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  
						   switch(c1)	
						   {
						   case 'y':panasonicTv3Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAA
						   case 'n':panasonicTv(); b=false; break;	 	// CHUSKOOOOOOOOOOOOOOOOOOOOOOOOO
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in Above 50 Inches [y/n or Y/N]:");   //CHUSKO KANNAAAAAAAAAA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':panasonicTv3Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAAAAAAAAAAAA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand (PANASONIC) [y/n or Y/N]:");  //CHUSKO KANNA NAME MARCHALI
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': panasonicTv(); b=false; break; //CHUSKO KANN BRAND METHOD MARCHALIIIIIIIIIIIIIIIIIIIII
									   case 'n': tvList(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="PANASONIC 65 INCHES";ob1[i++]=48999;
					   System.out.println("Do you want to continue in Above 50 Inches [y/n or Y/N] :");  //CHUSKO KANNAAAAAAAAAA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  
						   switch(c1)	
						   {
						   case 'y':panasonicTv3Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAA
						   case 'n':panasonicTv(); b=false; break;	 	// CHUSKOOOOOOOOOOOOOOOOOOOOOOOOO
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in Above 50 Inches [y/n or Y/N]:");   //CHUSKO KANNAAAAAAAAAA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':panasonicTv3Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAAAAAAAAAAAA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand (PANASONIC) [y/n or Y/N]:");  //CHUSKO KANNA NAME MARCHALI
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': panasonicTv(); b=false; break; //CHUSKO KANN BRAND METHOD MARCHALIIIIIIIIIIIIIIIIIIIII
									   case 'n': tvList(); b=false; break;
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
			   case 6:
			   {
				   System.out.print("Do you want to add it to cart [y/n or Y/N]:"); 
				   do
				   {
					   char c=sc.next().toLowerCase().charAt(0);          
					   switch(c)
					   {
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="PANASONIC 65 INCHES";ob1[i++]=58999;
					   System.out.println("Do you want to continue in Above 50 Inches [y/n or Y/N] :");  //CHUSKO KANNAAAAAAAAAA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  
						   switch(c1)	
						   {
						   case 'y':panasonicTv3Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAA
						   case 'n':panasonicTv(); b=false; break;	 	// CHUSKOOOOOOOOOOOOOOOOOOOOOOOOO
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in Above 50 Inches [y/n or Y/N]:");   //CHUSKO KANNAAAAAAAAAA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':panasonicTv3Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAAAAAAAAAAAA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand (PANASONIC) [y/n or Y/N]:");  //CHUSKO KANNA NAME MARCHALI
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': panasonicTv(); b=false; break; //CHUSKO KANN BRAND METHOD MARCHALIIIIIIIIIIIIIIIIIIIII
									   case 'n': tvList(); b=false; break;
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
			   case 7:
			   {
				   System.out.print("Do you want to add it to cart [y/n or Y/N]:"); 
				   do
				   {
					   char c=sc.next().toLowerCase().charAt(0);          
					   switch(c)
					   {
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="PANASONIC 65 INCHES";ob1[i++]=68999;
					   System.out.println("Do you want to continue in Above 50 Inches [y/n or Y/N] :");  //CHUSKO KANNAAAAAAAAAA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  
						   switch(c1)	
						   {
						   case 'y':panasonicTv3Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAA
						   case 'n':panasonicTv(); b=false; break;	 	// CHUSKOOOOOOOOOOOOOOOOOOOOOOOOO
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in Above 50 Inches [y/n or Y/N]:");   //CHUSKO KANNAAAAAAAAAA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':panasonicTv3Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAAAAAAAAAAAA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand (PANASONIC) [y/n or Y/N]:");  //CHUSKO KANNA NAME MARCHALI
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': panasonicTv(); b=false; break; //CHUSKO KANN BRAND METHOD MARCHALIIIIIIIIIIIIIIIIIIIII
									   case 'n': tvList(); b=false; break;
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
			   case 8:
			   {
				   System.out.print("Do you want to add it to cart [y/n or Y/N]:"); 
				   do
				   {
					   char c=sc.next().toLowerCase().charAt(0);          
					   switch(c)
					   {
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="PANASONIC 65 INCHES";ob1[i++]=58999;
					   System.out.println("Do you want to continue in Above 50 Inches [y/n or Y/N] :");  //CHUSKO KANNAAAAAAAAAA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  
						   switch(c1)	
						   {
						   case 'y':panasonicTv3Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAA
						   case 'n':panasonicTv(); b=false; break;	 	// CHUSKOOOOOOOOOOOOOOOOOOOOOOOOO
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in Above 50 Inches [y/n or Y/N]:");   //CHUSKO KANNAAAAAAAAAA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':panasonicTv3Display(); b=false; break; //CHUSKO KANNAAAAAAAAAAAAAAAAAAAAAAAA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand (PANASONIC) [y/n or Y/N]:");  //CHUSKO KANNA NAME MARCHALI
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': panasonicTv(); b=false; break; //CHUSKO KANN BRAND METHOD MARCHALIIIIIIIIIIIIIIIIIIIII
									   case 'n': tvList(); b=false; break;
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
			   case 9:panasonicTv(); b=false; break;  //CHUSKO KANNA BRAND METHOD MARCHALI 
			   default: System.out.print("PLEASE ENTER VALID OPTION: ");
			   }
		   }while(b==true);
     }
//     public static void main(String[] args) {
//		tvList();
//	}
	     
}


