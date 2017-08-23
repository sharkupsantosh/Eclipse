
public class CounterThread extends Thread{

	private Thread t;
	   private String threadName;
	   Counter  PD;

	   CounterThread( String name,  Counter pd) {
	      threadName = name;
	      PD = pd;
	   }
	   
	   public void run() {
	      synchronized(PD) {
	         PD.printCount();
	      }
	      System.out.println("Thread " +  threadName + " exiting.");
	   }

	   public void start () {
	      System.out.println("Starting " +  threadName );
	      if (t == null) {
	         t = new Thread (this, threadName);
	         t.start ();
	      }
	   }
 }
