package day3;

public class Tt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="java";
		String b=null;
		System.out.println(a);
        a="bl";
        System.out.println(a);
        String reg="1234567890";
        String regx="[123][0-9]+";
        System.out.println(reg.matches(regx));
        String str[]={"123-45-6789","9876-5-4321","987-65-4321 (contact)",
        		" 987-65-4321","192-83-7465","865-47-8524"};
        
        String regex="[0-9]{3}[-][0-9]{2}[-][0-9]{4}";
        for(int i=0;i<str.length;i++)
        {
        	if(str[i].matches(regex))
        	{
        		System.out.println(str[i]+" valid");
        	}
        	else{
        		System.out.println(str[i]+" invalid");
        	}
        }
        String m="gBKer11@gmail.com";
        String mail="[a-zA-Z\\d]+[@][a-zA-Z]+[.][a-zA-Z]+";
        System.out.println(m.matches(mail));
	}

}
