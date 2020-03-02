package day5;

class Bl {

	String email_Id;
	String password;
	String regex="[a-zA-Z\\d]+[@][a-zA-Z]+[.][a-zA-Z]+";
	Info i=new Info();
	public void validation(String email_Id,String password){
		try{
			if(email_Id.length()!=0 && password.length()!=0 && email_Id.matches(regex) && password.length()>8)
			{
				i.data(email_Id,password);
			}
			else{
				throw new Exception("Please enter valid details");
			}
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
	}
	
	
}
