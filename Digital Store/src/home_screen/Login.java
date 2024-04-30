package home_screen;

import java.util.Scanner;
public class Login
{	 
	public void login(Register r)
	{ 
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in); 
        {
        	String BLACK_BOLD = "\033[1;30m";  // BLACK
        	String RESET = "\033[0m";
        	String RED = "\033[1;31m";     // RED
        	System.out.println();
        	System.out.println("\t\t\t\t\t\t"+BLACK_BOLD+"---------------WELCOME TO LOGIN PAGE---------------"+RESET);
            System.out.print("\t\t\t\t\t\t  "+"Enter UserName : ");
            String username = scanner.nextLine();

            System.out.print("\t\t\t\t\t\t  "+"Enter PassWord : ");
            String passWord = scanner.nextLine();
            if ((r.getUserName()).equals(username) && (r.getPassword()).equals(passWord)) {
                System.out.println("\t\t\t\t\t\t  "+"User successfully logged-in.. ");
                System.out.println("\t\t\t\t\t\t"+BLACK_BOLD+"---------------------------------------------------"+RESET);
                try {
					Opening.proto();
				} catch (InterruptedException e) {
				}
            } 
            else 
            {
                System.out.println("\t\t\t\t\t\t  "+RED+"Invalid userName or password "+RESET);
                login(r);
            }
        }
    }
}