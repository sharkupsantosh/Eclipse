class MyThread implements Runnable
	{
		public void run()
		{
			System.out.println("Runnable concurrent thread started running..");
		}
	}
class ThreadandRunnableInterface extends Thread
	{
		public void run() {
		System.out.println("Base Run Thread Started..!");
		}
		public static void main( String args[] )
		{
			ThreadandRunnableInterface run1= new ThreadandRunnableInterface();
			run1.run();
			MyThread data = new MyThread();
			Thread run2 = new Thread(data);
			run2.start();
		}
	}