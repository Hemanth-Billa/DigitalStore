package home_screen;

import smartphones_Tablets.*;
import television.*;
import audio.*;
import home_appliances.*;
import laptops_computers.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.UUID;

public class Main_Home 
{
	static Scanner sc = new Scanner(System.in);
	static boolean b = true;
	private static final String BLACK_BOLD = "\033[1;30m";  // BLACK
	static final String RED_BOLD = "\033[1;31m";    // RED
	private static final String RESET = "\033[0m";  // Text Reset
	
	public static void realOne() throws Exception
	{
	    System.out.println("                     *****  *****                                                                                        *****  *****                      ");
	    Thread.sleep(200);
	    System.out.println("                    **    **    **                                                                                      **    **    **                     ");
	    Thread.sleep(200);
		System.out.println("                   **     **     **                                                                                    **     **     **                    ");
		Thread.sleep(200);
		System.out.println("                  **    ******    **                                                                                  **    ******    **                   ");
		Thread.sleep(200);
		System.out.println("                 **    ** ** **    **                                                                                **    ** ** **    **                  ");
		Thread.sleep(200);
		System.out.println("                **    **  **  **    **                                                                              **    **  **  **    **                 ");
		Thread.sleep(200);
		System.out.println("               **    **   **   **    **                                                                            **    **   **   **    **                ");
		Thread.sleep(200);
	    System.out.println("              **    **    **    **    **          "+BLACK_BOLD+"             * SMARTPHONES AND TABLETS *  "+RESET+"                      **    **    **    **    **               ");
	    Thread.sleep(200);
		System.out.println("             **    **     **     **    **         "+BLACK_BOLD+"                        [1]     "+RESET+"                               **    **     **     **    **              ");
		Thread.sleep(200);
		System.out.println("            **    **   ********   **    **                                                                      **    **   ********   **    **             ");
		Thread.sleep(200);
		System.out.println("           **    **   **  **  **   **    **        "+BLACK_BOLD+"            *       TELEVISION        * "+RESET+"                    **    **   **  **  **   **    **            ");
		Thread.sleep(200);
		System.out.println("          **    **   **   **   **   **    **        "+BLACK_BOLD+"                      [2]      "+RESET+"                           **    **   **   **   **   **    **           ");
		Thread.sleep(200);
		System.out.println("         **    **   **    **    **   **    **                                                                **    **   **    **    **   **    **          ");
		Thread.sleep(200);
		System.out.println("        **    **   **     **     **   **    **       "+BLACK_BOLD+"          *     AUDIO DEVICES       *"+RESET+"                  **    **   **     **     **   **    **         ");
		Thread.sleep(200);
		System.out.println("       **    **   **      **      **   **    **       "+BLACK_BOLD+"                    [3]       "+RESET+"                       **    **   **      **      **   **    **        ");
		Thread.sleep(200);
		System.out.println("      **    **   **       **       **   **    **                                                          **    **   **       **       **   **    **       ");
		Thread.sleep(200);
		System.out.println("     **    **   **        **        **   **    **      "+BLACK_BOLD+"        *    HOME APPLIANCES      * "+RESET+"              **    **   **        **        **   **    **      ");
		Thread.sleep(200);
		System.out.println("    **   **    **         **         **   **    **       "+BLACK_BOLD+"                 [4]        "+RESET+"                   **    **   **         **         **   **    **     ");
		Thread.sleep(200);
		System.out.println("   **   **    **          **          **   **    **                                                    **    **   **          **          **   **    **    ");
		Thread.sleep(200);
		System.out.println("   **        **           **           **        **       "+BLACK_BOLD+"     *  LAPTOPS AND MONITORS   * "+RESET+"            **        **           **           **        **    ");
		Thread.sleep(200);
		System.out.println("    **                    **                    **         "+BLACK_BOLD+"               [5]             "+RESET+"              **                    **                    **     ");
		Thread.sleep(200);
		System.out.println("     **                   **                   **                                                        **                   **                   **      ");
		Thread.sleep(200);
		System.out.println("      **                  **                  **            "+BLACK_BOLD+"   *   EXIT FROM SHOPPING    *"+RESET+"                **                  **                  **       ");
		Thread.sleep(200);
		System.out.println("       **                 **                 **              "+BLACK_BOLD+"             [6]            "+RESET+"                  **                 **                 **        ");
		Thread.sleep(200);
		System.out.println("        **                **                **                                                              **                **                **         ");
		Thread.sleep(200);
		System.out.println("        **                **                **                                                              **                **                **         ");
		Thread.sleep(200);
		System.out.println("        **                **                **                                                              **                **                **         ");
		Thread.sleep(200);
		System.out.println("        **                **                **                                                              **                **                **         ");
		Thread.sleep(200);
		System.out.println("       **                ****                **                                                            **                ****                **        ");
		Thread.sleep(200);
		System.out.println("      **               **    **               **                                                          **               **    **               **       ");
		Thread.sleep(200);
		System.out.println("     *******************      *******************                                                        *******************      *******************      ");
		Thread.sleep(200);
		System.out.println("    *******************        *******************                                                      *******************        *******************     ");
		Thread.sleep(200);
		System.out.println("   **               **          **               **                                                    **               **          **               **    ");
		Thread.sleep(200);
		System.out.println("  **               **            **               **                                                  **               **            **               **   ");
		Thread.sleep(200);
		System.out.println(" **               **              **               **                                                **               **              **               **  ");
		realOneSwitch();
	}
	public static void realOneSwitch()
	{
		System.out.print("PLEASE CHOOSE YOUR REQUIREMENT [1-6] : ");
		 do
		 {
			 int m=sc.nextInt();
			 switch(m)
			 {
			 case 1: mobilesAndTablets();b=false; break;
			 case 2: television(); b=false; break;
			 case 3: audios();b=false; break;
			 case 4: home$Appliances();b=false; break;
			 case 5: laptops$Monitors();b=false; break;
			 case 6: Exitt();; b=false; break;
			 default:  System.out.print("Please enter valid option:");
			 }
		 }while(b==true);
	}
	public static void Exitt()
	{
		System.out.println("\t\t\t\t\t\t    WE ARE SAD THAT YOU HAVE LEFT US WITHOUT SHOPPING....");
	}
	
