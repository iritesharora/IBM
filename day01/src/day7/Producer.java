package day7;

import java.util.List;

class Producer implements Runnable{
	 int MAX=5;
	  int MIN=0;
	private List<Integer> list;
	  Producer(List<Integer> list)
	  {
		  this.list=list;
	  }
	public void run() {
		// TODO Auto-generated method stub
	while(true)
	{
		try {
			produce();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
	private void produce() throws InterruptedException {
		// TODO Auto-generated method stub
		if(list.size()==MAX)
		{
			synchronized (list) {
				list.wait();
			}
		}
		else{
          Thread.sleep(10);
          list.add((int)Math.ceil(Math.random()*1000));
			System.out.println("producer produced : ");
			synchronized (list) {list.notify();}
			
		}
	}
	}



