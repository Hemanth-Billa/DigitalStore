package home_screen;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.UUID;

public class Payment 
{
	private static final String BLACK_BOLD = "\033[1;30m";  // BLACK
	private static final String RESET = "\033[0m";  // Text Reset
	private static final String GREEN_BOLD = "\033[1;32m";  // GREEN
	private static final String RED = "\033[1;31m";    // RED
	static LocalDateTime now = LocalDateTime.now();
	static String transactionID = UUID.randomUUID().toString();
	static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	static String formattedDateTime = now.format(formatter);
	static boolean b=true;
	static Scanner sc=new Scanner(System.in);
//   public static void main(String[] args) throws InterruptedException 
//   {
//	   pay();
//   }
   
   public static void pay() throws InterruptedException
   {
	
	     System.out.println();
		 System.out.println("\t\t\t\t\t\t           "+" ________________________________");
		 System.out.println("\t\t\t\t\t\t           "+"|                                |");
		 System.out.println("\t\t\t\t\t\t           "+"|   * UPI *       * CARD *       |");
		 System.out.println("\t\t\t\t\t\t           "+"|     [1]           [2]          |");
		 System.out.println("\t\t\t\t\t\t           "+"|________________________________|");
		 mainswitch();
   }
   public static void mainswitch() throws InterruptedException
   {
	   System.out.print("PLEASE CHOOSE YOUR PAYMENT METHOD :");  
	   do
	   {
		   int n=sc.nextInt();
		 switch(n)
		 {
		 case 1: UPI(); b=false; break;
		 case 2: Card(); b=false; break;
		 default : System.out.print("Please Enter valid option : ");
		 }
	   }while(b==true);
   }
   public static void UPI()
   {
	     System.out.println();
		 System.out.println("\t\t\t\t\t\t           "+" ________________________________");
		 System.out.println("\t\t\t\t\t\t           "+"|                                |");
		 System.out.println("\t\t\t\t\t\t           "+"|          1. GOOGLE PAY         | ");
		 System.out.println("\t\t\t\t\t\t           "+"|          2. PHONE PAY          | ");
		 System.out.println("\t\t\t\t\t\t           "+"|          3. PAYTM              | ");
		 System.out.println("\t\t\t\t\t\t           "+"|________________________________| ");
		 UPIswitch();
   }
   public static void UPIswitch()
   {
	   System.out.print("PLEASE CHOOSE YOUR PAYMENT METHOD : ");  
	   do
	   {
		   int n=sc.nextInt();
		 switch(n)
		 {
		 case 1: GooglePay(); b=false; break;
		 case 2: PhonePay(); b=false; break;
		 case 3: Paytm(); b=false; break;
		 default : System.out.print("Please Enter valid option : ");
		 }
	   }while(b==true);  
   }
   public static void GooglePay()
   {
   	    System.out.println();
		System.out.println("\t\t\t\t\t              "+BLACK_BOLD+"****************DIGITAL STORE****************");
		System.out.println("\t\t\t\t\t              "+"*                                           *");
		System.out.println("\t\t\t\t\t              "+"*                                           *");
		System.out.println("\t\t\t\t\t              "+"*"+"\t\t "+"  ████████████████████           *\n" + 
				"\t\t\t\t\t      "+"        *"+"\t\t "+ "  ██ ▄▄▄▄▄ ██▀▄▄▀█ ▄██           *\n" +
				"\t\t\t\t\t      "+"        *"+"\t\t "+"  ██ █   █ █ ▀ ▀ █ ███           *\n" +
				"\t\t\t\t\t      "+"        *"+"\t\t "+"  ██ █▄▄▄█ ██▀█ ▀ ████           *\n" +
				"\t\t\t\t\t      "+"        *"+"\t\t "+"  ██▄▄▄▄▄▄▄█ ▀ █ ▀█▄██           *\n" +
				"\t\t\t\t\t      "+"        *"+"\t\t "+"  ██ ▀  ▀█  ▀█  ██  ██           *\n" +
				"\t\t\t\t\t      "+"        *"+"\t\t "+"  ██▄▄▄▄▄▄▄█ ▀ █ ▀█▄██           *\n" +
				"\t\t\t\t\t      "+"        *"+"\t\t "+"  ████████████████████           *");
		System.out.println("\t\t\t\t\t              "+"*                                           *");
		System.out.println("\t\t\t\t\t              *      "+"UPI ID : DigiatalStoreBatch17@NIT"+"    *");
		System.out.println("\t\t\t\t\t              "+"*                                           *");
		System.out.println("\t\t\t\t\t              *     "+"TRANSACTION ID : "+transactionID.substring(0, 18)+"   *");
		System.out.println("\t\t\t\t\t              "+"*                                           *");
		System.out.println("\t\t\t\t\t      "+"        *"+"\t\t "+" SCAN THIS CODE TO PAY"+"           *");
		System.out.println("\t\t\t\t\t              "+"*                                           *");
		System.out.println("\t\t\t\t\t      "+"        *"+"\t\t    "+ formattedDateTime+"           *"); 
		System.out.println("\t\t\t\t\t              "+"*                                           *");
		System.out.println("\t\t\t\t\t      "+"        *"+"\t\t"+ "******HAPPY SHOPPING******"+"        *");
		System.out.println("\t\t\t\t\t              "+"*                                           *");
		System.out.println("\t\t\t\t\t      "+"        *"+"\t       "+ "******HAVE A GREAT DAY******"+"       *");
		System.out.println("\t\t\t\t\t              "+"*                                           *");
		System.out.println("\t\t\t\t\t              "+"*********************************************"+RESET);
		System.out.println();
		System.out.println("YOUR TRANSACTION HAS BEEN PROCESSING PLEASE WAIT.......");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
		}
		System.out.println(GREEN_BOLD+"TRANSACTION SUCCESSFUL......."+RESET);
		 System.out.println(BLACK_BOLD);
		   String intro ="""
				                	    DEAR VALUED CUSTOMER,

THANK YOU FOR CHOOSING TO SHOP WITH US AT OUR DIGITAL STORE. WE APPRECIATE YOUR BUSINESS AND HOPE THAT YOU HAD A PLEASANT SHOPPING EXPERIENCE. WE STRIVE TO\n\nPROVIDE THE BEST PRODUCTS AND SERVICES TO OUR CUSTOMERS AND YOUR SATISFACTION IS OUR TOP PRIORITY.

THANK YOU AGAIN FOR YOUR TIME AND WE LOOK FORWARD TO SERVING YOU AGAIN IN THE FUTURE.

BEST REGARDS, [YOUR DIGITAL STORE]  \n\n\t\t\t  ------------------------------> DONE BY - HEMANTH , SAHITHI , YEDUKONDALU , LAXMI <------------------------------ \n\n\t\t\t\t\t\t\t\t ****BATCH 17****

					""";
			for(int i = 0 ; i < intro.length(); i++)
			{
				System.out.print(intro.charAt(i));
				try {
					Thread.sleep(15);
				} catch (InterruptedException e) {
				}
			}
			System.out.println(RESET);

   }
   public static void PhonePay()
   {
	   System.out.println();
//		System.out.println("WE WILL ADD TOTAL PRICE HERE");
		System.out.println("\t\t\t\t\t              "+BLACK_BOLD+"****************DIGITAL STORE****************");
		System.out.println("\t\t\t\t\t              "+"*                                           *");
		System.out.println("\t\t\t\t\t              "+"*                                           *");
		System.out.println("\t\t\t\t\t              "+"*"+"\t\t "+"  ████████████████████           *\n" + 
				"\t\t\t\t\t      "+"        *"+"\t\t "+ "  ██ ▄▄▄▄▄ ██▀▄▄▀█ ▄██           *\n" +
				"\t\t\t\t\t      "+"        *"+"\t\t "+"  ██ █   █ █ ▀ ▀ █ ███           *\n" +
				"\t\t\t\t\t      "+"        *"+"\t\t "+"  ██ █▄▄▄█ ██▀█ ▀ ████           *\n" +
				"\t\t\t\t\t      "+"        *"+"\t\t "+"  ██▄▄▄▄▄▄▄█ ▀ █ ▀█▄██           *\n" +
				"\t\t\t\t\t      "+"        *"+"\t\t "+"  ██ ▀  ▀█  ▀█  ██  ██           *\n" +
				"\t\t\t\t\t      "+"        *"+"\t\t "+"  ██▄▄▄▄▄▄▄█ ▀ █ ▀█▄██           *\n" +
				"\t\t\t\t\t      "+"        *"+"\t\t "+"  ████████████████████           *");
		System.out.println("\t\t\t\t\t              "+"*                                           *");
		System.out.println("\t\t\t\t\t              *      "+"UPI ID : DigiatalStoreBatch17@NIT"+"    *");
		System.out.println("\t\t\t\t\t              "+"*                                           *");
		System.out.println("\t\t\t\t\t              *     "+"TRANSACTION ID : "+transactionID.substring(0, 18)+"   *");
		System.out.println("\t\t\t\t\t              "+"*                                           *");
		System.out.println("\t\t\t\t\t      "+"        *"+"\t\t "+" SCAN THIS CODE TO PAY"+"           *");
		System.out.println("\t\t\t\t\t              "+"*                                           *");
		System.out.println("\t\t\t\t\t      "+"        *"+"\t\t    "+ formattedDateTime+"           *"); 
		System.out.println("\t\t\t\t\t              "+"*                                           *");
		System.out.println("\t\t\t\t\t      "+"        *"+"\t\t"+ "******HAPPY SHOPPING******"+"        *");
		System.out.println("\t\t\t\t\t              "+"*                                           *");
		System.out.println("\t\t\t\t\t      "+"        *"+"\t       "+ "******HAVE A GREAT DAY******"+"       *");
		System.out.println("\t\t\t\t\t              "+"*                                           *");
		System.out.println("\t\t\t\t\t              "+"*********************************************"+RESET);
		System.out.println();
		System.out.println("YOUR TRANSACTION HAS BEEN PROCESSING PLEASE WAIT.......");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
		}
		System.out.println(GREEN_BOLD+"TRANSACTION SUCCESSFUL......."+RESET);
		 System.out.println(BLACK_BOLD);
		   String intro ="""
				                	    DEAR VALUED CUSTOMER,

THANK YOU FOR CHOOSING TO SHOP WITH US AT OUR DIGITAL STORE. WE APPRECIATE YOUR BUSINESS AND HOPE THAT YOU HAD A PLEASANT SHOPPING EXPERIENCE. WE STRIVE TO\n\nPROVIDE THE BEST PRODUCTS AND SERVICES TO OUR CUSTOMERS AND YOUR SATISFACTION IS OUR TOP PRIORITY.

THANK YOU AGAIN FOR YOUR TIME AND WE LOOK FORWARD TO SERVING YOU AGAIN IN THE FUTURE.

BEST REGARDS, [YOUR DIGITAL STORE]  \n\n\t\t\t  ------------------------------> DONE BY - HEMANTH , SAHITHI , YEDUKONDALU , LAXMI <------------------------------ \n\n\t\t\t\t\t\t\t\t ****BATCH 17****

					""";
			for(int i = 0 ; i < intro.length(); i++)
			{
				System.out.print(intro.charAt(i));
				try {
					Thread.sleep(15);
				} catch (InterruptedException e) {
				}
			}
			System.out.println(RESET);
   }
   public static void Paytm()
   {
//		System.out.println("WE WILL ADD TOTAL PRICE HERE");
	   System.out.println();
		System.out.println("\t\t\t\t\t              "+BLACK_BOLD+"****************DIGITAL STORE****************");
		System.out.println("\t\t\t\t\t              "+"*                                           *");
		System.out.println("\t\t\t\t\t              "+"*                                           *");
		System.out.println("\t\t\t\t\t              "+"*"+"\t\t "+"  ████████████████████           *\n" + 
				"\t\t\t\t\t      "+"        *"+"\t\t "+ "  ██ ▄▄▄▄▄ ██▀▄▄▀█ ▄██           *\n" +
				"\t\t\t\t\t      "+"        *"+"\t\t "+"  ██ █   █ █ ▀ ▀ █ ███           *\n" +
				"\t\t\t\t\t      "+"        *"+"\t\t "+"  ██ █▄▄▄█ ██▀█ ▀ ████           *\n" +
				"\t\t\t\t\t      "+"        *"+"\t\t "+"  ██▄▄▄▄▄▄▄█ ▀ █ ▀█▄██           *\n" +
				"\t\t\t\t\t      "+"        *"+"\t\t "+"  ██ ▀  ▀█  ▀█  ██  ██           *\n" +
				"\t\t\t\t\t      "+"        *"+"\t\t "+"  ██▄▄▄▄▄▄▄█ ▀ █ ▀█▄██           *\n" +
				"\t\t\t\t\t      "+"        *"+"\t\t "+"  ████████████████████           *");
		System.out.println("\t\t\t\t\t              "+"*                                           *");
		System.out.println("\t\t\t\t\t              *      "+"UPI ID : DigiatalStoreBatch17@NIT"+"    *");
		System.out.println("\t\t\t\t\t              "+"*                                           *");
		System.out.println("\t\t\t\t\t              *     "+"TRANSACTION ID : "+transactionID.substring(0, 18)+"   *");
		System.out.println("\t\t\t\t\t              "+"*                                           *");
		System.out.println("\t\t\t\t\t      "+"        *"+"\t\t "+" SCAN THIS CODE TO PAY"+"           *");
		System.out.println("\t\t\t\t\t              "+"*                                           *");
		System.out.println("\t\t\t\t\t      "+"        *"+"\t\t    "+ formattedDateTime+"           *"); 
		System.out.println("\t\t\t\t\t              "+"*                                           *");
		System.out.println("\t\t\t\t\t      "+"        *"+"\t\t"+ "******HAPPY SHOPPING******"+"        *");
		System.out.println("\t\t\t\t\t              "+"*                                           *");
		System.out.println("\t\t\t\t\t      "+"        *"+"\t       "+ "******HAVE A GREAT DAY******"+"       *");
		System.out.println("\t\t\t\t\t              "+"*                                           *");
		System.out.println("\t\t\t\t\t              "+"*********************************************"+RESET);
		System.out.println("YOUR TRANSACTION HAS BEEN PROCESSING PLEASE WAIT.......");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
		}
		System.out.println(GREEN_BOLD+"TRANSACTION SUCCESSFUL......."+RESET);
		 System.out.println(BLACK_BOLD);
		   String intro ="""
				                	    DEAR VALUED CUSTOMER,

THANK YOU FOR CHOOSING TO SHOP WITH US AT OUR DIGITAL STORE. WE APPRECIATE YOUR BUSINESS AND HOPE THAT YOU HAD A PLEASANT SHOPPING EXPERIENCE. WE STRIVE TO\n\nPROVIDE THE BEST PRODUCTS AND SERVICES TO OUR CUSTOMERS AND YOUR SATISFACTION IS OUR TOP PRIORITY.

THANK YOU AGAIN FOR YOUR TIME AND WE LOOK FORWARD TO SERVING YOU AGAIN IN THE FUTURE.

BEST REGARDS, [YOUR DIGITAL STORE]  \n\n\t\t\t  ------------------------------> DONE BY - HEMANTH , SAHITHI , YEDUKONDALU , LAXMI <------------------------------ \n\n\t\t\t\t\t\t\t\t ****BATCH 17****

					""";
			for(int i = 0 ; i < intro.length(); i++)
			{
				System.out.print(intro.charAt(i));
				try {
					Thread.sleep(15);
				} catch (InterruptedException e) {
				}
			}
			System.out.println(RESET);

   }
   public static void Card() throws InterruptedException
   {
	     System.out.println();
		 System.out.println("\t\t\t\t\t\t           "+" ________________________________");
		 System.out.println("\t\t\t\t\t\t           "+"|                                |");
		 System.out.println("\t\t\t\t\t\t           "+"|          1. CREDIT CARD        | ");
		 System.out.println("\t\t\t\t\t\t           "+"|          2. DEBIT CARD         | ");
		 System.out.println("\t\t\t\t\t\t           "+"|________________________________| ");
	     Cardswitch();
   }
   public static void Cardswitch() throws InterruptedException
   {
	   System.out.print("PLEASE CHOOSE YOUR PAYMENT METHOD :");  
	   do
	   {
		   int n=sc.nextInt();
		 switch(n)
		 {
		 case 1: CreditCard(); b=false; break;
		 case 2: DebitCard(); b=false; break;
		 default : System.out.print("Please Enter valid option : ");
		 }
	   }while(b==true);  
   }
   public static void CreditCard() throws InterruptedException
   {
	   @SuppressWarnings("resource")
	Scanner sc1 = new Scanner(System.in);
	   System.out.print("Enter Your CREDIT Card Number (16 digits) : ");
	   do {
        	String cardnumber = sc1.next();
        	switch(1)
	            	{
		            	case 1 :{ if (cardnumber.length() == 16 ) 
		                           {
		            					cvv();b = false;break;
		                           }
	            	                else 
	            	                {
	            	                System.out.println("Invalid Card Number.");
	            	                System.out.print("Please Enter 16 - Digits Present On Your Card : ");
	            	                } 
	            			    }
	            	}
            }while(b ==true);
   }
   
   public static void DebitCard() throws InterruptedException
   {
	   @SuppressWarnings("resource")
	Scanner sc1 = new Scanner(System.in);
	   System.out.print("Enter Your DEBIT Card Number (16 digits) : ");
	   do {
        	String cardnumber = sc1.next();
        	switch(1)
	            	{
		            	case 1 :{ if (cardnumber.length() == 16) 
		                           {
		            					cvv();b = false;break;
		                           }
	            	                else 
	            	                {
	            	                System.out.println("Invalid Card Number.");
	            	                System.out.print("Please Enter 16 - Digits Present On Your Card : ");
	            	                } 
	            			    }
	            	}
            }while(b ==true);
   }
   public static void cvv() throws InterruptedException
   {
	   @SuppressWarnings("resource")
	Scanner sc1 = new Scanner(System.in);
	   System.out.print("Enter Your CVV (3 Digits) : ");
	   do {
		   String cvv = sc1.next();
		   switch(1)
		   {
		   case 1 :{ if (cvv.length() == 3 ) 
		   {
			   phone();b = false;break;
		   }
		   else 
		   {
			   System.out.println("Invalid CVV Number.");
			   System.out.print("Please Enter 3 - Digits Which Are Present On BackSide Of Your Card : ");
		   } 
		   }
		   }
	   }while(b ==true);
   }
   public static void phone() throws InterruptedException
   {
	   System.out.println("For OTP Generation , Do You Want to Continue With Given PhoneNumber At The Time Of Registration");
	   System.out.print("If YES Enter [1] , If NO Enter [2] : ");
	   do 
	   {
		   int y = sc.nextInt();
		   switch(y)
		   {
		   case 1 :System.out.println("Your Phone Number : "+Register.getPhoneNo()); otp(); b = false;break;
		   case 2 : phoneUser(); b = false;break;
		   default : System.out.print("Please Enter Valid Option : ");
		   }
	   }while(b==true);
	   
   }
   public static void phoneUser() throws InterruptedException
   {
	   @SuppressWarnings("resource")
	Scanner sc1 = new Scanner(System.in);
	   System.out.print("Enter Phone Number : ");
	   do {
		   String num = sc1.next();
		   switch(1)
		   {
		   case 1 :{ if ((num.length() == 10 && num.matches("[0-9]+"))&&(num.startsWith("9")||num.startsWith("8")||num.startsWith("7")||num.startsWith("6"))) 
		   {
			   otp();b = false;break;
		   }
		   else 
		   {
			   System.out.println("Invalid Phone Number.");
			   System.out.print("Please Enter Valid Phone Number : ");
		   } 
		   }
		   }
	   }while(b ==true);
   }
   public static void otp() throws InterruptedException
   {
	   double x = Math.random()*10000;
	   int y = (int)x;
	   System.out.print("Please Wait While We Are Generating Your OTP......."+"\n");
	   Thread.sleep(3000);
	   System.out.println("Your OTP : "+BLACK_BOLD+y+RESET);
	   boolean b2 = true;
	   do
	   {
		   System.out.print("PLEASE ENTER YOUR OTP : ");
		   int otp = sc.nextInt();
		   switch(1) 
		   {
		   case 1: if(otp == y)
		   {
			   System.out.println(GREEN_BOLD+"OTP VERIFICATION SUCESSFULL"+RESET);
			   System.out.println("YOUR TRANSACTION HAS BEEN PROCESSING PLEASE WAIT.......");
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e1) {
				}
				System.out.println(GREEN_BOLD+"TRANSACTION SUCCESSFUL......."+RESET);
				 System.out.println(BLACK_BOLD);
				   String intro ="""
						                	    DEAR VALUED CUSTOMER,

		THANK YOU FOR CHOOSING TO SHOP WITH US AT OUR DIGITAL STORE. WE APPRECIATE YOUR BUSINESS AND HOPE THAT YOU HAD A PLEASANT SHOPPING EXPERIENCE. WE STRIVE TO\n\nPROVIDE THE BEST PRODUCTS AND SERVICES TO OUR CUSTOMERS AND YOUR SATISFACTION IS OUR TOP PRIORITY.

		THANK YOU AGAIN FOR YOUR TIME AND WE LOOK FORWARD TO SERVING YOU AGAIN IN THE FUTURE.

		BEST REGARDS, [YOUR DIGITAL STORE]  \n\n\t\t\t  ------------------------------> DONE BY - HEMANTH , SAHITHI , YEDUKONDALU , LAXMI <------------------------------ \n\n\t\t\t\t\t\t\t\t ****BATCH 17****

							""";
					for(int i = 0 ; i < intro.length(); i++)
					{
						System.out.print(intro.charAt(i));
						try {
							Thread.sleep(15);
						} catch (InterruptedException e) {
						}
					}
					System.out.println(RESET);
			   b2 = false; break;
			   
		   }
		   else
		   {
			   System.out.println(RED+"OTP VERIFICATION FAILED , ENTER OTP AGAIN "+RESET);
		   }
		   
		   }
	   }while(b2==true);
   }
}
