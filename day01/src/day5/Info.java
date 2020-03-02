package day5;

public class Info {

	public void data(String email_Id, String password) {
		// TODO Auto-generated method stub
		String email[]={"abc@gmail.com","xyz123@gmail.com","asd234@gmail.com"};
		String pass[]={"123456789","qwertyuiop","zxcvbnm123"};
		String user[]={"jatin","ritesh","shubham"};
		int age[]={21,23,22};
		int index = 0;
		for(int i=0;i<email.length;i++)
		{
			if(email_Id.equals(email[i]) /*&& password.equals(pass[i])*/)
			{
				
				index=i;
			}
			else{
				System.out.println("Invalid E-mail");
			}
		
		}
			 if(password.equals(pass[index]))
				{
					
				 System.out.println("user name is: "+user[index]);
					System.out.println("user age is: "+age[index]);
				 
				}
				else{
					try {
						throw new Exception("Invalid password");
					} catch (Exception e) {
						// TODO Auto-generated catch block
						System.out.println(e.getMessage());
					}
				}
			}
		}

	


