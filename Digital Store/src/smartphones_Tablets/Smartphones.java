package smartphones_Tablets;

import java.util.Scanner;

import home_screen.Main_Home;

public class Smartphones 
{
	public static String ob[]=new String[100];
	public static float ob1[]=new float[100];static int i=0;
	static Scanner sc=new Scanner(System.in);private static final String RESET = "\033[0m";  // Text Reset
	static boolean b = true;
	public static void display()
	{ System.out.println(RESET);
	     String BLACK_BOLD = "\033[1;30m";
		System.out.println(BLACK_BOLD+"\t\t\t\t\t\t\t            "+"  ***********************************");
		System.out.println("\t\t\t\t\t\t\t    "+" *              OOOOOO               *");
		System.out.println("\t\t\t\t\t\t\t    "+" *************************************");
		System.out.println("\t\t\t\t\t\t\t    "+" *                                   *");
		System.out.println("\t\t\t\t\t\t\t    "+" *                                   *");
		System.out.println("\t\t\t\t\t\t\t    "+" *                                   *");
		System.out.println("\t\t\t\t\t\t\t    "+" *                                   *");
		System.out.println("\t\t\t\t\t\t\t    "+" *                                   *");
		System.out.println("\t\t\t\t\t\t\t    "+" *         * SMARTPHONES *           *");
		System.out.println("\t\t\t\t\t\t\t    "+" *          -------------            *");
		System.out.println("\t\t\t\t\t\t\t    "+" *           1.SAMSUNG               *");
		System.out.println("\t\t\t\t\t\t\t    "+" *           2.APPLE                 *");
		System.out.println("\t\t\t\t\t\t\t    "+" *           3.XIOAMI                *");
		System.out.println("\t\t\t\t\t\t\t    "+" *           4.VIVO                  *");
		System.out.println("\t\t\t\t\t\t\t    "+" *           5.ONEPLUS               *");
		System.out.println("\t\t\t\t\t\t\t    "+" *           6.OPPO                  *");
		System.out.println("\t\t\t\t\t\t\t    "+" *           7.REALME                *");
		System.out.println("\t\t\t\t\t\t\t    "+" *           8.IQOO                  *");
		System.out.println("\t\t\t\t\t\t\t    "+" *           9.EXIT                  *");
		System.out.println("\t\t\t\t\t\t\t    "+" *                                   *");
		System.out.println("\t\t\t\t\t\t\t    "+" *                                   *");
		System.out.println("\t\t\t\t\t\t\t    "+" *                                   *");
		System.out.println("\t\t\t\t\t\t\t    "+" *                                   *");
		System.out.println("\t\t\t\t\t\t\t    "+" *                                   *");
		System.out.println("\t\t\t\t\t\t\t    "+" *                                   *");
		System.out.println("\t\t\t\t\t\t\t    "+" *                                   *");
		System.out.println("\t\t\t\t\t\t\t    "+" *                                   *");
		System.out.println("\t\t\t\t\t\t\t    "+" *                                   *");
		System.out.println("\t\t\t\t\t\t\t    "+" *************************************");
		System.out.println("\t\t\t\t\t\t\t    "+" *    ++           O            <-   *");
		System.out.println("\t\t\t\t\t\t\t    "+"  ***********************************"+RESET);
		
		 System.out.println(RESET);purchase();
	}
	public static void purchase()
	{
		System.out.print("PLEASE SELECT YOUR PREFERRED BRAND [1-9] : ");
		boolean b=true;
		do
		{
			int c=sc.nextInt();
			switch(c)
			{
			case 1:samsung();; b=false; break;
			case 2:apple();; b=false; break;
			case 3:xioami();;  b=false; break;
			case 4:vivo();;  b=false;  break;
			case 5:oneplus();  b=false;  break;
			case 6:oppo();   b=false;  break;
			case 7:realme();   b=false;  break;
			case 8:iqoo();   b=false;  break;
			case 9:Main_Home.mobilesAndTablets();   b=false;  break;
			default: 
				{
					System.out.println();
					System.out.print("\t\t\t\t\t\t\t\t   "+"PLEASE ENTER VALID OPTION..."+"\n");
					System.out.println();
			        display();;
				}
			}
		}while(b==true);
		
	}
	public static void samsung()
	{ System.out.println(RESET);
         System.out.println("\t\t\t\t\t\t"+"                         SAMSUNG                           ");  
		 System.out.println("\t\t\t\t\t\t"+"                      -------------                      ");  
		 System.out.println("\t\t\t\t\t\t"+"                      1.Below 10k                         ");  
		 System.out.println("\t\t\t\t\t\t"+"                      2.Between 10k - 25k                    ");
		 System.out.println("\t\t\t\t\t\t"+"                      3.Between 30k - 50k                    ");
		 System.out.println("\t\t\t\t\t\t"+"                      4.Above 50k                    ");
		 System.out.println("\t\t\t\t\t\t"+"                      5.EXIT FROM SAMSUNG                   "); //
        System.out.print("SELECT PRICE RANGE : "); System.out.print(RESET);
       do
		 {
			int p=sc.nextInt();
			switch(p) 
			{
			case 1: samsung1Display(); b=false; break;
			case 2: samsung2Display(); b=false; break;
			case 3: samsung3Display();b=false; break;
			case 4: samsung4Display();b=false; break;
			case 5: display();b=false; break;
		    default:
		    	{
		    		System.out.println("Please enter valid option.");
		    		samsung(); 
		    	}
			}
		 }while(b==true);
	}
	public static void samsung1Display()
	{ System.out.println(RESET);
		System.out.println("   ____________________________________________________________________________________________________________________________________________________");
		System.out.println("  |                                                                                                                                                    |");
		System.out.println("  |     _____________________        _____________________        _____________________        _____________________        _____________________      |");
		System.out.println("  |    |   SAMSUNG M01CORE   |      |   SAMSUNG A03CORE   |      |   SAMSUNG A03       |      |   SAMSUNG M04       |      |   SAMSUNG F04       |     |");
		System.out.println("  |    |---------------------|      |---------------------|      |---------------------|      |---------------------|      |---------------------|     |");
		System.out.println("  |    |  Ram : 2GB          |      |  Ram : 2GB          |      |  Ram : 3GB          |      |  Ram : 3GB          |      |  Ram : 4GB          |     |");
		System.out.println("  |    |  Rom : 16GB         |      |  Rom : 32GB         |      |  Rom : 16GB         |      |  Rom : 32GB         |      |  Rom : 32GB         |     |");
		System.out.println("  |    |  Front Camera : 5mp |      |  Front Camera : 5mp |      |  Front Camera : 6mp |      |  Front Camera : 16mp|      |  Front Camera : 16mp|     |");
		System.out.println("  |    |  Back Camera : 13mp |      |  Rear Camera : 32mp |      |  Rear Camera : 32mp |      |  Rear Camera : 32mp |      |  Rear Camera : 32mp |     |");
		System.out.println("  |    |  Battery : 3000mah  |      |  Battery : 3000mah  |      |  Battery : 3500mah  |      |  Battery : 4000mah  |      |  Battery : 4000mah  |     |");
		System.out.println("  |    |  Charger : 5v       |      |  Charger : 5v       |      |  Charger : 5v       |      |  Charger : 5v       |      |  Charger : 5v       |     |");
		System.out.println("  |    |  Size    : 165.5mm  |      |  Size    : 165.5mm  |      |  Size    : 165.5mm  |      |  Size    : 165.5mm  |      |  Size    : 165.5mm  |     |");
		System.out.println("  |    |  Display : Full Hd  |      |  Display : Full Hd  |      |  Display : Full Hd  |      |  Display : Full Hd  |      |  Display : Full Hd  |     |");
		System.out.println("  |    |  Processor : 1.6    |      |  Processor : 1.7    |      |  Processor : 1.7    |      |  Processor : 1.7    |      |  Processor : 1.6    |     |");
		System.out.println("  |    |      GHz Octa-Core  |      |      GHz Octa-Core  |      |     GHz Octa-Core   |      |     GHz Octa-Core   |      |     GHz Octa-Core   |     |");
		System.out.println("  |    |  PRICE : Rs6499/-   |      |  PRICE : Rs6999/-   |      |  PRICE : Rs7499/-   |      |  PRICE : Rs7799/-   |      |  PRICE : Rs7999/-   |     |");  
		System.out.println("  |    |_____________________|      |_____________________|      |_____________________|      |_____________________|      |_____________________|     |");
		System.out.println("  |                                                                                                                                                    |");
		System.out.println("  |              1.                           2.                           3.                            4.                          5.                |");
		System.out.println("  |     _____________________        _____________________        _____________________        _____________________        _____________________      |");
		System.out.println("  |    |   SAMSUNG A04E      |      |   SAMSUNG A03S      |      |   SAMSUNG A10S      |      |   SAMSUNG F02S      |      |                     |     |");
		System.out.println("  |    |---------------------|      |---------------------|      |---------------------|      |---------------------|      |                     |     |");
		System.out.println("  |    |  Ram : 3GB          |      |  Ram : 4GB          |      |  Ram : 3GB          |      |  Ram : 4GB          |      |                     |     |");
		System.out.println("  |    |  Rom : 64GB         |      |  Rom : 128GB        |      |  Rom : 16GB         |      |  Rom : 64GB         |      |                     |     |");
		System.out.println("  |    |  Front Camera : 16mp|      |  Front Camera : 16mp|      |  Front Camera : 5mp |      |  Front Camera : 8mp |      |                     |     |");
		System.out.println("  |    |  Back Camera : 32mp |      |  Rear Camera : 48mp |      |  Rear Camera : 32mp |      |  Rear Camera : 32mp |      |                     |     |");
		System.out.println("  |    |  Battery : 3000mah  |      |  Battery : 3000mah  |      |  Battery : 3000mah  |      |  Battery : 3900mah  |      |        EXIT         |     |");
		System.out.println("  |    |  Charger : 5v       |      |  Charger : 5v       |      |  Charger : 7v       |      |  Charger : 5v       |      |      ---------      |     |");
		System.out.println("  |    |  Size    : 165.5mm  |      |  Size    : 165.5mm  |      |  Size    : 165.5mm  |      |  Size    : 165.5mm  |      |                     |     |");
		System.out.println("  |    |  Display : Full Hd  |      |  Display : Full Hd  |      |  Display : Full Hd  |      |  Display : Full Hd  |      |                     |     |");
		System.out.println("  |    |  Processor : 1.65   |      |  Processor : 1.7    |      |  Processor : 1.75   |      |  Processor : 1.8    |      |                     |     |");
		System.out.println("  |    |      GHz Octa-Core  |      |      GHz Octa-Core  |      |     GHz Octa-Core   |      |     GHz Octa-Core   |      |                     |     |");
		System.out.println("  |    |  PRICE : Rs8199/-   |      |  PRICE : Rs8399/-   |      |  PRICE : Rs8499/-   |      |  PRICE : Rs8999/-   |      |                     |     |");  
		System.out.println("  |    |_____________________|      |_____________________|      |_____________________|      |_____________________|      |_____________________|     |");
		System.out.println("  |                                                                                                                                                    |");
		System.out.println("  |             6.                            7.                           8.                           9.                            10.              |");
		System.out.println("  |____________________________________________________________________________________________________________________________________________________|");
		 System.out.println(RESET);samsung1();
	}
	public static void samsung1()
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SAMSUNG M01 CORE";ob1[i++]= 6499; 
						 		  System.out.println("Do you want to continue in this budget (Below 10k) [y/n or Y/N] :");  //CHUSKO KANNA
						 		  do
						 		  {
						 			char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						 			switch(c1)	
									{
									case 'y':samsung1Display(); b=false; break;
									case 'n':samsung(); b=false; break;
						 			default : System.out.print("Please enter valid option: ");
									}
						 		  }while(b==true);b=false; break;
						 case 'n':
							 {
								 System.out.print("Do you want to see another model in this budget (Below 10k) [y/n or Y/N]:");   //CHUSKO KANNA
									do
									{
										char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									switch(c1)	
									{
									case 'y':samsung1Display(); b=false; break;
									case 'n':{
										System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
										do 
										{
											char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
											switch(c2)
											{
											case 'y': samsung(); b=false; break;
											case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SAMSUNG A03 CORE";ob1[i++]= 6999; 
					   System.out.println("Do you want to continue in this budget (Below 10k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':samsung1Display(); b=false; break;
						   case 'n':samsung(); b=false; break;
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Below 10k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':samsung1Display(); b=false; break;
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': samsung(); b=false; break;
									   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SAMSUNG A03";ob1[i++]= 7499; 
					   System.out.println("Do you want to continue in this budget (Below 10k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':samsung1Display(); b=false; break;
						   case 'n':samsung(); b=false; break;
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Below 10k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':samsung1Display(); b=false; break;
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': samsung(); b=false; break;
									   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SAMSUNG M04";ob1[i++]= 7799; 
					   System.out.println("Do you want to continue in this budget (Below 10k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':samsung1Display(); b=false; break;
						   case 'n':samsung(); b=false; break;
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Below 10k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':samsung1Display();b=false; break;
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': samsung(); b=false; break;
									   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SAMSUNG F04";ob1[i++]= 7999; 
					   System.out.println("Do you want to continue in this budget (Below 10k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':samsung1Display(); b=false; break;
						   case 'n':samsung(); b=false; break;
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Below 10k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':samsung1Display(); b=false; break;
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': samsung(); b=false; break;
									   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SAMSUNG A04E";ob1[i++]= 8199; 
					   System.out.println("Do you want to continue in this budget (Below 10k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':samsung1Display(); b=false; break;
						   case 'n':samsung(); b=false; break;
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Below 10k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':samsung1Display(); b=false; break;
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': samsung(); b=false; break;
									   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SAMSUNG A03S";ob1[i++]= 8399; 
					   System.out.println("Do you want to continue in this budget (Below 10k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':samsung1Display(); b=false; break;
						   case 'n':samsung(); b=false; break;
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Below 10k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':samsung1Display(); b=false; break;
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': samsung(); b=false; break;
									   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SAMSUNG A10S";ob1[i++]= 8499; 
					   System.out.println("Do you want to continue in this budget (Below 10k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':samsung1Display(); b=false; break;
						   case 'n':samsung(); b=false; break;
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Below 10k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':samsung1Display(); b=false; break;
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': samsung(); b=false; break;
									   case 'n': display(); b=false; break;
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
			   case 9:
			   {
				   System.out.print("Do you want to add it to cart [y/n or Y/N]:"); //CHUSKO KANNA
				   do
				   {
					   char c=sc.next().toLowerCase().charAt(0);           //CHUSKO KANNA
					   switch(c)
					   {
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SAMSUNG F02S";ob1[i++]= 8999; 
					   System.out.println("Do you want to continue in this budget (Below 10k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':samsung1Display();b=false; break;
						   case 'n':samsung(); b=false; break;
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Below 10k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':samsung1Display(); b=false; break;
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': samsung(); b=false; break;
									   case 'n': display(); b=false; break;
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
			   case 10:samsung(); b=false; break;
			   default: System.out.print("PLEASE ENTER VALID OPTION: ");
			   }
		   }while(b==true);
	}
	public static void samsung2Display()
	{ System.out.println(RESET);
		System.out.println("   ___________________________________________________________________________________________________________________________________________________");
		System.out.println("  |                                                                                                                                                   |");
		System.out.println("  |     _____________________        _____________________        _____________________        _____________________        _____________________     |");
		System.out.println("  |    |   SAMSUNG M32 5G    |      |   SAMSUNG F23 5G    |      |   SAMSUNG M13 5G    |      |   SAMSUNG F42 5G    |      |   SAMSUNG M33 5G    |    |");
		System.out.println("  |    |---------------------|      |---------------------|      |---------------------|      |---------------------|      |---------------------|    |");
		System.out.println("  |    |  Ram : 3GB          |      |  Ram : 4GB          |      |  Ram : 4GB          |      |  Ram : 3GB          |      |  Ram : 3GB          |    |");
		System.out.println("  |    |  Rom : 32GB         |      |  Rom : 64GB         |      |  Rom : 64GB         |      |  Rom : 32GB         |      |  Rom : 32GB         |    |");
		System.out.println("  |    |  Front Camera : 16mp|      |  Front Camera : 16mp|      |  Front Camera : 16mp|      |  Front Camera : 16mp|      |  Front Camera : 16mp|    |");
		System.out.println("  |    |  Back Camera : 32mp |      |  Rear Camera : 32mp |      |  Rear Camera : 32mp |      |  Rear Camera : 32mp |      |  Rear Camera : 32mp |    |");
		System.out.println("  |    |  Battery : 3000mah  |      |  Battery : 3500mah  |      |  Battery : 4000mah  |      |  Battery : 4500mah  |      |  Battery : 4500mah  |    |");
		System.out.println("  |    |  Charger : 5v       |      |  Charger : 5v       |      |  Charger : 10W      |      |  Charger : 5v       |      |  Charger : 5v       |    |");
		System.out.println("  |    |  Size    : 165.5mm  |      |  Size    : 165.5mm  |      |  Size    : 165.5mm  |      |  Size    : 165.5mm  |      |  Size    : 165.5mm  |    |");
		System.out.println("  |    |  Display : Full Hd  |      |  Display : Full Hd  |      |  Display : Full Hd  |      |  Display : Full Hd  |      |  Display : Full Hd  |    |");
		System.out.println("  |    |  Processor : SD 695 |      |  Processor : SD 695 |      |  Processor : G90T   |      |  Processor : G99    |      |  Processor : SD 732 |    |");
		System.out.println("  |    |  PRICE : Rs11999/-  |      |  PRICE : Rs12499/-  |      |  PRICE : Rs13499/-  |      |  PRICE : Rs14499/-  |      |  PRICE : Rs15999/-  |    |");  
		System.out.println("  |    |_____________________|      |_____________________|      |_____________________|      |_____________________|      |_____________________|    |");
		System.out.println("  |                                                                                                                                                   |");
		System.out.println("  |              1.                           2.                           3.                            4.                          5.               |");
		System.out.println("  |     _____________________        _____________________        _____________________        _____________________        _____________________     |");
		System.out.println("  |    |   SAMSUNG A14 5G    |      |   SAMSUNG A22 5G    |      |   SAMSUNG M52 5G    |      |   SAMSUNG M53 5G    |      |                     |    |");
		System.out.println("  |    |---------------------|      |---------------------|      |---------------------|      |---------------------|      |                     |    |");
		System.out.println("  |    |  Ram : 4GB          |      |  Ram : 4GB          |      |  Ram : 6GB          |      |  Ram : 8GB          |      |                     |    |");
		System.out.println("  |    |  Rom : 64GB         |      |  Rom : 64GB         |      |  Rom : 64GB         |      |  Rom : 128GB        |      |                     |    |");
		System.out.println("  |    |  Front Camera : 32mp|      |  Front Camera : 24mp|      |  Front Camera : 32mp|      |  Front Camera : 32mp|      |                     |    |");
		System.out.println("  |    |  Back Camera : 64mp |      |  Rear camera : 64mp |      |  Rear Camera : 64mp |      |  Rear Camera : 64mp |      |                     |    |");
		System.out.println("  |    |  Battery : 3900mah  |      |  Battery : 4000mah  |      |  Battery : 4500mah  |      |  Battery : 5900mah  |      |         EXIT        |    |");
		System.out.println("  |    |  Charger : 5v       |      |  Charger : 5v       |      |  Charger : 7v       |      |  Charger : 5v       |      |       ---------     |    |");
		System.out.println("  |    |  Size    : 165.5mm  |      |  Size    : 165.5mm  |      |  Size    : 165.5mm  |      |  Size    : 165.5mm  |      |                     |    |");
		System.out.println("  |    |  Display : Full Hd  |      |  Display : Full Hd  |      |  Display : Full Hd  |      |  Display : Full Hd  |      |                     |    |");
		System.out.println("  |    |  Processor : DM 710 |      |  Processor : DM 810 |      |  Processor : SD 695 |      |  Processor : G90T   |      |                     |    |");
		System.out.println("  |    |  PRICE : Rs19999/-  |      |  PRICE : Rs21999/-  |      |  PRICE : Rs22999/-  |      |  PRICE : Rs24999/-  |      |                     |    |");
		System.out.println("  |    |_____________________|      |_____________________|      |_____________________|      |_____________________|      |_____________________|    |");
		System.out.println("  |                                                                                                                                                   |");
		System.out.println("  |             6.                            7.                           8.                           9.                            10.             |");
		System.out.println("  |___________________________________________________________________________________________________________________________________________________|");
		 System.out.println(RESET);	samsung2();
	}
	public static void samsung2()
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
						   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SAMSUNG M32 5G";ob1[i++]= 11999; 
						   System.out.println("Do you want to continue in this budget (Between 10k - 25k) [y/n or Y/N] :");  //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':samsung2Display(); b=false; break; //CHUSKO KANNA
							   case 'n':samsung(); b=false; break;
							   default : System.out.print("Please enter valid option: ");
							   }
						   }while(b==true);b=false; break;
						   case 'n':
						   {
							   System.out.print("Do you want to see another model in this budget (Between 10k - 25k) [y/n or Y/N]:");   //CHUSKO KANNA
							   do
							   {
								   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
								   switch(c1)	
								   {
								   case 'y':samsung2Display(); b=false; break; //CHUSKO KANNA
								   case 'n':{
									   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
									   do 
									   {
										   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
										   switch(c2)
										   {
										   case 'y': samsung(); b=false; break;
										   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SAMSUNG F23 5G";ob1[i++]= 12499; 
					   System.out.println("Do you want to continue in this budget (Between 10k - 25k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':samsung2Display(); b=false; break; //CHUSKO KANNA
						   case 'n':samsung(); b=false; break;
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Between 10k - 25k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':samsung2Display(); b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': samsung(); b=false; break;
									   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SAMSUNG M13 5G";ob1[i++]= 13499; 
					   System.out.println("Do you want to continue in this budget (Between 10k - 25k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':samsung2Display(); b=false; break; //CHUSKO KANNA
						   case 'n':samsung(); b=false; break;
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Between 10k - 25k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':samsung2Display(); b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': samsung(); b=false; break;
									   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SAMSUNG F42 5G";ob1[i++]= 14499; 
					   System.out.println("Do you want to continue in this budget (Between 10k - 25k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':samsung2Display(); b=false; break; //CHUSKO KANNA
						   case 'n':samsung(); b=false; break;
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Between 10k - 25k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':samsung2Display(); b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': samsung(); b=false; break;
									   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SAMSUNG M33 5G";ob1[i++]= 15999; 
					   System.out.println("Do you want to continue in this budget (Between 10k - 25k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':samsung2Display(); b=false; break; //CHUSKO KANNA
						   case 'n':samsung(); b=false; break;
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Between 10k - 25k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':samsung2Display(); b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': samsung(); b=false; break;
									   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SAMSUNG A14 5G";ob1[i++]= 19999; 
					   System.out.println("Do you want to continue in this budget (Between 10k - 25k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':samsung2Display(); b=false; break; //CHUSKO KANNA
						   case 'n':samsung(); b=false; break;
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Between 10k - 25k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':samsung2Display(); b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': samsung(); b=false; break;
									   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SAMSUNG A22 5G";ob1[i++]= 21999; 
					   System.out.println("Do you want to continue in this budget (Between 10k - 25k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':samsung2Display();; b=false; break; //CHUSKO KANNA
						   case 'n':samsung(); b=false; break;
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Between 10k - 25k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':samsung2Display(); b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': samsung(); b=false; break;
									   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SAMSUNG M52 5G";ob1[i++]= 22999; 
					   System.out.println("Do you want to continue in this budget (Between 10k - 25k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':samsung2Display(); b=false; break; //CHUSKO KANNA
						   case 'n':samsung(); b=false; break;
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Between 10k - 25k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':samsung2Display(); b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': samsung(); b=false; break;
									   case 'n': display(); b=false; break;
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
			   case 9:
			   {
				   System.out.print("Do you want to add it to cart [y/n or Y/N]:"); //CHUSKO KANNA
				   do
				   {
					   char c=sc.next().toLowerCase().charAt(0);           //CHUSKO KANNA
					   switch(c)
					   {
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SAMSUNG M53 5G";ob1[i++]= 24999; 
					   System.out.println("Do you want to continue in this budget (Between 10k - 25k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':samsung2Display(); b=false; break; //CHUSKO KANNA
						   case 'n':samsung(); b=false; break;
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Between 10k - 25k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':samsung2Display(); b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': samsung(); b=false; break;
									   case 'n': display(); b=false; break;
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
			 case 10:samsung(); b=false; break;
			 default: System.out.print("PLEASE ENTER VALID OPTION: ");
				   }
			}while(b==true);
	}

	public static void samsung3Display()
	{ System.out.println(RESET);
		System.out.println("   ___________________________________________________________________________________________________________________________________________________");
		System.out.println("  |                                                                                                                                                   |");
		System.out.println("  |     _____________________        _____________________        _____________________        _____________________        _____________________     |");
		System.out.println("  |    |   SAMSUNG S20 FE    |      |   SAMSUNG A53 5G    |      |   SAMSUNG A52S      |      |   SAMSUNG S21 FE    |      |                     |    |");
		System.out.println("  |    |---------------------|      |---------------------|      |---------------------|      |---------------------|      |                     |    |");
		System.out.println("  |    |  Ram : 6GB          |      |  Ram : 6GB          |      |  Ram : 6GB          |      |  Ram : 8GB          |      |                     |    |");
		System.out.println("  |    |  Rom : 64GB         |      |  Rom : 128GB        |      |  Rom : 128GB        |      |  Rom : 128GB        |      |                     |    |");
		System.out.println("  |    |  Front Camera : 16mp|      |  Front Camera : 16mp|      |  Front Camera : 32mp|      |  Front Camera : 20mp|      |                     |    |");
		System.out.println("  |    |  Back Camera : 108mp|      |  Rear Camera : 48mp |      |  Rear Camera : 50mp |      |  Rear Camera : 64mp |      |                     |    |");
		System.out.println("  |    |  Battery : 5000mah  |      |  Battery : 5500mah  |      |  Battery : 5000mah  |      |  Battery : 5500mah  |      |        EXIT         |    |");
		System.out.println("  |    |  Charger : 20w      |      |  Charger : 30w      |      |  Charger : 15w      |      |  Charger : 25w      |      |      ---------      |    |");
		System.out.println("  |    |  Size    : 165.5mm  |      |  Size    : 165.5mm  |      |  Size    : 165.5mm  |      |  Size    : 165.5mm  |      |                     |    |");
		System.out.println("  |    |  Display : Full Hd  |      |  Display : Full Hd  |      |  Display : Full Hd  |      |  Display : Full Hd  |      |                     |    |");
		System.out.println("  |    |  Processor : SD 778G|      |  Processor : SD 778G|      |  Processor : SD 778G|      |  Processor : SD 888 |      |                     |    |");
		System.out.println("  |    |  PRICE : Rs29999/-  |      |  PRICE : Rs34499/-  |      |  PRICE : Rs43499/-  |      |  PRICE : Rs45499/-  |      |                     |    |");  
		System.out.println("  |    |_____________________|      |_____________________|      |_____________________|      |_____________________|      |_____________________|    |");
		System.out.println("  |                                                                                                                                                   |");
		System.out.println("  |             1.                            2.                           3.                           4.                            5.              |");
		System.out.println("  |___________________________________________________________________________________________________________________________________________________|");
		 System.out.println(RESET);samsung3();
	}
	public static void samsung3()
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
						   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SAMSUNG S20 FE";ob1[i++]= 29999; 
						   System.out.println("Do you want to continue in this budget (Between 30k - 50k) [y/n or Y/N] :");  //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':samsung3Display(); b=false; break; //CHUSKO KANNA
							   case 'n':samsung(); b=false; break;
							   default : System.out.print("Please enter valid option: ");
							   }
						   }while(b==true);b=false; break;
						   case 'n':
						   {
							   System.out.print("Do you want to see another model in this budget (Between 30k - 50k) [y/n or Y/N]:");   //CHUSKO KANNA
							   do
							   {
								   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
								   switch(c1)	
								   {
								   case 'y':samsung3Display(); b=false; break; //CHUSKO KANNA
								   case 'n':{
									   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
									   do 
									   {
										   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
										   switch(c2)
										   {
										   case 'y': samsung(); b=false; break;
										   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SAMSUNG A53 5G";ob1[i++]= 34499; 
					   System.out.println("Do you want to continue in this budget (Between 30k - 50k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':samsung3Display(); b=false; break; //CHUSKO KANNA
						   case 'n':samsung(); b=false; break;
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Between 30k - 50k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':samsung3Display(); b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': samsung(); b=false; break;
									   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SAMSUNG A52S";ob1[i++]= 43499; 
					   System.out.println("Do you want to continue in this budget (Between 30k - 50k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':samsung3Display();b=false; break; //CHUSKO KANNA
						   case 'n':samsung(); b=false; break;
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Between 30k - 50k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':samsung3Display(); b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': samsung(); b=false; break;
									   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SAMSUNG S21 FE";ob1[i++]= 45499; 
					   System.out.println("Do you want to continue in this budget (Between 30k - 50k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':samsung3Display(); b=false; break; //CHUSKO KANNA
						   case 'n':samsung(); b=false; break;
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Between 30k - 50k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':samsung3Display(); b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': samsung(); b=false; break;
									   case 'n': display(); b=false; break;
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
				   case 5:samsung(); b=false; break;
				   default: System.out.print("PLEASE ENTER VALID OPTION: ");
				   }
			}while(b==true);
	}

	public static void samsung4Display()
	{ System.out.println(RESET);
		System.out.println("   ___________________________________________________________________________________________________________________________________________________");
		System.out.println("  |                                                                                                                                                   |");
		System.out.println("  |     _____________________        _____________________        _____________________        _____________________        _____________________     |");
		System.out.println("  |    |   SAMSUNG S22       |      |   SAMSUNG Z FLIP    |      |   SAMSUNG 21 PLUS   |      |   SAMSUNG S22 PLUS  |      |   SAMSUNG S23 5G    |    |");
		System.out.println("  |    |---------------------|      |---------------------|      |---------------------|      |---------------------|      |---------------------|    |");
		System.out.println("  |    |  Ram : 8GB          |      |  Ram : 6GB          |      |  Ram : 6GB          |      |  Ram : 6GB          |      |  Ram : 6GB          |    |");
		System.out.println("  |    |  Rom : 128GB        |      |  Rom : 128GB        |      |  Rom : 64GB         |      |  Rom : 64GB         |      |  Rom : 128GB        |    |");
		System.out.println("  |    |  Front Camera : 32mp|      |  Front Camera : 32mp|      |  Front Camera : 32mp|      |  Front Camera : 32mp|      |  Front Camera : 32mp|    |");
		System.out.println("  |    |  Back Camera : 108mp|      |  Rear Camera : 50mp |      |  Rear Camera : 64mp |      |  Rear Camera : 64mp |      |  Rear Camera : 64mp |    |");
		System.out.println("  |    |  Battery : 4000mah  |      |  Battery : 5000mah  |      |  Battery : 4500mah  |      |  Battery : 4500mah  |      |  Battery : 4500mah  |    |");
		System.out.println("  |    |  Charger : 10w      |      |  Charger : 20w      |      |  Charger : 25w      |      |  Charger : 40w      |      |  Charger : 50w      |    |");
		System.out.println("  |    |  Size    : 165.5mm  |      |  Size    : 167.5mm  |      |  Size    : 167.5mm  |      |  Size    : 165.5mm  |      |  Size    : 175.5mm  |    |");
		System.out.println("  |    |  Display : Full HD  |      |  Display : Full HD  |      |  Display : Full HD  |      |  Display : Full Hd  |      |  Display : Full HD  |    |");
		System.out.println("  |    |  Processor : SD 888 |      |  Processor : SD 888 |      |  Processor : SD 870 |      |  Processor : SD 865 |      |  Processor : SD 870 |    |");
		System.out.println("  |    |  PRICE : Rs56499/-  |      |  PRICE : Rs56999/-  |      |  PRICE : Rs57499/-  |      |  PRICE : Rs57799/-  |      |  PRICE : Rs57999/-  |    |");  
		System.out.println("  |    |_____________________|      |_____________________|      |_____________________|      |_____________________|      |_____________________|    |");
		System.out.println("  |                                                                                                                                                   |");
		System.out.println("  |              1.                           2.                           3.                            4.                          5.               |");
		System.out.println("  |     _____________________        _____________________        _____________________        _____________________        _____________________     |");
		System.out.println("  |    |  SAMSUNG S22 ULTRA  |      |   SAMSUNG S23 PLUS  |      |   SAMSUNG Z FLIP    |      |   SAMSUNG S23 PRO   |      |                     |    |");
		System.out.println("  |    |---------------------|      |---------------------|      |---------------------|      |---------------------|      |                     |    |");
		System.out.println("  |    |  Ram : 6GB          |      |  Ram : 6GB          |      |  Ram : 12GB         |      |  Ram : 12GB         |      |                     |    |");
		System.out.println("  |    |  Rom : 128GB        |      |  Rom : 128GB        |      |  Rom : 128GB        |      |  Rom : 128GB        |      |                     |    |");
		System.out.println("  |    |  Front Camera : 32mp|      |  Front Camera : 60mp|      |  Front Camera : 60mp|      |  Front Camera : 60mp|      |                     |    |");
		System.out.println("  |    |  Back Camera : 100mp|      |  Rear Camera : 120mp|      |  Rear Camera : 200mp|      |  Rear Camera : 300mp|      |                     |    |");
		System.out.println("  |    |  Battery : 6000mah  |      |  Battery : 6000mah  |      |  Battery : 6000mah  |      |  Battery : 6000mah  |      |        EXIT         |    |");
		System.out.println("  |    |  Charger : 30w      |      |  Charger : 25w      |      |  Charger : 20w      |      |  Charger : 35w      |      |     ----------      |    |");
		System.out.println("  |    |  Size : 167.5mm     |      |  Size : 165.5mm     |      |  Size    : 165.5mm  |      |  Size    : 168.5mm  |      |                     |    |");
		System.out.println("  |    |  Display : Full HD  |      |  Display : Full HD  |      |  Display : Full HD  |      |  Display : Full HD  |      |                     |    |");
		System.out.println("  |    |  Processor : SD 888 |      |  Processor : SD 888+|      |  Processor : SD 888 |      |  Processor : SD 8GEN|      |                     |    |");
		System.out.println("  |    |  PRICE : Rs58199/-  |      |  PRICE : Rs58399/-  |      |  PRICE : Rs68499/-  |      |  PRICE : Rs68999/-  |      |                     |    |");  
		System.out.println("  |    |_____________________|      |_____________________|      |_____________________|      |_____________________|      |_____________________|    |");
		System.out.println("  |                                                                                                                                                   |");
		System.out.println("  |             6.                            7.                           8.                           9.                            10.             |");
		System.out.println("  |___________________________________________________________________________________________________________________________________________________|");
		 System.out.println(RESET);samsung4();
	}
	public static void samsung4()
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
						   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SAMSUNG S22";ob1[i++]= 56499; 
						   System.out.println("Do you want to continue in this budget (Above 50k) [y/n or Y/N] :");  //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':samsung4Display(); b=false; break; //CHUSKO KANNA
							   case 'n':samsung(); b=false; break;
							   default : System.out.print("Please enter valid option: ");
							   }
						   }while(b==true);b=false; break;
						   case 'n':
						   {
							   System.out.print("Do you want to see another model in this budget (Above 50k) [y/n or Y/N]:");   //CHUSKO KANNA
							   do
							   {
								   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
								   switch(c1)	
								   {
								   case 'y':samsung4Display(); b=false; break; //CHUSKO KANNA
								   case 'n':{
									   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
									   do 
									   {
										   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
										   switch(c2)
										   {
										   case 'y': samsung(); b=false; break;
										   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SAMSUNG Z FLIP";ob1[i++]= 56999; 
					   System.out.println("Do you want to continue in this budget (Above 50k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':samsung4Display(); b=false; break; //CHUSKO KANNA
						   case 'n':samsung(); b=false; break;
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Above 50k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':samsung4Display(); b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': samsung(); b=false; break;
									   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SAMSUNG 21 PLUS";ob1[i++]= 57499; 
					   System.out.println("Do you want to continue in this budget (Above 50k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':samsung4Display(); b=false; break; //CHUSKO KANNA
						   case 'n':samsung(); b=false; break;
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Above 50k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':samsung4Display();b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': samsung(); b=false; break;
									   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SAMSUNG S22 PLUS";ob1[i++]= 57799; 
					   System.out.println("Do you want to continue in this budget (Above 50k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':samsung4Display(); b=false; break; //CHUSKO KANNA
						   case 'n':samsung(); b=false; break;
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Above 50k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':samsung4Display();; b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': samsung(); b=false; break;
									   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SAMSUNG S23 5G";ob1[i++]= 57999; 
					   System.out.println("Do you want to continue in this budget (Above 50k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':samsung4Display(); b=false; break; //CHUSKO KANNA
						   case 'n':samsung(); b=false; break;
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Above 50k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':samsung4Display(); b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': samsung(); b=false; break;
									   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SAMSUNG S22 ULTRA";ob1[i++]= 58199; 
					   System.out.println("Do you want to continue in this budget (Above 50k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':samsung4Display();b=false; break; //CHUSKO KANNA
						   case 'n':samsung(); b=false; break;
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Above 50k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':samsung4Display(); b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': samsung(); b=false; break;
									   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SAMSUNG S23 PLUS";ob1[i++]= 58399; 
					   System.out.println("Do you want to continue in this budget (Above 50k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':samsung4Display(); b=false; break; //CHUSKO KANNA
						   case 'n':samsung(); b=false; break;
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Above 50k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':samsung4Display(); b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': samsung(); b=false; break;
									   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SAMSUNG Z FLIP";ob1[i++]= 68499; 
					   System.out.println("Do you want to continue in this budget (Above 50k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':samsung4Display(); b=false; break; //CHUSKO KANNA
						   case 'n':samsung(); b=false; break;
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Above 50k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':samsung4Display(); b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': samsung(); b=false; break;
									   case 'n': display(); b=false; break;
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
			   case 9:
			   {
				   System.out.print("Do you want to add it to cart [y/n or Y/N]:"); //CHUSKO KANNA
				   do
				   {
					   char c=sc.next().toLowerCase().charAt(0);           //CHUSKO KANNA
					   switch(c)
					   {
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SAMSUNG S23 PRO";ob1[i++]= 68999; 
					   System.out.println("Do you want to continue in this budget (Above 50k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':samsung4Display();b=false; break; //CHUSKO KANNA
						   case 'n':samsung(); b=false; break;
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Above 50k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':samsung4Display(); b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': samsung(); b=false; break;
									   case 'n': display(); b=false; break;
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
				   case 10:samsung(); b=false; break;
				   default: System.out.print("PLEASE ENTER VALID OPTION: ");
				   }
			}while(b==true);
	}
	public static void apple()
	{ System.out.println(RESET);
		 System.out.println("\t\t\t\t\t\t"+"                         APPLE                         ");  
		 System.out.println("\t\t\t\t\t\t"+"                      -------------                      ");  
		 System.out.println("\t\t\t\t\t\t"+"                      1.Below 70k                         ");  
		 System.out.println("\t\t\t\t\t\t"+"                      2.Above 70k                    ");
		 System.out.println("\t\t\t\t\t\t"+"                      3.EXIT FROM APPLE                   "); 
        System.out.print("SELECT PRICE RANGE : "); System.out.println(RESET);
	    do
		 {
			int p=sc.nextInt();
			switch(p) 
			{
			case 1: apple1Display();; b=false; break;
			case 2: apple2Display(); b=false; break;
			case 3: display();b=false; break;
		    default:
		    	{
		    		System.out.println("Please enter valid option.");
		    		apple(); 
		    	}
			}
		 }while(b==true);
	}
	public static void apple1Display()
	{ System.out.println(RESET);
	    	System.out.println("   ___________________________________________________________________________________________________________________________________________________");
		    System.out.println("  |                                                                                                                                                   |");
		    System.out.println("  |     _____________________        _____________________        _____________________        _____________________        _____________________     |");
			System.out.println("  |    |      IPHONE 12      |      |     IPHONE 12 Mini  |      |     IPHONE 12 Pro   |      |    IPHONE 13 Mini   |      |                     |    |");
			System.out.println("  |    |---------------------|      |---------------------|      |---------------------|      |---------------------|      |                     |    |");
			System.out.println("  |    |  Ram : 6GB          |      |  Ram : 6GB          |      |  Ram : 6GB          |      |  Ram : 8GB          |      |                     |    |");
			System.out.println("  |    |  Rom : 64GB         |      |  Rom : 128GB        |      |  Rom : 128GB        |      |  Rom : 128GB        |      |                     |    |");
			System.out.println("  |    |  Front Camera : 12mp|      |  Front Camera : 12mp|      |  Front Camera : 12mp|      |  Front Camera : 12mp|      |                     |    |");
			System.out.println("  |    |  Back Camera : 32mp |      |  Rear Camera : 32mp |      |  Rear Camera : 12mp |      |  Rear Camera : 12mp |      |                     |    |");
			System.out.println("  |    |  Battery : 5000mah  |      |  Battery : 5500mah  |      |  Battery : 5000mah  |      |  Battery : 5500mah  |      |                     |    |");
			System.out.println("  |    |  Charger : 10v      |      |  Charger : 10v      |      |  Charger : 15v      |      |  Charger : 15v      |      |        EXIT         |    |");
			System.out.println("  |    |  Size    : 165.5mm  |      |  Size    : 165.5mm  |      |  Size    : 165.5mm  |      |  Size : 165.5mm     |      |      ---------      |    |");
			System.out.println("  |    |  Display : Full HD  |      |  Display : Full HD  |      |  Display : Full HD  |      |  Display : Full HD  |      |                     |    |");
			System.out.println("  |    |  Processor : A13    |      |  Processor : A13    |      |  Processor : A13    |      |  Processor : A14    |      |                     |    |");
			System.out.println("  |    |  PRICE : Rs39999/-  |      |  PRICE : Rs44499/-  |      |  PRICE : Rs53499/-  |      |  PRICE : Rs55499/-  |      |                     |    |");  
			System.out.println("  |    |_____________________|      |_____________________|      |_____________________|      |_____________________|      |_____________________|    |");
			System.out.println("  |                                                                                                                                                   |");
			System.out.println("  |             1.                            2.                           3.                           4.                            5.              |");
			System.out.println("  |___________________________________________________________________________________________________________________________________________________|");
			 System.out.println(RESET);	apple1();
	}
	public static void apple1()
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
						   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="IPHONE 12";ob1[i++]= 39999; 
						   System.out.println("Do you want to continue in this budget (Below 70k) [y/n or Y/N] :");  //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':apple1Display(); b=false; break; //CHUSKO KANNA
							   case 'n':apple(); b=false; break;                                   //CHUSKO ANNA
							   default : System.out.print("Please enter valid option: ");
							   }
						   }while(b==true);b=false; break;
						   case 'n':
						   {
							   System.out.print("Do you want to see another model in this budget (Below 70k) [y/n or Y/N]:");   //CHUSKO KANNA
							   do
							   {
								   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
								   switch(c1)	
								   {
								   case 'y':apple1Display(); b=false; break; //CHUSKO KANNA
								   case 'n':{
									   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
									   do 
									   {
										   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
										   switch(c2)
										   {
										   case 'y': apple(); b=false; break; // CHUSKO ANNA BRANDS MARCHALI
										   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="APPLE 12 MINI";ob1[i++]= 44499; 
					   System.out.println("Do you want to continue in this budget (Below 70k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':apple1Display(); b=false; break; //CHUSKO KANNA
						   case 'n':apple(); b=false; break;                                   //CHUSKO ANNA
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Below 70k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':apple1Display(); b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': apple(); b=false; break; // CHUSKO ANNA BRANDS MARCHALI
									   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="IPHONE 12 PRO";ob1[i++]= 53499; 
					   System.out.println("Do you want to continue in this budget (Below 70k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':apple1Display(); b=false; break; //CHUSKO KANNA
						   case 'n':apple(); b=false; break;                                   //CHUSKO ANNA
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Below 70k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':apple1Display(); b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': apple(); b=false; break; // CHUSKO ANNA BRANDS MARCHALI
									   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="IPHONE 13 MINI";ob1[i++]= 55499; 
					   System.out.println("Do you want to continue in this budget (Below 70k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':apple1Display();; b=false; break; //CHUSKO KANNA
						   case 'n':apple(); b=false; break;                                   //CHUSKO ANNA
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Below 70k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':apple1Display(); b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': apple(); b=false; break; // CHUSKO ANNA BRANDS MARCHALI
									   case 'n': display(); b=false; break;
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
			   	case 5:apple(); b=false; break; //CHUSKO KANNA
				   default: System.out.print("PLEASE ENTER VALID OPTION: ");
				   }
			}while(b==true);
	}
	public static void apple2Display()
	{ System.out.println(RESET);
		    System.out.println("   ___________________________________________________________________________________________________________________________________________________");
	        System.out.println("  |                                                                                                                                                   |");
	        System.out.println("  |     _____________________        _____________________        _____________________        _____________________        _____________________     |");
			System.out.println("  |    |  IPHONE 13 Pro      |      |   IPHONE 13 Pro Max |      |     IPHONE 14 Pro   |      |   IPHONE 14 Mini    |      |                     |    |");
			System.out.println("  |    |---------------------|      |---------------------|      |---------------------|      |---------------------|      |                     |    |");
			System.out.println("  |    |  Ram : 6GB          |      |  Ram : 6GB          |      |  Ram : 6GB          |      |  Ram : 8GB          |      |                     |    |");
			System.out.println("  |    |  Rom : 64GB         |      |  Rom : 128GB        |      |  Rom : 128GB        |      |  Rom : 128GB        |      |                     |    |");
			System.out.println("  |    |  Front Camera : 12mp|      |  Front Camera : 12mp|      |  Front Camera : 12mp|      |  Front Camera : 12mp|      |                     |    |");
			System.out.println("  |    |  Back Camera : 48mp |      |  Rear Camera : 48mp |      |  Rear Camera : 48mp |      |  Rear Camera : 48mp |      |                     |    |");
			System.out.println("  |    |  Battery : 5000mah  |      |  Battery : 5500mah  |      |  Battery : 5000mah  |      |  Battery : 5500mah  |      |        EXIT         |    |");
			System.out.println("  |    |  Charger : 10v      |      |  Charger : 10v      |      |  Charger : 15v      |      |  Charger : 15v      |      |      ---------      |    |");
			System.out.println("  |    |  Size    : 165.5mm  |      |  Size    : 165.5mm  |      |  Size    : 165.5mm  |      |  Size    : 165.5mm  |      |                     |    |");
			System.out.println("  |    |  Display : Full HD  |      |  Display : Full HD  |      |  Display : Full HD  |      |  Display : Full HD  |      |                     |    |");
			System.out.println("  |    |  Processor : A14    |      |  Processor : A15    |      |  Processor : A15    |      |  Processor : A15    |      |                     |    |");
			System.out.println("  |    |  PRICE : Rs139999/- |      |  PRICE : Rs144499/- |      |  PRICE : Rs153499/- |      |  PRICE : Rs155499/- |      |                     |    |");  
			System.out.println("  |    |_____________________|      |_____________________|      |_____________________|      |_____________________|      |_____________________|    |");
			System.out.println("  |                                                                                                                                                   |");
			System.out.println("  |             1.                            2.                           3.                           4.                            5.              |");
			System.out.println("  |___________________________________________________________________________________________________________________________________________________|");
			 System.out.println(RESET);apple2();
	}
	public static void apple2()
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
						   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="IPHONE 13 PRO";ob1[i++]= 139999; 
						   System.out.println("Do you want to continue in this budget (Above 70k) [y/n or Y/N] :");  //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':apple2Display(); b=false; break; //CHUSKO KANNA
							   case 'n':apple(); b=false; break;                                   //CHUSKO ANNA
							   default : System.out.print("Please enter valid option: ");
							   }
						   }while(b==true);b=false; break;
						   case 'n':
						   {
							   System.out.print("Do you want to see another model in this budget (Above 70k) [y/n or Y/N]:");   //CHUSKO KANNA
							   do
							   {
								   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
								   switch(c1)	
								   {
								   case 'y':apple2Display(); b=false; break; //CHUSKO KANNA
								   case 'n':{
									   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
									   do 
									   {
										   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
										   switch(c2)
										   {
										   case 'y': apple(); b=false; break; // CHUSKO ANNA BRANDS MARCHALI
										   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="IPHONE 13 PRO MAX";ob1[i++]= 144499; 
					   System.out.println("Do you want to continue in this budget (Above 70k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':apple2Display(); b=false; break; //CHUSKO KANNA
						   case 'n':apple(); b=false; break;                                   //CHUSKO ANNA
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Above 70k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':apple2Display();b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': apple(); b=false; break; // CHUSKO ANNA BRANDS MARCHALI
									   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="IPHONE 14 PRO";ob1[i++]= 153499; 
					   System.out.println("Do you want to continue in this budget (Above 70k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':apple2Display(); b=false; break; //CHUSKO KANNA
						   case 'n':apple(); b=false; break;                                   //CHUSKO ANNA
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Above 70k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':apple2Display(); b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': apple(); b=false; break; // CHUSKO ANNA BRANDS MARCHALI
									   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="IPHONE 14 MINI";ob1[i++]= 155499; 
					   System.out.println("Do you want to continue in this budget (Above 70k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':apple2Display();; b=false; break; //CHUSKO KANNA
						   case 'n':apple(); b=false; break;                                   //CHUSKO ANNA
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Above 70k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':apple2Display(); b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': apple(); b=false; break; // CHUSKO ANNA BRANDS MARCHALI
									   case 'n': display(); b=false; break;
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
			   	case 5:apple(); b=false; break; //CHUSKO KANNA
				   default: System.out.print("PLEASE ENTER VALID OPTION: ");
				   }
			}while(b==true);
	}
	public static void xioami()
	{
		 System.out.println(RESET);
		 System.out.println("\t\t\t\t\t\t"+"                         XIOAMI                         ");  
		 System.out.println("\t\t\t\t\t\t"+"                      -------------                      ");  
		 System.out.println("\t\t\t\t\t\t"+"                      1.Below 10k                         ");  
		 System.out.println("\t\t\t\t\t\t"+"                      2.Between 10k - 25k                    ");
		 System.out.println("\t\t\t\t\t\t"+"                      3.Above 25k                    ");
		 System.out.println("\t\t\t\t\t\t"+"                      4.EXIT FROM XIOAMI                   "); 
	     System.out.print("SELECT PRICE RANGE : "); System.out.println(RESET);
		   do
			 {
				int p=sc.nextInt();
				switch(p) 
				{
				case 1: xioami1Display();; b=false; break;
				case 2: xioami2Display();; b=false; break;
				case 3: xioami3Display();;b=false; break;
				case 4: display();b=false; break;
			    default:
			    	{
			    		System.out.println("Please enter valid option.");
			    		xioami();
			    	}
				}
			 }while(b==true);
	}
	
	public static void xioami1Display()
	{ System.out.println(RESET);
			System.out.println("   ___________________________________________________________________________________________________________________________________________________");
			System.out.println("  |                                                                                                                                                   |");
			System.out.println("  |     _____________________        _____________________        _____________________        _____________________        _____________________     |");
			System.out.println("  |    |      REDMI 9A       |      |    REDMI AI PLUS    |      |     REDMI 10A       |      |      REDMI 9I       |      |                     |    |");
			System.out.println("  |    |---------------------|      |---------------------|      |---------------------|      |---------------------|      |                     |    |");
			System.out.println("  |    |  Ram : 3GB          |      |  Ram : 3GB          |      |  Ram : 4GB          |      |  Ram : 4GB          |      |                     |    |");
			System.out.println("  |    |  Rom : 64GB         |      |  Rom : 128GB        |      |  Rom : 128GB        |      |  Rom : 128GB        |      |                     |    |");
			System.out.println("  |    |  Front Camera : 13mp|      |  Front Camera : 08mp|      |  Front Camera : 5mp |      |  Front Camera : 2mp |      |                     |    |");
			System.out.println("  |    |  Back Camera : 48mp |      |  Rear Camera : 13mp |      |  Rear Camera : 15mp |      |  Rear Camera : 10mp |      |                     |    |");
			System.out.println("  |    |  Battery : 5000mah  |      |  Battery : 5500mah  |      |  Battery : 5000mah  |      |  Battery : 5500mah  |      |        EXIT         |    |");
			System.out.println("  |    |  Charger : 10v      |      |  Charger : 10v      |      |  Charger : 15v      |      |  Charger : 15v      |      |      ---------      |    |");
			System.out.println("  |    |  Size    : 165.5mm  |      |  Size    : 165.5mm  |      |  Size    : 165.5mm  |      |  Size    : 165.5mm  |      |                     |    |");
			System.out.println("  |    |  Display : Full Hd  |      |  Display : Full Sd  |      |  Display : Full Sd  |      |  Display : Full Hd  |      |                     |    |");
			System.out.println("  |    |  Processor : 1.5    |      |  Processor : 1.7    |      |  Processor : 1.7    |      |  Processor : 1.5    |      |                     |    |");
			System.out.println("  |    |      GHz Octa-Core  |      |      GHz Octa-Core  |      |     GHz Octa-Core   |      |     GHz Octa-Core   |      |                     |    |");
			System.out.println("  |    |  PRICE : Rs7999/-   |      |  PRICE : Rs7499/-   |      |  PRICE : Rs8499/-   |      |  PRICE : Rs8999/-   |      |                     |    |");  
			System.out.println("  |    |_____________________|      |_____________________|      |_____________________|      |_____________________|      |_____________________|    |");
			System.out.println("  |                                                                                                                                                   |");
			System.out.println("  |             1.                            2.                           3.                           4.                            5.              |");
			System.out.println("  |___________________________________________________________________________________________________________________________________________________|");
			 System.out.println(RESET);	xioami1();
	}
	public static void xioami1()
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
						   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="REDMI 9A";ob1[i++]= 7999; 
						   System.out.println("Do you want to continue in this budget (Below 10k) [y/n or Y/N] :");  //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':xioami1Display(); b=false; break; //CHUSKO KANNA
							   case 'n':xioami(); b=false; break;                                   //CHUSKO ANNA
							   default : System.out.print("Please enter valid option: ");
							   }
						   }while(b==true);b=false; break;
						   case 'n':
						   {
							   System.out.print("Do you want to see another model in this budget (Below 10k) [y/n or Y/N]:");   //CHUSKO KANNA
							   do
							   {
								   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
								   switch(c1)	
								   {
								   case 'y':xioami1Display(); b=false; break; //CHUSKO KANNA
								   case 'n':{
									   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
									   do 
									   {
										   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
										   switch(c2)
										   {
										   case 'y': xioami(); b=false; break; // CHUSKO ANNA BRANDS MARCHALI
										   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="REDMI AI PLUS";ob1[i++]= 7499; 
					   System.out.println("Do you want to continue in this budget (Below 10k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':xioami1Display(); b=false; break; //CHUSKO KANNA
						   case 'n':xioami(); b=false; break;                                   //CHUSKO ANNA
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Below 10k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':xioami1Display(); b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': xioami(); b=false; break; // CHUSKO ANNA BRANDS MARCHALI
									   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="REDMI 10A";ob1[i++]= 8499; 
					   System.out.println("Do you want to continue in this budget (Below 10k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':xioami1Display(); b=false; break; //CHUSKO KANNA
						   case 'n':xioami(); b=false; break;                                   //CHUSKO ANNA
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Below 10k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':xioami1Display(); b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': xioami(); b=false; break; // CHUSKO ANNA BRANDS MARCHALI
									   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="REDMI 9I";ob1[i++]= 8999; 
					   System.out.println("Do you want to continue in this budget (Below 10k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':xioami1Display(); b=false; break; //CHUSKO KANNA
						   case 'n':xioami(); b=false; break;                                   //CHUSKO ANNA
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Below 10k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':xioami1Display(); b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': xioami(); b=false; break; // CHUSKO ANNA BRANDS MARCHALI
									   case 'n': display(); b=false; break;
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
			   	case 5:xioami(); b=false; break; //CHUSKO KANNA
				   default: System.out.print("PLEASE ENTER VALID OPTION: ");
				   }
			}while(b==true);
	}
	public static void xioami2Display()
	{ System.out.println(RESET);
		    System.out.println("   ___________________________________________________________________________________________________________________________________________________");
		    System.out.println("  |                                                                                                                                                   |");
		    System.out.println("  |     _____________________        _____________________        _____________________        _____________________        _____________________     |");
			System.out.println("  |    |  REDMI 11 PRIME 5G  |      |  REDMI NOTE 10T 5G  |      |  REDMI 10I          |      |  REDMI 11T          |      |  REDMI NOTE 12      |    |");
			System.out.println("  |    |---------------------|      |---------------------|      |---------------------|      |---------------------|      |---------------------|    |");
			System.out.println("  |    |  Ram : 2GB          |      |  Ram : 2GB          |      |  Ram : 2GB          |      |  Ram : 2GB          |      |  Ram : 2GB          |    |");
			System.out.println("  |    |  Rom : 16GB         |      |  Rom : 16GB         |      |  Rom : 16GB         |      |  Rom : 16GB         |      |  Rom : 16GB         |    |");
			System.out.println("  |    |  Front Camera : 16mp|      |  Front Camera : 16mp|      |  Front Camera : 16mp|      |  Front Camera : 16mp|      |  Front Camera : 16mp|    |");
			System.out.println("  |    |  Back Camera : 32mp |      |  Rear Camera : 32mp |      |  Rear Camera : 32mp |      |  Rear Camera : 32mp |      |  Rear Camera : 32mp |    |");
			System.out.println("  |    |  Battery : 3000mah  |      |  Battery : 3000mah  |      |  Battery : 3500mah  |      |  Battery : 4000mah  |      |  Battery : 4000mah  |    |");
			System.out.println("  |    |  Charger : 5v       |      |  Charger : 5v       |      |  Charger : 5v       |      |  Charger : 5v       |      |  Charger : 5v       |    |");
			System.out.println("  |    |  Size    : 165.5mm  |      |  Size    : 165.5mm  |      |  Size    : 165.5mm  |      |  Size    : 165.5mm  |      |  Size    : 165.5mm  |    |");
			System.out.println("  |    |  Display : Full Hd  |      |  Display : Full Hd  |      |  Display : Full Hd  |      |  Display : Full Hd  |      |  Display : Full Hd  |    |");
			System.out.println("  |    |  Processor : 1.6    |      |  Processor : 1.7    |      |  Processor : 1.7    |      |  Processor : 1.7    |      |  Processor : 1.6    |    |");
			System.out.println("  |    |      GHz Octa-Core  |      |      GHz Octa-Core  |      |     GHz Octa-Core   |      |     GHz Octa-Core   |      |     GHz Octa-Core   |    |");
			System.out.println("  |    |  PRICE : Rs12499/-  |      |  PRICE : Rs13999/-  |      |  PRICE : Rs14499/-  |      |  PRICE : Rs15799/-  |      |  PRICE : Rs16999/-  |    |");  
			System.out.println("  |    |_____________________|      |_____________________|      |_____________________|      |_____________________|      |_____________________|    |");
			System.out.println("  |                                                                                                                                                   |");
			System.out.println("  |              1.                           2.                           3.                            4.                          5.               |");
			System.out.println("  |     _____________________        _____________________        _____________________        _____________________        _____________________     |");
			System.out.println("  |    |  REDMI NOTE 11 PRO  |      |  REDMI 11 LITE NE 5G|      |  REDMI K50I         |      |  REDMI 12 PRO 5G    |      |                     |    |");
			System.out.println("  |    |---------------------|      |---------------------|      |---------------------|      |---------------------|      |                     |    |");
			System.out.println("  |    |  Ram : 2GB          |      |  Ram : 2GB          |      |  Ram : 2GB          |      |  Ram : 4GB          |      |                     |    |");
			System.out.println("  |    |  Rom : 16GB         |      |  Rom : 16GB         |      |  Rom : 16GB         |      |  Rom : 64GB         |      |                     |    |");
			System.out.println("  |    |  Front Camera : 16mp|      |  Front Camera : 16mp|      |  Front Camera : 16mp|      |  Front Camera : 16mp|      |                     |    |");
			System.out.println("  |    |  Back Camera : 32mp |      |  Rear Camera : 32mp |      |  Rear Camera : 32mp |      |  Rear Camera : 32mp |      |                     |    |");
			System.out.println("  |    |  Battery : 3000mah  |      |  Battery : 3000mah  |      |  Battery : 3000mah  |      |  Battery : 3900mah  |      |         EXIT        |    |");
			System.out.println("  |    |  Charger : 5v       |      |  Charger : 5v       |      |  Charger : 7v       |      |  Charger : 5v       |      |       --------      |    |");
			System.out.println("  |    |  Size    : 165.5mm  |      |  Size    : 165.5mm  |      |  Size    : 165.5mm  |      |  Size    : 165.5mm  |      |                     |    |");
			System.out.println("  |    |  Display : Full Hd  |      |  Display : Full Hd  |      |  Display : Full Hd  |      |  Display : Full Hd  |      |                     |    |");
			System.out.println("  |    |  Processor : 1.6    |      |  Processor : 1.7    |      |  Processor : 1.7    |      |  Processor : 1.7    |      |                     |    |");
			System.out.println("  |    |      GHz Octa-Core  |      |      GHz Octa-Core  |      |     GHz Octa-Core   |      |     GHz Octa-Core   |      |                     |    |");
			System.out.println("  |    |  PRICE : Rs17199/-  |      |  PRICE : Rs18399/-  |      |  PRICE : Rs18499/-  |      |  PRICE : Rs19999/-  |      |                     |    |");  
			System.out.println("  |    |_____________________|      |_____________________|      |_____________________|      |_____________________|      |_____________________|    |");
			System.out.println("  |                                                                                                                                                   |");
			System.out.println("  |             6.                            7.                           8.                           9.                            10.             |");
			System.out.println("  |___________________________________________________________________________________________________________________________________________________|");
			 System.out.println(RESET);xioami2();
	}
	public static void xioami2()
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
						   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="REDMI 11 PRIME 5G";ob1[i++]= 12499; 
						   System.out.println("Do you want to continue in this budget (Between 10k - 25k) [y/n or Y/N] :");  //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':xioami2Display(); b=false; break; //CHUSKO KANNA
							   case 'n':xioami(); b=false; break;                                   //CHUSKO ANNA
							   default : System.out.print("Please enter valid option: ");
							   }
						   }while(b==true);b=false; break;
						   case 'n':
						   {
							   System.out.print("Do you want to see another model in this budget (Between 10k - 25k) [y/n or Y/N]:");   //CHUSKO KANNA
							   do
							   {
								   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
								   switch(c1)	
								   {
								   case 'y':xioami2Display(); b=false; break; //CHUSKO KANNA
								   case 'n':{
									   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
									   do 
									   {
										   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
										   switch(c2)
										   {
										   case 'y': xioami(); b=false; break; // CHUSKO ANNA BRANDS MARCHALI
										   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="REDMI NOTE 10T 5G";ob1[i++]= 13999; 
					   System.out.println("Do you want to continue in this budget (Between 10k - 25k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':xioami2Display(); b=false; break; //CHUSKO KANNA
						   case 'n':xioami(); b=false; break;                                   //CHUSKO ANNA
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Between 10k - 25k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':xioami2Display(); b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': xioami(); b=false; break; // CHUSKO ANNA BRANDS MARCHALI
									   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="REDMI 10I";ob1[i++]= 14499; 
					   System.out.println("Do you want to continue in this budget (Between 10k - 25k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':xioami2Display(); b=false; break; //CHUSKO KANNA
						   case 'n':xioami(); b=false; break;                                   //CHUSKO ANNA
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Between 10k - 25k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':xioami2Display(); b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': xioami(); b=false; break; // CHUSKO ANNA BRANDS MARCHALI
									   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="REDMI 11T";ob1[i++]= 15799; 
					   System.out.println("Do you want to continue in this budget (Between 10k - 25k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':xioami2Display(); b=false; break; //CHUSKO KANNA
						   case 'n':xioami(); b=false; break;                                   //CHUSKO ANNA
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Between 10k - 25k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':xioami2Display(); b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': xioami(); b=false; break; // CHUSKO ANNA BRANDS MARCHALI
									   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="REDMI NOTE 12";ob1[i++]= 16999; 
					   System.out.println("Do you want to continue in this budget (Between 10k - 25k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':xioami2Display(); b=false; break; //CHUSKO KANNA
						   case 'n':xioami(); b=false; break;                                   //CHUSKO ANNA
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Between 10k - 25k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':xioami2Display(); b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': xioami(); b=false; break; // CHUSKO ANNA BRANDS MARCHALI
									   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="REDMI NOTE 11 PRO";ob1[i++]= 17199; 
					   System.out.println("Do you want to continue in this budget (Between 10k - 25k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':xioami2Display(); b=false; break; //CHUSKO KANNA
						   case 'n':xioami(); b=false; break;                                   //CHUSKO ANNA
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Between 10k - 25k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':xioami2Display(); b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': xioami(); b=false; break; // CHUSKO ANNA BRANDS MARCHALI
									   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="REDMI 11 LITE NE 5G";ob1[i++]= 18399; 
					   System.out.println("Do you want to continue in this budget (Between 10k - 25k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':xioami2Display(); b=false; break; //CHUSKO KANNA
						   case 'n':xioami(); b=false; break;                                   //CHUSKO ANNA
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Between 10k - 25k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':xioami2Display(); b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': xioami(); b=false; break; // CHUSKO ANNA BRANDS MARCHALI
									   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="REDMI K50I";ob1[i++]= 18499; 
					   System.out.println("Do you want to continue in this budget (Between 10k - 25k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':xioami2Display(); b=false; break; //CHUSKO KANNA
						   case 'n':xioami(); b=false; break;                                   //CHUSKO ANNA
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Between 10k - 25k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':xioami2Display(); b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': xioami(); b=false; break; // CHUSKO ANNA BRANDS MARCHALI
									   case 'n': display(); b=false; break;
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
			   case 9:
			   {
				   System.out.print("Do you want to add it to cart [y/n or Y/N]:"); //CHUSKO KANNA
				   do
				   {
					   char c=sc.next().toLowerCase().charAt(0);           //CHUSKO KANNA
					   switch(c)
					   {
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="REDMI 12 PRO 5G";ob1[i++]= 19999; 
					   System.out.println("Do you want to continue in this budget (Between 10k - 25k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':xioami2Display(); b=false; break; //CHUSKO KANNA
						   case 'n':xioami(); b=false; break;                                   //CHUSKO ANNA
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Between 10k - 25k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':xioami2Display(); b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': xioami(); b=false; break; // CHUSKO ANNA BRANDS MARCHALI
									   case 'n': display(); b=false; break;
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
			   	case 10:xioami(); b=false; break; //CHUSKO KANNA
				   default: System.out.print("PLEASE ENTER VALID OPTION: ");
				   }
			}while(b==true);
	}
	
	public static void xioami3Display()
	{
		 System.out.println(RESET);
			System.out.println("   ___________________________________________________________________________________________________________________________________________________");
		    System.out.println("  |                                                                                                                                                   |");
			System.out.println("  |     _____________________        _____________________        _____________________        _____________________        _____________________     |");
			System.out.println("  |    |  REDMI NOTE 15 PRO  |      |     REDMI K70I      |      |  REDMI NOTE 19 PRO  |      |  REDMI 13T PRO      |      |                     |    |");
			System.out.println("  |    |---------------------|      |---------------------|      |---------------------|      |---------------------|      |                     |    |");
			System.out.println("  |    |  Ram : 6GB          |      |  Ram : 6GB          |      |  Ram : 6GB          |      |  Ram : 8GB          |      |                     |    |");
			System.out.println("  |    |  Rom : 64GB         |      |  Rom : 128GB        |      |  Rom : 128GB        |      |  Rom : 128GB        |      |                     |    |");
			System.out.println("  |    |  Front Camera : 64mp|      |  Front Camera : 64mp|      |  Front Camera : 32mp|      |  Front Camera : 64mp|      |                     |    |");
			System.out.println("  |    |  Back Camera : 100mp|      |  Rear Camera : 100mp|      |  Rear Camera : 150mp|      |  Rear Camera : 100mp|      |                     |    |");
			System.out.println("  |    |  Battery : 5000mah  |      |  Battery : 5500mah  |      |  Battery : 5000mah  |      |  Battery : 5500mah  |      |        EXIT         |    |");
			System.out.println("  |    |  Charger : 10v      |      |  Charger : 10v      |      |  Charger : 15v      |      |  Charger : 15v      |      |      --------       |    |");
			System.out.println("  |    |  Size    : 165.5mm  |      |  Size    : 165.5mm  |      |  Size    : 165.5mm  |      |  Size    : 165.5mm  |      |                     |    |");
			System.out.println("  |    |  Display : Full Sd  |      |  Display : Full Sd  |      |  Display : Full Sd  |      |  Display : Full Sd  |      |                     |    |");
			System.out.println("  |    |  Processor : 6.5    |      |  Processor : 6.7    |      |  Processor : 9.0    |      |  Processor : 10.5   |      |                     |    |");
			System.out.println("  |    |      GHz Octa-Core  |      |      GHz Octa-Core  |      |     GHz Octa-Core   |      |     GHz Octa-Core   |      |                     |    |");
			System.out.println("  |    |  PRICE : Rs27999/-  |      |  PRICE : Rs28499/-  |      |  PRICE : Rs29499/-  |      |  PRICE : Rs32499/-  |      |                     |    |");  
			System.out.println("  |    |_____________________|      |_____________________|      |_____________________|      |_____________________|      |_____________________|    |");
			System.out.println("  |                                                                                                                                                   |");
			System.out.println("  |             1.                            2.                           3.                           4.                            5.              |");
			System.out.println("  |___________________________________________________________________________________________________________________________________________________|");
			 System.out.println(RESET);	xioami3();
			
	}
	public static void xioami3()
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
						   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="REDMI NOTE 15 PRO";ob1[i++]= 27999; 
						   System.out.println("Do you want to continue in this budget (Above 25k) [y/n or Y/N] :");  //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':xioami3Display(); b=false; break; //CHUSKO KANNA
							   case 'n':xioami(); b=false; break;                                   //CHUSKO ANNA
							   default : System.out.print("Please enter valid option: ");
							   }
						   }while(b==true);b=false; break;
						   case 'n':
						   {
							   System.out.print("Do you want to see another model in this budget (Above 25k) [y/n or Y/N]:");   //CHUSKO KANNA
							   do
							   {
								   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
								   switch(c1)	
								   {
								   case 'y':xioami3Display(); b=false; break; //CHUSKO KANNA
								   case 'n':{
									   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
									   do 
									   {
										   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
										   switch(c2)
										   {
										   case 'y': xioami(); b=false; break; // CHUSKO ANNA BRANDS MARCHALI
										   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="REDMI K70I";ob1[i++]= 28499; 
					   System.out.println("Do you want to continue in this budget (Above 25k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':xioami3Display(); b=false; break; //CHUSKO KANNA
						   case 'n':xioami(); b=false; break;                                   //CHUSKO ANNA
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Above 25k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':xioami3Display(); b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': xioami(); b=false; break; // CHUSKO ANNA BRANDS MARCHALI
									   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="REDMI NOTE 19 PRO";ob1[i++]= 29499; 
					   System.out.println("Do you want to continue in this budget (Above 25k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':xioami3Display(); b=false; break; //CHUSKO KANNA
						   case 'n':xioami(); b=false; break;                                   //CHUSKO ANNA
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Above 25k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':xioami3Display(); b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': xioami(); b=false; break; // CHUSKO ANNA BRANDS MARCHALI
									   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="REDMI 13T PRO";ob1[i++]= 32499; 
					   System.out.println("Do you want to continue in this budget (Above 25k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':xioami3Display(); b=false; break; //CHUSKO KANNA
						   case 'n':xioami(); b=false; break;                                   //CHUSKO ANNA
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Above 25k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':xioami3Display(); b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': xioami(); b=false; break; // CHUSKO ANNA BRANDS MARCHALI
									   case 'n': display(); b=false; break;
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
			   
			   	case 5:xioami(); b=false; break; //CHUSKO KANNA
				   default: System.out.print("PLEASE ENTER VALID OPTION: ");
				   }
			}while(b==true);
	}
	public static void vivo()
	{
		 System.out.println(RESET);
		 System.out.println("\t\t\t\t\t\t"+"                          VIVO                         ");  
		 System.out.println("\t\t\t\t\t\t"+"                      -------------                      ");  
		 System.out.println("\t\t\t\t\t\t"+"                      1.Below 10k                         ");  
		 System.out.println("\t\t\t\t\t\t"+"                      2.Between 10k - 25k                    ");
		 System.out.println("\t\t\t\t\t\t"+"                      3.Between 20k - 50k                    ");
		 System.out.println("\t\t\t\t\t\t"+"                      4.Above 50k                    ");
		 System.out.println("\t\t\t\t\t\t"+"                      5.EXIT FROM VIVO                   "); 
	     System.out.print("SELECT PRICE RANGE : "); System.out.println(RESET);
		do
		 {
			int p=sc.nextInt();
			switch(p) 
			{
			case 1: vivo1Display();; b=false; break;
			case 2: vivo2Display();; b=false; break;
			case 3: vivo3Display();;b=false; break;
			case 4: vivo4Display();;b=false; break;
			case 5: display();b=false; break;
		    default:
		    	{
		    		System.out.println("Please enter valid option.");
		    		vivo();;
		    	}
			}
		 }while(b==true);
	}
	
	public static void vivo1Display()
	{ System.out.println(RESET);
		System.out.println("   ___________________________________________________________________________________________________________________________________________________");
		System.out.println("  |                                                                                                                                                   |");
		System.out.println("  |     _____________________        _____________________        _____________________        _____________________        _____________________     |");
		System.out.println("  |    |      VIVO Y01       |      |      VIVO Y1S       |      |      VIVO 91I       |      |      VIVO U 10      |      |      VIVO Y02       |    |");
		System.out.println("  |    |---------------------|      |---------------------|      |---------------------|      |---------------------|      |---------------------|    |");
		System.out.println("  |    |  Ram : 2GB          |      |  Ram : 2GB          |      |  Ram : 2GB          |      |  Ram : 2GB          |      |  Ram : 2GB          |    |");
		System.out.println("  |    |  Rom : 16GB         |      |  Rom : 16GB         |      |  Rom : 16GB         |      |  Rom : 16GB         |      |  Rom : 16GB         |    |");
		System.out.println("  |    |  Front Camera : 16mp|      |  Front Camera : 16mp|      |  Front Camera : 16mp|      |  Front Camera : 16mp|      |  Front Camera : 16mp|    |");
		System.out.println("  |    |  Back Camera : 32mp |      |  Rear Camera : 32mp |      |  Rear Camera : 32mp |      |  Rear Camera : 32mp |      |  Rear Camera : 32mp |    |");
		System.out.println("  |    |  Battery : 3000mah  |      |  Battery : 3000mah  |      |  Battery : 3500mah  |      |  Battery : 4000mah  |      |  Battery : 4000mah  |    |");
		System.out.println("  |    |  Charger : 5v       |      |  Charger : 5v       |      |  Charger : 5v       |      |  Charger : 5v       |      |  Charger : 5v       |    |");
		System.out.println("  |    |  Size    : 165.5mm  |      |  Size    : 165.5mm  |      |  Size    : 165.5mm  |      |  Size    : 165.5mm  |      |  Size    : 165.5mm  |    |");
		System.out.println("  |    |  Display : Full Hd  |      |  Display : Full Hd  |      |  Display : Full Hd  |      |  Display : Full Hd  |      |  Display : Full Hd  |    |");
		System.out.println("  |    |  Processor : 1.6    |      |  Processor : 1.7    |      |  Processor : 1.7    |      |  Processor : 1.7    |      |  Processor : 1.6    |    |");
		System.out.println("  |    |      GHz Octa-Core  |      |      GHz Octa-Core  |      |     GHz Octa-Core   |      |     GHz Octa-Core   |      |     GHz Octa-Core   |    |");
		System.out.println("  |    |  PRICE : Rs6499/-   |      |  PRICE : Rs6999/-   |      |  PRICE : Rs7499/-   |      |  PRICE : Rs7799/-   |      |  PRICE : Rs7999/-   |    |");  
		System.out.println("  |    |_____________________|      |_____________________|      |_____________________|      |_____________________|      |_____________________|    |");
		System.out.println("  |                                                                                                                                                   |");
		System.out.println("  |              1.                           2.                           3.                            4.                          5.               |");
		System.out.println("  |     _____________________        _____________________        _____________________        _____________________        _____________________     |");
		System.out.println("  |    |      VIVO Y12S      |      |      VIVO Z1 PRO    |      |      VIVO Z1 X      |      |      VIVO F3        |      |                     |    |");
		System.out.println("  |    |---------------------|      |---------------------|      |---------------------|      |---------------------|      |                     |    |");
		System.out.println("  |    |  Ram : 2GB          |      |  Ram : 2GB          |      |  Ram : 2GB          |      |  Ram : 4GB          |      |                     |    |");
		System.out.println("  |    |  Rom : 16GB         |      |  Rom : 16GB         |      |  Rom : 16GB         |      |  Rom : 64GB         |      |                     |    |");
		System.out.println("  |    |  Front Camera : 16mp|      |  Front Camera : 16mp|      |  Front Camera : 16mp|      |  Front Camera : 16mp|      |                     |    |");
		System.out.println("  |    |  Back Camera : 32mp |      |  Rear Camera : 32mp |      |  Rear Camera : 32mp |      |  Rear Camera : 32mp |      |                     |    |");
		System.out.println("  |    |  Battery : 3000mah  |      |  Battery : 3000mah  |      |  Battery : 3000mah  |      |  Battery : 3900mah  |      |        EXIT         |    |");
		System.out.println("  |    |  Charger : 5v       |      |  Charger : 5v       |      |  Charger : 7v       |      |  Charger : 5v       |      |      --------       |    |");
		System.out.println("  |    |  Size    : 165.5mm  |      |  Size    : 165.5mm  |      |  Size    : 165.5mm  |      |  Size    : 165.5mm  |      |                     |    |");
		System.out.println("  |    |  Display : Full Hd  |      |  Display : Full Hd  |      |  Display : Full Hd  |      |  Display : Full Hd  |      |                     |    |");
		System.out.println("  |    |  Processor : 1.6    |      |  Processor : 1.7    |      |  Processor : 1.7    |      |  Processor : 1.7    |      |                     |    |");
		System.out.println("  |    |      GHz Octa-Core  |      |      GHz Octa-Core  |      |     GHz Octa-Core   |      |     GHz Octa-Core   |      |                     |    |");
		System.out.println("  |    |  PRICE=Rs8199/-     |      |  PRICE : Rs8399/-   |      |  PRICE : Rs8499/-   |      |  PRICE : Rs8999/-   |      |                     |    |");  
		System.out.println("  |    |_____________________|      |_____________________|      |_____________________|      |_____________________|      |_____________________|    |");
		System.out.println("  |                                                                                                                                                   |");
		System.out.println("  |             6.                            7.                           8.                           9.                            10.             |");
		System.out.println("  |___________________________________________________________________________________________________________________________________________________|");
		 System.out.println(RESET);	vivo1();	
		
	}
	public static void vivo1()
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
						   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="VIVO Y01";ob1[i++]= 6499; 
						   System.out.println("Do you want to continue in this budget (Below 10k) [y/n or Y/N] :");  //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':vivo1Display(); b=false; break; //CHUSKO KANNA
							   case 'n':vivo(); b=false; break;                                   //CHUSKO ANNA
							   default : System.out.print("Please enter valid option: ");
							   }
						   }while(b==true);b=false; break;
						   case 'n':
						   {
							   System.out.print("Do you want to see another model in this budget (Below 10k) [y/n or Y/N]:");   //CHUSKO KANNA
							   do
							   {
								   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
								   switch(c1)	
								   {
								   case 'y':vivo1Display(); b=false; break; //CHUSKO KANNA
								   case 'n':{
									   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
									   do 
									   {
										   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
										   switch(c2)
										   {
										   case 'y': vivo(); b=false; break; // CHUSKO ANNA BRANDS MARCHALI
										   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="VIVO Y1S";ob1[i++]= 6999; 
					   System.out.println("Do you want to continue in this budget (Below 10k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':vivo1Display(); b=false; break; //CHUSKO KANNA
						   case 'n':vivo(); b=false; break;                                   //CHUSKO ANNA
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Below 10k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':vivo1Display(); b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': vivo(); b=false; break; // CHUSKO ANNA BRANDS MARCHALI
									   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="VIVO Y91I";ob1[i++]= 7499; 
					   System.out.println("Do you want to continue in this budget (Below 10k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':vivo1Display(); b=false; break; //CHUSKO KANNA
						   case 'n':vivo(); b=false; break;                                   //CHUSKO ANNA
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Below 10k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':vivo1Display(); b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': vivo(); b=false; break; // CHUSKO ANNA BRANDS MARCHALI
									   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="VIVO U 10";ob1[i++]= 7799; 
					   System.out.println("Do you want to continue in this budget (Below 10k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':vivo1Display(); b=false; break; //CHUSKO KANNA
						   case 'n':vivo(); b=false; break;                                   //CHUSKO ANNA
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Below 10k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':vivo1Display(); b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': vivo(); b=false; break; // CHUSKO ANNA BRANDS MARCHALI
									   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="VIVO Y02";ob1[i++]= 7999; 
					   System.out.println("Do you want to continue in this budget (Below 10k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':vivo1Display(); b=false; break; //CHUSKO KANNA
						   case 'n':vivo(); b=false; break;                                   //CHUSKO ANNA
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Below 10k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':vivo1Display();; b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': vivo(); b=false; break; // CHUSKO ANNA BRANDS MARCHALI
									   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="VIVO Y12S";ob1[i++]= 8199; 
					   System.out.println("Do you want to continue in this budget (Below 10k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':vivo1Display(); b=false; break; //CHUSKO KANNA
						   case 'n':vivo(); b=false; break;                                   //CHUSKO ANNA
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Below 10k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':vivo1Display();; b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': vivo(); b=false; break; // CHUSKO ANNA BRANDS MARCHALI
									   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="VIVO Z1 PRO";ob1[i++]= 8399; 
					   System.out.println("Do you want to continue in this budget (Below 10k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':vivo1Display(); b=false; break; //CHUSKO KANNA
						   case 'n':vivo(); b=false; break;                                   //CHUSKO ANNA
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Below 10k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':vivo1Display(); b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': vivo(); b=false; break; // CHUSKO ANNA BRANDS MARCHALI
									   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="VIVO Z1 X";ob1[i++]= 8499; 
					   System.out.println("Do you want to continue in this budget (Below 10k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':vivo1Display(); b=false; break; //CHUSKO KANNA
						   case 'n':vivo(); b=false; break;                                   //CHUSKO ANNA
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Below 10k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':vivo1Display(); b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': vivo(); b=false; break; // CHUSKO ANNA BRANDS MARCHALI
									   case 'n': display(); b=false; break;
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
			   case 9:
			   {
				   System.out.print("Do you want to add it to cart [y/n or Y/N]:"); //CHUSKO KANNA
				   do
				   {
					   char c=sc.next().toLowerCase().charAt(0);           //CHUSKO KANNA
					   switch(c)
					   {
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="VIVO F3";ob1[i++]= 8999; 
					   System.out.println("Do you want to continue in this budget (Below 10k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':vivo1Display(); b=false; break; //CHUSKO KANNA
						   case 'n':vivo(); b=false; break;                                   //CHUSKO ANNA
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Below 10k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':vivo1Display(); b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': vivo(); b=false; break; // CHUSKO ANNA BRANDS MARCHALI
									   case 'n': display(); b=false; break;
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
			   	case 10:vivo(); b=false; break; //CHUSKO KANNA
				   default: System.out.print("PLEASE ENTER VALID OPTION: ");
				   }
			}while(b==true);
	}
	public static void vivo2Display()
	{ System.out.println(RESET);
		System.out.println("   ___________________________________________________________________________________________________________________________________________________");
		System.out.println("  |                                                                                                                                                   |");
		System.out.println("  |     _____________________        _____________________        _____________________        _____________________        _____________________     |");
		System.out.println("  |    |      VIVO T1        |      |      VIVO T1X       |      |      VIVO Y56       |      |      VIVO Y75       |      |      VIVO Y72       |    |");
		System.out.println("  |    |---------------------|      |---------------------|      |---------------------|      |---------------------|      |---------------------|    |");
		System.out.println("  |    |  Ram : 3GB          |      |  Ram : 3GB          |      |  Ram : 3GB          |      |  Ram : 3GB          |      |  Ram : 3GB          |    |");
		System.out.println("  |    |  Rom : 32GB         |      |  Rom : 32GB         |      |  Rom : 32GB         |      |  Rom : 32GB         |      |  Rom : 32GB         |    |");
		System.out.println("  |    |  Front Camera : 16mp|      |  Front Camera : 16mp|      |  Front Camera : 16mp|      |  Front Camera : 16mp|      |  Front Camera : 16mp|    |");
		System.out.println("  |    |  Back Camera : 32mp |      |  Rear Camera : 32mp |      |  Rear Camera : 32mp |      |  Rear Camera : 32mp |      |  Rear Camera : 32mp |    |");
		System.out.println("  |    |  Battery : 3000mah  |      |  Battery : 3500mah  |      |  Battery : 4000mah  |      |  Battery : 4500mah  |      |  Battery : 4500mah  |    |");
		System.out.println("  |    |  Charger : 5v       |      |  Charger : 5v       |      |  Charger : 5v       |      |  Charger : 5v       |      |  Charger : 5v       |    |");
		System.out.println("  |    |  Size    : 165.5mm  |      |  Size    : 165.5mm  |      |  Size    : 165.5mm  |      |  Size    : 165.5mm  |      |  Size    : 165.5mm  |    |");
		System.out.println("  |    |  Display : Full Hd  |      |  Display : Full Hd  |      |  Display : Full Hd  |      |  Display : Full Hd  |      |  Display : Full Hd  |    |");
		System.out.println("  |    |  Processor : 1.6    |      |  Processor : 1.7    |      |  Processor : 1.9    |      |  Processor : 1.9    |      |  Processor : 1.6    |    |");
		System.out.println("  |    |      GHz Octa-Core  |      |      GHz Octa-Core  |      |     GHz Octa-Core   |      |     GHz Octa-Core   |      |     GHz Octa-Core   |    |");
		System.out.println("  |    |  PRICE : Rs11999/-  |      |  PRICE : Rs12499/-  |      |  PRICE : Rs13499/-  |      |  PRICE : Rs14499/-  |      |  PRICE : Rs15999/-  |    |");  
		System.out.println("  |    |_____________________|      |_____________________|      |_____________________|      |_____________________|      |_____________________|    |");
		System.out.println("  |                                                                                                                                                   |");
		System.out.println("  |              1.                           2.                           3.                            4.                          5.               |");
		System.out.println("  |     _____________________        _____________________        _____________________        _____________________        _____________________     |");
		System.out.println("  |    |      VIVO V23E      |      |      VIVO V21       |      |      VIVO V21E      |      |      VIVO T1  PRO   |      |                     |    |");
		System.out.println("  |    |---------------------|      |---------------------|      |---------------------|      |---------------------|      |                     |    |");
		System.out.println("  |    |  Ram : 4GB          |      |  Ram : 4GB          |      |  Ram : 6GB          |      |  Ram : 8GB          |      |                     |    |");
		System.out.println("  |    |  Rom : 64GB         |      |  Rom : 64GB         |      |  Rom : 64GB         |      |  Rom : 128GB        |      |                     |    |");
		System.out.println("  |    |  Front Camera : 32mp|      |  Front Camera : 24mp|      |  Front Camera : 32mp|      |  Front Camera : 32mp|      |                     |    |");
		System.out.println("  |    |  Back Camera : 64mp |      |  Rear Camera : 64mp |      |  Rear Camera : 64mp |      |  Rear Camera : 64mp |      |                     |    |");
		System.out.println("  |    |  Battery : 3900mah  |      |  Battery : 4000mah  |      |  Battery : 4500mah  |      |  Battery : 5900mah  |      |        EXIT         |    |");
		System.out.println("  |    |  Charger : 5v       |      |  Charger : 5v       |      |  Charger : 7v       |      |  Charger : 5v       |      |      --------       |    |");
		System.out.println("  |    |  Size    : 165.5mm  |      |  Size    : 165.5mm  |      |  Size    : 165.5mm  |      |  Size    : 165.5mm  |      |                     |    |");
		System.out.println("  |    |  Display : Full Hd  |      |  Display : Full Hd  |      |  Display : Full Hd  |      |  Display : Full Hd  |      |                     |    |");
		System.out.println("  |    |  Processor : 1.6    |      |  Processor : 1.7    |      |  Processor : 1.7    |      |  Processor : 1.9    |      |                     |    |");
		System.out.println("  |    |      GHz Octa-Core  |      |      GHz Octa-Core  |      |     GHz Octa-Core   |      |     GHz Octa-Core   |      |                     |    |");
		System.out.println("  |    |  PRICE : Rs18199/-  |      |  PRICE : Rs18399/-  |      |  PRICE : Rs21499/-  |      |  PRICE : Rs24999/-  |      |                     |    |");  
		System.out.println("  |    |_____________________|      |_____________________|      |_____________________|      |_____________________|      |_____________________|    |");
		System.out.println("  |                                                                                                                                                   |");
		System.out.println("  |             6.                            7.                           8.                           9.                            10.             |");
		System.out.println("  |___________________________________________________________________________________________________________________________________________________|");
		 System.out.println(RESET);vivo2();
	}
	public static void vivo2()
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
						   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="VIVO T1";ob1[i++]= 11999; 
						   System.out.println("Do you want to continue in this budget (Between 10k - 25k) [y/n or Y/N] :");  //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':vivo2Display(); b=false; break; //CHUSKO KANNA
							   case 'n':vivo(); b=false; break;                                   //CHUSKO ANNA
							   default : System.out.print("Please enter valid option: ");
							   }
						   }while(b==true);b=false; break;
						   case 'n':
						   {
							   System.out.print("Do you want to see another model in this budget (Between 10k - 25k) [y/n or Y/N]:");   //CHUSKO KANNA
							   do
							   {
								   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
								   switch(c1)	
								   {
								   case 'y':vivo2Display(); b=false; break; //CHUSKO KANNA
								   case 'n':{
									   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
									   do 
									   {
										   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
										   switch(c2)
										   {
										   case 'y': vivo(); b=false; break; // CHUSKO ANNA BRANDS MARCHALI
										   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="VIVO T1X";ob1[i++]= 12499; 
					   System.out.println("Do you want to continue in this budget (Between 10k - 25k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':vivo2Display(); b=false; break; //CHUSKO KANNA
						   case 'n':vivo(); b=false; break;                                   //CHUSKO ANNA
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Between 10k - 25k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':vivo2Display(); b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': vivo(); b=false; break; // CHUSKO ANNA BRANDS MARCHALI
									   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="VIVO Y56";ob1[i++]= 13499; 
					   System.out.println("Do you want to continue in this budget (Between 10k - 25k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':vivo2Display(); b=false; break; //CHUSKO KANNA
						   case 'n':vivo(); b=false; break;                                   //CHUSKO ANNA
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Between 10k - 25k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':vivo2Display();b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': vivo(); b=false; break; // CHUSKO ANNA BRANDS MARCHALI
									   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="VIVO Y75";ob1[i++]= 14499; 
					   System.out.println("Do you want to continue in this budget (Between 10k - 25k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':vivo2Display(); b=false; break; //CHUSKO KANNA
						   case 'n':vivo(); b=false; break;                                   //CHUSKO ANNA
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Between 10k - 25k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':vivo2Display(); b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': vivo(); b=false; break; // CHUSKO ANNA BRANDS MARCHALI
									   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="VIVO Y72";ob1[i++]= 15999; 
					   System.out.println("Do you want to continue in this budget (Between 10k - 25k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':vivo2Display(); b=false; break; //CHUSKO KANNA
						   case 'n':vivo(); b=false; break;                                   //CHUSKO ANNA
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Between 10k - 25k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':vivo2Display(); b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': vivo(); b=false; break; // CHUSKO ANNA BRANDS MARCHALI
									   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="VIVO V23E";ob1[i++]= 18199; 
					   System.out.println("Do you want to continue in this budget (Between 10k - 25k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':vivo2Display(); b=false; break; //CHUSKO KANNA
						   case 'n':vivo(); b=false; break;                                   //CHUSKO ANNA
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Between 10k - 25k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':vivo2Display(); b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': vivo(); b=false; break; // CHUSKO ANNA BRANDS MARCHALI
									   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="VIVO V21";ob1[i++]= 18399; 
					   System.out.println("Do you want to continue in this budget (Between 10k - 25k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':vivo2Display(); b=false; break; //CHUSKO KANNA
						   case 'n':vivo(); b=false; break;                                   //CHUSKO ANNA
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Between 10k - 25k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':vivo2Display(); b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': vivo(); b=false; break; // CHUSKO ANNA BRANDS MARCHALI
									   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="VIVO V21E";ob1[i++]= 21499; 
					   System.out.println("Do you want to continue in this budget (Between 10k - 25k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':vivo2Display(); b=false; break; //CHUSKO KANNA
						   case 'n':vivo(); b=false; break;                                   //CHUSKO ANNA
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Between 10k - 25k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':vivo2Display(); b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': vivo(); b=false; break; // CHUSKO ANNA BRANDS MARCHALI
									   case 'n': display(); b=false; break;
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
			   case 9:
			   {
				   System.out.print("Do you want to add it to cart [y/n or Y/N]:"); //CHUSKO KANNA
				   do
				   {
					   char c=sc.next().toLowerCase().charAt(0);           //CHUSKO KANNA
					   switch(c)
					   {
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="VIVO T1 PRO";ob1[i++]= 24999; 
					   System.out.println("Do you want to continue in this budget (Between 10k - 25k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':vivo2Display();b=false; break; //CHUSKO KANNA
						   case 'n':vivo(); b=false; break;                                   //CHUSKO ANNA
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Between 10k - 25k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':vivo2Display();; b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': vivo(); b=false; break; // CHUSKO ANNA BRANDS MARCHALI
									   case 'n': display(); b=false; break;
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
			   	case 10:vivo(); b=false; break; //CHUSKO KANNA
				   default: System.out.print("PLEASE ENTER VALID OPTION: ");
				   }
			}while(b==true);
	}
	public static void vivo3Display()
	{ System.out.println(RESET);
		System.out.println("   ___________________________________________________________________________________________________________________________________________________");
		System.out.println("  |                                                                                                                                                   |");
		System.out.println("  |     _____________________        _____________________        _____________________        _____________________        _____________________     |");
		System.out.println("  |    |      VIVO V25       |      |      VIVO V25 PRO   |      |      VIVO V23 PRO   |      |      VIVO V27 PRO   |      |                     |    |");
		System.out.println("  |    |---------------------|      |---------------------|      |---------------------|      |---------------------|      |                     |    |");
		System.out.println("  |    |  Ram : 6GB          |      |  Ram : 6GB          |      |  Ram : 6GB          |      |  Ram : 8GB          |      |                     |    |");
		System.out.println("  |    |  Rom : 64GB         |      |  Rom : 128GB        |      |  Rom : 128GB        |      |  Rom : 128GB        |      |                     |    |");
		System.out.println("  |    |  Front Camera : 64mp|      |  Front Camera : 64mp|      |  Front Camera : 32mp|      |  Front Camera : 64mp|      |                     |    |");
		System.out.println("  |    |  Back Camera : 100mp|      |  Rear Camera : 100mp|      |  Rear Camera : 150mp|      |  Rear Camera : 100mp|      |                     |    |");
		System.out.println("  |    |  Battery : 5000mah  |      |  Battery : 5500mah  |      |  Battery : 5000mah  |      |  Battery : 5500mah  |      |        EXIT         |    |");
		System.out.println("  |    |  Charger : 10v      |      |  Charger : 10v      |      |  Charger : 15v      |      |  Charger : 15v      |      |      --------       |    |");
		System.out.println("  |    |  Size    : 165.5mm  |      |  Size    : 165.5mm  |      |  Size    : 165.5mm  |      |  Size    : 165.5mm  |      |                     |    |");
		System.out.println("  |    |  Display : Full Sd  |      |  Display : Full Sd  |      |  Display : Full Sd  |      |  Display : Full Sd  |      |                     |    |");
		System.out.println("  |    |  Processor : 6.5    |      |  Processor : 6.7    |      |  Processor : 9.0    |      |  Processor : 10.5   |      |                     |    |");
		System.out.println("  |    |      GHz Octa-Core  |      |      GHz Octa-Core  |      |     GHz Octa-Core   |      |     GHz Octa-Core   |      |                     |    |");
		System.out.println("  |    |  PRICE : Rs29999/-  |      |  PRICE : Rs34499/-  |      |  PRICE : Rs43499/-  |      |  PRICE : Rs45499/-  |      |                     |    |");  
		System.out.println("  |    |_____________________|      |_____________________|      |_____________________|      |_____________________|      |_____________________|    |");
		System.out.println("  |                                                                                                                                                   |");
		System.out.println("  |             1.                            2.                           3.                           4.                            5.              |");
		System.out.println("  |___________________________________________________________________________________________________________________________________________________|");
		 System.out.println(RESET);
		vivo3();
	}
	public static void vivo3()
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
						   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="VIVO V25";ob1[i++]= 29999; 
						   System.out.println("Do you want to continue in this budget (Between 30k - 50k) [y/n or Y/N] :");  //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':vivo3Display();b=false; break; //CHUSKO KANNA
							   case 'n':vivo(); b=false; break;                                   //CHUSKO ANNA
							   default : System.out.print("Please enter valid option: ");
							   }
						   }while(b==true);b=false; break;
						   case 'n':
						   {
							   System.out.print("Do you want to see another model in this budget (Between 30k - 50k) [y/n or Y/N]:");   //CHUSKO KANNA
							   do
							   {
								   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
								   switch(c1)	
								   {
								   case 'y':vivo3Display(); b=false; break; //CHUSKO KANNA
								   case 'n':{
									   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
									   do 
									   {
										   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
										   switch(c2)
										   {
										   case 'y': vivo(); b=false; break; // CHUSKO ANNA BRANDS MARCHALI
										   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="VIVO V25 PRO";ob1[i++]= 34499; 
					   System.out.println("Do you want to continue in this budget (Between 30k - 50k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':vivo3Display(); b=false; break; //CHUSKO KANNA
						   case 'n':vivo(); b=false; break;                                   //CHUSKO ANNA
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Between 30k - 50k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':vivo3Display(); b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': vivo(); b=false; break; // CHUSKO ANNA BRANDS MARCHALI
									   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="VIVO V23 PRO";ob1[i++]= 43499; 
					   System.out.println("Do you want to continue in this budget (Between 30k - 50k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':vivo3Display(); b=false; break; //CHUSKO KANNA
						   case 'n':vivo(); b=false; break;                                   //CHUSKO ANNA
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Between 30k - 50k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':vivo3Display(); b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': vivo(); b=false; break; // CHUSKO ANNA BRANDS MARCHALI
									   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="VIVO V27 PRO";ob1[i++]= 45499; 
					   System.out.println("Do you want to continue in this budget (Between 30k - 50k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':vivo3Display(); b=false; break; //CHUSKO KANNA
						   case 'n':vivo(); b=false; break;                                   //CHUSKO ANNA
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Between 30k - 50k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':vivo3Display(); b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': vivo(); b=false; break; // CHUSKO ANNA BRANDS MARCHALI
									   case 'n': display(); b=false; break;
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
			   												
			   	case 5:vivo(); b=false; break; //CHUSKO KANNA
				   default: System.out.print("PLEASE ENTER VALID OPTION: ");
				   }
			}while(b==true);
	}
	public static void vivo4Display()
	{ System.out.println(RESET);
		System.out.println("   ___________________________________________________________________________________________________________________________________________________");
		System.out.println("  |                                                                                                                                                   |");
		System.out.println("  |     _____________________        _____________________        _____________________        _____________________        _____________________     |");
		System.out.println("  |    |      VIVO X 80      |      |      VIVO  80 PRO   |      |      VIVO  X 70     |      |     VIVO X 70 PRO   |      |      VIVO X 90      |    |");
		System.out.println("  |    |---------------------|      |---------------------|      |---------------------|      |---------------------|      |---------------------|    |");
		System.out.println("  |    |  Ram : 4GB          |      |  Ram : 4GB          |      |  Ram : 6GB          |      |  Ram : 6GB          |      |  Ram : 6GB          |    |");
		System.out.println("  |    |  Rom : 64GB         |      |  Rom : 128GB        |      |  Rom : 64GB         |      |  Rom : 64GB         |      |  Rom : 128GB        |    |");
		System.out.println("  |    |  Front Camera : 32mp|      |  Front Camera : 32mp|      |  Front Camera : 32mp|      |  Front Camera : 32mp|      |  Front Camera : 32mp|    |");
		System.out.println("  |    |  Back Camera : 64mp |      |  Rear Camera : 64mp |      |  Rear Camera : 64mp |      |  Rear Camera : 64mp |      |  Rear Camera : 64mp |    |");
		System.out.println("  |    |  Battery : 4000mah  |      |  Battery : 5000mah  |      |  Battery : 4500mah  |      |  Battery : 4500mah  |      |  Battery : 4500mah  |    |");
		System.out.println("  |    |  Charger : 6v       |      |  Charger : 9v       |      |  Charger : 7v       |      |  Charger : 7v       |      |  Charger : 9v       |    |");
		System.out.println("  |    |  Size    : 165.5mm  |      |  Size    : 167.5mm  |      |  Size    : 167.5mm  |      |  Size : 165.5mm     |      |  Size    : 175.5mm  |    |");
		System.out.println("  |    |  Display : Full Sd  |      |  Display : Full Sd  |      |  Display : Full Sd  |      |  Display : Full Hd  |      |  Display : Full Sd  |    |");
		System.out.println("  |    |  Processor : 5.6    |      |  Processor : 5.7    |      |  Processor : 5.8    |      |  Processor : 5.7    |      |  Processor : 8.6    |    |");
		System.out.println("  |    |      GHz Octa-Core  |      |      GHz Octa-Core  |      |     GHz Octa-Core   |      |     GHz Octa-Core   |      |     GHz Octa-Core   |    |");
		System.out.println("  |    |  PRICE : Rs56499/-  |      |  PRICE : Rs56999/-  |      |  PRICE : Rs57499/-  |      |  PRICE : Rs57799/-  |      |  PRICE : Rs57999/-  |    |");  
		System.out.println("  |    |_____________________|      |_____________________|      |_____________________|      |_____________________|      |_____________________|    |");
		System.out.println("  |                                                                                                                                                   |");
		System.out.println("  |              1.                           2.                           3.                            4.                          5.               |");
		System.out.println("  |     _____________________        _____________________        _____________________        _____________________        _____________________     |");
		System.out.println("  |    |     VIVO X 90 PRO   |      |      VIVO Z1 PLUS   |      |      VIVO Z FLIP    |      |  VIVO X 90 PRO PLUS |      |                     |    |");
		System.out.println("  |    |---------------------|      |---------------------|      |---------------------|      |---------------------|      |                     |    |");
		System.out.println("  |    |  Ram : 6GB          |      |  Ram : 6GB          |      |  Ram : 12GB         |      |  Ram : 12GB         |      |                     |    |");
		System.out.println("  |    |  Rom : 128GB        |      |  Rom : 128GB        |      |  Rom : 128GB        |      |  Rom : 128GB        |      |                     |    |");
		System.out.println("  |    |  Front Camera : 32mp|      |  Front Camera : 60mp|      |  Front Camera : 60mp|      |  Front Camera : 60mp|      |                     |    |");
		System.out.println("  |    |  Back Camera : 100mp|      |  Rear Camera : 20mp |      |  Rear Camera : 20mp |      |  Rear Camera : 20mp |      |                     |    |");
		System.out.println("  |    |  Battery : 6000mah  |      |  Battery : 6000mah  |      |  Battery : 6000mah  |      |  Battery : 6900mah  |      |        EXIT         |    |");
		System.out.println("  |    |  Charger : 10v      |      |  Charger : 15v      |      |  Charger : 18v      |      |  Charger : 15v      |      |      --------       |    |");
		System.out.println("  |    |  Size    : 167.5mm  |      |  Size   : 165.5mm   |      |  Size    : 165.5mm  |      |  Size    : 168.5mm  |      |                     |    |");
		System.out.println("  |    |  Display : Full Sd  |      |  Display : Full Sd  |      |  Display : Full Sd  |      |  Display : Full Sd  |      |                     |    |");
		System.out.println("  |    |  Processor : 10.6   |      |  Processor : 10.7   |      |  Processor : 10.7   |      |  Processor : 10.7   |      |                     |    |");
		System.out.println("  |    |      GHz Octa-Core  |      |      GHz Octa-Core  |      |     GHz Octa-Core   |      |     GHz Octa-Core   |      |                     |    |");
		System.out.println("  |    |  PRICE : Rs58199/-  |      |  PRICE : Rs58399/-  |      |  PRICE : Rs68499/-  |      |  PRICE : Rs68999/-  |      |                     |    |");  
		System.out.println("  |    |_____________________|      |_____________________|      |_____________________|      |_____________________|      |_____________________|    |");
		System.out.println("  |                                                                                                                                                   |");
		System.out.println("  |             6.                            7.                           8.                           9.                            10.             |");
		System.out.println("  |___________________________________________________________________________________________________________________________________________________|");
		 System.out.println(RESET);vivo4();
	}
	public static void vivo4()
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
						   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="VIVO X 80";ob1[i++]=56499; 
						   System.out.println("Do you want to continue in this budget (Above 50k) [y/n or Y/N] :");  //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':vivo4Display(); b=false; break; //CHUSKO KANNA
							   case 'n':vivo(); b=false; break;                                   //CHUSKO ANNA
							   default : System.out.print("Please enter valid option: ");
							   }
						   }while(b==true);b=false; break;
						   case 'n':
						   {
							   System.out.print("Do you want to see another model in this budget (Above 50k) [y/n or Y/N]:");   //CHUSKO KANNA
							   do
							   {
								   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
								   switch(c1)	
								   {
								   case 'y':vivo4Display(); b=false; break; //CHUSKO KANNA
								   case 'n':{
									   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
									   do 
									   {
										   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
										   switch(c2)
										   {
										   case 'y': vivo(); b=false; break; // CHUSKO ANNA BRANDS MARCHALI
										   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="VIVO X 80 PRO";ob1[i++]= 56999; 
					   System.out.println("Do you want to continue in this budget (Above 50k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':vivo4Display(); b=false; break; //CHUSKO KANNA
						   case 'n':vivo(); b=false; break;                                   //CHUSKO ANNA
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Above 50k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':vivo4Display(); b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': vivo(); b=false; break; // CHUSKO ANNA BRANDS MARCHALI
									   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="VIVO X 70";ob1[i++]= 57499; 
					   System.out.println("Do you want to continue in this budget (Above 50k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':vivo4Display();; b=false; break; //CHUSKO KANNA
						   case 'n':vivo(); b=false; break;                                   //CHUSKO ANNA
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Above 50k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':vivo4Display(); b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': vivo(); b=false; break; // CHUSKO ANNA BRANDS MARCHALI
									   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="VIVO X 70 PRO";ob1[i++]= 57799; 
					   System.out.println("Do you want to continue in this budget (Above 50k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':vivo4Display(); b=false; break; //CHUSKO KANNA
						   case 'n':vivo(); b=false; break;                                   //CHUSKO ANNA
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Above 50k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':vivo4Display();; b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': vivo(); b=false; break; // CHUSKO ANNA BRANDS MARCHALI
									   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="VIVO X 90";ob1[i++]= 57999; 
					   System.out.println("Do you want to continue in this budget (Above 50k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':vivo4Display(); b=false; break; //CHUSKO KANNA
						   case 'n':vivo(); b=false; break;                                   //CHUSKO ANNA
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Above 50k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':vivo4Display();; b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': vivo(); b=false; break; // CHUSKO ANNA BRANDS MARCHALI
									   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="VIVO X 90 PRO";ob1[i++]= 58199; 
					   System.out.println("Do you want to continue in this budget (Above 50k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':vivo4Display(); b=false; break; //CHUSKO KANNA
						   case 'n':vivo(); b=false; break;                                   //CHUSKO ANNA
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Above 50k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':vivo4Display(); b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': vivo(); b=false; break; // CHUSKO ANNA BRANDS MARCHALI
									   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="VIVO Z1 PLUS";ob1[i++]= 58399; 
					   System.out.println("Do you want to continue in this budget (Above 50k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':vivo4Display(); b=false; break; //CHUSKO KANNA
						   case 'n':vivo(); b=false; break;                                   //CHUSKO ANNA
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Above 50k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':vivo4Display(); b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': vivo(); b=false; break; // CHUSKO ANNA BRANDS MARCHALI
									   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="VIVO Z FLIP";ob1[i++]= 68499; 
					   System.out.println("Do you want to continue in this budget (Above 50k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':vivo4Display(); b=false; break; //CHUSKO KANNA
						   case 'n':vivo(); b=false; break;                                   //CHUSKO ANNA
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Above 50k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':vivo4Display();; b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': vivo(); b=false; break; // CHUSKO ANNA BRANDS MARCHALI
									   case 'n': display(); b=false; break;
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
			   case 9:
			   {
				   System.out.print("Do you want to add it to cart [y/n or Y/N]:"); //CHUSKO KANNA
				   do
				   {
					   char c=sc.next().toLowerCase().charAt(0);           //CHUSKO KANNA
					   switch(c)
					   {
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="VIVO X 90 PRO PLUS";ob1[i++]= 68999; 
					   System.out.println("Do you want to continue in this budget (Above 50k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':vivo4Display();; b=false; break; //CHUSKO KANNA
						   case 'n':vivo(); b=false; break;                                   //CHUSKO ANNA
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Above 50k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':vivo4Display();; b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': vivo(); b=false; break; // CHUSKO ANNA BRANDS MARCHALI
									   case 'n': display(); b=false; break;
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
			   	case 10:vivo(); b=false; break; //CHUSKO KANNA
				   default: System.out.print("PLEASE ENTER VALID OPTION: ");
				   }
			}while(b==true);
	}
	public static void oneplus()
	{ System.out.println(RESET);
		 System.out.println("\t\t\t\t\t\t"+"                         ONEPLUS                         ");  
		 System.out.println("\t\t\t\t\t\t"+"                      -------------                      ");  
		 System.out.println("\t\t\t\t\t\t"+"                      1.Below 20k                         ");  
		 System.out.println("\t\t\t\t\t\t"+"                      2.Above 20k                    ");
		 System.out.println("\t\t\t\t\t\t"+"                      3.EXIT FROM ONEPLUS                   "); 
	     System.out.print("SELECT PRICE RANGE : "); System.out.println(RESET);

       do
		 {
			int p=sc.nextInt();
			switch(p) 
			{
			case 1: oneplus1Display(); b=false; break;
			case 2: oneplus2Display(); b=false; break;
			case 3: display();b=false; break;
		    default:
		    	{
		    		System.out.println("Please enter valid option.");
		    		oneplus();
		    	}
			}
		 }while(b==true);
	}	
	public static void oneplus1Display()
	{ System.out.println(RESET);
		System.out.println("   ___________________________________________________________________________________________________________________________________________________");
		System.out.println("  |                                                                                                                                                   |");
		System.out.println("  |     _____________________        _____________________        _____________________        _____________________        _____________________     |");
		System.out.println("  |    |    ONEPLUS Nord     |      |    ONEPLUS Nord CE  |      |   ONEPLUS Nord CE2  |      |  ONEPLUS Nord CE3   |      |                     |    |");
		System.out.println("  |    |---------------------|      |---------------------|      |---------------------|      |---------------------|      |                     |    |");
		System.out.println("  |    |  Ram : 6GB          |      |  Ram : 6GB          |      |  Ram : 6GB          |      |  Ram : 8GB          |      |                     |    |");
		System.out.println("  |    |  Rom : 64GB         |      |  Rom : 128GB        |      |  Rom : 128GB        |      |  Rom : 128GB        |      |                     |    |");
		System.out.println("  |    |  Front Camera : 64mp|      |  Front Camera : 64mp|      |  Front Camera : 32mp|      |  Front Camera : 64mp|      |                     |    |");
		System.out.println("  |    |  Back Camera : 100mp|      |  Rear Camera : 100mp|      |  Rear Camera : 150mp|      |  Rear Camera : 100mp|      |                     |    |");
		System.out.println("  |    |  Battery : 5000mah  |      |  Battery : 5500mah  |      |  Battery : 5000mah  |      |  Battery : 5500mah  |      |        EXIT         |    |");
		System.out.println("  |    |  Charger : 10v      |      |  Charger : 10v      |      |  Charger : 15v      |      |  Charger : 15v      |      |      ---------      |    |");
		System.out.println("  |    |  Size    : 165.5mm  |      |  Size    : 165.5mm  |      |  Size    : 165.5mm  |      |  Size    : 165.5mm  |      |                     |    |");
		System.out.println("  |    |  Display : Full Sd  |      |  Display : Full Sd  |      |  Display : Full Sd  |      |  Display : Full Sd  |      |                     |    |");
		System.out.println("  |    |  Processor : 6.5    |      |  Processor : 6.7    |      |  Processor : 9.0    |      |  Processor : 10.5   |      |                     |    |");
		System.out.println("  |    |      GHz Octa-Core  |      |      GHz Octa-Core  |      |     GHz Octa-Core   |      |     GHz Octa-Core   |      |                     |    |");
		System.out.println("  |    |  PRICE : Rs19999/-  |      |  PRICE : Rs14499/-  |      |  PRICE : Rs13499/-  |      |  PRICE : Rs15499/-  |      |                     |    |");  
		System.out.println("  |    |_____________________|      |_____________________|      |_____________________|      |_____________________|      |_____________________|    |");
		System.out.println("  |                                                                                                                                                   |");
		System.out.println("  |             1.                            2.                           3.                           4.                            5.              |");
		System.out.println("  |___________________________________________________________________________________________________________________________________________________|");
		 System.out.println(RESET);
			oneplus1();
	}
	public static void oneplus1()
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
						   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="ONEPLUS NORD";ob1[i++]= 19999; 
						   System.out.println("Do you want to continue in this budget (Below 20k) [y/n or Y/N] :");  //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':oneplus1Display();; b=false; break; //CHUSKO KANNA
							   case 'n':oneplus(); b=false; break;                                   //CHUSKO ANNA
							   default : System.out.print("Please enter valid option: ");
							   }
						   }while(b==true);b=false; break;
						   case 'n':
						   {
							   System.out.print("Do you want to see another model in this budget (Below 20k) [y/n or Y/N]:");   //CHUSKO KANNA
							   do
							   {
								   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
								   switch(c1)	
								   {
								   case 'y':oneplus1Display();; b=false; break; //CHUSKO KANNA
								   case 'n':{
									   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
									   do 
									   {
										   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
										   switch(c2)
										   {
										   case 'y': oneplus(); b=false; break; // CHUSKO ANNA BRANDS MARCHALI
										   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="ONEPLUS NORD CE";ob1[i++]= 14499; 
					   System.out.println("Do you want to continue in this budget (Below 20k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':oneplus1Display();; b=false; break; //CHUSKO KANNA
						   case 'n':oneplus(); b=false; break;                                   //CHUSKO ANNA
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Below 20k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':oneplus1Display();; b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': oneplus(); b=false; break; // CHUSKO ANNA BRANDS MARCHALI
									   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="ONEPLUS NORD CE2";ob1[i++]= 13499; 
					   System.out.println("Do you want to continue in this budget (Below 20k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':oneplus1Display();; b=false; break; //CHUSKO KANNA
						   case 'n':oneplus(); b=false; break;                                   //CHUSKO ANNA
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Below 20k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':oneplus1Display();; b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': oneplus(); b=false; break; // CHUSKO ANNA BRANDS MARCHALI
									   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="ONEPLUS NORD CE 3";ob1[i++]= 15499; 
					   System.out.println("Do you want to continue in this budget (Below 20k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':oneplus1Display();; b=false; break; //CHUSKO KANNA
						   case 'n':oneplus(); b=false; break;                                   //CHUSKO ANNA
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Below 20k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':oneplus1Display();; b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': oneplus(); b=false; break; // CHUSKO ANNA BRANDS MARCHALI
									   case 'n': display(); b=false; break;
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

			   	case 5:oneplus(); b=false; break; //CHUSKO KANNA
				   default: System.out.print("PLEASE ENTER VALID OPTION: ");
				   }
			}while(b==true);
	}
	public static void oneplus2Display()
	{ System.out.println(RESET);
		System.out.println("   ___________________________________________________________________________________________________________________________________________________");
		System.out.println("  |                                                                                                                                                   |");
		System.out.println("  |     _____________________        _____________________        _____________________        _____________________        _____________________     |");
		System.out.println("  |    |    ONEPLUS NORD 2   |      |    ONEPLUS NORD CE 9|      |    ONEPLUS NORD 2T  |      |    ONEPLUS 10T      |      |    ONEPLUS 10R      |    |");
		System.out.println("  |    |---------------------|      |---------------------|      |---------------------|      |---------------------|      |---------------------|    |");
		System.out.println("  |    |  Ram : 3GB          |      |  Ram : 3GB          |      |  Ram : 3GB          |      |  Ram : 3GB          |      |  Ram : 3GB          |    |");
		System.out.println("  |    |  Rom : 32GB         |      |  Rom : 32GB         |      |  Rom : 32GB         |      |  Rom : 32GB         |      |  Rom : 32GB         |    |");
		System.out.println("  |    |  Front Camera : 16mp|      |  Front Camera : 16mp|      |  Front Camera : 16mp|      |  Front Camera : 16mp|      |  Front Camera : 16mp|    |");
		System.out.println("  |    |  Back Camera : 32mp |      |  Rear Camera : 32mp |      |  Rear Camera : 32mp |      |  Rear Camera : 32mp |      |  Rear Camera : 32mp |    |");
		System.out.println("  |    |  Battery : 3000mah  |      |  Battery : 3500mah  |      |  Battery : 4000mah  |      |  Battery : 4500mah  |      |  Battery : 4500mah  |    |");
		System.out.println("  |    |  Charger : 5v       |      |  Charger : 5v       |      |  Charger : 5v       |      |  Charger : 5v       |      |  Charger : 5v       |    |");
		System.out.println("  |    |  Size    : 165.5mm  |      |  Size    : 165.5mm  |      |  Size    : 165.5mm  |      |  Size    : 165.5mm  |      |  Size    : 165.5mm  |    |");
		System.out.println("  |    |  Display : Full Hd  |      |  Display : Full Hd  |      |  Display : Full Hd  |      |  Display : Full Hd  |      |  Display : Full Hd  |    |");
		System.out.println("  |    |  Processor : 1.6    |      |  Processor : 1.7    |      |  Processor : 1.9    |      |  Processor : 1.9    |      |  Processor : 1.6    |    |");
		System.out.println("  |    |      GHz Octa-Core  |      |      GHz Octa-Core  |      |     GHz Octa-Core   |      |     GHz Octa-Core   |      |     GHz Octa-Core   |    |");
		System.out.println("  |    |  PRICE : Rs26999/-  |      |  PRICE : Rs27499/-  |      |  PRICE : Rs29499/-  |      |  PRICE : Rs30499/-  |      |  PRICE : Rs32999/-  |    |");  
		System.out.println("  |    |_____________________|      |_____________________|      |_____________________|      |_____________________|      |_____________________|    |");
		System.out.println("  |                                                                                                                                                   |");
		System.out.println("  |              1.                           2.                           3.                            4.                          5.               |");
		System.out.println("  |     _____________________        _____________________        _____________________        _____________________        _____________________     |");
		System.out.println("  |    |    ONEPLUS 9RT      |      |    ONEPLUS 10R      |      |    ONEPLUS 10 PRO   |      |    ONEPLUS 11R      |      |                     |    |");
		System.out.println("  |    |---------------------|      |---------------------|      |---------------------|      |---------------------|      |                     |    |");
		System.out.println("  |    |  Ram : 4GB          |      |  Ram : 4GB          |      |  Ram : 6GB          |      |  Ram : 8GB          |      |                     |    |");
		System.out.println("  |    |  Rom : 64GB         |      |  Rom : 64GB         |      |  Rom : 64GB         |      |  Rom : 128GB        |      |                     |    |");
		System.out.println("  |    |  Front Camera : 32mp|      |  Front Camera : 24mp|      |  Front Camera : 32mp|      |  Front Camera : 32mp|      |                     |    |");
		System.out.println("  |    |  Back Camera : 64mp |      |  Rear Camera : 64mp |      |  Rear Camera : 64mp |      |  Rear Camera : 64mp |      |                     |    |");
		System.out.println("  |    |  Battery : 3900mah  |      |  Battery : 4000mah  |      |  Battery : 4500mah  |      |  Battery : 5900mah  |      |         EXIT        |    |");
		System.out.println("  |    |  Charger : 5v       |      |  Charger : 5v       |      |  Charger : 7v       |      |  Charger : 5v       |      |       ---------     |    |");
		System.out.println("  |    |  Size    : 165.5mm  |      |  Size    : 165.5mm  |      |  Size    : 165.5mm  |      |  Size    : 165.5mm  |      |                     |    |");
		System.out.println("  |    |  Display : Full Hd  |      |  Display : Full Hd  |      |  Display : Full Hd  |      |  Display : Full Hd  |      |                     |    |");
		System.out.println("  |    |  Processor : 1.6    |      |  Processor : 1.7    |      |  Processor : 1.7    |      |  Processor : 1.9    |      |                     |    |");
		System.out.println("  |    |      GHz Octa-Core  |      |      GHz Octa-Core  |      |     GHz Octa-Core   |      |     GHz Octa-Core   |      |                     |    |");
		System.out.println("  |    |  PRICE : Rs33199/-  |      |  PRICE : Rs34399/-  |      |  PRICE : Rs35499/-  |      |  PRICE : Rs35999/-  |      |                     |    |");  
		System.out.println("  |    |_____________________|      |_____________________|      |_____________________|      |_____________________|      |_____________________|    |");
		System.out.println("  |                                                                                                                                                   |");
		System.out.println("  |             6.                            7.                           8.                           9.                            10.             |");
		System.out.println("  |___________________________________________________________________________________________________________________________________________________|");
		 System.out.println(RESET);
		oneplus2();
	}
	public static void oneplus2()
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
						   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="ONEPLUS NORD 2";ob1[i++]= 26999; 
						   System.out.println("Do you want to continue in this budget (Above 20k) [y/n or Y/N] :");  //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':oneplus2Display();; b=false; break; //CHUSKO KANNA
							   case 'n':oneplus(); b=false; break;                                   //CHUSKO ANNA
							   default : System.out.print("Please enter valid option: ");
							   }
						   }while(b==true);b=false; break;
						   case 'n':
						   {
							   System.out.print("Do you want to see another model in this budget (Above 20k) [y/n or Y/N]:");   //CHUSKO KANNA
							   do
							   {
								   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
								   switch(c1)	
								   {
								   case 'y':oneplus2Display();; b=false; break; //CHUSKO KANNA
								   case 'n':{
									   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
									   do 
									   {
										   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
										   switch(c2)
										   {
										   case 'y': oneplus(); b=false; break; // CHUSKO ANNA BRANDS MARCHALI
										   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="ONEPLUS NORD CE 9";ob1[i++]= 27499; 
					   System.out.println("Do you want to continue in this budget (Above 20k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':oneplus2Display(); b=false; break; //CHUSKO KANNA
						   case 'n':oneplus(); b=false; break;                                   //CHUSKO ANNA
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Above 20k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':oneplus2Display(); b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': oneplus(); b=false; break; // CHUSKO ANNA BRANDS MARCHALI
									   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="ONEPLUS NORD 2T";ob1[i++]= 29499; 
					   System.out.println("Do you want to continue in this budget (Above 20k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':oneplus2Display();; b=false; break; //CHUSKO KANNA
						   case 'n':oneplus(); b=false; break;                                   //CHUSKO ANNA
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Above 20k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':oneplus2Display();; b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': oneplus(); b=false; break; // CHUSKO ANNA BRANDS MARCHALI
									   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="ONEPLUS 10T";ob1[i++]= 30499; 
					   System.out.println("Do you want to continue in this budget (Above 20k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':oneplus2Display(); b=false; break; //CHUSKO KANNA
						   case 'n':oneplus(); b=false; break;                                   //CHUSKO ANNA
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Above 20k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':oneplus2Display();; b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': oneplus(); b=false; break; // CHUSKO ANNA BRANDS MARCHALI
									   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="ONEPLUS 10R";ob1[i++]= 32999; 
					   System.out.println("Do you want to continue in this budget (Above 20k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':oneplus2Display(); b=false; break; //CHUSKO KANNA
						   case 'n':oneplus(); b=false; break;                                   //CHUSKO ANNA
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Above 20k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':oneplus2Display(); b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': oneplus(); b=false; break; // CHUSKO ANNA BRANDS MARCHALI
									   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="ONEPLUS 9RT";ob1[i++]= 33199; 
					   System.out.println("Do you want to continue in this budget (Above 20k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':oneplus2Display();  b=false; break; //CHUSKO KANNA
						   case 'n':oneplus(); b=false; break;                                   //CHUSKO ANNA
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Above 20k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':oneplus2Display();  b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': oneplus(); b=false; break; // CHUSKO ANNA BRANDS MARCHALI
									   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="ONEPLUS 10R";ob1[i++]= 34399; 
					   System.out.println("Do you want to continue in this budget (Above 20k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':oneplus2Display();  b=false; break; //CHUSKO KANNA
						   case 'n':oneplus(); b=false; break;                                   //CHUSKO ANNA
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Above 20k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':oneplus2Display();  b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': oneplus(); b=false; break; // CHUSKO ANNA BRANDS MARCHALI
									   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="ONEPLUS 10 PRO";ob1[i++]= 35499; 
					   System.out.println("Do you want to continue in this budget (Above 20k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':oneplus2Display();  b=false; break; //CHUSKO KANNA
						   case 'n':oneplus(); b=false; break;                                   //CHUSKO ANNA
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Above 20k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':oneplus2Display(); ; b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': oneplus(); b=false; break; // CHUSKO ANNA BRANDS MARCHALI
									   case 'n': display(); b=false; break;
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
			   case 9:
			   {
				   System.out.print("Do you want to add it to cart [y/n or Y/N]:"); //CHUSKO KANNA
				   do
				   {
					   char c=sc.next().toLowerCase().charAt(0);           //CHUSKO KANNA
					   switch(c)
					   {
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="ONEPLUS 11R";ob1[i++]= 35999; 
					   System.out.println("Do you want to continue in this budget (Above 20k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':oneplus2Display(); ; b=false; break; //CHUSKO KANNA
						   case 'n':oneplus(); b=false; break;                                   //CHUSKO ANNA
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Above 20k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':oneplus2Display(); ; b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': oneplus(); b=false; break; // CHUSKO ANNA BRANDS MARCHALI
									   case 'n': display(); b=false; break;
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
			   	case 10:oneplus(); b=false; break; //CHUSKO KANNA
				   default: System.out.print("PLEASE ENTER VALID OPTION: ");
				   }
			}while(b==true);
	}
	public static void oppo()
	{
		 System.out.println(RESET);
		 System.out.println("\t\t\t\t\t\t"+"                          OPPO                         ");  
		 System.out.println("\t\t\t\t\t\t"+"                      -------------                      ");  
		 System.out.println("\t\t\t\t\t\t"+"                      1.Below 10k                         ");  
		 System.out.println("\t\t\t\t\t\t"+"                      2.Between 10k - 25k                    ");
		 System.out.println("\t\t\t\t\t\t"+"                      3.Above 25k                    ");
		 System.out.println("\t\t\t\t\t\t"+"                      4.EXIT FROM OPPO                   "); 
	     System.out.print("SELECT PRICE RANGE : "); System.out.println(RESET);
	       do
			 {
				int p=sc.nextInt();
				switch(p) 
				{
				case 1: oppo1Display();b=false; break;
				case 2: oppo2Display(); b=false; break;
				case 3: oppo3Display(); b=false; break;
				case 4: display();b=false; break;
			    default:
			    	{
			    		System.out.println("Please enter valid option.");
			    		oppo();
			    	}
				}
			 }while(b==true);
	}
	public static void oppo1Display()
	{ System.out.println(RESET);
		System.out.println("   ___________________________________________________________________________________________________________________________________________________");
		System.out.println("  |                                                                                                                                                   |");
		System.out.println("  |     _____________________        _____________________        _____________________        _____________________        _____________________     |");
	  	System.out.println("  |    |      OPPO A17K      |      |      OPPO A16K      |      |      OPPO A16E      |      |      OPPO A12       |      |                     |    |");
		System.out.println("  |    |---------------------|      |---------------------|      |---------------------|      |---------------------|      |                     |    |");
		System.out.println("  |    |  Ram : 6GB          |      |  Ram : 6GB          |      |  Ram : 6GB          |      |  Ram : 8GB          |      |                     |    |");
		System.out.println("  |    |  Rom : 64GB         |      |  Rom : 128GB        |      |  Rom : 128GB        |      |  Rom : 128GB        |      |                     |    |");
		System.out.println("  |    |  Front Camera : 64mp|      |  Front Camera:64mp  |      |  Front Camera : 32mp|      |  Front Camera : 64mp|      |                     |    |");
		System.out.println("  |    |  Back Camera : 100mp|      |  Rear Camera:100mp  |      |  Rear Camera : 150mp|      |  Rear Camera : 100mp|      |                     |    |");
		System.out.println("  |    |  Battery : 5000mah  |      |  Battery : 5500mah  |      |  Battery : 5000mah  |      |  Battery : 5500mah  |      |        EXIT         |    |");
		System.out.println("  |    |  Charger : 10v      |      |  Charger : 10v      |      |  Charger : 15v      |      |  Charger : 15v      |      |      ---------      |    |");
		System.out.println("  |    |  Size    : 165.5mm  |      |  Size : 165.5mm     |      |  Size    : 165.5mm  |      |  Size    : 165.5mm  |      |                     |    |");
		System.out.println("  |    |  Display : Full Sd  |      |  Display : Full Sd  |      |  Display : Full Sd  |      |  Display : Full Sd  |      |                     |    |");
		System.out.println("  |    |  Processor : 6.5    |      |  Processor : 6.7    |      |  Processor : 9.0    |      |  Processor : 10.5   |      |                     |    |");
		System.out.println("  |    |      GHz Octa-Core  |      |      GHz Octa-Core  |      |     GHz Octa-Core   |      |     GHz Octa-Core   |      |                     |    |");
		System.out.println("  |    |  PRICE : Rs7999/-   |      |  PRICE : Rs7499/-   |      |  PRICE : Rs8499/-   |      |  PRICE : Rs8999/-   |      |                     |    |");  
		System.out.println("  |    |_____________________|      |_____________________|      |_____________________|      |_____________________|      |_____________________|    |");
		System.out.println("  |                                                                                                                                                   |");
		System.out.println("  |             1.                            2.                           3.                           4.                            5.              |");
		System.out.println("  |___________________________________________________________________________________________________________________________________________________|");
		 System.out.println(RESET);	oppo1();
	}
	public static void oppo1()
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
						   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="OPPO A17K";ob1[i++]= 7999; 
						   System.out.println("Do you want to continue in this budget (Below 10k) [y/n or Y/N] :");  //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':oppo1Display();  b=false; break; //CHUSKO KANNA
							   case 'n':oppo(); b=false; break;                                   //CHUSKO ANNA
							   default : System.out.print("Please enter valid option: ");
							   }
						   }while(b==true);b=false; break;
						   case 'n':
						   {
							   System.out.print("Do you want to see another model in this budget (Below 10k) [y/n or Y/N]:");   //CHUSKO KANNA
							   do
							   {
								   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
								   switch(c1)	
								   {
								   case 'y':oppo1Display();  b=false; break; //CHUSKO KANNA
								   case 'n':{
									   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
									   do 
									   {
										   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
										   switch(c2)
										   {
										   case 'y': oppo();b=false; break; // CHUSKO ANNA BRANDS MARCHALI
										   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="OPPO A16K";ob1[i++]= 7499; 
					   System.out.println("Do you want to continue in this budget (Below 10k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':oppo1Display();  b=false; break; //CHUSKO KANNA
						   case 'n':oppo(); b=false; break;                                   //CHUSKO ANNA
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Below 10k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':oppo1Display();  b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': oppo();b=false; break; // CHUSKO ANNA BRANDS MARCHALI
									   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="OPPO A16E";ob1[i++]= 8499; 
					   System.out.println("Do you want to continue in this budget (Below 10k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':oppo1Display();  b=false; break; //CHUSKO KANNA
						   case 'n':oppo(); b=false; break;                                   //CHUSKO ANNA
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Below 10k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':oppo1Display();  b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': oppo();b=false; break; // CHUSKO ANNA BRANDS MARCHALI
									   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="OPPO A12";ob1[i++]= 8999; 
					   System.out.println("Do you want to continue in this budget (Below 10k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':oppo1Display();  b=false; break; //CHUSKO KANNA
						   case 'n':oppo(); b=false; break;                                   //CHUSKO ANNA
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Below 10k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':oppo1Display(); ; b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': oppo();b=false; break; // CHUSKO ANNA BRANDS MARCHALI
									   case 'n': display(); b=false; break;
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
			   	case 5:oppo(); b=false; break; //CHUSKO KANNA
				   default: System.out.print("PLEASE ENTER VALID OPTION: ");
				   }
			}while(b==true);
	}
	public static void oppo2Display()
	{ System.out.println(RESET);
		System.out.println("   ___________________________________________________________________________________________________________________________________________________");
		System.out.println("  |                                                                                                                                                   |");
		System.out.println("  |     _____________________        _____________________        _____________________        _____________________        _____________________     |");
		System.out.println("  |    |      OPPO A74       |      |      OPPO K10       |      |    OPPO F19 PRO+    |      |      OPPO A78       |      |    OPPO F21S PRO    |    |");
		System.out.println("  |    |---------------------|      |---------------------|      |---------------------|      |---------------------|      |---------------------|    |");
		System.out.println("  |    |  Ram : 2GB          |      |  Ram : 2GB          |      |  Ram : 2GB          |      |  Ram : 2GB          |      |  Ram : 2GB          |    |");
		System.out.println("  |    |  Rom : 16GB         |      |  Rom : 16GB         |      |  Rom : 16GB         |      |  Rom : 16GB         |      |  Rom : 16GB         |    |");
		System.out.println("  |    |  Front Camera : 16mp|      |  Front Camera : 16mp|      |  Front Camera : 16mp|      |  Front Camera : 16mp|      |  Front Camera : 16mp|    |");
		System.out.println("  |    |  Back Camera : 32mp |      |  Rear Camera : 32mp |      |  Rear Camera : 32mp |      |  Rear Camera : 32mp |      |  Rear Camera : 32mp |    |");
		System.out.println("  |    |  Battery : 3000mah  |      |  Battery : 3000mah  |      |  Battery : 3500mah  |      |  Battery : 4000mah  |      |  Battery : 4000mah  |    |");
		System.out.println("  |    |  Charger : 5v       |      |  Charger : 5v       |      |  Charger : 5v       |      |  Charger : 5v       |      |  Charger : 5v       |    |");
		System.out.println("  |    |  Size    : 165.5mm  |      |  Size    : 165.5mm  |      |  Size    : 165.5mm  |      |  Size    : 165.5mm  |      |  Size : 165.5mm     |    |");
		System.out.println("  |    |  Display : Full Hd  |      |  Display : Full Hd  |      |  Display : Full Hd  |      |  Display : Full Hd  |      |  Display : Full Hd  |    |");
		System.out.println("  |    |  Processor : 1.6    |      |  Processor : 1.7    |      |  Processor : 1.7    |      |  Processor : 1.7    |      |  Processor : 1.6    |    |");
		System.out.println("  |    |      GHz Octa-Core  |      |      GHz Octa-Core  |      |     GHz Octa-Core   |      |     GHz Octa-Core   |      |     GHz Octa-Core   |    |");
		System.out.println("  |    |  PRICE : Rs12499/-  |      |  PRICE : Rs13999/-  |      |  PRICE : Rs13499/-  |      |  PRICE : Rs14799/-  |      |  PRICE : Rs14999/-  |    |");  
		System.out.println("  |    |_____________________|      |_____________________|      |_____________________|      |_____________________|      |_____________________|    |");
		System.out.println("  |                                                                                                                                                   |");
		System.out.println("  |              1.                           2.                           3.                            4.                          5.               |");
		System.out.println("  |     _____________________        _____________________        _____________________        _____________________        _____________________     |");
		System.out.println("  |    |     OPPO RENO 7     |      |     OPPO A56S       |      |      OPPO A53S      |      |      OPPO K10       |      |                     |    |");
		System.out.println("  |    |---------------------|      |---------------------|      |---------------------|      |---------------------|      |                     |    |");
		System.out.println("  |    |  Ram : 2GB          |      |  Ram : 2GB          |      |  Ram : 2GB          |      |  Ram : 4GB          |      |                     |    |");
		System.out.println("  |    |  Rom : 16GB         |      |  Rom : 16GB         |      |  Rom : 16GB         |      |  Rom : 64GB         |      |                     |    |");
		System.out.println("  |    |  Front Camera : 16mp|      |  Front Camera : 16mp|      |  Front Camera : 16mp|      |  Front Camera : 16mp|      |                     |    |");
		System.out.println("  |    |  Back Camera : 32mp |      |  Rear Camera : 32mp |      |  Rear Camera : 32mp |      |  Rear Camera : 32mp |      |                     |    |");
		System.out.println("  |    |  Battery : 3000mah  |      |  Battery : 3000mah  |      |  Battery : 3000mah  |      |  Battery : 3900mah  |      |        EXIT         |    |");
		System.out.println("  |    |  Charger : 5v       |      |  Charger : 5v       |      |  Charger : 7v       |      |  Charger : 5v       |      |      ---------      |    |");
		System.out.println("  |    |  Size    : 165.5mm  |      |  Size    : 165.5mm  |      |  Size    : 165.5mm  |      |  Size    : 165.5mm  |      |                     |    |");
		System.out.println("  |    |  Display : Full Hd  |      |  Display : Full Hd  |      |  Display : Full Hd  |      |  Display : Full Hd  |      |                     |    |");
		System.out.println("  |    |  Processor : 1.6    |      |  Processor : 1.7    |      |  Processor : 1.7    |      |  Processor : 1.7    |      |                     |    |");
		System.out.println("  |    |      GHz Octa-Core  |      |      GHz Octa-Core  |      |     GHz Octa-Core   |      |     GHz Octa-Core   |      |                     |    |");
		System.out.println("  |    |  PRICE : Rs15199/-  |      |  PRICE : Rs15399/-  |      |  PRICE : Rs17499/-  |      |  PRICE : Rs18999/-  |      |                     |    |");  
		System.out.println("  |    |_____________________|      |_____________________|      |_____________________|      |_____________________|      |_____________________|    |");
		System.out.println("  |                                                                                                                                                   |");
		System.out.println("  |             6.                            7.                           8.                           9.                            10.             |");
		System.out.println("  |___________________________________________________________________________________________________________________________________________________|");
		 System.out.println(RESET);	oppo2();
	}
	public static void oppo2()
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
						   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="OPPO A74";ob1[i++]= 12499; 
						   System.out.println("Do you want to continue in this budget (Between 10k - 25k) [y/n or Y/N] :");  //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':oppo2Display(); ; b=false; break; //CHUSKO KANNA
							   case 'n':oppo(); b=false; break;                                   //CHUSKO ANNA
							   default : System.out.print("Please enter valid option: ");
							   }
						   }while(b==true);b=false; break;
						   case 'n':
						   {
							   System.out.print("Do you want to see another model in this budget (Between 10k - 25k) [y/n or Y/N]:");   //CHUSKO KANNA
							   do
							   {
								   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
								   switch(c1)	
								   {
								   case 'y':oppo2Display();oppo2(); b=false; break; //CHUSKO KANNA
								   case 'n':{
									   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
									   do 
									   {
										   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
										   switch(c2)
										   {
										   case 'y': oppo();b=false; break; // CHUSKO ANNA BRANDS MARCHALI
										   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="OPPO K10";ob1[i++]= 13999; 
					   System.out.println("Do you want to continue in this budget (Between 10k - 25k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':oppo2Display();  b=false; break; //CHUSKO KANNA
						   case 'n':oppo(); b=false; break;                                   //CHUSKO ANNA
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Between 10k - 25k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':oppo2Display(); ; b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': oppo();b=false; break; // CHUSKO ANNA BRANDS MARCHALI
									   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="OPPO F19 PRO+";ob1[i++]= 13499; 
					   System.out.println("Do you want to continue in this budget (Between 10k - 25k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':oppo2Display();  b=false; break; //CHUSKO KANNA
						   case 'n':oppo(); b=false; break;                                   //CHUSKO ANNA
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Between 10k - 25k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':oppo2Display();  b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': oppo();b=false; break; // CHUSKO ANNA BRANDS MARCHALI
									   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="OPPO A78";ob1[i++]= 14799; 
					   System.out.println("Do you want to continue in this budget (Between 10k - 25k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':oppo2Display();; b=false; break; //CHUSKO KANNA
						   case 'n':oppo(); b=false; break;                                   //CHUSKO ANNA
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Between 10k - 25k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':oppo2Display();  b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': oppo();b=false; break; // CHUSKO ANNA BRANDS MARCHALI
									   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="OPPO F21S PRO";ob1[i++]= 14999; 
					   System.out.println("Do you want to continue in this budget (Between 10k - 25k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':oppo2Display();  b=false; break; //CHUSKO KANNA
						   case 'n':oppo(); b=false; break;                                   //CHUSKO ANNA
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Between 10k - 25k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':oppo2Display();  b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': oppo();b=false; break; // CHUSKO ANNA BRANDS MARCHALI
									   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="OPPO RENO 7";ob1[i++]= 15199; 
					   System.out.println("Do you want to continue in this budget (Between 10k - 25k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':oppo2Display();  b=false; break; //CHUSKO KANNA
						   case 'n':oppo(); b=false; break;                                   //CHUSKO ANNA
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Between 10k - 25k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':oppo2Display();  b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': oppo();b=false; break; // CHUSKO ANNA BRANDS MARCHALI
									   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="OPPO A56S";ob1[i++]= 15399; 
					   System.out.println("Do you want to continue in this budget (Between 10k - 25k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':oppo2Display();  b=false; break; //CHUSKO KANNA
						   case 'n':oppo(); b=false; break;                                   //CHUSKO ANNA
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Between 10k - 25k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':oppo2Display();  b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': oppo();b=false; break; // CHUSKO ANNA BRANDS MARCHALI
									   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="OPPO A53S";ob1[i++]= 17499; 
					   System.out.println("Do you want to continue in this budget (Between 10k - 25k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':oppo2Display(); b=false; break; //CHUSKO KANNA
						   case 'n':oppo(); b=false; break;                                   //CHUSKO ANNA
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Between 10k - 25k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':oppo2Display();  b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': oppo();b=false; break; // CHUSKO ANNA BRANDS MARCHALI
									   case 'n': display(); b=false; break;
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
			   case 9:
			   {
				   System.out.print("Do you want to add it to cart [y/n or Y/N]:"); //CHUSKO KANNA
				   do
				   {
					   char c=sc.next().toLowerCase().charAt(0);           //CHUSKO KANNA
					   switch(c)
					   {
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="OPPO K10";ob1[i++]= 18999; 
					   System.out.println("Do you want to continue in this budget (Between 10k - 25k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':oppo2Display();  b=false; break; //CHUSKO KANNA
						   case 'n':oppo(); b=false; break;                                   //CHUSKO ANNA
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Between 10k - 25k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':oppo2Display();  b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': oppo();b=false; break; // CHUSKO ANNA BRANDS MARCHALI
									   case 'n': display(); b=false; break;
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
			   	case 10:oppo(); b=false; break; //CHUSKO KANNA
				   default: System.out.print("PLEASE ENTER VALID OPTION: ");
				   }
			}while(b==true);
	}	
	public static void oppo3Display()
	{ System.out.println(RESET);
		System.out.println("   ___________________________________________________________________________________________________________________________________________________");
		System.out.println("  |                                                                                                                                                   |");
		System.out.println("  |     _____________________        _____________________        _____________________        _____________________        _____________________     |");
		System.out.println("  |    |   OPPO RENO 5 PRO   |      |   OPPO RENO 6 PRO   |      |     OPPO 10A        |      |    OPPO RENO 8PRO   |      |                     |    |");
		System.out.println("  |    |---------------------|      |---------------------|      |---------------------|      |---------------------|      |                     |    |");
		System.out.println("  |    |  Ram : 6GB          |      |  Ram : 6GB          |      |  Ram : 6GB          |      |  Ram : 8GB          |      |                     |    |");
		System.out.println("  |    |  Rom : 64GB         |      |  Rom : 128GB        |      |  Rom : 128GB        |      |  Rom : 128GB        |      |                     |    |");
		System.out.println("  |    |  Front Camera : 64mp|      |  Front Camera : 64mp|      |  Front Camera : 32mp|      |  Front Camera : 64mp|      |                     |    |");
		System.out.println("  |    |  Back Camera : 100mp|      |  Rear Camera : 100mp|      |  Rear Camera : 150mp|      |  Rear Camera : 100mp|      |                     |    |");
		System.out.println("  |    |  Battery : 5000mah  |      |  Battery : 5500mah  |      |  Battery : 5000mah  |      |  Battery : 5500mah  |      |        EXIT         |    |");
		System.out.println("  |    |  Charger : 10v      |      |  Charger : 10v      |      |  Charger : 15v      |      |  Charger : 15v      |      |      ---------      |    |");
		System.out.println("  |    |  Size    : 165.5mm  |      |  Size    : 165.5mm  |      |  Size    : 165.5mm  |      |  Size : 165.5mm     |      |                     |    |");
		System.out.println("  |    |  Display : Full Sd  |      |  Display : Full Sd  |      |  Display : Full Sd  |      |  Display : Full Sd  |      |                     |    |");
		System.out.println("  |    |  Processor : 6.5    |      |  Processor : 6.7    |      |  Processor : 9.0    |      |  Processor : 10.5   |      |                     |    |");
		System.out.println("  |    |      GHz Octa-Core  |      |      GHz Octa-Core  |      |     GHz Octa-Core   |      |     GHz Octa-Core   |      |                     |    |");
		System.out.println("  |    |  PRICE : Rs27999/-  |      |  PRICE : Rs27499/-  |      |  PRICE : Rs28499/-  |      |  PRICE : Rs29499/-  |      |                     |    |");  
		System.out.println("  |    |_____________________|      |_____________________|      |_____________________|      |_____________________|      |_____________________|    |");
		System.out.println("  |                                                                                                                                                   |");
		System.out.println("  |             1.                            2.                           3.                           4.                            5.              |");
		System.out.println("  |___________________________________________________________________________________________________________________________________________________|");
		 System.out.println(RESET);
			oppo3();
	}
	public static void oppo3()
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
						   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="OPPO RENO 5 PRO";ob1[i++]= 27999; 
						   System.out.println("Do you want to continue in this budget (Above 25k) [y/n or Y/N] :");  //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':oppo3Display();  b=false; break; //CHUSKO KANNA
							   case 'n':oppo(); b=false; break;                                   //CHUSKO ANNA
							   default : System.out.print("Please enter valid option: ");
							   }
						   }while(b==true);b=false; break;
						   case 'n':
						   {
							   System.out.print("Do you want to see another model in this budget (Above 25k) [y/n or Y/N]:");   //CHUSKO KANNA
							   do
							   {
								   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
								   switch(c1)	
								   {
								   case 'y':oppo3Display(); ; b=false; break; //CHUSKO KANNA
								   case 'n':{
									   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
									   do 
									   {
										   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
										   switch(c2)
										   {
										   case 'y': oppo();b=false; break; // CHUSKO ANNA BRANDS MARCHALI
										   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="OPPO RENO 6 PRO";ob1[i++]= 27499; 
					   System.out.println("Do you want to continue in this budget (Above 25k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':oppo3Display(); ; b=false; break; //CHUSKO KANNA
						   case 'n':oppo(); b=false; break;                                   //CHUSKO ANNA
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Above 25k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':oppo3Display(); ; b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': oppo();b=false; break; // CHUSKO ANNA BRANDS MARCHALI
									   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="OPPO 10A";ob1[i++]= 28499; 
					   System.out.println("Do you want to continue in this budget (Above 25k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':oppo3Display(); ; b=false; break; //CHUSKO KANNA
						   case 'n':oppo(); b=false; break;                                   //CHUSKO ANNA
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Above 25k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':oppo3Display(); ; b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': oppo();b=false; break; // CHUSKO ANNA BRANDS MARCHALI
									   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="OPPO RENO 8 PRO";ob1[i++]= 29499; 
					   System.out.println("Do you want to continue in this budget (Above 25k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':oppo3Display();  b=false; break; //CHUSKO KANNA
						   case 'n':oppo(); b=false; break;                                   //CHUSKO ANNA
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Above 25k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':oppo3Display();  b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': oppo();b=false; break; // CHUSKO ANNA BRANDS MARCHALI
									   case 'n': display(); b=false; break;
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

			   	case 5:oppo(); b=false; break; //CHUSKO KANNA
				   default: System.out.print("PLEASE ENTER VALID OPTION: ");
				   }
			}while(b==true);
	}
	public static void realme()
	{
		 System.out.println(RESET);
		 System.out.println("\t\t\t\t\t\t"+"                          REALME                         ");  
		 System.out.println("\t\t\t\t\t\t"+"                      -------------                      ");  
		 System.out.println("\t\t\t\t\t\t"+"                      1.Below 10k                         ");  
		 System.out.println("\t\t\t\t\t\t"+"                      2.Between 10k - 25k                    ");
		 System.out.println("\t\t\t\t\t\t"+"                      3.Above 25k                    ");
		 System.out.println("\t\t\t\t\t\t"+"                      4.EXIT FROM REALME                   "); 
	     System.out.print("SELECT PRICE RANGE : "); System.out.println(RESET);
	     do
		 {
			int p=sc.nextInt();
			switch(p) 
			{
			case 1: realme1Display(); b=false; break;
			case 2: realme2Display(); b=false; break;
			case 3: realme3Display(); b=false; break;
			case 4: display();b=false; break;
		    default:
		    	{
		    		System.out.println("Please enter valid option.");
		    		realme();
		    	}
			}
		 }while(b==true);
	}
	public static void realme1Display()
	{ System.out.println(RESET);
		System.out.println("   ___________________________________________________________________________________________________________________________________________________");
		System.out.println("  |                                                                                                                                                   |");
		System.out.println("  |     _____________________        _____________________        _____________________        _____________________        _____________________     |");
		System.out.println("  |    |     REALME C30      |      |     REALME C30S     |      |     REALME C11      |      |     REALME C20      |      |     REALME C1       |    |");
		System.out.println("  |    |---------------------|      |---------------------|      |---------------------|      |---------------------|      |---------------------|    |");
		System.out.println("  |    |  Ram : 2GB          |      |  Ram : 2GB          |      |  Ram : 2GB          |      |  Ram : 2GB          |      |  Ram : 2GB          |    |");
		System.out.println("  |    |  Rom: 16GB          |      |  Rom : 16GB         |      |  Rom : 16GB         |      |  Rom : 16GB         |      |  Rom : 16GB         |    |");
		System.out.println("  |    |  Front camera : 16mp|      |  Front camera : 16mp|      |  Front camera : 16mp|      |  Front camera : 16mp|      |  Front camera : 16mp|    |");
		System.out.println("  |    |  Back camera : 32mp |      |  Rear camera : 32mp |      |  Rear camera : 32mp |      |  Rear camera : 32mp |      |  Rear camera : 32mp |    |");
		System.out.println("  |    |  Battery : 3000mah  |      |  Battery : 3000mah  |      |  Battery : 3500mah  |      |  Battery : 4000mah  |      |  Battery : 4000mah  |    |");
		System.out.println("  |    |  Charger : 5v       |      |  Charger : 5v       |      |  Charger : 5v       |      |  Charger : 5v       |      |  Charger : 5v       |    |");
		System.out.println("  |    |  Size : 165.5mm     |      |  Size : 165.5mm     |      |  Size : 165.5mm     |      |  Size : 165.5mm     |      |  Size : 165.5mm     |    |");
		System.out.println("  |    |  Display : Full Hd  |      |  Display : Full Hd  |      |  Display : Full Hd  |      |  Display : Full Hd  |      |  Display : Full Hd  |    |");
		System.out.println("  |    |  Processor : 1.6    |      |  Processor : 1.7    |      |  Processor : 1.7    |      |  Processor : 1.7    |      |  Processor : 1.6    |    |");
		System.out.println("  |    |      GHz Octa-Core  |      |      GHz Octa-Core  |      |     GHz Octa-Core   |      |     GHz Octa-Core   |      |     GHz Octa-Core   |    |");
		System.out.println("  |    |  PRICE : Rs6499/-   |      |  PRICE : Rs6999/-   |      |  PRICE : Rs7499/-   |      |  PRICE : Rs7799/-   |      |  PRICE : Rs7999/-   |    |");  
		System.out.println("  |    |_____________________|      |_____________________|      |_____________________|      |_____________________|      |_____________________|    |");
		System.out.println("  |                                                                                                                                                   |");
		System.out.println("  |              1.                           2.                           3.                            4.                          5.               |");
		System.out.println("  |     _____________________        _____________________        _____________________        _____________________        _____________________     |");
		System.out.println("  |    |   REALME NARZO 50I  |      |     REALME C21      |      |     REALME C30S     |      |  REALME NARZO 50Z   |      |                     |    |");
		System.out.println("  |    |---------------------|      |---------------------|      |---------------------|      |---------------------|      |                     |    |");
		System.out.println("  |    |  Ram : 2GB          |      |  Ram : 2GB          |      |  Ram : 2GB          |      |  Ram : 4GB          |      |                     |    |");
		System.out.println("  |    |  Rom : 16GB         |      |  Rom : 16GB         |      |  Rom : 16GB         |      |  Rom : 64GB         |      |                     |    |");
		System.out.println("  |    |  Front camera : 16mp|      |  Front camera : 16mp|      |  Front camera : 16mp|      |  Front camera : 16mp|      |                     |    |");
		System.out.println("  |    |  Back camera : 32mp |      |  Rear camera : 32mp |      |  Rear camera : 32mp |      |  Rear camera : 32mp |      |                     |    |");
		System.out.println("  |    |  Battery : 3000mah  |      |  Battery : 3000mah  |      |  Battery : 3000mah  |      |  Battery : 3900mah  |      |        EXIT         |    |");
		System.out.println("  |    |  Charger : 5v       |      |  Charger : 5v       |      |  Charger : 7v       |      |  Charger : 5v       |      |      ---------      |    |");
		System.out.println("  |    |  Size : 165.5mm     |      |  Size : 165.5mm     |      |  Size : 165.5mm     |      |  Size : 165.5mm     |      |                     |    |");
		System.out.println("  |    |  Display : Full Hd  |      |  Display : Full Hd  |      |  Display : Full Hd  |      |  Display : Full Hd  |      |                     |    |");
		System.out.println("  |    |  Processor : 1.6    |      |  Processor : 1.7    |      |  Processor : 1.7    |      |  Processor : 1.7    |      |                     |    |");
		System.out.println("  |    |      GHz Octa-Core  |      |      GHz Octa-Core  |      |     GHz Octa-Core   |      |     GHz Octa-Core   |      |                     |    |");
		System.out.println("  |    |  PRICE : Rs8199/-   |      |  PRICE : Rs8399/-   |      |  PRICE : Rs8499/-   |      |  PRICE : Rs8999     |      |                     |    |");  
		System.out.println("  |    |_____________________|      |_____________________|      |_____________________|      |_____________________|      |_____________________|    |");
		System.out.println("  |                                                                                                                                                   |");
		System.out.println("  |             6.                            7.                           8.                           9.                            10.             |");
		System.out.println("  |___________________________________________________________________________________________________________________________________________________|");
		 System.out.println(RESET);	realme1();
	}
	public static void realme1()
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
						   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="REALME C30";ob1[i++]= 6499; 
						   System.out.println("Do you want to continue in this budget (Below 10k) [y/n or Y/N] :");  //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':realme1Display(); b=false; break; //CHUSKO KANNA
							   case 'n':realme(); b=false; break;                                   //CHUSKO ANNA
							   default : System.out.print("Please enter valid option: ");
							   }
						   }while(b==true);b=false; break;
						   case 'n':
						   {
							   System.out.print("Do you want to see another model in this budget (Below 10k) [y/n or Y/N]:");   //CHUSKO KANNA
							   do
							   {
								   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
								   switch(c1)	
								   {
								   case 'y':realme1Display();  b=false; break; //CHUSKO KANNA
								   case 'n':{
									   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
									   do 
									   {
										   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
										   switch(c2)
										   {
										   case 'y': realme();b=false; break; // CHUSKO ANNA BRANDS MARCHALI
										   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="REALME C30S";ob1[i++]= 6999; 
					   System.out.println("Do you want to continue in this budget (Below 10k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':realme1Display(); b=false; break; //CHUSKO KANNA
						   case 'n':realme(); b=false; break;                                   //CHUSKO ANNA
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Below 10k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':realme1Display();  b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': realme();b=false; break; // CHUSKO ANNA BRANDS MARCHALI
									   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="REALME C11";ob1[i++]= 7499; 
					   System.out.println("Do you want to continue in this budget (Below 10k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':realme1Display() ; b=false; break; //CHUSKO KANNA
						   case 'n':realme(); b=false; break;                                   //CHUSKO ANNA
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Below 10k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':realme1Display(); ; b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': realme();b=false; break; // CHUSKO ANNA BRANDS MARCHALI
									   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="REALME C20";ob1[i++]= 7799; 
					   System.out.println("Do you want to continue in this budget (Below 10k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':realme1Display(); ; b=false; break; //CHUSKO KANNA
						   case 'n':realme(); b=false; break;                                   //CHUSKO ANNA
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Below 10k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':realme1Display(); ; b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': realme();b=false; break; // CHUSKO ANNA BRANDS MARCHALI
									   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="REALME C1";ob1[i++]= 7999; 
					   System.out.println("Do you want to continue in this budget (Below 10k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':realme1Display(); ; b=false; break; //CHUSKO KANNA
						   case 'n':realme(); b=false; break;                                   //CHUSKO ANNA
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Below 10k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':realme1Display(); b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': realme();b=false; break; // CHUSKO ANNA BRANDS MARCHALI
									   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="REALME NARZO 50I";ob1[i++]= 8199; 
					   System.out.println("Do you want to continue in this budget (Below 10k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':realme1Display() ; b=false; break; //CHUSKO KANNA
						   case 'n':realme(); b=false; break;                                   //CHUSKO ANNA
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Below 10k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':realme1Display(); ; b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': realme();b=false; break; // CHUSKO ANNA BRANDS MARCHALI
									   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="REALME C21";ob1[i++]= 8399; 
					   System.out.println("Do you want to continue in this budget (Below 10k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':realme1Display(); ; b=false; break; //CHUSKO KANNA
						   case 'n':realme(); b=false; break;                                   //CHUSKO ANNA
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Below 10k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':realme1Display(); ; b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': realme();b=false; break; // CHUSKO ANNA BRANDS MARCHALI
									   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="REALME C30S";ob1[i++]= 8499; 
					   System.out.println("Do you want to continue in this budget (Below 10k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':realme1Display();; b=false; break; //CHUSKO KANNA
						   case 'n':realme(); b=false; break;                                   //CHUSKO ANNA
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Below 10k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':realme1Display();; b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': realme();b=false; break; // CHUSKO ANNA BRANDS MARCHALI
									   case 'n': display(); b=false; break;
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
			   case 9:
			   {
				   System.out.print("Do you want to add it to cart [y/n or Y/N]:"); //CHUSKO KANNA
				   do
				   {
					   char c=sc.next().toLowerCase().charAt(0);           //CHUSKO KANNA
					   switch(c)
					   {
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="REALME NARZO 50Z";ob1[i++]= 8999; 
					   System.out.println("Do you want to continue in this budget (Below 10k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':realme1Display();; b=false; break; //CHUSKO KANNA
						   case 'n':realme(); b=false; break;                                   //CHUSKO ANNA
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Below 10k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':realme1Display();; b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': realme();b=false; break; // CHUSKO ANNA BRANDS MARCHALI
									   case 'n': display(); b=false; break;
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
			   	case 10:realme(); b=false; break; //CHUSKO KANNA
				   default: System.out.print("PLEASE ENTER VALID OPTION: ");
				   }
			}while(b==true);
	}
	public static void realme2Display()
	{ System.out.println(RESET);
		System.out.println("   ___________________________________________________________________________________________________________________________________________________");
		System.out.println("  |                                                                                                                                                   |");
		System.out.println("  |     _____________________        _____________________        _____________________        _____________________        _____________________     |");
		System.out.println("  |    |    REALME NARZO 50  |      |    REALME 9I        |      |    REALME  9        |      |    REALME 9 SE      |      | REALME NARZO 50 PRO |    |");
		System.out.println("  |    |---------------------|      |---------------------|      |---------------------|      |---------------------|      |---------------------|    |");
		System.out.println("  |    |  Ram : 2GB          |      |  Ram : 2GB          |      |  Ram : 2GB          |      |  Ram : 2GB          |      |  Ram : 2GB          |    |");
		System.out.println("  |    |  Rom : 16GB         |      |  Rom : 16GB         |      |  Rom : 16GB         |      |  Rom : 16GB         |      |  Rom : 16GB         |    |");
		System.out.println("  |    |  Front Camera : 16mp|      |  Front Camera : 16mp|      |  Front Camera : 16mp|      |  Front Camera : 16mp|      |  Front Camera : 16mp|    |");
		System.out.println("  |    |  Back Camera : 32mp |      |  Rear Camera : 32mp |      |  Rear Camera : 32mp |      |  Rear Camera : 32mp |      |  Rear Camera : 32mp |    |");
		System.out.println("  |    |  Battery : 3000mah  |      |  Battery : 3000mah  |      |  Battery : 3500mah  |      |  Battery : 4000mah  |      |  Battery : 4000mah  |    |");
		System.out.println("  |    |  Charger : 5v       |      |  Charger : 5v       |      |  Charger : 5v       |      |  Charger : 5v       |      |  Charger : 5v       |    |");
		System.out.println("  |    |  Size    : 165.5mm  |      |  Size    : 165.5mm  |      |  Size    : 165.5mm  |      |  Size    : 165.5mm  |      |  Size    : 165.5mm  |    |");
		System.out.println("  |    |  Display : Full Hd  |      |  Display : Full Hd  |      |  Display : Full Hd  |      |  Display : Full Hd  |      |  Display : Full Hd  |    |");
		System.out.println("  |    |  Processor : 1.6    |      |  Processor : 1.7    |      |  Processor : 1.7    |      |  Processor : 1.7    |      |  Processor : 1.6    |    |");
		System.out.println("  |    |      GHz Octa-Core  |      |      GHz Octa-Core  |      |     GHz Octa-Core   |      |     GHz Octa-Core   |      |     GHz Octa-Core   |    |");
		System.out.println("  |    |  PRICE : Rs11499/-  |      |  PRICE : Rs12999/-  |      |  PRICE : Rs13499/-  |      |  PRICE : Rs13799/-  |      |  PRICE : Rs13999/-  |    |");  
		System.out.println("  |    |_____________________|      |_____________________|      |_____________________|      |_____________________|      |_____________________|    |");
		System.out.println("  |                                                                                                                                                   |");
		System.out.println("  |              1.                           2.                           3.                            4.                          5.               |");
		System.out.println("  |     _____________________        _____________________        _____________________        _____________________        _____________________     |");
		System.out.println("  |    |    REALME 8S 5G     |      |    REALME 9 PRO     |      |    REALME 8 PRO     |      |  REALME 10 PRO PLUS |      |                     |    |");
		System.out.println("  |    |---------------------|      |---------------------|      |---------------------|      |---------------------|      |                     |    |");
		System.out.println("  |    |  Ram : 2GB          |      |  Ram : 2GB          |      |  Ram : 2GB          |      |  Ram : 4GB          |      |                     |    |");
		System.out.println("  |    |  Rom : 16GB         |      |  Rom : 16GB         |      |  Rom : 16GB         |      |  Rom : 64GB         |      |                     |    |");
		System.out.println("  |    |  Front Camera : 16mp|      |  Front Camera : 16mp|      |  Front Camera : 16mp|      |  Front Camera : 16mp|      |                     |    |");
		System.out.println("  |    |  Back Camera : 32mp |      |  Rear Camera : 32mp |      |  Rear Camera : 32mp |      |  Rear Camera : 32mp |      |                     |    |");
		System.out.println("  |    |  Battery : 3000mah  |      |  Battery : 3000mah  |      |  Battery : 3000mah  |      |  Battery : 3900mah  |      |        EXIT         |    |");
		System.out.println("  |    |  Charger : 5v       |      |  Charger : 5v       |      |  Charger : 7v       |      |  Charger : 5v       |      |      ---------      |    |");
		System.out.println("  |    |  Size    : 165.5mm  |      |  Size    : 165.5mm  |      |  Size    : 165.5mm  |      |  Size    : 165.5mm  |      |                     |    |");
		System.out.println("  |    |  Display : Full Hd  |      |  Display : Full Hd  |      |  Display : Full Hd  |      |  Display : Full Hd  |      |                     |    |");
		System.out.println("  |    |  Processor : 1.6    |      |  Processor : 1.7    |      |  Processor : 1.7    |      |  Processor : 1.7    |      |                     |    |");
		System.out.println("  |    |      GHz Octa-Core  |      |      GHz Octa-Core  |      |     GHz Octa-Core   |      |     GHz Octa-Core   |      |                     |    |");
		System.out.println("  |    |  PRICE : Rs14199/-  |      |  PRICE : Rs14399/-  |      |  PRICE : Rs17499/-  |      |  PRICE : Rs18999/-  |      |                     |    |");  
		System.out.println("  |    |_____________________|      |_____________________|      |_____________________|      |_____________________|      |_____________________|    |");
		System.out.println("  |                                                                                                                                                   |");
		System.out.println("  |             6.                            7.                           8.                           9.                            10.             |");
		System.out.println("  |___________________________________________________________________________________________________________________________________________________|");
		 System.out.println(RESET);
			realme2();
	}
	public static void realme2()
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
						   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="REALME NARZO 50";ob1[i++]= 11499; 
						   System.out.println("Do you want to continue in this budget (Between 10k - 25k) [y/n or Y/N] :");  //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':realme2Display();; b=false; break; //CHUSKO KANNA
							   case 'n':realme(); b=false; break;                                   //CHUSKO ANNA
							   default : System.out.print("Please enter valid option: ");
							   }
						   }while(b==true);b=false; break;
						   case 'n':
						   {
							   System.out.print("Do you want to see another model in this budget (Between 10k - 25k) [y/n or Y/N]:");   //CHUSKO KANNA
							   do
							   {
								   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
								   switch(c1)	
								   {
								   case 'y':realme2Display();; b=false; break; //CHUSKO KANNA
								   case 'n':{
									   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
									   do 
									   {
										   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
										   switch(c2)
										   {
										   case 'y': realme();b=false; break; // CHUSKO ANNA BRANDS MARCHALI
										   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="REALME 9I";ob1[i++]= 12999; 
					   System.out.println("Do you want to continue in this budget (Between 10k - 25k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':realme2Display(); b=false; break; //CHUSKO KANNA
						   case 'n':realme(); b=false; break;                                   //CHUSKO ANNA
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Between 10k - 25k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':realme2Display(); b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': realme();b=false; break; // CHUSKO ANNA BRANDS MARCHALI
									   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="REALME 9";ob1[i++]= 13499; 
					   System.out.println("Do you want to continue in this budget (Between 10k - 25k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':realme2Display(); b=false; break; //CHUSKO KANNA
						   case 'n':realme(); b=false; break;                                   //CHUSKO ANNA
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Between 10k - 25k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':realme2Display(); b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': realme();b=false; break; // CHUSKO ANNA BRANDS MARCHALI
									   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="REALME 9 SE";ob1[i++]= 13799; 
					   System.out.println("Do you want to continue in this budget (Between 10k - 25k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':realme2Display(); b=false; break; //CHUSKO KANNA
						   case 'n':realme(); b=false; break;                                   //CHUSKO ANNA
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Between 10k - 25k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':realme2Display();; b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': realme();b=false; break; // CHUSKO ANNA BRANDS MARCHALI
									   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="REALME NARZO 50 PRO";ob1[i++]= 13999; 
					   System.out.println("Do you want to continue in this budget (Between 10k - 25k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':realme2Display();; b=false; break; //CHUSKO KANNA
						   case 'n':realme(); b=false; break;                                   //CHUSKO ANNA
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Between 10k - 25k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':realme2Display();; b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': realme();b=false; break; // CHUSKO ANNA BRANDS MARCHALI
									   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="REALME 8S 5G";ob1[i++]= 14199; 
					   System.out.println("Do you want to continue in this budget (Between 10k - 25k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':realme2Display(); b=false; break; //CHUSKO KANNA
						   case 'n':realme(); b=false; break;                                   //CHUSKO ANNA
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Between 10k - 25k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':realme2Display(); b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': realme();b=false; break; // CHUSKO ANNA BRANDS MARCHALI
									   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="REALME 9 PRO";ob1[i++]= 14399; 
					   System.out.println("Do you want to continue in this budget (Between 10k - 25k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':realme2Display();; b=false; break; //CHUSKO KANNA
						   case 'n':realme(); b=false; break;                                   //CHUSKO ANNA
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Between 10k - 25k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':realme2Display();; b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': realme();b=false; break; // CHUSKO ANNA BRANDS MARCHALI
									   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="REALME 8 PRO";ob1[i++]= 17499; 
					   System.out.println("Do you want to continue in this budget (Between 10k - 25k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':realme2Display();; b=false; break; //CHUSKO KANNA
						   case 'n':realme(); b=false; break;                                   //CHUSKO ANNA
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Between 10k - 25k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':realme2Display();; b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': realme();b=false; break; // CHUSKO ANNA BRANDS MARCHALI
									   case 'n': display(); b=false; break;
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
			   case 9:
			   {
				   System.out.print("Do you want to add it to cart [y/n or Y/N]:"); //CHUSKO KANNA
				   do
				   {
					   char c=sc.next().toLowerCase().charAt(0);           //CHUSKO KANNA
					   switch(c)
					   {
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="REALME 10 PRO PLUS";ob1[i++]= 18999; 
					   System.out.println("Do you want to continue in this budget (Between 10k - 25k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':realme2Display();; b=false; break; //CHUSKO KANNA
						   case 'n':realme(); b=false; break;                                   //CHUSKO ANNA
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Between 10k - 25k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':realme2Display();; b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': realme();b=false; break; // CHUSKO ANNA BRANDS MARCHALI
									   case 'n': display(); b=false; break;
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
			   	case 10:realme(); b=false; break; //CHUSKO KANNA
				   default: System.out.print("PLEASE ENTER VALID OPTION: ");
				   }
			}while(b==true);
	}
	
	public static void realme3Display()
	{ System.out.println(RESET);
		System.out.println("   ___________________________________________________________________________________________________________________________________________________");
	  	System.out.println("  |                                                                                                                                                   |");
	  	System.out.println("  |     _____________________        _____________________        _____________________        _____________________        _____________________     |");
		System.out.println("  |    |  REALME GT NEO 3T   |      |  REALME GT 2 PRO    |      |    REALME GT 2      |      |   REALME GT NEO 2   |      |                     |    |");
		System.out.println("  |    |---------------------|      |---------------------|      |---------------------|      |---------------------|      |                     |    |");
		System.out.println("  |    |  Ram : 6GB          |      |  Ram : 6GB          |      |  Ram : 6GB          |      |  Ram : 8GB          |      |                     |    |");
		System.out.println("  |    |  Rom : 64GB         |      |  Rom : 128GB        |      |  Rom : 128GB        |      |  Rom : 128GB        |      |                     |    |");
		System.out.println("  |    |  Front Camera : 64mp|      |  Front Camera : 64mp|      |  Front Camera : 32mp|      |  Front Camera : 64mp|      |                     |    |");
		System.out.println("  |    |  Back Camera : 100mp|      |  Rear Camera : 100mp|      |  Rear Camera : 150mp|      |  Rear Camera : 100mp|      |                     |    |");
		System.out.println("  |    |  Battery : 5000mah  |      |  Battery : 5500mah  |      |  Battery : 5000mah  |      |  Battery : 5500mah  |      |        EXIT         |    |");
		System.out.println("  |    |  Charger : 10v      |      |  Charger : 10v      |      |  Charger : 15v      |      |  Charger : 15v      |      |      --------       |    |");
		System.out.println("  |    |  Size    : 165.5mm  |      |  Size    : 165.5mm  |      |  Size    : 165.5mm  |      |  Size    : 165.5mm  |      |                     |    |");
		System.out.println("  |    |  Display : Full Sd  |      |  Display : Full Sd  |      |  Display : Full Sd  |      |  Display : Full Sd  |      |                     |    |");
		System.out.println("  |    |  Processor : 6.5    |      |  Processor : 6.7    |      |  Processor : 9.0    |      |  Processor : 10.5   |      |                     |    |");
		System.out.println("  |    |      GHz Octa-Core  |      |      GHz Octa-Core  |      |     GHz Octa-Core   |      |     GHz Octa-Core   |      |                     |    |");
		System.out.println("  |    |  PRICE : Rs27999/-  |      |  PRICE : Rs28499/-  |      |  PRICE : Rs28999/-  |      |  PRICE : Rs29499/-  |      |                     |    |");  
		System.out.println("  |    |_____________________|      |_____________________|      |_____________________|      |_____________________|      |_____________________|    |");
		System.out.println("  |                                                                                                                                                   |");
		System.out.println("  |             1.                            2.                           3.                           4.                            5.              |");
		System.out.println("  |___________________________________________________________________________________________________________________________________________________|");
		 System.out.println(RESET);	realme3();
	}
	public static void realme3()
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
						   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="REALME GT NEO 3T";ob1[i++]= 27999; 
						   System.out.println("Do you want to continue in this budget (Above 25k) [y/n or Y/N] :");  //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':realme3Display();; b=false; break; //CHUSKO KANNA
							   case 'n':realme(); b=false; break;                                   //CHUSKO ANNA
							   default : System.out.print("Please enter valid option: ");
							   }
						   }while(b==true);b=false; break;
						   case 'n':
						   {
							   System.out.print("Do you want to see another model in this budget (Above 25k) [y/n or Y/N]:");   //CHUSKO KANNA
							   do
							   {
								   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
								   switch(c1)	
								   {
								   case 'y':realme3Display();; b=false; break; //CHUSKO KANNA
								   case 'n':{
									   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
									   do 
									   {
										   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
										   switch(c2)
										   {
										   case 'y': realme();b=false; break; // CHUSKO ANNA BRANDS MARCHALI
										   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="REALME GT 2 PRO";ob1[i++]= 28499; 
					   System.out.println("Do you want to continue in this budget (Above 25k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':realme3Display(); b=false; break; //CHUSKO KANNA
						   case 'n':realme(); b=false; break;                                   //CHUSKO ANNA
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Above 25k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':realme3Display();; b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': realme();b=false; break; // CHUSKO ANNA BRANDS MARCHALI
									   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="REALME GT 2";ob1[i++]= 28999; 
					   System.out.println("Do you want to continue in this budget (Above 25k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':realme3Display();; b=false; break; //CHUSKO KANNA
						   case 'n':realme(); b=false; break;                                   //CHUSKO ANNA
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Above 25k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':realme3Display(); b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': realme();b=false; break; // CHUSKO ANNA BRANDS MARCHALI
									   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="REALME GT NEO 2";ob1[i++]= 29499; 
					   System.out.println("Do you want to continue in this budget (Above 25k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':realme3Display(); b=false; break; //CHUSKO KANNA
						   case 'n':realme(); b=false; break;                                   //CHUSKO ANNA
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Above 25k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':realme3Display();; b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y': realme();b=false; break; // CHUSKO ANNA BRANDS MARCHALI
									   case 'n': display(); b=false; break;
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
			   }case 5:realme(); b=false; break; //CHUSKO KANNA
				   default: System.out.print("PLEASE ENTER VALID OPTION: ");
				   }
			}while(b==true);
	}
	public static void iqoo()
	{
		 System.out.println(RESET);
		 System.out.println("\t\t\t\t\t\t"+"                          IQOO                         ");  
		 System.out.println("\t\t\t\t\t\t"+"                      -------------                      ");  
		 System.out.println("\t\t\t\t\t\t"+"                      1.Below 10k                         ");  
		 System.out.println("\t\t\t\t\t\t"+"                      2.Between 10k - 25k                    ");
		 System.out.println("\t\t\t\t\t\t"+"                      3.Above 25k                    ");
		 System.out.println("\t\t\t\t\t\t"+"                      4.EXIT FROM IQOO                   "); 
	     System.out.print("SELECT PRICE RANGE : "); System.out.println(RESET);
	    do
		 {
			int p=sc.nextInt();
			switch(p) 
			{
			case 1: iqoo1Display(); b=false; break;
			case 2: iqoo2Display(); b=false; break;
			case 3: iqoo3Display();b=false; break;
			case 4: display();b=false; break;
		    default:
		    	{
		    		System.out.println("Please enter valid option.");
		    		iqoo();;
		    	}
			}
		 }while(b==true);
	}
	public static void iqoo1Display()
	{ System.out.println(RESET);
		System.out.println("   ___________________________________________________________________________________________________________________________________________________");
  		System.out.println("  |                                                                                                                                                   |");
  		System.out.println("  |     _____________________        _____________________        _____________________        _____________________        _____________________     |");
		System.out.println("  |    |    IQOO Z6 LITE     |      |       IQOO Z6       |      |    IQOO Z6 PRO      |      |    IQOO Z5 LITE     |      |                     |    |");
		System.out.println("  |    |---------------------|      |---------------------|      |---------------------|      |---------------------|      |                     |    |");
		System.out.println("  |    |  Ram : 6GB          |      |  Ram : 6GB          |      |  Ram : 6GB          |      |  Ram : 8GB          |      |                     |    |");
		System.out.println("  |    |  Rom : 64GB         |      |  Rom : 128GB        |      |  Rom : 128GB        |      |  Rom : 128GB        |      |                     |    |");
		System.out.println("  |    |  Front Camera : 64mp|      |  Front Camera : 64mp|      |  Front Camera : 32mp|      |  Front Camera : 64mp|      |                     |    |");
		System.out.println("  |    |  Back Camera : 100mp|      |  Rear Camera : 100mp|      |  Rear Camera : 150mp|      |  Rear Camera : 100mp|      |                     |    |");
		System.out.println("  |    |  Battery : 5000mah  |      |  Battery : 5500mah  |      |  Battery : 5000mah  |      |  Battery : 5500mah  |      |        EXIT         |    |");
		System.out.println("  |    |  Charger : 10v      |      |  Charger : 10v      |      |  Charger : 15v      |      |  Charger : 15v      |      |      --------       |    |");
		System.out.println("  |    |  Size    : 165.5mm  |      |  Size    : 165.5mm  |      |  Size    : 165.5mm  |      |  Size    : 165.5mm  |      |                     |    |");
		System.out.println("  |    |  Display : Full Sd  |      |  Display : Full Sd  |      |  Display : Full Sd  |      |  Display : Full Sd  |      |                     |    |");
		System.out.println("  |    |  Processor : 6.5    |      |  Processor : 6.7    |      |  Processor : 9.0    |      |  Processor : 10.5   |      |                     |    |");
		System.out.println("  |    |      GHz Octa-Core  |      |      GHz Octa-Core  |      |     GHz Octa-Core   |      |     GHz Octa-Core   |      |                     |    |");
		System.out.println("  |    |  PRICE : Rs7999/-   |      |  PRICE : Rs7499/-   |      |  PRICE : Rs8499/-   |      |  PRICE : Rs8999/-   |      |                     |    |");  
		System.out.println("  |    |_____________________|      |_____________________|      |_____________________|      |_____________________|      |_____________________|    |");
		System.out.println("  |                                                                                                                                                   |");
		System.out.println("  |             1.                            2.                           3.                           4.                            5.              |");
		System.out.println("  |___________________________________________________________________________________________________________________________________________________|");
		 System.out.println(RESET);
			iqoo1();
	}
	public static void iqoo1()
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
						   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="IQOO Z6 LITE";ob1[i++]= 7999; 
						   System.out.println("Do you want to continue in this budget (Below 10k) [y/n or Y/N] :");  //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':iqoo1Display(); b=false; break; //CHUSKO KANNA
							   case 'n':iqoo(); b=false; break;                                   //CHUSKO ANNA
							   default : System.out.print("Please enter valid option: ");
							   }
						   }while(b==true);b=false; break;
						   case 'n':
						   {
							   System.out.print("Do you want to see another model in this budget (Below 10k) [y/n or Y/N]:");   //CHUSKO KANNA
							   do
							   {
								   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
								   switch(c1)	
								   {
								   case 'y':iqoo1Display(); b=false; break; //CHUSKO KANNA
								   case 'n':{
									   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
									   do 
									   {
										   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
										   switch(c2)
										   {
										   case 'y':   iqoo();b=false; break; // CHUSKO ANNA BRANDS MARCHALI
										   case 'n': display(); b=false; break;
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
				   }case 2:
			   {
				   System.out.print("Do you want to add it to cart [y/n or Y/N]:"); //CHUSKO KANNA
				   do
				   {
					   char c=sc.next().toLowerCase().charAt(0);           //CHUSKO KANNA
					   switch(c)
					   {
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="IQOO Z6";ob1[i++]= 7499; 
					   System.out.println("Do you want to continue in this budget (Below 10k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':iqoo1Display(); b=false; break; //CHUSKO KANNA
						   case 'n':iqoo();b=false; break;                                   //CHUSKO ANNA
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Below 10k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':iqoo1Display(); b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y':   iqoo();b=false; break; // CHUSKO ANNA BRANDS MARCHALI
									   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="IQOO Z6 PRO";ob1[i++]= 8499; 
					   System.out.println("Do you want to continue in this budget (Below 10k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':iqoo1Display(); b=false; break; //CHUSKO KANNA
						   case 'n':iqoo(); b=false; break;                                   //CHUSKO ANNA
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Below 10k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':iqoo1Display();; b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y':   iqoo();b=false; break; // CHUSKO ANNA BRANDS MARCHALI
									   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="IQOO Z5 LITE";ob1[i++]= 8999; 
					   System.out.println("Do you want to continue in this budget (Below 10k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':iqoo1Display(); b=false; break; //CHUSKO KANNA
						   case 'n':iqoo(); b=false; break;                                   //CHUSKO ANNA
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Below 10k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':iqoo1Display(); b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y':   iqoo();b=false; break; // CHUSKO ANNA BRANDS MARCHALI
									   case 'n': display(); b=false; break;
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
			   	case 5:iqoo(); b=false; break; //CHUSKO KANNA
				   default: System.out.print("PLEASE ENTER VALID OPTION: ");
				   }
			}while(b==true);
	}
	
	public static void iqoo2Display()
	{ System.out.println(RESET);
		System.out.println("   ___________________________________________________________________________________________________________________________________________________");
		System.out.println("  |                                                                                                                                                   |");
		System.out.println("  |     _____________________        _____________________        _____________________        _____________________        _____________________     |");
		System.out.println("  |    |    IQOO Z6 PRO+     |      |    IQOO NEO 6       |      |    IQOO NEO 7       |      |    IQOO 9 SE        |      |                     |    |");
		System.out.println("  |    |---------------------|      |---------------------|      |---------------------|      |---------------------|      |                     |    |");
		System.out.println("  |    |  Ram : 6GB          |      |  Ram : 6GB          |      |  Ram : 6GB          |      |  Ram : 8GB          |      |                     |    |");
		System.out.println("  |    |  Rom : 64GB         |      |  Rom : 128GB        |      |  Rom : 128GB        |      |  Rom : 128GB        |      |                     |    |");
		System.out.println("  |    |  Front Camera : 64mp|      |  Front Camera : 64mp|      |  Front Camera : 32mp|      |  Front Camera : 64mp|      |                     |    |");
		System.out.println("  |    |  Back Camera : 100mp|      |  Rear Camera : 100mp|      |  Rear Camera : 150mp|      |  Rear Camera : 100mp|      |                     |    |");
		System.out.println("  |    |  Battery : 5000mah  |      |  Battery : 5500mah  |      |  Battery : 5000mah  |      |  Battery : 5500mah  |      |         EXIT        |    |");
		System.out.println("  |    |  Charger : 10v      |      |  Charger : 10v      |      |  Charger : 15v      |      |  Charger : 15v      |      |       --------      |    |");
		System.out.println("  |    |  Size    : 165.5mm  |      |  Size    : 165.5mm  |      |  Size    : 165.5mm  |      |  Size    : 165.5mm  |      |                     |    |");
		System.out.println("  |    |  Display : Full Sd  |      |  Display : Full Sd  |      |  Display : Full Sd  |      |  Display : Full Sd  |      |                     |    |");
		System.out.println("  |    |  Processor : 6.5    |      |  Processor : 6.7    |      |  Processor : 9.0    |      |  Processor : 10.5   |      |                     |    |");
		System.out.println("  |    |      GHz Octa-Core  |      |      GHz Octa-Core  |      |     GHz Octa-Core   |      |     GHz Octa-Core   |      |                     |    |");
		System.out.println("  |    |  PRICE : Rs12999/-  |      |  PRICE : Rs13499/-  |      |  PRICE : Rs14499/-  |      |  PRICE : Rs15499/-  |      |                     |    |");  
		System.out.println("  |    |_____________________|      |_____________________|      |_____________________|      |_____________________|      |_____________________|    |");
		System.out.println("  |                                                                                                                                                   |");
		System.out.println("  |             1.                            2.                           3.                           4.                            5.              |");
		System.out.println("  |___________________________________________________________________________________________________________________________________________________|");
		 System.out.println(RESET);	iqoo2();
	}
	public static void iqoo2()
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
						   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="IQOO Z6 PRO+";ob1[i++]= 12999; 
						   System.out.println("Do you want to continue in this budget (Between 10k - 25k) [y/n or Y/N] :");  //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':iqoo2Display();b=false; break; //CHUSKO KANNA
							   case 'n':iqoo(); b=false; break;                                   //CHUSKO ANNA
							   default : System.out.print("Please enter valid option: ");
							   }
						   }while(b==true);b=false; break;
						   case 'n':
						   {
							   System.out.print("Do you want to see another model in this budget (Between 10k - 25k) [y/n or Y/N]:");   //CHUSKO KANNA
							   do
							   {
								   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
								   switch(c1)	
								   {
								   case 'y':iqoo2Display(); b=false; break; //CHUSKO KANNA
								   case 'n':{
									   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
									   do 
									   {
										   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
										   switch(c2)
										   {
										   case 'y':   iqoo();b=false; break; // CHUSKO ANNA BRANDS MARCHALI
										   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="IQOO NEO 6";ob1[i++]= 13499; 
					   System.out.println("Do you want to continue in this budget (Between 10k - 25k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':iqoo2Display(); b=false; break; //CHUSKO KANNA
						   case 'n':iqoo(); b=false; break;                                   //CHUSKO ANNA
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Between 10k - 25k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':iqoo2Display();b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y':   iqoo();b=false; break; // CHUSKO ANNA BRANDS MARCHALI
									   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="IQOO NEO 7";ob1[i++]= 14499; 
					   System.out.println("Do you want to continue in this budget (Between 10k - 25k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':iqoo2Display(); b=false; break; //CHUSKO KANNA
						   case 'n':iqoo(); b=false; break;                                   //CHUSKO ANNA
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Between 10k - 25k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':iqoo2Display(); b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y':   iqoo();b=false; break; // CHUSKO ANNA BRANDS MARCHALI
									   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="IQOO 9 SE";ob1[i++]= 15499; 
					   System.out.println("Do you want to continue in this budget (Between 10k - 25k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':iqoo2Display();b=false; break; //CHUSKO KANNA
						   case 'n':iqoo(); b=false; break;                                   //CHUSKO ANNA
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Between 10k - 25k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':iqoo2Display(); b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y':   iqoo();b=false; break; // CHUSKO ANNA BRANDS MARCHALI
									   case 'n': display(); b=false; break;
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
			   	case 5:iqoo(); b=false; break; //CHUSKO KANNA
				   default: System.out.print("PLEASE ENTER VALID OPTION: ");
				   }
			}while(b==true);
	}
	
	public static void iqoo3Display()
	{ System.out.println(RESET);
		System.out.println("   ___________________________________________________________________________________________________________________________________________________");
		System.out.println("  |                                                                                                                                                   |");
		System.out.println("  |     _____________________        _____________________        _____________________        _____________________        _____________________     |");
		System.out.println("  |    |     IQOO 9T         |      |    IQOO 9 PRO       |      |     IQOO Z5         |      |    IQOO 10 PRO      |      |                     |    |");
		System.out.println("  |    |---------------------|      |---------------------|      |---------------------|      |---------------------|      |                     |    |");
		System.out.println("  |    |  Ram : 6GB          |      |  Ram : 6GB          |      |  Ram : 6GB          |      |  Ram : 8GB          |      |                     |    |");
		System.out.println("  |    |  Rom : 64GB         |      |  Rom : 128GB        |      |  Rom : 128GB        |      |  Rom : 128GB        |      |                     |    |");
		System.out.println("  |    |  Front Camera : 64mp|      |  Front Camera : 64mp|      |  Front Camera : 32mp|      |  Front Camera : 64mp|      |                     |    |");
		System.out.println("  |    |  Back Camera : 100mp|      |  Rear Camera : 100mp|      |  Rear Camera : 150mp|      |  Rear Camera : 100mp|      |                     |    |");
		System.out.println("  |    |  Battery : 5000mah  |      |  Battery : 5500mah  |      |  Battery : 5000mah  |      |  Battery : 5500mah  |      |        EXIT         |    |");
		System.out.println("  |    |  Charger : 10v      |      |  Charger : 10v      |      |  Charger : 15v      |      |  Charger : 15v      |      |      --------       |    |");
		System.out.println("  |    |  Size    : 165.5mm  |      |  Size    : 165.5mm  |      |  Size    : 165.5mm  |      |  Size    : 165.5mm  |      |                     |    |");
		System.out.println("  |    |  Display : Full Sd  |      |  Display : Full Sd  |      |  Display : Full Sd  |      |  Display : Full Sd  |      |                     |    |");
		System.out.println("  |    |  Processor : 6.5    |      |  Processor : 6.7    |      |  Processor : 9.0    |      |  Processor : 10.5   |      |                     |    |");
		System.out.println("  |    |      GHz Octa-Core  |      |      GHz Octa-Core  |      |     GHz Octa-Core   |      |     GHz Octa-Core   |      |                     |    |");
		System.out.println("  |    |  PRICE : Rs27999/-  |      |  PRICE : Rs28499/-  |      |  PRICE : Rs29399/-  |      |  PRICE : Rs29499/-  |      |                     |    |");  
		System.out.println("  |    |_____________________|      |_____________________|      |_____________________|      |_____________________|      |_____________________|    |");
		System.out.println("  |                                                                                                                                                   |");
		System.out.println("  |             1.                            2.                           3.                           4.                            5.              |");
		System.out.println("  |___________________________________________________________________________________________________________________________________________________|");
		 System.out.println(RESET);	iqoo3();
	}
	public static void iqoo3()
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
						   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="IQOO 9T";ob1[i++]= 27999; 
						   System.out.println("Do you want to continue in this budget (Above 25k) [y/n or Y/N] :");  //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':iqoo3Display(); b=false; break; //CHUSKO KANNA
							   case 'n':iqoo(); b=false; break;                                   //CHUSKO ANNA
							   default : System.out.print("Please enter valid option: ");
							   }
						   }while(b==true);b=false; break;
						   case 'n':
						   {
							   System.out.print("Do you want to see another model in this budget (Above 25k) [y/n or Y/N]:");   //CHUSKO KANNA
							   do
							   {
								   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
								   switch(c1)	
								   {
								   case 'y':iqoo3Display();b=false; break; //CHUSKO KANNA
								   case 'n':{
									   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
									   do 
									   {
										   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
										   switch(c2)
										   {
										   case 'y':   iqoo();b=false; break; // CHUSKO ANNA BRANDS MARCHALI
										   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="IQOO 9 PRO";ob1[i++]= 28499; 
					   System.out.println("Do you want to continue in this budget (Above 25k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':iqoo3Display(); b=false; break; //CHUSKO KANNA
						   case 'n':iqoo(); b=false; break;                                   //CHUSKO ANNA
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Above 25k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':iqoo3Display(); b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y':   iqoo();b=false; break; // CHUSKO ANNA BRANDS MARCHALI
									   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="IQOO Z5";ob1[i++]= 29399; 
					   System.out.println("Do you want to continue in this budget (Above 25k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':iqoo3Display(); b=false; break; //CHUSKO KANNA
						   case 'n':iqoo(); b=false; break;                                   //CHUSKO ANNA
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Above 25k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':iqoo3Display();; b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y':   iqoo();b=false; break; // CHUSKO ANNA BRANDS MARCHALI
									   case 'n': display(); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="IQOO 10 PRO";ob1[i++]= 29499; 
					   System.out.println("Do you want to continue in this budget (Above 25k) [y/n or Y/N] :");  //CHUSKO KANNA
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
						   switch(c1)	
						   {
						   case 'y':iqoo3Display(); b=false; break; //CHUSKO KANNA
						   case 'n':iqoo(); b=false; break;                                   //CHUSKO ANNA
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);b=false; break;
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this budget (Above 25k) [y/n or Y/N]:");   //CHUSKO KANNA
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
							   switch(c1)	
							   {
							   case 'y':iqoo3Display(); b=false; break; //CHUSKO KANNA
							   case 'n':{
								   System.out.print("Do you want to continue in this brand [y/n or Y/N]:");  //CHUSKO KANNA
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);  //CHUSKO KANNA
									   switch(c2)
									   {
									   case 'y':   iqoo();b=false; break; // CHUSKO ANNA BRANDS MARCHALI
									   case 'n': display(); b=false; break;
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
			   	case 5:iqoo(); b=false; break; //CHUSKO KANNA
				   default: System.out.print("PLEASE ENTER VALID OPTION: ");
				   }
			}while(b==true);
	}
	public static void main(String[] args) {
		display();
	}

}
