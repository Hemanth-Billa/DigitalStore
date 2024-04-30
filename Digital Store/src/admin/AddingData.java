package admin;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class AddingData 
{
	private static File f = new File("C:\\Users\\bhema\\Downloads\\Naresh It Files\\details.txt");
	
	public static void AddNewCustomer(UserData ud)
	{
		if (ud != null) 
		{
			try 
			{
				FileOutputStream fos = null;
				fos = new FileOutputStream(f, true);
				// If there is nothing to be write onto file
				if (f.length() == 0)
				{
					ObjectOutputStream oos = new ObjectOutputStream(fos);
					oos.writeObject(ud);
					oos.close();
				}
				// There is content in file to be write on
				else 
				{

					MyObjectOutputStream oos = null;
					oos = new MyObjectOutputStream(fos);
					oos.writeObject(ud);
					oos.close();
				}
				fos.close();
			}
			catch (Exception e)
			{
				System.out.println("Error Occurred" + e);
			}
		}
	}


}
