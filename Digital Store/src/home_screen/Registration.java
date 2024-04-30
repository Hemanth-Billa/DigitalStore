package home_screen;

import java.util.Scanner;

public class Registration 
{
	public static void registration() throws InterruptedException 
	{
		 String GREEN_BOLD = "\033[1;32m";  // GREEN
	    	String RESET = "\033[0m";
	    	String RED = "\033[1;31m";     // RED BOLD
	    	String BLACK_BOLD = "\033[1;30m";
 	    Register register = new Register();
         @SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in); 
         System.out.println();
         System.out.println(BLACK_BOLD+"\t\t\t\t\t\t\t"+"---------------------REGISTRATION------------------"+RESET);
         System.out.print("\t\t\t\t\t\t  "+"Enter FirstName : ");
         String firstName = scanner.nextLine();
         register.setFirstName(firstName); 

         System.out.print("\t\t\t\t\t\t  "+"Enter LastName  : ");
         String lastName = scanner.nextLine();
         register.setLastName(lastName); 

         System.out.print("\t\t\t\t\t\t  "+"Enter EmailId   : ");
         String emailId = scanner.nextLine();
         register.setEmailId(emailId); 
         
         System.out.print("\t\t\t\t\t\t  "+"Enter UserName  : ");
         String userName = scanner.nextLine();
         register.setUserName(userName); 

         System.out.print("\t\t\t\t\t\t  "+"Enter Password  : ");
         String password = scanner.nextLine();
         register.setPassword(password); 
                  
         System.out.print("\t\t\t\t\t\t  "+"Enter PhoneNo   : ");
         boolean b = true;
         do {
        	 @SuppressWarnings("resource")
			Scanner sc1 = new Scanner(System.in);
         	String phoneNo = sc1.next();
         	switch(1)
	            	{
		            	case 1 :{ if ((phoneNo.length() == 10 && phoneNo.matches("[0-9]+"))&&(phoneNo.startsWith("9")||phoneNo.startsWith("8")||phoneNo.startsWith("7")||phoneNo.startsWith("6"))) 
		                           {
		            						register.setPhoneNo(Long.parseLong(phoneNo));
		            						b=false; break;
		                           }
	            	                else 
	            	                {
	            	                System.out.println("\t\t\t\t\t\t  "+"Invalid phone number.");
	            	                System.out.print("\t\t\t\t\t\t  "+"Please Enter Valid 10-digit Number : ");
	            	                } 
	            			    }
	            	}
             }while(b ==true);
         
         	double x1 = Math.random()*100; int x = (int)x1;
		    double z2 = Math.random()*100; int y = (int)z2;
		    double y3 = Math.random()*100; int z = (int)y3;
         	char first = firstName.charAt(0);
         	char second = lastName.charAt(0);
         	String otp = ""+x+second+z+first+y;
		    System.out.print("\t\t\t\t\t\t  "+"Please Wait While We Are Generating Your OTP......."+"\n");
		    Thread.sleep(3000);
		    System.out.println("\t\t\t\t\t\t  "+"Your OTP : "+BLACK_BOLD+otp+RESET);
		    boolean b2 = true;
		    do
		    {
		    	System.out.print("\t\t\t\t\t\t  "+"PLEASE ENTER YOUR OTP : ");
		    	String otpValidation = scanner.next();
	   		    switch(1) 
	   		    {
				case 1: if(otpValidation.equals(otp))
							{
								System.out.println("\t\t\t\t\t\t  "+GREEN_BOLD+"OTP VERIFICATION SUCESSFULL"+RESET);
								b2 = false; break;
							}
						else
						{
							System.out.println(RED+"\t\t\t\t\t\t\t  "+"OTP VERIFICATION FAILED , PLEASE ENTER OTP AGAIN "+RESET);
						}
			
				}
		    }while(b2==true);
         System.out.println(register.toString());
         Login login = new Login();
         login.login(register); 
	}
//    public static void main(String[] args) throws InterruptedException 
//    {        
//    	registration();
//     }
}
