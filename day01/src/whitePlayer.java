
public class whitePlayer implements Player{

	int maxPower = 100;
	int minPower = 0;
	
	public void Hit(int a, Player p)
	{
		
		p.damage(a);
	}
	public void damage(int b)
	{
		maxPower=maxPower - b;
		if(maxPower<minPower)
			System.out.println("gameover");
		else
			System.out.println(maxPower);
		   
	}
	public void eat(int c)
	{
		System.out.println("power" + maxPower);
		maxPower=maxPower + c;
		System.out.println("after eat power" + maxPower);
	}
	
	public void run()
	{
		System.out.println("running");
	}
	
	

}
