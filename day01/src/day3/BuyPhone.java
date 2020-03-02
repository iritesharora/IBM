package day3;

public class BuyPhone {
    Phone p=null;
    BuyPhone(Phone e)
    {
    	p=e;
    }
    public void run()
    {
    	p.call();
    	p.videoCall();
    	p.recordCall();
    }

}
