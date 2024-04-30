package smartphones_Tablets;

import java.util.Scanner;

import home_screen.Main_Home;

public class Tablets {
	public 	static String ob[]=new String[100];
	public 	static float ob1[]=new float[100];static int i=0;
	static Scanner sc=new Scanner(System.in);private static final String RESET = "\033[0m";  // Text Reset
	static boolean b=true;
		public static void display()
		{ System.out.println(RESET);
			System.out.println("\t\t"+"\t\t\t  __________________________________________________________________           ");
			System.out.println("\t\t"+"\t\t\t |  ***                    _______________                     ***  |          ");
			System.out.println("\t\t"+"\t\t\t |  ***                   (_______________)                    ***  |          ");
			System.out.println("\t\t"+"\t\t\t |   ____________________________________________________________   |          ");
			System.out.println("\t\t"+"\t\t\t |  |                                                            |  |        ");
			System.out.println("\t\t"+"\t\t\t |  |                                                            |  |          ");
			System.out.println("\t\t"+"\t\t\t |  |                                                            |  |          ");
			System.out.println("\t\t"+"\t\t\t |  |                                                            |  |          ");
			System.out.println("\t\t"+"\t\t\t |  |                                                            |  |          ");
			System.out.println("\t\t"+"\t\t\t |  |                                                            |  |          ");
			System.out.println("\t\t"+"\t\t\t |  |                                                            |  |          ");
			System.out.println("\t\t"+"\t\t\t |  |                           TABLETS                          |  |          ");
			System.out.println("\t\t"+"\t\t\t |  |                        -------------                       |  |          ");
			System.out.println("\t\t"+"\t\t\t |  |                                                            |  |          ");
			System.out.println("\t\t"+"\t\t\t |  |                                                            |  |          ");
			System.out.println("\t\t"+"\t\t\t |  |                        1. SAMSUNG                          |  |          ");
			System.out.println("\t\t"+"\t\t\t |  |                                                            |  |          ");
			System.out.println("\t\t"+"\t\t\t |  |                        2. XIAOMI                           |  |          ");
			System.out.println("\t\t"+"\t\t\t |  |                                                            |  |          ");
			System.out.println("\t\t"+"\t\t\t |  |                        3. APPLE                            |  |          ");
			System.out.println("\t\t"+"\t\t\t |  |                                                            |  |          ");
			System.out.println("\t\t"+"\t\t\t |  |                        4. ONE PLUS                         |  |          ");
			System.out.println("\t\t"+"\t\t\t |  |                                                            |  |          ");
			System.out.println("\t\t"+"\t\t\t |  |                        5. REALME                           |  |          ");
			System.out.println("\t\t"+"\t\t\t |  |                                                            |  |          ");
			System.out.println("\t\t"+"\t\t\t |  |                        6. EXIT                             |  |          ");
			System.out.println("\t\t"+"\t\t\t |  |                                                            |  |          ");
			System.out.println("\t\t"+"\t\t\t |  |                                                            |  |          ");
			System.out.println("\t\t"+"\t\t\t |  |                                                            |  |          ");
			System.out.println("\t\t"+"\t\t\t |  |                                                            |  |          ");
			System.out.println("\t\t"+"\t\t\t |  |                                                            |  |          ");
			System.out.println("\t\t"+"\t\t\t |  |____________________________________________________________|  |          ");
			System.out.println("\t\t"+"\t\t\t |                                                                  |          ");
			System.out.println("\t\t"+"\t\t\t |                <         (     O     )         >                 |          ");
			System.out.println("\t\t"+"\t\t\t |__________________________________________________________________|          ");
			 System.out.println(RESET); Displayswitch();
		}
public static void Displayswitch()
		
