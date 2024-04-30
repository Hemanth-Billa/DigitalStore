package audio;

import java.util.Scanner;

import home_screen.Main_Home;

public class TrueWireless {
	
	public static String ob[]=new String[100];
	public static float ob1[]=new float[100];static int i=0;
	static Scanner sc=new Scanner(System.in);private static final String RESET = "\033[0m";  // Text Reset
	static boolean b=true;
	public static void display()
	{
		 System.out.println(RESET);
		    System.out.println("\t\t"+"\t\t\t                                                                            ");
	   		System.out.println("\t\t"+"\t\t\t           #@@@@@@@@@@@*            TRUE WIRELESS          *@@@@@@@@@@@#        ");
	   		System.out.println("\t\t"+"\t\t\t        %@@@@@@@@@@@@@@@@@@@&      ---------------    &@@@@@@@@@@@@@@@@@@@%     ");
	   		System.out.println("\t\t"+"\t\t\t      @@@@@@@%          &@@@@@@                      @@@@@@           &@@@@@@@  ");
	   	    System.out.println("\t\t"+"\t\t\t      @@@@@               *@@@@@                    @@@@@                @@@@@  ");
	   	    System.out.println("\t\t"+"\t\t\t      @@@@@                 @@@@@@&              &@@@@@@                 @@@@@  ");
	   		System.out.println("\t\t"+"\t\t\t      @@@@@                 @@@@@@@@@          @@@@@@@@@                 @@@@@  ");
	   		System.out.println("\t\t"+"\t\t\t      @@@@@                %@@@@#@@@@#        %@@@@#@@@@%                @@@@@  ");
	   		System.out.println("\t\t"+"\t\t\t      @@@@@               @@@@@#.@@@@%        %@@@@.%@@@@@               @@@@@  ");
	   		System.out.println("\t\t"+"\t\t\t      #@@@@@@@@@       @@@@@@@   @@@@%        %@@@@   @@@@@@@       @@@@@@@@@#  ");
	   		System.out.println("\t\t"+"\t\t\t         ,@@@@@@@@@@@@@@@@@@     @@@@%        %@@@@     @@@@@@@@@@@@@@@@@@,     ");
	   	    System.out.println("\t\t"+"\t\t\t                /%@@@&#@@@@@     @@@@%        %@@@@     @@@@@#&@@@%/            ");
	   	    System.out.println("\t\t"+"\t\t\t                       @@@@@     @@@@%        %@@@@     @@@@@                   ");
	   		System.out.println("\t\t"+"\t\t\t                       @@@@@     @@@@%        %@@@@     @@@@@                   ");
	   		System.out.println("\t\t"+"\t\t\t                       @@@@@     @@@@%        %@@@@     @@@@@                    ");
	   		System.out.println("\t\t"+"\t\t\t                       @@@@@     @@@@%        %@@@@     @@@@@                    ");
	   		System.out.println("\t\t"+"\t\t\t                       @@@@@     @@@@%        %@@@@     @@@@@                    ");
	   		System.out.println("\t\t"+"\t\t\t                       @@@@@     @@@@%        %@@@@     @@@@@                    ");
	   		System.out.println("\t\t"+"\t\t\t                       @@@@@     @@@@%        %@@@@     @@@@@                    ");
	   		System.out.println("\t\t"+"\t\t\t                       @@@@@     @@@@%        %@@@@     @@@@@                    ");
	   		System.out.println("\t\t"+"\t\t\t                       @@@@@     @@@@%        %@@@@     @@@@@                    ");
	   		System.out.println("\t\t"+"\t\t\t                       @@@@@     @@@@%        %@@@@     @@@@@                    ");
	   		System.out.println("\t\t"+"\t\t\t                       @@@@@     @@@@%        %@@@@     @@@@@                    ");
	   		System.out.println("\t\t"+"\t\t\t                       @@@@@     @@@@%        %@@@@     @@@@@                    ");
	   		System.out.println("\t\t"+"\t\t\t                      *@@@@@@@@@@@@@           @@@@@@@@@@@@@                     ");
	   	    System.out.println("\t\t"+"\t\t\t                         #@@@@@@@@@,            ,@@@@@@@@@#                      ");
	   		System.out.println("\t\t"+"\t\t\t                                                                             ");
	        System.out.println("\t\t"+"\t\t\t              ==================>      1. BOAT        <===================         ");
	        System.out.println("\t\t"+"\t\t\t             ==================>       2. NOISE        <===================        ");
	        System.out.println("\t\t"+"\t\t\t            ==================>        3. JBL           <===================       ");
	        System.out.println("\t\t"+"\t\t\t           ==================>         4. ZEBRONICS      <===================      ");
	        System.out.println("\t\t"+"\t\t\t          ==================>          5. OPPO            <===================     ");
	        System.out.println("\t\t"+"\t\t\t         ==================>           6. EXIT             <===================    ");
	        System.out.println("\t\t"+"\t\t\t        ==================>                                 <===================   ");
	        System.out.println("\t\t"+"\t\t\t       ==================>                                   <===================  ");           
	  
	        System.out.println(RESET); Displayswitch();
			  
			}
		public static void Displayswitch()
		
		{
			System.out.print("PLEASE ENTER YOUR PREFERRED BRAND :  ");
			int c=sc.nextInt();
			boolean b=true;
			do
			{
				switch(c)
				{
				case 1:Boatmenu(); b=false; break;
				case 2:Noisemenu(); b=false; break;
				case 3:Jblmenu();  b=false; break;
				case 4:Zebronicsmenu();  b=false;  break;
				case 5:Oppomenu();  b=false;  break;
				case 6:Main_Home.audios(); b=false;  break; 
				default: 
					{
						System.out.println();
						System.out.print("\t\t\t\t\t\t\t\t     "+"PLEASE ENTER VALID OPTION..."+"\n");
						System.out.println();
				        display(); b=false; break;
					}
				}
			}while(b==true);
			
			
		}
		
		 public static void Boatmenu()
		   { System.out.println(RESET);
			 System.out.println("\t\t\t\t\t\t"+"                         BOAT                            ");  
			 System.out.println("\t\t\t\t\t\t"+"                      -------------                      ");  
			 System.out.println("\t\t\t\t\t\t"+"                      1.Between 1k-4K                        ");  
			 System.out.println("\t\t\t\t\t\t"+"                      2.EXIT FROM BOAT       ");
			 System.out.println(RESET);Boatmenuswitch();
		   }
		  
