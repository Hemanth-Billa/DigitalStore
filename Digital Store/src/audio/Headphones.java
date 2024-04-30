package audio;

import java.util.Scanner;

import home_screen.Main_Home;

public class Headphones 
{
	public static String ob[]=new String[100];
	public static float ob1[]=new float[100];
	static  Scanner sc=new Scanner(System.in);
	private static final String RESET = "\033[0m";  // Text Reset
	static int i=0;
	static boolean b=true;
//   public static void main(String[] args) 
//   {
//	   Menu();
//   }
	   public static void Menu()
	   {
		   System.out.println(RESET);
	System.out.println("                                                                             ");
	System.out.println("\t\t\t"+"\t\t                     * * * * * * * * * * * * * * * * * * * * *                   ");
	System.out.println("\t\t\t"+"\t\t                    * o o o o o o o o o o o o o o o o o o o o *                  ");
	System.out.println("\t\t\t"+"\t\t                   * o * * * * * * * * * * * * * * * * * * * o *                 ");
	System.out.println("\t\t\t"+"\t\t                 * o *             HEAD PHONES              * o *                ");
	System.out.println("\t\t\t"+"\t\t                * o *             --------------             * o *               ");
	System.out.println("\t\t\t"+"\t\t               * o *              1. BOAT                     * o *              ");
	System.out.println("\t\t\t"+"\t\t              * o *               2. SONY                      * o *             ");
	System.out.println("\t\t\t"+"\t\t              * o *               3. JBL                        * o *            ");
	System.out.println("\t\t\t"+"\t\t              * o *               4. SENNHEISER                 * o *            ");
	System.out.println("\t\t\t"+"\t\t              * o *               5. SKULLCANDY                 * o *            ");
	System.out.println("\t\t\t"+"\t\t              * o *               6. ZEBRONICS                  * o *            ");
	System.out.println("\t\t\t"+"\t\t              * o *               7. EXIT FROM                  * o *            "); // ADDED EXIT HERE
	System.out.println("\t\t\t"+"\t\t              *---*                  HEADPHONES                 *---*            ");
	System.out.println("\t\t\t"+"\t\t           **o*---*o**                                       **o*---*o**         ");
	System.out.println("\t\t\t"+"\t\t          *o*        *o*                                    *o*        *o*       ");
	System.out.println("\t\t\t"+"\t\t         *o*          *o*                                  *o*          *o*      ");
	System.out.println("\t\t\t"+"\t\t        *o*            *o*                                *o*            *o*     ");
	System.out.println("\t\t\t"+"\t\t       *o*     NO       *o*                              *o*      ONLY    *o*    ");
	System.out.println("\t\t\t"+"\t\t      *o*     NOISE      *o*                            *o*      MUSIC     *o*   ");
	System.out.println("\t\t\t"+"\t\t      *o*                *o*                             *o*               *o*    ");
	System.out.println("\t\t\t"+"\t\t       *o               o*                                *o               o*    ");
	System.out.println("\t\t\t"+"\t\t        * o o o o o o o *                                  * o o o o o o o *     ");
	System.out.println("\t\t\t"+"\t\t         * * * * * * * *                                     * * * * * * * *     ");
	System.out.println("\t\t\t"+"\t\t                                                                                 ");
	System.out.println(RESET);
	  Menuswitch();
	   }
	public static void Menuswitch()
	{
	System.out.print("PLEASE ENTER YOUR PREFERRED BRAND :  ");
    int c=sc.nextInt();
	boolean b=true;
	do
	{
		switch(c)
		{
		case 1:Boatmenu(); b=false; break;
		case 2:Sonymenu(); b=false; break;
		case 3:JBLmenu();  b=false; break;
		case 4:Senmenu();  b=false;  break;
		case 5:Skullmenu();  b=false;  break;
	    case 6:Zebmenu();   b=false;  break;
	    case 7:Main_Home.audios(); b=false;  break; // ADDED EXIT HERE AND CALLING AUDIOS METHOD FROM HOME_SCREEN PACKAGE WITH CLASS NAME
		default: 
			{
				System.out.println();
				System.out.print("\t\t\t\t\t\t\t\t     "+"PLEASE ENTER VALID OPTION..."+"\n");
		        Menu(); b=false; break;
			}
		}
	}while(b==true);
	
   }
	   public static void Boatmenu()
	   {System.out.println(RESET);
		 System.out.println("\t\t\t\t\t\t"+"                         BOAT                            ");  
		 System.out.println("\t\t\t\t\t\t"+"                      -------------                      ");  
		 System.out.println("\t\t\t\t\t\t"+"                      1.Below 2K                         ");  
		 System.out.println("\t\t\t\t\t\t"+"                      2.Between 2K-3K                    ");
		 System.out.println("\t\t\t\t\t\t"+"                      3.EXIT FROM BOAT                   "); 
		 System.out.println(RESET);// MADE CHANGES HERE
		 Boatswitch();
	   }
	   public static void Boatswitch()
	   {
	     System.out.print("PLEASE ENTER THE PRICE RANGE  :");
		 do
		 {
			 int p=sc.nextInt();
			switch(p) 
			{
			case 1: Boat2k(); b=false; break;
			case 2: Boat2k3k(); b=false; break;
			case 3: Menu();b=false; break;
		    default:
		    	{
		    		System.out.print("Please enter valid option:");
		    		Boatmenu(); 
		    		
		    	}
			}
		 }while(b==true);
	   }
	   public static void Boat2k()
	   {   System.out.println(RESET);
		 System.out.println("\t\t"+" _________________________________________________________________________________________________________________________________");  
		 System.out.println("\t\t"+"|                                                                                                                                 |");  
		 System.out.println("\t\t"+"|    ___________________       ___________________       ___________________       ___________________       ___________________  |");  
		 System.out.println("\t\t"+"|   |1.BOAT ROCKERZ 518 |     |2.BOAT ROCKERZ 410 |     |3.450 DC EDITION   |     |4.450MASABA EDITION|     |5.BOAT ROCKERZ 450 | |");  
		 System.out.println("\t\t"+"|   |-------------------|     |-------------------|     |-------------------|     |-------------------|     |-------------------| |");  
		 System.out.println("\t\t"+"|   |.WIRELESS          |     |.WIRELESS          |     |.WIRELESS          |     |.WIRELESS          |     |.WIRELESS          | |");  
		 System.out.println("\t\t"+"|   |.Version: 4.1      |     |.Version: 4.1      |     |.Version: 5.0      |     |.Version: 4.2      |     |.Version: 4.2      | |");  
		 System.out.println("\t\t"+"|   |.Range : 10meters  |     |.Noise Cancellation|     |.Range: 10 meters  |     |.Range: 10meters   |     |.Range: 10meters   | |");  
		 System.out.println("\t\t"+"|   |.TalkTime:10 Hours |     |.TalkTime:10Hours  |     |.TalkTime:15Hours  |     |.TalkTime:8Hours   |     |.TalkTime:8Hours   | |");  
		 System.out.println("\t\t"+"|   |.StandbyTime:300Hrs|     |.StandbyTime:300Hrs|     |.StandbyTime:300Hrs|     |.StandbyTime:400Hrs|     |.StandbyTime:400Hrs| |");  
		 System.out.println("\t\t"+"|   |.Chargingtime:2Hrs |     |.Chargingtime:2Hrs |     |.Chargingtime:3Hrs |     |.Chargingtime:3Hrs |     |.Chargingtime:3Hrs | |");  
		 System.out.println("\t\t"+"|   |.Price : 1190/-    |     |.Price : 1450/-    |     |.Price : 1599/-    |     |.Price : 1370/-    |     |.Price : 1250/-    | |");  
		 System.out.println("\t\t"+"|   |___________________|     |___________________|     |___________________|     |___________________|     |___________________| |");  
		 System.out.println("\t\t"+"|                                                                                                                                 |");  
		 System.out.println("\t\t"+"|                                                                                                                                 |");  
		 System.out.println("\t\t"+"|    ___________________       ___________________       ___________________       ___________________                            |");  
		 System.out.println("\t\t"+"|   |6.BOAT ROCKERZ 558 |     |7.BOAT ROCKERZ 610 |     |8.ROCKERZ 450 PRO  |     |                   |                           |");  
		 System.out.println("\t\t"+"|   |-------------------|     |-------------------|     |-------------------|     |                   |                           |");  
		 System.out.println("\t\t"+"|   |.WIRELESS          |     |.WIRELESS          |     |.WIRELESS          |     |       9.          |                           |");  
		 System.out.println("\t\t"+"|   |.Version: 5.0      |     |.Version: 4.1      |     |.Version: 5.0      |     |                   |                           |");  
		 System.out.println("\t\t"+"|   |.Range : 10meters  |     |.Range : 10meters  |     |.Range : 10meters  |     |       EXIT        |                           |");  
		 System.out.println("\t\t"+"|   |.TalkTime:70 Hours |     |.TalkTime:8 Hours  |     |.TalkTime:70Hours  |     |     ---------     |                           |");  
		 System.out.println("\t\t"+"|   |.StandbyTime:300Hrs|     |.StandbyTime:200Hrs|     |.StandbyTime:300Hrs|     |                   |                           |");  
		 System.out.println("\t\t"+"|   |.Chargingtime:3Hrs |     |.Chargingtime:3Hrs |     |.Chargingtime:3Hrs |     |                   |                           |");  
		 System.out.println("\t\t"+"|   |.Price : 1790/-    |     |.Price : 1990/-    |     |.Price : 1890/-    |     |                   |                           |");  
		 System.out.println("\t\t"+"|   |___________________|     |___________________|     |___________________|     |___________________|                           |");  
		 System.out.println("\t\t"+"|                                                                                                                                 |");    
		 System.out.println("\t\t"+"|_________________________________________________________________________________________________________________________________|"); 
		 System.out.println(RESET);Boat2kswitch();
	   }
	   public static void Boat2kswitch()
	   {
		 System.out.print("PLEASE CHOOSE YOUR PREFERRED MODEL :");
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
						 case 'y':System.out.println("Your Item is added to cart .");ob[i]="BOAT ROCKERS 518";ob1[i++]=1190; 
						          System.out.print("Do you want to continue shopping in this Budget (Below 2K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
				 		  do
				 		  {
				 			char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
				 			switch(c1)	
							{
							case 'y':Boat2k(); b=false; break; // MADE CHANGES HEREE
							case 'n':Boatmenu(); b=false; break; // MADE CHANGES HEREE
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
									case 'y':Boat2k(); b=false; break;
									case 'n':
										{
											System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
											do 
											{
												char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
												switch(c2)
												{
												case 'y': Boatmenu(); b=false; break;
												case 'n': Menu(); b=false; break;
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
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="BOAT ROCKERS 410";ob1[i++]=1450; 
					 System.out.print("Do you want to continue shopping in this Budget (Below 2K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':Boat2k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':Boatmenu(); b=false; break; // MADE CHANGES HEREE
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
							 case 'y':Boat2k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': Boatmenu(); b=false; break;
									 case 'n': Menu(); b=false; break;
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
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="BOAT 450 DC EDITION";ob1[i++]=1599; 
					 System.out.print("Do you want to continue shopping in this Budget (Below 2K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':Boat2k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':Boatmenu(); b=false; break; // MADE CHANGES HEREE
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
							 case 'y':Boat2k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': Boatmenu(); b=false; break;
									 case 'n': Menu(); b=false; break;
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
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="BOAT 450 MASABA EDITION";ob1[i++]=1370; 
					 System.out.print("Do you want to continue shopping in this Budget (Below 2K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':Boat2k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':Boatmenu(); b=false; break; // MADE CHANGES HEREE
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
							 case 'y':Boat2k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': Boatmenu(); b=false; break;
									 case 'n': Menu(); b=false; break;
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
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="BOAT ROCKERS 450";ob1[i++]=1250; 
					 System.out.print("Do you want to continue shopping in this Budget (Below 2K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':Boat2k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':Boatmenu(); b=false; break; // MADE CHANGES HEREE
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
							 case 'y':Boat2k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': Boatmenu(); b=false; break;
									 case 'n': Menu(); b=false; break;
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
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="BOAT ROCKERS 558";ob1[i++]=1790; 
					 System.out.print("Do you want to continue shopping in this Budget (Below 2K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':Boat2k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':Boatmenu(); b=false; break; // MADE CHANGES HEREE
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
							 case 'y':Boat2k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': Boatmenu(); b=false; break;
									 case 'n': Menu(); b=false; break;
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
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="BOAT ROCKERS 610";ob1[i++]=1990; 
					 System.out.print("Do you want to continue shopping in this Budget (Below 2K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':Boat2k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':Boatmenu(); b=false; break; // MADE CHANGES HEREE
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
							 case 'y':Boat2k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': Boatmenu(); b=false; break;
									 case 'n': Menu(); b=false; break;
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
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="BOAT ROCKERS 450 PRO";ob1[i++]=1890; 
					 System.out.print("Do you want to continue shopping in this Budget (Below 2K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':Boat2k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':Boatmenu(); b=false; break; // MADE CHANGES HEREE
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
							 case 'y':Boat2k(); b=false; break;
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': Boatmenu(); b=false; break;
									 case 'n': Menu(); b=false; break;
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
			 case 9:  Boatmenu(); b=false; break;
			 default:  System.out.print("Please enter valid option:");
			 }
		 }while(b==true);
	   }
	   public static void Boat2k3k()
	   {System.out.println(RESET);
		     System.out.println("\t\t"+" __________________________________________________________________________________________________________________________________");  
			 System.out.println("\t\t"+"|                                                                                                                                  |");  
			 System.out.println("\t\t"+"|    ____________________       ___________________       ___________________       ___________________       ___________________  |");  
			 System.out.println("\t\t"+"|   |1.BOAT ROCKERZ 550  |     |2.NIRVANA 717 ANC  |     |3.NIRVANA 751 ANC  |     |4.BOAT ROCKERZ 510 |     |                   | |");  
			 System.out.println("\t\t"+"|   |--------------------|     |-------------------|     |-------------------|     |-------------------|     |                   | |");  
			 System.out.println("\t\t"+"|   |.WIRELESS           |     |.WIRELESS          |     |.WIRELESS          |     |.WIRELESS          |     |        5.         | |");  
			 System.out.println("\t\t"+"|   |.Version: 5.0       |     |.Version: 5.0      |     |.Version: 5.0      |     |.Version: 5.0      |     |                   | |");  
			 System.out.println("\t\t"+"|   |.Range : 10meters   |     |.Noise Cancellation|     |.Range: 10 meters  |     |.Range: 10meters   |     |       EXIT        | |");  
			 System.out.println("\t\t"+"|   |.TalkTime:20 Hours  |     |.TalkTime:15Hours  |     |.TalkTime:65Hours  |     |.TalkTime:10Hours  |     |     --------      | |");  
			 System.out.println("\t\t"+"|   |.StandbyTime:180Hrs |     |.StandbyTime:300Hrs|     |.StandbyTime:180Hrs|     |.StandbyTime:180Hrs|     |                   | |");  
			 System.out.println("\t\t"+"|   |.Chargingtime:2.5Hrs|     |.Chargingtime:3Hrs |     |.Chargingtime:1Hrs |     |.Chargingtime:2Hrs |     |                   | |");  
			 System.out.println("\t\t"+"|   |.Price : 2190/-     |     |.Price : 2290/-    |     |.Price : 2690/-    |     |.Price : 2990/-    |     |                   | |");  
			 System.out.println("\t\t"+"|   |____________________|     |___________________|     |___________________|     |___________________|     |___________________| |");  
			 System.out.println("\t\t"+"|                                                                                                                                  |");  			   
			 System.out.println("\t\t"+"|__________________________________________________________________________________________________________________________________|");  
			 System.out.println(RESET); Boat2k3kswitch(); 
	   }
	   public static void  Boat2k3kswitch()
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
							 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="BOAT ROCKERS 550";ob1[i++]=2190; 
							          System.out.print("Do you want to continue shopping in this Budget (Between 2K - 3K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 		  do
					 		  {
					 			char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					 			switch(c1)	
								{
								case 'y':Boat2k3k(); b=false; break; // MADE CHANGES HEREE
								case 'n':Boatmenu(); b=false; break; // MADE CHANGES HEREE
					 			default : System.out.print("Please enter valid option: ");
								}
					 		  }while(b==true);  break;
							 case 'n':
								 {
									 System.out.print("Do you want to see another model in this Budget (Between 2K - 3K) [y/n or Y/N]:");  //MADE CHANGES HERE
										do
										{
											char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
										switch(c1)	
										{
										case 'y':Boat2k3k(); b=false; break; //MADE CHANGES HERE
										case 'n':
											{
												System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
												do 
												{
													char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
													switch(c2)
													{
													case 'y': Boatmenu(); b=false; break;
													case 'n': Menu(); b=false; break;
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="BOAT NIVARANA 717 ANC";ob1[i++]=2290; 
						 System.out.print("Do you want to continue shopping in this Budget (Between 2K - 3K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':Boat2k3k(); b=false; break; // MADE CHANGES HEREE
							 case 'n':Boatmenu(); b=false; break; // MADE CHANGES HEREE
							 default : System.out.print("Please enter valid option: ");
							 }
						 }while(b==true);  break;
						 case 'n':
						 {
							 System.out.print("Do you want to see another model in this Budget (Between 2K - 3K) [y/n or Y/N]:");  //MADE CHANGES HERE
							 do
							 {
								 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								 switch(c1)	
								 {
								 case 'y':Boat2k3k(); b=false; break; //MADE CHANGES HERE
								 case 'n':
								 {
									 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
									 do 
									 {
										 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
										 switch(c2)
										 {
										 case 'y': Boatmenu(); b=false; break;
										 case 'n': Menu(); b=false; break;
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="BOAT NIVARANA 751 ANC";ob1[i++]=2690; 
						 System.out.print("Do you want to continue shopping in this Budget (Between 2K - 3K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':Boat2k3k(); b=false; break; // MADE CHANGES HEREE
							 case 'n':Boatmenu(); b=false; break; // MADE CHANGES HEREE
							 default : System.out.print("Please enter valid option: ");
							 }
						 }while(b==true);  break;
						 case 'n':
						 {
							 System.out.print("Do you want to see another model in this Budget (Between 2K - 3K) [y/n or Y/N]:");  //MADE CHANGES HERE
							 do
							 {
								 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								 switch(c1)	
								 {
								 case 'y':Boat2k3k(); b=false; break; //MADE CHANGES HERE
								 case 'n':
								 {
									 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
									 do 
									 {
										 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
										 switch(c2)
										 {
										 case 'y': Boatmenu(); b=false; break;
										 case 'n': Menu(); b=false; break;
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="BOAT ROCKERS 510";ob1[i++]=2990;  
						 System.out.print("Do you want to continue shopping in this Budget (Between 2K - 3K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':Boat2k3k(); b=false; break; // MADE CHANGES HEREE
							 case 'n':Boatmenu(); b=false; break; // MADE CHANGES HEREE
							 default : System.out.print("Please enter valid option: ");
							 }
						 }while(b==true);  break;
						 case 'n':
						 {
							 System.out.print("Do you want to see another model in this Budget (Between 2K - 3K) [y/n or Y/N]:");  //MADE CHANGES HERE
							 do
							 {
								 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								 switch(c1)	
								 {
								 case 'y':Boat2k3k(); b=false; break; //MADE CHANGES HERE
								 case 'n':
								 {
									 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
									 do 
									 {
										 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
										 switch(c2)
										 {
										 case 'y': Boatmenu(); b=false; break;
										 case 'n': Menu(); b=false; break;
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
		  
			   case 5: Boatmenu(); b=false; break;
			   default: System.out.print("PLEASE ENTER VALID OPTION: ");
			   }
		   }while(b==true); 
	   }
	   
	   public static void Sonymenu()
	   {System.out.println(RESET);
		     System.out.println("\t\t\t\t\t\t"+"                         SONY                            ");  
			 System.out.println("\t\t\t\t\t\t"+"                      -------------                      ");  
			 System.out.println("\t\t\t\t\t\t"+"                      1.Between 2K-10K                   ");  
			 System.out.println("\t\t\t\t\t\t"+"                      2.Above 10K                        ");
			 System.out.println("\t\t\t\t\t\t"+"                      3.EXIT FROM SONY                   "); // MADE CHANGES HERE
			 System.out.println(RESET); Sonyswitch();
	   }
	   public static void Sonyswitch()
	   {
		   System.out.print("PLEASE ENTER THE PRICE RANGE  :");
			 do
			 {
				 int p=sc.nextInt();
				switch(p) 
				{
				case 1: Between2K10K(); b=false; break;
				case 2: Above10K(); b=false; break;
				case 3: Menu();b=false; break;
			    default:
			    	{
			    		System.out.print("Please enter valid option:");
			    		Sonymenu(); 
			    		
			    	}
				}
			 }while(b==true);   
	   }
	   public static void Between2K10K()
	   {System.out.println(RESET);
		     System.out.println("\t\t"+" _________________________________________________________________________________________________________________________________");  
			 System.out.println("\t\t"+"|                                                                                                                                 |");  
			 System.out.println("\t\t"+"|    ___________________       ___________________       ___________________       ___________________       ___________________  |");  
			 System.out.println("\t\t"+"|   |1.SONY MDR-XB450AP |     |2.SONY WH-CH510    |     |3.SONY WH-CH500    |     |4.SONY MDR-HW300K  |     |5.SONY WH-CH400    | |");  
			 System.out.println("\t\t"+"|   |-------------------|     |-------------------|     |-------------------|     |-------------------|     |-------------------| |");  
			 System.out.println("\t\t"+"|   |.WIRELESS          |     |.WIRELESS          |     |.WIRELESS          |     |.WIRELESS          |     |.WIRELESS          | |");  
			 System.out.println("\t\t"+"|   |.Version: 5.1      |     |.Version: 5.0      |     |.Version: 5.0      |     |.Version: 5.2      |     |.Version: 5.0      | |");  
			 System.out.println("\t\t"+"|   |.Range : 10meters  |     |.Noise Cancellation|     |.Range: 10 meters  |     |.Range: 10meters   |     |.Range: 10meters   | |");  
			 System.out.println("\t\t"+"|   |.TalkTime:10 Hours |     |.TalkTime:10Hours  |     |.TalkTime:15Hours  |     |.TalkTime:8Hours   |     |.TalkTime:8Hours   | |");  
			 System.out.println("\t\t"+"|   |.StandbyTime:300Hrs|     |.StandbyTime:300Hrs|     |.StandbyTime:300Hrs|     |.StandbyTime:400Hrs|     |.StandbyTime:400Hrs| |");  
			 System.out.println("\t\t"+"|   |.Chargingtime:2Hrs |     |.Chargingtime:2Hrs |     |.Chargingtime:3Hrs |     |.Chargingtime:3Hrs |     |.Chargingtime:3Hrs | |");  
			 System.out.println("\t\t"+"|   |.Price : 2190/-    |     |.Price : 2790/-    |     |.Price : 3190/-    |     |.Price : 3490/-    |     |.Price : 3990/-    | |");  
			 System.out.println("\t\t"+"|   |___________________|     |___________________|     |___________________|     |___________________|     |___________________| |");  
			 System.out.println("\t\t"+"|                                                                                                                                 |");  
			 System.out.println("\t\t"+"|                                                                                                                                 |");  
			 System.out.println("\t\t"+"|    ___________________       ___________________       ___________________       ___________________       ___________________  |");  
			 System.out.println("\t\t"+"|   |6.SONY MDR-XB450BV |     |7.SONY WH-CH700N   |     |8.SONY MDR-XB950AP |     |9.SONY MDR-7506    |     |                   | |");  
			 System.out.println("\t\t"+"|   |-------------------|     |-------------------|     |-------------------|     |-------------------|     |                   | |");  
			 System.out.println("\t\t"+"|   |.WIRELESS          |     |.WIRELESS          |     |.WIRELESS          |     |.WIRELESS          |     |       10.         | |");  
			 System.out.println("\t\t"+"|   |.Version: 5.2      |     |.Version: 5.1      |     |.Version: 5.0      |     |.Version: 5.2      |     |                   | |");  
			 System.out.println("\t\t"+"|   |.Range : 10meters  |     |.Range : 10meters  |     |.Range : 10meters  |     |.Range : 10meters  |     |      EXIT         | |");  
			 System.out.println("\t\t"+"|   |.TalkTime:70 Hours |     |.TalkTime:8 Hours  |     |.TalkTime:70Hours  |     |.TalkTime:70Hours  |     |     --------      | |");  
			 System.out.println("\t\t"+"|   |.StandbyTime:300Hrs|     |.StandbyTime:200Hrs|     |.StandbyTime:300Hrs|     |.StandbyTime:300Hrs|     |                   | |");  
			 System.out.println("\t\t"+"|   |.Chargingtime:3Hrs |     |.Chargingtime:3Hrs |     |.Chargingtime:3Hrs |     |.Chargingtime:3Hrs |     |                   | |");  
			 System.out.println("\t\t"+"|   |.Price : 4190/-    |     |.Price : 5190/-    |     |.Price : 6190/-    |     |.Price : 9990/-    |     |                   | |");  
			 System.out.println("\t\t"+"|   |___________________|     |___________________|     |___________________|     |___________________|     |___________________| |");  
			 System.out.println("\t\t"+"|                                                                                                                                 |");    
			 System.out.println("\t\t"+"|_________________________________________________________________________________________________________________________________|"); 
			 System.out.println(RESET); Between2K10Kswitch(); 
	   }
	   public static void Between2K10Kswitch()
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SONY MDR-XB 450 AP";ob1[i++]=2190; 
						          System.out.print("Do you want to continue shopping in this Budget (Between 2K - 10K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
				 		  do
				 		  {
				 			char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
				 			switch(c1)	
							{
							case 'y':Between2K10K(); b=false; break; // MADE CHANGES HEREE
							case 'n':Sonymenu(); b=false; break; // MADE CHANGES HEREE
				 			default : System.out.print("Please enter valid option: ");
							}
				 		  }while(b==true);  break;
						 case 'n':
							 {
								 System.out.print("Do you want to see another model in this Budget (Between 2K - 10K) [y/n or Y/N]:");  //MADE CHANGES HERE
									do
									{
										char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									switch(c1)	
									{
									case 'y':Between2K10K(); b=false; break; //MADE CHANGES HERE
									case 'n':
										{
											System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
											do 
											{
												char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
												switch(c2)
												{
												case 'y': Sonymenu(); b=false; break; //MADE CHANGES HERE
												case 'n': Menu(); b=false; break;
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SONY WH-CH510";ob1[i++]=2790;
						 System.out.print("Do you want to continue shopping in this Budget (Between 2K - 10K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':Between2K10K(); b=false; break; // MADE CHANGES HEREE
							 case 'n':Sonymenu(); b=false; break; // MADE CHANGES HEREE
							 default : System.out.print("Please enter valid option: ");
							 }
						 }while(b==true);  break;
						 case 'n':
						 {
							 System.out.print("Do you want to see another model in this Budget (Between 2K - 10K) [y/n or Y/N]:");  //MADE CHANGES HERE
							 do
							 {
								 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								 switch(c1)	
								 {
								 case 'y':Between2K10K(); b=false; break; //MADE CHANGES HERE
								 case 'n':
								 {
									 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
									 do 
									 {
										 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
										 switch(c2)
										 {
										 case 'y': Sonymenu(); b=false; break; //MADE CHANGES HERE
										 case 'n': Menu(); b=false; break;
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SONY WH-CH500";ob1[i++]=3190;
						 System.out.print("Do you want to continue shopping in this Budget (Between 2K - 10K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':Between2K10K(); b=false; break; // MADE CHANGES HEREE
							 case 'n':Sonymenu(); b=false; break; // MADE CHANGES HEREE
							 default : System.out.print("Please enter valid option: ");
							 }
						 }while(b==true);  break;
						 case 'n':
						 {
							 System.out.print("Do you want to see another model in this Budget (Between 2K - 10K) [y/n or Y/N]:");  //MADE CHANGES HERE
							 do
							 {
								 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								 switch(c1)	
								 {
								 case 'y':Between2K10K(); b=false; break; //MADE CHANGES HERE
								 case 'n':
								 {
									 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
									 do 
									 {
										 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
										 switch(c2)
										 {
										 case 'y': Sonymenu(); b=false; break; //MADE CHANGES HERE
										 case 'n': Menu(); b=false; break;
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SONY MDR-HW300K";ob1[i++]=3490;
						 System.out.print("Do you want to continue shopping in this Budget (Between 2K - 10K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':Between2K10K(); b=false; break; // MADE CHANGES HEREE
							 case 'n':Sonymenu(); b=false; break; // MADE CHANGES HEREE
							 default : System.out.print("Please enter valid option: ");
							 }
						 }while(b==true);  break;
						 case 'n':
						 {
							 System.out.print("Do you want to see another model in this Budget (Between 2K - 10K) [y/n or Y/N]:");  //MADE CHANGES HERE
							 do
							 {
								 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								 switch(c1)	
								 {
								 case 'y':Between2K10K(); b=false; break; //MADE CHANGES HERE
								 case 'n':
								 {
									 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
									 do 
									 {
										 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
										 switch(c2)
										 {
										 case 'y': Sonymenu(); b=false; break; //MADE CHANGES HERE
										 case 'n': Menu(); b=false; break;
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SONY WH-CH400";ob1[i++]=3990;
						 System.out.print("Do you want to continue shopping in this Budget (Between 2K - 10K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':Between2K10K(); b=false; break; // MADE CHANGES HEREE
							 case 'n':Sonymenu(); b=false; break; // MADE CHANGES HEREE
							 default : System.out.print("Please enter valid option: ");
							 }
						 }while(b==true);  break;
						 case 'n':
						 {
							 System.out.print("Do you want to see another model in this Budget (Between 2K - 10K) [y/n or Y/N]:");  //MADE CHANGES HERE
							 do
							 {
								 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								 switch(c1)	
								 {
								 case 'y':Between2K10K(); b=false; break; //MADE CHANGES HERE
								 case 'n':
								 {
									 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
									 do 
									 {
										 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
										 switch(c2)
										 {
										 case 'y': Sonymenu(); b=false; break; //MADE CHANGES HERE
										 case 'n': Menu(); b=false; break;
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SONY MDR-XB450BV";ob1[i++]=4190;
						 System.out.print("Do you want to continue shopping in this Budget (Between 2K - 10K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':Between2K10K(); b=false; break; // MADE CHANGES HEREE
							 case 'n':Sonymenu(); b=false; break; // MADE CHANGES HEREE
							 default : System.out.print("Please enter valid option: ");
							 }
						 }while(b==true);  break;
						 case 'n':
						 {
							 System.out.print("Do you want to see another model in this Budget (Between 2K - 10K) [y/n or Y/N]:");  //MADE CHANGES HERE
							 do
							 {
								 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								 switch(c1)	
								 {
								 case 'y':Between2K10K(); b=false; break; //MADE CHANGES HERE
								 case 'n':
								 {
									 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
									 do 
									 {
										 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
										 switch(c2)
										 {
										 case 'y': Sonymenu(); b=false; break; //MADE CHANGES HERE
										 case 'n': Menu(); b=false; break;
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SONY WH-CH700N";ob1[i++]=5190;
						 System.out.print("Do you want to continue shopping in this Budget (Between 2K - 10K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':Between2K10K(); b=false; break; // MADE CHANGES HEREE
							 case 'n':Sonymenu(); b=false; break; // MADE CHANGES HEREE
							 default : System.out.print("Please enter valid option: ");
							 }
						 }while(b==true);  break;
						 case 'n':
						 {
							 System.out.print("Do you want to see another model in this Budget (Between 2K - 10K) [y/n or Y/N]:");  //MADE CHANGES HERE
							 do
							 {
								 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								 switch(c1)	
								 {
								 case 'y':Between2K10K(); b=false; break; //MADE CHANGES HERE
								 case 'n':
								 {
									 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
									 do 
									 {
										 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
										 switch(c2)
										 {
										 case 'y': Sonymenu(); b=false; break; //MADE CHANGES HERE
										 case 'n': Menu(); b=false; break;
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SONY MDR-XB950AP";ob1[i++]=6190;
						 System.out.print("Do you want to continue shopping in this Budget (Between 2K - 10K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':Between2K10K(); b=false; break; // MADE CHANGES HEREE
							 case 'n':Sonymenu(); b=false; break; // MADE CHANGES HEREE
							 default : System.out.print("Please enter valid option: ");
							 }
						 }while(b==true);  break;
						 case 'n':
						 {
							 System.out.print("Do you want to see another model in this Budget (Between 2K - 10K) [y/n or Y/N]:");  //MADE CHANGES HERE
							 do
							 {
								 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								 switch(c1)	
								 {
								 case 'y':Between2K10K(); b=false; break; //MADE CHANGES HERE
								 case 'n':
								 {
									 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
									 do 
									 {
										 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
										 switch(c2)
										 {
										 case 'y': Sonymenu(); b=false; break; //MADE CHANGES HERE
										 case 'n': Menu(); b=false; break;
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SONY MDR-7506";ob1[i++]=9990;
						 System.out.print("Do you want to continue shopping in this Budget (Between 2K - 10K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':Between2K10K(); b=false; break; // MADE CHANGES HEREE
							 case 'n':Sonymenu(); b=false; break; // MADE CHANGES HEREE
							 default : System.out.print("Please enter valid option: ");
							 }
						 }while(b==true);  break;
						 case 'n':
						 {
							 System.out.print("Do you want to see another model in this Budget (Between 2K - 10K) [y/n or Y/N]:");  //MADE CHANGES HERE
							 do
							 {
								 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								 switch(c1)	
								 {
								 case 'y':Between2K10K(); b=false; break; //MADE CHANGES HERE
								 case 'n':
								 {
									 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
									 do 
									 {
										 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
										 switch(c2)
										 {
										 case 'y': Sonymenu(); b=false; break; //MADE CHANGES HERE
										 case 'n': Menu(); b=false; break;
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
					 case 10:  Sonymenu(); b=false; break;
					 default:  System.out.print("Please enter valid option:");
				 }
			 }while(b==true);
					
			 }
	   public static void Above10K()
	   {System.out.println(RESET);
		     System.out.println("\t\t"+" _________________________________________________________________________________________________________________________________");  
			 System.out.println("\t\t"+"|                                                                                                                                 |");  
			 System.out.println("\t\t"+"|    ___________________       ___________________       ___________________       ___________________       ___________________  |");  
			 System.out.println("\t\t"+"|   |1.SONY WH-CH700N   |     |2.SONY MDR-1000AP  |     |3.SONY WH-XB910N   |     |4.SONY MDR-XB950B1 |     |5.SONY WH-XB900N   | |");  
			 System.out.println("\t\t"+"|   |-------------------|     |-------------------|     |-------------------|     |-------------------|     |-------------------| |");  
			 System.out.println("\t\t"+"|   |.WIRELESS          |     |.WIRELESS          |     |.WIRELESS          |     |.WIRELESS          |     |.WIRELESS          | |");  
			 System.out.println("\t\t"+"|   |.Version: 4.1      |     |.Version: 4.1      |     |.Version: 5.0      |     |.Version: 4.2      |     |.Version: 4.2      | |");  
			 System.out.println("\t\t"+"|   |.Range : 10meters  |     |.Noise Cancellation|     |.Range: 10 meters  |     |.Range: 10meters   |     |.Range: 10meters   | |");  
			 System.out.println("\t\t"+"|   |.TalkTime:10 Hours |     |.TalkTime:10Hours  |     |.TalkTime:15Hours  |     |.TalkTime:8Hours   |     |.TalkTime:8Hours   | |");  
			 System.out.println("\t\t"+"|   |.StandbyTime:300Hrs|     |.StandbyTime:300Hrs|     |.StandbyTime:300Hrs|     |.StandbyTime:400Hrs|     |.StandbyTime:400Hrs| |");  
			 System.out.println("\t\t"+"|   |.Chargingtime:2Hrs |     |.Chargingtime:2Hrs |     |.Chargingtime:3Hrs |     |.Chargingtime:3Hrs |     |.Chargingtime:3Hrs | |");  
			 System.out.println("\t\t"+"|   |.Price : 11,190/-  |     |.Price : 15,675/-  |     |.Price : 12,999/-  |     |.Price : 17,950/-  |     |.Price : 15,690/-  | |");  
			 System.out.println("\t\t"+"|   |___________________|     |___________________|     |___________________|     |___________________|     |___________________| |");  
			 System.out.println("\t\t"+"|                                                                                                                                 |");  
			 System.out.println("\t\t"+"|                                                                                                                                 |");  
			 System.out.println("\t\t"+"|    ___________________       ___________________       ___________________       ___________________       ___________________  |");  
			 System.out.println("\t\t"+"|   |6.SONY MDR-1000X   |     |7.SONY WH-1000XM3  |     |8.SONY WH-1000XM4  |     |9.SONY WH-1000XM5  |     |                   | |");  
			 System.out.println("\t\t"+"|   |-------------------|     |-------------------|     |-------------------|     |-------------------|     |                   | |");  
			 System.out.println("\t\t"+"|   |.WIRELESS          |     |.WIRELESS          |     |.WIRELESS          |     |.WIRELESS          |     |      10.          | |");  
			 System.out.println("\t\t"+"|   |.Version: 5.0      |     |.Version: 5.1      |     |.Version: 5.2      |     |.Version: 5.2      |     |                   | |");  
			 System.out.println("\t\t"+"|   |.Range : 10meters  |     |.Range : 10meters  |     |.Range : 10meters  |     |.Range : 10meters  |     |      EXIT         | |");  
			 System.out.println("\t\t"+"|   |.TalkTime:70 Hours |     |.TalkTime:8 Hours  |     |.TalkTime:70Hours  |     |.TalkTime:70Hours  |     |     --------      | |");  
			 System.out.println("\t\t"+"|   |.StandbyTime:300Hrs|     |.StandbyTime:200Hrs|     |.StandbyTime:300Hrs|     |.StandbyTime:300Hrs|     |                   | |");  
			 System.out.println("\t\t"+"|   |.Chargingtime:3Hrs |     |.Chargingtime:3Hrs |     |.Chargingtime:3Hrs |     |.Chargingtime:3Hrs |     |                   | |");  
			 System.out.println("\t\t"+"|   |.Price : 13,990/-  |     |.Price : 17,990/-  |     |.Price : 18,190/-  |     |.Price : 19,190/-  |     |                   | |");  
			 System.out.println("\t\t"+"|   |___________________|     |___________________|     |___________________|     |___________________|     |___________________| |");  
			 System.out.println("\t\t"+"|                                                                                                                                 |");    
			 System.out.println("\t\t"+"|_________________________________________________________________________________________________________________________________|"); 
			 System.out.println(RESET); Above10Kswitch();  
	   }
	   public static void Above10Kswitch()
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SONY WH-CH700N";ob1[i++]=11190;
						          System.out.print("Do you want to continue shopping in this Budget (Above 10K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
				 		  do
				 		  {
				 			char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
				 			switch(c1)	
							{
							case 'y':Above10K(); b=false; break; // MADE CHANGES HEREE
							case 'n':Sonymenu(); b=false; break; // MADE CHANGES HEREE
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
									case 'y':Above10K(); b=false; break; //MADE CHANGES HERE
									case 'n':
										{
											System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
											do 
											{
												char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
												switch(c2)
												{
												case 'y': Sonymenu(); b=false; break; //MADE CHANGES HERE
												case 'n': Menu(); b=false; break;
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SONY MDR-1000AP";ob1[i++]=15675;
						 System.out.print("Do you want to continue shopping in this Budget (Above 10K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':Above10K(); b=false; break; // MADE CHANGES HEREE
							 case 'n':Sonymenu(); b=false; break; // MADE CHANGES HEREE
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
								 case 'y':Above10K(); b=false; break; //MADE CHANGES HERE
								 case 'n':
								 {
									 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
									 do 
									 {
										 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
										 switch(c2)
										 {
										 case 'y': Sonymenu(); b=false; break; //MADE CHANGES HERE
										 case 'n': Menu(); b=false; break;
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SONY WH-XB910N";ob1[i++]=12999;
						 System.out.print("Do you want to continue shopping in this Budget (Above 10K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':Above10K(); b=false; break; // MADE CHANGES HEREE
							 case 'n':Sonymenu(); b=false; break; // MADE CHANGES HEREE
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
								 case 'y':Above10K(); b=false; break; //MADE CHANGES HERE
								 case 'n':
								 {
									 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
									 do 
									 {
										 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
										 switch(c2)
										 {
										 case 'y': Sonymenu(); b=false; break; //MADE CHANGES HERE
										 case 'n': Menu(); b=false; break;
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SONY MDR-XB950B1";ob1[i++]=17950;
						 System.out.print("Do you want to continue shopping in this Budget (Above 10K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':Above10K(); b=false; break; // MADE CHANGES HEREE
							 case 'n':Sonymenu(); b=false; break; // MADE CHANGES HEREE
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
								 case 'y':Above10K(); b=false; break; //MADE CHANGES HERE
								 case 'n':
								 {
									 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
									 do 
									 {
										 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
										 switch(c2)
										 {
										 case 'y': Sonymenu(); b=false; break; //MADE CHANGES HERE
										 case 'n': Menu(); b=false; break;
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
						 case 'y':System.out.println("Your Item is added to cart .");  ob[i]="SONY WH-XB900N";ob1[i++]=15690;
						 System.out.print("Do you want to continue shopping in this Budget (Above 10K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':Above10K(); b=false; break; // MADE CHANGES HEREE
							 case 'n':Sonymenu(); b=false; break; // MADE CHANGES HEREE
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
								 case 'y':Above10K(); b=false; break; //MADE CHANGES HERE
								 case 'n':
								 {
									 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
									 do 
									 {
										 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
										 switch(c2)
										 {
										 case 'y': Sonymenu(); b=false; break; //MADE CHANGES HERE
										 case 'n': Menu(); b=false; break;
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SONY MDR-1000X";ob1[i++]=13990;
						 System.out.print("Do you want to continue shopping in this Budget (Above 10K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':Above10K(); b=false; break; // MADE CHANGES HEREE
							 case 'n':Sonymenu(); b=false; break; // MADE CHANGES HEREE
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
								 case 'y':Above10K(); b=false; break; //MADE CHANGES HERE
								 case 'n':
								 {
									 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
									 do 
									 {
										 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
										 switch(c2)
										 {
										 case 'y': Sonymenu(); b=false; break; //MADE CHANGES HERE
										 case 'n': Menu(); b=false; break;
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SONY WH-1000XM3";ob1[i++]=17990;
						 System.out.print("Do you want to continue shopping in this Budget (Above 10K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':Above10K(); b=false; break; // MADE CHANGES HEREE
							 case 'n':Sonymenu(); b=false; break; // MADE CHANGES HEREE
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
								 case 'y':Above10K(); b=false; break; //MADE CHANGES HERE
								 case 'n':
								 {
									 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
									 do 
									 {
										 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
										 switch(c2)
										 {
										 case 'y': Sonymenu(); b=false; break; //MADE CHANGES HERE
										 case 'n': Menu(); b=false; break;
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SONY WH-1000XM4";ob1[i++]=18190;
						 System.out.print("Do you want to continue shopping in this Budget (Above 10K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':Above10K(); b=false; break; // MADE CHANGES HEREE
							 case 'n':Sonymenu(); b=false; break; // MADE CHANGES HEREE
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
								 case 'y':Above10K(); b=false; break; //MADE CHANGES HERE
								 case 'n':
								 {
									 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
									 do 
									 {
										 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
										 switch(c2)
										 {
										 case 'y': Sonymenu(); b=false; break; //MADE CHANGES HERE
										 case 'n': Menu(); b=false; break;
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
						 case 'y':System.out.println("Your Item is added to cart .");   ob[i]="SONY WH-1000XM5";ob1[i++]=19190;
						 System.out.print("Do you want to continue shopping in this Budget (Above 10K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':Above10K(); b=false; break; // MADE CHANGES HEREE
							 case 'n':Sonymenu(); b=false; break; // MADE CHANGES HEREE
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
								 case 'y':Above10K(); b=false; break; //MADE CHANGES HERE
								 case 'n':
								 {
									 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
									 do 
									 {
										 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
										 switch(c2)
										 {
										 case 'y': Sonymenu(); b=false; break; //MADE CHANGES HERE
										 case 'n': Menu(); b=false; break;
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
					 case 10:  Sonymenu(); b=false; break;
					 default:  System.out.print("Please enter valid option:");
				 }
			 }while(b==true);
	   }
	   
	    public static void JBLmenu()
	   {System.out.println(RESET);
		    System.out.println("\t\t\t\t\t\t"+"                            JBL                           ");  
			 System.out.println("\t\t\t\t\t\t"+"                      -------------                      ");  
			 System.out.println("\t\t\t\t\t\t"+"                      1.Between 2K-10K                   ");  
			 System.out.println("\t\t\t\t\t\t"+"                      2.Above 10K                        ");
			 System.out.println("\t\t\t\t\t\t"+"                      3.EXIT FROM JBL                             ");
			 System.out.println(RESET);JBLswitch(); 
	   }
	   public static void JBLswitch()
	   {
		   System.out.print("PLEASE ENTER THE PRICE RANGE  :");
			 do
			 {
				 int p=sc.nextInt();
				switch(p) 
				{
				case 1: JBLBetween2K10K(); b=false; break;
				case 2: JBLAbove10K(); b=false; break;
				case 3: Menu();b=false; break;
			    default:
			    	{
			    		System.out.print("Please enter valid option:");
			    		JBLmenu(); 
			    		
			    	}
				}
			 }while(b==true);    
	   }
	   public static void JBLBetween2K10K()
	   {System.out.println(RESET);
		     System.out.println("\t\t"+" _________________________________________________________________________________________________________________________________");  
			 System.out.println("\t\t"+"|                                                                                                                                 |");  
			 System.out.println("\t\t"+"|    ___________________       ___________________       ___________________       ___________________       ___________________  |");  
			 System.out.println("\t\t"+"|   |1.JBL TUNE 760NC   |     |2.JBL TUNE 710BT   |     |3.JBL  TUNE 510BT  |     |   4.JBL T500BT    |     |5.JBL TUNE 660NC   | |");  
			 System.out.println("\t\t"+"|   |-------------------|     |-------------------|     |-------------------|     |-------------------|     |-------------------| |");  
			 System.out.println("\t\t"+"|   |.WIRELESS          |     |.WIRELESS          |     |.WIRELESS          |     |.WIRELESS          |     |.WIRELESS          | |");  
			 System.out.println("\t\t"+"|   |.Version: 5.1      |     |.Version: 5.1      |     |.Version: 5.0      |     |.Version: 5.2      |     |.Version: 5.2      | |");  
			 System.out.println("\t\t"+"|   |.Range : 10meters  |     |.Noise Cancellation|     |.Range: 10 meters  |     |.Range: 10meters   |     |.Range: 10meters   | |");  
			 System.out.println("\t\t"+"|   |.TalkTime:10 Hours |     |.TalkTime:10Hours  |     |.TalkTime:15Hours  |     |.TalkTime:8Hours   |     |.TalkTime:8Hours   | |");  
			 System.out.println("\t\t"+"|   |.StandbyTime:300Hrs|     |.StandbyTime:300Hrs|     |.StandbyTime:300Hrs|     |.StandbyTime:400Hrs|     |.StandbyTime:400Hrs| |");  
			 System.out.println("\t\t"+"|   |.Chargingtime:2Hrs |     |.Chargingtime:2Hrs |     |.Chargingtime:3Hrs |     |.Chargingtime:3Hrs |     |.Chargingtime:3Hrs | |");  
			 System.out.println("\t\t"+"|   |.Price : 3,190/-   |     |.Price :  5,675/-  |     |.Price :  2,999/-  |     |.Price :  7,950/-  |     |.Price :  5,690/-  | |");  
			 System.out.println("\t\t"+"|   |___________________|     |___________________|     |___________________|     |___________________|     |___________________| |");  
			 System.out.println("\t\t"+"|                                                                                                                                 |");  
			 System.out.println("\t\t"+"|                                                                                                                                 |");  
			 System.out.println("\t\t"+"|    ___________________       ___________________       ___________________       ___________________       ___________________  |");  
			 System.out.println("\t\t"+"|   |6.JBL QUANTUM 100  |     |7.JBL LIVE 660NC   |     |   8.JBL PEAK ||   |     |9.JBL TUNE 700BT   |     |                   | |");  
			 System.out.println("\t\t"+"|   |-------------------|     |-------------------|     |-------------------|     |-------------------|     |                   | |");  
			 System.out.println("\t\t"+"|   |.WIRELESS          |     |.WIRELESS          |     |.WIRELESS          |     |.WIRELESS          |     |      10.          | |");  
			 System.out.println("\t\t"+"|   |.Version: 5.0      |     |.Version: 5.1      |     |.Version: 5.2      |     |.Version: 5.2      |     |                   | |");  
			 System.out.println("\t\t"+"|   |.Range : 10meters  |     |.Range : 10meters  |     |.Range : 10meters  |     |.Range : 10meters  |     |      EXIT         | |");  
			 System.out.println("\t\t"+"|   |.TalkTime:70 Hours |     |.TalkTime:8 Hours  |     |.TalkTime:70Hours  |     |.TalkTime:70Hours  |     |     --------      | |");  
			 System.out.println("\t\t"+"|   |.StandbyTime:300Hrs|     |.StandbyTime:200Hrs|     |.StandbyTime:300Hrs|     |.StandbyTime:300Hrs|     |                   | |");  
			 System.out.println("\t\t"+"|   |.Chargingtime:3Hrs |     |.Chargingtime:3Hrs |     |.Chargingtime:3Hrs |     |.Chargingtime:3Hrs |     |                   | |");  
			 System.out.println("\t\t"+"|   |.Price :  3,990/-  |     |.Price :  7,990/-  |     |.Price :  8,190/-  |     |.Price :  9,190/-  |     |                   | |");  
			 System.out.println("\t\t"+"|   |___________________|     |___________________|     |___________________|     |___________________|     |___________________| |");  
			 System.out.println("\t\t"+"|                                                                                                                                 |");    
			 System.out.println("\t\t"+"|_________________________________________________________________________________________________________________________________|"); 
			 System.out.println(RESET); JBLBetween2K10Kswitch();     
	   }
	   public static void JBLBetween2K10Kswitch()
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
						 case 'y':System.out.println("Your Item is added to cart .");  ob[i]="JBL TUNE 760NC";ob1[i++]=3190;
						          System.out.print("Do you want to continue shopping in this Budget (Between 2K - 10K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
				 		  do
				 		  {
				 			char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
				 			switch(c1)	
							{
							case 'y':JBLBetween2K10K(); b=false; break; // MADE CHANGES HEREE
							case 'n':JBLmenu(); b=false; break; // MADE CHANGES HEREE
				 			default : System.out.print("Please enter valid option: ");
							}
				 		  }while(b==true);  break;
						 case 'n':
							 {
								 System.out.print("Do you want to see another model in this Budget (Between 2K - 10K) [y/n or Y/N]:");  //MADE CHANGES HERE
									do
									{
										char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									switch(c1)	
									{
									case 'y':JBLBetween2K10K(); b=false; break; //MADE CHANGES HERE
									case 'n':
										{
											System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
											do 
											{
												char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
												switch(c2)
												{
												case 'y': JBLmenu(); b=false; break; //MADE CHANGES HERE
												case 'n': Menu(); b=false; break;
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
						 case 'y':System.out.println("Your Item is added to cart .");   ob[i]="JBL TUNE 710BT";ob1[i++]=5675;
						 System.out.print("Do you want to continue shopping in this Budget (Between 2K - 10K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':JBLBetween2K10K(); b=false; break; // MADE CHANGES HEREE
							 case 'n':JBLmenu(); b=false; break; // MADE CHANGES HEREE
							 default : System.out.print("Please enter valid option: ");
							 }
						 }while(b==true);  break;
						 case 'n':
						 {
							 System.out.print("Do you want to see another model in this Budget (Between 2K - 10K) [y/n or Y/N]:");  //MADE CHANGES HERE
							 do
							 {
								 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								 switch(c1)	
								 {
								 case 'y':JBLBetween2K10K(); b=false; break; //MADE CHANGES HERE
								 case 'n':
								 {
									 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
									 do 
									 {
										 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
										 switch(c2)
										 {
										 case 'y': JBLmenu(); b=false; break; //MADE CHANGES HERE
										 case 'n': Menu(); b=false; break;
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="JBL TUNE 510BT";ob1[i++]=2999;
						 System.out.print("Do you want to continue shopping in this Budget (Between 2K - 10K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':JBLBetween2K10K(); b=false; break; // MADE CHANGES HEREE
							 case 'n':JBLmenu(); b=false; break; // MADE CHANGES HEREE
							 default : System.out.print("Please enter valid option: ");
							 }
						 }while(b==true);  break;
						 case 'n':
						 {
							 System.out.print("Do you want to see another model in this Budget (Between 2K - 10K) [y/n or Y/N]:");  //MADE CHANGES HERE
							 do
							 {
								 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								 switch(c1)	
								 {
								 case 'y':JBLBetween2K10K(); b=false; break; //MADE CHANGES HERE
								 case 'n':
								 {
									 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
									 do 
									 {
										 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
										 switch(c2)
										 {
										 case 'y': JBLmenu(); b=false; break; //MADE CHANGES HERE
										 case 'n': Menu(); b=false; break;
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="JBL T550BT";ob1[i++]=7950;
						 System.out.print("Do you want to continue shopping in this Budget (Between 2K - 10K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':JBLBetween2K10K(); b=false; break; // MADE CHANGES HEREE
							 case 'n':JBLmenu(); b=false; break; // MADE CHANGES HEREE
							 default : System.out.print("Please enter valid option: ");
							 }
						 }while(b==true);  break;
						 case 'n':
						 {
							 System.out.print("Do you want to see another model in this Budget (Between 2K - 10K) [y/n or Y/N]:");  //MADE CHANGES HERE
							 do
							 {
								 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								 switch(c1)	
								 {
								 case 'y':JBLBetween2K10K(); b=false; break; //MADE CHANGES HERE
								 case 'n':
								 {
									 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
									 do 
									 {
										 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
										 switch(c2)
										 {
										 case 'y': JBLmenu(); b=false; break; //MADE CHANGES HERE
										 case 'n': Menu(); b=false; break;
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="JBL TUNE 660NC";ob1[i++]=5690;
						 System.out.print("Do you want to continue shopping in this Budget (Between 2K - 10K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':JBLBetween2K10K(); b=false; break; // MADE CHANGES HEREE
							 case 'n':JBLmenu(); b=false; break; // MADE CHANGES HEREE
							 default : System.out.print("Please enter valid option: ");
							 }
						 }while(b==true);  break;
						 case 'n':
						 {
							 System.out.print("Do you want to see another model in this Budget (Between 2K - 10K) [y/n or Y/N]:");  //MADE CHANGES HERE
							 do
							 {
								 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								 switch(c1)	
								 {
								 case 'y':JBLBetween2K10K(); b=false; break; //MADE CHANGES HERE
								 case 'n':
								 {
									 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
									 do 
									 {
										 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
										 switch(c2)
										 {
										 case 'y': JBLmenu(); b=false; break; //MADE CHANGES HERE
										 case 'n': Menu(); b=false; break;
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="JBL QUANTUM 100";ob1[i++]=3990;
						 System.out.print("Do you want to continue shopping in this Budget (Between 2K - 10K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':JBLBetween2K10K(); b=false; break; // MADE CHANGES HEREE
							 case 'n':JBLmenu(); b=false; break; // MADE CHANGES HEREE
							 default : System.out.print("Please enter valid option: ");
							 }
						 }while(b==true);  break;
						 case 'n':
						 {
							 System.out.print("Do you want to see another model in this Budget (Between 2K - 10K) [y/n or Y/N]:");  //MADE CHANGES HERE
							 do
							 {
								 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								 switch(c1)	
								 {
								 case 'y':JBLBetween2K10K(); b=false; break; //MADE CHANGES HERE
								 case 'n':
								 {
									 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
									 do 
									 {
										 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
										 switch(c2)
										 {
										 case 'y': JBLmenu(); b=false; break; //MADE CHANGES HERE
										 case 'n': Menu(); b=false; break;
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="JBL LIVE 660NC";ob1[i++]=7990;
						 System.out.print("Do you want to continue shopping in this Budget (Between 2K - 10K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':JBLBetween2K10K(); b=false; break; // MADE CHANGES HEREE
							 case 'n':JBLmenu(); b=false; break; // MADE CHANGES HEREE
							 default : System.out.print("Please enter valid option: ");
							 }
						 }while(b==true);  break;
						 case 'n':
						 {
							 System.out.print("Do you want to see another model in this Budget (Between 2K - 10K) [y/n or Y/N]:");  //MADE CHANGES HERE
							 do
							 {
								 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								 switch(c1)	
								 {
								 case 'y':JBLBetween2K10K(); b=false; break; //MADE CHANGES HERE
								 case 'n':
								 {
									 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
									 do 
									 {
										 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
										 switch(c2)
										 {
										 case 'y': JBLmenu(); b=false; break; //MADE CHANGES HERE
										 case 'n': Menu(); b=false; break;
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="JBL PEAK ||";ob1[i++]=8190;
						 System.out.print("Do you want to continue shopping in this Budget (Between 2K - 10K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':JBLBetween2K10K(); b=false; break; // MADE CHANGES HEREE
							 case 'n':JBLmenu(); b=false; break; // MADE CHANGES HEREE
							 default : System.out.print("Please enter valid option: ");
							 }
						 }while(b==true);  break;
						 case 'n':
						 {
							 System.out.print("Do you want to see another model in this Budget (Between 2K - 10K) [y/n or Y/N]:");  //MADE CHANGES HERE
							 do
							 {
								 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								 switch(c1)	
								 {
								 case 'y':JBLBetween2K10K(); b=false; break; //MADE CHANGES HERE
								 case 'n':
								 {
									 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
									 do 
									 {
										 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
										 switch(c2)
										 {
										 case 'y': JBLmenu(); b=false; break; //MADE CHANGES HERE
										 case 'n': Menu(); b=false; break;
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="JBL TUNE 700BT";ob1[i++]=9190;
						 System.out.print("Do you want to continue shopping in this Budget (Between 2K - 10K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':JBLBetween2K10K(); b=false; break; // MADE CHANGES HEREE
							 case 'n':JBLmenu(); b=false; break; // MADE CHANGES HEREE
							 default : System.out.print("Please enter valid option: ");
							 }
						 }while(b==true);  break;
						 case 'n':
						 {
							 System.out.print("Do you want to see another model in this Budget (Between 2K - 10K) [y/n or Y/N]:");  //MADE CHANGES HERE
							 do
							 {
								 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								 switch(c1)	
								 {
								 case 'y':JBLBetween2K10K(); b=false; break; //MADE CHANGES HERE
								 case 'n':
								 {
									 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
									 do 
									 {
										 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
										 switch(c2)
										 {
										 case 'y': JBLmenu(); b=false; break; //MADE CHANGES HERE
										 case 'n': Menu(); b=false; break;
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
				 case 10:  JBLmenu(); b=false; break;
				 default:  System.out.print("Please enter valid option:");
				 }
			 }while(b==true);  
	   }
	   public static void JBLAbove10K()
	   {System.out.println(RESET);
		     System.out.println("\t\t"+" _________________________________________________________________________________________________________________________________");  
			 System.out.println("\t\t"+"|                                                                                                                                 |");  
			 System.out.println("\t\t"+"|    ___________________       ___________________       ___________________       ___________________       ___________________  |");  
			 System.out.println("\t\t"+"|   | 1.JBL QUANTUM 600 |     |2.JBL CLUB 950NC   |     |3.JBL QUANTUM 800  |     |  4.JBL E40 BT     |     | 5.JBL ELITE 700   | |");  
			 System.out.println("\t\t"+"|   |-------------------|     |-------------------|     |-------------------|     |-------------------|     |-------------------| |");  
			 System.out.println("\t\t"+"|   |.WIRELESS          |     |.WIRELESS          |     |.WIRELESS          |     |.WIRELESS          |     |.WIRELESS          | |");  
			 System.out.println("\t\t"+"|   |.Version: 4.1      |     |.Version: 4.1      |     |.Version: 5.0      |     |.Version: 4.2      |     |.Version: 4.2      | |");  
			 System.out.println("\t\t"+"|   |.Range : 10meters  |     |.Noise Cancellation|     |.Range: 10 meters  |     |.Range: 10meters   |     |.Range: 10meters   | |");  
			 System.out.println("\t\t"+"|   |.TalkTime:10 Hours |     |.TalkTime:10Hours  |     |.TalkTime:15Hours  |     |.TalkTime:8Hours   |     |.TalkTime:8Hours   | |");  
			 System.out.println("\t\t"+"|   |.StandbyTime:300Hrs|     |.StandbyTime:300Hrs|     |.StandbyTime:300Hrs|     |.StandbyTime:400Hrs|     |.StandbyTime:400Hrs| |");  
			 System.out.println("\t\t"+"|   |.Chargingtime:2Hrs |     |.Chargingtime:2Hrs |     |.Chargingtime:3Hrs |     |.Chargingtime:3Hrs |     |.Chargingtime:3Hrs | |");  
			 System.out.println("\t\t"+"|   |.Price : 11,190/-  |     |.Price : 15,675/-  |     |.Price : 12,999/-  |     |.Price : 17,950/-  |     |.Price : 15,690/-  | |");  
			 System.out.println("\t\t"+"|   |___________________|     |___________________|     |___________________|     |___________________|     |___________________| |");  
			 System.out.println("\t\t"+"|                                                                                                                                 |");  
			 System.out.println("\t\t"+"|                                                                                                                                 |");  
			 System.out.println("\t\t"+"|    ___________________       ___________________       ___________________       ___________________       ___________________  |");  
			 System.out.println("\t\t"+"|   |    6.JBL J55 a    |     |7.JBL EVEREST 710  |     |8.JBL QUANTUM ONE  |     |  9.JBL TOUR ONE   |     |                   | |");  
			 System.out.println("\t\t"+"|   |-------------------|     |-------------------|     |-------------------|     |-------------------|     |                   | |");  
			 System.out.println("\t\t"+"|   |.WIRELESS          |     |.WIRELESS          |     |.WIRELESS          |     |.WIRELESS          |     |      10.          | |");  
			 System.out.println("\t\t"+"|   |.Version: 5.0      |     |.Version: 5.1      |     |.Version: 5.2      |     |.Version: 5.2      |     |                   | |");  
			 System.out.println("\t\t"+"|   |.Range : 10meters  |     |.Range : 10meters  |     |.Range : 10meters  |     |.Range : 10meters  |     |      EXIT         | |");  
			 System.out.println("\t\t"+"|   |.TalkTime:70 Hours |     |.TalkTime:8 Hours  |     |.TalkTime:70Hours  |     |.TalkTime:70Hours  |     |     --------      | |");  
			 System.out.println("\t\t"+"|   |.StandbyTime:300Hrs|     |.StandbyTime:200Hrs|     |.StandbyTime:300Hrs|     |.StandbyTime:300Hrs|     |                   | |");  
			 System.out.println("\t\t"+"|   |.Chargingtime:3Hrs |     |.Chargingtime:3Hrs |     |.Chargingtime:3Hrs |     |.Chargingtime:3Hrs |     |                   | |");  
			 System.out.println("\t\t"+"|   |.Price : 13,990/-  |     |.Price : 17,990/-  |     |.Price : 18,190/-  |     |.Price : 19,190/-  |     |                   | |");  
			 System.out.println("\t\t"+"|   |___________________|     |___________________|     |___________________|     |___________________|     |___________________| |");  
			 System.out.println("\t\t"+"|                                                                                                                                 |");    
			 System.out.println("\t\t"+"|_________________________________________________________________________________________________________________________________|"); 
			 System.out.println(RESET); JBLAbove10Kswitch();  
	   }
	   public static void JBLAbove10Kswitch()
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="JBL QUANTUM 600";ob1[i++]=11190;
						          System.out.print("Do you want to continue shopping in this Budget (Above 10K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
				 		  do
				 		  {
				 			char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
				 			switch(c1)	
							{
							case 'y':JBLAbove10K(); b=false; break; // MADE CHANGES HEREE
							case 'n':JBLmenu(); b=false; break; // MADE CHANGES HEREE
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
									case 'y':JBLAbove10K(); b=false; break; //MADE CHANGES HERE
									case 'n':
										{
											System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
											do 
											{
												char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
												switch(c2)
												{
												case 'y': JBLmenu(); b=false; break; //MADE CHANGES HERE
												case 'n': Menu(); b=false; break;
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="JBL CLB 950NC";ob1[i++]=15675;
						 System.out.print("Do you want to continue shopping in this Budget (Above 10K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':JBLAbove10K(); b=false; break; // MADE CHANGES HEREE
							 case 'n':JBLmenu(); b=false; break; // MADE CHANGES HEREE
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
								 case 'y':JBLAbove10K(); b=false; break; //MADE CHANGES HERE
								 case 'n':
								 {
									 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
									 do 
									 {
										 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
										 switch(c2)
										 {
										 case 'y': JBLmenu(); b=false; break; //MADE CHANGES HERE
										 case 'n': Menu(); b=false; break;
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="JBL QUANTUM 800";ob1[i++]=12999;
						 System.out.print("Do you want to continue shopping in this Budget (Above 10K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':JBLAbove10K(); b=false; break; // MADE CHANGES HEREE
							 case 'n':JBLmenu(); b=false; break; // MADE CHANGES HEREE
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
								 case 'y':JBLAbove10K(); b=false; break; //MADE CHANGES HERE
								 case 'n':
								 {
									 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
									 do 
									 {
										 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
										 switch(c2)
										 {
										 case 'y': JBLmenu(); b=false; break; //MADE CHANGES HERE
										 case 'n': Menu(); b=false; break;
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="JBL E40 BT";ob1[i++]=17950;
						 System.out.print("Do you want to continue shopping in this Budget (Above 10K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':JBLAbove10K(); b=false; break; // MADE CHANGES HEREE
							 case 'n':JBLmenu(); b=false; break; // MADE CHANGES HEREE
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
								 case 'y':JBLAbove10K(); b=false; break; //MADE CHANGES HERE
								 case 'n':
								 {
									 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
									 do 
									 {
										 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
										 switch(c2)
										 {
										 case 'y': JBLmenu(); b=false; break; //MADE CHANGES HERE
										 case 'n': Menu(); b=false; break;
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="JBL ELITE 700";ob1[i++]=15690;
						 System.out.print("Do you want to continue shopping in this Budget (Above 10K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':JBLAbove10K(); b=false; break; // MADE CHANGES HEREE
							 case 'n':JBLmenu(); b=false; break; // MADE CHANGES HEREE
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
								 case 'y':JBLAbove10K(); b=false; break; //MADE CHANGES HERE
								 case 'n':
								 {
									 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
									 do 
									 {
										 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
										 switch(c2)
										 {
										 case 'y': JBLmenu(); b=false; break; //MADE CHANGES HERE
										 case 'n': Menu(); b=false; break;
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="JBL J55 A";ob1[i++]=13990;
						 System.out.print("Do you want to continue shopping in this Budget (Above 10K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':JBLAbove10K(); b=false; break; // MADE CHANGES HEREE
							 case 'n':JBLmenu(); b=false; break; // MADE CHANGES HEREE
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
								 case 'y':JBLAbove10K(); b=false; break; //MADE CHANGES HERE
								 case 'n':
								 {
									 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
									 do 
									 {
										 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
										 switch(c2)
										 {
										 case 'y': JBLmenu(); b=false; break; //MADE CHANGES HERE
										 case 'n': Menu(); b=false; break;
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="JBL EVEREST 710";ob1[i++]=17990;
						 System.out.print("Do you want to continue shopping in this Budget (Above 10K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':JBLAbove10K(); b=false; break; // MADE CHANGES HEREE
							 case 'n':JBLmenu(); b=false; break; // MADE CHANGES HEREE
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
								 case 'y':JBLAbove10K(); b=false; break; //MADE CHANGES HERE
								 case 'n':
								 {
									 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
									 do 
									 {
										 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
										 switch(c2)
										 {
										 case 'y': JBLmenu(); b=false; break; //MADE CHANGES HERE
										 case 'n': Menu(); b=false; break;
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="JBL QUANTUM ONE";ob1[i++]=18190;
						 System.out.print("Do you want to continue shopping in this Budget (Above 10K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':JBLAbove10K(); b=false; break; // MADE CHANGES HEREE
							 case 'n':JBLmenu(); b=false; break; // MADE CHANGES HEREE
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
								 case 'y':JBLAbove10K(); b=false; break; //MADE CHANGES HERE
								 case 'n':
								 {
									 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
									 do 
									 {
										 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
										 switch(c2)
										 {
										 case 'y': JBLmenu(); b=false; break; //MADE CHANGES HERE
										 case 'n': Menu(); b=false; break;
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="JBL TOUR ONE";ob1[i++]=19190;
						 System.out.print("Do you want to continue shopping in this Budget (Above 10K) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':JBLAbove10K(); b=false; break; // MADE CHANGES HEREE
							 case 'n':JBLmenu(); b=false; break; // MADE CHANGES HEREE
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
								 case 'y':JBLAbove10K(); b=false; break; //MADE CHANGES HERE
								 case 'n':
								 {
									 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
									 do 
									 {
										 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
										 switch(c2)
										 {
										 case 'y': JBLmenu(); b=false; break; //MADE CHANGES HERE
										 case 'n': Menu(); b=false; break;
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
					 case 10:  JBLmenu(); b=false; break;
					 default:  System.out.print("Please enter valid option:");
				 }
			 }while(b==true);  
	   }
	   public static void Senmenu()
	   {System.out.println(RESET);
			     System.out.println("\t\t\t\t\t\t"+"                        SENNHEISER                          ");  
				 System.out.println("\t\t\t\t\t\t"+"                      -------------                      ");  
				 System.out.println("\t\t\t\t\t\t"+"                      1.Between 2K-10K                   ");  
				 System.out.println("\t\t\t\t\t\t"+"                      2.Above 10K                        ");
				 System.out.println("\t\t\t\t\t\t"+"                      3.EXIT FROM SENNHEISER             ");
				 System.out.println(RESET);	 Senswitch(); 
		   }
	   public static void Senswitch()
	   {
		   System.out.print("PLEASE ENTER THE PRICE RANGE  :");
			 do
			 {
				 int p=sc.nextInt();
				switch(p) 
				{
				case 1: Sen2K10K(); b=false; break;
				case 2: Sen10K(); b=false; break;
				case 3: Menu();b=false; break;
			    default:
			    	{
			    		System.out.print("Please enter valid option:");
			    		Senmenu(); 
			    		
			    	}
				}
			 }while(b==true);    
	   }  
	   public static void Sen2K10K()
	   {System.out.println(RESET);
		     System.out.println("\t\t"+" _________________________________________________________________________________________________________________________________");  
			 System.out.println("\t\t"+"|                                                                                                                                 |");  
			 System.out.println("\t\t"+"|    ___________________       ___________________       ___________________       ___________________       ___________________  |");  
			 System.out.println("\t\t"+"|   |   1.SENN PX 80    |     | 2.SENN PC 3 CHAT  |     |   3.SENN HD 180   |     |  4.SENN HD 250BT  |     |  5.SENN HD 220S   | |");  
			 System.out.println("\t\t"+"|   |-------------------|     |-------------------|     |-------------------|     |-------------------|     |-------------------| |");  
			 System.out.println("\t\t"+"|   |.WIRELESS          |     |.WIRELESS          |     |.WIRELESS          |     |.WIRELESS          |     |.WIRELESS          | |");  
			 System.out.println("\t\t"+"|   |.Version: 5.1      |     |.Version: 5.1      |     |.Version: 5.0      |     |.Version: 5.2      |     |.Version: 5.2      | |");  
			 System.out.println("\t\t"+"|   |.Range : 10meters  |     |.Noise Cancellation|     |.Range: 10 meters  |     |.Range: 10meters   |     |.Range: 10meters   | |");  
			 System.out.println("\t\t"+"|   |.TalkTime:10 Hours |     |.TalkTime:10Hours  |     |.TalkTime:15Hours  |     |.TalkTime:8Hours   |     |.TalkTime:8Hours   | |");  
			 System.out.println("\t\t"+"|   |.StandbyTime:300Hrs|     |.StandbyTime:300Hrs|     |.StandbyTime:300Hrs|     |.StandbyTime:400Hrs|     |.StandbyTime:400Hrs| |");  
			 System.out.println("\t\t"+"|   |.Chargingtime:2Hrs |     |.Chargingtime:2Hrs |     |.Chargingtime:3Hrs |     |.Chargingtime:3Hrs |     |.Chargingtime:3Hrs | |");  
			 System.out.println("\t\t"+"|   |.Price : 4,190/-   |      |.Price :  5,675/- |      |.Price : 6,999/-  |     |.Price : 7,950/-   |     |.Price :  5,690/-  | |");  
			 System.out.println("\t\t"+"|   |___________________|     |___________________|     |___________________|     |___________________|     |___________________| |");  
			 System.out.println("\t\t"+"|                                                                                                                                 |");  
			 System.out.println("\t\t"+"|                                                                                                                                 |");  
			 System.out.println("\t\t"+"|    ___________________       ___________________       ___________________       ___________________       ___________________  |");  
			 System.out.println("\t\t"+"|   |  6.SENN HD 2.10   |     |  7.SENN HD 461G   |     |  8.SENN RS110 ||  |     | 9.SENN HD 215-||  |     |                   | |");  
			 System.out.println("\t\t"+"|   |-------------------|     |-------------------|     |-------------------|     |-------------------|     |                   | |");  
			 System.out.println("\t\t"+"|   |.WIRELESS          |     |.WIRELESS          |     |.WIRELESS          |     |.WIRELESS          |     |      10.          | |");  
			 System.out.println("\t\t"+"|   |.Version: 5.0      |     |.Version: 5.1      |     |.Version: 5.2      |     |.Version: 5.2      |     |                   | |");  
			 System.out.println("\t\t"+"|   |.Range : 10meters  |     |.Range : 10meters  |     |.Range : 10meters  |     |.Range : 10meters  |     |      EXIT         | |");  
			 System.out.println("\t\t"+"|   |.TalkTime:70 Hours |     |.TalkTime:8 Hours  |     |.TalkTime:70Hours  |     |.TalkTime:70Hours  |     |     --------      | |");  
			 System.out.println("\t\t"+"|   |.StandbyTime:300Hrs|     |.StandbyTime:200Hrs|     |.StandbyTime:300Hrs|     |.StandbyTime:300Hrs|     |                   | |");  
			 System.out.println("\t\t"+"|   |.Chargingtime:3Hrs |     |.Chargingtime:3Hrs |     |.Chargingtime:3Hrs |     |.Chargingtime:3Hrs |     |                   | |");  
			 System.out.println("\t\t"+"|   |.Price : 5,990/-   |     |.Price :  7,990/-  |     |.Price :  8,190/-  |     |.Price : 7,190/-   |     |                   | |");  
			 System.out.println("\t\t"+"|   |___________________|     |___________________|     |___________________|     |___________________|     |___________________| |");  
			 System.out.println("\t\t"+"|                                                                                                                                 |");    
			 System.out.println("\t\t"+"|_________________________________________________________________________________________________________________________________|"); 
			 System.out.println(RESET);     
		   Sen2K10Kswitch();
	   }
	   public static void Sen2K10Kswitch()
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SENNHEISER PX 80";ob1[i++]=4190;
						          System.out.print("Do you want to continue shopping in this Budget (Between 2k - 10k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
				 		  do
				 		  {
				 			char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
				 			switch(c1)	
							{
							case 'y':Sen2K10K(); b=false; break; // MADE CHANGES HEREE
							case 'n':Senmenu(); b=false; break; // MADE CHANGES HEREE
				 			default : System.out.print("Please enter valid option: ");
							}
				 		  }while(b==true);  break;
						 case 'n':
							 {
								 System.out.print("Do you want to see another model in this Budget (Between 2k - 10k) [y/n or Y/N]:");  //MADE CHANGES HERE
									do
									{
										char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									switch(c1)	
									{
									case 'y':Sen2K10K(); b=false; break; //MADE CHANGES HERE
									case 'n':
										{
											System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
											do 
											{
												char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
												switch(c2)
												{
												case 'y': Senmenu(); b=false; break; //MADE CHANGES HERE
												case 'n': Menu(); b=false; break;
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SENNHEISER PC 3 CHAT";ob1[i++]=5675;
						 System.out.print("Do you want to continue shopping in this Budget (Between 2k - 10k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':Sen2K10K(); b=false; break; // MADE CHANGES HEREE
							 case 'n':Senmenu(); b=false; break; // MADE CHANGES HEREE
							 default : System.out.print("Please enter valid option: ");
							 }
						 }while(b==true);  break;
						 case 'n':
						 {
							 System.out.print("Do you want to see another model in this Budget (Between 2k - 10k) [y/n or Y/N]:");  //MADE CHANGES HERE
							 do
							 {
								 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								 switch(c1)	
								 {
								 case 'y':Sen2K10K(); b=false; break; //MADE CHANGES HERE
								 case 'n':
								 {
									 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
									 do 
									 {
										 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
										 switch(c2)
										 {
										 case 'y': Senmenu(); b=false; break; //MADE CHANGES HERE
										 case 'n': Menu(); b=false; break;
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SENNHEISER HD 180";ob1[i++]=6999;
						 System.out.print("Do you want to continue shopping in this Budget (Between 2k - 10k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':Sen2K10K(); b=false; break; // MADE CHANGES HEREE
							 case 'n':Senmenu(); b=false; break; // MADE CHANGES HEREE
							 default : System.out.print("Please enter valid option: ");
							 }
						 }while(b==true);  break;
						 case 'n':
						 {
							 System.out.print("Do you want to see another model in this Budget (Between 2k - 10k) [y/n or Y/N]:");  //MADE CHANGES HERE
							 do
							 {
								 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								 switch(c1)	
								 {
								 case 'y':Sen2K10K(); b=false; break; //MADE CHANGES HERE
								 case 'n':
								 {
									 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
									 do 
									 {
										 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
										 switch(c2)
										 {
										 case 'y': Senmenu(); b=false; break; //MADE CHANGES HERE
										 case 'n': Menu(); b=false; break;
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SENNHEISER HD 250BT";ob1[i++]=7950;
						 System.out.print("Do you want to continue shopping in this Budget (Between 2k - 10k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':Sen2K10K(); b=false; break; // MADE CHANGES HEREE
							 case 'n':Senmenu(); b=false; break; // MADE CHANGES HEREE
							 default : System.out.print("Please enter valid option: ");
							 }
						 }while(b==true);  break;
						 case 'n':
						 {
							 System.out.print("Do you want to see another model in this Budget (Between 2k - 10k) [y/n or Y/N]:");  //MADE CHANGES HERE
							 do
							 {
								 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								 switch(c1)	
								 {
								 case 'y':Sen2K10K(); b=false; break; //MADE CHANGES HERE
								 case 'n':
								 {
									 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
									 do 
									 {
										 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
										 switch(c2)
										 {
										 case 'y': Senmenu(); b=false; break; //MADE CHANGES HERE
										 case 'n': Menu(); b=false; break;
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SENNHEISER HD 200S";ob1[i++]=5690;
						 System.out.print("Do you want to continue shopping in this Budget (Between 2k - 10k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':Sen2K10K(); b=false; break; // MADE CHANGES HEREE
							 case 'n':Senmenu(); b=false; break; // MADE CHANGES HEREE
							 default : System.out.print("Please enter valid option: ");
							 }
						 }while(b==true);  break;
						 case 'n':
						 {
							 System.out.print("Do you want to see another model in this Budget (Between 2k - 10k) [y/n or Y/N]:");  //MADE CHANGES HERE
							 do
							 {
								 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								 switch(c1)	
								 {
								 case 'y':Sen2K10K(); b=false; break; //MADE CHANGES HERE
								 case 'n':
								 {
									 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
									 do 
									 {
										 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
										 switch(c2)
										 {
										 case 'y': Senmenu(); b=false; break; //MADE CHANGES HERE
										 case 'n': Menu(); b=false; break;
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SENNHEISER HD 2.10S";ob1[i++]=5990;
						 System.out.print("Do you want to continue shopping in this Budget (Between 2k - 10k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':Sen2K10K(); b=false; break; // MADE CHANGES HEREE
							 case 'n':Senmenu(); b=false; break; // MADE CHANGES HEREE
							 default : System.out.print("Please enter valid option: ");
							 }
						 }while(b==true);  break;
						 case 'n':
						 {
							 System.out.print("Do you want to see another model in this Budget (Between 2k - 10k) [y/n or Y/N]:");  //MADE CHANGES HERE
							 do
							 {
								 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								 switch(c1)	
								 {
								 case 'y':Sen2K10K(); b=false; break; //MADE CHANGES HERE
								 case 'n':
								 {
									 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
									 do 
									 {
										 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
										 switch(c2)
										 {
										 case 'y': Senmenu(); b=false; break; //MADE CHANGES HERE
										 case 'n': Menu(); b=false; break;
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SENNHEISER HD 461G";ob1[i++]=7990;
						 System.out.print("Do you want to continue shopping in this Budget (Between 2k - 10k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':Sen2K10K(); b=false; break; // MADE CHANGES HEREE
							 case 'n':Senmenu(); b=false; break; // MADE CHANGES HEREE
							 default : System.out.print("Please enter valid option: ");
							 }
						 }while(b==true);  break;
						 case 'n':
						 {
							 System.out.print("Do you want to see another model in this Budget (Between 2k - 10k) [y/n or Y/N]:");  //MADE CHANGES HERE
							 do
							 {
								 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								 switch(c1)	
								 {
								 case 'y':Sen2K10K(); b=false; break; //MADE CHANGES HERE
								 case 'n':
								 {
									 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
									 do 
									 {
										 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
										 switch(c2)
										 {
										 case 'y': Senmenu(); b=false; break; //MADE CHANGES HERE
										 case 'n': Menu(); b=false; break;
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SENNHEISER RS100 ||";ob1[i++]=8190;
						 System.out.print("Do you want to continue shopping in this Budget (Between 2k - 10k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':Sen2K10K(); b=false; break; // MADE CHANGES HEREE
							 case 'n':Senmenu(); b=false; break; // MADE CHANGES HEREE
							 default : System.out.print("Please enter valid option: ");
							 }
						 }while(b==true);  break;
						 case 'n':
						 {
							 System.out.print("Do you want to see another model in this Budget (Between 2k - 10k) [y/n or Y/N]:");  //MADE CHANGES HERE
							 do
							 {
								 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								 switch(c1)	
								 {
								 case 'y':Sen2K10K(); b=false; break; //MADE CHANGES HERE
								 case 'n':
								 {
									 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
									 do 
									 {
										 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
										 switch(c2)
										 {
										 case 'y': Senmenu(); b=false; break; //MADE CHANGES HERE
										 case 'n': Menu(); b=false; break;
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SENNHEISER HD 215 ||";ob1[i++]=7190;
						 System.out.print("Do you want to continue shopping in this Budget (Between 2k - 10k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':Sen2K10K(); b=false; break; // MADE CHANGES HEREE
							 case 'n':Senmenu(); b=false; break; // MADE CHANGES HEREE
							 default : System.out.print("Please enter valid option: ");
							 }
						 }while(b==true);  break;
						 case 'n':
						 {
							 System.out.print("Do you want to see another model in this Budget (Between 2k - 10k) [y/n or Y/N]:");  //MADE CHANGES HERE
							 do
							 {
								 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								 switch(c1)	
								 {
								 case 'y':Sen2K10K(); b=false; break; //MADE CHANGES HERE
								 case 'n':
								 {
									 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
									 do 
									 {
										 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
										 switch(c2)
										 {
										 case 'y': Senmenu(); b=false; break; //MADE CHANGES HERE
										 case 'n': Menu(); b=false; break;
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
					 case 10:  Senmenu(); b=false; break;
					 default:  System.out.print("Please enter valid option:");
				 }
			 }while(b==true);     
	   }
	   public static void Sen10K()
	   {System.out.println(RESET);
		     System.out.println("\t\t"+" _________________________________________________________________________________________________________________________________");  
			 System.out.println("\t\t"+"|                                                                                                                                 |");  
			 System.out.println("\t\t"+"|    ___________________       ___________________       ___________________       ___________________       ___________________  |");  
			 System.out.println("\t\t"+"|   |  1.SEN URBANATE   |     |    2.SEN HD300    |     |   3.SEN HD 450BT  |     |  4.SEN RS 195RF   |     |5.SEN MOMENTUM 2.0 | |");  
			 System.out.println("\t\t"+"|   |-------------------|     |-------------------|     |-------------------|     |-------------------|     |-------------------| |");  
			 System.out.println("\t\t"+"|   |.WIRELESS          |     |.WIRELESS          |     |.WIRELESS          |     |.WIRELESS          |     |.WIRELESS          | |");  
			 System.out.println("\t\t"+"|   |.Version: 5.1      |     |.Version: 5.1      |     |.Version: 5.0      |     |.Version: 5.2      |     |.Version: 5.2      | |");  
			 System.out.println("\t\t"+"|   |.Range : 10meters  |     |.Noise Cancellation|     |.Range: 10 meters  |     |.Range: 10meters   |     |.Range: 10meters   | |");  
			 System.out.println("\t\t"+"|   |.TalkTime:10 Hours |     |.TalkTime:10Hours  |     |.TalkTime:15Hours  |     |.TalkTime:8Hours   |     |.TalkTime:8Hours   | |");  
			 System.out.println("\t\t"+"|   |.StandbyTime:300Hrs|     |.StandbyTime:300Hrs|     |.StandbyTime:300Hrs|     |.StandbyTime:400Hrs|     |.StandbyTime:400Hrs| |");  
			 System.out.println("\t\t"+"|   |.Chargingtime:2Hrs |     |.Chargingtime:2Hrs |     |.Chargingtime:3Hrs |     |.Chargingtime:3Hrs |     |.Chargingtime:3Hrs | |");  
			 System.out.println("\t\t"+"|   |.Price : 11,190/-  |     |.Price : 15,675/-  |     |.Price : 12,999/-  |     |.Price : 17,950/-  |     |.Price : 15,690/-  | |");  
			 System.out.println("\t\t"+"|   |___________________|     |___________________|     |___________________|     |___________________|     |___________________| |");  
			 System.out.println("\t\t"+"|                                                                                                                                 |");  
			 System.out.println("\t\t"+"|                                                                                                                                 |");  
			 System.out.println("\t\t"+"|    ___________________       ___________________       ___________________       ___________________       ___________________  |");  
			 System.out.println("\t\t"+"|   |   6.SEN HD8 DJ    |     |   7.SEN RS 170    |     |    8.SEN HD 439   |     |   9.SEN HD 800    |     |                   | |");  
			 System.out.println("\t\t"+"|   |-------------------|     |-------------------|     |-------------------|     |-------------------|     |                   | |");  
			 System.out.println("\t\t"+"|   |.WIRELESS          |     |.WIRELESS          |     |.WIRELESS          |     |.WIRELESS          |     |      10.          | |");  
			 System.out.println("\t\t"+"|   |.Version: 5.0      |     |.Version: 5.1      |     |.Version: 5.0      |     |.Version: 5.2      |     |                   | |");  
			 System.out.println("\t\t"+"|   |.Range : 10meters  |     |.Range : 10meters  |     |.Range : 10meters  |     |.Range : 10meters  |     |      EXIT         | |");  
			 System.out.println("\t\t"+"|   |.TalkTime:70 Hours |     |.TalkTime:8 Hours  |     |.TalkTime:70Hours  |     |.TalkTime:70Hours  |     |     --------      | |");  
			 System.out.println("\t\t"+"|   |.StandbyTime:300Hrs|     |.StandbyTime:200Hrs|     |.StandbyTime:300Hrs|     |.StandbyTime:300Hrs|     |                   | |");  
			 System.out.println("\t\t"+"|   |.Chargingtime:3Hrs |     |.Chargingtime:3Hrs |     |.Chargingtime:3Hrs |     |.Chargingtime:3Hrs |     |                   | |");  
			 System.out.println("\t\t"+"|   |.Price : 13,990/-  |     |.Price : 17,990/-  |     |.Price : 18,190/-  |     |.Price : 19,190/-  |     |                   | |");  
			 System.out.println("\t\t"+"|   |___________________|     |___________________|     |___________________|     |___________________|     |___________________| |");  
			 System.out.println("\t\t"+"|                                                                                                                                 |");    
			 System.out.println("\t\t"+"|_________________________________________________________________________________________________________________________________|"); 
			 System.out.println(RESET); Sen10Kswitch();     
	   }
	   public static void Sen10Kswitch()
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SENNHEISER URBANATE";ob1[i++]=11190;
						 System.out.print("Do you want to continue shopping in this Budget (Above 10k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':Sen10K(); b=false; break; // MADE CHANGES HEREE
							 case 'n':Senmenu(); b=false; break; // MADE CHANGES HEREE
							 default : System.out.print("Please enter valid option: ");
							 }
						 }while(b==true);  break;
						 case 'n':
						 {
							 System.out.print("Do you want to see another model in this Budget (Above 10k) [y/n or Y/N]:");  //MADE CHANGES HERE
							 do
							 {
								 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								 switch(c1)	
								 {
								 case 'y':Sen10K(); b=false; break; //MADE CHANGES HERE
								 case 'n':
								 {
									 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
									 do 
									 {
										 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
										 switch(c2)
										 {
										 case 'y': Senmenu(); b=false; break; //MADE CHANGES HERE
										 case 'n': Menu(); b=false; break;
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SENNHEISER HD 300";ob1[i++]=12999;
						 System.out.print("Do you want to continue shopping in this Budget (Above 10k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':Sen10K(); b=false; break; // MADE CHANGES HEREE
							 case 'n':Senmenu(); b=false; break; // MADE CHANGES HEREE
							 default : System.out.print("Please enter valid option: ");
							 }
						 }while(b==true);  break;
						 case 'n':
						 {
							 System.out.print("Do you want to see another model in this Budget (Above 10k) [y/n or Y/N]:");  //MADE CHANGES HERE
							 do
							 {
								 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								 switch(c1)	
								 {
								 case 'y':Sen10K(); b=false; break; //MADE CHANGES HERE
								 case 'n':
								 {
									 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
									 do 
									 {
										 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
										 switch(c2)
										 {
										 case 'y': Senmenu(); b=false; break; //MADE CHANGES HERE
										 case 'n': Menu(); b=false; break;
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SENNHEISER HD 450BT";ob1[i++]=12999;
						 System.out.print("Do you want to continue shopping in this Budget (Above 10k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':Sen10K(); b=false; break; // MADE CHANGES HEREE
							 case 'n':Senmenu(); b=false; break; // MADE CHANGES HEREE
							 default : System.out.print("Please enter valid option: ");
							 }
						 }while(b==true);  break;
						 case 'n':
						 {
							 System.out.print("Do you want to see another model in this Budget (Above 10k) [y/n or Y/N]:");  //MADE CHANGES HERE
							 do
							 {
								 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								 switch(c1)	
								 {
								 case 'y':Sen10K(); b=false; break; //MADE CHANGES HERE
								 case 'n':
								 {
									 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
									 do 
									 {
										 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
										 switch(c2)
										 {
										 case 'y': Senmenu(); b=false; break; //MADE CHANGES HERE
										 case 'n': Menu(); b=false; break;
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SENNHEISER RS 195RF";ob1[i++]=17950;
						 System.out.print("Do you want to continue shopping in this Budget (Above 10k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':Sen10K(); b=false; break; // MADE CHANGES HEREE
							 case 'n':Senmenu(); b=false; break; // MADE CHANGES HEREE
							 default : System.out.print("Please enter valid option: ");
							 }
						 }while(b==true);  break;
						 case 'n':
						 {
							 System.out.print("Do you want to see another model in this Budget (Above 10k) [y/n or Y/N]:");  //MADE CHANGES HERE
							 do
							 {
								 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								 switch(c1)	
								 {
								 case 'y':Sen10K(); b=false; break; //MADE CHANGES HERE
								 case 'n':
								 {
									 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
									 do 
									 {
										 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
										 switch(c2)
										 {
										 case 'y': Senmenu(); b=false; break; //MADE CHANGES HERE
										 case 'n': Menu(); b=false; break;
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
						 case 'y':System.out.println("Your Item is added to cart .");  ob[i]="SENNHEISER MOMENTUM 2.0";ob1[i++]=15690;
						 System.out.print("Do you want to continue shopping in this Budget (Above 10k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':Sen10K(); b=false; break; // MADE CHANGES HEREE
							 case 'n':Senmenu(); b=false; break; // MADE CHANGES HEREE
							 default : System.out.print("Please enter valid option: ");
							 }
						 }while(b==true);  break;
						 case 'n':
						 {
							 System.out.print("Do you want to see another model in this Budget (Above 10k) [y/n or Y/N]:");  //MADE CHANGES HERE
							 do
							 {
								 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								 switch(c1)	
								 {
								 case 'y':Sen10K(); b=false; break; //MADE CHANGES HERE
								 case 'n':
								 {
									 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
									 do 
									 {
										 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
										 switch(c2)
										 {
										 case 'y': Senmenu(); b=false; break; //MADE CHANGES HERE
										 case 'n': Menu(); b=false; break;
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
						 case 'y':System.out.println("Your Item is added to cart .");   ob[i]="SENNHEISER HD 8 DJ";ob1[i++]=13990;
						 System.out.print("Do you want to continue shopping in this Budget (Above 10k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':Sen10K(); b=false; break; // MADE CHANGES HEREE
							 case 'n':Senmenu(); b=false; break; // MADE CHANGES HEREE
							 default : System.out.print("Please enter valid option: ");
							 }
						 }while(b==true);  break;
						 case 'n':
						 {
							 System.out.print("Do you want to see another model in this Budget (Above 10k) [y/n or Y/N]:");  //MADE CHANGES HERE
							 do
							 {
								 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								 switch(c1)	
								 {
								 case 'y':Sen10K(); b=false; break; //MADE CHANGES HERE
								 case 'n':
								 {
									 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
									 do 
									 {
										 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
										 switch(c2)
										 {
										 case 'y': Senmenu(); b=false; break; //MADE CHANGES HERE
										 case 'n': Menu(); b=false; break;
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
						 case 'y':System.out.println("Your Item is added to cart .");  ob[i]="SENNHEISER RS170";ob1[i++]=17990;
						 System.out.print("Do you want to continue shopping in this Budget (Above 10k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':Sen10K(); b=false; break; // MADE CHANGES HEREE
							 case 'n':Senmenu(); b=false; break; // MADE CHANGES HEREE
							 default : System.out.print("Please enter valid option: ");
							 }
						 }while(b==true);  break;
						 case 'n':
						 {
							 System.out.print("Do you want to see another model in this Budget (Above 10k) [y/n or Y/N]:");  //MADE CHANGES HERE
							 do
							 {
								 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								 switch(c1)	
								 {
								 case 'y':Sen10K(); b=false; break; //MADE CHANGES HERE
								 case 'n':
								 {
									 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
									 do 
									 {
										 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
										 switch(c2)
										 {
										 case 'y': Senmenu(); b=false; break; //MADE CHANGES HERE
										 case 'n': Menu(); b=false; break;
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SENNHEISER HD 439";ob1[i++]=18190;
						 System.out.print("Do you want to continue shopping in this Budget (Above 10k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':Sen10K(); b=false; break; // MADE CHANGES HEREE
							 case 'n':Senmenu(); b=false; break; // MADE CHANGES HEREE
							 default : System.out.print("Please enter valid option: ");
							 }
						 }while(b==true);  break;
						 case 'n':
						 {
							 System.out.print("Do you want to see another model in this Budget (Above 10k) [y/n or Y/N]:");  //MADE CHANGES HERE
							 do
							 {
								 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								 switch(c1)	
								 {
								 case 'y':Sen10K(); b=false; break; //MADE CHANGES HERE
								 case 'n':
								 {
									 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
									 do 
									 {
										 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
										 switch(c2)
										 {
										 case 'y': Senmenu(); b=false; break; //MADE CHANGES HERE
										 case 'n': Menu(); b=false; break;
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
						 case 'y':System.out.println("Your Item is added to cart .");  ob[i]="SENNHEISER HD 800";ob1[i++]=19190;
						 System.out.print("Do you want to continue shopping in this Budget (Above 10k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':Sen10K(); b=false; break; // MADE CHANGES HEREE
							 case 'n':Senmenu(); b=false; break; // MADE CHANGES HEREE
							 default : System.out.print("Please enter valid option: ");
							 }
						 }while(b==true);  break;
						 case 'n':
						 {
							 System.out.print("Do you want to see another model in this Budget (Above 10k) [y/n or Y/N]:");  //MADE CHANGES HERE
							 do
							 {
								 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								 switch(c1)	
								 {
								 case 'y':Sen10K(); b=false; break; //MADE CHANGES HERE
								 case 'n':
								 {
									 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
									 do 
									 {
										 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
										 switch(c2)
										 {
										 case 'y': Senmenu(); b=false; break; //MADE CHANGES HERE
										 case 'n': Menu(); b=false; break;
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
					 case 10:  Senmenu(); b=false; break;
					 default:  System.out.print("Please enter valid option:");
				 }
			 }while(b==true);     
	   }
	   public static void Skullmenu()
	   {System.out.println(RESET);
		    System.out.println("\t\t\t\t\t\t"+"                        SKULLCANDY                          ");  
			 System.out.println("\t\t\t\t\t\t"+"                      -------------                      ");  
			 System.out.println("\t\t\t\t\t\t"+"                      1.Between 2K-10K                   ");  
			 System.out.println("\t\t\t\t\t\t"+"                      2.Above 10K                        ");
			 System.out.println("\t\t\t\t\t\t"+"                      3.EXIT FROM SKULLCANDY              "); //MADE CAHNGES HERE
			 System.out.println(RESET); Skullswitch();    
	   }
	   public static void Skullswitch()
	   {
		   System.out.print("PLEASE ENTER THE PRICE RANGE  :");
			 do
			 {
				 int p=sc.nextInt();
				switch(p) 
				{
				case 1: Skull2K10K(); b=false; break;
				case 2: Skull10K(); b=false; break;
				case 3: Menu();b=false; break;
			    default:
			    	{
			    		System.out.print("Please enter valid option:");
			    		Skullmenu(); 
			    		
			    	}
				}
			 }while(b==true);  
	   }
	   public static void Skull2K10K()
	   {System.out.println(RESET);
		     System.out.println("\t\t"+" _________________________________________________________________________________________________________________________________");  
			 System.out.println("\t\t"+"|                                                                                                                                 |");  
			 System.out.println("\t\t"+"|    ___________________       ___________________       ___________________       ___________________       ___________________  |");  
			 System.out.println("\t\t"+"|   |   1.SKULL S5LHZ   |     |   2.SKULL J567    |     |   3.SKULL S5URHT  |     |4.SKULL S5CSWM448  |     |  5.SKULL S6HBHY   | |");  
			 System.out.println("\t\t"+"|   |-------------------|     |-------------------|     |-------------------|     |-------------------|     |-------------------| |");  
			 System.out.println("\t\t"+"|   |.WIRELESS          |     |.WIRELESS          |     |.WIRELESS          |     |.WIRELESS          |     |.WIRELESS          | |");  
			 System.out.println("\t\t"+"|   |.Version: 5.1      |     |.Version: 5.1      |     |.Version: 5.0      |     |.Version: 4.2      |     |.Version: 4.2      | |");  
			 System.out.println("\t\t"+"|   |.Range : 10meters  |     |.Noise Cancellation|     |.Range: 10 meters  |     |.Range: 10meters   |     |.Range: 10meters   | |");  
			 System.out.println("\t\t"+"|   |.TalkTime:10 Hours |     |.TalkTime:10Hours  |     |.TalkTime:15Hours  |     |.TalkTime:8Hours   |     |.TalkTime:8Hours   | |");  
			 System.out.println("\t\t"+"|   |.StandbyTime:150Hrs|     |.StandbyTime:100Hrs|     |.StandbyTime:180Hrs|     |.StandbyTime:400Hrs|     |.StandbyTime:400Hrs| |");  
			 System.out.println("\t\t"+"|   |.Chargingtime:2Hrs |     |.Chargingtime:2Hrs |     |.Chargingtime:3Hrs |     |.Chargingtime:3Hrs |     |.Chargingtime:3Hrs | |");  
			 System.out.println("\t\t"+"|   |.Price : 7,190/-   |     |.Price : 5,675/-   |     |.Price : 6,999/-   |     |.Price :  7,950/-  |     |.Price :  5,690/-  | |");  
			 System.out.println("\t\t"+"|   |___________________|     |___________________|     |___________________|     |___________________|     |___________________| |");  
			 System.out.println("\t\t"+"|                                                                                                                                 |");  
			 System.out.println("\t\t"+"|                                                                                                                                 |");  
			 System.out.println("\t\t"+"|    ___________________       ___________________       ___________________                                                      |");  
			 System.out.println("\t\t"+"|   |6.SKULL HESH EVO   |     |   7.SKULL HESH 3  |     |                   |                                                     |");  
			 System.out.println("\t\t"+"|   |-------------------|     |-------------------|     |                   |                                                     |");  
			 System.out.println("\t\t"+"|   |.WIRELESS          |     |.WIRELESS          |     |      8.           |                                                     |");  
			 System.out.println("\t\t"+"|   |.Version: 5.0      |     |.Version: 5.1      |     |                   |                                                     |");  
			 System.out.println("\t\t"+"|   |.Range : 10meters  |     |.Range : 10meters  |     |      EXIT         |                                                     |");  
			 System.out.println("\t\t"+"|   |.TalkTime:70 Hours |     |.TalkTime:8 Hours  |     |     --------      |                                                     |");  
			 System.out.println("\t\t"+"|   |.StandbyTime:300Hrs|     |.StandbyTime:200Hrs|     |                   |                                                     |");  
			 System.out.println("\t\t"+"|   |.Chargingtime:3Hrs |     |.Chargingtime:3Hrs |     |                   |                                                     |");  
			 System.out.println("\t\t"+"|   |.Price :  3,990/-  |     |.Price : 7,990/-   |     |                   |                                                     |");  
			 System.out.println("\t\t"+"|   |___________________|     |___________________|     |___________________|                                                     |");  
			 System.out.println("\t\t"+"|                                                                                                                                 |");    
			 System.out.println("\t\t"+"|_________________________________________________________________________________________________________________________________|"); 
			 System.out.println(RESET);     
			 Skull2K10Kswitch();  
	   }
	   public static void Skull2K10Kswitch()
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SKULLCANDY S5LHZ";ob1[i++]=7190;
						 System.out.print("Do you want to continue shopping in this Budget (Betwee 2k - 10k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':Skull2K10K(); b=false; break; // MADE CHANGES HEREE
							 case 'n':Skullmenu(); b=false; break; // MADE CHANGES HEREE
							 default : System.out.print("Please enter valid option: ");
							 }
						 }while(b==true);  break;
						 case 'n':
						 {
							 System.out.print("Do you want to see another model in this Budget (Between 2k - 10k) [y/n or Y/N]:");  //MADE CHANGES HERE
							 do
							 {
								 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								 switch(c1)	
								 {
								 case 'y':Skull2K10K(); b=false; break; //MADE CHANGES HERE
								 case 'n':
								 {
									 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
									 do 
									 {
										 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
										 switch(c2)
										 {
										 case 'y': Skullmenu(); b=false; break; //MADE CHANGES HERE
										 case 'n': Menu(); b=false; break;
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SKULLCANDY J567";ob1[i++]=5675;
						 System.out.print("Do you want to continue shopping in this Budget (Betwee 2k - 10k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':Skull2K10K(); b=false; break; // MADE CHANGES HEREE
							 case 'n':Skullmenu(); b=false; break; // MADE CHANGES HEREE
							 default : System.out.print("Please enter valid option: ");
							 }
						 }while(b==true);  break;
						 case 'n':
						 {
							 System.out.print("Do you want to see another model in this Budget (Between 2k - 10k) [y/n or Y/N]:");  //MADE CHANGES HERE
							 do
							 {
								 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								 switch(c1)	
								 {
								 case 'y':Skull2K10K(); b=false; break; //MADE CHANGES HERE
								 case 'n':
								 {
									 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
									 do 
									 {
										 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
										 switch(c2)
										 {
										 case 'y': Skullmenu(); b=false; break; //MADE CHANGES HERE
										 case 'n': Menu(); b=false; break;
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SKULLCANDY S5URHT";ob1[i++]=6999;
						 System.out.print("Do you want to continue shopping in this Budget (Betwee 2k - 10k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':Skull2K10K(); b=false; break; // MADE CHANGES HEREE
							 case 'n':Skullmenu(); b=false; break; // MADE CHANGES HEREE
							 default : System.out.print("Please enter valid option: ");
							 }
						 }while(b==true);  break;
						 case 'n':
						 {
							 System.out.print("Do you want to see another model in this Budget (Between 2k - 10k) [y/n or Y/N]:");  //MADE CHANGES HERE
							 do
							 {
								 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								 switch(c1)	
								 {
								 case 'y':Skull2K10K(); b=false; break; //MADE CHANGES HERE
								 case 'n':
								 {
									 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
									 do 
									 {
										 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
										 switch(c2)
										 {
										 case 'y': Skullmenu(); b=false; break; //MADE CHANGES HERE
										 case 'n': Menu(); b=false; break;
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SKULLCANDY S5CSWM448";ob1[i++]=7950;
						 System.out.print("Do you want to continue shopping in this Budget (Betwee 2k - 10k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':Skull2K10K(); b=false; break; // MADE CHANGES HEREE
							 case 'n':Skullmenu(); b=false; break; // MADE CHANGES HEREE
							 default : System.out.print("Please enter valid option: ");
							 }
						 }while(b==true);  break;
						 case 'n':
						 {
							 System.out.print("Do you want to see another model in this Budget (Between 2k - 10k) [y/n or Y/N]:");  //MADE CHANGES HERE
							 do
							 {
								 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								 switch(c1)	
								 {
								 case 'y':Skull2K10K(); b=false; break; //MADE CHANGES HERE
								 case 'n':
								 {
									 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
									 do 
									 {
										 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
										 switch(c2)
										 {
										 case 'y': Skullmenu(); b=false; break; //MADE CHANGES HERE
										 case 'n': Menu(); b=false; break;
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SKULLCANDY S6HBHY";ob1[i++]=5690;
						 System.out.print("Do you want to continue shopping in this Budget (Betwee 2k - 10k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':Skull2K10K(); b=false; break; // MADE CHANGES HEREE
							 case 'n':Skullmenu(); b=false; break; // MADE CHANGES HEREE
							 default : System.out.print("Please enter valid option: ");
							 }
						 }while(b==true);  break;
						 case 'n':
						 {
							 System.out.print("Do you want to see another model in this Budget (Between 2k - 10k) [y/n or Y/N]:");  //MADE CHANGES HERE
							 do
							 {
								 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								 switch(c1)	
								 {
								 case 'y':Skull2K10K(); b=false; break; //MADE CHANGES HERE
								 case 'n':
								 {
									 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
									 do 
									 {
										 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
										 switch(c2)
										 {
										 case 'y': Skullmenu(); b=false; break; //MADE CHANGES HERE
										 case 'n': Menu(); b=false; break;
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SKULLCANDY HESH EVO";ob1[i++]=3990;
						 System.out.print("Do you want to continue shopping in this Budget (Betwee 2k - 10k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':Skull2K10K(); b=false; break; // MADE CHANGES HEREE
							 case 'n':Skullmenu(); b=false; break; // MADE CHANGES HEREE
							 default : System.out.print("Please enter valid option: ");
							 }
						 }while(b==true);  break;
						 case 'n':
						 {
							 System.out.print("Do you want to see another model in this Budget (Between 2k - 10k) [y/n or Y/N]:");  //MADE CHANGES HERE
							 do
							 {
								 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								 switch(c1)	
								 {
								 case 'y':Skull2K10K(); b=false; break; //MADE CHANGES HERE
								 case 'n':
								 {
									 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
									 do 
									 {
										 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
										 switch(c2)
										 {
										 case 'y': Skullmenu(); b=false; break; //MADE CHANGES HERE
										 case 'n': Menu(); b=false; break;
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SKULLCANDY HESH 3";ob1[i++]=7990;
						 System.out.print("Do you want to continue shopping in this Budget (Betwee 2k - 10k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':Skull2K10K(); b=false; break; // MADE CHANGES HEREE
							 case 'n':Skullmenu(); b=false; break; // MADE CHANGES HEREE
							 default : System.out.print("Please enter valid option: ");
							 }
						 }while(b==true);  break;
						 case 'n':
						 {
							 System.out.print("Do you want to see another model in this Budget (Between 2k - 10k) [y/n or Y/N]:");  //MADE CHANGES HERE
							 do
							 {
								 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								 switch(c1)	
								 {
								 case 'y':Skull2K10K(); b=false; break; //MADE CHANGES HERE
								 case 'n':
								 {
									 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
									 do 
									 {
										 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
										 switch(c2)
										 {
										 case 'y': Skullmenu(); b=false; break; //MADE CHANGES HERE
										 case 'n': Menu(); b=false; break;
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
				 
					 case 8:  Skullmenu(); b=false; break;
					 default:  System.out.print("Please enter valid option:");
				 }
			 }while(b==true);   
	   }
	   public static void Skull10K()
	   {System.out.println(RESET);
		     System.out.println("\t\t"+" _________________________________________________________________________________________________________________________________");  
			 System.out.println("\t\t"+"|                                                                                                                                 |");  
			 System.out.println("\t\t"+"|    ___________________       ___________________       ___________________       ___________________       ___________________  |");  
			 System.out.println("\t\t"+"|   |  1.SKULL S51HDY   |     |  2.SKULL SGSCGY   |     |    3.SKULL ANC    |     |  4.SKULL S6SCGY   |     | 5.SKULL S5PXWL672 | |");  
			 System.out.println("\t\t"+"|   |-------------------|     |-------------------|     |-------------------|     |-------------------|     |-------------------| |");  
			 System.out.println("\t\t"+"|   |.WIRELESS          |     |.WIRELESS          |     |.WIRELESS          |     |.WIRELESS          |     |.WIRELESS          | |");  
			 System.out.println("\t\t"+"|   |.Version: 5.1      |     |.Version: 5.0      |     |.Version: 5.0      |     |.Version: 5.2      |     |.Version: 5.2      | |");  
			 System.out.println("\t\t"+"|   |.Range : 10meters  |     |.Range : 10meters  |     |.Range: 10 meters  |     |.Range: 10meters   |     |.Range: 10meters   | |");  
			 System.out.println("\t\t"+"|   |.TalkTime:10 Hours |     |.TalkTime:10Hours  |     |.TalkTime:15Hours  |     |.TalkTime:8Hours   |     |.TalkTime:8Hours   | |");  
			 System.out.println("\t\t"+"|   |.StandbyTime:180Hrs|     |.StandbyTime:150Hrs|     |.StandbyTime:200Hrs|     |.StandbyTime:160Hrs|     |.StandbyTime:150Hrs| |");  
			 System.out.println("\t\t"+"|   |.Chargingtime:2Hrs |     |.Chargingtime:2Hrs |     |.Chargingtime:3Hrs |     |.Chargingtime:2Hrs |     |.Chargingtime:3Hrs | |");  
			 System.out.println("\t\t"+"|   |.Price : 11,190/-  |     |.Price : 15,675/-  |     |.Price : 12,999/-  |     |.Price : 17,950/-  |     |.Price : 15,690/-  | |");  
			 System.out.println("\t\t"+"|   |___________________|     |___________________|     |___________________|     |___________________|     |___________________| |");  
			 System.out.println("\t\t"+"|                                                                                                                                 |");  
			 System.out.println("\t\t"+"|                                                                                                                                 |");  
			 System.out.println("\t\t"+"|    ___________________       ___________________       ___________________       ___________________       ___________________  |");  
			 System.out.println("\t\t"+"|   |6.SKULL CRUSHER EVO|     |7.SKULL SGSCFY-325 |     |8.SKULL S6HTW-KO33 |     |   9.SKULL VENUE   |     |                   | |");  
			 System.out.println("\t\t"+"|   |-------------------|     |-------------------|     |-------------------|     |-------------------|     |                   | |");  
			 System.out.println("\t\t"+"|   |.WIRELESS          |     |.WIRELESS          |     |.WIRELESS          |     |.WIRELESS          |     |      10.          | |");  
			 System.out.println("\t\t"+"|   |.Version: 5.0      |     |.Version: 5.1      |     |.Version: 5.2      |     |.Version: 5.2      |     |                   | |");  
			 System.out.println("\t\t"+"|   |.Range : 10meters  |     |.Range : 10meters  |     |.Range : 10meters  |     |.Range : 10meters  |     |      EXIT         | |");  
			 System.out.println("\t\t"+"|   |.TalkTime:70 Hours |     |.TalkTime:8 Hours  |     |.TalkTime:70Hours  |     |.TalkTime:70Hours  |     |     --------      | |");  
			 System.out.println("\t\t"+"|   |.StandbyTime:180Hrs|     |.StandbyTime:200Hrs|     |.StandbyTime:150Hrs|     |.StandbyTime:170Hrs|     |                   | |");  
			 System.out.println("\t\t"+"|   |.Chargingtime:2Hrs |     |.Chargingtime:3Hrs |     |.Chargingtime:2Hrs |     |.Chargingtime:3Hrs |     |                   | |");  
			 System.out.println("\t\t"+"|   |.Price : 13,990/-  |     |.Price : 17,990/-  |     |.Price : 18,190/-  |     |.Price : 19,190/-  |     |                   | |");  
			 System.out.println("\t\t"+"|   |___________________|     |___________________|     |___________________|     |___________________|     |___________________| |");  
			 System.out.println("\t\t"+"|                                                                                                                                 |");    
			 System.out.println("\t\t"+"|_________________________________________________________________________________________________________________________________|"); 
			 System.out.println(RESET);	 Skull10Kswitch();      
	   }
	   public static void Skull10Kswitch()
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SKULLCANDY S51HDY";ob1[i++]=11190;
						 System.out.print("Do you want to continue shopping in this Budget (Above 10k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':Skull10K(); b=false; break; // MADE CHANGES HEREE
							 case 'n':Skullmenu(); b=false; break; // MADE CHANGES HEREE
							 default : System.out.print("Please enter valid option: ");
							 }
						 }while(b==true);  break;
						 case 'n':
						 {
							 System.out.print("Do you want to see another model in this Budget (Above 10k) [y/n or Y/N]:");  //MADE CHANGES HERE
							 do
							 {
								 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								 switch(c1)	
								 {
								 case 'y':Skull10K(); b=false; break; //MADE CHANGES HERE
								 case 'n':
								 {
									 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
									 do 
									 {
										 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
										 switch(c2)
										 {
										 case 'y': Skullmenu(); b=false; break; //MADE CHANGES HERE
										 case 'n': Menu(); b=false; break;
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SKULLCANDY SGSCGY";ob1[i++]=15675;
						 System.out.print("Do you want to continue shopping in this Budget (Above 10k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':Skull10K(); b=false; break; // MADE CHANGES HEREE
							 case 'n':Skullmenu(); b=false; break; // MADE CHANGES HEREE
							 default : System.out.print("Please enter valid option: ");
							 }
						 }while(b==true);  break;
						 case 'n':
						 {
							 System.out.print("Do you want to see another model in this Budget (Above 10k) [y/n or Y/N]:");  //MADE CHANGES HERE
							 do
							 {
								 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								 switch(c1)	
								 {
								 case 'y':Skull10K(); b=false; break; //MADE CHANGES HERE
								 case 'n':
								 {
									 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
									 do 
									 {
										 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
										 switch(c2)
										 {
										 case 'y': Skullmenu(); b=false; break; //MADE CHANGES HERE
										 case 'n': Menu(); b=false; break;
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SKULLCANDY ANC";ob1[i++]=12999;
						 System.out.print("Do you want to continue shopping in this Budget (Above 10k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':Skull10K(); b=false; break; // MADE CHANGES HEREE
							 case 'n':Skullmenu(); b=false; break; // MADE CHANGES HEREE
							 default : System.out.print("Please enter valid option: ");
							 }
						 }while(b==true);  break;
						 case 'n':
						 {
							 System.out.print("Do you want to see another model in this Budget (Above 10k) [y/n or Y/N]:");  //MADE CHANGES HERE
							 do
							 {
								 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								 switch(c1)	
								 {
								 case 'y':Skull10K(); b=false; break; //MADE CHANGES HERE
								 case 'n':
								 {
									 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
									 do 
									 {
										 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
										 switch(c2)
										 {
										 case 'y': Skullmenu(); b=false; break; //MADE CHANGES HERE
										 case 'n': Menu(); b=false; break;
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SKULLCANDY S6SCGY";ob1[i++]=17950;
						 System.out.print("Do you want to continue shopping in this Budget (Above 10k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':Skull10K(); b=false; break; // MADE CHANGES HEREE
							 case 'n':Skullmenu(); b=false; break; // MADE CHANGES HEREE
							 default : System.out.print("Please enter valid option: ");
							 }
						 }while(b==true);  break;
						 case 'n':
						 {
							 System.out.print("Do you want to see another model in this Budget (Above 10k) [y/n or Y/N]:");  //MADE CHANGES HERE
							 do
							 {
								 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								 switch(c1)	
								 {
								 case 'y':Skull10K(); b=false; break; //MADE CHANGES HERE
								 case 'n':
								 {
									 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
									 do 
									 {
										 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
										 switch(c2)
										 {
										 case 'y': Skullmenu(); b=false; break; //MADE CHANGES HERE
										 case 'n': Menu(); b=false; break;
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SKULLCANDY S5PXWL672";ob1[i++]=15690;
						 System.out.print("Do you want to continue shopping in this Budget (Above 10k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':Skull10K(); b=false; break; // MADE CHANGES HEREE
							 case 'n':Skullmenu(); b=false; break; // MADE CHANGES HEREE
							 default : System.out.print("Please enter valid option: ");
							 }
						 }while(b==true);  break;
						 case 'n':
						 {
							 System.out.print("Do you want to see another model in this Budget (Above 10k) [y/n or Y/N]:");  //MADE CHANGES HERE
							 do
							 {
								 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								 switch(c1)	
								 {
								 case 'y':Skull10K(); b=false; break; //MADE CHANGES HERE
								 case 'n':
								 {
									 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
									 do 
									 {
										 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
										 switch(c2)
										 {
										 case 'y': Skullmenu(); b=false; break; //MADE CHANGES HERE
										 case 'n': Menu(); b=false; break;
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SKULLCANDY CRUSHER EVO";ob1[i++]=13990;
						 System.out.print("Do you want to continue shopping in this Budget (Above 10k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':Skull10K(); b=false; break; // MADE CHANGES HEREE
							 case 'n':Skullmenu(); b=false; break; // MADE CHANGES HEREE
							 default : System.out.print("Please enter valid option: ");
							 }
						 }while(b==true);  break;
						 case 'n':
						 {
							 System.out.print("Do you want to see another model in this Budget (Above 10k) [y/n or Y/N]:");  //MADE CHANGES HERE
							 do
							 {
								 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								 switch(c1)	
								 {
								 case 'y':Skull10K(); b=false; break; //MADE CHANGES HERE
								 case 'n':
								 {
									 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
									 do 
									 {
										 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
										 switch(c2)
										 {
										 case 'y': Skullmenu(); b=false; break; //MADE CHANGES HERE
										 case 'n': Menu(); b=false; break;
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SKULLCANDY SGSCFY-325";ob1[i++]=17990;
						 System.out.print("Do you want to continue shopping in this Budget (Above 10k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':Skull10K(); b=false; break; // MADE CHANGES HEREE
							 case 'n':Skullmenu(); b=false; break; // MADE CHANGES HEREE
							 default : System.out.print("Please enter valid option: ");
							 }
						 }while(b==true);  break;
						 case 'n':
						 {
							 System.out.print("Do you want to see another model in this Budget (Above 10k) [y/n or Y/N]:");  //MADE CHANGES HERE
							 do
							 {
								 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								 switch(c1)	
								 {
								 case 'y':Skull10K(); b=false; break; //MADE CHANGES HERE
								 case 'n':
								 {
									 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
									 do 
									 {
										 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
										 switch(c2)
										 {
										 case 'y': Skullmenu(); b=false; break; //MADE CHANGES HERE
										 case 'n': Menu(); b=false; break;
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SKULLCANDY S6HTW-KO33";ob1[i++]=18190;
						 System.out.print("Do you want to continue shopping in this Budget (Above 10k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':Skull10K(); b=false; break; // MADE CHANGES HEREE
							 case 'n':Skullmenu(); b=false; break; // MADE CHANGES HEREE
							 default : System.out.print("Please enter valid option: ");
							 }
						 }while(b==true);  break;
						 case 'n':
						 {
							 System.out.print("Do you want to see another model in this Budget (Above 10k) [y/n or Y/N]:");  //MADE CHANGES HERE
							 do
							 {
								 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								 switch(c1)	
								 {
								 case 'y':Skull10K(); b=false; break; //MADE CHANGES HERE
								 case 'n':
								 {
									 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
									 do 
									 {
										 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
										 switch(c2)
										 {
										 case 'y': Skullmenu(); b=false; break; //MADE CHANGES HERE
										 case 'n': Menu(); b=false; break;
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SKULLCANDY VENUE";ob1[i++]=19190;
						 System.out.print("Do you want to continue shopping in this Budget (Above 10k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':Skull10K(); b=false; break; // MADE CHANGES HEREE
							 case 'n':Skullmenu(); b=false; break; // MADE CHANGES HEREE
							 default : System.out.print("Please enter valid option: ");
							 }
						 }while(b==true);  break;
						 case 'n':
						 {
							 System.out.print("Do you want to see another model in this Budget (Above 10k) [y/n or Y/N]:");  //MADE CHANGES HERE
							 do
							 {
								 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								 switch(c1)	
								 {
								 case 'y':Skull10K(); b=false; break; //MADE CHANGES HERE
								 case 'n':
								 {
									 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
									 do 
									 {
										 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
										 switch(c2)
										 {
										 case 'y': Skullmenu(); b=false; break; //MADE CHANGES HERE
										 case 'n': Menu(); b=false; break;
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
				 
					 case 10:  Skullmenu(); b=false; break;
					 default:  System.out.print("Please enter valid option:");
				 }
			 }while(b==true);   
	   }
	   public static void Zebmenu()
	   {System.out.println(RESET);
		     System.out.println("\t\t\t\t\t\t"+"                        ZEBRONICS                            ");  
			 System.out.println("\t\t\t\t\t\t"+"                      -------------                      ");  
			 System.out.println("\t\t\t\t\t\t"+"                      1.Between 2K-10K                         ");  
			 System.out.println("\t\t\t\t\t\t"+"                      2.Above 10K                    ");
			 System.out.println("\t\t\t\t\t\t"+"                      3.EXIT FROM ZEBRONICS          "); //MADE CHNAGES HERE
			 System.out.println(RESET); Zebswitch();
	   }
	   public static void Zebswitch()
	   {
		   System.out.print("PLEASE ENTER THE PRICE RANGE  :");
			 do
			 {
				 int p=sc.nextInt();
				switch(p) 
				{
				case 1: Zeb2K10K(); b=false; break;
				case 2: Zeb10K(); b=false; break;
				case 3: Menu();b=false; break;
			    default:
			    	{
			    		System.out.print("Please enter valid option:");
			    	    Zebmenu(); 
			    		
			    	}
				}
			 }while(b==true); 
	   }
	   public static void Zeb2K10K()
	   {
		   System.out.println(RESET);  
		   System.out.println("\t\t"+" _________________________________________________________________________________________________________________________________");  
			 System.out.println("\t\t"+"|                                                                                                                                 |");  
			 System.out.println("\t\t"+"|    ___________________       ___________________       ___________________       ___________________       ___________________  |");  
			 System.out.println("\t\t"+"|   |   1.ZEB SHP1901   |     |   2.ZEB SHL4600   |     |  3.ZEB SHB3175BK  |     |   4.ZEB SHD8600   |     |  5.ZEB SHD8802    | |");  
			 System.out.println("\t\t"+"|   |-------------------|     |-------------------|     |-------------------|     |-------------------|     |-------------------| |");  
			 System.out.println("\t\t"+"|   |.WIRELESS          |     |.WIRELESS          |     |.WIRELESS          |     |.WIRELESS          |     |.WIRELESS          | |");  
			 System.out.println("\t\t"+"|   |.Version: 5.1      |     |.Version: 5.1      |     |.Version: 5.0      |     |.Version: 5.2      |     |.Version: 5.2      | |");  
			 System.out.println("\t\t"+"|   |.Range : 10meters  |     |.Range : 10meters  |     |.Range: 10 meters  |     |.Range: 10meters   |     |.Range: 10meters   | |");  
			 System.out.println("\t\t"+"|   |.TalkTime:10 Hours |     |.TalkTime:10Hours  |     |.TalkTime:15Hours  |     |.TalkTime:8Hours   |     |.TalkTime:8Hours   | |");  
			 System.out.println("\t\t"+"|   |.StandbyTime:180Hrs|     |.StandbyTime:200Hrs|     |.StandbyTime:150Hrs|     |.StandbyTime:200Hrs|     |.StandbyTime:100Hrs| |");  
			 System.out.println("\t\t"+"|   |.Chargingtime:2Hrs |     |.Chargingtime:2Hrs |     |.Chargingtime:3Hrs |     |.Chargingtime:3Hrs |     |.Chargingtime:3Hrs | |");  
			 System.out.println("\t\t"+"|   |.Price : 7,190/-   |     |.Price : 5,675/-   |     |.Price : 6,999/-   |     |.Price :  7,950/-  |     |.Price :  5,690/-  | |");  
			 System.out.println("\t\t"+"|   |___________________|     |___________________|     |___________________|     |___________________|     |___________________| |");  
			 System.out.println("\t\t"+"|                                                                                                                                 |");  
			 System.out.println("\t\t"+"|                                                                                                                                 |");  
			 System.out.println("\t\t"+"|    ___________________       ___________________       ___________________       ___________________       ___________________  |");  
			 System.out.println("\t\t"+"|   |  6.ZEB TAH6506BK  |     |  7.ZEB TAPH802BK  |     |  8.ZEB TASH402BK  |     |  9.ZEB SHP2500    |     |                   | |");  
			 System.out.println("\t\t"+"|   |-------------------|     |-------------------|     |-------------------|     |-------------------|     |                   | |");  
			 System.out.println("\t\t"+"|   |.WIRELESS          |     |.WIRELESS          |     |.WIRELESS          |     |.WIRELESS          |     |      10.          | |");  
			 System.out.println("\t\t"+"|   |.Version: 5.0      |     |.Version: 5.1      |     |.Version: 5.2      |     |.Version: 5.2      |     |                   | |");  
			 System.out.println("\t\t"+"|   |.Range : 10meters  |     |.Range : 10meters  |     |.Range : 10meters  |     |.Range : 10meters  |     |      EXIT         | |");  
			 System.out.println("\t\t"+"|   |.TalkTime:70 Hours |     |.TalkTime:8 Hours  |     |.TalkTime:70Hours  |     |.TalkTime:70Hours  |     |     --------      | |");  
			 System.out.println("\t\t"+"|   |.StandbyTime:200Hrs|     |.StandbyTime:150Hrs|     |.StandbyTime:180Hrs|     |.StandbyTime:160Hrs|     |                   | |");  
			 System.out.println("\t\t"+"|   |.Chargingtime:3Hrs |     |.Chargingtime:2Hrs |     |.Chargingtime:3Hrs |     |.Chargingtime:3Hrs |     |                   | |");  
			 System.out.println("\t\t"+"|   |.Price : 5,990/-   |     |.Price :  7,990/-  |     |.Price :  8,190/-  |     |.Price :  9,190/-  |     |                   | |");  
			 System.out.println("\t\t"+"|   |___________________|     |___________________|     |___________________|     |___________________|     |___________________| |");  
			 System.out.println("\t\t"+"|                                                                                                                                 |");    
			 System.out.println("\t\t"+"|_________________________________________________________________________________________________________________________________|");        
			 System.out.println(RESET);  Zeb2K10Kswitch();
	   }
	   public static void Zeb2K10Kswitch()
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="ZEBRONICS SHP1901";ob1[i++]=7190;
						 System.out.print("Do you want to continue shopping in this Budget (Between 2k - 10k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':Zeb2K10K(); b=false; break; // MADE CHANGES HEREE
							 case 'n':Zebmenu(); b=false; break; // MADE CHANGES HEREE
							 default : System.out.print("Please enter valid option: ");
							 }
						 }while(b==true);  break;
						 case 'n':
						 {
							 System.out.print("Do you want to see another model in this Budget (Between 2k - 10k) [y/n or Y/N]:");  //MADE CHANGES HERE
							 do
							 {
								 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								 switch(c1)	
								 {
								 case 'y':Zeb2K10K(); b=false; break; //MADE CHANGES HERE
								 case 'n':
								 {
									 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
									 do 
									 {
										 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
										 switch(c2)
										 {
										 case 'y': Zebmenu(); b=false; break; //MADE CHANGES HERE
										 case 'n': Menu(); b=false; break;
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="ZEBRONICS SHL4600";ob1[i++]=5675;
						 System.out.print("Do you want to continue shopping in this Budget (Between 2k - 10k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':Zeb2K10K(); b=false; break; // MADE CHANGES HEREE
							 case 'n':Zebmenu(); b=false; break; // MADE CHANGES HEREE
							 default : System.out.print("Please enter valid option: ");
							 }
						 }while(b==true);  break;
						 case 'n':
						 {
							 System.out.print("Do you want to see another model in this Budget (Between 2k - 10k) [y/n or Y/N]:");  //MADE CHANGES HERE
							 do
							 {
								 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								 switch(c1)	
								 {
								 case 'y':Zeb2K10K(); b=false; break; //MADE CHANGES HERE
								 case 'n':
								 {
									 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
									 do 
									 {
										 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
										 switch(c2)
										 {
										 case 'y': Zebmenu(); b=false; break; //MADE CHANGES HERE
										 case 'n': Menu(); b=false; break;
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="ZEBRONICS SHB3175BK";ob1[i++]=6999;
						 System.out.print("Do you want to continue shopping in this Budget (Between 2k - 10k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':Zeb2K10K(); b=false; break; // MADE CHANGES HEREE
							 case 'n':Zebmenu(); b=false; break; // MADE CHANGES HEREE
							 default : System.out.print("Please enter valid option: ");
							 }
						 }while(b==true);  break;
						 case 'n':
						 {
							 System.out.print("Do you want to see another model in this Budget (Between 2k - 10k) [y/n or Y/N]:");  //MADE CHANGES HERE
							 do
							 {
								 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								 switch(c1)	
								 {
								 case 'y':Zeb2K10K(); b=false; break; //MADE CHANGES HERE
								 case 'n':
								 {
									 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
									 do 
									 {
										 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
										 switch(c2)
										 {
										 case 'y': Zebmenu(); b=false; break; //MADE CHANGES HERE
										 case 'n': Menu(); b=false; break;
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="ZEBRONICS SHD8600";ob1[i++]=7950;
						 System.out.print("Do you want to continue shopping in this Budget (Between 2k - 10k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':Zeb2K10K(); b=false; break; // MADE CHANGES HEREE
							 case 'n':Zebmenu(); b=false; break; // MADE CHANGES HEREE
							 default : System.out.print("Please enter valid option: ");
							 }
						 }while(b==true);  break;
						 case 'n':
						 {
							 System.out.print("Do you want to see another model in this Budget (Between 2k - 10k) [y/n or Y/N]:");  //MADE CHANGES HERE
							 do
							 {
								 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								 switch(c1)	
								 {
								 case 'y':Zeb2K10K(); b=false; break; //MADE CHANGES HERE
								 case 'n':
								 {
									 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
									 do 
									 {
										 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
										 switch(c2)
										 {
										 case 'y': Zebmenu(); b=false; break; //MADE CHANGES HERE
										 case 'n': Menu(); b=false; break;
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="ZEBRONICS SHD8802";ob1[i++]=5690;
						 System.out.print("Do you want to continue shopping in this Budget (Between 2k - 10k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':Zeb2K10K(); b=false; break; // MADE CHANGES HEREE
							 case 'n':Zebmenu(); b=false; break; // MADE CHANGES HEREE
							 default : System.out.print("Please enter valid option: ");
							 }
						 }while(b==true);  break;
						 case 'n':
						 {
							 System.out.print("Do you want to see another model in this Budget (Between 2k - 10k) [y/n or Y/N]:");  //MADE CHANGES HERE
							 do
							 {
								 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								 switch(c1)	
								 {
								 case 'y':Zeb2K10K(); b=false; break; //MADE CHANGES HERE
								 case 'n':
								 {
									 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
									 do 
									 {
										 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
										 switch(c2)
										 {
										 case 'y': Zebmenu(); b=false; break; //MADE CHANGES HERE
										 case 'n': Menu(); b=false; break;
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="ZEBRONICS TAH6506BK";ob1[i++]=5990;
						 System.out.print("Do you want to continue shopping in this Budget (Between 2k - 10k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':Zeb2K10K(); b=false; break; // MADE CHANGES HEREE
							 case 'n':Zebmenu(); b=false; break; // MADE CHANGES HEREE
							 default : System.out.print("Please enter valid option: ");
							 }
						 }while(b==true);  break;
						 case 'n':
						 {
							 System.out.print("Do you want to see another model in this Budget (Between 2k - 10k) [y/n or Y/N]:");  //MADE CHANGES HERE
							 do
							 {
								 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								 switch(c1)	
								 {
								 case 'y':Zeb2K10K(); b=false; break; //MADE CHANGES HERE
								 case 'n':
								 {
									 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
									 do 
									 {
										 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
										 switch(c2)
										 {
										 case 'y': Zebmenu(); b=false; break; //MADE CHANGES HERE
										 case 'n': Menu(); b=false; break;
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="ZEBRONICS TAPH802BK";ob1[i++]=7990;
						 System.out.print("Do you want to continue shopping in this Budget (Between 2k - 10k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':Zeb2K10K(); b=false; break; // MADE CHANGES HEREE
							 case 'n':Zebmenu(); b=false; break; // MADE CHANGES HEREE
							 default : System.out.print("Please enter valid option: ");
							 }
						 }while(b==true);  break;
						 case 'n':
						 {
							 System.out.print("Do you want to see another model in this Budget (Between 2k - 10k) [y/n or Y/N]:");  //MADE CHANGES HERE
							 do
							 {
								 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								 switch(c1)	
								 {
								 case 'y':Zeb2K10K(); b=false; break; //MADE CHANGES HERE
								 case 'n':
								 {
									 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
									 do 
									 {
										 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
										 switch(c2)
										 {
										 case 'y': Zebmenu(); b=false; break; //MADE CHANGES HERE
										 case 'n': Menu(); b=false; break;
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="ZEBRONICS TASH402BK";ob1[i++]=8190;
						 System.out.print("Do you want to continue shopping in this Budget (Between 2k - 10k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':Zeb2K10K(); b=false; break; // MADE CHANGES HEREE
							 case 'n':Zebmenu(); b=false; break; // MADE CHANGES HEREE
							 default : System.out.print("Please enter valid option: ");
							 }
						 }while(b==true);  break;
						 case 'n':
						 {
							 System.out.print("Do you want to see another model in this Budget (Between 2k - 10k) [y/n or Y/N]:");  //MADE CHANGES HERE
							 do
							 {
								 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								 switch(c1)	
								 {
								 case 'y':Zeb2K10K(); b=false; break; //MADE CHANGES HERE
								 case 'n':
								 {
									 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
									 do 
									 {
										 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
										 switch(c2)
										 {
										 case 'y': Zebmenu(); b=false; break; //MADE CHANGES HERE
										 case 'n': Menu(); b=false; break;
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="ZEBRONICS SHP2500";ob1[i++]=9190;
						 System.out.print("Do you want to continue shopping in this Budget (Between 2k - 10k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':Zeb2K10K(); b=false; break; // MADE CHANGES HEREE
							 case 'n':Zebmenu(); b=false; break; // MADE CHANGES HEREE
							 default : System.out.print("Please enter valid option: ");
							 }
						 }while(b==true);  break;
						 case 'n':
						 {
							 System.out.print("Do you want to see another model in this Budget (Between 2k - 10k) [y/n or Y/N]:");  //MADE CHANGES HERE
							 do
							 {
								 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								 switch(c1)	
								 {
								 case 'y':Zeb2K10K(); b=false; break; //MADE CHANGES HERE
								 case 'n':
								 {
									 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
									 do 
									 {
										 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
										 switch(c2)
										 {
										 case 'y': Zebmenu(); b=false; break; //MADE CHANGES HERE
										 case 'n': Menu(); b=false; break;
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
				 			 
				 case 10: Zebmenu(); b=false; break;
					 default:  System.out.print("Please enter valid option:");
				 }
			 }while(b==true);  
	   }
	   public static void Zeb10K()
	   {System.out.println(RESET);
		     System.out.println("\t\t"+" _________________________________________________________________________________________________________________________________");  
			 System.out.println("\t\t"+"|                                                                                                                                 |");  
			 System.out.println("\t\t"+"|    ___________________       ___________________       ___________________       ___________________       ___________________  |");  
			 System.out.println("\t\t"+"|   |   1.ZEB SHP9500   |     |   2.ZEB SHB7000   |     |  3.ZEB TAPH805BK  |     |  4.ZEB SHB7150FB  |     |  5.ZEB SHB3500X3  | |");  
			 System.out.println("\t\t"+"|   |-------------------|     |-------------------|     |-------------------|     |-------------------|     |-------------------| |");  
			 System.out.println("\t\t"+"|   |.WIRELESS          |     |.WIRELESS          |     |.WIRELESS          |     |.WIRELESS          |     |.WIRELESS          | |");  
			 System.out.println("\t\t"+"|   |.Version: 5.1      |     |.Version: 5.1      |     |.Version: 5.0      |     |.Version: 5.2      |     |.Version: 5.2      | |");  
			 System.out.println("\t\t"+"|   |.Range : 10meters  |     |.Noise Cancellation|     |.Range: 10 meters  |     |.Range: 10meters   |     |.Range: 10meters   | |");  
			 System.out.println("\t\t"+"|   |.TalkTime:10 Hours |     |.TalkTime:10Hours  |     |.TalkTime:15Hours  |     |.TalkTime:8Hours   |     |.TalkTime:8Hours   | |");  
			 System.out.println("\t\t"+"|   |.StandbyTime:250Hrs|     |.StandbyTime:150Hrs|     |.StandbyTime:180Hrs|     |.StandbyTime:200Hrs|     |.StandbyTime:100Hrs| |");  
			 System.out.println("\t\t"+"|   |.Chargingtime:2Hrs |     |.Chargingtime:2Hrs |     |.Chargingtime:3Hrs |     |.Chargingtime:3Hrs |     |.Chargingtime:3Hrs | |");  
			 System.out.println("\t\t"+"|   |.Price : 11,190/-  |     |.Price : 15,675/-  |     |.Price : 12,999/-  |     |.Price : 17,950/-  |     |.Price : 15,690/-  | |");  
			 System.out.println("\t\t"+"|   |___________________|     |___________________|     |___________________|     |___________________|     |___________________| |");  
			 System.out.println("\t\t"+"|                                                                                                                                 |");  
			 System.out.println("\t\t"+"|                                                                                                                                 |");  
			 System.out.println("\t\t"+"|    ___________________       ___________________                                                                                |");  
			 System.out.println("\t\t"+"|   |    6.ZEB FX5MBX   |     |                   |                                                                               |");  
			 System.out.println("\t\t"+"|   |-------------------|     |                   |                                                                               |");  
			 System.out.println("\t\t"+"|   |.WIRELESS          |     |                   |                                                                               |");  
			 System.out.println("\t\t"+"|   |.Version: 5.0      |     |        7.         |                                                                               |");  
			 System.out.println("\t\t"+"|   |.Range : 10meters  |     |                   |                                                                               |");  
			 System.out.println("\t\t"+"|   |.TalkTime:70 Hours |     |       EXIT        |                                                                               |");  
			 System.out.println("\t\t"+"|   |.StandbyTime:150Hrs|     |     ---------     |                                                                               |");  
			 System.out.println("\t\t"+"|   |.Chargingtime:3Hrs |     |                   |                                                                               |");  
			 System.out.println("\t\t"+"|   |.Price : 13,990/-  |     |                   |                                                                               |");  
			 System.out.println("\t\t"+"|   |___________________|     |___________________|                                                                               |");  
			 System.out.println("\t\t"+"|                                                                                                                                 |");    
			 System.out.println("\t\t"+"|_________________________________________________________________________________________________________________________________|");       
			 System.out.println(RESET); Zeb10Kswitch();
	   }
	   public static void Zeb10Kswitch()
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="ZEBRONICS SHP9500";ob1[i++]=11190;
						 System.out.print("Do you want to continue shopping in this Budget (Above 10k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':Zeb10K(); b=false; break; // MADE CHANGES HEREE
							 case 'n':Zebmenu(); b=false; break; // MADE CHANGES HEREE
							 default : System.out.print("Please enter valid option: ");
							 }
						 }while(b==true);  break;
						 case 'n':
						 {
							 System.out.print("Do you want to see another model in this Budget (Above 10k) [y/n or Y/N]:");  //MADE CHANGES HERE
							 do
							 {
								 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								 switch(c1)	
								 {
								 case 'y':Zeb10K(); b=false; break; //MADE CHANGES HERE
								 case 'n':
								 {
									 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
									 do 
									 {
										 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
										 switch(c2)
										 {
										 case 'y': Zebmenu(); b=false; break; //MADE CHANGES HERE
										 case 'n': Menu(); b=false; break;
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="ZEBRONICS SHB7000";ob1[i++]=15675;
						 System.out.print("Do you want to continue shopping in this Budget (Above 10k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':Zeb10K(); b=false; break; // MADE CHANGES HEREE
							 case 'n':Zebmenu(); b=false; break; // MADE CHANGES HEREE
							 default : System.out.print("Please enter valid option: ");
							 }
						 }while(b==true);  break;
						 case 'n':
						 {
							 System.out.print("Do you want to see another model in this Budget (Above 10k) [y/n or Y/N]:");  //MADE CHANGES HERE
							 do
							 {
								 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								 switch(c1)	
								 {
								 case 'y':Zeb10K(); b=false; break; //MADE CHANGES HERE
								 case 'n':
								 {
									 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
									 do 
									 {
										 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
										 switch(c2)
										 {
										 case 'y': Zebmenu(); b=false; break; //MADE CHANGES HERE
										 case 'n': Menu(); b=false; break;
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="ZEBRONICS TAPH805BK";ob1[i++]=12999;
						 System.out.print("Do you want to continue shopping in this Budget (Above 10k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':Zeb10K(); b=false; break; // MADE CHANGES HEREE
							 case 'n':Zebmenu(); b=false; break; // MADE CHANGES HEREE
							 default : System.out.print("Please enter valid option: ");
							 }
						 }while(b==true);  break;
						 case 'n':
						 {
							 System.out.print("Do you want to see another model in this Budget (Above 10k) [y/n or Y/N]:");  //MADE CHANGES HERE
							 do
							 {
								 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								 switch(c1)	
								 {
								 case 'y':Zeb10K(); b=false; break; //MADE CHANGES HERE
								 case 'n':
								 {
									 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
									 do 
									 {
										 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
										 switch(c2)
										 {
										 case 'y': Zebmenu(); b=false; break; //MADE CHANGES HERE
										 case 'n': Menu(); b=false; break;
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="ZEBRONICS SHB7150FB";ob1[i++]=17950;
						 System.out.print("Do you want to continue shopping in this Budget (Above 10k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':Zeb10K(); b=false; break; // MADE CHANGES HEREE
							 case 'n':Zebmenu(); b=false; break; // MADE CHANGES HEREE
							 default : System.out.print("Please enter valid option: ");
							 }
						 }while(b==true);  break;
						 case 'n':
						 {
							 System.out.print("Do you want to see another model in this Budget (Above 10k) [y/n or Y/N]:");  //MADE CHANGES HERE
							 do
							 {
								 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								 switch(c1)	
								 {
								 case 'y':Zeb10K(); b=false; break; //MADE CHANGES HERE
								 case 'n':
								 {
									 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
									 do 
									 {
										 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
										 switch(c2)
										 {
										 case 'y': Zebmenu(); b=false; break; //MADE CHANGES HERE
										 case 'n': Menu(); b=false; break;
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="ZEBRONICS SHB3500X3";ob1[i++]=15690;
						 System.out.print("Do you want to continue shopping in this Budget (Above 10k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':Zeb10K(); b=false; break; // MADE CHANGES HEREE
							 case 'n':Zebmenu(); b=false; break; // MADE CHANGES HEREE
							 default : System.out.print("Please enter valid option: ");
							 }
						 }while(b==true);  break;
						 case 'n':
						 {
							 System.out.print("Do you want to see another model in this Budget (Above 10k) [y/n or Y/N]:");  //MADE CHANGES HERE
							 do
							 {
								 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								 switch(c1)	
								 {
								 case 'y':Zeb10K(); b=false; break; //MADE CHANGES HERE
								 case 'n':
								 {
									 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
									 do 
									 {
										 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
										 switch(c2)
										 {
										 case 'y': Zebmenu(); b=false; break; //MADE CHANGES HERE
										 case 'n': Menu(); b=false; break;
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="ZEBRONICS FX5MBX";ob1[i++]=13990;
						 System.out.print("Do you want to continue shopping in this Budget (Above 10k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':Zeb10K(); b=false; break; // MADE CHANGES HEREE
							 case 'n':Zebmenu(); b=false; break; // MADE CHANGES HEREE
							 default : System.out.print("Please enter valid option: ");
							 }
						 }while(b==true);  break;
						 case 'n':
						 {
							 System.out.print("Do you want to see another model in this Budget (Above 10k) [y/n or Y/N]:");  //MADE CHANGES HERE
							 do
							 {
								 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								 switch(c1)	
								 {
								 case 'y':Zeb10K(); b=false; break; //MADE CHANGES HERE
								 case 'n':
								 {
									 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
									 do 
									 {
										 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
										 switch(c2)
										 {
										 case 'y': Zebmenu(); b=false; break; //MADE CHANGES HERE
										 case 'n': Menu(); b=false; break;
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
					 case 7:  Zebmenu(); b=false; break;
					 default:  System.out.print("Please enter valid option:");
				 }
			 }while(b==true);   
	   }
}