		{
			System.out.print("PLEASE ENTER YOUR PREFERRED BRAND : ");
			int c=sc.nextInt();
			boolean b=true;
			do
			{
				switch(c)
				{
				case 1: Samsungmenu(); b=false; break;
				case 2: XIAOMImenu(); b=false; break;
				case 3: APPLEmenu(); b=false; break;
				case 4: ONEPLUSmenu(); b=false; break;
				case 5: REALMEmenu(); b=false; break;
				case 6: Main_Home.mobilesAndTablets();b=false; break;
				default: 
				{
					System.out.println();
					System.out.print("\t\t\t\t\t\t\t\t "+"PLEASE ENTER VALID OPTION..."+"\n");
					System.out.println();
			        display(); b=false; break;
				}
			}
		}while(b==true);
		
		
	}
public static void Samsungmenu()
{ System.out.println(RESET);
	 System.out.println("\t\t\t\t\t\t"+"                        SAMSUNG                         ");  
	 System.out.println("\t\t\t\t\t\t"+"                      -------------                      ");  
	 System.out.println("\t\t\t\t\t\t"+"                      1.Between 15k-30k              ");  
	 System.out.println("\t\t\t\t\t\t"+"                      2.Above 30k                  ");
	 System.out.println("\t\t\t\t\t\t"+"                      3.EXIT FROM SAMSUNG                            ");
	 System.out.println(RESET); Samsung();
}
public static void Samsung()
{
System.out.print("PLEASE ENTER THE PRICE RANGE  :");
	do
	{
	int p=sc.nextInt();
	switch(p) 
	{
	case 1: Samsung15k30k(); b=false; break;
	case 2:Samsungabove30k();b=false; break;
	case 3: display();b=false; break;
	default:
	{
		System.out.print("Please enter valid option:");
		Samsungmenu();
	}
	}
	}while(b==true);
}

public static void Samsung15k30k()
{ System.out.println(RESET);
	 System.out.println("\t\t"+" _________________________________________________________________________________________________________________________________");  
	 System.out.println("\t\t"+"|                                                                                                                                 |");  
	 System.out.println("\t\t"+"|     ____________________      ____________________      ____________________      ____________________      ________________    |");  
	 System.out.println("\t\t"+"|    |  SAMSUNG A7LITE    |    |  SAMSUNG A7 4G     |    |  SAMSUNG A8 4G     |    |    SAMSUNG S6      |    |                |   |");  
	 System.out.println("\t\t"+"|    |--------------------|    |--------------------|    |--------------------|    |--------------------|    |                |   |");  
	 System.out.println("\t\t"+"|    |.Battery : 8000mAh  |    |.Battery : 8000mAh  |    |.Battery : 7040mAh  |    |.Battery : 9000mAh  |    |                |   |");  
	 System.out.println("\t\t"+"|    |.Wifi-only-Tablet   |    |.Wifi +4G Tablet    |    |.Wifi +4G Tablet    |    |.Wifi +4G Tablet    |    |      EXIT      |   |");  
	 System.out.println("\t\t"+"|    |.Screen Resolution: |    |.Screen Resolution: |    |.Screen Resolution: |    |.Screen Resolution: |    |     ------     |   |");  
	 System.out.println("\t\t"+"|    |    22.05cm(8.7inch)|    |   26.42cm(10.4inch)|    |   26.67cm(10.5inch)|    |   26.42cm(10.4inch)|    |                |   |");  
	 System.out.println("\t\t"+"|    |.RAM : 3GB          |    |.RAM : 3GB          |    |.RAM : 3GB          |    |.RAM : 4GB          |    |                |   |");  
	 System.out.println("\t\t"+"|    |.ROM:32GB Expandable|    |.ROM:32GB Expandable|    |.ROM:32GB Expandable|    |.ROM:32GB Expandable|    |                |   |");  
	 System.out.println("\t\t"+"|    |.Price : 15,000/-   |    |.Price : 16,550/-   |    |.Price : 20,000/-   |    |.Price : 28,000/-   |    |                |   |");  
	 System.out.println("\t\t"+"|    |____________________|    |____________________|    |____________________|    |____________________|    |________________|   |");   
	 System.out.println("\t\t"+"|                                                                                                                                 |");  
	 System.out.println("\t\t"+"|             1.                         2.                        3.                        4.                       5.          |");  
	 System.out.println("\t\t"+"|_________________________________________________________________________________________________________________________________|"); 
	 System.out.println(RESET);	SamsungSwitch();
		
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
				 System.out.print("Do you want to add it to cart [y/n or Y/N]:"); //MADE CHANGES
				 do
				 {
					 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					 switch(c)
					 {
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SAMSUNG A7 LITE"; ob1[i++]=15000;
							 System.out.print("Do you want to continue shopping in this Budget (Between 15k-30k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
			 		  do
			 		  {
			 			char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
			 			switch(c1)	
						{
						case 'y':Samsung15k30k(); b=false; break; // MADE CHANGES HEREE
						case 'n':Samsungmenu(); b=false; break; // MADE CHANGES HEREE
			 			default : System.out.print("Please enter valid option: ");
						}
			 		  }while(b==true);  break;
					 case 'n':
						 {
							 System.out.print("Do you want to see another model in this Budget (Between 15k-30k) [y/n or Y/N]:");  //MADE CHANGES HERE
								do
								{
									char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								switch(c1)	
								{
								case 'y':Samsung15k30k(); b=false; break; //MADE CHANGES HERE
								case 'n':
									{
										System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
										do 
										{
											char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
											switch(c2)
											{
											case 'y': Samsungmenu(); b=false; break;
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
				 System.out.print("Do you want to add it to cart [y/n or Y/N]:"); //MADE CHANGES
				 do
				 {
					 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					 switch(c)
					 {
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="SAMSUNG A7 4G"; ob1[i++]=16550;
					 System.out.print("Do you want to continue shopping in this Budget (Between 15k-30k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':Samsung15k30k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':Samsungmenu(); b=false; break; // MADE CHANGES HEREE
						 default : System.out.print("Please enter valid option: ");
						 }
					 }while(b==true);  break;
					 case 'n':
					 {
						 System.out.print("Do you want to see another model in this Budget (Between 15k-30k) [y/n or Y/N]:");  //MADE CHANGES HERE
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':Samsung15k30k(); b=false; break; //MADE CHANGES HERE
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': Samsungmenu(); b=false; break;
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
				 System.out.print("Do you want to add it to cart [y/n or Y/N]:"); //MADE CHANGES
				 do
				 {
					 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					 switch(c)
					 {
					 case 'y':System.out.println("Your Item is added to cart .");  ob[i]="SAMSUNG A8 4G"; ob1[i++]=20000;
					 System.out.print("Do you want to continue shopping in this Budget (Between 15k-30k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':Samsung15k30k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':Samsungmenu(); b=false; break; // MADE CHANGES HEREE
						 default : System.out.print("Please enter valid option: ");
						 }
					 }while(b==true);  break;
					 case 'n':
					 {
						 System.out.print("Do you want to see another model in this Budget (Between 15k-30k) [y/n or Y/N]:");  //MADE CHANGES HERE
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':Samsung15k30k(); b=false; break; //MADE CHANGES HERE
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': Samsungmenu(); b=false; break;
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
				 System.out.print("Do you want to add it to cart [y/n or Y/N]:"); //MADE CHANGES
				 do
				 {
					 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					 switch(c)
					 {
					 case 'y':System.out.println("Your Item is added to cart .");  ob[i]="SAMSUNG S6"; ob1[i++]=28000;
					 System.out.print("Do you want to continue shopping in this Budget (Between 15k-30k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':Samsung15k30k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':Samsungmenu(); b=false; break; // MADE CHANGES HEREE
						 default : System.out.print("Please enter valid option: ");
						 }
					 }while(b==true);  break;
					 case 'n':
					 {
						 System.out.print("Do you want to see another model in this Budget (Between 15k-30k) [y/n or Y/N]:");  //MADE CHANGES HERE
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':Samsung15k30k(); b=false; break; //MADE CHANGES HERE
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': Samsungmenu(); b=false; break;
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
			 case 5:  Samsungmenu(); b=false; break;
				 default:  System.out.print("Please enter valid option:");
				 }
			 }while(b==true); 
		}
public static void Samsungabove30k()
{
	 System.out.println(RESET);
	 System.out.println("\t\t"+" _________________________________________________________________________________________________________________________________");  
	 System.out.println("\t\t"+"|                                                                                                                                 |");  
	 System.out.println("\t\t"+"|    ____________________     ____________________     ____________________     ____________________     ____________________     |");  
	 System.out.println("\t\t"+"|   |  SAMSUNG S7 LITE   |   |  SAMSUNG S7 PLUS   |   |    SAMSUNG S8      |   |  SAMSUNG A7 LITE   |   |   SAMSUNG A7 4G    |    |");  
	 System.out.println("\t\t"+"|   |--------------------|   |--------------------|   |--------------------|   |--------------------|   |--------------------|    |");  
	 System.out.println("\t\t"+"|   |.Battery : 7040mAh  |   |.Battery : 8000mAh  |   |.Battery : 8000mAh  |   |.Battery : 7050mAh  |   |.Battery : 7040mAh  |    |");  
	 System.out.println("\t\t"+"|   |.Wifi +4G Tablet    |   |.Wifi +4G Tablet    |   |.Wifi +4G Tablet    |   |.Wifi +4G Tablet    |   |.Wifi +4G Tablet    |    |");  
	 System.out.println("\t\t"+"|   |.Screen Resolution: |   |.Screen Resolution: |   |.Screen Resolution: |   |.Screen Resolution: |   |.Screen Resolution: |    |");  
	 System.out.println("\t\t"+"|   |    22.05cm(8.7inch)|   |    22.05cm(8.7inch)|   |    22.05cm(8.7inch)|   |    22.05cm(8.7inch)|   |.   22.05cm(8.7inch)|    |");  
	 System.out.println("\t\t"+"|   |.RAM : 4GB          |   |.RAM : 4GB          |   |.RAM : 4GB          |   |.RAM : 4GB          |   |.RAM : 4GB          |    |");  
	 System.out.println("\t\t"+"|   |.ROM:64GB Expandable|   |.ROM:64GB Expandable|   |.ROM:64GB Expandable|   |.ROM:64GB Expandable|   |.ROM:64GB Expandable|    |");  
	 System.out.println("\t\t"+"|   |.Price : 30,000/-   |   |.Price : 32000/-    |   |.Price : 35,000/-   |   |.Price : 35,000/-   |   |.Price : 40,000/-   |    |");  
	 System.out.println("\t\t"+"|   |____________________|   |____________________|   |____________________|   |____________________|   |____________________|    |");  
	 System.out.println("\t\t"+"|                                                                                                                                 |");  
	 System.out.println("\t\t"+"|            1.                        2.                       3.                       4.                       5.              |");  
	 System.out.println("\t\t"+"|                                                       ___________________                                                       |");  
	 System.out.println("\t\t"+"|                                                      |                   |                                                      |");  
	 System.out.println("\t\t"+"|                                                      |                   |                                                      |");  
	 System.out.println("\t\t"+"|                                                      |                   |                                                      |");  
	 System.out.println("\t\t"+"|                                                      |        EXIT       |                                                      |");  
	 System.out.println("\t\t"+"|                                                      |                   |                                                      |");  
	 System.out.println("\t\t"+"|                                                      |       ------      |                                                      |");  
	 System.out.println("\t\t"+"|                                                      |                   |                                                      |");  
	 System.out.println("\t\t"+"|                                                      |                   |                                                      |");  
	 System.out.println("\t\t"+"|                                                      |                   |                                                      |");  
	 System.out.println("\t\t"+"|                                                      |___________________|                                                      |");  
	 System.out.println("\t\t"+"|                                                                                                                                 |");    
	 System.out.println("\t\t"+"|                                                                6.                                                               |");    
	 System.out.println("\t\t"+"|_________________________________________________________________________________________________________________________________|"); 
		
		 System.out.println(RESET); SamsungSwitch1();
       }


	public static void  SamsungSwitch1()
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
					 case 'y':System.out.println("Your Item is added to cart .");  ob[i]="SAMSUNG S7 LITE"; ob1[i++]=30000;
					 System.out.print("Do you want to continue shopping in this Budget (Above 30k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':Samsungabove30k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':Samsungmenu(); b=false; break; // MADE CHANGES HEREE
						 default : System.out.print("Please enter valid option: ");
						 }
					 }while(b==true);  break;
					 case 'n':
					 {
						 System.out.print("Do you want to see another model in this Budget (Above 30k) [y/n or Y/N]:");  //MADE CHANGES HERE
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':Samsungabove30k(); b=false; break; //MADE CHANGES HERE
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': Samsungmenu(); b=false; break;
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
				 System.out.print("Do you want to add it to cart [y/n or Y/N]:"); //MADE CHANGES
				 do
				 {
					 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					 switch(c)
					 {
					 case 'y':System.out.println("Your Item is added to cart .");  ob[i]="SAMSUNG S7 PLUS"; ob1[i++]=32000;
					 System.out.print("Do you want to continue shopping in this Budget (Above 30k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':Samsungabove30k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':Samsungmenu(); b=false; break; // MADE CHANGES HEREE
						 default : System.out.print("Please enter valid option: ");
						 }
					 }while(b==true);  break;
					 case 'n':
					 {
						 System.out.print("Do you want to see another model in this Budget (Above 30k) [y/n or Y/N]:");  //MADE CHANGES HERE
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':Samsungabove30k(); b=false; break; //MADE CHANGES HERE
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': Samsungmenu(); b=false; break;
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
				 System.out.print("Do you want to add it to cart [y/n or Y/N]:"); //MADE CHANGES
				 do
				 {
					 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					 switch(c)
					 {
					 case 'y':System.out.println("Your Item is added to cart .");  ob[i]="SAMSUNG S8"; ob1[i++]=35000;
					 System.out.print("Do you want to continue shopping in this Budget (Above 30k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':Samsungabove30k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':Samsungmenu(); b=false; break; // MADE CHANGES HEREE
						 default : System.out.print("Please enter valid option: ");
						 }
					 }while(b==true);  break;
					 case 'n':
					 {
						 System.out.print("Do you want to see another model in this Budget (Above 30k) [y/n or Y/N]:");  //MADE CHANGES HERE
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':Samsungabove30k(); b=false; break; //MADE CHANGES HERE
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': Samsungmenu(); b=false; break;
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
				 System.out.print("Do you want to add it to cart [y/n or Y/N]:"); //MADE CHANGES
				 do
				 {
					 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					 switch(c)
					 {
					 case 'y':System.out.println("Your Item is added to cart .");  ob[i]="SAMSUNG A7 LITE"; ob1[i++]=35000;
					 System.out.print("Do you want to continue shopping in this Budget (Above 30k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':Samsungabove30k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':Samsungmenu(); b=false; break; // MADE CHANGES HEREE
						 default : System.out.print("Please enter valid option: ");
						 }
					 }while(b==true);  break;
					 case 'n':
					 {
						 System.out.print("Do you want to see another model in this Budget (Above 30k) [y/n or Y/N]:");  //MADE CHANGES HERE
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':Samsungabove30k(); b=false; break; //MADE CHANGES HERE
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': Samsungmenu(); b=false; break;
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
				 System.out.print("Do you want to add it to cart [y/n or Y/N]:"); //MADE CHANGES
				 do
				 {
					 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					 switch(c)
					 {
					 case 'y':System.out.println("Your Item is added to cart .");  ob[i]="SAMSUNG A7 4G"; ob1[i++]=40000;
					 System.out.print("Do you want to continue shopping in this Budget (Above 30k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':Samsungabove30k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':Samsungmenu(); b=false; break; // MADE CHANGES HEREE
						 default : System.out.print("Please enter valid option: ");
						 }
					 }while(b==true);  break;
					 case 'n':
					 {
						 System.out.print("Do you want to see another model in this Budget (Above 30k) [y/n or Y/N]:");  //MADE CHANGES HERE
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':Samsungabove30k(); b=false; break; //MADE CHANGES HERE
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': Samsungmenu(); b=false; break;
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
			 case 6:  Samsungmenu(); b=false; break;
			 default:  System.out.print("Please enter valid option:");
			 }
		 }while(b==true); 
	}
	
	public static void XIAOMImenu()
	{ System.out.println(RESET);
		 System.out.println("\t\t\t\t\t\t"+"                         XIAOMI                      ");  
		 System.out.println("\t\t\t\t\t\t"+"                      -------------                      ");  
		 System.out.println("\t\t\t\t\t\t"+"                      1.Between 15k-30k              ");  
		 System.out.println("\t\t\t\t\t\t"+"                      2.Above 30k                  ");
		 System.out.println("\t\t\t\t\t\t"+"                      3.EXIT FROM XIAOMI                            ");
		 System.out.println(RESET); XIAOMI();
	}
	public static void XIAOMI()
	{
	System.out.print("PLEASE ENTER THE PRICE RANGE  :");
	do
	{
	int p=sc.nextInt();
	switch(p) 
	{
	case 1: XIAOMI15k30k(); b=false; break;
	case 2:XIAOMIabove30k();b=false; break;
	case 3: display();b=false; break;
	default:
	{
		System.out.print("Please enter valid option:");
		XIAOMImenu();
	}
	}
	}while(b==true);
	}

	public static void XIAOMI15k30k()
	{ System.out.println(RESET);
		 System.out.println("\t\t"+" _________________________________________________________________________________________________________________________________");  
		 System.out.println("\t\t"+"|                                                                                                                                 |");  
		 System.out.println("\t\t"+"|          ____________________           ____________________          ____________________           ________________           |");  
		 System.out.println("\t\t"+"|         |  XIAOMI REDMI PAD  |         |  XIAOMI MI PAD5    |        |  XIAOMI MI PAD5PRO |         |                |          |");  
		 System.out.println("\t\t"+"|         |--------------------|         |--------------------|        |--------------------|         |                |          |");  
		 System.out.println("\t\t"+"|         |.Battery : 8000mAh  |         |.Battery : 8000mAh  |        |.Battery : 7040mAh  |         |                |          |");  
		 System.out.println("\t\t"+"|         |.Wifi-only-Tablet   |         |.Wifi +4G Tablet    |        |.Wifi +4G Tablet    |         |      EXIT      |          |");  
		 System.out.println("\t\t"+"|         |.Screen Resolution: |         |.Screen Resolution: |        |.Screen Resolution: |         |     ------     |          |");  
		 System.out.println("\t\t"+"|         |    22.05cm(8.7inch)|         |   26.42cm(10.4inch)|        |   26.67cm(10.5inch)|         |                |          |");  
		 System.out.println("\t\t"+"|         |.RAM : 3GB          |         |.RAM : 3GB          |        |.RAM : 3GB          |         |                |          |");  
		 System.out.println("\t\t"+"|         |.ROM:32GB Expandable|         |.ROM:32GB Expandable|        |.ROM:32GB Expandable|         |                |          |");  
		 System.out.println("\t\t"+"|         |.Price : 15,000/-   |         |.Price : 16,550/-   |        |.Price : 20,000/-   |         |                |          |");  
		 System.out.println("\t\t"+"|         |____________________|         |____________________|        |____________________|         |________________|          |");   
		 System.out.println("\t\t"+"|                                                                                                                                 |");  
		 System.out.println("\t\t"+"|                   1.                             2.                            3.                           4.                  |");  
		 System.out.println("\t\t"+"|                                                                                                                                 |");  
		 System.out.println("\t\t"+"|_________________________________________________________________________________________________________________________________|");
		 
		 System.out.println(RESET);	xiaomiSwitch();
			
		 
	}
	public static void xiaomiSwitch()
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
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="XIAOMI REDMI PAD"; ob1[i++]=15000;
					 System.out.print("Do you want to continue shopping in this Budget (Between 15k-30k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':XIAOMI15k30k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':XIAOMImenu(); b=false; break; // MADE CHANGES HEREE
						 default : System.out.print("Please enter valid option: ");
						 }
					 }while(b==true);  break;
					 case 'n':
					 {
						 System.out.print("Do you want to see another model in this Budget (Between 15k-30k) [y/n or Y/N]:");  //MADE CHANGES HERE
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':XIAOMI15k30k(); b=false; break; //MADE CHANGES HERE
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': XIAOMImenu(); b=false; break;
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
				 System.out.print("Do you want to add it to cart [y/n or Y/N]:"); //MADE CHANGES
				 do
				 {
					 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					 switch(c)
					 {
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="XIAOMI MI PAD5"; ob1[i++]=16550;
					 System.out.print("Do you want to continue shopping in this Budget (Between 15k-30k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':XIAOMI15k30k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':XIAOMImenu(); b=false; break; // MADE CHANGES HEREE
						 default : System.out.print("Please enter valid option: ");
						 }
					 }while(b==true);  break;
					 case 'n':
					 {
						 System.out.print("Do you want to see another model in this Budget (Between 15k-30k) [y/n or Y/N]:");  //MADE CHANGES HERE
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':XIAOMI15k30k(); b=false; break; //MADE CHANGES HERE
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': XIAOMImenu(); b=false; break;
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
				 System.out.print("Do you want to add it to cart [y/n or Y/N]:"); //MADE CHANGES
				 do
				 {
					 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					 switch(c)
					 {
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="XIAOMI MI PAD5 PRO"; ob1[i++]=20000;
					 System.out.print("Do you want to continue shopping in this Budget (Between 15k-30k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':XIAOMI15k30k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':XIAOMImenu(); b=false; break; // MADE CHANGES HEREE
						 default : System.out.print("Please enter valid option: ");
						 }
					 }while(b==true);  break;
					 case 'n':
					 {
						 System.out.print("Do you want to see another model in this Budget (Between 15k-30k) [y/n or Y/N]:");  //MADE CHANGES HERE
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':XIAOMI15k30k(); b=false; break; //MADE CHANGES HERE
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': XIAOMImenu(); b=false; break;
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
			 case 4:  XIAOMImenu(); b=false; break;
			 default:  System.out.print("Please enter valid option:");
			 }
		 }while(b==true); 
	}
	
	public static void XIAOMIabove30k()
	{ System.out.println(RESET);
		 System.out.println("\t\t"+" ____________________________________________________________________________________________________");  
		 System.out.println("\t\t"+"|                                                                                                    |");  
		 System.out.println("\t\t"+"|          ____________________           ____________________            ________________           |");  
		 System.out.println("\t\t"+"|         |  XIAOMI MIPAD6 PRO |         |  MIPAD5 WIFI LTE   |          |                |          |");  
		 System.out.println("\t\t"+"|         |--------------------|         |--------------------|          |                |          |");  
		 System.out.println("\t\t"+"|         |.Battery : 8000mAh  |         |.Battery : 8000mAh  |          |                |          |");  
		 System.out.println("\t\t"+"|         |.Wifi-only-Tablet   |         |.Wifi +4G Tablet    |          |      EXIT      |          |");  
		 System.out.println("\t\t"+"|         |.Screen Resolution: |         |.Screen Resolution: |          |     ------     |          |");  
		 System.out.println("\t\t"+"|         |    22.05cm(8.7inch)|         |   26.42cm(10.4inch)|          |                |          |");  
		 System.out.println("\t\t"+"|         |.RAM : 3GB          |         |.RAM : 3GB          |          |                |          |");  
		 System.out.println("\t\t"+"|         |.ROM:32GB Expandable|         |.ROM:32GB Expandable|          |                |          |");  
		 System.out.println("\t\t"+"|         |.Price : 30,000/-   |         |.Price : 32,550/-   |          |                |          |");  
		 System.out.println("\t\t"+"|         |____________________|         |____________________|          |________________|          |");   
		 System.out.println("\t\t"+"|                                                                                                    |");  
		 System.out.println("\t\t"+"|                  1.                              2.                             3.                 |");  
		 System.out.println("\t\t"+"|                                                                                                    |");  
		 System.out.println("\t\t"+"|____________________________________________________________________________________________________|");
		 
		 System.out.println(RESET);
		xiaomiSwitch1();
		
	}
	public static void xiaomiSwitch1()
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
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="XIAOMI MIPAD6 PRO"; ob1[i++]=30000;
					 System.out.print("Do you want to continue shopping in this Budget (Above 30k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':XIAOMIabove30k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':XIAOMImenu(); b=false; break; // MADE CHANGES HEREE
						 default : System.out.print("Please enter valid option: ");
						 }
					 }while(b==true);  break;
					 case 'n':
					 {
						 System.out.print("Do you want to see another model in this Budget (Above 30k) [y/n or Y/N]:");  //MADE CHANGES HERE
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':XIAOMIabove30k(); b=false; break; //MADE CHANGES HERE
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': XIAOMImenu(); b=false; break;
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
				 System.out.print("Do you want to add it to cart [y/n or Y/N]:"); //MADE CHANGES
				 do
				 {
					 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					 switch(c)
					 {
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="MIPAD5 WIFI LTE"; ob1[i++]=32550;
					 System.out.print("Do you want to continue shopping in this Budget (Above 30k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':XIAOMIabove30k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':XIAOMImenu(); b=false; break; // MADE CHANGES HEREE
						 default : System.out.print("Please enter valid option: ");
						 }
					 }while(b==true);  break;
					 case 'n':
					 {
						 System.out.print("Do you want to see another model in this Budget (Above 30k) [y/n or Y/N]:");  //MADE CHANGES HERE
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':XIAOMIabove30k(); b=false; break; //MADE CHANGES HERE
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': XIAOMImenu(); b=false; break;
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
			 case 3:  XIAOMImenu(); b=false; break;
			 default:  System.out.print("Please enter valid option:");
			 }
		 }while(b==true); 
		
	}
	
	public static void APPLEmenu()
	{ System.out.println(RESET);
			 System.out.println("\t\t\t\t\t\t"+"                         APPLE                       ");  
			 System.out.println("\t\t\t\t\t\t"+"                      -------------                      ");  
			 System.out.println("\t\t\t\t\t\t"+"                      1.Between 15k-30k              ");  
			 System.out.println("\t\t\t\t\t\t"+"                      2.Above 30k                  ");
			 System.out.println("\t\t\t\t\t\t"+"                      3.EXIT FROM APPLE                            ");
			 System.out.println(RESET);	 APPLE();
		}
		public static void APPLE()
		{
		System.out.print("PLEASE ENTER THE PRICE RANGE  :");
		do
		{
		int p=sc.nextInt();
		switch(p) 
		{
		case 1: APPLE15k30k(); b=false; break;
		case 2:APPLEabove30k();b=false; break;
		case 3: display();b=false; break;
		default:
		{
			System.out.print("Please enter valid option:");
			APPLEmenu();
		}
		}
		}while(b==true);
		}
	
public static void  APPLE15k30k()
{ System.out.println(RESET);
	 System.out.println("\t\t"+" _________________________________________________________________________________________________________________________________");  
	 System.out.println("\t\t"+"|                                                                                                                                 |");  
	 System.out.println("\t\t"+"|    ____________________     ____________________     ____________________     ____________________     ____________________     |");  
	 System.out.println("\t\t"+"|   |   APPLE IPAD10.1   |   |   APPLE IPAD10.2   |   |   APPLE 10.2(2022) |   |   APPLE IPADMINI   |   |   APPLE 10.2(2021) |    |");  
	 System.out.println("\t\t"+"|   |--------------------|   |--------------------|   |--------------------|   |--------------------|   |--------------------|    |");  
	 System.out.println("\t\t"+"|   |.Battery : 7040mAh  |   |.Battery : 8000mAh  |   |.Battery : 8000mAh  |   |.Battery : 7050mAh  |   |.Battery : 7040mAh  |    |");  
	 System.out.println("\t\t"+"|   |.Wifi +4G Tablet    |   |.Wifi +4G Tablet    |   |.Wifi +4G Tablet    |   |.Wifi +4G Tablet    |   |.Wifi +4G Tablet    |    |");  
	 System.out.println("\t\t"+"|   |.Screen Resolution: |   |.Screen Resolution: |   |.Screen Resolution: |   |.Screen Resolution: |   |.Screen Resolution: |    |");  
	 System.out.println("\t\t"+"|   |    22.05cm(8.7inch)|   |    22.05cm(8.7inch)|   |    22.05cm(8.7inch)|   |    22.05cm(8.7inch)|   |.   22.05cm(8.7inch)|    |");  
	 System.out.println("\t\t"+"|   |.RAM : 4GB          |   |.RAM : 4GB          |   |.RAM : 4GB          |   |.RAM : 4GB          |   |.RAM : 4GB          |    |");  
	 System.out.println("\t\t"+"|   |.ROM:32GB Expandable|   |.ROM:64GB Expandable|   |.ROM:64GB Expandable|   |.ROM:64GB Expandable|   |.ROM:64GB Expandable|    |");  
	 System.out.println("\t\t"+"|   |.Price : 18,900/-   |   |.Price : 21,000/-   |   |.Price : 25,000/-   |   |.Price : 22,500/-   |   |.Price : 27,000/-   |    |");  
	 System.out.println("\t\t"+"|   |____________________|   |____________________|   |____________________|   |____________________|   |____________________|    |");  
	 System.out.println("\t\t"+"|                                                                                                                                 |");  
	 System.out.println("\t\t"+"|             1.                       2.                        3.                      4.                       5.              |");  
	 System.out.println("\t\t"+"|                                                       ___________________                                                       |");  
	 System.out.println("\t\t"+"|                                                      |                   |                                                      |");  
	 System.out.println("\t\t"+"|                                                      |                   |                                                      |");  
	 System.out.println("\t\t"+"|                                                      |                   |                                                      |");  
	 System.out.println("\t\t"+"|                                                      |        EXIT       |                                                      |");  
	 System.out.println("\t\t"+"|                                                      |                   |                                                      |");  
	 System.out.println("\t\t"+"|                                                      |       ------      |                                                      |");  
	 System.out.println("\t\t"+"|                                                      |                   |                                                      |");  
	 System.out.println("\t\t"+"|                                                      |                   |                                                      |");  
	 System.out.println("\t\t"+"|                                                      |                   |                                                      |");  
	 System.out.println("\t\t"+"|                                                      |___________________|                                                      |");  
	 System.out.println("\t\t"+"|                                                                                                                                 |");    
	 System.out.println("\t\t"+"|                                                                6.                                                               |");    
	 System.out.println("\t\t"+"|_________________________________________________________________________________________________________________________________|");
	 
	 System.out.println(RESET); appleswitch();	
}
	public static void  appleswitch()
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
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="APPLE IPAD10.1"; ob1[i++]=18900;
					 System.out.print("Do you want to continue shopping in this Budget (Between 15k-30k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':APPLE15k30k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':APPLEmenu(); b=false; break; // MADE CHANGES HEREE
						 default : System.out.print("Please enter valid option: ");
						 }
					 }while(b==true);  break;
					 case 'n':
					 {
						 System.out.print("Do you want to see another model in this Budget (Between 15k-30k) [y/n or Y/N]:");  //MADE CHANGES HERE
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':APPLE15k30k(); b=false; break; //MADE CHANGES HERE
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': APPLEmenu(); b=false; break;
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
				 System.out.print("Do you want to add it to cart [y/n or Y/N]:"); //MADE CHANGES
				 do
				 {
					 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					 switch(c)
					 {
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="APPLE IPAD10.2"; ob1[i++]=21000;
					 System.out.print("Do you want to continue shopping in this Budget (Between 15k-30k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':APPLE15k30k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':APPLEmenu(); b=false; break; // MADE CHANGES HEREE
						 default : System.out.print("Please enter valid option: ");
						 }
					 }while(b==true);  break;
					 case 'n':
					 {
						 System.out.print("Do you want to see another model in this Budget (Between 15k-30k) [y/n or Y/N]:");  //MADE CHANGES HERE
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':APPLE15k30k(); b=false; break; //MADE CHANGES HERE
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': APPLEmenu(); b=false; break;
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
				 System.out.print("Do you want to add it to cart [y/n or Y/N]:"); //MADE CHANGES
				 do
				 {
					 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					 switch(c)
					 {
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="APPLE 10.2(2022)"; ob1[i++]=25000;
					 System.out.print("Do you want to continue shopping in this Budget (Between 15k-30k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':APPLE15k30k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':APPLEmenu(); b=false; break; // MADE CHANGES HEREE
						 default : System.out.print("Please enter valid option: ");
						 }
					 }while(b==true);  break;
					 case 'n':
					 {
						 System.out.print("Do you want to see another model in this Budget (Between 15k-30k) [y/n or Y/N]:");  //MADE CHANGES HERE
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':APPLE15k30k(); b=false; break; //MADE CHANGES HERE
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': APPLEmenu(); b=false; break;
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
				 System.out.print("Do you want to add it to cart [y/n or Y/N]:"); //MADE CHANGES
				 do
				 {
					 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					 switch(c)
					 {
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="APPLE IPAD MINI"; ob1[i++]=22500;
					 System.out.print("Do you want to continue shopping in this Budget (Between 15k-30k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':APPLE15k30k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':APPLEmenu(); b=false; break; // MADE CHANGES HEREE
						 default : System.out.print("Please enter valid option: ");
						 }
					 }while(b==true);  break;
					 case 'n':
					 {
						 System.out.print("Do you want to see another model in this Budget (Between 15k-30k) [y/n or Y/N]:");  //MADE CHANGES HERE
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':APPLE15k30k(); b=false; break; //MADE CHANGES HERE
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': APPLEmenu(); b=false; break;
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
				 System.out.print("Do you want to add it to cart [y/n or Y/N]:"); //MADE CHANGES
				 do
				 {
					 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
					 switch(c)
					 {
					 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="APPLE 10.2(2021)"; ob1[i++]=27000;
					 System.out.print("Do you want to continue shopping in this Budget (Between 15k-30k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
					 do
					 {
						 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c1)	
						 {
						 case 'y':APPLE15k30k(); b=false; break; // MADE CHANGES HEREE
						 case 'n':APPLEmenu(); b=false; break; // MADE CHANGES HEREE
						 default : System.out.print("Please enter valid option: ");
						 }
					 }while(b==true);  break;
					 case 'n':
					 {
						 System.out.print("Do you want to see another model in this Budget (Between 15k-30k) [y/n or Y/N]:");  //MADE CHANGES HERE
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':APPLE15k30k(); b=false; break; //MADE CHANGES HERE
							 case 'n':
							 {
								 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
								 do 
								 {
									 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c2)
									 {
									 case 'y': APPLEmenu(); b=false; break;
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
		 case 6:  APPLEmenu(); b=false; break;
		 default:  System.out.print("Please enter valid option:");
		 }
	 }while(b==true); 
	
}
	
	public static void APPLEabove30k()
	{
		 System.out.println(RESET);
		 System.out.println("\t\t"+" _________________________________________________________________________________________________________________________________");  
		 System.out.println("\t\t"+"|                                                                                                                                 |");  
		 System.out.println("\t\t"+"|    ____________________     ____________________     ____________________     ____________________     ____________________     |");  
		 System.out.println("\t\t"+"|   |   IPAD AIR WIFI    |   |    IPAD PRO 11     |   |   IPAD AIR (2022)  |   |  IPAD PRO 11 WIFI  |   |   IPAD AIR 2022    |    |");  
		 System.out.println("\t\t"+"|   |--------------------|   |--------------------|   |--------------------|   |--------------------|   |--------------------|    |");  
		 System.out.println("\t\t"+"|   |.Battery : 7040mAh  |   |.Battery : 8000mAh  |   |.Battery : 8000mAh  |   |.Battery : 7050mAh  |   |.Battery : 7040mAh  |    |");  
		 System.out.println("\t\t"+"|   |.Wifi +4G Tablet    |   |.Wifi +4G Tablet    |   |.Wifi +4G Tablet    |   |.Wifi +4G Tablet    |   |.Wifi +4G Tablet    |    |");  
		 System.out.println("\t\t"+"|   |.Screen Resolution: |   |.Screen Resolution: |   |.Screen Resolution: |   |.Screen Resolution: |   |.Screen Resolution: |    |");  
		 System.out.println("\t\t"+"|   |    22.05cm(8.7inch)|   |    22.05cm(8.7inch)|   |    22.05cm(8.7inch)|   |    22.05cm(8.7inch)|   |.   22.05cm(8.7inch)|    |");  
		 System.out.println("\t\t"+"|   |.RAM : 4GB          |   |.RAM : 4GB          |   |.RAM : 4GB          |   |.RAM : 4GB          |   |.RAM : 4GB          |    |");  
		 System.out.println("\t\t"+"|   |.ROM:32GB Expandable|   |.ROM:64GB Expandable|   |.ROM:64GB Expandable|   |.ROM:64GB Expandable|   |.ROM:64GB Expandable|    |");  
		 System.out.println("\t\t"+"|   |.Price : 38,900/-   |   |.Price : 52,000/-   |   |.Price : 48,000/-   |   |.Price : 35,500/-   |   |.Price : 40,000/-   |    |");  
		 System.out.println("\t\t"+"|   |____________________|   |____________________|   |____________________|   |____________________|   |____________________|    |");  
		 System.out.println("\t\t"+"|                                                                                                                                 |");  
		 System.out.println("\t\t"+"|             1.                       2.                        3.                       4.                       5.             |");  
		 System.out.println("\t\t"+"|                                                       ___________________                                                       |");  
		 System.out.println("\t\t"+"|                                                      |                   |                                                      |");  
		 System.out.println("\t\t"+"|                                                      |                   |                                                      |");  
		 System.out.println("\t\t"+"|                                                      |                   |                                                      |");  
		 System.out.println("\t\t"+"|                                                      |        EXIT       |                                                      |");  
		 System.out.println("\t\t"+"|                                                      |                   |                                                      |");  
		 System.out.println("\t\t"+"|                                                      |       ------      |                                                      |");  
		 System.out.println("\t\t"+"|                                                      |                   |                                                      |");  
		 System.out.println("\t\t"+"|                                                      |                   |                                                      |");  
		 System.out.println("\t\t"+"|                                                      |                   |                                                      |");  
		 System.out.println("\t\t"+"|                                                      |___________________|                                                      |");  
		 System.out.println("\t\t"+"|                                                                                                                                 |");    
		 System.out.println("\t\t"+"|                                                               6.                                                                |");    
		 System.out.println("\t\t"+"|_________________________________________________________________________________________________________________________________|");
		 System.out.println(RESET); 
		 appleswitch1();	
		
	}
	
		public static void appleswitch1()
		
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
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="IPAD AIR WIFI"; ob1[i++]=38900;
						 System.out.print("Do you want to continue shopping in this Budget (Above 30k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':APPLEabove30k(); b=false; break; // MADE CHANGES HEREE
							 case 'n':APPLEmenu(); b=false; break; // MADE CHANGES HEREE
							 default : System.out.print("Please enter valid option: ");
							 }
						 }while(b==true);  break;
						 case 'n':
						 {
							 System.out.print("Do you want to see another model in this Budget (Above 30k) [y/n or Y/N]:");  //MADE CHANGES HERE
							 do
							 {
								 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								 switch(c1)	
								 {
								 case 'y':APPLEabove30k(); b=false; break; //MADE CHANGES HERE
								 case 'n':
								 {
									 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
									 do 
									 {
										 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
										 switch(c2)
										 {
										 case 'y': APPLEmenu(); b=false; break;
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
					 System.out.print("Do you want to add it to cart [y/n or Y/N]:"); //MADE CHANGES
					 do
					 {
						 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c)
						 {
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="IPAD PRO 11"; ob1[i++]=52000;
						 System.out.print("Do you want to continue shopping in this Budget (Above 30k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':APPLEabove30k(); b=false; break; // MADE CHANGES HEREE
							 case 'n':APPLEmenu(); b=false; break; // MADE CHANGES HEREE
							 default : System.out.print("Please enter valid option: ");
							 }
						 }while(b==true);  break;
						 case 'n':
						 {
							 System.out.print("Do you want to see another model in this Budget (Above 30k) [y/n or Y/N]:");  //MADE CHANGES HERE
							 do
							 {
								 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								 switch(c1)	
								 {
								 case 'y':APPLEabove30k(); b=false; break; //MADE CHANGES HERE
								 case 'n':
								 {
									 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
									 do 
									 {
										 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
										 switch(c2)
										 {
										 case 'y': APPLEmenu(); b=false; break;
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
					 System.out.print("Do you want to add it to cart [y/n or Y/N]:"); //MADE CHANGES
					 do
					 {
						 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c)
						 {
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="IPAD AIR(2022)"; ob1[i++]=48000;
						 System.out.print("Do you want to continue shopping in this Budget (Above 30k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':APPLEabove30k(); b=false; break; // MADE CHANGES HEREE
							 case 'n':APPLEmenu(); b=false; break; // MADE CHANGES HEREE
							 default : System.out.print("Please enter valid option: ");
							 }
						 }while(b==true);  break;
						 case 'n':
						 {
							 System.out.print("Do you want to see another model in this Budget (Above 30k) [y/n or Y/N]:");  //MADE CHANGES HERE
							 do
							 {
								 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								 switch(c1)	
								 {
								 case 'y':APPLEabove30k(); b=false; break; //MADE CHANGES HERE
								 case 'n':
								 {
									 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
									 do 
									 {
										 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
										 switch(c2)
										 {
										 case 'y': APPLEmenu(); b=false; break;
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
					 System.out.print("Do you want to add it to cart [y/n or Y/N]:"); //MADE CHANGES
					 do
					 {
						 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c)
						 {
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="IPAD PRO 11 WIFI"; ob1[i++]=35500;
						 System.out.print("Do you want to continue shopping in this Budget (Above 30k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':APPLEabove30k(); b=false; break; // MADE CHANGES HEREE
							 case 'n':APPLEmenu(); b=false; break; // MADE CHANGES HEREE
							 default : System.out.print("Please enter valid option: ");
							 }
						 }while(b==true);  break;
						 case 'n':
						 {
							 System.out.print("Do you want to see another model in this Budget (Above 30k) [y/n or Y/N]:");  //MADE CHANGES HERE
							 do
							 {
								 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								 switch(c1)	
								 {
								 case 'y':APPLEabove30k(); b=false; break; //MADE CHANGES HERE
								 case 'n':
								 {
									 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
									 do 
									 {
										 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
										 switch(c2)
										 {
										 case 'y': APPLEmenu(); b=false; break;
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
					 System.out.print("Do you want to add it to cart [y/n or Y/N]:"); //MADE CHANGES
					 do
					 {
						 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 switch(c)
						 {
						 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="IPAD AIR 2022"; ob1[i++]=40000;
						 System.out.print("Do you want to continue shopping in this Budget (Above 30k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
						 do
						 {
							 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
							 switch(c1)	
							 {
							 case 'y':APPLEabove30k(); b=false; break; // MADE CHANGES HEREE
							 case 'n':APPLEmenu(); b=false; break; // MADE CHANGES HEREE
							 default : System.out.print("Please enter valid option: ");
							 }
						 }while(b==true);  break;
						 case 'n':
						 {
							 System.out.print("Do you want to see another model in this Budget (Above 30k) [y/n or Y/N]:");  //MADE CHANGES HERE
							 do
							 {
								 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								 switch(c1)	
								 {
								 case 'y':APPLEabove30k(); b=false; break; //MADE CHANGES HERE
								 case 'n':
								 {
									 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
									 do 
									 {
										 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
										 switch(c2)
										 {
										 case 'y': APPLEmenu(); b=false; break;
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

		 case 6:  APPLEmenu(); b=false; break;
		 default:  System.out.print("Please enter valid option:");
		 }
	 }while(b==true); 
	
}
		public static void ONEPLUSmenu()
		{ System.out.println(RESET);
					 System.out.println("\t\t\t\t\t\t"+"                      ONEPLUS                      ");  
					 System.out.println("\t\t\t\t\t\t"+"                      -------------                      ");  
					 System.out.println("\t\t\t\t\t\t"+"                      1.Above 40k                  ");
					 System.out.println("\t\t\t\t\t\t"+"                      2.EXIT                             ");
					 System.out.println(RESET); ONEPLUS();	 
				}
				public static void ONEPLUS()
				{
				System.out.print("PLEASE ENTER THE PRICE RANGE :");
				do
				{
				int p=sc.nextInt();
				switch(p) 
				{
			    case 1:ONEPLUSabove40k();b=false; break;
				case 2: display();b=false; break;
				default:
				{
					System.out.print("Please enter valid option:");
					ONEPLUSmenu();
				}
				}
				}while(b==true);
				}
				public static void ONEPLUSabove40k()
				{ System.out.println(RESET);
					 System.out.println("\t\t"+" ____________________________________________________________________________________________________");  
					 System.out.println("\t\t"+"|                                                                                                    |");  
					 System.out.println("\t\t"+"|          _____________________________                ________________                             |");  
					 System.out.println("\t\t"+"|         |        ONEPLUS PAD          |              |                |                            |");  
					 System.out.println("\t\t"+"|         |-----------------------------|              |                |                            |");  
					 System.out.println("\t\t"+"|         |.Battery : 8000mAh           |              |                |                            |");  
					 System.out.println("\t\t"+"|         |.Wifi-only-Tablet            |              |      EXIT      |                            |");  
					 System.out.println("\t\t"+"|         |.Screen Resolution:          |              |     ------     |                            |");  
					 System.out.println("\t\t"+"|         |          29.05cm(11.7inch)  |              |                |                            |");  
					 System.out.println("\t\t"+"|         |.RAM : 8GB /ROM : 128 GB     |              |                |                            |");  
					 System.out.println("\t\t"+"|         |.camera : 48mp, LED          |              |                |                            |");  
					 System.out.println("\t\t"+"|         |.Price : 45,000/-            |              |                |                            |");  
					 System.out.println("\t\t"+"|         |_____________________________|              |________________|                            |");   
					 System.out.println("\t\t"+"|                                                                                                    |");  
					 System.out.println("\t\t"+"|                      1.                                      2.                                    |");  
					 System.out.println("\t\t"+"|                                                                                                    |");  
					 System.out.println("\t\t"+"|____________________________________________________________________________________________________|"); 
	    			
	    			System.out.println("OOPS WE ONLY HAVE ONE MODEL FOR ONEPLUS TAB");
	    			 System.out.println(RESET);
	    			OneplusSwitch();
				}
				
				public static void OneplusSwitch()
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
								 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="ONEPLUS PAD"; ob1[i++]=45000;
								 System.out.print("Do you want to continue shopping in this Budget (Above 40k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
								 do
								 {
									 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c1)	
									 {
									 case 'y':ONEPLUSabove40k(); b=false; break; // MADE CHANGES HEREE
									 case 'n':ONEPLUSmenu(); b=false; break; // MADE CHANGES HEREE
									 default : System.out.print("Please enter valid option: ");
									 }
								 }while(b==true);  break;
								 case 'n':
								 {
									 System.out.print("Do you want to see another model in this Budget (Above 40k) [y/n or Y/N]:");  //MADE CHANGES HERE
									 do
									 {
										 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
										 switch(c1)	
										 {
										 case 'y':ONEPLUSabove40k(); b=false; break; //MADE CHANGES HERE
										 case 'n':
										 {
											 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
											 do 
											 {
												 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
												 switch(c2)
												 {
												 case 'y': ONEPLUSmenu(); b=false; break;
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
				 case 2:  display(); b=false; break;
				 default:  System.out.print("Please enter valid option:");
				 }
			 }while(b==true); 
			
		}
				public static void  REALMEmenu()
				{
					 System.out.println(RESET);
						 System.out.println("\t\t\t\t\t\t"+"                        REALME                       ");  
						 System.out.println("\t\t\t\t\t\t"+"                      -------------                      ");  
						 System.out.println("\t\t\t\t\t\t"+"                      1. REALME 15k-30k              "); 
						 System.out.println("\t\t\t\t\t\t"+"                      2. EXIT                             ");
						 System.out.println(RESET); REALME();
					}
					public static void  REALME()
					{
					System.out.print("PLEASE ENTER THE PRICE RANGE  ");
					do
					{
					int p=sc.nextInt();
					switch(p) 
					{
					case 1: REALME15k(); b=false; break;
					case 2: display();b=false; break;
					default:
					{
						System.out.print("Please enter valid option:");
						REALMEmenu();
					}
					}
					}while(b==true);
					}
				
					public static void REALME15k()
					{
						 System.out.println(RESET);
						 System.out.println("\t\t"+" _________________________________________________________________________________________________________________________________");  
						 System.out.println("\t\t"+"|                                                                                                                                 |");  
						 System.out.println("\t\t"+"|    ____________________     ____________________     ____________________     ____________________     ____________________     |");  
						 System.out.println("\t\t"+"|   |     REALME PRO     |   |    REALME 10 5G    |   |     REALME 5G      |   |  REALME PRO PLUS   |   |   REALME PRO 5G    |    |");  
						 System.out.println("\t\t"+"|   |--------------------|   |--------------------|   |--------------------|   |--------------------|   |--------------------|    |");  
						 System.out.println("\t\t"+"|   |.Battery : 7040mAh  |   |.Battery : 8000mAh  |   |.Battery : 8000mAh  |   |.Battery : 7050mAh  |   |.Battery : 7040mAh  |    |");  
						 System.out.println("\t\t"+"|   |.Wifi +4G Tablet    |   |.Wifi +4G Tablet    |   |.Wifi +4G Tablet    |   |.Wifi +4G Tablet    |   |.Wifi +4G Tablet    |    |");  
						 System.out.println("\t\t"+"|   |.Screen Resolution: |   |.Screen Resolution: |   |.Screen Resolution: |   |.Screen Resolution: |   |.Screen Resolution: |    |");  
						 System.out.println("\t\t"+"|   |    22.05cm(8.7inch)|   |    22.05cm(8.7inch)|   |    22.05cm(8.7inch)|   |    22.05cm(8.7inch)|   |.   22.05cm(8.7inch)|    |");  
						 System.out.println("\t\t"+"|   |.RAM : 4GB          |   |.RAM : 4GB          |   |.RAM : 4GB          |   |.RAM : 4GB          |   |.RAM : 4GB          |    |");  
						 System.out.println("\t\t"+"|   |.ROM:32GB Expandable|   |.ROM:64GB Expandable|   |.ROM:64GB Expandable|   |.ROM:64GB Expandable|   |.ROM:64GB Expandable|    |");  
						 System.out.println("\t\t"+"|   |.Price : 18,900/-   |   |.Price : 22,000/-   |   |.Price : 18,000/-   |   |.Price : 23,500/-   |   |.Price : 25,000/-   |    |");  
						 System.out.println("\t\t"+"|   |____________________|   |____________________|   |____________________|   |____________________|   |____________________|    |");  
						 System.out.println("\t\t"+"|                                                                                                                                 |");  
						 System.out.println("\t\t"+"|             1.                      2.                       3.                       4.                         5.             |");  
						 System.out.println("\t\t"+"|                                                                                                                                 |");  
						 System.out.println("\t\t"+"|                                                       ___________________                                                       |");  
						 System.out.println("\t\t"+"|                                                      |                   |                                                      |");  
						 System.out.println("\t\t"+"|                                                      |                   |                                                      |");  
						 System.out.println("\t\t"+"|                                                      |                   |                                                      |");  
						 System.out.println("\t\t"+"|                                                      |        EXIT       |                                                      |");  
						 System.out.println("\t\t"+"|                                                      |                   |                                                      |");  
						 System.out.println("\t\t"+"|                                                      |       ------      |                                                      |");  
						 System.out.println("\t\t"+"|                                                      |                   |                                                      |");  
						 System.out.println("\t\t"+"|                                                      |                   |                                                      |");  
						 System.out.println("\t\t"+"|                                                      |                   |                                                      |");  
						 System.out.println("\t\t"+"|                                                      |___________________|                                                      |");  
						 System.out.println("\t\t"+"|                                                                                                                                 |");    
						 System.out.println("\t\t"+"|                                                               6.                                                                |");    
						 System.out.println("\t\t"+"|_________________________________________________________________________________________________________________________________|");
						 
						 System.out.println(RESET); realmeswitch1();	
						
						
					}
					public static void realmeswitch1()
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
									 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="REALME PRO"; ob1[i++]=18900;
									 System.out.print("Do you want to continue shopping in this Budget (Between 15k-30k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
									 do
									 {
										 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
										 switch(c1)	
										 {
										 case 'y':REALME15k(); b=false; break; // MADE CHANGES HEREE
										 case 'n':REALMEmenu(); b=false; break; // MADE CHANGES HEREE
										 default : System.out.print("Please enter valid option: ");
										 }
									 }while(b==true);  break;
									 case 'n':
									 {
										 System.out.print("Do you want to see another model in this Budget (Between 15k-30k) [y/n or Y/N]:");  //MADE CHANGES HERE
										 do
										 {
											 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
											 switch(c1)	
											 {
											 case 'y':REALME15k(); b=false; break; //MADE CHANGES HERE
											 case 'n':
											 {
												 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
												 do 
												 {
													 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
													 switch(c2)
													 {
													 case 'y': REALMEmenu(); b=false; break;
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
								 System.out.print("Do you want to add it to cart [y/n or Y/N]:"); //MADE CHANGES
								 do
								 {
									 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c)
									 {
									 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="REALME 10 5G"; ob1[i++]=22000;
									 System.out.print("Do you want to continue shopping in this Budget (Between 15k-30k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
									 do
									 {
										 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
										 switch(c1)	
										 {
										 case 'y':REALME15k(); b=false; break; // MADE CHANGES HEREE
										 case 'n':REALMEmenu(); b=false; break; // MADE CHANGES HEREE
										 default : System.out.print("Please enter valid option: ");
										 }
									 }while(b==true);  break;
									 case 'n':
									 {
										 System.out.print("Do you want to see another model in this Budget (Between 15k-30k) [y/n or Y/N]:");  //MADE CHANGES HERE
										 do
										 {
											 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
											 switch(c1)	
											 {
											 case 'y':REALME15k(); b=false; break; //MADE CHANGES HERE
											 case 'n':
											 {
												 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
												 do 
												 {
													 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
													 switch(c2)
													 {
													 case 'y': REALMEmenu(); b=false; break;
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
								 System.out.print("Do you want to add it to cart [y/n or Y/N]:"); //MADE CHANGES
								 do
								 {
									 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c)
									 {
									 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="REALME 5G"; ob1[i++]=18000;
									 System.out.print("Do you want to continue shopping in this Budget (Between 15k-30k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
									 do
									 {
										 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
										 switch(c1)	
										 {
										 case 'y':REALME15k(); b=false; break; // MADE CHANGES HEREE
										 case 'n':REALMEmenu(); b=false; break; // MADE CHANGES HEREE
										 default : System.out.print("Please enter valid option: ");
										 }
									 }while(b==true);  break;
									 case 'n':
									 {
										 System.out.print("Do you want to see another model in this Budget (Between 15k-30k) [y/n or Y/N]:");  //MADE CHANGES HERE
										 do
										 {
											 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
											 switch(c1)	
											 {
											 case 'y':REALME15k(); b=false; break; //MADE CHANGES HERE
											 case 'n':
											 {
												 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
												 do 
												 {
													 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
													 switch(c2)
													 {
													 case 'y': REALMEmenu(); b=false; break;
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
								 System.out.print("Do you want to add it to cart [y/n or Y/N]:"); //MADE CHANGES
								 do
								 {
									 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c)
									 {
									 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="REALME PRO PLUS"; ob1[i++]=23500;
									 System.out.print("Do you want to continue shopping in this Budget (Between 15k-30k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
									 do
									 {
										 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
										 switch(c1)	
										 {
										 case 'y':REALME15k(); b=false; break; // MADE CHANGES HEREE
										 case 'n':REALMEmenu(); b=false; break; // MADE CHANGES HEREE
										 default : System.out.print("Please enter valid option: ");
										 }
									 }while(b==true);  break;
									 case 'n':
									 {
										 System.out.print("Do you want to see another model in this Budget (Between 15k-30k) [y/n or Y/N]:");  //MADE CHANGES HERE
										 do
										 {
											 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
											 switch(c1)	
											 {
											 case 'y':REALME15k(); b=false; break; //MADE CHANGES HERE
											 case 'n':
											 {
												 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
												 do 
												 {
													 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
													 switch(c2)
													 {
													 case 'y': REALMEmenu(); b=false; break;
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
								 System.out.print("Do you want to add it to cart [y/n or Y/N]:"); //MADE CHANGES
								 do
								 {
									 char c=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									 switch(c)
									 {
									 case 'y':System.out.println("Your Item is added to cart ."); ob[i]="REALME PRO 5G"; ob1[i++]=25000;
									 System.out.print("Do you want to continue shopping in this Budget (Between 15k-30k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
									 do
									 {
										 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
										 switch(c1)	
										 {
										 case 'y':REALME15k(); b=false; break; // MADE CHANGES HEREE
										 case 'n':REALMEmenu(); b=false; break; // MADE CHANGES HEREE
										 default : System.out.print("Please enter valid option: ");
										 }
									 }while(b==true);  break;
									 case 'n':
									 {
										 System.out.print("Do you want to see another model in this Budget (Between 15k-30k) [y/n or Y/N]:");  //MADE CHANGES HERE
										 do
										 {
											 char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
											 switch(c1)	
											 {
											 case 'y':REALME15k(); b=false; break; //MADE CHANGES HERE
											 case 'n':
											 {
												 System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
												 do 
												 {
													 char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
													 switch(c2)
													 {
													 case 'y': REALMEmenu(); b=false; break;
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
					 case 6:  REALMEmenu(); b=false; break;
					 default:  System.out.print("Please enter valid option:");
					 }
				 }while(b==true); 
				}
//				public static void main(String []args)
//				{
//					display();
//				}
	}
