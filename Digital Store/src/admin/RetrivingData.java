package admin;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RetrivingData 
{
	private static File f = new File("D:\\Registration Details\\UserData.txt");
	public static void readFile()
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String name ;
		String password ;
		boolean b  = true;
		do
		{
			System.out.println("************************************************************************************************************************************************************");
			System.out.println(BLACK_BOLD+"\t\t\t\t\t\t\t\t"+"Login To Access User Details"+RESET);
			System.out.println("\t\t\t\t\t\t      "+"--------------------------------");
			System.out.print("\t\t\t\t\t\t\t"+"Enter UserName : ");
			name =  sc.next();
			System.out.print("\t\t\t\t\t\t\t"+"Enter PassWord : ");
			password = sc.next();
			System.out.println("***********************************************************************************************************************************************************");
			switch(1) 
			{
				case 1:
				{
					if((HEMANTHUSERNAME.equals(name)&&HEMANTHPASSWORD.equals(password))||(KONDAUSERNAME.equals(name)&&KONDAPASSWORD.equals(password))
						||(SAHITHIUSERNAME.equals(name)&&SAHITHIPASSWORD.equals(password))||(LAXMIUSERNAME.equals(name)&&LAXMIPASSWORD.equals(password)))
					{
					ArrayList<UserData> al = new ArrayList<>();
						try 
						{
							f.createNewFile();
						}
						catch (Exception e) 
						{
							System.out.println("Exception At Retriving Data Class");
						}
					if (f.length() != 0) 
					{
						try 
						{
							FileInputStream fis = null;
							fis = new FileInputStream("D:\\Registration Details\\UserData.txt");
							ObjectInputStream ois = new ObjectInputStream(fis);
							UserData ud = null;
							while (fis.available() != 0) 
							{
								ud = (UserData)ois.readObject();
								al.add(ud);
							}
							ois.close();
							fis.close();
						}
						catch (Exception e) 
						{
							System.out.println("Error Occurred" + e);
							e.printStackTrace();
						}
					}
					Collections.sort(al);
					System.out.println(al);
					}
					else
					{
						System.out.println(RED_BOLD+"\t\t\t\t\t\t\t\t"+"Invalid UserName or Password");
						System.out.println("\t\t\t\t\t\t\t  "+"Please Enter Again....."+RESET);
						readFile();
					}
				} b=false; break;
			}
			
		}while(b==true);		
	}
	private final static String HEMANTHUSERNAME = "Digital@Hemanth";
	private final static String HEMANTHPASSWORD = "Digital@1234H";
	private final static String KONDAUSERNAME = "Digital@YeduKondalu";
	private final static String KONDAPASSWORD = "Digital@1234K";
	private final static String SAHITHIUSERNAME = "Digital@Sahithi";
	private final static String SAHITHIPASSWORD = "Digital@1234S";
	private final static String LAXMIUSERNAME = "Digital@Laxmi";
	private final static String LAXMIPASSWORD = "Digital@1234L";
	static final String RED_BOLD = "\033[1;31m";    // RED
	static final String BLACK_BOLD = "\033[1;30m";  // BLACK
	static final String RESET = "\033[0m";  // Text Reset
	
	
}
