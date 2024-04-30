package smartphones_Tablets;

import java.util.Scanner;

import home_screen.Main_Home;

public class Keypad 
{
	public static String ob[]=new String[100];
	public static float ob1[]=new float[100]; public static int i=0;
	 static Scanner sc=new Scanner(System.in);private static final String RESET = "\033[0m";  // Text Reset
	 static boolean b = true;
	 
//	 public static void main(String[] args) 
//	 {
//		 Option();
//	 }
	 public static void Option()
	 { System.out.println(RESET);
		System.out.println("\t\t"+"\t\t\t\t _________________________________________________");
		System.out.println("\t\t"+"\t\t\t\t|ooooooooooooooooooooooooooooooooooooooooooooooooo|");
		System.out.println("\t\t"+"\t\t\t\t|-------------------------------------------------|");
		System.out.println("\t\t"+"\t\t\t\t|                  KEYPAD MOBILES                 |");
		System.out.println("\t\t"+"\t\t\t\t|              ------------------------           |");
		System.out.println("\t\t"+"\t\t\t\t|                                                 |");
		System.out.println("\t\t"+"\t\t\t\t|                   1. SAMSUNG                    |");
		System.out.println("\t\t"+"\t\t\t\t|                   2. NOKIA                      |");
		System.out.println("\t\t"+"\t\t\t\t|                   3. LAVA                       |");
		System.out.println("\t\t"+"\t\t\t\t|                   4. MICROMAX                   |");
		System.out.println("\t\t"+"\t\t\t\t|                   5. ITEL                       |");
		System.out.println("\t\t"+"\t\t\t\t|                   6. EXIT                       |");
		System.out.println("\t\t"+"\t\t\t\t|_________________________________________________|");
		System.out.println("\t\t"+"\t\t\t\t|          _____                    _____         |");
		System.out.println("\t\t"+"\t\t\t\t|         |     |       [ + ]      |     |        |");
		System.out.println("\t\t"+"\t\t\t\t|         |_____|[ <  ] [ o ][  > ]|_____|        |");
		System.out.println("\t\t"+"\t\t\t\t|                       [ - ]                     |");
		System.out.println("\t\t"+"\t\t\t\t|-------------------------------------------------|");
		System.out.println("\t\t"+"\t\t\t\t|            _____      _____      _____          |");
		System.out.println("\t\t"+"\t\t\t\t|           [  1  ]    [  2  ]    [  3  ]         |");
		System.out.println("\t\t"+"\t\t\t\t|           [_____]    [_____]    [_____]         |");
		System.out.println("\t\t"+"\t\t\t\t|                                                 |");
		System.out.println("\t\t"+"\t\t\t\t|            _____      _____      _____          |");
		System.out.println("\t\t"+"\t\t\t\t|           [  4  ]    [  5  ]    [  6  ]         |");
		System.out.println("\t\t"+"\t\t\t\t|           [_____]    [_____]    [_____]         |");
		System.out.println("\t\t"+"\t\t\t\t|                                                 |");
		System.out.println("\t\t"+"\t\t\t\t|            _____      _____      _____          |");
		System.out.println("\t\t"+"\t\t\t\t|           [  7  ]    [  8  ]    [  9  ]         |");
		System.out.println("\t\t"+"\t\t\t\t|           [_____]    [_____]    [_____]         |");
		System.out.println("\t\t"+"\t\t\t\t|                                                 |");
		System.out.println("\t\t"+"\t\t\t\t|            _____      _____      _____          |");
		System.out.println("\t\t"+"\t\t\t\t|           [  *  ]    [  0  ]    [  #  ]         |");
		System.out.println("\t\t"+"\t\t\t\t|           [_____]    [_____]    [_____]         |");
		System.out.println("\t\t"+"\t\t\t\t|                                                 |");
		System.out.println("\t\t"+"\t\t\t\t|-------------------------------------------------|");
		System.out.println("\t\t"+"\t\t\t\t|_________________________________________________|");
		 System.out.println(RESET);	Optionswitch();
		
	 }
		public static void Optionswitch()
		{
		System.out.print("Please Choose Your Preferred Brand : ");
		do
		{
			int k=sc.nextInt();
			switch(k)
			{
			case 1: Samsung(); b=false; break;
			case 2: Nokia(); b=false; break;
			case 3: Lava(); b=false; break;
			case 4: Micromax(); b=false; break;
			case 5: Itel(); b=false; break;
			case 6: Main_Home.mobilesAndTablets(); b=false; break;    //main exit
			default:System.out.print("Please enter valid option : ");
			}
		}
		while(b==true);
	 }
	 
