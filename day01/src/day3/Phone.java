package day3;

abstract class Phone {
	void call()
	{
		System.out.println("Simple phone");
	}
	abstract void videoCall();
	abstract void recordCall();
	
}
  class SmartPhone extends Phone{
	void videoCall()
	{
		System.out.println("SmartPhone with Videocall feature");
	}

	void recordCall() {
		// TODO Auto-generated method stub
		System.out.println("can't record video call");
	}
	
}
class AbcPhone extends SmartPhone{
	void recordCall(){
		System.out.println("Smartphone with record videocall feature");
	}
}
