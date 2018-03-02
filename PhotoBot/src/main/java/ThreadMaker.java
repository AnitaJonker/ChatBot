


class ThreadMaker implements Runnable{

	Object message;
	public  ThreadMaker(Object msg)
	{
		message = msg;
	}
	
	
	@Override
	public void run() {
	
		BotSpeaks botSpeaks = new BotSpeaks();
		botSpeaks.speak(message);
		System.out.println(Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

//public class ThreadMaker implements Runnable {
//
//	@Override
//	public void run() {
//		
//		
//	}
//
//}