	 public static void Samsung()
	 { System.out.println(RESET);
		    System.out.println("\t\t\t"+"\t ___________________________________________________________________________________________");
			System.out.println("\t\t\t"+"\t|                                                                                           |");
			System.out.println("\t\t\t"+"\t|      ____________________        _____________________        _____________________       |");
			System.out.println("\t\t\t"+"\t|     |    GURU MUSIC 2    |      |    SAMSUNG E1200    |      |   GURU PLUS B110E   |      |");
			System.out.println("\t\t\t"+"\t|     |--------------------|      |---------------------|      |---------------------|      |");
			System.out.println("\t\t\t"+"\t|     |.Single core,208MHz |      |.Single core,218MHz  |      |.Single core,202MHz  |      |");
			System.out.println("\t\t\t"+"\t|     |.2.0inches(5.08cm)  |      |.1.5inches(3.81cm)   |      |.1.5inches(3.81cm)   |      |");
			System.out.println("\t\t\t"+"\t|     |.128x160 px(102 PPI)|      |.128x120 px(121 PPI) |      |.128x120 px(121 PPI) |      |");
			System.out.println("\t\t\t"+"\t|     |.Battery : 800mAh   |      |.Battery : 800mAh    |      |.Battery : 800mAh    |      |");
			System.out.println("\t\t\t"+"\t|     |.SIM1 : Mini, 2G    |      |.SIM1 : Mini, 2G     |      |.SIM1 : Mini, 2G     |      |");
			System.out.println("\t\t\t"+"\t|     |.PRICE : 3400.00/-  |      |.PRICE :3500.00/-    |      |.PRICE :3800.00/-    |      |");
			System.out.println("\t\t\t"+"\t|     |____________________|      |_____________________|      |_____________________|      |");
			System.out.println("\t\t\t"+"\t|               1.                          2.                           3.                 |");
			System.out.println("\t\t\t"+"\t|      ____________________        _____________________        _____________________       |");
			System.out.println("\t\t\t"+"\t|     |    METRO B350E     |      |      METRO 360      |      |    SAMSUNG E1270    |      |");
			System.out.println("\t\t\t"+"\t|     |--------------------|      |---------------------|      |---------------------|      |");
			System.out.println("\t\t\t"+"\t|     |.32MB RAM ,1200mAh  |      |.Single core,312MHz  |      |.Single core,312MHz  |      |");
			System.out.println("\t\t\t"+"\t|     |.2.4inches(6.1cm)   |      |.2.4inches(6.1cm)    |      |.1.8inches(4.57cm)   |      |");
			System.out.println("\t\t\t"+"\t|     |.240x320 px(167 PPI)|      |.240x320 px(167 PPI) |      |.128x160 px(114 PPI) |      |");
			System.out.println("\t\t\t"+"\t|     |.Single Camera 2MP  |      |.Single Camera 3.1MP |      |.Battery : 800mAh    |      |");
			System.out.println("\t\t\t"+"\t|     |.Dual SIM ,Mini,2G  |      |.SIM1 : Mini, 2G     |      |.SIM1 : Mini, 2G     |      |");
			System.out.println("\t\t\t"+"\t|     |.PRICE :4400.00/-   |      |.PRICE : 2400.00/-   |      |.PRICE : 3800.00/-   |      |");
			System.out.println("\t\t\t"+"\t|     |____________________|      |_____________________|      |_____________________|      |");
			System.out.println("\t\t\t"+"\t|              4.                            5.                           6.                |");
			System.out.println("\t\t\t"+"\t|                                  _____________________                                    |");
			System.out.println("\t\t\t"+"\t|                                 |                     |                                   |");
			System.out.println("\t\t\t"+"\t|                                 |                     |                                   |");
			System.out.println("\t\t\t"+"\t|                                 |                     |                                   |");
			System.out.println("\t\t\t"+"\t|                                 |         EXIT        |                                   |");
			System.out.println("\t\t\t"+"\t|                                 |      -----------    |                                   |");
			System.out.println("\t\t\t"+"\t|                                 |                     |                                   |");
			System.out.println("\t\t\t"+"\t|                                 |                     |                                   |");
			System.out.println("\t\t\t"+"\t|                                 |_____________________|                                   |");
			System.out.println("\t\t\t"+"\t|                                            7.                                             |");
			System.out.println("\t\t\t"+"\t|___________________________________________________________________________________________|");

			 System.out.println(RESET);	
			SamsungSwitch();
	 }
	 public static void SamsungSwitch()
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
						 char c=sc.next().toLowerCase().charAt(0);
						 switch(c)
						 {
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="GURU MUSIC 2";  ob1[i++]=3400;
						 		  System.out.println("Do you want to continue shopping in this Brand [y/n or Y/N] :");// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
						 		  do
						 		  {
						 			char c1=sc.next().toLowerCase().charAt(0);
						 			switch(c1)	
									{
									case 'y':Samsung(); b=false; break; // CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
									case 'n':Option(); b=false; break;// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
						 			default : System.out.print("Please enter valid option: ");
									}
						 		  }while(b==true);break; 
						 case 'n':
							 {
								 System.out.print("Do you want to see another model in this brand [y/n or Y/N]  :"); 
									do
									{
										char c1=sc.next().toLowerCase().charAt(0);
									switch(c1)	
									{
									case 'y':Samsung(); b=false; break; // CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
									case 'n':{
										System.out.print("Do you want to continue in KEYPAD MOBILES [y/n or Y/N] :");// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
										do 
										{
											char c2=sc.next().toLowerCase().charAt(0);
											switch(c2)
											{
											case 'y': Option(); b=false; break; // CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
											case 'n':Main_Home.mobilesAndTablets(); b=false; break;// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
											default:System.out.print("Please enter valid option:"); 
											}
										}while(b==true); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SAMSUNG E1200";  ob1[i++]=3500;
					   System.out.println("Do you want to continue shopping in this Brand [y/n or Y/N] :");// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);
						   switch(c1)	
						   {
						   case 'y':Samsung(); b=false; break; // CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
						   case 'n':Option(); b=false; break;// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);break; 
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this brand [y/n or Y/N]  :"); 
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);
							   switch(c1)	
							   {
							   case 'y':Samsung(); b=false; break; // CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
							   case 'n':{
								   System.out.print("Do you want to continue in KEYPAD MOBILES [y/n or Y/N] :");// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);
									   switch(c2)
									   {
									   case 'y': Option(); b=false; break; // CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
									   case 'n':Main_Home.mobilesAndTablets(); b=false; break;// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
									   default:System.out.print("Please enter valid option:"); 
									   }
								   }while(b==true); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="GURU PLUS B110E";  ob1[i++]=3800;
					   System.out.println("Do you want to continue shopping in this Brand [y/n or Y/N] :");// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);
						   switch(c1)	
						   {
						   case 'y':Samsung(); b=false; break; // CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
						   case 'n':Option(); b=false; break;// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);break; 
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this brand [y/n or Y/N]  :"); 
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);
							   switch(c1)	
							   {
							   case 'y':Samsung(); b=false; break; // CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
							   case 'n':{
								   System.out.print("Do you want to continue in KEYPAD MOBILES [y/n or Y/N] :");// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);
									   switch(c2)
									   {
									   case 'y': Option(); b=false; break; // CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
									   case 'n':Main_Home.mobilesAndTablets(); b=false; break;// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
									   default:System.out.print("Please enter valid option:"); 
									   }
								   }while(b==true); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="METRO B350E";  ob1[i++]=4400;
					   System.out.println("Do you want to continue shopping in this Brand [y/n or Y/N] :");// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);
						   switch(c1)	
						   {
						   case 'y':Samsung(); b=false; break; // CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
						   case 'n':Option(); b=false; break;// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);break; 
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this brand [y/n or Y/N]  :"); 
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);
							   switch(c1)	
							   {
							   case 'y':Samsung(); b=false; break; // CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
							   case 'n':{
								   System.out.print("Do you want to continue in KEYPAD MOBILES [y/n or Y/N] :");// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);
									   switch(c2)
									   {
									   case 'y': Option(); b=false; break; // CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
									   case 'n':Main_Home.mobilesAndTablets(); b=false; break;// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
									   default:System.out.print("Please enter valid option:"); 
									   }
								   }while(b==true); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="METRO 360";  ob1[i++]=2400;
					   System.out.println("Do you want to continue shopping in this Brand [y/n or Y/N] :");// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);
						   switch(c1)	
						   {
						   case 'y':Samsung(); b=false; break; // CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
						   case 'n':Option(); b=false; break;// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);break; 
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this brand [y/n or Y/N]  :"); 
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);
							   switch(c1)	
							   {
							   case 'y':Samsung(); b=false; break; // CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
							   case 'n':{
								   System.out.print("Do you want to continue in KEYPAD MOBILES [y/n or Y/N] :");// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);
									   switch(c2)
									   {
									   case 'y': Option(); b=false; break; // CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
									   case 'n':Main_Home.mobilesAndTablets(); b=false; break;// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
									   default:System.out.print("Please enter valid option:"); 
									   }
								   }while(b==true); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SAMSUNG E1270";  ob1[i++]=3800;
					   System.out.println("Do you want to continue shopping in this Brand [y/n or Y/N] :");// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);
						   switch(c1)	
						   {
						   case 'y':Samsung(); b=false; break; // CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
						   case 'n':Option(); b=false; break;// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);break; 
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this brand [y/n or Y/N]  :"); 
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);
							   switch(c1)	
							   {
							   case 'y':Samsung(); b=false; break; // CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
							   case 'n':{
								   System.out.print("Do you want to continue in KEYPAD MOBILES [y/n or Y/N] :");// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);
									   switch(c2)
									   {
									   case 'y': Option(); b=false; break; // CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
									   case 'n':Main_Home.mobilesAndTablets(); b=false; break;// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
									   default:System.out.print("Please enter valid option:"); 
									   }
								   }while(b==true); b=false; break;
							   }
							   default:System.out.print("Please enter valid option:");
							   }
						   }while(b==true); b=false; break;
					   }
					   default:  System.out.print("Please enter valid option:");
					   }
				   }while(b==true);  b=false; break; 
			   }
			   case 7:Option(); b=false; break;// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
			   default: System.out.print("PLEASE ENTER VALID OPTION: ");
			   }
		   }while(b==true);	
			
	 }
	 public static void Nokia()
	 { System.out.println(RESET);
		    System.out.println("\t\t\t"+"\t ___________________________________________________________________________________________");
			System.out.println("\t\t\t"+"\t|                                                                                           |");
			System.out.println("\t\t\t"+"\t|      ____________________        _____________________        _____________________       |");
			System.out.println("\t\t\t"+"\t|     |   NOKIA 105 PLUS   |      |   NOKIA  105(2020)  |      |    NOKIA 3310       |      |");
			System.out.println("\t\t\t"+"\t|     |--------------------|      |---------------------|      |---------------------|      |");
			System.out.println("\t\t\t"+"\t|     |.4 MB RAM           |      |.4 MB RAM            |      |.2 MP Primary Camera |      |");
			System.out.println("\t\t\t"+"\t|     |.1.77 inches(4.5 cm)|      |.2.4inches(6.1cm)    |      |.2.4inches(6.1cm)    |      |");
			System.out.println("\t\t\t"+"\t|     |.116 PPI , TFT      |      |.128x120 px(167 PPI) |      |.128x120 px(167 PPI) |      |");
			System.out.println("\t\t\t"+"\t|     |.Battery : 1000 mAh |      |.Battery : 1020 mAh  |      |.Battery : 1200mAh   |      |");
			System.out.println("\t\t\t"+"\t|     |.SIM1 : Mini, 2G    |      |.SIM1 : Mini, 2G     |      |.SIM1 : Mini, 2G     |      |");
			System.out.println("\t\t\t"+"\t|     |.PRICE :4800.00/-   |      |.PRICE :4500.00/-    |      |.PRICE :4400.00/-    |      |");
			System.out.println("\t\t\t"+"\t|     |____________________|      |_____________________|      |_____________________|      |");
			System.out.println("\t\t\t"+"\t|               1.                           2.                          3.                 |");
			System.out.println("\t\t\t"+"\t|      ____________________        _____________________        _____________________       |");
			System.out.println("\t\t\t"+"\t|     |   NOKIA 3310 NEW   |      |      NOKIA 215      |      |     NOKIA 6310      |      |");
			System.out.println("\t\t\t"+"\t|     |--------------------|      |---------------------|      |---------------------|      |");
			System.out.println("\t\t\t"+"\t|     |.2 MP Primary Camera|      |.64 MB RAM           |      |.16 MB RAM           |      |");
			System.out.println("\t\t\t"+"\t|     |.2.4inches(6.1cm)   |      |.2.4inches(6.1cm)    |      |.2.8inches(7.11cm)   |      |");
			System.out.println("\t\t\t"+"\t|     |.128x120 px(167 PPI)|      |.240x320 px(167 PPI) |      |.240x320 px(143 PPI) |      |");
			System.out.println("\t\t\t"+"\t|     |.Battery : 1200mAh  |      |.Battery : 1150 mAh  |      |.Battery : 1150mAh   |      |");
			System.out.println("\t\t\t"+"\t|     |.SIM1 : Mini, 2G    |      |.SIM1 : Mini, 2G     |      |.SIM1 : Mini, 2G     |      |");
			System.out.println("\t\t\t"+"\t|     |.PRICE :4900.00/-   |      |.PRICE :3400.00/-    |      |.PRICE :4200.00/-    |      |");
			System.out.println("\t\t\t"+"\t|     |____________________|      |_____________________|      |_____________________|      |");
			System.out.println("\t\t\t"+"\t|               4.                          5.                            6.                |");
			System.out.println("\t\t\t"+"\t|                                  _____________________                                    |");
			System.out.println("\t\t\t"+"\t|                                 |                     |                                   |");
			System.out.println("\t\t\t"+"\t|                                 |                     |                                   |");
			System.out.println("\t\t\t"+"\t|                                 |                     |                                   |");
			System.out.println("\t\t\t"+"\t|                                 |        EXIT         |                                   |");
			System.out.println("\t\t\t"+"\t|                                 |      --------       |                                   |");
			System.out.println("\t\t\t"+"\t|                                 |                     |                                   |");
			System.out.println("\t\t\t"+"\t|                                 |                     |                                   |");
			System.out.println("\t\t\t"+"\t|                                 |_____________________|                                   |");
			System.out.println("\t\t\t"+"\t|	                                      7.                                            |");
			System.out.println("\t\t\t"+"\t|___________________________________________________________________________________________|");
			 System.out.println(RESET);
			NokiaSwitch();
	 }
	 public static void NokiaSwitch()
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
						 char c=sc.next().toLowerCase().charAt(0);
						 switch(c)
						 {
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="NOKIA 105 PLUS";  ob1[i++]=4800;
						 		  System.out.println("Do you want to continue shopping in this Brand [y/n or Y/N] :");// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
						 		  do
						 		  {
						 			char c1=sc.next().toLowerCase().charAt(0);
						 			switch(c1)	
									{
									case 'y':Nokia(); b=false; break; // CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
									case 'n':Option(); b=false; break;// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
						 			default : System.out.print("Please enter valid option: ");
									}
						 		  }while(b==true);break; 
						 case 'n':
							 {
								 System.out.print("Do you want to see another model in this brand [y/n or Y/N]  :"); 
									do
									{
										char c1=sc.next().toLowerCase().charAt(0);
									switch(c1)	
									{
									case 'y':Nokia(); b=false; break; // CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
									case 'n':{
										System.out.print("Do you want to continue in KEYPAD MOBILES [y/n or Y/N] :");// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
										do 
										{
											char c2=sc.next().toLowerCase().charAt(0);
											switch(c2)
											{
											case 'y': Option(); b=false; break; // CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
											case 'n': Main_Home.mobilesAndTablets(); b=false; break;// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
											default:System.out.print("Please enter valid option:"); 
											}
										}while(b==true); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="NOKIA 105 (2020)";  ob1[i++]=4500;
					   System.out.println("Do you want to continue shopping in this Brand [y/n or Y/N] :");// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);
						   switch(c1)	
						   {
						   case 'y':Nokia(); b=false; break; // CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
						   case 'n':Option(); b=false; break;// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);break; 
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this brand [y/n or Y/N]  :"); 
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);
							   switch(c1)	
							   {
							   case 'y':Nokia(); b=false; break; // CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
							   case 'n':{
								   System.out.print("Do you want to continue in KEYPAD MOBILES [y/n or Y/N] :");// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);
									   switch(c2)
									   {
									   case 'y': Option(); b=false; break; // CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
									   case 'n': Main_Home.mobilesAndTablets(); b=false; break;// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
									   default:System.out.print("Please enter valid option:"); 
									   }
								   }while(b==true); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="NOKIA 3310";  ob1[i++]=4400;
					   System.out.println("Do you want to continue shopping in this Brand [y/n or Y/N] :");// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);
						   switch(c1)	
						   {
						   case 'y':Nokia(); b=false; break; // CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
						   case 'n':Option(); b=false; break;// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);break; 
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this brand [y/n or Y/N]  :"); 
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);
							   switch(c1)	
							   {
							   case 'y':Nokia(); b=false; break; // CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
							   case 'n':{
								   System.out.print("Do you want to continue in KEYPAD MOBILES [y/n or Y/N] :");// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);
									   switch(c2)
									   {
									   case 'y': Option(); b=false; break; // CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
									   case 'n': Main_Home.mobilesAndTablets(); b=false; break;// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
									   default:System.out.print("Please enter valid option:"); 
									   }
								   }while(b==true); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="NOKIA 3310 NEW";  ob1[i++]=4900;
					   System.out.println("Do you want to continue shopping in this Brand [y/n or Y/N] :");// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);
						   switch(c1)	
						   {
						   case 'y':Nokia(); b=false; break; // CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
						   case 'n':Option(); b=false; break;// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);break; 
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this brand [y/n or Y/N]  :"); 
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);
							   switch(c1)	
							   {
							   case 'y':Nokia(); b=false; break; // CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
							   case 'n':{
								   System.out.print("Do you want to continue in KEYPAD MOBILES [y/n or Y/N] :");// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);
									   switch(c2)
									   {
									   case 'y': Option(); b=false; break; // CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
									   case 'n': Main_Home.mobilesAndTablets(); b=false; break;// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
									   default:System.out.print("Please enter valid option:"); 
									   }
								   }while(b==true); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="NOKIA 215";  ob1[i++]=3400;
					   System.out.println("Do you want to continue shopping in this Brand [y/n or Y/N] :");// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);
						   switch(c1)	
						   {
						   case 'y':Nokia(); b=false; break; // CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
						   case 'n':Option(); b=false; break;// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);break; 
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this brand [y/n or Y/N]  :"); 
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);
							   switch(c1)	
							   {
							   case 'y':Nokia(); b=false; break; // CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
							   case 'n':{
								   System.out.print("Do you want to continue in KEYPAD MOBILES [y/n or Y/N] :");// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);
									   switch(c2)
									   {
									   case 'y': Option(); b=false; break; // CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
									   case 'n': Main_Home.mobilesAndTablets(); b=false; break;// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
									   default:System.out.print("Please enter valid option:"); 
									   }
								   }while(b==true); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="NOKIA 6310";  ob1[i++]=4200;
					   System.out.println("Do you want to continue shopping in this Brand [y/n or Y/N] :");// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);
						   switch(c1)	
						   {
						   case 'y':Nokia(); b=false; break; // CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
						   case 'n':Option(); b=false; break;// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);break; 
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this brand [y/n or Y/N]  :"); 
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);
							   switch(c1)	
							   {
							   case 'y':Nokia(); b=false; break; // CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
							   case 'n':{
								   System.out.print("Do you want to continue in KEYPAD MOBILES [y/n or Y/N] :");// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);
									   switch(c2)
									   {
									   case 'y': Option(); b=false; break; // CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
									   case 'n': Main_Home.mobilesAndTablets(); b=false; break;// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
									   default:System.out.print("Please enter valid option:"); 
									   }
								   }while(b==true); b=false; break;
							   }
							   default:System.out.print("Please enter valid option:");
							   }
						   }while(b==true); b=false; break;
					   }
					   default:  System.out.print("Please enter valid option:");
					   }
				   }while(b==true);  b=false; break; 
			   }
			   case 7:Option(); b=false; break;// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
			   default: System.out.print("PLEASE ENTER VALID OPTION: ");
			   }
		   }while(b==true);
	 }
	 public static void Lava()
	 { System.out.println(RESET);
		        System.out.println("\t\t\t"+"\t ___________________________________________________________________________________________");
				System.out.println("\t\t\t"+"\t|                                                                                           |");
				System.out.println("\t\t\t"+"\t|      ____________________        _____________________        _____________________       |");
				System.out.println("\t\t\t"+"\t|     |   LAVA A1 JOSH     |      |     LAVA PULSE 1    |      |   LAVA KKT JUMBO 2  |      |");
				System.out.println("\t\t\t"+"\t|     |--------------------|      |---------------------|      |---------------------|      |");
				System.out.println("\t\t\t"+"\t|     |.1.8 inches(4.57 cm)|      |.4 MB RAM            |      |.2 MP Primary Camera |      |");
				System.out.println("\t\t\t"+"\t|     |.128x160 px(114 PPI)|      |.2.4inches(6.1cm)    |      |.2.4inches(6.1cm)    |      |");
				System.out.println("\t\t\t"+"\t|     |.LED FLASH          |      |.128x120 px(167 PPI) |      |.128x120 px(167 PPI) |      |");
				System.out.println("\t\t\t"+"\t|     |.Battery : 1000 mAh |      |.Battery : 1020 mAh  |      |.Battery : 1200mAh   |      |");
				System.out.println("\t\t\t"+"\t|     |.SIM1 : Mini, 2G    |      |.SIM1 : Mini, 2G     |      |.SIM1 : Mini, 2G     |      |");
				System.out.println("\t\t\t"+"\t|     |.PRICE :3400.00/-   |      |.PRICE :2400.00/-    |      |.PRICE : 2900.00/-   |      |");
				System.out.println("\t\t\t"+"\t|     |____________________|      |_____________________|      |_____________________|      |");
				System.out.println("\t\t\t"+"\t|               1.                          2.                           3.                 |");
				System.out.println("\t\t\t"+"\t|      ____________________        _____________________        _____________________       |");
				System.out.println("\t\t\t"+"\t|     |    LAVA A7 STAR    |      |      LAVA FLIP      |      | LAVA KKT TRIO PLUS  |      |");
				System.out.println("\t\t\t"+"\t|     |--------------------|      |---------------------|      |---------------------|      |");
				System.out.println("\t\t\t"+"\t|     |.0.3MP PrimaryCamera|      |.2.4inches(6.1cm)    |      |.2.8 inches(7.11 cm) |      |");
				System.out.println("\t\t\t"+"\t|     |.2.4inches(6.1cm)   |      |.240x320 px(167 PPI) |      |.1.3MP Primary Camera|      |");
				System.out.println("\t\t\t"+"\t|     |.240x320 px(167 PPI)|      |.0.08MP PrimaryCamera|      |.240x320 px(143 PPI) |      |");
				System.out.println("\t\t\t"+"\t|     |.Battery : 1200mAh  |      |.Battery : 1200 mAh  |      |.Battery : 2800mAh   |      |");
				System.out.println("\t\t\t"+"\t|     |.SIM1 : Mini, 2G    |      |.SIM1 : Mini, 2G     |      |.SIM1 : Mini, 2G     |      |");
				System.out.println("\t\t\t"+"\t|     |.PRICE : 4490.00/-  |      |.PRICE :4599.00/-    |      |.PRICE : 3800.00/-   |      |");
				System.out.println("\t\t\t"+"\t|     |____________________|      |_____________________|      |_____________________|      |");
				System.out.println("\t\t\t"+"\t|               4.                          5.                            6.                |");
				System.out.println("\t\t\t"+"\t|                                  ____________________                                     |");
				System.out.println("\t\t\t"+"\t|                                 |                    |                                    |");
				System.out.println("\t\t\t"+"\t|                                 |                    |                                    |");
				System.out.println("\t\t\t"+"\t|                                 |                    |                                    |");
				System.out.println("\t\t\t"+"\t|                                 |        EXIT        |                                    |");
				System.out.println("\t\t\t"+"\t|                                 |      --------      |                                    |");
				System.out.println("\t\t\t"+"\t|                                 |                    |                                    |");
				System.out.println("\t\t\t"+"\t|                                 |                    |                                    |");
				System.out.println("\t\t\t"+"\t|                                 |____________________|                                    |");
				System.out.println("\t\t\t"+"\t|                                            7.                                             |");
				System.out.println("\t\t\t"+"\t|___________________________________________________________________________________________|");
				 System.out.println(RESET);
				LavaSwitch();
	 }
				public static void LavaSwitch()
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
									 char c=sc.next().toLowerCase().charAt(0);
									 switch(c)
									 {
									 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="LAVA A1 JOSH";  ob1[i++]=3400;
									 		  System.out.println("Do you want to continue shopping in this Brand [y/n or Y/N] :");// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
									 		  do
									 		  {
									 			char c1=sc.next().toLowerCase().charAt(0);
									 			switch(c1)	
												{
												case 'y':Lava(); b=false; break; // CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
												case 'n':Option(); b=false; break;// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
									 			default : System.out.print("Please enter valid option: ");
												}
									 		  }while(b==true);break; 
									 case 'n':
										 {
											 System.out.print("Do you want to see another model in this brand [y/n or Y/N] :"); 
												do
												{
													char c1=sc.next().toLowerCase().charAt(0);
												switch(c1)	
												{
												case 'y':Lava(); b=false; break; // CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
												case 'n':{
													System.out.print("Do you want to continue in KEYPAD MOBILES [y/n or Y/N] :");// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
													do 
													{
														char c2=sc.next().toLowerCase().charAt(0);
														switch(c2)
														{
														case 'y': Option(); b=false; break; // CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
														case 'n': Main_Home.mobilesAndTablets(); b=false; break;// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
														default:System.out.print("Please enter valid option:"); 
														}
													}while(b==true); b=false; break;
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
								   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="LAVA PULSE 1";  ob1[i++]=2400;
								   System.out.println("Do you want to continue shopping in this Brand [y/n or Y/N] :");// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
								   do
								   {
									   char c1=sc.next().toLowerCase().charAt(0);
									   switch(c1)	
									   {
									   case 'y':Lava(); b=false; break; // CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
									   case 'n':Option(); b=false; break;// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
									   default : System.out.print("Please enter valid option: ");
									   }
								   }while(b==true);break; 
								   case 'n':
								   {
									   System.out.print("Do you want to see another model in this brand [y/n or Y/N] :"); 
									   do
									   {
										   char c1=sc.next().toLowerCase().charAt(0);
										   switch(c1)	
										   {
										   case 'y':Lava(); b=false; break; // CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
										   case 'n':{
											   System.out.print("Do you want to continue in KEYPAD MOBILES [y/n or Y/N] :");// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
											   do 
											   {
												   char c2=sc.next().toLowerCase().charAt(0);
												   switch(c2)
												   {
												   case 'y': Option(); b=false; break; // CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
												   case 'n': Main_Home.mobilesAndTablets(); b=false; break;// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
												   default:System.out.print("Please enter valid option:"); 
												   }
											   }while(b==true); b=false; break;
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
								   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="LAVA KKT JUMBO2";  ob1[i++]=2900;
								   System.out.println("Do you want to continue shopping in this Brand [y/n or Y/N] :");// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
								   do
								   {
									   char c1=sc.next().toLowerCase().charAt(0);
									   switch(c1)	
									   {
									   case 'y':Lava(); b=false; break; // CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
									   case 'n':Option(); b=false; break;// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
									   default : System.out.print("Please enter valid option: ");
									   }
								   }while(b==true);break; 
								   case 'n':
								   {
									   System.out.print("Do you want to see another model in this brand [y/n or Y/N] :"); 
									   do
									   {
										   char c1=sc.next().toLowerCase().charAt(0);
										   switch(c1)	
										   {
										   case 'y':Lava(); b=false; break; // CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
										   case 'n':{
											   System.out.print("Do you want to continue in KEYPAD MOBILES [y/n or Y/N] :");// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
											   do 
											   {
												   char c2=sc.next().toLowerCase().charAt(0);
												   switch(c2)
												   {
												   case 'y': Option(); b=false; break; // CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
												   case 'n': Main_Home.mobilesAndTablets(); b=false; break;// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
												   default:System.out.print("Please enter valid option:"); 
												   }
											   }while(b==true); b=false; break;
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
								   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="LAVA A7 STAR";  ob1[i++]=4490;
								   System.out.println("Do you want to continue shopping in this Brand [y/n or Y/N] :");// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
								   do
								   {
									   char c1=sc.next().toLowerCase().charAt(0);
									   switch(c1)	
									   {
									   case 'y':Lava(); b=false; break; // CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
									   case 'n':Option(); b=false; break;// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
									   default : System.out.print("Please enter valid option: ");
									   }
								   }while(b==true);break; 
								   case 'n':
								   {
									   System.out.print("Do you want to see another model in this brand [y/n or Y/N] :"); 
									   do
									   {
										   char c1=sc.next().toLowerCase().charAt(0);
										   switch(c1)	
										   {
										   case 'y':Lava(); b=false; break; // CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
										   case 'n':{
											   System.out.print("Do you want to continue in KEYPAD MOBILES [y/n or Y/N] :");// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
											   do 
											   {
												   char c2=sc.next().toLowerCase().charAt(0);
												   switch(c2)
												   {
												   case 'y': Option(); b=false; break; // CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
												   case 'n': Main_Home.mobilesAndTablets(); b=false; break;// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
												   default:System.out.print("Please enter valid option:"); 
												   }
											   }while(b==true); b=false; break;
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
								   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="LAVA FLIP";  ob1[i++]=4599;
								   System.out.println("Do you want to continue shopping in this Brand [y/n or Y/N] :");// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
								   do
								   {
									   char c1=sc.next().toLowerCase().charAt(0);
									   switch(c1)	
									   {
									   case 'y':Lava(); b=false; break; // CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
									   case 'n':Option(); b=false; break;// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
									   default : System.out.print("Please enter valid option: ");
									   }
								   }while(b==true);break; 
								   case 'n':
								   {
									   System.out.print("Do you want to see another model in this brand [y/n or Y/N] :"); 
									   do
									   {
										   char c1=sc.next().toLowerCase().charAt(0);
										   switch(c1)	
										   {
										   case 'y':Lava(); b=false; break; // CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
										   case 'n':{
											   System.out.print("Do you want to continue in KEYPAD MOBILES [y/n or Y/N] :");// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
											   do 
											   {
												   char c2=sc.next().toLowerCase().charAt(0);
												   switch(c2)
												   {
												   case 'y': Option(); b=false; break; // CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
												   case 'n': Main_Home.mobilesAndTablets(); b=false; break;// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
												   default:System.out.print("Please enter valid option:"); 
												   }
											   }while(b==true); b=false; break;
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
								   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="LAVA KKT TRIO PLUS";  ob1[i++]=3800;
								   System.out.println("Do you want to continue shopping in this Brand [y/n or Y/N] :");// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
								   do
								   {
									   char c1=sc.next().toLowerCase().charAt(0);
									   switch(c1)	
									   {
									   case 'y':Lava(); b=false; break; // CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
									   case 'n':Option(); b=false; break;// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
									   default : System.out.print("Please enter valid option: ");
									   }
								   }while(b==true);break; 
								   case 'n':
								   {
									   System.out.print("Do you want to see another model in this brand [y/n or Y/N] :"); 
									   do
									   {
										   char c1=sc.next().toLowerCase().charAt(0);
										   switch(c1)	
										   {
										   case 'y':Lava(); b=false; break; // CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
										   case 'n':{
											   System.out.print("Do you want to continue in KEYPAD MOBILES [y/n or Y/N] :");// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
											   do 
											   {
												   char c2=sc.next().toLowerCase().charAt(0);
												   switch(c2)
												   {
												   case 'y': Option(); b=false; break; // CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
												   case 'n': Main_Home.mobilesAndTablets(); b=false; break;// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
												   default:System.out.print("Please enter valid option:"); 
												   }
											   }while(b==true); b=false; break;
										   }
										   default:System.out.print("Please enter valid option:");
										   }
									   }while(b==true); b=false; break;
								   }
								   default:  System.out.print("Please enter valid option:");
								   }
							   }while(b==true);  b=false; break; 
						   }
						   case 7:Option(); b=false; break;// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
						   default: System.out.print("PLEASE ENTER VALID OPTION: ");
						   }
					   }while(b==true); 
	            }
	 public static void Micromax()
	 { System.out.println(RESET);
		    System.out.println("\t\t\t"+"\t ___________________________________________________________________________________________");
			System.out.println("\t\t\t"+"\t|                                                                                           |");
			System.out.println("\t\t\t"+"\t|      ____________________        _____________________        _____________________       |");
			System.out.println("\t\t\t"+"\t|     |    MICROMAX X413   |      |    MICROMAX S211    |      |    MICROMAX X702    |      |");
			System.out.println("\t\t\t"+"\t|     |--------------------|      |---------------------|      |---------------------|      |");
			System.out.println("\t\t\t"+"\t|     |.1.77inches(4.5 cm) |      |.2.4inches(6.1cm)    |      |.0.3MP PrimaryCamera |      |");
			System.out.println("\t\t\t"+"\t|     |.128x160 px(116 PPI)|      |.128x120 px(167 PPI) |      |.2.4inches(6.1cm)    |      |");
			System.out.println("\t\t\t"+"\t|     |.LED FLASH          |      |.0.3MP PrimaryCamera |      |.240x320 px(167 PPI) |      |");
			System.out.println("\t\t\t"+"\t|     |.Battery : 800 mAh  |      |.Battery : 1000 mAh  |      |.Battery : 1000mAh   |      |");
			System.out.println("\t\t\t"+"\t|     |.SIM1 : Mini, 2G    |      |.32MB(IS),Ex upto 8MB|      |.SIM1 : Mini, 2G     |      |");
			System.out.println("\t\t\t"+"\t|     |.PRICE :3800.00/    |      |.PRICE : 4800.00/    |      |.PRICE :4200.00/     |      |");
			System.out.println("\t\t\t"+"\t|     |____________________|      |_____________________|      |_____________________|      |");
			System.out.println("\t\t\t"+"\t|               1.                          2.                           3.                 |");
			System.out.println("\t\t\t"+"\t|      ____________________        _____________________        _____________________       |");
			System.out.println("\t\t\t"+"\t|     |    MICROMAX X415   |      |    MICROMAX X740    |      |    MICROMAX X750    |      |");
			System.out.println("\t\t\t"+"\t|     |--------------------|      |---------------------|      |---------------------|      |");
			System.out.println("\t\t\t"+"\t|     |.0.3MP PrimaryCamera|      |.2.4inches(6.1cm)    |      |.2.4 inches(6.1 cm)  |      |");
			System.out.println("\t\t\t"+"\t|     |.1.77inches(4.5cm)  |      |.240x320 px(167 PPI) |      |.0.3MP Primary Camera|      |");
			System.out.println("\t\t\t"+"\t|     |.128x160 px(167 PPI)|      |.0.3MP PrimaryCamera |      |.240x320 px(143 PPI) |      |");
			System.out.println("\t\t\t"+"\t|     |.Battery : 1000mAh  |      |.Battery : 1800 mAh  |      |.Battery : 2500mAh   |      |");
			System.out.println("\t\t\t"+"\t|     |.SIM1 : Mini, 2G    |      |.32MB(IS),Ex upto 8MB|      |.SIM1 : Mini, 2G     |      |");
			System.out.println("\t\t\t"+"\t|     |.PRICE : 3400.00/   |      |.PRICE : 4900.00/    |      |.PRICE : 4700.00/    |      |");
			System.out.println("\t\t\t"+"\t|     |____________________|      |_____________________|      |_____________________|      |");
			System.out.println("\t\t\t"+"\t|              4.                            5.                           6.                |");
			System.out.println("\t\t\t"+"\t|                                  ____________________                                     |");
			System.out.println("\t\t\t"+"\t|                                 |                    |                                    |");
			System.out.println("\t\t\t"+"\t|                                 |                    |                                    |");
			System.out.println("\t\t\t"+"\t|                                 |                    |                                    |");
			System.out.println("\t\t\t"+"\t|                                 |        EXIT        |                                    |");
			System.out.println("\t\t\t"+"\t|                                 |      --------      |                                    |");
			System.out.println("\t\t\t"+"\t|                                 |                    |                                    |");
			System.out.println("\t\t\t"+"\t|                                 |                    |                                    |");
			System.out.println("\t\t\t"+"\t|                                 |____________________|                                    |");
			System.out.println("\t\t\t"+"\t|                                           7.                                              |");
			System.out.println("\t\t\t"+"\t|___________________________________________________________________________________________|");
			 System.out.println(RESET);
			MicromaxSwitch();
	 }
	 public static void MicromaxSwitch()
	 {
		 System.out.print("PLEASE CHOOSE YOUR PREFERRED MODEL :");
		   do
		   {
			   int m=sc.nextInt();
			   switch(m)
			   {
			   case 1:
			   {
				   System.out.print("Do you want to add it to cart [y/n or Y/N] :");
					 do
					 {
						 char c=sc.next().toLowerCase().charAt(0);
						 switch(c)
						 {
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="MICROMAX X413";  ob1[i++]=3800;
						 		  System.out.println("Do you want to continue shopping in this Brand [y/n or Y/N] :");// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
						 		  do
						 		  {
						 			char c1=sc.next().toLowerCase().charAt(0);
						 			switch(c1)	
									{
									case 'y':Micromax(); b=false; break; // CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
									case 'n':Option(); b=false; break;// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
						 			default : System.out.print("Please enter valid option: ");
									}
						 		  }while(b==true);break; 
						 case 'n':
							 {
								 System.out.print("Do you want to see another model in this brand [y/n or Y/N]  :"); 
									do
									{
										char c1=sc.next().toLowerCase().charAt(0);
									switch(c1)	
									{
									case 'y':Micromax(); b=false; break; // CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
									case 'n':{
										System.out.print("Do you want to continue in KEYPAD MOBILES [y/n or Y/N] :");// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
										do 
										{
											char c2=sc.next().toLowerCase().charAt(0);
											switch(c2)
											{
											case 'y': Option(); b=false; break; // CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
											case 'n':Main_Home.mobilesAndTablets(); b=false; break;// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
											default:System.out.print("Please enter valid option:"); 
											}
										}while(b==true); b=false; break;
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
				   System.out.print("Do you want to add it to cart [y/n or Y/N] :");
				   do
				   {
					   char c=sc.next().toLowerCase().charAt(0);
					   switch(c)
					   {
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="MICROMAX S211";  ob1[i++]=4800;
					   System.out.println("Do you want to continue shopping in this Brand [y/n or Y/N] :");// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);
						   switch(c1)	
						   {
						   case 'y':Micromax(); b=false; break; // CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
						   case 'n':Option(); b=false; break;// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);break; 
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this brand [y/n or Y/N]  :"); 
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);
							   switch(c1)	
							   {
							   case 'y':Micromax(); b=false; break; // CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
							   case 'n':{
								   System.out.print("Do you want to continue in KEYPAD MOBILES [y/n or Y/N] :");// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);
									   switch(c2)
									   {
									   case 'y': Option(); b=false; break; // CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
									   case 'n':Main_Home.mobilesAndTablets(); b=false; break;// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
									   default:System.out.print("Please enter valid option:"); 
									   }
								   }while(b==true); b=false; break;
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
				   System.out.print("Do you want to add it to cart [y/n or Y/N] :");
				   do
				   {
					   char c=sc.next().toLowerCase().charAt(0);
					   switch(c)
					   {
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="MICROMAX X702";  ob1[i++]=4200;
					   System.out.println("Do you want to continue shopping in this Brand [y/n or Y/N] :");// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);
						   switch(c1)	
						   {
						   case 'y':Micromax(); b=false; break; // CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
						   case 'n':Option(); b=false; break;// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);break; 
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this brand [y/n or Y/N]  :"); 
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);
							   switch(c1)	
							   {
							   case 'y':Micromax(); b=false; break; // CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
							   case 'n':{
								   System.out.print("Do you want to continue in KEYPAD MOBILES [y/n or Y/N] :");// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);
									   switch(c2)
									   {
									   case 'y': Option(); b=false; break; // CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
									   case 'n':Main_Home.mobilesAndTablets(); b=false; break;// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
									   default:System.out.print("Please enter valid option:"); 
									   }
								   }while(b==true); b=false; break;
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
				   System.out.print("Do you want to add it to cart [y/n or Y/N] :");
				   do
				   {
					   char c=sc.next().toLowerCase().charAt(0);
					   switch(c)
					   {
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="MICROMAX X415";  ob1[i++]=3400;
					   System.out.println("Do you want to continue shopping in this Brand [y/n or Y/N] :");// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);
						   switch(c1)	
						   {
						   case 'y':Micromax(); b=false; break; // CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
						   case 'n':Option(); b=false; break;// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);break; 
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this brand [y/n or Y/N]  :"); 
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);
							   switch(c1)	
							   {
							   case 'y':Micromax(); b=false; break; // CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
							   case 'n':{
								   System.out.print("Do you want to continue in KEYPAD MOBILES [y/n or Y/N] :");// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);
									   switch(c2)
									   {
									   case 'y': Option(); b=false; break; // CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
									   case 'n':Main_Home.mobilesAndTablets(); b=false; break;// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
									   default:System.out.print("Please enter valid option:"); 
									   }
								   }while(b==true); b=false; break;
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
				   System.out.print("Do you want to add it to cart [y/n or Y/N] :");
				   do
				   {
					   char c=sc.next().toLowerCase().charAt(0);
					   switch(c)
					   {
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="MICROMAX X740";  ob1[i++]=4900;
					   System.out.println("Do you want to continue shopping in this Brand [y/n or Y/N] :");// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);
						   switch(c1)	
						   {
						   case 'y':Micromax(); b=false; break; // CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
						   case 'n':Option(); b=false; break;// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);break; 
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this brand [y/n or Y/N]  :"); 
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);
							   switch(c1)	
							   {
							   case 'y':Micromax(); b=false; break; // CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
							   case 'n':{
								   System.out.print("Do you want to continue in KEYPAD MOBILES [y/n or Y/N] :");// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);
									   switch(c2)
									   {
									   case 'y': Option(); b=false; break; // CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
									   case 'n':Main_Home.mobilesAndTablets(); b=false; break;// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
									   default:System.out.print("Please enter valid option:"); 
									   }
								   }while(b==true); b=false; break;
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
				   System.out.print("Do you want to add it to cart [y/n or Y/N] :");
				   do
				   {
					   char c=sc.next().toLowerCase().charAt(0);
					   switch(c)
					   {
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="MICROMAX X750";  ob1[i++]=4700;
					   System.out.println("Do you want to continue shopping in this Brand [y/n or Y/N] :");// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);
						   switch(c1)	
						   {
						   case 'y':Micromax(); b=false; break; // CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
						   case 'n':Option(); b=false; break;// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);break; 
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this brand [y/n or Y/N]  :"); 
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);
							   switch(c1)	
							   {
							   case 'y':Micromax(); b=false; break; // CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
							   case 'n':{
								   System.out.print("Do you want to continue in KEYPAD MOBILES [y/n or Y/N] :");// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);
									   switch(c2)
									   {
									   case 'y': Option(); b=false; break; // CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
									   case 'n':Main_Home.mobilesAndTablets(); b=false; break;// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
									   default:System.out.print("Please enter valid option:"); 
									   }
								   }while(b==true); b=false; break;
							   }
							   default:System.out.print("Please enter valid option:");
							   }
						   }while(b==true); b=false; break;
					   }
					   default:  System.out.print("Please enter valid option:");
					   }
				   }while(b==true);  b=false; break; 
			   }
			   
			   case 7:Option(); b=false; break;// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
			   default: System.out.print("PLEASE ENTER VALID OPTION: ");
			   }
		   }while(b==true); 
	 }
	 public static void Itel()
	 { System.out.println(RESET);
		    System.out.println("\t\t\t"+"\t ___________________________________________________________________________________________");
			System.out.println("\t\t\t"+"\t|                                                                                           |");
			System.out.println("\t\t\t"+"\t|      ____________________        _____________________        _____________________       |");
			System.out.println("\t\t\t"+"\t|     |    ITEL MAGIC 3    |      |    ITEL MAGIC 2     |      |   ITEL MAGIC X PRO  |      |");
			System.out.println("\t\t\t"+"\t|     |--------------------|      |---------------------|      |---------------------|      |");
			System.out.println("\t\t\t"+"\t|     |.2.8 inches(7.11 cm)|      |.1.3MP PrimaryCamera |      |.0.3MP Primary Camera|      |");
			System.out.println("\t\t\t"+"\t|     |.240x320 px(143 PPI)|      |.2.4inches(6.1cm)    |      |.2.4inches(6.1cm)    |      |");
			System.out.println("\t\t\t"+"\t|     |.0.3MP PrimaryCamera|      |.240x320 px(167 PPI) |      |.240x320 px(167 PPI) |      |");
			System.out.println("\t\t\t"+"\t|     |.Battery : 1500 mAh |      |.Battery : 1200 mAh  |      |.Battery : 2500mAh   |      |");
			System.out.println("\t\t\t"+"\t|     |.SIM1 : Mini, 2G    |      |.2G, DUAL SIM: Mini  |      |.64 GB RAM           |      |");
			System.out.println("\t\t\t"+"\t|     |.PRICE :4500.00/    |      |.PRICE :3800.00/     |      |.PRICE :2900.00/     |      |");
			System.out.println("\t\t\t"+"\t|     |____________________|      |_____________________|      |_____________________|      |");
			System.out.println("\t\t\t"+"\t|               1.                           2.                           3.                |");
			System.out.println("\t\t\t"+"\t|      ____________________        _____________________        _____________________       |");
			System.out.println("\t\t\t"+"\t|     |     ITEL iT2163    |      |      ITEL iT5026    |      |     ITEL MX PLAY    |      |");
			System.out.println("\t\t\t"+"\t|     |--------------------|      |---------------------|      |---------------------|      |");
			System.out.println("\t\t\t"+"\t|     |.4GB RAM            |      |.2.4inches(6.1cm)    |      |.1.77inches(4.5 cm)  |      |");
			System.out.println("\t\t\t"+"\t|     |.1.8inches(4.57cm)  |      |.240x320 px(167 PPI) |      |.0.3MP Primary Camera|      |");
			System.out.println("\t\t\t"+"\t|     |.128x160 px(114 PPI)|      |.0.3MP PrimaryCamera |      |.128x160 px(116 PPI) |      |");
			System.out.println("\t\t\t"+"\t|     |.Battery : 1200mAh  |      |.Battery : 1200 mAh  |      |.Battery : 1900mAh   |      |");
			System.out.println("\t\t\t"+"\t|     |.4GB(IS),Ex upto32GB|      |.SIM1 : Mini, 2G     |      |.128MB(IS),Exupto64GB|      |");
			System.out.println("\t\t\t"+"\t|     |.PRICE :3900.00/    |      |.PRICE : 3490.00/    |      |.PRICE : 4999.00/    |      |");
			System.out.println("\t\t\t"+"\t|     |____________________|      |_____________________|      |_____________________|      |");
			System.out.println("\t\t\t"+"\t|               4.                           5.                           6.                |");
			System.out.println("\t\t\t"+"\t|                                   ____________________                                    |");
			System.out.println("\t\t\t"+"\t|                                  |                    |                                   |");
			System.out.println("\t\t\t"+"\t|                                  |                    |                                   |");
			System.out.println("\t\t\t"+"\t|                                  |                    |                                   |");
			System.out.println("\t\t\t"+"\t|                                  |        EXIT        |                                   |");
			System.out.println("\t\t\t"+"\t|                                  |      ---------     |                                   |");
			System.out.println("\t\t\t"+"\t|                                  |                    |                                   |");
			System.out.println("\t\t\t"+"\t|                                  |                    |                                   |");
			System.out.println("\t\t\t"+"\t|                                  |____________________|                                   |");
			System.out.println("\t\t\t"+"\t|                                            7.                                             |");
			System.out.println("\t\t\t"+"\t|___________________________________________________________________________________________|");
			 System.out.println(RESET);
			ItelSwitch();
	 }
	 public static void ItelSwitch()
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
						 char c=sc.next().toLowerCase().charAt(0);
						 switch(c)
						 {
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="ITEL MAGIC 3";  ob1[i++]=4500;
						 		  System.out.println("Do you want to continue shopping in this Brand [y/n or Y/N] :");// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
						 		  do
						 		  {
						 			char c1=sc.next().toLowerCase().charAt(0);
						 			switch(c1)	
									{
									case 'y':Itel(); b=false; break; // CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
									case 'n':Option(); b=false; break;// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
						 			default : System.out.print("Please enter valid option: ");
									}
						 		  }while(b==true);break; 
						 case 'n':
							 {
								 System.out.print("Do you want to see another model in this brand [y/n or Y/N]  :"); 
									do
									{
										char c1=sc.next().toLowerCase().charAt(0);
									switch(c1)	
									{
									case 'y':Itel(); b=false; break; // CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
									case 'n':{
										System.out.print("Do you want to continue in KEYPAD MOBILES [y/n or Y/N] :");// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
										do 
										{
											char c2=sc.next().toLowerCase().charAt(0);
											switch(c2)
											{
											case 'y': Option(); b=false; break; // CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
											case 'n': Main_Home.mobilesAndTablets(); b=false; break;// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
											default:System.out.print("Please enter valid option:"); 
											}
										}while(b==true); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="ITEL MAGIC 2";  ob1[i++]=3800;
					   System.out.println("Do you want to continue shopping in this Brand [y/n or Y/N] :");// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);
						   switch(c1)	
						   {
						   case 'y':Itel(); b=false; break; // CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
						   case 'n':Option(); b=false; break;// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);break; 
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this brand [y/n or Y/N]  :"); 
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);
							   switch(c1)	
							   {
							   case 'y':Itel(); b=false; break; // CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
							   case 'n':{
								   System.out.print("Do you want to continue in KEYPAD MOBILES [y/n or Y/N] :");// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);
									   switch(c2)
									   {
									   case 'y': Option(); b=false; break; // CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
									   case 'n': Main_Home.mobilesAndTablets(); b=false; break;// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
									   default:System.out.print("Please enter valid option:"); 
									   }
								   }while(b==true); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="ITEL MAGIC X PRO";  ob1[i++]=2900;
					   System.out.println("Do you want to continue shopping in this Brand [y/n or Y/N] :");// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);
						   switch(c1)	
						   {
						   case 'y':Itel(); b=false; break; // CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
						   case 'n':Option(); b=false; break;// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);break; 
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this brand [y/n or Y/N]  :"); 
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);
							   switch(c1)	
							   {
							   case 'y':Itel(); b=false; break; // CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
							   case 'n':{
								   System.out.print("Do you want to continue in KEYPAD MOBILES [y/n or Y/N] :");// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);
									   switch(c2)
									   {
									   case 'y': Option(); b=false; break; // CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
									   case 'n': Main_Home.mobilesAndTablets(); b=false; break;// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
									   default:System.out.print("Please enter valid option:"); 
									   }
								   }while(b==true); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="ITEL iT2163";  ob1[i++]=3900;
					   System.out.println("Do you want to continue shopping in this Brand [y/n or Y/N] :");// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);
						   switch(c1)	
						   {
						   case 'y':Itel(); b=false; break; // CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
						   case 'n':Option(); b=false; break;// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);break; 
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this brand [y/n or Y/N]  :"); 
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);
							   switch(c1)	
							   {
							   case 'y':Itel(); b=false; break; // CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
							   case 'n':{
								   System.out.print("Do you want to continue in KEYPAD MOBILES [y/n or Y/N] :");// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);
									   switch(c2)
									   {
									   case 'y': Option(); b=false; break; // CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
									   case 'n': Main_Home.mobilesAndTablets(); b=false; break;// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
									   default:System.out.print("Please enter valid option:"); 
									   }
								   }while(b==true); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="ITEL iT5026";  ob1[i++]=3490;
					   System.out.println("Do you want to continue shopping in this Brand [y/n or Y/N] :");// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);
						   switch(c1)	
						   {
						   case 'y':Itel(); b=false; break; // CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
						   case 'n':Option(); b=false; break;// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);break; 
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this brand [y/n or Y/N]  :"); 
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);
							   switch(c1)	
							   {
							   case 'y':Itel(); b=false; break; // CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
							   case 'n':{
								   System.out.print("Do you want to continue in KEYPAD MOBILES [y/n or Y/N] :");// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);
									   switch(c2)
									   {
									   case 'y': Option(); b=false; break; // CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
									   case 'n': Main_Home.mobilesAndTablets(); b=false; break;// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
									   default:System.out.print("Please enter valid option:"); 
									   }
								   }while(b==true); b=false; break;
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
					   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="ITEL MX PLAY";  ob1[i++]=4999;
					   System.out.println("Do you want to continue shopping in this Brand [y/n or Y/N] :");// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
					   do
					   {
						   char c1=sc.next().toLowerCase().charAt(0);
						   switch(c1)	
						   {
						   case 'y':Itel(); b=false; break; // CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
						   case 'n':Option(); b=false; break;// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
						   default : System.out.print("Please enter valid option: ");
						   }
					   }while(b==true);break; 
					   case 'n':
					   {
						   System.out.print("Do you want to see another model in this brand [y/n or Y/N]  :"); 
						   do
						   {
							   char c1=sc.next().toLowerCase().charAt(0);
							   switch(c1)	
							   {
							   case 'y':Itel(); b=false; break; // CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
							   case 'n':{
								   System.out.print("Do you want to continue in KEYPAD MOBILES [y/n or Y/N] :");// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
								   do 
								   {
									   char c2=sc.next().toLowerCase().charAt(0);
									   switch(c2)
									   {
									   case 'y': Option(); b=false; break; // CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
									   case 'n': Main_Home.mobilesAndTablets(); b=false; break;// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
									   default:System.out.print("Please enter valid option:"); 
									   }
								   }while(b==true); b=false; break;
							   }
							   default:System.out.print("Please enter valid option:");
							   }
						   }while(b==true); b=false; break;
					   }
					   default:  System.out.print("Please enter valid option:");
					   }
				   }while(b==true);  b=false; break; 
			   }
			   
			   case 7:Option(); b=false; break;// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
			   default: System.out.print("PLEASE ENTER VALID OPTION: ");
			   }
		   }while(b==true); 
	 }

}
