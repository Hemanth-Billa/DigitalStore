package home_screen;

public class Register 
{
    private static String firstName; //aa 
    private static String lastName; //bb
    private String userName; //cc
    private String password; //dd
    private String emailId; //ee
    private static long phoneNo; //123
    public String getFirstName() 
    {
        return firstName;
    }
    @SuppressWarnings("static-access")
	public void setFirstName(String firstName) 
    {
        this.firstName = firstName;
    }
    public String getLastName() 
    {
        return lastName;
    }
    @SuppressWarnings("static-access")
	public void setLastName(String lastName) 
    {
        this.lastName = lastName;
    }
    public String getUserName() 
    {
        return userName;
    }
    public void setUserName(String userName) 
    {
        this.userName = userName;
    }
    public String getPassword() 
    {
        return password;
    }
    public void setPassword(String password) 
    {
        this.password = password;
    }
    public String getEmailId() 
    {
        return emailId;
    }
    public void setEmailId(String emailId) 
    {
        this.emailId = emailId;
    }
    public static long getPhoneNo() 
    {
        return phoneNo;
    }
    public static String getfullName()
    {
    	return firstName+" "+lastName;
    }
    @SuppressWarnings("static-access")
	public void setPhoneNo(long phoneNo) 
    {
        this.phoneNo = phoneNo;
    }
    @SuppressWarnings("static-access")
	@Override
    public String toString()
    {
    	String BLACK_BOLD = "\033[1;30m";  // BLACK
    	String RESET = "\033[0m";
    	System.out.println();
    	System.out.println("\t\t\t\t\t\t"+BLACK_BOLD+"----------------REGISTRATION DETAILS---------------"+RESET);
    	System.out.println("\t\t\t\t\t\t  "+"First Name  :          "+this.firstName+"          ");
    	System.out.println("\t\t\t\t\t\t  "+"Last Name   :          "+this.lastName+"          ");
    	System.out.println("\t\t\t\t\t\t  "+"UserName    :          "+this.userName+"          ");
    	System.out.println("\t\t\t\t\t\t  "+"Email ID    :          "+this.emailId+"          ");
    	System.out.println("\t\t\t\t\t\t  "+"Password    :          "+this.password+"          ");
    	System.out.println("\t\t\t\t\t\t  "+"Phone No    :          "+this.phoneNo+"          ");
    	System.out.println("\t\t\t\t\t\t"+BLACK_BOLD+"---------------------------------------------------"+RESET);
    	System.out.println();
    	System.out.println("\t\t\t\t\t\t"+BLACK_BOLD+"         REGISTRATION SUCCESSFULLY COMPLETED                "+RESET);
        return "";
    }
}