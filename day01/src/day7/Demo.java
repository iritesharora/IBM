package day7;

 class CountInc implements Runnable{
 static int i=0;

public void run() {
	// TODO Auto-generated method stub
	for(int j=0;j<100;j++)
	i++;
}
   
}
 public class Demo{
	 public static void main(String[] args) throws InterruptedException {
		CountInc c=new CountInc();
		CountInc c1=new CountInc();
		Thread t1=new Thread(c);
		Thread t2=new Thread(c1);
		
		t1.start();
		t1.join();
		t2.start();
		System.out.println(c.i);
		System.out.println(c1.i);
		
	}
 }
