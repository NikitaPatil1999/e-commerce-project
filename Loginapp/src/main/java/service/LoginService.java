package service;

import com.tka.dao.LoginDAO;

//Service class contains business logic methods
//e.g. In below methods , we are checking passwords
//and if they are equals , then returning true.

public class LoginService {
	public boolean validate(String usernameFromBrowser,String passwordFromBrowser)
	{
		LoginDAO dao=new LoginDAO();
		String databasepassword=dao.getDataBasePassword(usernameFromBrowser);
		
		if(databasepassword.equals(passwordFromBrowser))
		{
			return true;
		}
		
		else
		{
			return false;
		}
	}

}