	public static void main_5()
	{
		System.out.println();
		System.out.println(BLACK_BOLD+"\t"+"\t\t\t\t            -------------------------> MAIN MENU <-------------------------    ");
		System.out.println("\t"+"\t      ____________________________________________________________________________________________________________");
		System.out.println("\t"+"\t     |                                                                                                            |");
		System.out.println("\t"+"\t     |                                                                                                            |");
		System.out.println("\t"+"\t     |       * SMARTPHONES AND TABLETS *              * TELEVISION *                   * AUDIO DEVICES *          |");
		System.out.println("\t"+"\t     |                                                                                                            |");   
		System.out.println("\t"+"\t     |                    [1]                              [2]                               [3]                  |");
		System.out.println("\t"+"\t     |                                                                                                            |");
		System.out.println("\t"+"\t     |                                                                                                            |");
		System.out.println("\t"+"\t     |            * HOME APPLIANCES *            * LAPTOPS AND COMPUTERS *             * CART AND BILL *          |");
		System.out.println("\t"+"\t     |                                                                                                            |");
		System.out.println("\t"+"\t     |                    [4]                              [5]                               [6]                  |");
		System.out.println("\t"+"\t     |                                                                                                            |");
		System.out.println("\t"+"\t     |____________________________________________________________________________________________________________|"+RESET);
		System.out.println(RESET);
		System.out.println();
		main_5switch();
	}
	public static void main_5switch()
	{
		System.out.print("PLEASE CHOOSE YOUR REQUIREMENT [1-6] :");
		 do
		 {
			 int m=sc.nextInt();
			 switch(m)
			 {
			 case 1: mobilesAndTablets();b=false; break;
			 case 2: television(); b=false; break;
			 case 3: audios();b=false; break;
			 case 4: home$Appliances();b=false; break;
			 case 5: laptops$Monitors();b=false; break;
			 case 6: cartAndBill(); b=false; break;
			 default:  System.out.print("Please enter valid option:");
			 }
		 }while(b==true);
	}
	public static void mobilesAndTablets()
	{
		System.out.println();
		System.out.println(BLACK_BOLD+"\t"+"\t\t\t            -------------------------> SMARTPHONES AND TABLETS MENU <-------------------------    ");
		System.out.println("\t"+"\t      ____________________________________________________________________________________________________________");
		System.out.println("\t"+"\t     |                                                                                                            |");
		System.out.println("\t"+"\t     |                                                                                                            |");
		System.out.println("\t"+"\t     |              * SMARTPHONES *                 * KEYPAD MOBILES *                   * TABLETS *              |");
		System.out.println("\t"+"\t     |                                                                                                            |");   
		System.out.println("\t"+"\t     |                    [1]                              [2]                               [3]                  |");
		System.out.println("\t"+"\t     |                                                                                                            |");
		System.out.println("\t"+"\t     |                                                                                                            |");
		System.out.println("\t"+"\t     |                                    * EXIT FROM SMARTPHONES AND TABLETS *                                   |");
		System.out.println("\t"+"\t     |                                                                                                            |");
		System.out.println("\t"+"\t     |                                                     [4]                                                    |");
		System.out.println("\t"+"\t     |                                                                                                            |");
		System.out.println("\t"+"\t     |____________________________________________________________________________________________________________|"+RESET);
    	System.out.println(RESET);
		System.out.println();
		mobilesAndTabletsswitch();
	}
	public static void mobilesAndTabletsswitch()
	{
		System.out.print("PLEASE CHOOSE YOUR REQUIREMENT [1-4] :");
		 do
		 {
			 int m=sc.nextInt();
			 switch(m)
			 {
			 case 1: Smartphones.display();b=false; break;
			 case 2: Keypad.Option(); b=false; break;
			 case 3: Tablets.display();b=false; break;
			 case 4: main_5(); b=false; break;
			 default:  System.out.print("Please enter valid option:");
			 }
		 }while(b==true);
	}
	public static void audios()
	{
		System.out.println();
		System.out.println(BLACK_BOLD+"\t"+"\t\t\t\t        -------------------------> AUDIO DEVICES MENU <-------------------------    ");
		System.out.println("\t"+"\t      ____________________________________________________________________________________________________________");
		System.out.println("\t"+"\t     |                                                                                                            |");
		System.out.println("\t"+"\t     |                                                                                                            |");
		System.out.println("\t"+"\t     |              * HEADPHONES *                   * NECKBANDS *                   * SMART SPEAKERS *           |");
		System.out.println("\t"+"\t     |                                                                                                            |");   
		System.out.println("\t"+"\t     |                   [1]                              [2]                               [3]                   |");
		System.out.println("\t"+"\t     |                                                                                                            |");
		System.out.println("\t"+"\t     |                                                                                                            |");
		System.out.println("\t"+"\t     |              * SOUND BARS *                 * TRUE WIRELESS *                * WIRED EARPHONES *           |");
		System.out.println("\t"+"\t     |                                                                                                            |");
		System.out.println("\t"+"\t     |                   [4]                              [5]                               [6]                   |");
		System.out.println("\t"+"\t     |                                                                                                            |");
		System.out.println("\t"+"\t     |                                                                                                            |");
		System.out.println("\t"+"\t     |                                        * EXIT FROM AUDIO DEVICES *                                         |");
		System.out.println("\t"+"\t     |                                                                                                            |");
		System.out.println("\t"+"\t     |                                                    [7]                                                     |");
		System.out.println("\t"+"\t     |____________________________________________________________________________________________________________|"+RESET);
		System.out.println(RESET);
		System.out.println();
		audiosSwitch();
	}
	public static void audiosSwitch()
	{
		System.out.print("PLEASE CHOOSE YOUR REQUIREMENT [1-7] :");
		 do
		 {
			 int m=sc.nextInt();
			 switch(m)
			 {
			 case 1: Headphones.Menu();b=false; break;
			 case 2: Neckbands.neckband(); b=false; break;
			 case 3: Smart_Speakers.display();b=false; break;
			 case 4: Sound_Bars.Main();b=false; break;
			 case 5: TrueWireless.display();b=false; break;
			 case 6: Wired_Earphones.wired();b=false; break;
			 case 7: main_5(); b=false; break;
			 default:  System.out.print("Please enter valid option:");
			 }
		 }while(b==true);
	}
	public static void home$Appliances()
	{
		System.out.println();
		System.out.println(BLACK_BOLD+"\t"+"\t\t\t                -------------------------> HOME APPLIANCES MENU <-------------------------    ");
		System.out.println("\t"+"\t      ____________________________________________________________________________________________________________");
		System.out.println("\t"+"\t     |                                                                                                            |");
		System.out.println("\t"+"\t     |                                                                                                            |");
		System.out.println("\t"+"\t     |             * AIR CONDITIONERS *                 * FANS *                   * REFRIGERATORS *              |");
		System.out.println("\t"+"\t     |                                                                                                            |");   
		System.out.println("\t"+"\t     |                    [1]                              [2]                            [3]                     |");
		System.out.println("\t"+"\t     |                                                                                                            |");
		System.out.println("\t"+"\t     |                                                                                                            |");
		System.out.println("\t"+"\t     |            * WASHING MACHINES *            * EXIT HOME APPLIANCES *                                        |");
		System.out.println("\t"+"\t     |                                                                                                            |");
		System.out.println("\t"+"\t     |                    [4]                              [5]                                                    |");
		System.out.println("\t"+"\t     |                                                                                                            |");
		System.out.println("\t"+"\t     |____________________________________________________________________________________________________________|"+RESET);
		System.out.println();
		System.out.println(RESET);
		home$AppliancesSwitch();
	}
	public static void home$AppliancesSwitch()
	{
		System.out.print("PLEASE CHOOSE YOUR REQUIREMENT [1-5] :");
		 do
		 {
			 int m=sc.nextInt();
			 switch(m)
			 {
			 case 1: Air_Conditioners.AirConditioners();  b=false; break;
			 case 2: Fans.fans(); b=false; break;
			 case 3: Refrigerator.Refrigerators();b=false; break;
			 case 4: Washing_Machines.WashingMachines(); b=false; break;
			 case 5: main_5(); b=false; break;
			 default:  System.out.print("Please enter valid option:");
			 }
		 }while(b==true);
	}
	public static void laptops$Monitors()
	{
		System.out.println();
		System.out.println(BLACK_BOLD+"\t"+"\t\t\t             -------------------------> LAPTOPS AND MONITORS MENU <-------------------------    ");
		System.out.println("\t"+"\t      ____________________________________________________________________________________________________________");
		System.out.println("\t"+"\t     |                                                                                                            |");
		System.out.println("\t"+"\t     |                                                                                                            |");
		System.out.println("\t"+"\t     |           * LAPTOPS *                * MONITORS *              * EXIT FROM LAPTOPS AND MONITORS *          |");
		System.out.println("\t"+"\t     |                                                                                                            |");   
		System.out.println("\t"+"\t     |               [1]                        [2]                               [3]                             |");
		System.out.println("\t"+"\t     |                                                                                                            |");
		System.out.println("\t"+"\t     |____________________________________________________________________________________________________________|"+RESET);
		System.out.println(RESET);
		System.out.println();
		laptops$MonitorsSwitch();
	}
	public static void laptops$MonitorsSwitch()
	{
		System.out.print("PLEASE CHOOSE YOUR REQUIREMENT [1-3] :");
		 do
		 {
			 int m=sc.nextInt();
			 switch(m)
			 {
			 case 1: Laptops.laptop();b=false; break;
			 case 2: Monitors.monitor(); b=false; break;
			 case 3: main_5(); b=false; break;
			 default:  System.out.print("Please enter valid option:");
			 }
		 }while(b==true);
	}
	public static void television()
	{
		System.out.println();
		System.out.println(BLACK_BOLD+"\t"+"\t\t\t           -------------------------> TELEVISIONS MENU <-------------------------    ");
		System.out.println("\t"+"\t      ____________________________________________________________________________________________________________");
		System.out.println("\t"+"\t     |                                                                                                            |");
		System.out.println("\t"+"\t     |                                                                                                            |");
		System.out.println("\t"+"\t     |                       * TELEVISIONS *                        * EXIT FROM TELEVISONS *                      |");
		System.out.println("\t"+"\t     |                                                                                                            |");   
		System.out.println("\t"+"\t     |                            [1]                                        [2]                                  |");
		System.out.println("\t"+"\t     |                                                                                                            |");
		System.out.println("\t"+"\t     |____________________________________________________________________________________________________________|"+RESET);
		System.out.println(RESET);
		System.out.println();
		televisionswitch();
	}
	public static void televisionswitch()
	{
		System.out.print("PLEASE CHOOSE YOUR REQUIREMENT [1-2] :");
		 do
		 {
			 int m=sc.nextInt();
			 switch(m)
			 {
			 case 1: Television.tvList();;b=false; break;
			 case 2: main_5(); b=false; break;
			 default:  System.out.print("Please enter valid option :");
			 }
		 }while(b==true);
	}
	public static void cartAndBill()
	{
		String s[]=new String[1600];
		float s1[]=new float[1600];
		int s3[]=new int[1600];
		int a=0;int c=0;int b=1;String h="";float sum=0f;
		for(int i=0;i<s.length;i++)
		{
			if(i<100)
			{
				s[i]=Keypad.ob[a];s1[i]=Keypad.ob1[a++];
				if(i==(100-1))a=0;
			}
	
			else if(i<200)
			{
				s[i]=Smartphones.ob[a];s1[i]=Smartphones.ob1[a++];
				if(i==(200-1))a=0;
			}
		
			else if(i<300)
			{
				s[i]=Tablets.ob[a];s1[i]=Tablets.ob1[a++];
				if(i==(300-1))a=0;
			}
			
			else if(i<400)
			{
				s[i]=Television.ob[a];s1[i]=Television.ob1[a++];
				if(i==(400-1))a=0;
			}
			
			else if(i<500)
			{
				s[i]=Headphones.ob[a];s1[i]=Headphones.ob1[a++];
				if(i==(500-1))a=0;
			}
			
			else if(i<600)
			{
				s[i]=Neckbands.ob[a];s1[i]=Neckbands.ob1[a++];
				if(i==(600-1))a=0;
			}
			
			else if(i<700)
			{
				s[i]=Smart_Speakers.ob[a];s1[i]=Smart_Speakers.ob1[a++];
				if(i==(700-1))a=0;
			}
			
			else if(i<800)
			{
				s[i]=Sound_Bars.ob[a];s1[i]=Sound_Bars.ob1[a++];
				if(i==(800-1))a=0;
			}
			
			else if(i<900)
			{
				s[i]=TrueWireless.ob[a];s1[i]=TrueWireless.ob1[a++];
				if(i==(900-1))a=0;
			}
			
			else if(i<1000)
			{
				s[i]=Wired_Earphones.ob[a];s1[i]=Wired_Earphones.ob1[a++];
				if(i==(1000-1))a=0;
			}
			
			else if(i<1100)
			{
				s[i]=Air_Conditioners.ob[a];s1[i]=Air_Conditioners.ob1[a++];
				if(i==(1100-1))a=0;
			}
			
			else if(i<1200)
			{
				s[i]=Fans.ob[a];s1[i]=Fans.ob1[a++];
				if(i==(1200-1))a=0;
			}
			
			else if(i<1300)
			{
				s[i]=Refrigerator.ob[a];s1[i]=Refrigerator.ob1[a++];
				if(i==(1300-1))a=0;
			}
			
			else if(i<1400)
			{
				s[i]=Washing_Machines.ob[a];s1[i]=Washing_Machines.ob1[a++];
				if(i==(1400-1))a=0;
			}
			
			else if(i<1500)
			{
				s[i]=Laptops.ob[a];s1[i]=Laptops.ob1[a++];
				if(i==(1500-1))a=0;
			}
			
			else if(i<1600)
			{
				s[i]=Monitors.ob[a];s1[i]=Monitors.ob1[a++];
				if(i==(1600-1))a=0;
			}

		}

		System.out.println("\n\t\t\t      **********************************************************************************************");//ADD HERE
		System.out.println("\t\t\t      *                                   YOUR CART ITEMS                                          *");//ADD HERE
		System.out.println("\t\t\t      **********************************************************************************************");//ADD HERE
		System.out.println("\t\t\t      * S.NO \t ITEM NAME \t\t\t\t  QUANTITY \t\t PRICE             *");//ADD HERE
		System.out.println("\t\t\t      **********************************************************************************************");//ADD HERE
		for(int i=0;i<s.length;i++)
		{
			c=1;
			for(int j=i+1;j<s.length;j++)
			{
				if(s[i]==s[j]) { s[j]=null;s1[j]=0;c++;}
			}
			s3[i]=c;
		}
		for(int i=0;i<s.length;i++)
		{
			       if(s[0]==null && s[100]==null && s[200]==null && s[300]==null && s[400]==null && s[500]==null
					&& s[600]==null && s[700]==null && s[800]==null && s[900]==null && s[1000]==null && s[1100]==null
					&&s[1200]==null && s[1300]==null && s[1400]==null && s[1500]==null && s[1599]==null)
			        {
			    	   System.out.println();
			    	   System.out.println("\t\t\t"+"\t\t\t     "+"OOPS YOU HAVE NOT ADDED ANY ITEM INTO YOUR CART....");  
			    	   System.out.println("\n"+"\t\t\t"+"\t\t      "+"IF YOU WANT TO CONTINUE SHOPPING PRESS [1] , OR [2] FOR EXIT");
			    	   boolean b1 = true;
			    	   do
			    	   {
			    		   int n=sc.nextInt();
			    		 switch(n)
			    		 {
			    		 case 1: main_5(); b1=false; break;
			    		 case 2: Exitt(); b1=false; break;
			    		 default : System.out.print("Please Enter valid option : ");
			    		 }
			    	   }while(b1==true); return;
			        }
					else 
					{
						h="";
						if(s[i]!=null)
						{
						System.out.print("\t\t\t      *  "+(b++)+"\t "+s[i]);//ADD HERE ONLY FOR *
						for(int j=0;j<=45-s[i].length();j++)
						{
							System.out.print(" ");
						}
						System.out.print(s3[i]+" \t\t "+s3[i]*s1[i]);
						h=h+s3[i]*s1[i];sum+=s3[i]*s1[i];
						for(int k=1;k<18-h.length();k++)
						{
							System.out.print(" ");
						}
						System.out.print(" *\n");
						}
					}
		}
		h="";
		h=h+sum;
		System.out.println("\t\t\t      **********************************************************************************************");//ADD HERE
		System.out.print("\t\t\t      *\t\t\t\t\t\t\t\t    TOTAL PRICE : "+sum);//ADD HERE BEFORE *
		for(int k1=0;k1<17-h.length();k1++)
		{
			System.out.print(" ");
		}
		System.out.println("*\n\t\t\t      **********************************************************************************************");//ADD HERE
		System.out.println();
		System.out.println("\t\t\t\t\t\t"+"FOR CHANGING QUANTITY PRESS [1] , FOR BILL PRESS [2]");
		boolean b1 = true;
 	   do
 	   {
 		   int n2=sc.nextInt();
 		 switch(n2)
 		 {
 		 case 1: Cart(s,s1,s3); b1=false; break;
 		 case 2: bill(sum);; b1=false; break;
 		 default : System.out.println("Please Enter Valid Option");
 		 }
 	   }while(b1==true);
	}
	@SuppressWarnings("resource")
	public static void Cart(String a[],float a1[],int a2[])
	{
		boolean b2 = true;
		Scanner sc22 = new Scanner(System.in);
		System.out.println("ENTER ITEM NAME PRESENT IN CART : ");
		String S=sc22.nextLine();
		int n1 = 0;
		int n2 = 0;int n;
		do
		{
//			System.out.println("NOTE ----> ENTERING [0] OR LESS THAN [0] WILL DELETE THE ITEM FROM CART");
			System.out.print("For Increasing Quantity Enter [1] , For Decreasing Quantity Enter [2] : ");
			n=new Scanner(System.in).nextInt();
			switch(n)
			{
			case 1 : System.out.print("Enter the Quantity You Want To Increase : ");  n1=new Scanner(System.in).nextInt(); b2=false; break;
			case 2 :{ System.out.println(RED_BOLD+"NOTE ----> IF YOU ENTER A QUANTITY THAT EXCEEDS THE QUANTITY PRESENT IN THE CART THE ITEM WILL BE DELETED"+RESET);
				System.out.print("Enter the Quantity You Want To Decrease : ");  n2=new Scanner(System.in).nextInt(); b2=false; break;}
			default : System.out.print("Please Enter Valid Option : ");
			}	
		}while(b2 == true);
		int b=1;String h="";float sum=0f;
		String s[]=a;float s1[]=a1;int s2[]=a2;
		System.out.println("\n\t\t\t      **********************************************************************************************");//ADD HERE
		System.out.println("\t\t\t      *                                   YOUR CART ITEMS                                          *");//ADD HERE
		System.out.println("\t\t\t      **********************************************************************************************");//ADD HERE
		System.out.println("\t\t\t      * S.NO \t ITEM NAME \t\t\t\t  QUANTITY \t\t PRICE             *");//ADD HERE
		System.out.println("\t\t\t      **********************************************************************************************");//ADD HERE
		for(int i=0;i<s.length;i++)
		{

			h="";
			if(S.equals(s[i]))
			{
				if(n==1)
				{
					s2[i]=n1+s2[i];
				}
				else 
				{
					s2[i]=s2[i]-n2;
					if(s2[i]<=0)s[i]=null;
				}
			}
			
			if(s[i]!=null)
			{
				System.out.print("\t\t\t      *  "+(b++)+"\t "+s[i]);//ADD HERE ONLY FOR *
			for(int j=0;j<=45-s[i].length();j++)
			{
				System.out.print(" ");
			}
			System.out.print(s2[i]+" \t\t "+s2[i]*s1[i]);
			h=h+s2[i]*s1[i];sum+=s2[i]*s1[i];
			for(int k=1;k<18-h.length();k++)
			{
				System.out.print(" ");
			}
			System.out.print(" *\n");
			}
		}
		h=h+sum;
		System.out.println("\t\t\t      **********************************************************************************************");//ADD HERE
		System.out.print("\t\t\t      *\t\t\t\t\t\t\t\t    TOTAL PRICE : "+sum);//ADD HERE BEFORE *
		for(int k1=0;k1<17-h.length();k1++)
		{
			System.out.print(" ");
		}
		System.out.println("*\n\t\t\t      **********************************************************************************************");//ADD HERE
		System.out.println();
		System.out.println("\t\t\t\t\t\t"+"FOR CHANGING QUANTITY PRESS [1] , FOR BILL PRESS [2]");
		boolean b1 = true;
 	   do
 	   {
 		   int n3=sc.nextInt();
 		 switch(n3)
 		 {
 		 case 1: Cart(s,s1,s2); b1=false; break;
 		 case 2: bill(sum);; b1=false; break;
 		 default : System.out.print("Please Enter valid option : ");
 		 }
 	   }while(b1==true);
		
	}
	public static void bill(float price)
	{
		LocalDateTime now = LocalDateTime.now();
		String transactionID = UUID.randomUUID().toString();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String formattedDateTime = now.format(formatter);
		float discount = 0; float gstRate = 0.09f; float gst = 0; float finalBill =0;
		if(price < 10000)
		{
			finalBill += price;
		}
		else if(price>=10000 && price<50000)
		{
			gst = price * gstRate;
			discount = (float)(gst * 0.05);
			finalBill = price + gst - discount;
		}
		else if(price>=50000 && price<200000)
		{
			gst = price * gstRate;
			discount = (float)(gst * 0.1);
			finalBill = price + gst - discount;
		}
		else if(price>=200000)
		{
			gst = price * gstRate;
			discount = (float)(gst * 0.2);
			finalBill = price + gst - discount;
		}		
		System.out.println("\t\t"+"\t\t\t\t  "+BLACK_BOLD+"━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
		System.out.println("\t\t"+"\t\t\t\t  "+"━━━━━━━━━━━━━━━━━━━━━━━WELCOME TO DIGITAL POINT━━━━━━━━━━━━━━━━━━━━━━━━");
		System.out.println("\t\t"+"\t\t\t\t  "+"━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
		System.out.println("\t\t"+"\t\t\t\t  "+"Total Bill Of Purchased Items : "+price+" /-");
		System.out.println("\t\t"+"\t\t\t\t  "+"The GST For Items (9%)        : "+gst+" /-");
		System.out.println("\t\t"+"\t\t\t\t  "+"The Discount Given For Bill   : "+discount+" /-");
		System.out.println("\t\t"+"\t\t\t\t  "+"Name                          : "+Register.getfullName());
		System.out.println("\t\t"+"\t\t\t\t  "+"Phone No                      : "+Register.getPhoneNo());
		System.out.println("\t\t"+"\t\t\t\t  "+"TRANSACTION ID                : "+transactionID.substring(0, 18));
		System.out.println("\t\t"+"\t\t\t\t  "+"Date And Time                 : "+formattedDateTime);
		System.out.println("\t\t"+"\t\t\t\t  "+"THANK YOU FOR SHOPPING WITH US.......");
		System.out.println("\t\t"+"\t\t\t\t  "+"━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
		System.out.println("\t\t"+"\t\t\t\t  "+"The Final Bill After Discount And GST : "+finalBill+" /-");
		System.out.println("\t\t"+"\t\t\t\t  "+"━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━"+RESET);
		try {
			Payment.pay();
		} catch (InterruptedException e) 
		{
			System.out.println("Exception at Main Home");
		}
		
	}
	public static void main(String[] args) throws InterruptedException 
	{
     	Opening.Open();
	}
}
