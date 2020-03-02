package day7;

import java.util.List;

class consumer implements Runnable{
  int MAX=5;
  int MIN=0;
private List<Integer> list;
  consumer(List<Integer> list)
  {
	  this.list=list;
  }
public void run() {
	// TODO Auto-generated method stub
while(true){
	try {
		consume();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}}
}
private void consume() throws InterruptedException {
	// TODO Auto-generated method stub
	if(list.size()==MAX)
	{
		Thread.sleep(10);
		int a=list.remove(0);
		System.out.println("consumer consumed : "+a);
		synchronized (list) {list.notify();}
		
	}
	else{
		synchronized (list) {
			list.wait();
		}
	}
}
}
