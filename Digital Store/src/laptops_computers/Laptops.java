package laptops_computers;

import java.util.Scanner;

import home_screen.Main_Home;

public class Laptops 
{
	public 	static String ob[]=new String[100];
	public static float ob1[]=new float[100];static int i=0;
			static Scanner sc  = new Scanner(System.in); private static final String RESET = "\033[0m";  // Text Reset
			static boolean b=true;
		//=================================================================================================================================	
			public static void laptop()
			{ System.out.println(RESET);
				System.out.println("\t"+"\t\t\t\t"+"         @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
						+"\t"+"\t\t\t\t"+ "         @@                                                      @@\r\n"
						+"\t"+"\t\t\t\t"+ "         @@                   * LAPTOPS *                        @@\r\n"
						+"\t"+"\t\t\t\t"+ "         @@                 ---------------                      @@\r\n"
						+"\t"+"\t\t\t\t"+ "         @@                    1. HP                             @@\r\n"
						+"\t"+"\t\t\t\t"+ "         @@                    2. DELL                           @@\r\n"
						+"\t"+"\t\t\t\t"+ "         @@                    3. LENOVO                         @@\r\n"
						+"\t"+"\t\t\t\t"+ "         @@                    4. APPLE                          @@\r\n"
						+"\t"+"\t\t\t\t"+ "         @@                    5. ASUS                           @@\r\n"
						+"\t"+"\t\t\t\t"+ "         @@                    6. EXIT                           @@\r\n"
						+"\t"+"\t\t\t\t"+ "         @@                   FROM LAPTOPS                       @@\r\n"
						+"\t"+"\t\t\t\t"+ "         @@                                                      @@\r\n"
						+"\t"+"\t\t\t\t"+ "         @@                                                      @@\r\n"
						+"\t"+"\t\t\t\t"+ "         @@                                                      @@\r\n"
						+"\t"+"\t\t\t\t"+ "         @@                                                      @@\r\n"
						+"\t"+"\t\t\t\t"+ "         @@                                                      @@\r\n"
						+"\t"+"\t\t\t\t"+ "         @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
						+"\t"+"\t\t\t\t"+ "         @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
						+"\t"+"\t\t\t\t"+ "         @@  [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] @@\r\n"
						+"\t"+"\t\t\t\t"+ "        @@@  [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] @@@\r\n"
						+"\t"+"\t\t\t\t"+ "       @@@@  [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] @@@@\r\n"
						+"\t"+"\t\t\t\t"+ "      @@@@@  [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] @@@@@  \r\n"
						+"\t"+"\t\t\t\t"+ "     @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
						+"\t"+"\t\t\t\t"+ "    @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
						+"\t"+"\t\t\t\t"+ "   @@@@@@@@@@@@@@@@@@@@@@@@@@                 @@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
						+"\t"+"\t\t\t\t"+ "  @@@@@@@@@@@@@@@@@@@@@@@@@@@                 @@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
						+"\t"+"\t\t\t\t"+ " @@@@@@@@@@@@@@@@@@@@@@@@@@@@_________________@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
						+"\t"+"\t\t\t\t"+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@|________|________|@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
						+"\t"+"\t\t\t\t"+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n");
				 System.out.println(RESET);purchase();
			}
		//=================================================================================================================================	
			public static void purchase()
			{
				System.out.print("PLEASE SELECT YOUR PREFERRED BRAND[1-6] : ");
				boolean b=true;
				do
				{
					int c=sc.nextInt();
					switch(c)
					{
					case 1:hpmenu(); b=false; break;
					case 2:dellmenu(); b=false; break;
					case 3:lenovomenu();  b=false; break;
					case 4:applemenu();  b=false;  break;
					case 5:asusmenu();  b=false;  break;
					case 6:Main_Home.laptops$Monitors(); b=false; break;
					default: 
						{
							System.out.println();
							System.out.print("\t\t\t\t\t\t\t\t     "+"PLEASE ENTER VALID OPTION..."+"\n");
							System.out.println();
					        laptop();
						}
					}
				}while(b==true);
			}
		//=================================================================================================================================	
			public static void hpmenu()
			{ System.out.println(RESET);
				 System.out.println("\t\t\t\t\t\t"+"                              HP                            ");  
				 System.out.println("\t\t\t\t\t\t"+"                      -------------------                      ");  
				 System.out.println("\t\t\t\t\t\t"+"                      1.Between 30k - 50k                         ");  
				 System.out.println("\t\t\t\t\t\t"+"                      2.Between 50k - 80k                    ");
				 System.out.println("\t\t\t\t\t\t"+"                      3.EXIT FROM HP                            ");
				 System.out.println(RESET); hpswitch();
			}
		//=================================================================================================================================	
			public static void hpswitch()
			{
				System.out.print("PLEASE ENTER THE PRICE RANGE  :");
				 
				 do
				 {
					int p=sc.nextInt();
					switch(p) 
					{
					case 1: hp30k50k(); b=false; break;
					case 2: hp50k80k(); b=false; break;
					case 3: laptop();b=false; break;
				    default:
				    	{
				    		System.out.println("Please enter valid option.");
				    		hpmenu(); 
				    	}
					}
				 }while(b==true);
			}
		//=================================================================================================================================	
			public static void hp30k50k()
			{ System.out.println(RESET);
				System.out.println("\t   "+" ____________________________________________________________________________________________________________________________________");  
				 System.out.println("\t   "+"|                                                                                                                                    |");  
				 System.out.println("\t   "+"|          _______________________________         _______________________________         _______________________________           |");  
				 System.out.println("\t   "+"|         |    HP 14S-DR3001TU LAPTOP     |       |    HP 15S-FR2514TU LAPTOP     |       |    HP 14S-ER0503TU LAPTOP     |          |");  
				 System.out.println("\t   "+"|         |-------------------------------|       |-------------------------------|       |-------------------------------|          |");  
				 System.out.println("\t   "+"|         |.11th Gen Intel Core i5-1135G7 |       |.AMD Ryzen5 5600H Mobile       |       |.10th Gen Intel Core i5-10300H |          |");  
				 System.out.println("\t   "+"|         |.8GB/512GB SSD Plus 32 GB      |       |          obile Processor      |       |.16GB/512GB SSD/Full HD        |          |");  
				 System.out.println("\t   "+"|         |.Free upgrade to Windows 11*   |       |.RAM : 16GB /35.56cm(14 inch)  |       |.4GB Nvidia GeForce GTX 1650   |          |");  
				 System.out.println("\t   "+"|         |.RAM : 8GB                     |       |.Internal Storage : 512GB      |       |  Graphics/Windows 11          |          |");  
				 System.out.println("\t   "+"|         |.Internal Storage : 512GB+32GB |       |.Storage Type : SSD            |       |.10th Gen Intel Core i5-10300H |          |");  
				 System.out.println("\t   "+"|         |.1Year Manufacturer Warranty   |       |.16GB/512GB/Windows 11/MSO/OLED|       |.RAM :16GB/ IS : 512GB         |          |");  
				 System.out.println("\t   "+"|         |.PRICE  :  34,990.00/-         |       |. PRICE  :  36,450.00/-        |       |.  PRICE  : 48,990.00/-        |          |");  
				 System.out.println("\t   "+"|         |_______________________________|       |_______________________________|       |_______________________________|          |");  
				 System.out.println("\t   "+"|                                                                                                                                    |");  
				 System.out.println("\t   "+"|                       1.                                          2.                                       3.                      |");  
				 System.out.println("\t   "+"|                                                                                                                                    |");  
				 System.out.println("\t   "+"|                                                                                                                                    |");  
				 System.out.println("\t   "+"|          _______________________________         _______________________________         _______________________________           |");  
				 System.out.println("\t   "+"|         |    HP 14S-EF1002TU LAPTOP     |       |    HP 14S-DR2512TU LAPTOP     |       |                               |          |");  
				 System.out.println("\t   "+"|         |-------------------------------|       |-------------------------------|       |                               |          |");  
				 System.out.println("\t   "+"|         |.G14 Gaming Laptop(AMD Ryzen 7)|       |.Processor:10th Gen Intel core |       |                               |          |");  
				 System.out.println("\t   "+"|         |.R7-4800HS/8GB/1TB SSD/MSO/WQHD|       |  i5-10300H 39.62cm(15.6 inch) |       |             EXIT              |          |");  
				 System.out.println("\t   "+"|         |.4GB Nvidia GeForce GTX 1650   |       |.RAM :8GB/Internal Storage:1TB |       |            ------             |          |");  
				 System.out.println("\t   "+"|         |.RAM :8GB/Internal Storage:1TB |       |.Storage Type : SSD/RAM :16GB  |       |                               |          |");  
				 System.out.println("\t   "+"|         |.29.46 cm(14 inch)/Windows 10  |       |.16GB/512GB/Windows 11/MSO/OLED|       |                               |          |");  
				 System.out.println("\t   "+"|         |.Processor:AMD Ryzen7-R7 4800HS|       |.Internal Storage : 512GB      |       |                               |          |");  
				 System.out.println("\t   "+"|         |.  PRICE  :  43,450.00/-       |       |. PRICE  :  37,590.00/-        |       |                               |          |");  
				 System.out.println("\t   "+"|         |_______________________________|       |_______________________________|       |_______________________________|          |");
				 System.out.println("\t   "+"|                                                                                                                                    |");  
				 System.out.println("\t   "+"|                     4.                                        5.                                       6.                          |");  
				 System.out.println("\t   "+"|                                                                                                                                    |");  	 
				 System.out.println("\t   "+"|____________________________________________________________________________________________________________________________________|");  
				 
				 System.out.println(RESET); hp30k50kswitch(); 
			}
		//=================================================================================================================================	
			public static void hp30k50kswitch()
			{
				System.out.println("PLEASE CHOOSE YOUR PREFERRED MODEL :");
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
								 case 'y':System.out.println("Your Item is added to cart .");ob[i]="HP 14S-DR3001TU LAPTOP";ob1[i++]= 34990; 
								          System.out.print("Do you want to continue shopping in this Budget (Between 30k - 50k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
						 		  do
						 		  {
						 			char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
						 			switch(c1)	
									{
									case 'y':hp30k50k(); b=false; break; // MADE CHANGES HEREE
									case 'n':hpmenu(); b=false; break; // MADE CHANGES HEREE
						 			default : System.out.print("Please enter valid option: ");
									}
						 		  }while(b==true);  break;
								 case 'n':
									 {
										 System.out.print("Do you want to see another model in this Budget (Between 30k - 50k) [y/n or Y/N]:");  //MADE CHANGES HERE
											do
											{
												char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
											switch(c1)	
											{
											case 'y':hp30k50k(); b=false; break;
											case 'n':
												{
													System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
													do 
													{
														char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
														switch(c2)
														{
														case 'y': hpmenu(); b=false; break;
														case 'n': laptop(); b=false; break;
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
							   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="HP 15S-FR2514TU LAPTOP";ob1[i++]=36450;
							   System.out.print("Do you want to continue shopping in this Budget (Between 30k - 50k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
							   do
							   {
								   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								   switch(c1)	
								   {
								   case 'y':hp30k50k(); b=false; break; // MADE CHANGES HEREE
								   case 'n':hpmenu(); b=false; break; // MADE CHANGES HEREE
								   default : System.out.print("Please enter valid option: ");
								   }
							   }while(b==true);  break;
							   case 'n':
							   {
								   System.out.print("Do you want to see another model in this Budget (Between 30k - 50k) [y/n or Y/N]:");  //MADE CHANGES HERE
								   do
								   {
									   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c1)	
									   {
									   case 'y':hp30k50k(); b=false; break;
									   case 'n':
									   {
										   System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
										   do 
										   {
											   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
											   switch(c2)
											   {
											   case 'y': hpmenu(); b=false; break;
											   case 'n': laptop(); b=false; break;
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
							   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="HP 14S-ER0503TU LAPTOP";ob1[i++]=48990;
							   System.out.print("Do you want to continue shopping in this Budget (Between 30k - 50k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
							   do
							   {
								   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								   switch(c1)	
								   {
								   case 'y':hp30k50k(); b=false; break; // MADE CHANGES HEREE
								   case 'n':hpmenu(); b=false; break; // MADE CHANGES HEREE
								   default : System.out.print("Please enter valid option: ");
								   }
							   }while(b==true);  break;
							   case 'n':
							   {
								   System.out.print("Do you want to see another model in this Budget (Between 30k - 50k) [y/n or Y/N]:");  //MADE CHANGES HERE
								   do
								   {
									   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c1)	
									   {
									   case 'y':hp30k50k(); b=false; break;
									   case 'n':
									   {
										   System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
										   do 
										   {
											   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
											   switch(c2)
											   {
											   case 'y': hpmenu(); b=false; break;
											   case 'n': laptop(); b=false; break;
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
							   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="HP 14S-EF1002TU LAPTOP";ob1[i++]=43550;
							   System.out.print("Do you want to continue shopping in this Budget (Between 30k - 50k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
							   do
							   {
								   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								   switch(c1)	
								   {
								   case 'y':hp30k50k(); b=false; break; // MADE CHANGES HEREE
								   case 'n':hpmenu(); b=false; break; // MADE CHANGES HEREE
								   default : System.out.print("Please enter valid option: ");
								   }
							   }while(b==true);  break;
							   case 'n':
							   {
								   System.out.print("Do you want to see another model in this Budget (Between 30k - 50k) [y/n or Y/N]:");  //MADE CHANGES HERE
								   do
								   {
									   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c1)	
									   {
									   case 'y':hp30k50k(); b=false; break;
									   case 'n':
									   {
										   System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
										   do 
										   {
											   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
											   switch(c2)
											   {
											   case 'y': hpmenu(); b=false; break;
											   case 'n': laptop(); b=false; break;
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
							   case 'y':System.out.println("Your Item is added to cart .");ob[i]="HP 14S-DR2512TU LAPTOP";ob1[i++]=37590; 
							   System.out.print("Do you want to continue shopping in this Budget (Between 30k - 50k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
							   do
							   {
								   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								   switch(c1)	
								   {
								   case 'y':hp30k50k(); b=false; break; // MADE CHANGES HEREE
								   case 'n':hpmenu(); b=false; break; // MADE CHANGES HEREE
								   default : System.out.print("Please enter valid option: ");
								   }
							   }while(b==true);  break;
							   case 'n':
							   {
								   System.out.print("Do you want to see another model in this Budget (Between 30k - 50k) [y/n or Y/N]:");  //MADE CHANGES HERE
								   do
								   {
									   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c1)	
									   {
									   case 'y':hp30k50k(); b=false; break;
									   case 'n':
									   {
										   System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
										   do 
										   {
											   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
											   switch(c2)
											   {
											   case 'y': hpmenu(); b=false; break;
											   case 'n': laptop(); b=false; break;
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
					   case 6:hpmenu(); b=false; break;// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
					   default: System.out.print("PLEASE ENTER VALID OPTION: ");
					   }
				   }while(b==true); 
			}
		//=================================================================================================================================	
			public static void hp50k80k()
			{ System.out.println(RESET);
				System.out.println("\t   "+" ____________________________________________________________________________________________________________________________________");  
				 System.out.println("\t   "+"|                                                                                                                                    |");  
				 System.out.println("\t   "+"|          _______________________________         _______________________________         _______________________________           |");  
				 System.out.println("\t   "+"|         |    HP 13AY1059AU ENVY X360    |       |    HP 13-AY0045AU ENVY X360   |       | HP 13-BE0206AU PAVILION AERO  |          |");  
				 System.out.println("\t   "+"|         |-------------------------------|       |-------------------------------|       |-------------------------------|          |");  
				 System.out.println("\t   "+"|         |.11th Gen Intel Core i5-1135G7 |       |.AMD Ryzen5 5600H Mobile       |       |.10th Gen Intel Core i5-10300H |          |");  
				 System.out.println("\t   "+"|         |.8GB/512GB SSD Plus 32 GB      |       |          obile Processor      |       |.16GB/512GB SSD/Full HD        |          |");  
				 System.out.println("\t   "+"|         |.Free upgrade to Windows 11*   |       |.RAM : 16GB /35.56cm(14 inch)  |       |.4GB Nvidia GeForce GTX 1650   |          |");  
				 System.out.println("\t   "+"|         |.RAM : 8GB                     |       |.Internal Storage : 512GB      |       |  Graphics/Windows 11          |          |");  
				 System.out.println("\t   "+"|         |.Internal Storage : 512GB+32GB |       |.Storage Type : SSD            |       |.10th Gen Intel Core i5-10300H |          |");  
				 System.out.println("\t   "+"|         |.1Year Manufacturer Warranty   |       |.16GB/512GB/Windows 11/MSO/OLED|       |.RAM :16GB/ IS : 512GB         |          |");  
				 System.out.println("\t   "+"|         |.PRICE  :  72,999.00/-         |       |. PRICE  :  75,999.00/-        |       |.  PRICE  : 67,490.00/-        |          |");  
				 System.out.println("\t   "+"|         |_______________________________|       |_______________________________|       |_______________________________|          |");  
				 System.out.println("\t   "+"|                                                                                                                                    |");  
				 System.out.println("\t   "+"|                       1.                                          2.                                       3.                      |");  
				 System.out.println("\t   "+"|                                                                                                                                    |");  
				 System.out.println("\t   "+"|                                                                                                                                    |");  
				 System.out.println("\t   "+"|          _______________________________         _______________________________         _______________________________           |");  
				 System.out.println("\t   "+"|         |     HP 4S-FQ1083AU LAPTOP     |       |    HP 15-EG1000TU PAVILION    |       |                               |          |");  
				 System.out.println("\t   "+"|         |-------------------------------|       |-------------------------------|       |                               |          |");  
				 System.out.println("\t   "+"|         |.G14 Gaming Laptop(AMD Ryzen 7)|       |.Processor:10th Gen Intel core |       |                               |          |");  
				 System.out.println("\t   "+"|         |.R7-4800HS/8GB/1TB SSD/MSO/WQHD|       |  i5-10300H 39.62cm(15.6 inch) |       |             EXIT              |          |");  
				 System.out.println("\t   "+"|         |.4GB Nvidia GeForce GTX 1650   |       |.RAM :8GB/Internal Storage:1TB |       |            ------             |          |");  
				 System.out.println("\t   "+"|         |.RAM :8GB/Internal Storage:1TB |       |.Storage Type : SSD/RAM :16GB  |       |                               |          |");  
				 System.out.println("\t   "+"|         |.29.46 cm(14 inch)/Windows 10  |       |.16GB/512GB/Windows 11/MSO/OLED|       |                               |          |");  
				 System.out.println("\t   "+"|         |.Processor:AMD Ryzen7-R7 4800HS|       |.Internal Storage : 512GB      |       |                               |          |");  
				 System.out.println("\t   "+"|         |.  PRICE  :  57,499.00/-       |       |. PRICE  :  61,590.00/-        |       |                               |          |");  
				 System.out.println("\t   "+"|         |_______________________________|       |_______________________________|       |_______________________________|          |");
				 System.out.println("\t   "+"|                                                                                                                                    |");  
				 System.out.println("\t   "+"|                     4.                                        5.                                       6.                          |");  
				 System.out.println("\t   "+"|                                                                                                                                    |");  	 
				 System.out.println("\t   "+"|____________________________________________________________________________________________________________________________________|");  
				 
				 System.out.println(RESET);hp50k80kswitch(); 
				
			}
		//=================================================================================================================================	
			public static void hp50k80kswitch()
			{
				System.out.println("PLEASE CHOOSE YOUR PREFERRED MODEL :");
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
							   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="HP 13AY1059AU ENVY X360";ob1[i++]=72999;
							   System.out.print("Do you want to continue shopping in this Budget (Between 50k - 80k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
							   do
							   {
								   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								   switch(c1)	
								   {
								   case 'y':hp50k80k(); b=false; break; // MADE CHANGES HEREE
								   case 'n':hpmenu(); b=false; break; // MADE CHANGES HEREE
								   default : System.out.print("Please enter valid option: ");
								   }
							   }while(b==true);  break;
							   case 'n':
							   {
								   System.out.print("Do you want to see another model in this Budget (Between 50k - 80k) [y/n or Y/N]:");  //MADE CHANGES HERE
								   do
								   {
									   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c1)	
									   {
									   case 'y':hp50k80k(); b=false; break;
									   case 'n':
									   {
										   System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
										   do 
										   {
											   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
											   switch(c2)
											   {
											   case 'y': hpmenu(); b=false; break;
											   case 'n': laptop(); b=false; break;
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
							   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="HP 13-AY0045AU ENVY X360";ob1[i++]=75999;
							   System.out.print("Do you want to continue shopping in this Budget (Between 50k - 80k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
							   do
							   {
								   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								   switch(c1)	
								   {
								   case 'y':hp50k80k(); b=false; break; // MADE CHANGES HEREE
								   case 'n':hpmenu(); b=false; break; // MADE CHANGES HEREE
								   default : System.out.print("Please enter valid option: ");
								   }
							   }while(b==true);  break;
							   case 'n':
							   {
								   System.out.print("Do you want to see another model in this Budget (Between 50k - 80k) [y/n or Y/N]:");  //MADE CHANGES HERE
								   do
								   {
									   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c1)	
									   {
									   case 'y':hp50k80k(); b=false; break;
									   case 'n':
									   {
										   System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
										   do 
										   {
											   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
											   switch(c2)
											   {
											   case 'y': hpmenu(); b=false; break;
											   case 'n': laptop(); b=false; break;
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
							   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="HP 13-BE0206AU PAVILION AERO";ob1[i++]=67490;
							   System.out.print("Do you want to continue shopping in this Budget (Between 50k - 80k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
							   do
							   {
								   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								   switch(c1)	
								   {
								   case 'y':hp50k80k(); b=false; break; // MADE CHANGES HEREE
								   case 'n':hpmenu(); b=false; break; // MADE CHANGES HEREE
								   default : System.out.print("Please enter valid option: ");
								   }
							   }while(b==true);  break;
							   case 'n':
							   {
								   System.out.print("Do you want to see another model in this Budget (Between 50k - 80k) [y/n or Y/N]:");  //MADE CHANGES HERE
								   do
								   {
									   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c1)	
									   {
									   case 'y':hp50k80k(); b=false; break;
									   case 'n':
									   {
										   System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
										   do 
										   {
											   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
											   switch(c2)
											   {
											   case 'y': hpmenu(); b=false; break;
											   case 'n': laptop(); b=false; break;
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
							   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="HP 4S-FQ1083AU LAPTOP";ob1[i++]=57499;
							   System.out.print("Do you want to continue shopping in this Budget (Between 50k - 80k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
							   do
							   {
								   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								   switch(c1)	
								   {
								   case 'y':hp50k80k(); b=false; break; // MADE CHANGES HEREE
								   case 'n':hpmenu(); b=false; break; // MADE CHANGES HEREE
								   default : System.out.print("Please enter valid option: ");
								   }
							   }while(b==true);  break;
							   case 'n':
							   {
								   System.out.print("Do you want to see another model in this Budget (Between 50k - 80k) [y/n or Y/N]:");  //MADE CHANGES HERE
								   do
								   {
									   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c1)	
									   {
									   case 'y':hp50k80k(); b=false; break;
									   case 'n':
									   {
										   System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
										   do 
										   {
											   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
											   switch(c2)
											   {
											   case 'y': hpmenu(); b=false; break;
											   case 'n': laptop(); b=false; break;
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
							   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="HP 15-EG1000TU PAVILION";ob1[i++]=61590;
							   System.out.print("Do you want to continue shopping in this Budget (Between 50k - 80k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
							   do
							   {
								   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								   switch(c1)	
								   {
								   case 'y':hp50k80k(); b=false; break; // MADE CHANGES HEREE
								   case 'n':hpmenu(); b=false; break; // MADE CHANGES HEREE
								   default : System.out.print("Please enter valid option: ");
								   }
							   }while(b==true);  break;
							   case 'n':
							   {
								   System.out.print("Do you want to see another model in this Budget (Between 50k - 80k) [y/n or Y/N]:");  //MADE CHANGES HERE
								   do
								   {
									   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c1)	
									   {
									   case 'y':hp50k80k(); b=false; break;
									   case 'n':
									   {
										   System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
										   do 
										   {
											   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
											   switch(c2)
											   {
											   case 'y': hpmenu(); b=false; break;
											   case 'n': laptop(); b=false; break;
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
					   case 6:hpmenu(); b=false; break;// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
					   default: System.out.print("PLEASE ENTER VALID OPTION: ");
					   }
				   }while(b==true); 
			}
		//=================================================================================================================================	
			public static void dellmenu()
			{ System.out.println(RESET);
				System.out.println("\t\t\t\t\t\t"+"                              DELL                            ");  
				System.out.println("\t\t\t\t\t\t"+"                      -------------------                      ");  
				System.out.println("\t\t\t\t\t\t"+"                      1.Between 30k - 50k                         ");  
				System.out.println("\t\t\t\t\t\t"+"                      2.Between 50k - 80k                    ");
				System.out.println("\t\t\t\t\t\t"+"                      3.EXIT FROM DELL                            ");
				 System.out.println(RESET);dellswitch();
			}
		//=================================================================================================================================	
			public static void dellswitch()
			{
				System.out.print("PLEASE ENTER THE PRICE RANGE  :");
				
				do
				{
					int p=sc.nextInt();
					switch(p) 
					{
					case 1: dell30k50k(); b=false; break;
					case 2: dell50k80k(); b=false; break;
					case 3: laptop();b=false; break;
					default:
					{
						System.out.println("Please enter valid option.");
						dellmenu(); 
					}
					}
				}while(b==true);
			}
		//=================================================================================================================================	
			public static void dell30k50k()
			{ System.out.println(RESET);
				System.out.println("\t   "+" ____________________________________________________________________________________________________________________________________");  
				 System.out.println("\t   "+"|                                                                                                                                    |");  
				 System.out.println("\t   "+"|          _______________________________         _______________________________         _______________________________           |");  
				 System.out.println("\t   "+"|         |   DELL INSPIRON 3515 LAPTOP   |       |     DELL 3511 INSPIRON 15     |       |    DELL VOSTRO 3400 LAPTOP    |          |");  
				 System.out.println("\t   "+"|         |-------------------------------|       |-------------------------------|       |-------------------------------|          |");  
				 System.out.println("\t   "+"|         |.11th Gen Intel Core i5-1135G7 |       |.AMD Ryzen5 5600H Mobile       |       |.10th Gen Intel Core i5-10300H |          |");  
				 System.out.println("\t   "+"|         |.8GB/512GB SSD Plus 32 GB      |       |          obile Processor      |       |.16GB/512GB SSD/Full HD        |          |");  
				 System.out.println("\t   "+"|         |.Free upgrade to Windows 11*   |       |.RAM : 16GB /35.56cm(14 inch)  |       |.4GB Nvidia GeForce GTX 1650   |          |");  
				 System.out.println("\t   "+"|         |.RAM : 8GB                     |       |.Internal Storage : 512GB      |       |  Graphics/Windows 11          |          |");  
				 System.out.println("\t   "+"|         |.Internal Storage : 512GB+32GB |       |.Storage Type : SSD            |       |.10th Gen Intel Core i5-10300H |          |");  
				 System.out.println("\t   "+"|         |.1Year Manufacturer Warranty   |       |.16GB/512GB/Windows 11/MSO/OLED|       |.RAM :16GB/ IS : 512GB         |          |");  
				 System.out.println("\t   "+"|         |.PRICE  :  30,990.00/-         |       |. PRICE  :  33,507.00/-        |       |.  PRICE  : 47,249.00/-        |          |");  
				 System.out.println("\t   "+"|         |_______________________________|       |_______________________________|       |_______________________________|          |");  
				 System.out.println("\t   "+"|                                                                                                                                    |");  
				 System.out.println("\t   "+"|                       1.                                          2.                                       3.                      |");  
				 System.out.println("\t   "+"|                                                                                                                                    |");  
				 System.out.println("\t   "+"|                                                                                                                                    |");  
				 System.out.println("\t   "+"|          _______________________________         _______________________________         _______________________________           |");  
				 System.out.println("\t   "+"|         | DELL 5410 CONVERTIBLE LAPTOP  |       |  DELL 3515 INSPIRON 15 LAPTOP |       |                               |          |");  
				 System.out.println("\t   "+"|         |-------------------------------|       |-------------------------------|       |                               |          |");  
				 System.out.println("\t   "+"|         |.G14 Gaming Laptop(AMD Ryzen 7)|       |.Processor:10th Gen Intel core |       |                               |          |");  
				 System.out.println("\t   "+"|         |.R7-4800HS/8GB/1TB SSD/MSO/WQHD|       |  i5-10300H 39.62cm(15.6 inch) |       |             EXIT              |          |");  
				 System.out.println("\t   "+"|         |.4GB Nvidia GeForce GTX 1650   |       |.RAM :8GB/Internal Storage:1TB |       |            ------             |          |");  
				 System.out.println("\t   "+"|         |.RAM :8GB/Internal Storage:1TB |       |.Storage Type : SSD/RAM :16GB  |       |                               |          |");  
				 System.out.println("\t   "+"|         |.29.46 cm(14 inch)/Windows 10  |       |.16GB/512GB/Windows 11/MSO/OLED|       |                               |          |");  
				 System.out.println("\t   "+"|         |.Processor:AMD Ryzen7-R7 4800HS|       |.Internal Storage : 512GB      |       |                               |          |");  
				 System.out.println("\t   "+"|         |.  PRICE  :  43,318.00/-       |       |. PRICE  :  39,144.00/-        |       |                               |          |");  
				 System.out.println("\t   "+"|         |_______________________________|       |_______________________________|       |_______________________________|          |");
				 System.out.println("\t   "+"|                                                                                                                                    |");  
				 System.out.println("\t   "+"|                     4.                                        5.                                       6.                          |");  
				 System.out.println("\t   "+"|                                                                                                                                    |");  	 
				 System.out.println("\t   "+"|____________________________________________________________________________________________________________________________________|");  
				 
				 System.out.println(RESET); dell30k50kswitch();
			}
		//=================================================================================================================================	
			public static void dell30k50kswitch()
			{
				System.out.println("PLEASE CHOOSE YOUR PREFERRED MODEL :");
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
							   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="DELL INSPIRON 3515 LAPTOP";ob1[i++]=30990;
							   System.out.print("Do you want to continue shopping in this Budget (Between 30k - 50k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
							   do
							   {
								   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								   switch(c1)	
								   {
								   case 'y':dell30k50k(); b=false; break; // MADE CHANGES HEREE
								   case 'n':dellmenu(); b=false; break; // MADE CHANGES HEREE
								   default : System.out.print("Please enter valid option: ");
								   }
							   }while(b==true);  break;
							   case 'n':
							   {
								   System.out.print("Do you want to see another model in this Budget (Between 30k - 50k) [y/n or Y/N]:");  //MADE CHANGES HERE
								   do
								   {
									   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c1)	
									   {
									   case 'y':dell30k50k(); b=false; break;
									   case 'n':
									   {
										   System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
										   do 
										   {
											   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
											   switch(c2)
											   {
											   case 'y': dellmenu(); b=false; break;
											   case 'n': laptop(); b=false; break;
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
							   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="DELL 3511 INSPIRON 15";ob1[i++]=33507;
							   System.out.print("Do you want to continue shopping in this Budget (Between 30k - 50k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
							   do
							   {
								   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								   switch(c1)	
								   {
								   case 'y':dell30k50k(); b=false; break; // MADE CHANGES HEREE
								   case 'n':dellmenu(); b=false; break; // MADE CHANGES HEREE
								   default : System.out.print("Please enter valid option: ");
								   }
							   }while(b==true);  break;
							   case 'n':
							   {
								   System.out.print("Do you want to see another model in this Budget (Between 30k - 50k) [y/n or Y/N]:");  //MADE CHANGES HERE
								   do
								   {
									   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c1)	
									   {
									   case 'y':dell30k50k(); b=false; break;
									   case 'n':
									   {
										   System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
										   do 
										   {
											   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
											   switch(c2)
											   {
											   case 'y': dellmenu(); b=false; break;
											   case 'n': laptop(); b=false; break;
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
							   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="DELL VOSTRO 3400 LAPTOP";ob1[i++]=47209;
							   System.out.print("Do you want to continue shopping in this Budget (Between 30k - 50k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
							   do
							   {
								   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								   switch(c1)	
								   {
								   case 'y':dell30k50k(); b=false; break; // MADE CHANGES HEREE
								   case 'n':dellmenu(); b=false; break; // MADE CHANGES HEREE
								   default : System.out.print("Please enter valid option: ");
								   }
							   }while(b==true);  break;
							   case 'n':
							   {
								   System.out.print("Do you want to see another model in this Budget (Between 30k - 50k) [y/n or Y/N]:");  //MADE CHANGES HERE
								   do
								   {
									   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c1)	
									   {
									   case 'y':dell30k50k(); b=false; break;
									   case 'n':
									   {
										   System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
										   do 
										   {
											   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
											   switch(c2)
											   {
											   case 'y': dellmenu(); b=false; break;
											   case 'n': laptop(); b=false; break;
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
							   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="DELL 5410 CONVERTIBLE LAPTOP";ob1[i++]=43318;
							   System.out.print("Do you want to continue shopping in this Budget (Between 30k - 50k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
							   do
							   {
								   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								   switch(c1)	
								   {
								   case 'y':dell30k50k(); b=false; break; // MADE CHANGES HEREE
								   case 'n':dellmenu(); b=false; break; // MADE CHANGES HEREE
								   default : System.out.print("Please enter valid option: ");
								   }
							   }while(b==true);  break;
							   case 'n':
							   {
								   System.out.print("Do you want to see another model in this Budget (Between 30k - 50k) [y/n or Y/N]:");  //MADE CHANGES HERE
								   do
								   {
									   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c1)	
									   {
									   case 'y':dell30k50k(); b=false; break;
									   case 'n':
									   {
										   System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
										   do 
										   {
											   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
											   switch(c2)
											   {
											   case 'y': dellmenu(); b=false; break;
											   case 'n': laptop(); b=false; break;
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
							   case 'y':System.out.println("Your Item is added to cart ."); ob[i]=" DELL 3515 INSPIRON 15 LAPTOP";ob1[i++]=39144;
							   System.out.print("Do you want to continue shopping in this Budget (Between 30k - 50k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
							   do
							   {
								   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								   switch(c1)	
								   {
								   case 'y':dell30k50k(); b=false; break; // MADE CHANGES HEREE
								   case 'n':dellmenu(); b=false; break; // MADE CHANGES HEREE
								   default : System.out.print("Please enter valid option: ");
								   }
							   }while(b==true);  break;
							   case 'n':
							   {
								   System.out.print("Do you want to see another model in this Budget (Between 30k - 50k) [y/n or Y/N]:");  //MADE CHANGES HERE
								   do
								   {
									   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c1)	
									   {
									   case 'y':dell30k50k(); b=false; break;
									   case 'n':
									   {
										   System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
										   do 
										   {
											   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
											   switch(c2)
											   {
											   case 'y': dellmenu(); b=false; break;
											   case 'n': laptop(); b=false; break;
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
					   case 6:dellmenu(); b=false; break;// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
					   default: System.out.print("PLEASE ENTER VALID OPTION: ");
					   }
				   }while(b==true); 
			}
		//=================================================================================================================================	
			public static void dell50k80k()
			{ System.out.println(RESET);
				System.out.println("\t   "+" ____________________________________________________________________________________________________________________________________");  
				 System.out.println("\t   "+"|                                                                                                                                    |");  
				 System.out.println("\t   "+"|          _______________________________         _______________________________         _______________________________           |");  
				 System.out.println("\t   "+"|         |   DELL 3501 INSPIRON LAPTOP   |       |  DELL  3511 INSPIRON LAPTOP   |       |  DELL INSPIRON 15 3520 LAPTOP |          |");  
				 System.out.println("\t   "+"|         |-------------------------------|       |-------------------------------|       |-------------------------------|          |");  
				 System.out.println("\t   "+"|         |.11th Gen Intel Core i5-1135G7 |       |.AMD Ryzen5 5600H Mobile       |       |.10th Gen Intel Core i5-10300H |          |");  
				 System.out.println("\t   "+"|         |.8GB/512GB SSD Plus 32 GB      |       |          obile Processor      |       |.16GB/512GB SSD/Full HD        |          |");  
				 System.out.println("\t   "+"|         |.Free upgrade to Windows 11*   |       |.RAM : 16GB /35.56cm(14 inch)  |       |.4GB Nvidia GeForce GTX 1650   |          |");  
				 System.out.println("\t   "+"|         |.RAM : 8GB                     |       |.Internal Storage : 512GB      |       |  Graphics/Windows 11          |          |");  
				 System.out.println("\t   "+"|         |.Internal Storage : 512GB+32GB |       |.Storage Type : SSD            |       |.10th Gen Intel Core i5-10300H |          |");  
				 System.out.println("\t   "+"|         |.1Year Manufacturer Warranty   |       |.16GB/512GB/Windows 11/MSO/OLED|       |.RAM :16GB/ IS : 512GB         |          |");  
				 System.out.println("\t   "+"|         |.PRICE  :  56,144.00/-         |       |. PRICE  :  62,844.00/-        |       |.  PRICE  : 64,199.00/-        |          |");  
				 System.out.println("\t   "+"|         |_______________________________|       |_______________________________|       |_______________________________|          |");  
				 System.out.println("\t   "+"|                                                                                                                                    |");  
				 System.out.println("\t   "+"|                       1.                                          2.                                       3.                      |");  
				 System.out.println("\t   "+"|                                                                                                                                    |");  
				 System.out.println("\t   "+"|                                                                                                                                    |");  
				 System.out.println("\t   "+"|          _______________________________         _______________________________         _______________________________           |");  
				 System.out.println("\t   "+"|         |  DELL 5410 INSPIRON 14 LAPTOP |       |   DELL INSPIRON 7425 LAPTOP   |       |                               |          |");  
				 System.out.println("\t   "+"|         |-------------------------------|       |-------------------------------|       |                               |          |");  
				 System.out.println("\t   "+"|         |.G14 Gaming Laptop(AMD Ryzen 7)|       |.Processor:10th Gen Intel core |       |                               |          |");  
				 System.out.println("\t   "+"|         |.R7-4800HS/8GB/1TB SSD/MSO/WQHD|       |  i5-10300H 39.62cm(15.6 inch) |       |             EXIT              |          |");  
				 System.out.println("\t   "+"|         |.4GB Nvidia GeForce GTX 1650   |       |.RAM :8GB/Internal Storage:1TB |       |            ------             |          |");  
				 System.out.println("\t   "+"|         |.RAM :8GB/Internal Storage:1TB |       |.Storage Type : SSD/RAM :16GB  |       |                               |          |");  
				 System.out.println("\t   "+"|         |.29.46 cm(14 inch)/Windows 10  |       |.16GB/512GB/Windows 11/MSO/OLED|       |                               |          |");  
				 System.out.println("\t   "+"|         |.Processor:AMD Ryzen7-R7 4800HS|       |.Internal Storage : 512GB      |       |                               |          |");  
				 System.out.println("\t   "+"|         |.  PRICE  :  73,990.00/-       |       |. PRICE  :  68,644.00/-        |       |                               |          |");  
				 System.out.println("\t   "+"|         |_______________________________|       |_______________________________|       |_______________________________|          |");
				 System.out.println("\t   "+"|                                                                                                                                    |");  
				 System.out.println("\t   "+"|                     4.                                        5.                                       6.                          |");  
				 System.out.println("\t   "+"|                                                                                                                                    |");  	 
				 System.out.println("\t   "+"|____________________________________________________________________________________________________________________________________|");  
				 
				 System.out.println(RESET);	dell50k80kswitch(); 
			}
		//=================================================================================================================================	
			public static void dell50k80kswitch()
			{
				System.out.println("PLEASE CHOOSE YOUR PREFERRED MODEL :");
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
							   case 'y':System.out.println("Your Item is added to cart .");  ob[i]="DELL 3501 INSPIRON LAPTOP";ob1[i++]=56144;
							   System.out.print("Do you want to continue shopping in this Budget (Between 50k - 80k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
							   do
							   {
								   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								   switch(c1)	
								   {
								   case 'y':dell50k80k(); b=false; break; // MADE CHANGES HEREE
								   case 'n':dellmenu(); b=false; break; // MADE CHANGES HEREE
								   default : System.out.print("Please enter valid option: ");
								   }
							   }while(b==true);  break;
							   case 'n':
							   {
								   System.out.print("Do you want to see another model in this Budget (Between 50k - 80k) [y/n or Y/N]:");  //MADE CHANGES HERE
								   do
								   {
									   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c1)	
									   {
									   case 'y':dell50k80k(); b=false; break;
									   case 'n':
									   {
										   System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
										   do 
										   {
											   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
											   switch(c2)
											   {
											   case 'y': dellmenu(); b=false; break;
											   case 'n': laptop(); b=false; break;
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
							   case 'y':System.out.println("Your Item is added to cart .");  ob[i]="DELL 3511 INSPIRON LAPTOP";ob1[i++]=62844;
							   System.out.print("Do you want to continue shopping in this Budget (Between 50k - 80k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
							   do
							   {
								   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								   switch(c1)	
								   {
								   case 'y':dell50k80k(); b=false; break; // MADE CHANGES HEREE
								   case 'n':dellmenu(); b=false; break; // MADE CHANGES HEREE
								   default : System.out.print("Please enter valid option: ");
								   }
							   }while(b==true);  break;
							   case 'n':
							   {
								   System.out.print("Do you want to see another model in this Budget (Between 50k - 80k) [y/n or Y/N]:");  //MADE CHANGES HERE
								   do
								   {
									   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c1)	
									   {
									   case 'y':dell50k80k(); b=false; break;
									   case 'n':
									   {
										   System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
										   do 
										   {
											   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
											   switch(c2)
											   {
											   case 'y': dellmenu(); b=false; break;
											   case 'n': laptop(); b=false; break;
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
							   case 'y':System.out.println("Your Item is added to cart .");  ob[i]="DELL INSPIRON 15 3520 LAPTOP";ob1[i++]=64199;
							   System.out.print("Do you want to continue shopping in this Budget (Between 50k - 80k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
							   do
							   {
								   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								   switch(c1)	
								   {
								   case 'y':dell50k80k(); b=false; break; // MADE CHANGES HEREE
								   case 'n':dellmenu(); b=false; break; // MADE CHANGES HEREE
								   default : System.out.print("Please enter valid option: ");
								   }
							   }while(b==true);  break;
							   case 'n':
							   {
								   System.out.print("Do you want to see another model in this Budget (Between 50k - 80k) [y/n or Y/N]:");  //MADE CHANGES HERE
								   do
								   {
									   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c1)	
									   {
									   case 'y':dell50k80k(); b=false; break;
									   case 'n':
									   {
										   System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
										   do 
										   {
											   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
											   switch(c2)
											   {
											   case 'y': dellmenu(); b=false; break;
											   case 'n': laptop(); b=false; break;
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
							   case 'y':System.out.println("Your Item is added to cart .");  ob[i]="DELL 5410 INSPIRON 14 LAPTOP";ob1[i++]=73990;
							   System.out.print("Do you want to continue shopping in this Budget (Between 50k - 80k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
							   do
							   {
								   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								   switch(c1)	
								   {
								   case 'y':dell50k80k(); b=false; break; // MADE CHANGES HEREE
								   case 'n':dellmenu(); b=false; break; // MADE CHANGES HEREE
								   default : System.out.print("Please enter valid option: ");
								   }
							   }while(b==true);  break;
							   case 'n':
							   {
								   System.out.print("Do you want to see another model in this Budget (Between 50k - 80k) [y/n or Y/N]:");  //MADE CHANGES HERE
								   do
								   {
									   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c1)	
									   {
									   case 'y':dell50k80k(); b=false; break;
									   case 'n':
									   {
										   System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
										   do 
										   {
											   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
											   switch(c2)
											   {
											   case 'y': dellmenu(); b=false; break;
											   case 'n': laptop(); b=false; break;
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
							   case 'y':System.out.println("Your Item is added to cart .");  ob[i]="DELL INSPIRON 7425 LAPTOP";ob1[i++]=68644;
							   System.out.print("Do you want to continue shopping in this Budget (Between 50k - 80k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
							   do
							   {
								   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								   switch(c1)	
								   {
								   case 'y':dell50k80k(); b=false; break; // MADE CHANGES HEREE
								   case 'n':dellmenu(); b=false; break; // MADE CHANGES HEREE
								   default : System.out.print("Please enter valid option: ");
								   }
							   }while(b==true);  break;
							   case 'n':
							   {
								   System.out.print("Do you want to see another model in this Budget (Between 50k - 80k) [y/n or Y/N]:");  //MADE CHANGES HERE
								   do
								   {
									   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c1)	
									   {
									   case 'y':dell50k80k(); b=false; break;
									   case 'n':
									   {
										   System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
										   do 
										   {
											   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
											   switch(c2)
											   {
											   case 'y': dellmenu(); b=false; break;
											   case 'n': laptop(); b=false; break;
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
					   case 6:dellmenu(); b=false; break;// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
					   default: System.out.print("PLEASE ENTER VALID OPTION: ");
					   }
				   }while(b==true); 
			}
		//=================================================================================================================================	
			public static void lenovomenu()
			{ System.out.println(RESET);
				System.out.println("\t\t\t\t\t\t"+"                            LENOVO                            ");  
				System.out.println("\t\t\t\t\t\t"+"                      -------------------                      ");  
				System.out.println("\t\t\t\t\t\t"+"                      1.Between 30k - 50k                         ");  
				System.out.println("\t\t\t\t\t\t"+"                      2.Between 50k - 80k                    ");
				System.out.println("\t\t\t\t\t\t"+"                      3.EXIT FROM LENOVO                            ");
				 System.out.println(RESET);lenovoswitch(); // check here
			}
		//=================================================================================================================================	
			public static void lenovoswitch()
			{
				System.out.print("PLEASE ENTER THE PRICE RANGE  :");
				
				do
				{
					int p=sc.nextInt();
					switch(p) 
					{
					case 1: lenovo30k50k(); b=false; break;
					case 2: lenovo50k80k(); b=false; break;
					case 3: laptop();b=false; break;
					default:
					{
						System.out.println("Please enter valid option.");
						lenovomenu(); 
					}
					}
				}while(b==true);
			}
		//=================================================================================================================================	
			public static void lenovo30k50k()
			{ System.out.println(RESET);
				System.out.println("\t   "+" ____________________________________________________________________________________________________________________________________");  
				 System.out.println("\t   "+"|                                                                                                                                    |");  
				 System.out.println("\t   "+"|          _______________________________         _______________________________         _______________________________           |");  
				 System.out.println("\t   "+"|         |  LENOVO L2IN IDEAPAD 3 LAPTOP |       |  LENOVO DWIN IDEAPAD 3 LAPTOP |       |  LENOVO LJIN IDEAPAD 3 LAPTOP |          |");  
				 System.out.println("\t   "+"|         |-------------------------------|       |-------------------------------|       |-------------------------------|          |");  
				 System.out.println("\t   "+"|         |.11th Gen Intel Core i5-1135G7 |       |.AMD Ryzen5 5600H Mobile       |       |.10th Gen Intel Core i5-10300H |          |");  
				 System.out.println("\t   "+"|         |.8GB/512GB SSD Plus 32 GB      |       |          obile Processor      |       |.16GB/512GB SSD/Full HD        |          |");  
				 System.out.println("\t   "+"|         |.Free upgrade to Windows 11*   |       |.RAM : 16GB /35.56cm(14 inch)  |       |.4GB Nvidia GeForce GTX 1650   |          |");  
				 System.out.println("\t   "+"|         |.RAM : 8GB                     |       |.Internal Storage : 512GB      |       |  Graphics/Windows 11          |          |");  
				 System.out.println("\t   "+"|         |.Internal Storage : 512GB+32GB |       |.Storage Type : SSD            |       |.10th Gen Intel Core i5-10300H |          |");  
				 System.out.println("\t   "+"|         |.1Year Manufacturer Warranty   |       |.16GB/512GB/Windows 11/MSO/OLED|       |.RAM :16GB/ IS : 512GB         |          |");  
				 System.out.println("\t   "+"|         |.PRICE  :  33,990.00/-         |       |. PRICE  :  36,507.00/-        |       |.  PRICE  : 39,990.00/-        |          |");  
				 System.out.println("\t   "+"|         |_______________________________|       |_______________________________|       |_______________________________|          |");  
				 System.out.println("\t   "+"|                                                                                                                                    |");  
				 System.out.println("\t   "+"|                       1.                                          2.                                       3.                      |");  
				 System.out.println("\t   "+"|                                                                                                                                    |");  
				 System.out.println("\t   "+"|                                                                                                                                    |");  
				 System.out.println("\t   "+"|          _______________________________         _______________________________         _______________________________           |");  
				 System.out.println("\t   "+"|         |    LENOVO IDEAPAD 3 LAPTOP    |       | LENOVO KLIN IDEAPAD 3i LAPTOP |       |                               |          |");  
				 System.out.println("\t   "+"|         |-------------------------------|       |-------------------------------|       |                               |          |");  
				 System.out.println("\t   "+"|         |.G14 Gaming Laptop(AMD Ryzen 7)|       |.Processor:10th Gen Intel core |       |                               |          |");  
				 System.out.println("\t   "+"|         |.R7-4800HS/8GB/1TB SSD/MSO/WQHD|       |  i5-10300H 39.62cm(15.6 inch) |       |             EXIT              |          |");  
				 System.out.println("\t   "+"|         |.4GB Nvidia GeForce GTX 1650   |       |.RAM :8GB/Internal Storage:1TB |       |            ------             |          |");  
				 System.out.println("\t   "+"|         |.RAM :8GB/Internal Storage:1TB |       |.Storage Type : SSD/RAM :16GB  |       |                               |          |");  
				 System.out.println("\t   "+"|         |.29.46 cm(14 inch)/Windows 10  |       |.16GB/512GB/Windows 11/MSO/OLED|       |                               |          |");  
				 System.out.println("\t   "+"|         |.Processor:AMD Ryzen7-R7 4800HS|       |.Internal Storage : 512GB      |       |                               |          |");  
				 System.out.println("\t   "+"|         |.  PRICE  :  43,990.00/-       |       |. PRICE  :  47,590.00/-        |       |                               |          |");  
				 System.out.println("\t   "+"|         |_______________________________|       |_______________________________|       |_______________________________|          |");
				 System.out.println("\t   "+"|                                                                                                                                    |");  
				 System.out.println("\t   "+"|                     4.                                        5.                                       6.                          |");  
				 System.out.println("\t   "+"|                                                                                                                                    |");  	 
				 System.out.println("\t   "+"|____________________________________________________________________________________________________________________________________|");  
				 
				 System.out.println(RESET); lenovo30k50kswitch(); 
			}
		//=================================================================================================================================	
			public static void lenovo30k50kswitch()
			{
				System.out.println("PLEASE CHOOSE YOUR PREFERRED MODEL :");
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
							   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="LENOVO L2IN IDEAPAD 3 LAPTOP";ob1[i++]=33990;
							   System.out.print("Do you want to continue shopping in this Budget (Between 30k - 50k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
							   do
							   {
								   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								   switch(c1)	
								   {
								   case 'y':lenovo30k50k(); b=false; break; // MADE CHANGES HEREE
								   case 'n':lenovomenu(); b=false; break; // MADE CHANGES HEREE
								   default : System.out.print("Please enter valid option: ");
								   }
							   }while(b==true);  break;
							   case 'n':
							   {
								   System.out.print("Do you want to see another model in this Budget (Between 30k - 50k) [y/n or Y/N]:");  //MADE CHANGES HERE
								   do
								   {
									   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c1)	
									   {
									   case 'y':lenovo30k50k(); b=false; break;// MADE CHANGES HERE
									   case 'n':
									   {
										   System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
										   do 
										   {
											   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
											   switch(c2)
											   {
											   case 'y': lenovomenu(); b=false; break;
											   case 'n': laptop(); b=false; break;
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
							   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="LENOVO DWIN IDEAPAD 3 LAPTOP";ob1[i++]=36507;
							   System.out.print("Do you want to continue shopping in this Budget (Between 30k - 50k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
							   do
							   {
								   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								   switch(c1)	
								   {
								   case 'y':lenovo30k50k(); b=false; break; // MADE CHANGES HEREE
								   case 'n':lenovomenu(); b=false; break; // MADE CHANGES HEREE
								   default : System.out.print("Please enter valid option: ");
								   }
							   }while(b==true);  break;
							   case 'n':
							   {
								   System.out.print("Do you want to see another model in this Budget (Between 30k - 50k) [y/n or Y/N]:");  //MADE CHANGES HERE
								   do
								   {
									   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c1)	
									   {
									   case 'y':lenovo30k50k(); b=false; break;// MADE CHANGES HERE
									   case 'n':
									   {
										   System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
										   do 
										   {
											   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
											   switch(c2)
											   {
											   case 'y': lenovomenu(); b=false; break;
											   case 'n': laptop(); b=false; break;
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
							   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="LENOVO LJIN IDEAPAD 3 LAPTOP";ob1[i++]=39990;
							   System.out.print("Do you want to continue shopping in this Budget (Between 30k - 50k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
							   do
							   {
								   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								   switch(c1)	
								   {
								   case 'y':lenovo30k50k(); b=false; break; // MADE CHANGES HEREE
								   case 'n':lenovomenu(); b=false; break; // MADE CHANGES HEREE
								   default : System.out.print("Please enter valid option: ");
								   }
							   }while(b==true);  break;
							   case 'n':
							   {
								   System.out.print("Do you want to see another model in this Budget (Between 30k - 50k) [y/n or Y/N]:");  //MADE CHANGES HERE
								   do
								   {
									   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c1)	
									   {
									   case 'y':lenovo30k50k(); b=false; break;// MADE CHANGES HERE
									   case 'n':
									   {
										   System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
										   do 
										   {
											   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
											   switch(c2)
											   {
											   case 'y': lenovomenu(); b=false; break;
											   case 'n': laptop(); b=false; break;
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
							   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="LENOVO IDEAPAD 3 LAPTOP";ob1[i++]=43990;
							   System.out.print("Do you want to continue shopping in this Budget (Between 30k - 50k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
							   do
							   {
								   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								   switch(c1)	
								   {
								   case 'y':lenovo30k50k(); b=false; break; // MADE CHANGES HEREE
								   case 'n':lenovomenu(); b=false; break; // MADE CHANGES HEREE
								   default : System.out.print("Please enter valid option: ");
								   }
							   }while(b==true);  break;
							   case 'n':
							   {
								   System.out.print("Do you want to see another model in this Budget (Between 30k - 50k) [y/n or Y/N]:");  //MADE CHANGES HERE
								   do
								   {
									   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c1)	
									   {
									   case 'y':lenovo30k50k(); b=false; break;// MADE CHANGES HERE
									   case 'n':
									   {
										   System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
										   do 
										   {
											   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
											   switch(c2)
											   {
											   case 'y': lenovomenu(); b=false; break;
											   case 'n': laptop(); b=false; break;
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
							   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="LENOVO KLIN IDEAPAD 3i LAPTOP";ob1[i++]=47590;
							   System.out.print("Do you want to continue shopping in this Budget (Between 30k - 50k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
							   do
							   {
								   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								   switch(c1)	
								   {
								   case 'y':lenovo30k50k(); b=false; break; // MADE CHANGES HEREE
								   case 'n':lenovomenu(); b=false; break; // MADE CHANGES HEREE
								   default : System.out.print("Please enter valid option: ");
								   }
							   }while(b==true);  break;
							   case 'n':
							   {
								   System.out.print("Do you want to see another model in this Budget (Between 30k - 50k) [y/n or Y/N]:");  //MADE CHANGES HERE
								   do
								   {
									   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c1)	
									   {
									   case 'y':lenovo30k50k(); b=false; break;// MADE CHANGES HERE
									   case 'n':
									   {
										   System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
										   do 
										   {
											   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
											   switch(c2)
											   {
											   case 'y': lenovomenu(); b=false; break;
											   case 'n': laptop(); b=false; break;
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
					   case 6:lenovomenu(); b=false; break;// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
					   default: System.out.print("PLEASE ENTER VALID OPTION: ");
					   }
				   }while(b==true); 
			}
		//=================================================================================================================================	
			public static void lenovo50k80k()
			{ System.out.println(RESET);
				System.out.println("\t   "+" ____________________________________________________________________________________________________________________________________");  
				 System.out.println("\t   "+"|                                                                                                                                    |");  
				 System.out.println("\t   "+"|          _______________________________         _______________________________         _______________________________           |");  
				 System.out.println("\t   "+"|         |    LENOVO IDEAPAD 3 LAPTOP    |       |  LENOVO DJIN IDEAPAD SLIM 3i  |       |  LENOVO UWIN G3 GAMING LAPTOP |          |");  
				 System.out.println("\t   "+"|         |-------------------------------|       |-------------------------------|       |-------------------------------|          |");  
				 System.out.println("\t   "+"|         |.11th Gen Intel Core i5-1135G7 |       |.AMD Ryzen5 5600H Mobile       |       |.10th Gen Intel Core i5-10300H |          |");  
				 System.out.println("\t   "+"|         |.8GB/512GB SSD Plus 32 GB      |       |          obile Processor      |       |.16GB/512GB SSD/Full HD        |          |");  
				 System.out.println("\t   "+"|         |.Free upgrade to Windows 11*   |       |.RAM : 16GB /35.56cm(14 inch)  |       |.4GB Nvidia GeForce GTX 1650   |          |");  
				 System.out.println("\t   "+"|         |.RAM : 8GB                     |       |.Internal Storage : 512GB      |       |  Graphics/Windows 11          |          |");  
				 System.out.println("\t   "+"|         |.Internal Storage : 512GB+32GB |       |.Storage Type : SSD            |       |.10th Gen Intel Core i5-10300H |          |");  
				 System.out.println("\t   "+"|         |.1Year Manufacturer Warranty   |       |.16GB/512GB/Windows 11/MSO/OLED|       |.RAM :16GB/ IS : 512GB         |          |");  
				 System.out.println("\t   "+"|         |.PRICE  :  52,990.00/-         |       |. PRICE  :   56,507.00/-       |       |.  PRICE  : 60,990.00/-        |          |");  
				 System.out.println("\t   "+"|         |_______________________________|       |_______________________________|       |_______________________________|          |");  
				 System.out.println("\t   "+"|                                                                                                                                    |");  
				 System.out.println("\t   "+"|                       1.                                          2.                                       3.                      |");  
				 System.out.println("\t   "+"|                                                                                                                                    |");  
				 System.out.println("\t   "+"|                                                                                                                                    |");  
				 System.out.println("\t   "+"|          _______________________________         _______________________________         _______________________________           |");  
				 System.out.println("\t   "+"|         |  LENOVO UXIN GAMING 3 LAPTOP  |       |  LENOVO IDEAPAD FLEX 5 LAPTOP |       |                               |          |");  
				 System.out.println("\t   "+"|         |-------------------------------|       |-------------------------------|       |                               |          |");  
				 System.out.println("\t   "+"|         |.G14 Gaming Laptop(AMD Ryzen 7)|       |.Processor:10th Gen Intel core |       |                               |          |");  
				 System.out.println("\t   "+"|         |.R7-4800HS/8GB/1TB SSD/MSO/WQHD|       |  i5-10300H 39.62cm(15.6 inch) |       |             EXIT              |          |");  
				 System.out.println("\t   "+"|         |.4GB Nvidia GeForce GTX 1650   |       |.RAM :8GB/Internal Storage:1TB |       |            ------             |          |");  
				 System.out.println("\t   "+"|         |.RAM :8GB/Internal Storage:1TB |       |.Storage Type : SSD/RAM :16GB  |       |                               |          |");  
				 System.out.println("\t   "+"|         |.29.46 cm(14 inch)/Windows 10  |       |.16GB/512GB/Windows 11/MSO/OLED|       |                               |          |");  
				 System.out.println("\t   "+"|         |.Processor:AMD Ryzen7-R7 4800HS|       |.Internal Storage : 512GB      |       |                               |          |");  
				 System.out.println("\t   "+"|         |.  PRICE  :  65,990.00/-       |       |. PRICE  :  75,590.00/-        |       |                               |          |");  
				 System.out.println("\t   "+"|         |_______________________________|       |_______________________________|       |_______________________________|          |");
				 System.out.println("\t   "+"|                                                                                                                                    |");  
				 System.out.println("\t   "+"|                     4.                                        5.                                       6.                          |");  
				 System.out.println("\t   "+"|                                                                                                                                    |");  	 
				 System.out.println("\t   "+"|____________________________________________________________________________________________________________________________________|");  
				 
				 System.out.println(RESET);lenovo50k80kswitch(); 
			}
		//=================================================================================================================================	
			public static void lenovo50k80kswitch()
			{
				System.out.println("PLEASE CHOOSE YOUR PREFERRED MODEL :");
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
							   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="LENOVO IDEAPAD 3 LAPTOP";ob1[i++]=52990;
							   System.out.print("Do you want to continue shopping in this Budget (Between 50k - 80k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
							   do
							   {
								   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								   switch(c1)	
								   {
								   case 'y':lenovo50k80k(); b=false; break; // MADE CHANGES HEREE
								   case 'n':lenovomenu(); b=false; break; // MADE CHANGES HEREE
								   default : System.out.print("Please enter valid option: ");
								   }
							   }while(b==true);  break;
							   case 'n':
							   {
								   System.out.print("Do you want to see another model in this Budget (Between 50k - 80k) [y/n or Y/N]:");  //MADE CHANGES HERE
								   do
								   {
									   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c1)	
									   {
									   case 'y':lenovo50k80k(); b=false; break; //MADE CHANGES
									   case 'n':
									   {
										   System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
										   do 
										   {
											   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
											   switch(c2)
											   {
											   case 'y': lenovomenu(); b=false; break;
											   case 'n': laptop(); b=false; break;
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
							   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="LENOVO DJIN IDEAPAD SLIM 3i";ob1[i++]=56507;
							   System.out.print("Do you want to continue shopping in this Budget (Between 50k - 80k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
							   do
							   {
								   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								   switch(c1)	
								   {
								   case 'y':lenovo50k80k(); b=false; break; // MADE CHANGES HEREE
								   case 'n':lenovomenu(); b=false; break; // MADE CHANGES HEREE
								   default : System.out.print("Please enter valid option: ");
								   }
							   }while(b==true);  break;
							   case 'n':
							   {
								   System.out.print("Do you want to see another model in this Budget (Between 50k - 80k) [y/n or Y/N]:");  //MADE CHANGES HERE
								   do
								   {
									   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c1)	
									   {
									   case 'y':lenovo50k80k(); b=false; break; //MADE CHANGES
									   case 'n':
									   {
										   System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
										   do 
										   {
											   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
											   switch(c2)
											   {
											   case 'y': lenovomenu(); b=false; break;
											   case 'n': laptop(); b=false; break;
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
							   case 'y':System.out.println("Your Item is added to cart .");  ob[i]="LENOVO UWIN G3 GAMING LAPTOP";ob1[i++]=60990;
							   System.out.print("Do you want to continue shopping in this Budget (Between 50k - 80k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
							   do
							   {
								   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								   switch(c1)	
								   {
								   case 'y':lenovo50k80k(); b=false; break; // MADE CHANGES HEREE
								   case 'n':lenovomenu(); b=false; break; // MADE CHANGES HEREE
								   default : System.out.print("Please enter valid option: ");
								   }
							   }while(b==true);  break;
							   case 'n':
							   {
								   System.out.print("Do you want to see another model in this Budget (Between 50k - 80k) [y/n or Y/N]:");  //MADE CHANGES HERE
								   do
								   {
									   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c1)	
									   {
									   case 'y':lenovo50k80k(); b=false; break; //MADE CHANGES
									   case 'n':
									   {
										   System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
										   do 
										   {
											   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
											   switch(c2)
											   {
											   case 'y': lenovomenu(); b=false; break;
											   case 'n': laptop(); b=false; break;
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
							   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="LENOVO UXIN GAMING 3 LAPTOP";ob1[i++]=65990;
							   System.out.print("Do you want to continue shopping in this Budget (Between 50k - 80k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
							   do
							   {
								   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								   switch(c1)	
								   {
								   case 'y':lenovo50k80k(); b=false; break; // MADE CHANGES HEREE
								   case 'n':lenovomenu(); b=false; break; // MADE CHANGES HEREE
								   default : System.out.print("Please enter valid option: ");
								   }
							   }while(b==true);  break;
							   case 'n':
							   {
								   System.out.print("Do you want to see another model in this Budget (Between 50k - 80k) [y/n or Y/N]:");  //MADE CHANGES HERE
								   do
								   {
									   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c1)	
									   {
									   case 'y':lenovo50k80k(); b=false; break; //MADE CHANGES
									   case 'n':
									   {
										   System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
										   do 
										   {
											   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
											   switch(c2)
											   {
											   case 'y': lenovomenu(); b=false; break;
											   case 'n': laptop(); b=false; break;
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
							   case 'y':System.out.println("Your Item is added to cart .");ob[i]="LENOVO IDEAPAD FLEX 5 LAPTOP";ob1[i++]= 75590;
							   System.out.print("Do you want to continue shopping in this Budget (Between 50k - 80k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
							   do
							   {
								   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								   switch(c1)	
								   {
								   case 'y':lenovo50k80k(); b=false; break; // MADE CHANGES HEREE
								   case 'n':lenovomenu(); b=false; break; // MADE CHANGES HEREE
								   default : System.out.print("Please enter valid option: ");
								   }
							   }while(b==true);  break;
							   case 'n':
							   {
								   System.out.print("Do you want to see another model in this Budget (Between 50k - 80k) [y/n or Y/N]:");  //MADE CHANGES HERE
								   do
								   {
									   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c1)	
									   {
									   case 'y':lenovo50k80k(); b=false; break; //MADE CHANGES
									   case 'n':
									   {
										   System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
										   do 
										   {
											   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
											   switch(c2)
											   {
											   case 'y': lenovomenu(); b=false; break;
											   case 'n': laptop(); b=false; break;
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
					   case 6:lenovomenu(); b=false; break;// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
					   default: System.out.print("PLEASE ENTER VALID OPTION: ");
					   }
				   }while(b==true);
			}
		//=================================================================================================================================	
			public static void applemenu()
			{ System.out.println(RESET);
				System.out.println("\t\t\t\t\t\t"+"                            APPLE                            ");  
				System.out.println("\t\t\t\t\t\t"+"                      -------------------                      ");  
				System.out.println("\t\t\t\t\t\t"+"                      1.Between 85k - 1L                         ");  
				System.out.println("\t\t\t\t\t\t"+"                      2.Between 1L  - 2.5L                  ");
				System.out.println("\t\t\t\t\t\t"+"                      3.EXIT FROM APPLE                            ");
				 System.out.println(RESET);appleswitch();
			}
		//=================================================================================================================================	
			public static void appleswitch()
			{
				System.out.print("PLEASE ENTER THE PRICE RANGE  :");
				
				do
				{
					int p=sc.nextInt();
					switch(p) 
					{
					case 1: apple85k1L(); b=false; break;
					case 2: apple1L2L(); b=false; break;
					case 3: laptop();b=false; break;
					default:
					{
						System.out.println("Please enter valid option.");
						applemenu(); 
					}
					}
				}while(b==true);
			}
		//=================================================================================================================================	
			public static void apple85k1L()
			{ System.out.println(RESET);
				 System.out.println("\t   "+" ____________________________________________________________________________________________________________________________________");    
				 System.out.println("\t   "+"|                                                                                                                                    |");  
				 System.out.println("\t   "+"|                                                                                                                                    |");  
				 System.out.println("\t   "+"|          _______________________________         _______________________________         _______________________________           |");  
				 System.out.println("\t   "+"|         |  APPLE MGN63HNA MACBOOK AIR   |       |   APPLE MGND3HNA MACBOOK AIR  |       |                               |          |");  
				 System.out.println("\t   "+"|         |-------------------------------|       |-------------------------------|       |                               |          |");  
				 System.out.println("\t   "+"|         |.G14 Gaming Laptop(AMD Ryzen 7)|       |.Processor:10th Gen Intel core |       |                               |          |");  
				 System.out.println("\t   "+"|         |.R7-4800HS/8GB/1TB SSD/MSO/WQHD|       |  i5-10300H 39.62cm(15.6 inch) |       |             EXIT              |          |");  
				 System.out.println("\t   "+"|         |.4GB Nvidia GeForce GTX 1650   |       |.RAM :8GB/Internal Storage:1TB |       |            ------             |          |");  
				 System.out.println("\t   "+"|         |.RAM :8GB/Internal Storage:1TB |       |.Storage Type : SSD/RAM :16GB  |       |                               |          |");  
				 System.out.println("\t   "+"|         |.29.46 cm(14 inch)/Windows 10  |       |.16GB/512GB/Windows 11/MSO/OLED|       |                               |          |");  
				 System.out.println("\t   "+"|         |.Processor:AMD Ryzen7-R7 4800HS|       |.Internal Storage : 512GB      |       |                               |          |");  
				 System.out.println("\t   "+"|         |.  PRICE  :  85,990.00/-       |       |. PRICE  :  95,590.00/-        |       |                               |          |");  
				 System.out.println("\t   "+"|         |_______________________________|       |_______________________________|       |_______________________________|          |");
				 System.out.println("\t   "+"|                                                                                                                                    |");  
				 System.out.println("\t   "+"|                     1.                                        2.                                       3.                          |");  
				 System.out.println("\t   "+"|                                                                                                                                    |");  	 
				 System.out.println("\t   "+"|____________________________________________________________________________________________________________________________________|");  
				 
				 System.out.println(RESET); apple85k1Lswitch(); 
			}
		//=================================================================================================================================	
			public static void apple85k1Lswitch()
			{
				System.out.println("PLEASE CHOOSE YOUR PREFERRED MODEL :");
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
							   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="APPLE MGN63HNA MACBOOK AIR";ob1[i++]=85990; 
							   System.out.print("Do you want to continue shopping in this Budget (Between 85k - 1L) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
							   do
							   {
								   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								   switch(c1)	
								   {
								   case 'y':apple85k1L(); b=false; break; // MADE CHANGES HEREE
								   case 'n':applemenu(); b=false; break; // MADE CHANGES HEREE
								   default : System.out.print("Please enter valid option: ");
								   }
							   }while(b==true);  break;
							   case 'n':
							   {
								   System.out.print("Do you want to see another model in this Budget (Between 85k - 1L) [y/n or Y/N]:");  //MADE CHANGES HERE
								   do
								   {
									   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c1)	
									   {
									   case 'y':apple85k1L(); b=false; break;// CHUSUKO
									   case 'n':
									   {
										   System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
										   do 
										   {
											   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
											   switch(c2)
											   {
											   case 'y': applemenu(); b=false; break;
											   case 'n': laptop(); b=false; break;
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
							   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="APPLE MGND3HNA MACBOOK AIR";ob1[i++]=95590; 
							   System.out.print("Do you want to continue shopping in this Budget (Between 85k - 1L) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
							   do
							   {
								   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								   switch(c1)	
								   {
								   case 'y':apple85k1L(); b=false; break; // MADE CHANGES HEREE
								   case 'n':applemenu(); b=false; break; // MADE CHANGES HEREE
								   default : System.out.print("Please enter valid option: ");
								   }
							   }while(b==true);  break;
							   case 'n':
							   {
								   System.out.print("Do you want to see another model in this Budget (Between 85k - 1L) [y/n or Y/N]:");  //MADE CHANGES HERE
								   do
								   {
									   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c1)	
									   {
									   case 'y':apple85k1L(); b=false; break;// CHUSUKO
									   case 'n':
									   {
										   System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
										   do 
										   {
											   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
											   switch(c2)
											   {
											   case 'y': applemenu(); b=false; break;
											   case 'n': laptop(); b=false; break;
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
					   case 3:applemenu(); b=false; break;// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
					   default: System.out.print("PLEASE ENTER VALID OPTION: ");
					   }
				   }while(b==true);
			}
		//=================================================================================================================================	
			public static void apple1L2L()
			{ System.out.println(RESET);
				 System.out.println("\t   "+" ____________________________________________________________________________________________________________________________________");  
				 System.out.println("\t   "+"|                                                                                                                                    |");  
				 System.out.println("\t   "+"|          _______________________________         _______________________________         _______________________________           |");  
				 System.out.println("\t   "+"|         |  APPLE MYD82HNA MACBOOK PRO   |       |  APPLE MLY33HNA MACBOOK AIR   |       |   APPLE MLY13HNA MACBOOK AIR  |          |");  
				 System.out.println("\t   "+"|         |-------------------------------|       |-------------------------------|       |-------------------------------|          |");  
				 System.out.println("\t   "+"|         |.11th Gen Intel Core i5-1135G7 |       |.AMD Ryzen5 5600H Mobile       |       |.10th Gen Intel Core i5-10300H |          |");  
				 System.out.println("\t   "+"|         |.8GB/512GB SSD Plus 32 GB      |       |          obile Processor      |       |.16GB/512GB SSD/Full HD        |          |");  
				 System.out.println("\t   "+"|         |.Free upgrade to Windows 11*   |       |.RAM : 16GB /35.56cm(14 inch)  |       |.4GB Nvidia GeForce RTX 4050   |          |");  
				 System.out.println("\t   "+"|         |.RAM : 8GB                     |       |.Internal Storage : 512GB      |       |  Graphics/Windows 11          |          |");  
				 System.out.println("\t   "+"|         |.Internal Storage : 512GB+32GB |       |.Storage Type : SSD            |       |.10th Gen Intel Core i5-10300H |          |");  
				 System.out.println("\t   "+"|         |.1Year Manufacturer Warranty   |       |.16GB/512GB/Windows 11/MSO/OLED|       |.RAM :16GB/ IS : 512GB         |          |");  
				 System.out.println("\t   "+"|         |.PRICE  :  1,09,990.00/-       |       |. PRICE  :  1,11,507.00/-      |       |.  PRICE  : 1,19,990.00/-      |          |");  
				 System.out.println("\t   "+"|         |_______________________________|       |_______________________________|       |_______________________________|          |");  
				 System.out.println("\t   "+"|                                                                                                                                    |");  
				 System.out.println("\t   "+"|                       1.                                          2.                                       3.                      |");  
				 System.out.println("\t   "+"|                                                                                                                                    |");  
				 System.out.println("\t   "+"|                                                                                                                                    |");  
				 System.out.println("\t   "+"|          _______________________________         _______________________________         _______________________________           |");  
				 System.out.println("\t   "+"|         |  APPLE MNEH3HNA MACBOOK PRO   |       |   APPLE MNEH3HNA MACBOOK PRO  |       |                               |          |");  
				 System.out.println("\t   "+"|         |-------------------------------|       |-------------------------------|       |                               |          |");  
				 System.out.println("\t   "+"|         |.G14 Gaming Laptop(AMD Ryzen 7)|       |.Processor:10th Gen Intel core |       |                               |          |");  
				 System.out.println("\t   "+"|         |.R7-4800HS/8GB/1TB SSD/MSO/WQHD|       |  i5-10300H 39.62cm(15.6 inch) |       |             EXIT              |          |");  
				 System.out.println("\t   "+"|         |.4GB Nvidia GeForce GTX 1650   |       |.RAM :8GB/Internal Storage:1TB |       |            ------             |          |");  
				 System.out.println("\t   "+"|         |.RAM :8GB/Internal Storage:1TB |       |.Storage Type : SSD/RAM :16GB  |       |                               |          |");  
				 System.out.println("\t   "+"|         |.29.46 cm(14 inch)/Windows 10  |       |.16GB/512GB/Windows 11/MSO/OLED|       |                               |          |");  
				 System.out.println("\t   "+"|         |.Processor:AMD Ryzen7-R7 4800HS|       |.Internal Storage : 512GB      |       |                               |          |");  
				 System.out.println("\t   "+"|         |.  PRICE  :  1,29,990.00/-     |       |. PRICE  :  1,30,590.00/-      |       |                               |          |");  
				 System.out.println("\t   "+"|         |_______________________________|       |_______________________________|       |_______________________________|          |");
				 System.out.println("\t   "+"|                                                                                                                                    |");  
				 System.out.println("\t   "+"|                     4.                                        5.                                       6.                          |");  
				 System.out.println("\t   "+"|                                                                                                                                    |");  	 
				 System.out.println("\t   "+"|____________________________________________________________________________________________________________________________________|");  
				 
				 System.out.println(RESET);	apple1L2Lswitch(); 
			}
		//=================================================================================================================================	
			public static void apple1L2Lswitch()
			{
				System.out.println("PLEASE CHOOSE YOUR PREFERRED MODEL :");
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
							   case 'y':System.out.println("Your Item is added to cart .");ob[i]="APPLE MYD82HNA MACBOOK PRO";ob1[i++]= 109990;
							   System.out.print("Do you want to continue shopping in this Budget (Between 1L  - 2.5L) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
							   do
							   {
								   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								   switch(c1)	
								   {
								   case 'y':apple1L2L(); b=false; break; // MADE CHANGES HEREE
								   case 'n':applemenu(); b=false; break; // MADE CHANGES HEREE
								   default : System.out.print("Please enter valid option: ");
								   }
							   }while(b==true);  break;
							   case 'n':
							   {
								   System.out.print("Do you want to see another model in this Budget (Between 1L  - 2.5L) [y/n or Y/N]:");  //MADE CHANGES HERE
								   do
								   {
									   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c1)	
									   {
									   case 'y':apple1L2L(); b=false; break;// CHUSUKO
									   case 'n':
									   {
										   System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
										   do 
										   {
											   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
											   switch(c2)
											   {
											   case 'y': applemenu(); b=false; break;
											   case 'n': laptop(); b=false; break;
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
							   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="APPLE MLY33HNA MACBOOK AIR";ob1[i++]=111507;
							   System.out.print("Do you want to continue shopping in this Budget (Between 1L  - 2.5L) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
							   do
							   {
								   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								   switch(c1)	
								   {
								   case 'y':apple1L2L(); b=false; break; // MADE CHANGES HEREE
								   case 'n':applemenu(); b=false; break; // MADE CHANGES HEREE
								   default : System.out.print("Please enter valid option: ");
								   }
							   }while(b==true);  break;
							   case 'n':
							   {
								   System.out.print("Do you want to see another model in this Budget (Between 1L  - 2.5L) [y/n or Y/N]:");  //MADE CHANGES HERE
								   do
								   {
									   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c1)	
									   {
									   case 'y':apple1L2L(); b=false; break;// CHUSUKO
									   case 'n':
									   {
										   System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
										   do 
										   {
											   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
											   switch(c2)
											   {
											   case 'y': applemenu(); b=false; break;
											   case 'n': laptop(); b=false; break;
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
							   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="APPLE MLY13HNA MACBOOK AIR";ob1[i++]=119990;
							   System.out.print("Do you want to continue shopping in this Budget (Between 1L  - 2.5L) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
							   do
							   {
								   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								   switch(c1)	
								   {
								   case 'y':apple1L2L(); b=false; break; // MADE CHANGES HEREE
								   case 'n':applemenu(); b=false; break; // MADE CHANGES HEREE
								   default : System.out.print("Please enter valid option: ");
								   }
							   }while(b==true);  break;
							   case 'n':
							   {
								   System.out.print("Do you want to see another model in this Budget (Between 1L  - 2.5L) [y/n or Y/N]:");  //MADE CHANGES HERE
								   do
								   {
									   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c1)	
									   {
									   case 'y':apple1L2L(); b=false; break;// CHUSUKO
									   case 'n':
									   {
										   System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
										   do 
										   {
											   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
											   switch(c2)
											   {
											   case 'y': applemenu(); b=false; break;
											   case 'n': laptop(); b=false; break;
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
							   case 'y':System.out.println("Your Item is added to cart .");ob[i]="APPLE MNEH3HNA MACBOOK PRO";ob1[i++]= 129990;
							   System.out.print("Do you want to continue shopping in this Budget (Between 1L  - 2.5L) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
							   do
							   {
								   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								   switch(c1)	
								   {
								   case 'y':apple1L2L(); b=false; break; // MADE CHANGES HEREE
								   case 'n':applemenu(); b=false; break; // MADE CHANGES HEREE
								   default : System.out.print("Please enter valid option: ");
								   }
							   }while(b==true);  break;
							   case 'n':
							   {
								   System.out.print("Do you want to see another model in this Budget (Between 1L  - 2.5L) [y/n or Y/N]:");  //MADE CHANGES HERE
								   do
								   {
									   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c1)	
									   {
									   case 'y':apple1L2L(); b=false; break;// CHUSUKO
									   case 'n':
									   {
										   System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
										   do 
										   {
											   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
											   switch(c2)
											   {
											   case 'y': applemenu(); b=false; break;
											   case 'n': laptop(); b=false; break;
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
							   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="APPLE MNEH3HNA MACBOOK PRO";ob1[i++]=130590;
							   System.out.print("Do you want to continue shopping in this Budget (Between 1L  - 2.5L) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
							   do
							   {
								   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								   switch(c1)	
								   {
								   case 'y':apple1L2L(); b=false; break; // MADE CHANGES HEREE
								   case 'n':applemenu(); b=false; break; // MADE CHANGES HEREE
								   default : System.out.print("Please enter valid option: ");
								   }
							   }while(b==true);  break;
							   case 'n':
							   {
								   System.out.print("Do you want to see another model in this Budget (Between 1L  - 2.5L) [y/n or Y/N]:");  //MADE CHANGES HERE
								   do
								   {
									   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c1)	
									   {
									   case 'y':apple1L2L(); b=false; break;// CHUSUKO
									   case 'n':
									   {
										   System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
										   do 
										   {
											   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
											   switch(c2)
											   {
											   case 'y': applemenu(); b=false; break;
											   case 'n': laptop(); b=false; break;
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
					   case 6:applemenu(); b=false; break;// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
					   default: System.out.print("PLEASE ENTER VALID OPTION: ");
					   }
				   }while(b==true);
			}
		//=================================================================================================================================	
			public static void asusmenu()
			{ System.out.println(RESET);
				System.out.println("\t\t\t\t\t\t"+"                            ASUS                            ");  
				System.out.println("\t\t\t\t\t\t"+"                      -------------------                      ");  
				System.out.println("\t\t\t\t\t\t"+"                      1.Between 30k - 50k                         ");  
				System.out.println("\t\t\t\t\t\t"+"                      2.Between 50k - 80k                    ");
				System.out.println("\t\t\t\t\t\t"+"                      3.EXIT FROM ASUS                             ");
				 System.out.println(RESET);asusswitch(); 
			}
		//=================================================================================================================================	
			public static void asusswitch()
			{
				System.out.print("PLEASE ENTER THE PRICE RANGE  :");
				
				do
				{
					int p=sc.nextInt();
					switch(p) 
					{
					case 1: asus30k50k(); b=false; break;
					case 2: asus50k80k(); b=false; break;
					case 3: laptop();b=false; break;
					default:
					{
						System.out.println("Please enter valid option.");
						asusmenu(); 
					}
					}
				}while(b==true);
			}
		//=================================================================================================================================	
			public static void asus30k50k()
			{ System.out.println(RESET);
				 System.out.println("\t   "+" ____________________________________________________________________________________________________________________________________");  
				 System.out.println("\t   "+"|                                                                                                                                    |");  
				 System.out.println("\t   "+"|          _______________________________         _______________________________         _______________________________           |");  
				 System.out.println("\t   "+"|         |      ASUS EK342WS LAPTOP      |       |     ASUS EJ312WS LAPTOP       |       |     ASUS BV322WS VIVOBOOK     |          |");  
				 System.out.println("\t   "+"|         |-------------------------------|       |-------------------------------|       |-------------------------------|          |");  
				 System.out.println("\t   "+"|         |.11th Gen Intel Core i5-1135G7 |       |.AMD Ryzen5 5600H Mobile       |       |.10th Gen Intel Core i5-10300H |          |");  
				 System.out.println("\t   "+"|         |.8GB/512GB SSD Plus 32 GB      |       |          obile Processor      |       |.16GB/512GB SSD/Full HD        |          |");  
				 System.out.println("\t   "+"|         |.Free upgrade to Windows 11*   |       |.RAM : 16GB /35.56cm(14 inch)  |       |.4GB Nvidia GeForce GTX 1650   |          |");  
				 System.out.println("\t   "+"|         |.RAM : 8GB                     |       |.Internal Storage : 512GB      |       |  Graphics/Windows 11          |          |");  
				 System.out.println("\t   "+"|         |.Internal Storage : 512GB+32GB |       |.Storage Type : SSD            |       |.10th Gen Intel Core i5-10300H |          |");  
				 System.out.println("\t   "+"|         |.1Year Manufacturer Warranty   |       |.16GB/512GB/Windows 11/MSO/OLED|       |.RAM :16GB/ IS : 512GB         |          |");  
				 System.out.println("\t   "+"|         |.PRICE  :  32,990.00/-         |       |. PRICE  :  35,990.00/-        |       |.  PRICE  :  38,990.00/-       |          |");  
				 System.out.println("\t   "+"|         |_______________________________|       |_______________________________|       |_______________________________|          |");  
				 System.out.println("\t   "+"|                                                                                                                                    |");  
				 System.out.println("\t   "+"|                       1.                                          2.                                       3.                      |");  
				 System.out.println("\t   "+"|                                                                                                                                    |");  
				 System.out.println("\t   "+"|                                                                                                                                    |");  
				 System.out.println("\t   "+"|          _______________________________         _______________________________         _______________________________           |");  
				 System.out.println("\t   "+"|         | ASUS BV511WS VIVOBOOK LAPTOP  |       | ASUS EB572WS VIVOBOOK LAPTOP  |       |                               |          |");  
				 System.out.println("\t   "+"|         |-------------------------------|       |-------------------------------|       |                               |          |");  
				 System.out.println("\t   "+"|         |.G14 Gaming Laptop(AMD Ryzen 7)|       |.Processor:10th Gen Intel core |       |                               |          |");  
				 System.out.println("\t   "+"|         |.R7-4800HS/8GB/1TB SSD/MSO/WQHD|       |  i5-10300H 39.62cm(15.6 inch) |       |             EXIT              |          |");  
				 System.out.println("\t   "+"|         |.4GB Nvidia GeForce GTX 1650   |       |.RAM :8GB/Internal Storage:1TB |       |            ------             |          |");  
				 System.out.println("\t   "+"|         |.RAM :8GB/Internal Storage:1TB |       |.Storage Type : SSD/RAM :16GB  |       |                               |          |");  
				 System.out.println("\t   "+"|         |.29.46 cm(14 inch)/Windows 10  |       |.16GB/512GB/Windows 11/MSO/OLED|       |                               |          |");  
				 System.out.println("\t   "+"|         |.Processor:AMD Ryzen7-R7 4800HS|       |.Internal Storage : 512GB      |       |                               |          |");  
				 System.out.println("\t   "+"|         |.  PRICE  :  44,990.00/-       |       |. PRICE  :  43,590.00/-        |       |                               |          |");  
				 System.out.println("\t   "+"|         |_______________________________|       |_______________________________|       |_______________________________|          |");
				 System.out.println("\t   "+"|                                                                                                                                    |");  
				 System.out.println("\t   "+"|                     4.                                        5.                                       6.                          |");  
				 System.out.println("\t   "+"|                                                                                                                                    |");  	 
				 System.out.println("\t   "+"|____________________________________________________________________________________________________________________________________|");  
				 
				 System.out.println(RESET);	asus30k50kswitch(); 
			}
		//=================================================================================================================================	
			public static void asus30k50kswitch()
			{
				System.out.println("PLEASE CHOOSE YOUR PREFERRED MODEL :");
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
							   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="ASUS EK342WS LAPTOP";ob1[i++]=32990;
							   System.out.print("Do you want to continue shopping in this Budget (Between 30k - 50k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
							   do
							   {
								   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								   switch(c1)	
								   {
								   case 'y':asus30k50k(); b=false; break; // MADE CHANGES HEREE
								   case 'n':asusmenu(); b=false; break; // MADE CHANGES HEREE
								   default : System.out.print("Please enter valid option: ");
								   }
							   }while(b==true);  break;
							   case 'n':
							   {
								   System.out.print("Do you want to see another model in this Budget (Between 30k - 50k) [y/n or Y/N]:");  //MADE CHANGES HERE
								   do
								   {
									   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c1)	
									   {
									   case 'y':asus30k50k(); b=false; break;// MADE CHANGES HERE
									   case 'n':
									   {
										   System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
										   do 
										   {
											   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
											   switch(c2)
											   {
											   case 'y': asusmenu(); b=false; break;
											   case 'n': laptop(); b=false; break;
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
							   case 'y':System.out.println("Your Item is added to cart .");ob[i]="ASUS EJ312WS LAPTOP";ob1[i++]= 35990;
							   System.out.print("Do you want to continue shopping in this Budget (Between 30k - 50k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
							   do
							   {
								   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								   switch(c1)	
								   {
								   case 'y':asus30k50k(); b=false; break; // MADE CHANGES HEREE
								   case 'n':asusmenu(); b=false; break; // MADE CHANGES HEREE
								   default : System.out.print("Please enter valid option: ");
								   }
							   }while(b==true);  break;
							   case 'n':
							   {
								   System.out.print("Do you want to see another model in this Budget (Between 30k - 50k) [y/n or Y/N]:");  //MADE CHANGES HERE
								   do
								   {
									   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c1)	
									   {
									   case 'y':asus30k50k(); b=false; break;// MADE CHANGES HERE
									   case 'n':
									   {
										   System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
										   do 
										   {
											   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
											   switch(c2)
											   {
											   case 'y': asusmenu(); b=false; break;
											   case 'n': laptop(); b=false; break;
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
							   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="ASUS BV322WS VIVOBOOK";ob1[i++]=38990;
							   System.out.print("Do you want to continue shopping in this Budget (Between 30k - 50k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
							   do
							   {
								   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								   switch(c1)	
								   {
								   case 'y':asus30k50k(); b=false; break; // MADE CHANGES HEREE
								   case 'n':asusmenu(); b=false; break; // MADE CHANGES HEREE
								   default : System.out.print("Please enter valid option: ");
								   }
							   }while(b==true);  break;
							   case 'n':
							   {
								   System.out.print("Do you want to see another model in this Budget (Between 30k - 50k) [y/n or Y/N]:");  //MADE CHANGES HERE
								   do
								   {
									   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c1)	
									   {
									   case 'y':asus30k50k(); b=false; break;// MADE CHANGES HERE
									   case 'n':
									   {
										   System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
										   do 
										   {
											   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
											   switch(c2)
											   {
											   case 'y': asusmenu(); b=false; break;
											   case 'n': laptop(); b=false; break;
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
							   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="ASUS BV511WS VIVOBOOK LAPTOP";ob1[i++]=44990;
							   System.out.print("Do you want to continue shopping in this Budget (Between 30k - 50k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
							   do
							   {
								   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								   switch(c1)	
								   {
								   case 'y':asus30k50k(); b=false; break; // MADE CHANGES HEREE
								   case 'n':asusmenu(); b=false; break; // MADE CHANGES HEREE
								   default : System.out.print("Please enter valid option: ");
								   }
							   }while(b==true);  break;
							   case 'n':
							   {
								   System.out.print("Do you want to see another model in this Budget (Between 30k - 50k) [y/n or Y/N]:");  //MADE CHANGES HERE
								   do
								   {
									   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c1)	
									   {
									   case 'y':asus30k50k(); b=false; break;// MADE CHANGES HERE
									   case 'n':
									   {
										   System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
										   do 
										   {
											   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
											   switch(c2)
											   {
											   case 'y': asusmenu(); b=false; break;
											   case 'n': laptop(); b=false; break;
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
							   case 'y':System.out.println("Your Item is added to cart ."); ob[i]="ASUS EB572WS VIVOBOOK LAPTOP";ob1[i++]=43590;
							   System.out.print("Do you want to continue shopping in this Budget (Between 30k - 50k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
							   do
							   {
								   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								   switch(c1)	
								   {
								   case 'y':asus30k50k(); b=false; break; // MADE CHANGES HEREE
								   case 'n':asusmenu(); b=false; break; // MADE CHANGES HEREE
								   default : System.out.print("Please enter valid option: ");
								   }
							   }while(b==true);  break;
							   case 'n':
							   {
								   System.out.print("Do you want to see another model in this Budget (Between 30k - 50k) [y/n or Y/N]:");  //MADE CHANGES HERE
								   do
								   {
									   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c1)	
									   {
									   case 'y':asus30k50k(); b=false; break;// MADE CHANGES HERE
									   case 'n':
									   {
										   System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
										   do 
										   {
											   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
											   switch(c2)
											   {
											   case 'y': asusmenu(); b=false; break;
											   case 'n': laptop(); b=false; break;
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
					   case 6:asusmenu(); b=false; break;// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
					   default: System.out.print("PLEASE ENTER VALID OPTION: ");
					   }
				   }while(b==true);
			}
		//=================================================================================================================================	
			public static void asus50k80k()
			{ System.out.println(RESET);
				 System.out.println("\t   "+" ____________________________________________________________________________________________________________________________________");  
				 System.out.println("\t   "+"|                                                                                                                                    |");  
				 System.out.println("\t   "+"|          _______________________________         _______________________________         _______________________________           |");  
				 System.out.println("\t   "+"|         |     ASUS EB562TS LAPTOP       |       |  ASUS KM512WS VIVOBOOK PRO 14 |       |      ASUS HN356W TUF F15      |          |");  
				 System.out.println("\t   "+"|         |-------------------------------|       |-------------------------------|       |-------------------------------|          |");  
				 System.out.println("\t   "+"|         |.11th Gen Intel Core i5-1135G7 |       |.AMD Ryzen5 5600H Mobile       |       |.10th Gen Intel Core i5-10300H |          |");  
				 System.out.println("\t   "+"|         |.8GB/512GB SSD Plus 32 GB      |       |          obile Processor      |       |.16GB/512GB SSD/Full HD        |          |");  
				 System.out.println("\t   "+"|         |.Free upgrade to Windows 11*   |       |.RAM : 16GB /35.56cm(14 inch)  |       |.4GB Nvidia GeForce GTX 1650   |          |");  
				 System.out.println("\t   "+"|         |.RAM : 8GB                     |       |.Internal Storage : 512GB      |       |  Graphics/Windows 11          |          |");  
				 System.out.println("\t   "+"|         |.Internal Storage : 512GB+32GB |       |.Storage Type : SSD            |       |.10th Gen Intel Core i5-10300H |          |");  
				 System.out.println("\t   "+"|         |.1Year Manufacturer Warranty   |       |.16GB/512GB/Windows 11/MSO/OLED|       |.RAM :16GB/ IS : 512GB         |          |");  
				 System.out.println("\t   "+"|         |.PRICE  :  51,990.00/-         |       |. PRICE  :  59,990.00/-        |       |.  PRICE  :  64,990.00/-       |          |");  
				 System.out.println("\t   "+"|         |_______________________________|       |_______________________________|       |_______________________________|          |");  
				 System.out.println("\t   "+"|                                                                                                                                    |");  
				 System.out.println("\t   "+"|                       1.                                          2.                                       3.                      |");  
				 System.out.println("\t   "+"|                                                                                                                                    |");  
				 System.out.println("\t   "+"|                                                                                                                                    |");  
				 System.out.println("\t   "+"|          _______________________________         _______________________________         _______________________________           |");  
				 System.out.println("\t   "+"|         | ASUS K2067TS ROG ZEPHYRUS G14 |       | ASUS HN356W TUF F15 GAMING LP |       |                               |          |");  
				 System.out.println("\t   "+"|         |-------------------------------|       |-------------------------------|       |                               |          |");  
				 System.out.println("\t   "+"|         |.G14 Gaming Laptop(AMD Ryzen 7)|       |.Processor:10th Gen Intel core |       |                               |          |");  
				 System.out.println("\t   "+"|         |.R7-4800HS/8GB/1TB SSD/MSO/WQHD|       |  i5-10300H 39.62cm(15.6 inch) |       |             EXIT              |          |");  
				 System.out.println("\t   "+"|         |.4GB Nvidia GeForce GTX 1650   |       |.RAM :8GB/Internal Storage:1TB |       |            ------             |          |");  
				 System.out.println("\t   "+"|         |.RAM :8GB/Internal Storage:1TB |       |.Storage Type : SSD/RAM :16GB  |       |                               |          |");  
				 System.out.println("\t   "+"|         |.29.46 cm(14 inch)/Windows 10  |       |.16GB/512GB/Windows 11/MSO/OLED|       |                               |          |");  
				 System.out.println("\t   "+"|         |.Processor:AMD Ryzen7-R7 4800HS|       |.Internal Storage : 512GB      |       |                               |          |");  
				 System.out.println("\t   "+"|         |.  PRICE  :  74,990.00/-       |       |. PRICE  :  76,590.00/-        |       |                               |          |");  
				 System.out.println("\t   "+"|         |_______________________________|       |_______________________________|       |_______________________________|          |");
				 System.out.println("\t   "+"|                                                                                                                                    |");  
				 System.out.println("\t   "+"|                     4.                                        5.                                       6.                          |");  
				 System.out.println("\t   "+"|                                                                                                                                    |");  	 
				 System.out.println("\t   "+"|____________________________________________________________________________________________________________________________________|");  
				 
				 System.out.println(RESET);asus50k80kswitch(); 
			}
		//=================================================================================================================================	
			public static void asus50k80kswitch()
			{
				System.out.println("PLEASE CHOOSE YOUR PREFERRED MODEL :");
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
							   case 'y':System.out.println("Your Item is added to cart .");  ob[i]="ASUS EB562TS LAPTOP";ob1[i++]=51990;
							   System.out.print("Do you want to continue shopping in this Budget (Between 50k - 80k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
							   do
							   {
								   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								   switch(c1)	
								   {
								   case 'y':asus50k80k(); b=false; break; // MADE CHANGES HEREE
								   case 'n':asusmenu(); b=false; break; // MADE CHANGES HEREE
								   default : System.out.print("Please enter valid option: ");
								   }
							   }while(b==true);  break;
							   case 'n':
							   {
								   System.out.print("Do you want to see another model in this Budget (Between 50k - 80k) [y/n or Y/N]:");  //MADE CHANGES HERE
								   do
								   {
									   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c1)	
									   {
									   case 'y':asus50k80k(); b=false; break; //MADE CHANGES
									   case 'n':
									   {
										   System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
										   do 
										   {
											   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
											   switch(c2)
											   {
											   case 'y': asusmenu(); b=false; break;
											   case 'n': laptop(); b=false; break;
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
							   case 'y':System.out.println("Your Item is added to cart .");  ob[i]="ASUS KM512WS VIVOBOOK PRO 14";ob1[i++]=59990;
							   System.out.print("Do you want to continue shopping in this Budget (Between 50k - 80k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
							   do
							   {
								   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								   switch(c1)	
								   {
								   case 'y':asus50k80k(); b=false; break; // MADE CHANGES HEREE
								   case 'n':asusmenu(); b=false; break; // MADE CHANGES HEREE
								   default : System.out.print("Please enter valid option: ");
								   }
							   }while(b==true);  break;
							   case 'n':
							   {
								   System.out.print("Do you want to see another model in this Budget (Between 50k - 80k) [y/n or Y/N]:");  //MADE CHANGES HERE
								   do
								   {
									   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c1)	
									   {
									   case 'y':asus50k80k(); b=false; break; //MADE CHANGES
									   case 'n':
									   {
										   System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
										   do 
										   {
											   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
											   switch(c2)
											   {
											   case 'y': asusmenu(); b=false; break;
											   case 'n': laptop(); b=false; break;
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
							   case 'y':System.out.println("Your Item is added to cart .");  ob[i]="ASUS HN356W TUF F15";ob1[i++]=64990;
							   System.out.print("Do you want to continue shopping in this Budget (Between 50k - 80k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
							   do
							   {
								   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								   switch(c1)	
								   {
								   case 'y':asus50k80k(); b=false; break; // MADE CHANGES HEREE
								   case 'n':asusmenu(); b=false; break; // MADE CHANGES HEREE
								   default : System.out.print("Please enter valid option: ");
								   }
							   }while(b==true);  break;
							   case 'n':
							   {
								   System.out.print("Do you want to see another model in this Budget (Between 50k - 80k) [y/n or Y/N]:");  //MADE CHANGES HERE
								   do
								   {
									   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c1)	
									   {
									   case 'y':asus50k80k(); b=false; break; //MADE CHANGES
									   case 'n':
									   {
										   System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
										   do 
										   {
											   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
											   switch(c2)
											   {
											   case 'y': asusmenu(); b=false; break;
											   case 'n': laptop(); b=false; break;
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
							   case 'y':System.out.println("Your Item is added to cart .");  ob[i]="ASUS K2067TS ROG ZEPHYRUS G14";ob1[i++]=74990;
							   System.out.print("Do you want to continue shopping in this Budget (Between 50k - 80k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
							   do
							   {
								   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								   switch(c1)	
								   {
								   case 'y':asus50k80k(); b=false; break; // MADE CHANGES HEREE
								   case 'n':asusmenu(); b=false; break; // MADE CHANGES HEREE
								   default : System.out.print("Please enter valid option: ");
								   }
							   }while(b==true);  break;
							   case 'n':
							   {
								   System.out.print("Do you want to see another model in this Budget (Between 50k - 80k) [y/n or Y/N]:");  //MADE CHANGES HERE
								   do
								   {
									   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c1)	
									   {
									   case 'y':asus50k80k(); b=false; break; //MADE CHANGES
									   case 'n':
									   {
										   System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
										   do 
										   {
											   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
											   switch(c2)
											   {
											   case 'y': asusmenu(); b=false; break;
											   case 'n': laptop(); b=false; break;
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
							   case 'y':System.out.println("Your Item is added to cart .");  ob[i]="ASUS HN356W TUF F15 GAMING LP";ob1[i++]=76590;
							   System.out.print("Do you want to continue shopping in this Budget (Between 50k - 80k) [y/n or Y/N] :"); // MADE CHANGES HEREE , REMOVED "LN" FROM SYSO
							   do
							   {
								   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
								   switch(c1)	
								   {
								   case 'y':asus50k80k(); b=false; break; // MADE CHANGES HEREE
								   case 'n':asusmenu(); b=false; break; // MADE CHANGES HEREE
								   default : System.out.print("Please enter valid option: ");
								   }
							   }while(b==true);  break;
							   case 'n':
							   {
								   System.out.print("Do you want to see another model in this Budget (Between 50k - 80k) [y/n or Y/N]:");  //MADE CHANGES HERE
								   do
								   {
									   char c1=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
									   switch(c1)	
									   {
									   case 'y':asus50k80k(); b=false; break; //MADE CHANGES
									   case 'n':
									   {
										   System.out.print("Do you want to continue in this brand [y/n or Y/N]:"); //MADE CHANGES HERE
										   do 
										   {
											   char c2=sc.next().toLowerCase().charAt(0); //MADE CHANGES HERE
											   switch(c2)
											   {
											   case 'y': asusmenu(); b=false; break;
											   case 'n': laptop(); b=false; break;
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
					   case 6:asusmenu(); b=false; break;// CHUSUKOOOOO LEKAPOTHEY HAND ISTADHI
					   default: System.out.print("PLEASE ENTER VALID OPTION: ");
					   }
				   }while(b==true);
			}
		//=================================================================================================================================	
//			public static void main(String[] args) 
//			{
//				laptop();
//			}

			
		

	}


