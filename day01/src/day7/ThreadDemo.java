package day7;

 class Stu implements Runnable {

	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++)
		System.out.println(Thread.currentThread().getName()+i);
	}

}
public class ThreadDemo{
	public static void main(String[] args) {
		Stu s=new Stu();
		Stu s1=new Stu();
		Thread t1=new Thread(s1);
		s.run();
		t1.start();
	}
}
