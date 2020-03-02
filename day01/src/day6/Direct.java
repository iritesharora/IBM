package day6;

import java.io.File;

public class Direct {

	/**
	 * @param args
	 */static int index=0;
	static void name(String fl)
	{
		File file=new File(fl);
		File[] arr=file.listFiles();
		for(File s:arr)
		{
			if(s.isDirectory())
			{
				System.out.println("Directory  "+s.getName());
				name(s.getAbsolutePath());
			}
			else
			{
				System.out.println("----->file  "+s.getName());
			}
		}
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//File fl=new File();
		//System.out.println(fl.getAbsolutePath());
		name("C:\\Users\\system- 4\\Desktop\\IBM\\day01");
		
	

}
}
