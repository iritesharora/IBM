package day3;

class DataBase {
	String uname="Admin";
	String pass="123";
	void isRegistered(){
	
		if(username.equals(uname) && password.equals(pass))
		{ 
			
		}
 
}
class BusinessLogic extends DataBase
{
	boolean validateData()
	{
		if(username.length()!=null && password.length()!=null)
		{
		isRegistered();
		return true;
		}
		else{
			System.out.println("invalid");
		}
		
		
	}

	
}
class Data extends BusinessLogic
{
	void login(String username,String password)
	 {
		
		validateData();	
		
	 }
		
}