	 public static void Boatmenuswitch()
		    		   {
		     System.out.print("PLEASE ENTER THE PRICE RANGE  :");
			 do
			 {
				 int p=sc.nextInt();
				switch(p) 
				{
				case 1: Boat1K4k(); b=false; break;
				case 2: display();b=false; break;
			    default:
			    	{
			    		System.out.print("Please enter valid option:");
			    		Boatmenu(); 
			    		
			    	}
				}
			 }while(b==true);
		   }
	 public static void Boat1K4k()
		       		 { System.out.println(RESET);
		       		     System.out.println("\t   "+" ____________________________________________________________________________________________________________________________________");  
		       			 System.out.println("\t   "+"|                                                                                                                                    |");  
		       			 System.out.println("\t   "+"|          _______________________________         _______________________________         _______________________________           |");  
		       			 System.out.println("\t   "+"|         |     BOAT AIRDOPES 121 PRO     |       |     BOAT AIRDOPES 131 PRO     |       |     BOAT AIRDOPES 181         |          |");  
		       			 System.out.println("\t   "+"|         |-------------------------------|       |-------------------------------|       |-------------------------------|          |");  
		       			 System.out.println("\t   "+"|         |.Wireless /In the ear          |       |.Wireless /In the ear          |       |.Wireless /In the ear          |          |");  
		       			 System.out.println("\t   "+"|         |.Foldable Design               |       |.Noise Cancellation            |       |.Noise Cancellation            |          |");  
		       			 System.out.println("\t   "+"|         |.Version : 5.2                 |       |.Version : 5.2                 |       |.Version : 5.2                 |          |");  
		       			 System.out.println("\t   "+"|         |.Talktime : 32 Hours           |       |.Talktime : 45 Hours           |       |.Talktime : 20 Hours           |          |");  
		       			 System.out.println("\t   "+"|         |.Active Pairing/Range :10 Meter|       |.Active Pairing/Range :10 Meter|       |.Active Pairing/Range :10 Meter|          |");  
		       			 System.out.println("\t   "+"|         |.Charging Time : 2 Hours       |       |.Charging Time : 3 Hours       |       |.Charging Time : 3 Hours       |          |");  
		       			 System.out.println("\t   "+"|         |.PRICE  :  1,199.00/-          |       |. PRICE  :   1,499.00/-        |       |.  PRICE  : 1,290.00/-         |          |");  
		       			 System.out.println("\t   "+"|         |_______________________________|       |_______________________________|       |_______________________________|          |");  
		       			 System.out.println("\t   "+"|                                                                                                                                    |");  
		       			 System.out.println("\t   "+"|                       1.                                          2.                                       3.                      |");  
		       			 System.out.println("\t   "+"|                                                                                                                                    |");  
		       			 System.out.println("\t   "+"|                                                                                                                                    |");  
		       			 System.out.println("\t   "+"|          _______________________________         _______________________________         _______________________________           |");  
		       			 System.out.println("\t   "+"|         |    BOAT AIRDOPES 413 PRO      |       |     BOAT AIRDOPES 413 ANC     |       |                               |          |");  
		       			 System.out.println("\t   "+"|         |-------------------------------|       |-------------------------------|       |                               |          |");  
		       			 System.out.println("\t   "+"|         |.Wireless /In the ear          |       |.Wireless /In the ear          |       |                               |          |");  
		       			 System.out.println("\t   "+"|         |.Foldable Design               |       |.Noise Cancellation            |       |             EXIT              |          |");  
		       			 System.out.println("\t   "+"|         |.Version : 5.2                 |       |.Version : 5.2                 |       |            ------             |          |");  
		       			 System.out.println("\t   "+"|         |.Talktime : 17.5 Hours         |       |.Talktime : 17.5 Hours         |       |                               |          |");  
		       			 System.out.println("\t   "+"|         |.Active Pairing/Range :10 Meter|       |.Active Pairing/Range :10 Meter|       |                               |          |");  
		       			 System.out.println("\t   "+"|         |.Charging Time : 35 Minutes    |       |.Charging Time : 55 Minutes    |       |                               |          |");  
		       			 System.out.println("\t   "+"|         |.  PRICE  :  1,999.00/-        |       |. PRICE  :  1,999.00/-         |       |                               |          |");  
		       			 System.out.println("\t   "+"|         |_______________________________|       |_______________________________|       |_______________________________|          |");
		       			 System.out.println("\t   "+"|                                                                                                                                    |");  
		       			 System.out.println("\t   "+"|                     4.                                        5.                                       6.                          |");  
		       			 System.out.println("\t   "+"|                                                                                                                                    |");  	 
		       			 System.out.println("\t   "+"|____________________________________________________________________________________________________________________________________|");  
		       			 
		       			 System.out.println(RESET);   Boat1k4kswitch();
			       		   
		    		   }
		    		   
		    		   
		       		    public static void Boat1k4kswitch()
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
		   						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="BOAT AIRDOPES 121 PRO";ob1[i++]=1199;
		   						          System.out.print("Do you want to continue shopping in this Budget (Below 4K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
		   				 		  do
		   				 		  {
		   				 			char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
		   				 			switch(c1)	
		   							{
		   							case 'y':Boat1K4k(); b=false; break; // MADE CHANGES HEREE
		   							case 'n':Boatmenu(); b=false; break; // MADE CHANGES HEREE
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
		   									case 'y':Boat1K4k(); b=false; break;
		   									case 'n':
		   										{
		   											System.out.print("Do you want to continue shopping in Boat [y/n or Y/N]:"); //MADE CHANGES HERE
		   											do 
		   											{
		   												char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
		   												switch(c2)
		   												{
		   												case 'y': Boatmenu(); b=false; break;
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
		   						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="BOAT AIRDOPES 131 PRO";ob1[i++]=1499;
		   						          System.out.print("Do you want to continue shopping in this Budget (Below 4K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
		   				 		  do
		   				 		  {
		   				 			char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
		   				 			switch(c1)	
		   							{
		   							case 'y':Boat1K4k(); b=false; break; // MADE CHANGES HEREE
		   							case 'n':Boatmenu(); b=false; break; // MADE CHANGES HEREE
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
		   									case 'y':Boat1K4k(); b=false; break;
		   									case 'n':
		   										{
		   											System.out.print("Do you want to continue shopping in Boat [y/n or Y/N]:"); //MADE CHANGES HERE
		   											do 
		   											{
		   												char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
		   												switch(c2)
		   												{
		   												case 'y': Boatmenu(); b=false; break;
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
		   						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="BOAT AIRDOPES 181";ob1[i++]=1290;
		   						          System.out.print("Do you want to continue shopping in this Budget (Below 4K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
		   				 		  do
		   				 		  {
		   				 			char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
		   				 			switch(c1)	
		   							{
		   							case 'y':Boat1K4k(); b=false; break; // MADE CHANGES HEREE
		   							case 'n':Boatmenu(); b=false; break; // MADE CHANGES HEREE
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
		   									case 'y':Boat1K4k(); b=false; break;
		   									case 'n':
		   										{
		   											System.out.print("Do you want to continue shopping in Boat [y/n or Y/N]:"); //MADE CHANGES HERE
		   											do 
		   											{
		   												char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
		   												switch(c2)
		   												{
		   												case 'y': Boatmenu(); b=false; break;
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
		   						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="BOAT AIRDOPES 413 PRO";ob1[i++]=1999;
		   						          System.out.print("Do you want to continue shopping in this Budget (Below 4K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
		   				 		  do
		   				 		  {
		   				 			char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
		   				 			switch(c1)	
		   							{
		   							case 'y':Boat1K4k(); b=false; break; // MADE CHANGES HEREE
		   							case 'n':Boatmenu(); b=false; break; // MADE CHANGES HEREE
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
		   									case 'y':Boat1K4k(); b=false; break;
		   									case 'n':
		   										{
		   											System.out.print("Do you want to continue shopping in Boat [y/n or Y/N]:"); //MADE CHANGES HERE
		   											do 
		   											{
		   												char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
		   												switch(c2)
		   												{
		   												case 'y': Boatmenu(); b=false; break;
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
		   						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="BOAT AIRDOPES 413 ANC";ob1[i++]=1999;
		   						          System.out.print("Do you want to continue shopping in this Budget (Below 4K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
		   				 		  do
		   				 		  {
		   				 			char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
		   				 			switch(c1)	
		   							{
		   							case 'y':Boat1K4k(); b=false; break; // MADE CHANGES HEREE
		   							case 'n':Boatmenu(); b=false; break; // MADE CHANGES HEREE
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
		   									case 'y':Boat1K4k(); b=false; break;
		   									case 'n':
		   										{
		   											System.out.print("Do you want to continue shopping in Boat [y/n or Y/N]:"); //MADE CHANGES HERE
		   											do 
		   											{
		   												char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
		   												switch(c2)
		   												{
		   												case 'y': Boatmenu(); b=false; break;
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
		       				case 6:  Boatmenu(); b=false; break;
		       				 default:  System.out.print("Please enter valid option:");
		       				 }
		       			 }while(b==true); 
		       		}
		
		public static void Noisemenu()
		
		 {
			
			 System.out.println(RESET);
			 System.out.println("\t\t\t\t\t\t"+"                         NOISE                           ");  
			 System.out.println("\t\t\t\t\t\t"+"                      -------------                      ");  
			 System.out.println("\t\t\t\t\t\t"+"                      1.Between 1k-4K                      ");  
			 System.out.println("\t\t\t\t\t\t"+"                      2.EXIT FROM NOISE                             ");
			 System.out.println(RESET); Noisemenuswitch();
		   		 
		   			
		 }
		
		public static void Noisemenuswitch()
		   {
       System.out.print("PLEASE ENTER THE PRICE RANGE  :");
       do
        {
	   int p=sc.nextInt();
	   switch(p) 
	   {
	   case 1: Noise1K4k(); b=false; break;
	   case 2: display();b=false; break;
        default:
 	{
 		System.out.print("Please enter valid option:");
 		Noisemenu(); 
 		
 	}
	}
}while(b==true);
}
		       		    public static void Noise1K4k()	
		       		    	{ System.out.println(RESET);
		       		    	 System.out.println("\t   "+" ____________________________________________________________________________________________________________________________________");  
			       			 System.out.println("\t   "+"|                                                                                                                                    |");  
			       			 System.out.println("\t   "+"|          _______________________________         _______________________________         _______________________________           |");  
			       			 System.out.println("\t   "+"|         |       NOISE BUDS SMART        |       |       NOISE BUDS VS104        |       |          NOISE BEADS          |          |");  
			       			 System.out.println("\t   "+"|         |-------------------------------|       |-------------------------------|       |-------------------------------|          |");  
			       			 System.out.println("\t   "+"|         |.Wireless /In the ear          |       |.Wireless /In the ear          |       |.Wireless /In the ear          |          |");  
			       			 System.out.println("\t   "+"|         |.Foldable Design               |       |.Noise Cancellation            |       |.Noise Cancellation            |          |");  
			       			 System.out.println("\t   "+"|         |.Version : 5.2                 |       |.Version : 5.2                 |       |.Version : 5.2                 |          |");  
			       			 System.out.println("\t   "+"|         |.Talktime : 4.5 Hours          |       |.Talktime : 30 Hours           |       |.Talktime : 20 Hours           |          |");  
			       			 System.out.println("\t   "+"|         |.Active Pairing/Range :10 Meter|       |.Active Pairing/Range :10 Meter|       |.Active Pairing/Range :10 Meter|          |");  
			       			 System.out.println("\t   "+"|         |.Charging Time : 2 Hours       |       |.Charging Time : 3 Hours       |       |.Charging Time : 3 Hours       |          |");  
			       			 System.out.println("\t   "+"|         |.PRICE  :  1,099.00/-          |       |. PRICE  :   1,399.00/-        |       |.  PRICE  : 1,499.00/-         |          |");  
			       			 System.out.println("\t   "+"|         |_______________________________|       |_______________________________|       |_______________________________|          |");  
			       			 System.out.println("\t   "+"|                                                                                                                                    |");  
			       			 System.out.println("\t   "+"|                       1.                                          2.                                       3.                      |");  
			       			 System.out.println("\t   "+"|                                                                                                                                    |");  
			       			 System.out.println("\t   "+"|                                                                                                                                    |");  
			       			 System.out.println("\t   "+"|          _______________________________         _______________________________         _______________________________           |");  
			       			 System.out.println("\t   "+"|         |        NOISE BUDS VS104       |       |       NOISE BUDS VS103        |       |                               |          |");  
			       			 System.out.println("\t   "+"|         |-------------------------------|       |-------------------------------|       |                               |          |");  
			       			 System.out.println("\t   "+"|         |.Wireless /In the ear          |       |.Wireless /In the ear          |       |                               |          |");  
			       			 System.out.println("\t   "+"|         |.Foldable Design               |       |.Noise Cancellation            |       |             EXIT              |          |");  
			       			 System.out.println("\t   "+"|         |.Version : 5.2                 |       |.Version : 5.2                 |       |            ------             |          |");  
			       			 System.out.println("\t   "+"|         |.Talktime : 50 Hours           |       |.Talktime : 17.5 Hours         |       |                               |          |");  
			       			 System.out.println("\t   "+"|         |.Battery Type : Li-ion         |       |.Active Pairing/Range :10 Metre|       |                               |          |");  
			       			 System.out.println("\t   "+"|         |.Charging Time : 30 Minutes    |       |.Charging Time : 55 Minutes    |       |                               |          |");  
			       			 System.out.println("\t   "+"|         |.  PRICE  :  1,499.00/-        |       |. PRICE  :  1,999.00/-         |       |                               |          |");  
			       			 System.out.println("\t   "+"|         |_______________________________|       |_______________________________|       |_______________________________|          |");
			       			 System.out.println("\t   "+"|                                                                                                                                    |");  
			       			 System.out.println("\t   "+"|                     4.                                        5.                                       6.                          |");  
			       			 System.out.println("\t   "+"|                                                                                                                                    |");  	 
			       			 System.out.println("\t   "+"|____________________________________________________________________________________________________________________________________|");  
			       			 
			       			 System.out.println(RESET);  Noise1K4Kswitch();
		       		     }
			    		   
			    		   
		       		    public static void Noise1K4Kswitch()
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
			   						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="NOISE BUDS SMART";ob1[i++]=1099;
			   						          System.out.print("Do you want to continue shopping in this Budget (Below 4K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
			   				 		  do
			   				 		  {
			   				 			char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
			   				 			switch(c1)	
			   							{
			   							case 'y':Noise1K4k(); b=false; break; // MADE CHANGES HEREE
			   							case 'n':Noisemenu(); b=false; break; // MADE CHANGES HEREE
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
			   									case 'y':Noise1K4k(); b=false; break;
			   									case 'n':
			   										{
			   											System.out.print("Do you want to continue shopping in Noise [y/n or Y/N]:"); //MADE CHANGES HERE
			   											do 
			   											{
			   												char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
			   												switch(c2)
			   												{
			   												case 'y': Noisemenu(); b=false; break;
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
			   						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="NOISE BUDS VS104";ob1[i++]=1399;
			   						          System.out.print("Do you want to continue shopping in this Budget (Below 4K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
			   				 		  do
			   				 		  {
			   				 			char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
			   				 			switch(c1)	
			   							{
			   							case 'y':Noise1K4k(); b=false; break; // MADE CHANGES HEREE
			   							case 'n':Noisemenu(); b=false; break; // MADE CHANGES HEREE
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
			   									case 'y':Noise1K4k(); b=false; break;
			   									case 'n':
			   										{
			   											System.out.print("Do you want to continue shopping in Noise [y/n or Y/N]:"); //MADE CHANGES HERE
			   											do 
			   											{
			   												char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
			   												switch(c2)
			   												{
			   												case 'y': Noisemenu(); b=false; break;
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
			   						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="NOISE BEADS";ob1[i++]=1499;
			   						          System.out.print("Do you want to continue shopping in this Budget (Below 4K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
			   				 		  do
			   				 		  {
			   				 			char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
			   				 			switch(c1)	
			   							{
			   							case 'y':Noise1K4k(); b=false; break; // MADE CHANGES HEREE
			   							case 'n':Noisemenu(); b=false; break; // MADE CHANGES HEREE
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
			   									case 'y':Noise1K4k(); b=false; break;
			   									case 'n':
			   										{
			   											System.out.print("Do you want to continue shopping in Noise [y/n or Y/N]:"); //MADE CHANGES HERE
			   											do 
			   											{
			   												char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
			   												switch(c2)
			   												{
			   												case 'y': Noisemenu(); b=false; break;
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
			   						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="NOISE BUDS VS104";ob1[i++]=1499;
			   						          System.out.print("Do you want to continue shopping in this Budget (Below 4K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
			   				 		  do
			   				 		  {
			   				 			char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
			   				 			switch(c1)	
			   							{
			   							case 'y':Noise1K4k(); b=false; break; // MADE CHANGES HEREE
			   							case 'n':Noisemenu(); b=false; break; // MADE CHANGES HEREE
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
			   									case 'y':Noise1K4k(); b=false; break;
			   									case 'n':
			   										{
			   											System.out.print("Do you want to continue shopping in Noise [y/n or Y/N]:"); //MADE CHANGES HERE
			   											do 
			   											{
			   												char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
			   												switch(c2)
			   												{
			   												case 'y': Noisemenu(); b=false; break;
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
			   						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="NOISE BUDS VS103";ob1[i++]=1999;
			   						          System.out.print("Do you want to continue shopping in this Budget (Below 4K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
			   				 		  do
			   				 		  {
			   				 			char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
			   				 			switch(c1)	
			   							{
			   							case 'y':Noise1K4k(); b=false; break; // MADE CHANGES HEREE
			   							case 'n':Noisemenu(); b=false; break; // MADE CHANGES HEREE
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
			   									case 'y':Noise1K4k(); b=false; break;
			   									case 'n':
			   										{
			   											System.out.print("Do you want to continue shopping in Noise [y/n or Y/N]:"); //MADE CHANGES HERE
			   											do 
			   											{
			   												char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
			   												switch(c2)
			   												{
			   												case 'y': Noisemenu(); b=false; break;
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
			       			  case 6:  Noisemenu(); b=false; break;
			       				 default:  System.out.print("Please enter valid option:");
			       				 }
			       			 }while(b==true); 
		       		    	
       			
		       		   }		 
		       		  
		       		   	 
		public static void Jblmenu()
		{ System.out.println(RESET);
			 System.out.println("\t\t\t\t\t\t"+"                           JBL                         ");  
			 System.out.println("\t\t\t\t\t\t"+"                      -------------                      ");  
			 System.out.println("\t\t\t\t\t\t"+"                      1.Below 1K-10K                      ");  
			 System.out.println("\t\t\t\t\t\t"+"                      2.Above 10K                         ");
			 System.out.println("\t\t\t\t\t\t"+"                      3.EXIT FROM JBL                            ");
			 System.out.println(RESET); Jblmenuswitch();
		   }
		public static void  Jblmenuswitch()
				       {
			 System.out.print("PLEASE ENTER THE PRICE RANGE  :");
			 do
			 {
				 int p=sc.nextInt();
				switch(p) 
				{
				case 1: Jblbelow10k(); b=false; break;
				case 2: Jblabove10k(); b=false; break;
				case 3: display();b=false; break;
			    default:
			    	{
			    		System.out.print("Please enter valid option:");
			    		Jblmenu(); 
			    		
			    	}
				}
			 }while(b==true);
		   }
		public static void Jblbelow10k()
				  {
			 System.out.println(RESET);	   
			 System.out.println("\t   "+" ____________________________________________________________________________________________________________________________________");  
  			 System.out.println("\t   "+"|                                                                                                                                    |");  
  			 System.out.println("\t   "+"|          _______________________________         _______________________________         _______________________________           |");  
  			 System.out.println("\t   "+"|         |       JBL WAVE 200 TWS        |       |        JBL WAVE 100           |       |      JBL LIVE 300 TWS         |          |");  
  			 System.out.println("\t   "+"|         |-------------------------------|       |-------------------------------|       |-------------------------------|          |");  
  			 System.out.println("\t   "+"|         |.Wireless /In the ear          |       |.Wireless /In the ear          |       |.Wireless /In the ear          |          |");  
  			 System.out.println("\t   "+"|         |.Foldable Design               |       |.Noise Cancellation            |       |.Noise Cancellation            |          |");  
  			 System.out.println("\t   "+"|         |.Version : 5.0                 |       |.Version : 5.0                 |       |.Version : 5.0                 |          |");  
  			 System.out.println("\t   "+"|         |.Talktime : 20 Hours           |       |.Talktime : 30 Hours           |       |.Talktime : 20 Hours           |          |");  
  			 System.out.println("\t   "+"|         |.Active Pairing/Range :10 Meter|       |.Active Pairing/Range :10 Meter|       |.Active Pairing/Range :10 Meter|          |");  
  			 System.out.println("\t   "+"|         |.Charging Time : 2 Hours       |       |.Charging Time : 2 Hours       |       |.Charging Time : 6 Hours       |          |");  
  			 System.out.println("\t   "+"|         |.PRICE  :  2,499.00/-          |       |. PRICE  :   2,499.00/-        |       |.  PRICE  : 3,994.00/-         |          |");  
  			 System.out.println("\t   "+"|         |_______________________________|       |_______________________________|       |_______________________________|          |");  
  			 System.out.println("\t   "+"|                                                                                                                                    |");  
  			 System.out.println("\t   "+"|                       1.                                          2.                                       3.                      |");  
  			 System.out.println("\t   "+"|                                                                                                                                    |");  
  			 System.out.println("\t   "+"|                                                                                                                                    |");  
  			 System.out.println("\t   "+"|          _______________________________         _______________________________         _______________________________           |");  
  			 System.out.println("\t   "+"|         |    JBL ENDURANCE RACE TWS     |       |       JBL WAVE 500 TWS        |       |                               |          |");  
  			 System.out.println("\t   "+"|         |-------------------------------|       |-------------------------------|       |                               |          |");  
  			 System.out.println("\t   "+"|         |.Wireless /In the ear          |       |.Wireless /In the ear          |       |                               |          |");  
  			 System.out.println("\t   "+"|         |.Foldable Design               |       |.Noise Cancellation            |       |             EXIT              |          |");  
  			 System.out.println("\t   "+"|         |.Version : 5.2                 |       |.Version : 5.2                 |       |            ------             |          |");  
  			 System.out.println("\t   "+"|         |.Talktime : 50 Hours           |       |.Talktime : 17.5 Hours         |       |                               |          |");  
  			 System.out.println("\t   "+"|         |.Battery Type : Li-ion         |       |.Active Pairing/Range :10 Meter|       |                               |          |");  
  			 System.out.println("\t   "+"|         |.Charging Time : 35 Minutes    |       |.Charging Time : 45 Minutes    |       |                               |          |");  
  			 System.out.println("\t   "+"|         |.  PRICE  :  7,487.00/-        |       |. PRICE  :  5,399.00/-         |       |                               |          |");  
  			 System.out.println("\t   "+"|         |_______________________________|       |_______________________________|       |_______________________________|          |");
  			 System.out.println("\t   "+"|                                                                                                                                    |");  
  			 System.out.println("\t   "+"|                     4.                                        5.                                       6.                          |");  
  			 System.out.println("\t   "+"|                                                                                                                                    |");  	 
  			 System.out.println("\t   "+"|____________________________________________________________________________________________________________________________________|");  
  			 System.out.println(RESET);    		   
				    		   
  			Jblbelow10kswitch();
				    	   }
				    	   
                               public static void Jblbelow10kswitch()
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
			   						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="JBL WAVE 200 TWS";ob1[i++]=2499;
			   						          System.out.print("Do you want to continue shopping in this Budget (Below 10K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
			   				 		  do
			   				 		  {
			   				 			char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
			   				 			switch(c1)	
			   							{
			   							case 'y':Jblbelow10k(); b=false; break; // MADE CHANGES HEREE
			   							case 'n':Jblmenu(); b=false; break; // MADE CHANGES HEREE
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
			   									case 'y':Jblbelow10k(); b=false; break;
			   									case 'n':
			   										{
			   											System.out.print("Do you want to continue shopping in JBL [y/n or Y/N]:"); //MADE CHANGES HERE
			   											do 
			   											{
			   												char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
			   												switch(c2)
			   												{
			   												case 'y': Jblmenu(); b=false; break;
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
		   						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="JBL WAVE 100";ob1[i++]=2499;
		   						          System.out.print("Do you want to continue shopping in this Budget (Below 10K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
		   				 		  do
		   				 		  {
		   				 			char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
		   				 			switch(c1)	
		   							{
		   							case 'y':Jblbelow10k(); b=false; break; // MADE CHANGES HEREE
		   							case 'n':Jblmenu(); b=false; break; // MADE CHANGES HEREE
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
		   									case 'y':Jblbelow10k(); b=false; break;
		   									case 'n':
		   										{
		   											System.out.print("Do you want to continue shopping in JBL [y/n or Y/N]:"); //MADE CHANGES HERE
		   											do 
		   											{
		   												char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
		   												switch(c2)
		   												{
		   												case 'y': Jblmenu(); b=false; break;
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
	   						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="JBL LIVE 300 TWS";ob1[i++]=3994;
	   						          System.out.print("Do you want to continue shopping in this Budget (Below 10K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
	   				 		  do
	   				 		  {
	   				 			char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
	   				 			switch(c1)	
	   							{
	   							case 'y':Jblbelow10k(); b=false; break; // MADE CHANGES HEREE
	   							case 'n':Jblmenu(); b=false; break; // MADE CHANGES HEREE
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
	   									case 'y':Jblbelow10k(); b=false; break;
	   									case 'n':
	   										{
	   											System.out.print("Do you want to continue shopping in JBL [y/n or Y/N]:"); //MADE CHANGES HERE
	   											do 
	   											{
	   												char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
	   												switch(c2)
	   												{
	   												case 'y': Jblmenu(); b=false; break;
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
  						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="JBL ENDURANCE RACE TWS";ob1[i++]=7487;
  						          System.out.print("Do you want to continue shopping in this Budget (Below 10K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
  				 		  do
  				 		  {
  				 			char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
  				 			switch(c1)	
  							{
  							case 'y':Jblbelow10k(); b=false; break; // MADE CHANGES HEREE
  							case 'n':Jblmenu(); b=false; break; // MADE CHANGES HEREE
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
  									case 'y':Jblbelow10k(); b=false; break;
  									case 'n':
  										{
  											System.out.print("Do you want to continue shopping in JBL [y/n or Y/N]:"); //MADE CHANGES HERE
  											do 
  											{
  												char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
  												switch(c2)
  												{
  												case 'y': Jblmenu(); b=false; break;
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
 						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="JBL WAVE 500 TWS";ob1[i++]=5399;
 						          System.out.print("Do you want to continue shopping in this Budget (Below 10K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
 				 		  do
 				 		  {
 				 			char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
 				 			switch(c1)	
 							{
 							case 'y':Jblbelow10k(); b=false; break; // MADE CHANGES HEREE
 							case 'n':Jblmenu(); b=false; break; // MADE CHANGES HEREE
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
 									case 'y':Jblbelow10k(); b=false; break;
 									case 'n':
 										{
 											System.out.print("Do you want to continue shopping in JBL [y/n or Y/N]:"); //MADE CHANGES HERE
 											do 
 											{
 												char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
 												switch(c2)
 												{
 												case 'y': Jblmenu(); b=false; break;
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
 			                   case 6:  Jblmenu(); b=false; break;
  			       				 default:  System.out.print("Please enter valid option:");
  			       				 }
  			       			 }while(b==true); 
  		       		    	
         			
  		       		   }		 
        		       		   
        		       		  public static void Jblabove10k()
                               { System.out.println(RESET);
        		       		 System.out.println("\t   "+" ____________________________________________________________________________________________________________________________________");  
   			       			 System.out.println("\t   "+"|                                                                                                                                    |");  
   			       			 System.out.println("\t   "+"|          _______________________________         _______________________________         _______________________________           |");  
   			       			 System.out.println("\t   "+"|         |        JBL LIVE PRO 2         |       |         JBL FREE X            |       |   JBL ENDURANCE PEAK ||       |          |");  
   			       			 System.out.println("\t   "+"|         |-------------------------------|       |-------------------------------|       |-------------------------------|          |");  
   			       			 System.out.println("\t   "+"|         |.Wireless /In the ear          |       |.Wireless /In the ear          |       |.Wireless /In the ear          |          |");  
   			       			 System.out.println("\t   "+"|         |.Foldable Design               |       |.Noise Cancellation            |       |.Noise Cancellation            |          |");  
   			       			 System.out.println("\t   "+"|         |.Version : 5.2                 |       |.Version : 5.2                 |       |.Version : 5.2                 |          |");  
   			       			 System.out.println("\t   "+"|         |.Talktime : 4.5 Hours          |       |.Talktime : 30 Hours           |       |.Talktime : 20 Hours           |          |");  
   			       			 System.out.println("\t   "+"|         |.Active Pairing/Range :10 Metre|       |.Active Pairing/Range :10 Metre|       |.Active Pairing/Range :10 Metre|          |");  
   			       			 System.out.println("\t   "+"|         |.Charging Time : 2 Hours       |       |.Charging Time : 3 Hours       |       |.Charging Time : 3 Hours       |          |");  
   			       			 System.out.println("\t   "+"|         |.PRICE  :  11,099.00/-         |       |. PRICE  :   12,399.00/-       |       |.  PRICE  : 11,499.00/-        |          |");  
   			       			 System.out.println("\t   "+"|         |_______________________________|       |_______________________________|       |_______________________________|          |");  
   			       			 System.out.println("\t   "+"|                                                                                                                                    |");  
   			       			 System.out.println("\t   "+"|                       1.                                          2.                                       3.                      |");  
   			       			 System.out.println("\t   "+"|                                                                                                                                    |");  
   			       			 System.out.println("\t   "+"|                                                                                                                                    |");  
   			       			 System.out.println("\t   "+"|          _______________________________         _______________________________         _______________________________           |");  
   			       			 System.out.println("\t   "+"|         |        JBL TUNE 225 TWS       |       |       JBL LIVE FREE 2         |       |                               |          |");  
   			       			 System.out.println("\t   "+"|         |-------------------------------|       |-------------------------------|       |                               |          |");  
   			       			 System.out.println("\t   "+"|         |.Wireless /In the ear          |       |.Wireless /In the ear          |       |                               |          |");  
   			       			 System.out.println("\t   "+"|         |.Foldable Design               |       |.Noise Cancellation            |       |             EXIT              |          |");  
   			       			 System.out.println("\t   "+"|         |.Version : 5.2                 |       |.Version : 5.2                 |       |            ------             |          |");  
   			       			 System.out.println("\t   "+"|         |.Talktime : 5 Hours            |       |.Talktime : 17.5 Hours         |       |                               |          |");  
   			       			 System.out.println("\t   "+"|         |.Battery Type : Li-ion         |       |.Active Pairing/Range :10 Metre|       |                               |          |");  
   			       			 System.out.println("\t   "+"|         |.Charging Time : 3.5 Hours     |       |.Charging Time : 3.5 Hours     |       |                               |          |");  
   			       			 System.out.println("\t   "+"|         |.  PRICE  :  17,499.00/-       |       |. PRICE  :  12,399.00/-        |       |                               |          |");  
   			       			 System.out.println("\t   "+"|         |_______________________________|       |_______________________________|       |_______________________________|          |");
   			       			 System.out.println("\t   "+"|                                                                                                                                    |");  
   			       			 System.out.println("\t   "+"|                     4.                                        5.                                       6.                          |");  
   			       			 System.out.println("\t   "+"|                                                                                                                                    |");  	 
   			       			 System.out.println("\t   "+"|____________________________________________________________________________________________________________________________________|");  
   			       			 
   			       		 System.out.println(RESET);Jblabove10Kswitch();	  
                              		      
                               }
        		       		  
        		       		public static void Jblabove10Kswitch()
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
   			   						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="JBL LIVE PRO 2";ob1[i++]=11099;
   			   						          System.out.print("Do you want to continue shopping in this Budget (Above 10K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
   			   				 		  do
   			   				 		  {
   			   				 			char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
   			   				 			switch(c1)	
   			   							{
   			   							case 'y':Jblabove10k(); b=false; break; // MADE CHANGES HEREE
   			   							case 'n':Jblmenu(); b=false; break; // MADE CHANGES HEREE
   			   				 			default : System.out.print("Please enter valid option: ");
   			   							}
   			   				 		  }while(b==true);  break;
   			   						 case 'n':
   			   							 {
   			   								 System.out.print("Do you want to see another model in this Budget (Above 10K) [y/n or Y/N]:");  //MADE CHANGES HERE
   			   									do
   			   									{
   			   										char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
   			   									switch(c1)	
   			   									{
   			   									case 'y':Jblabove10k(); b=false; break;
   			   									case 'n':
   			   										{
   			   											System.out.print("Do you want to continue shopping in JBL [y/n or Y/N]:"); //MADE CHANGES HERE
   			   											do 
   			   											{
   			   												char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
   			   												switch(c2)
   			   												{
   			   												case 'y': Jblmenu(); b=false; break;
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
  			   						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="JBL FREE X";ob1[i++]=12399;
  			   						          System.out.print("Do you want to continue shopping in this Budget (Above 10K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
  			   				 		  do
  			   				 		  {
  			   				 			char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
  			   				 			switch(c1)	
  			   							{
  			   							case 'y':Jblabove10k(); b=false; break; // MADE CHANGES HEREE
  			   							case 'n':Jblmenu(); b=false; break; // MADE CHANGES HEREE
  			   				 			default : System.out.print("Please enter valid option: ");
  			   							}
  			   				 		  }while(b==true);  break;
  			   						 case 'n':
  			   							 {
  			   								 System.out.print("Do you want to see another model in this Budget (Above 10K) [y/n or Y/N]:");  //MADE CHANGES HERE
  			   									do
  			   									{
  			   										char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
  			   									switch(c1)	
  			   									{
  			   									case 'y':Jblabove10k(); b=false; break;
  			   									case 'n':
  			   										{
  			   											System.out.print("Do you want to continue shopping in JBL [y/n or Y/N]:"); //MADE CHANGES HERE
  			   											do 
  			   											{
  			   												char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
  			   												switch(c2)
  			   												{
  			   												case 'y': Jblmenu(); b=false; break;
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
			   						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="JBL ENDURANCE PEAK ||";ob1[i++]=11499;
			   						          System.out.print("Do you want to continue shopping in this Budget (Above 10K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
			   				 		  do
			   				 		  {
			   				 			char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
			   				 			switch(c1)	
			   							{
			   							case 'y':Jblabove10k(); b=false; break; // MADE CHANGES HEREE
			   							case 'n':Jblmenu(); b=false; break; // MADE CHANGES HEREE
			   				 			default : System.out.print("Please enter valid option: ");
			   							}
			   				 		  }while(b==true);  break;
			   						 case 'n':
			   							 {
			   								 System.out.print("Do you want to see another model in this Budget (Above 10K) [y/n or Y/N]:");  //MADE CHANGES HERE
			   									do
			   									{
			   										char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
			   									switch(c1)	
			   									{
			   									case 'y':Jblabove10k(); b=false; break;
			   									case 'n':
			   										{
			   											System.out.print("Do you want to continue shopping in JBL [y/n or Y/N]:"); //MADE CHANGES HERE
			   											do 
			   											{
			   												char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
			   												switch(c2)
			   												{
			   												case 'y': Jblmenu(); b=false; break;
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
		   						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="JBL TUNE 225 TWS";ob1[i++]=17499;
		   						          System.out.print("Do you want to continue shopping in this Budget (Above 10K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
		   				 		  do
		   				 		  {
		   				 			char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
		   				 			switch(c1)	
		   							{
		   							case 'y':Jblabove10k(); b=false; break; // MADE CHANGES HEREE
		   							case 'n':Jblmenu(); b=false; break; // MADE CHANGES HEREE
		   				 			default : System.out.print("Please enter valid option: ");
		   							}
		   				 		  }while(b==true);  break;
		   						 case 'n':
		   							 {
		   								 System.out.print("Do you want to see another model in this Budget (Above 10K) [y/n or Y/N]:");  //MADE CHANGES HERE
		   									do
		   									{
		   										char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
		   									switch(c1)	
		   									{
		   									case 'y':Jblabove10k(); b=false; break;
		   									case 'n':
		   										{
		   											System.out.print("Do you want to continue shopping in JBL [y/n or Y/N]:"); //MADE CHANGES HERE
		   											do 
		   											{
		   												char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
		   												switch(c2)
		   												{
		   												case 'y': Jblmenu(); b=false; break;
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
		   						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="JBL LIVE FREE 2";ob1[i++]=12399;
		   						          System.out.print("Do you want to continue shopping in this Budget (Above 10K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
		   				 		  do
		   				 		  {
		   				 			char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
		   				 			switch(c1)	
		   							{
		   							case 'y':Jblabove10k(); b=false; break; // MADE CHANGES HEREE
		   							case 'n':Jblmenu(); b=false; break; // MADE CHANGES HEREE
		   				 			default : System.out.print("Please enter valid option: ");
		   							}
		   				 		  }while(b==true);  break;
		   						 case 'n':
		   							 {
		   								 System.out.print("Do you want to see another model in this Budget (Above 10K) [y/n or Y/N]:");  //MADE CHANGES HERE
		   									do
		   									{
		   										char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
		   									switch(c1)	
		   									{
		   									case 'y':Jblabove10k(); b=false; break;
		   									case 'n':
		   										{
		   											System.out.print("Do you want to continue shopping in JBL [y/n or Y/N]:"); //MADE CHANGES HERE
		   											do 
		   											{
		   												char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
		   												switch(c2)
		   												{
		   												case 'y': Jblmenu(); b=false; break;
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
     			       				
     			       				case 6:  Jblmenu(); b=false; break;
     			       				 default:  System.out.print("Please enter valid option:");
     			       				 }
     			       			 }while(b==true); 
     		       		    	
            			
     		       		   }		 
           		       	
        		    		
        		    			
        		       		  
        		       		   	 
		public static void Zebronicsmenu()
			{ System.out.println(RESET);
				 System.out.println("\t\t\t\t\t\t"+"                        ZEBRONICS                          ");  
				 System.out.println("\t\t\t\t\t\t"+"                      -------------                      ");  
				 System.out.println("\t\t\t\t\t\t"+"                      1.Between 1K-4K                        ");  
				 System.out.println("\t\t\t\t\t\t"+"                      2.EXIT FROM ZEBRONICS                             ");
				 System.out.println(RESET);	 Zebronicsmenuswitch();
			   }
			  
		 public static void Zebronicsmenuswitch()
			    		   {
			     System.out.print("PLEASE ENTER THE PRICE RANGE  :");
				 do
				 {
					 int p=sc.nextInt();
					switch(p) 
					{
					case 1: Zebronics1K4k(); b=false; break;
					case 2: display();b=false; break;
				    default:
				    	{
				    		System.out.print("Please enter valid option:");
				    		Zebronicsmenu(); 
				    		
				    	}
					}
				 }while(b==true);
			   }
			   	 
		   		 public static void Zebronics1K4k()
		   		 {
		   			 System.out.println(RESET);
		   			 System.out.println("\t   "+" ____________________________________________________________________________________________________________________________________");  
	       			 System.out.println("\t   "+"|                                                                                                                                    |");  
	       			 System.out.println("\t   "+"|          _______________________________         _______________________________         _______________________________           |");  
	       			 System.out.println("\t   "+"|         |      ZEB-SOUND BOMB N1        |       |       ZEB-SOUND BOMB N5       |       |      ZEBRONICS PREKSHA        |          |");  
	       			 System.out.println("\t   "+"|         |-------------------------------|       |-------------------------------|       |-------------------------------|          |");  
	       			 System.out.println("\t   "+"|         |.Wireless /In the ear          |       |.Wireless /In the ear          |       |.Wireless /In the ear          |          |");  
	       			 System.out.println("\t   "+"|         |.Foldable Design               |       |.Noise Cancellation            |       |.Noise Cancellation            |          |");  
	       			 System.out.println("\t   "+"|         |.Version : 5.2                 |       |.Version : 5.2                 |       |.Version : 5.2                 |          |");  
	       			 System.out.println("\t   "+"|         |.Talktime : 4.5 Hours          |       |.Talktime : 30 Hours           |       |.Talktime : 20 Hours           |          |");  
	       			 System.out.println("\t   "+"|         |.Active Pairing/Range :10 Meter|       |.Active Pairing/Range :10 Meter|       |.Active Pairing/Range :10 Meter|          |");  
	       			 System.out.println("\t   "+"|         |.Charging Time : 2 Hours       |       |.Charging Time : 3 Hours       |       |.Charging Time : 3 Hours       |          |");  
	       			 System.out.println("\t   "+"|         |.PRICE  :  1,099.00/-          |       |. PRICE  :   3,399.00/-        |       |.  PRICE  : 2,499.00/-         |          |");  
	       			 System.out.println("\t   "+"|         |_______________________________|       |_______________________________|       |_______________________________|          |");  
	       			 System.out.println("\t   "+"|                                                                                                                                    |");  
	       			 System.out.println("\t   "+"|                       1.                                          2.                                       3.                      |");  
	       			 System.out.println("\t   "+"|                                                                                                                                    |");  
	       			 System.out.println("\t   "+"|                                                                                                                                    |");  
	       			 System.out.println("\t   "+"|          _______________________________         _______________________________         _______________________________           |");  
	       			 System.out.println("\t   "+"|         |        ZEB-SOUND BOMB 5       |       |        ZEB-SOUND BOMB 7       |       |                               |          |");  
	       			 System.out.println("\t   "+"|         |-------------------------------|       |-------------------------------|       |                               |          |");  
	       			 System.out.println("\t   "+"|         |.Wireless /In the ear          |       |.Wireless /In the ear          |       |                               |          |");  
	       			 System.out.println("\t   "+"|         |.Foldable Design               |       |.Noise Cancellation            |       |             EXIT              |          |");  
	       			 System.out.println("\t   "+"|         |.Version : 5.2                 |       |.Version : 5.2                 |       |            ------             |          |");  
	       			 System.out.println("\t   "+"|         |.Talktime : 50 Hours           |       |.Talktime : 17.5 Hours         |       |                               |          |");  
	       			 System.out.println("\t   "+"|         |.Battery Type : Li-ion         |       |.Active Pairing/Range :10 Meter|       |                               |          |");  
	       			 System.out.println("\t   "+"|         |.Charging Time : 3.5 Hours     |       |.Charging Time : 2.5 Hours     |       |                               |          |");  
	       			 System.out.println("\t   "+"|         |.  PRICE  :  3,499.00/-        |       |. PRICE  :  2,399.00/-         |       |                               |          |");  
	       			 System.out.println("\t   "+"|         |_______________________________|       |_______________________________|       |_______________________________|          |");
	       			 System.out.println("\t   "+"|                                                                                                                                    |");  
	       			 System.out.println("\t   "+"|                     4.                                        5.                                       6.                          |");  
	       			 System.out.println("\t   "+"|                                                                                                                                    |");  	 
	       			 System.out.println("\t   "+"|____________________________________________________________________________________________________________________________________|");  
	       			 
	       			 System.out.println(RESET);      Zebronicsswitch();
		   		 }
		   		 public static void Zebronicsswitch()
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
	   						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="ZEBRONICS SOUND BOMB N1";ob1[i++]=1099;
	   						          System.out.print("Do you want to continue shopping in this Budget (Below 4K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
	   				 		  do
	   				 		  {
	   				 			char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
	   				 			switch(c1)	
	   							{
	   							case 'y':Zebronics1K4k(); b=false; break; // MADE CHANGES HEREE
	   							case 'n':Zebronicsmenu(); b=false; break; // MADE CHANGES HEREE
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
	   									case 'y':Zebronics1K4k(); b=false; break;
	   									case 'n':
	   										{
	   											System.out.print("Do you want to continue shopping in Zebronics [y/n or Y/N]:"); //MADE CHANGES HERE
	   											do 
	   											{
	   												char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
	   												switch(c2)
	   												{
	   												case 'y': Zebronicsmenu(); b=false; break;
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
  						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="ZEBRONICS SOUND BOMB N5";ob1[i++]=3399;
  						          System.out.print("Do you want to continue shopping in this Budget (Below 4K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
  				 		  do
  				 		  {
  				 			char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
  				 			switch(c1)	
  							{
  							case 'y':Zebronics1K4k(); b=false; break; // MADE CHANGES HEREE
  							case 'n':Zebronicsmenu(); b=false; break; // MADE CHANGES HEREE
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
  									case 'y':Zebronics1K4k(); b=false; break;
  									case 'n':
  										{
  											System.out.print("Do you want to continue shopping in Zebronics [y/n or Y/N]:"); //MADE CHANGES HERE
  											do 
  											{
  												char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
  												switch(c2)
  												{
  												case 'y': Zebronicsmenu(); b=false; break;
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
  						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="ZEBRONICS PREKSHA";ob1[i++]=2499;
  						          System.out.print("Do you want to continue shopping in this Budget (Below 4K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
  				 		  do
  				 		  {
  				 			char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
  				 			switch(c1)	
  							{
  							case 'y':Zebronics1K4k(); b=false; break; // MADE CHANGES HEREE
  							case 'n':Zebronicsmenu(); b=false; break; // MADE CHANGES HEREE
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
  									case 'y':Zebronics1K4k(); b=false; break;
  									case 'n':
  										{
  											System.out.print("Do you want to continue shopping in Zebronics [y/n or Y/N]:"); //MADE CHANGES HERE
  											do 
  											{
  												char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
  												switch(c2)
  												{
  												case 'y': Zebronicsmenu(); b=false; break;
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
  						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="ZEBBRONICS SOUND BOMB 5";ob1[i++]=3499;
  						          System.out.print("Do you want to continue shopping in this Budget (Below 4K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
  				 		  do
  				 		  {
  				 			char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
  				 			switch(c1)	
  							{
  							case 'y':Zebronics1K4k(); b=false; break; // MADE CHANGES HEREE
  							case 'n':Zebronicsmenu(); b=false; break; // MADE CHANGES HEREE
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
  									case 'y':Zebronics1K4k(); b=false; break;
  									case 'n':
  										{
  											System.out.print("Do you want to continue shopping in Zebronics [y/n or Y/N]:"); //MADE CHANGES HERE
  											do 
  											{
  												char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
  												switch(c2)
  												{
  												case 'y': Zebronicsmenu(); b=false; break;
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
  						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="ZEBBRONICS SOUND BOMB 7";ob1[i++]=2399;
  						          System.out.print("Do you want to continue shopping in this Budget (Below 4K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
  				 		  do
  				 		  {
  				 			char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
  				 			switch(c1)	
  							{
  							case 'y':Zebronics1K4k(); b=false; break; // MADE CHANGES HEREE
  							case 'n':Zebronicsmenu(); b=false; break; // MADE CHANGES HEREE
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
  									case 'y':Zebronics1K4k(); b=false; break;
  									case 'n':
  										{
  											System.out.print("Do you want to continue shopping in Zebronics [y/n or Y/N]:"); //MADE CHANGES HERE
  											do 
  											{
  												char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
  												switch(c2)
  												{
  												case 'y': Zebronicsmenu(); b=false; break;
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
       				
       			     case 6:  Zebronicsmenu(); b=false; break;
       				 default:  System.out.print("Please enter valid option:");
       				 }
       			 }while(b==true); 
   		    	
		
   		   }		 
	       		   
		   		 
		public static void Oppomenu()
		{ System.out.println(RESET);
			 System.out.println("\t\t\t\t\t\t"+"                          OPPO                         ");  
			 System.out.println("\t\t\t\t\t\t"+"                      -------------                      ");  
			 System.out.println("\t\t\t\t\t\t"+"                      1.Below 2K-5k                      ");  
			 System.out.println("\t\t\t\t\t\t"+"                      2.Above 5K                         ");
			 System.out.println("\t\t\t\t\t\t"+"                      3.EXIT FROM OPPO                             ");
			 System.out.println(RESET); Oppomenuswitch();
		   }
		public static void  Oppomenuswitch()
				       {
			 System.out.print("PLEASE ENTER THE PRICE RANGE  :");
			 do
			 {
				 int p=sc.nextInt();
				switch(p) 
				{
				case 1: Oppo2K5K(); b=false; break;
				case 2: Oppoabove5K(); b=false; break;
				case 3: display();b=false; break;
			    default:
			    	{
			    		System.out.print("Please enter valid option:");
			    		Oppomenu(); 
			    		
			    	}
				}
			 }while(b==true);
		   }
			public static void Oppo2K5K()
				    	   {
				 System.out.println(RESET);
				 System.out.println("\t   "+" ____________________________________________________________________________________________________________________________________");  
      			 System.out.println("\t   "+"|                                                                                                                                    |");  
      			 System.out.println("\t   "+"|          _______________________________         _______________________________         _______________________________           |");  
      			 System.out.println("\t   "+"|         |      OPPO ENCO BUDS 2         |       |       OPPO ENCO BUDS          |       |      OPPO ENCO AIR2 PRO       |          |");  
      			 System.out.println("\t   "+"|         |-------------------------------|       |-------------------------------|       |-------------------------------|          |");  
      			 System.out.println("\t   "+"|         |.Wireless /In the ear          |       |.Wireless /In the ear          |       |.Wireless /In the ear          |          |");  
      			 System.out.println("\t   "+"|         |.Foldable Design               |       |.Noise Cancellation            |       |.Noise Cancellation            |          |");  
      			 System.out.println("\t   "+"|         |.Version : 5.2                 |       |.Version : 5.2                 |       |.Version : 5.2                 |          |");  
      			 System.out.println("\t   "+"|         |.Talktime : 4.5 Hours          |       |.Talktime : 30 Hours           |       |.Talktime : 20 Hours           |          |");  
      			 System.out.println("\t   "+"|         |.Active Pairing/Range :10 Meter|       |.Active Pairing/Range :10 Meter|       |.Active Pairing/Range :10 Meter|          |");  
      			 System.out.println("\t   "+"|         |.Charging Time : 2 Hours       |       |.Charging Time : 3 Hours       |       |.Charging Time : 3 Hours       |          |");  
      			 System.out.println("\t   "+"|         |.PRICE  :  1,799.00/-          |       |. PRICE  :   3,799.00/-        |       |.  PRICE  : 1,299.00/-         |          |");  
      			 System.out.println("\t   "+"|         |_______________________________|       |_______________________________|       |_______________________________|          |");  
      			 System.out.println("\t   "+"|                                                                                                                                    |");  
      			 System.out.println("\t   "+"|                       1.                                          2.                                       3.                      |");  
      			 System.out.println("\t   "+"|                                                                                                                                    |");  
      			 System.out.println("\t   "+"|                                                                                                                                    |");  
      			 System.out.println("\t   "+"|          _______________________________         _______________________________         _______________________________           |");  
      			 System.out.println("\t   "+"|         |        OPPO ENCO AIR 2        |       |      OPPO ENCO AIR 2i         |       |                               |          |");  
      			 System.out.println("\t   "+"|         |-------------------------------|       |-------------------------------|       |                               |          |");  
      			 System.out.println("\t   "+"|         |.Wireless /In the ear          |       |.Wireless /In the ear          |       |                               |          |");  
      			 System.out.println("\t   "+"|         |.Foldable Design               |       |.Noise Cancellation            |       |             EXIT              |          |");  
      			 System.out.println("\t   "+"|         |.Version : 5.2                 |       |.Version : 5.2                 |       |            ------             |          |");  
      			 System.out.println("\t   "+"|         |.Talktime : 50 Hours           |       |.Talktime : 17.5 Hours         |       |                               |          |");  
      			 System.out.println("\t   "+"|         |.Battery Type : Li-ion         |       |.Active Pairing/Range :10 Meter|       |                               |          |");  
      			 System.out.println("\t   "+"|         |.Charging Time : 1.5 Hours     |       |.Charging Time : 2.5 Hours     |       |                               |          |");  
      			 System.out.println("\t   "+"|         |.  PRICE  :  2,499.00/-        |       |. PRICE  :  4,999.00/-         |       |                               |          |");  
      			 System.out.println("\t   "+"|         |_______________________________|       |_______________________________|       |_______________________________|          |");
      			 System.out.println("\t   "+"|                                                                                                                                    |");  
      			 System.out.println("\t   "+"|                     4.                                        5.                                       6.                          |");  
      			 System.out.println("\t   "+"|                                                                                                                                    |");  	 
      			 System.out.println("\t   "+"|____________________________________________________________________________________________________________________________________|");  
      			      
      			 System.out.println(RESET);           Opposwitch();
				    	   }
			
			
			 public static void Opposwitch()
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="OPPO ENCO BUDS 2";ob1[i++]=1799;
						          System.out.print("Do you want to continue shopping in this Budget (Below 5K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
				 		  do
				 		  {
				 			char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
				 			switch(c1)	
							{
							case 'y':Oppo2K5K(); b=false; break; // MADE CHANGES HEREE
							case 'n':Oppomenu(); b=false; break; // MADE CHANGES HEREE
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
									case 'y':Oppo2K5K(); b=false; break;
									case 'n':
										{
											System.out.print("Do you want to continue shopping in Oppo [y/n or Y/N]:"); //MADE CHANGES HERE
											do 
											{
												char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
												switch(c2)
												{
												case 'y': Oppomenu(); b=false; break;
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
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="OPPO ENCO BUDS";ob1[i++]=3799;
					          System.out.print("Do you want to continue shopping in this Budget (Below 5K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
			 		  do
			 		  {
			 			char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
			 			switch(c1)	
						{
						case 'y':Oppo2K5K(); b=false; break; // MADE CHANGES HEREE
						case 'n':Oppomenu(); b=false; break; // MADE CHANGES HEREE
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
								case 'y':Oppo2K5K(); b=false; break;
								case 'n':
									{
										System.out.print("Do you want to continue shopping in Oppo [y/n or Y/N]:"); //MADE CHANGES HERE
										do 
										{
											char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
											switch(c2)
											{
											case 'y': Oppomenu(); b=false; break;
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
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="OPPO ENCO AIR2 PRO";ob1[i++]=1299;
					          System.out.print("Do you want to continue shopping in this Budget (Below 5K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
			 		  do
			 		  {
			 			char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
			 			switch(c1)	
						{
						case 'y':Oppo2K5K(); b=false; break; // MADE CHANGES HEREE
						case 'n':Oppomenu(); b=false; break; // MADE CHANGES HEREE
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
								case 'y':Oppo2K5K(); b=false; break;
								case 'n':
									{
										System.out.print("Do you want to continue shopping in Oppo [y/n or Y/N]:"); //MADE CHANGES HERE
										do 
										{
											char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
											switch(c2)
											{
											case 'y': Oppomenu(); b=false; break;
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
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="OPPO ENCO AIR 2";ob1[i++]=2499;
					          System.out.print("Do you want to continue shopping in this Budget (Below 5K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
			 		  do
			 		  {
			 			char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
			 			switch(c1)	
						{
						case 'y':Oppo2K5K(); b=false; break; // MADE CHANGES HEREE
						case 'n':Oppomenu(); b=false; break; // MADE CHANGES HEREE
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
								case 'y':Oppo2K5K(); b=false; break;
								case 'n':
									{
										System.out.print("Do you want to continue shopping in Oppo [y/n or Y/N]:"); //MADE CHANGES HERE
										do 
										{
											char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
											switch(c2)
											{
											case 'y': Oppomenu(); b=false; break;
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
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="OPPO ENCO AIR 2i";ob1[i++]=4999;
					          System.out.print("Do you want to continue shopping in this Budget (Below 5K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
			 		  do
			 		  {
			 			char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
			 			switch(c1)	
						{
						case 'y':Oppo2K5K(); b=false; break; // MADE CHANGES HEREE
						case 'n':Oppomenu(); b=false; break; // MADE CHANGES HEREE
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
								case 'y':Oppo2K5K(); b=false; break;
								case 'n':
									{
										System.out.print("Do you want to continue shopping in Oppo [y/n or Y/N]:"); //MADE CHANGES HERE
										do 
										{
											char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
											switch(c2)
											{
											case 'y': Oppomenu(); b=false; break;
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
   				
   				 
   				
   				 case 6:  Oppomenu(); b=false; break;
   				 default:  System.out.print("Please enter valid option:");
   				 }
   			 }while(b==true); 
		    	
	
		   }		 
       		   
	   		 
  public static void Oppoabove5K()
  {
	  System.out.println(RESET);
	     System.out.println("\t   "+" ____________________________________________________________________________________________________________________________________");  
		 System.out.println("\t   "+"|                                                                                                                                    |");  
		 System.out.println("\t   "+"|          _______________________________         _______________________________         _______________________________           |");  
		 System.out.println("\t   "+"|         |      OPPO ENCO FREE           |       |        OPPO ENCO X            |       |        OPPO ENCO X2           |          |");  
		 System.out.println("\t   "+"|         |-------------------------------|       |-------------------------------|       |-------------------------------|          |");  
		 System.out.println("\t   "+"|         |.Wireless /In the ear          |       |.Wireless /In the ear          |       |.Wireless /In the ear          |          |");  
		 System.out.println("\t   "+"|         |.Foldable Design               |       |.Noise Cancellation            |       |.Noise Cancellation            |          |");  
		 System.out.println("\t   "+"|         |.Version : 5.2                 |       |.Version : 5.2                 |       |.Version : 5.2                 |          |");  
		 System.out.println("\t   "+"|         |.Talktime : 4.5 Hours          |       |.Talktime : 30 Hours           |       |.Talktime : 20 Hours           |          |");  
		 System.out.println("\t   "+"|         |.Active Pairing/Range :10 Meter|       |.Active Pairing/Range :10 Meter|       |.Active Pairing/Range :10 Meter|          |");  
		 System.out.println("\t   "+"|         |.Charging Time : 2 Hours       |       |.Charging Time : 3 Hours       |       |.Charging Time : 3 Hours       |          |");  
		 System.out.println("\t   "+"|         |.PRICE  :  7,099.00/-          |       |. PRICE  :   8,657.00/-        |       |.  PRICE  : 10,499.00/-        |          |");  
		 System.out.println("\t   "+"|         |_______________________________|       |_______________________________|       |_______________________________|          |");  
		 System.out.println("\t   "+"|                                                                                                                                    |");  
		 System.out.println("\t   "+"|                       1.                                          2.                                       3.                      |");  
		 System.out.println("\t   "+"|                                                                                                                                    |");  
		 System.out.println("\t   "+"|                                                                                                                                    |");  
		 System.out.println("\t   "+"|          _______________________________         _______________________________         _______________________________           |");  
		 System.out.println("\t   "+"|         |        OPPO ENCO R PRO        |       |        OPPO ENCO FREE 2       |       |                               |          |");  
		 System.out.println("\t   "+"|         |-------------------------------|       |-------------------------------|       |                               |          |");  
		 System.out.println("\t   "+"|         |.Wireless /In the ear          |       |.Wireless /In the ear          |       |                               |          |");  
		 System.out.println("\t   "+"|         |.Foldable Design               |       |.Noise Cancellation            |       |             EXIT              |          |");  
		 System.out.println("\t   "+"|         |.Version : 5.2                 |       |.Version : 5.2                 |       |            ------             |          |");  
		 System.out.println("\t   "+"|         |.Talktime : 50 Hours           |       |.Talktime : 17.5 Hours         |       |                               |          |");  
		 System.out.println("\t   "+"|         |.Battery Type : Li-ion         |       |.Active Pairing/Range :10 Meter|       |                               |          |");  
		 System.out.println("\t   "+"|         |.Charging Time : 1 Hours       |       |.Charging Time : 30 Minutes    |       |                               |          |");  
		 System.out.println("\t   "+"|         |.  PRICE  :  5,700.00/-        |       |. PRICE  :  6,810.00/-         |       |                               |          |");  
		 System.out.println("\t   "+"|         |_______________________________|       |_______________________________|       |_______________________________|          |");
		 System.out.println("\t   "+"|                                                                                                                                    |");  
		 System.out.println("\t   "+"|                     4.                                        5.                                       6.                          |");  
		 System.out.println("\t   "+"|                                                                                                                                    |");  	 
		 System.out.println("\t   "+"|____________________________________________________________________________________________________________________________________|");  
		 		    		 
		 System.out.println(RESET);	 Oppoabove5Kswitch();
 }
      		 public static void Oppoabove5Kswitch()
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
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="OPPO ENCO FREE";ob1[i++]=7099;
					          System.out.print("Do you want to continue shopping in this Budget (Above 5K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
			 		  do
			 		  {
			 			char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
			 			switch(c1)	
						{
						case 'y':Oppoabove5K(); b=false; break; // MADE CHANGES HEREE
						case 'n':Oppomenu(); b=false; break; // MADE CHANGES HEREE
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
								case 'y':Oppoabove5K(); b=false; break;
								case 'n':
									{
										System.out.print("Do you want to continue shopping in Oppo [y/n or Y/N]:"); //MADE CHANGES HERE
										do 
										{
											char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
											switch(c2)
											{
											case 'y': Oppomenu(); b=false; break;
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
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="OPPO ENCO X";ob1[i++]=8657;
					          System.out.print("Do you want to continue shopping in this Budget (Above 5K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
			 		  do
			 		  {
			 			char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
			 			switch(c1)	
						{
						case 'y':Oppoabove5K(); b=false; break; // MADE CHANGES HEREE
						case 'n':Oppomenu(); b=false; break; // MADE CHANGES HEREE
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
								case 'y':Oppoabove5K(); b=false; break;
								case 'n':
									{
										System.out.print("Do you want to continue shopping in Oppo [y/n or Y/N]:"); //MADE CHANGES HERE
										do 
										{
											char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
											switch(c2)
											{
											case 'y': Oppomenu(); b=false; break;
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
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="OPPO ENCO X2";ob1[i++]=10499;
					          System.out.print("Do you want to continue shopping in this Budget (Above 5K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
			 		  do
			 		  {
			 			char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
			 			switch(c1)	
						{
						case 'y':Oppoabove5K(); b=false; break; // MADE CHANGES HEREE
						case 'n':Oppomenu(); b=false; break; // MADE CHANGES HEREE
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
								case 'y':Oppoabove5K(); b=false; break;
								case 'n':
									{
										System.out.print("Do you want to continue shopping in Oppo [y/n or Y/N]:"); //MADE CHANGES HERE
										do 
										{
											char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
											switch(c2)
											{
											case 'y': Oppomenu(); b=false; break;
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
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="OPPO ENCO R PRO";ob1[i++]=5700;
					          System.out.print("Do you want to continue shopping in this Budget (Above 5K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
			 		  do
			 		  {
			 			char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
			 			switch(c1)	
						{
						case 'y':Oppoabove5K(); b=false; break; // MADE CHANGES HEREE
						case 'n':Oppomenu(); b=false; break; // MADE CHANGES HEREE
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
								case 'y':Oppoabove5K(); b=false; break;
								case 'n':
									{
										System.out.print("Do you want to continue shopping in Oppo [y/n or Y/N]:"); //MADE CHANGES HERE
										do 
										{
											char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
											switch(c2)
											{
											case 'y': Oppomenu(); b=false; break;
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
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="OPPO ENCO FREE 2";ob1[i++]=6810;
					          System.out.print("Do you want to continue shopping in this Budget (Above 5K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
			 		  do
			 		  {
			 			char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
			 			switch(c1)	
						{
						case 'y':Oppoabove5K(); b=false; break; // MADE CHANGES HEREE
						case 'n':Oppomenu(); b=false; break; // MADE CHANGES HEREE
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
								case 'y':Oppoabove5K(); b=false; break;
								case 'n':
									{
										System.out.print("Do you want to continue shopping in Oppo [y/n or Y/N]:"); //MADE CHANGES HERE
										do 
										{
											char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
											switch(c2)
											{
											case 'y': Oppomenu(); b=false; break;
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
   				 
   				
   				 case 6:  Oppomenu(); b=false; break;
   				 default:  System.out.print("Please enter valid option:");
   				 }
   			 }while(b==true); 
		    	
	
             }			
//		public static void main(String[]args)
//		{
//			display();
//		}
		
}
		
		
		
	             
	
				  
