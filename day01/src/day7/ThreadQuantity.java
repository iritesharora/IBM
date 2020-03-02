package day7;

class Quantity implements Runnable{
	static int total=10;
	int q;
	public void run() {
		// TODO Auto-generated method stub
		
		try {
			placeOrder();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	int set(int a)
	{
		return q=a;
	}
	void placeOrder() throws InterruptedException
	{
		
		synchronized (this) {
			if(q>total)
			{
				System.out.println("not available");
			}
			else{
				System.out.println("available");
				Thread.sleep(1000);
				System.out.println("remaining quantity: "+(total-q));
			}
		}
		
	}
  
}
public class ThreadQuantity{
	
	public static void main(String[] args) {
	Quantity q=new Quantity();
	Quantity q1=new Quantity();
	Quantity q2=new Quantity();
	q.set(3);
	q1.set(12);
	//q.set(11);
	q2.set(10);
	Thread t1=new Thread(q);
	Thread t2=new Thread(q1);
	Thread t3=new Thread(q2);
	
	t1.start();
	
	t2.start();
	t3.start();
	}
}
