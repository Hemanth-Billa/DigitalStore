package admin;

import java.io.Serializable;

@SuppressWarnings("serial")
public class UserData implements Serializable , Comparable<UserData>
{
	private String firstName;
	private String lastName;
	private String emailId;
	private String userName;
	private String password;
	private String phoneNo;
	
	public UserData(String firstName, String lastName, String emailId, String userName, String password,
			String phoneNo) 
	{
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.userName = userName;
		this.password = password;
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() 
	{
		return "\n"+"FirstName : "+firstName+"\n"+"LastName  : "+lastName+"\n"+"EmailId   : "+emailId+"\n"+"UserName  : "
				+userName+"\n"+"Password  : "+password+"\n"+"PhoneNo   : "+phoneNo+"\n";
	}

	@Override
	public int compareTo(UserData o) 
	{
		return this.firstName.compareTo(o.firstName);
	}
	
	
	
	
	
	
	

}
