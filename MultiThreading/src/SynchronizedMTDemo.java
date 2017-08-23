
public class SynchronizedMTDemo {
	public static void main(String args[]) {
	Counter PD = new Counter();

    CounterThread T1 = new CounterThread( "Thread - 1 ", PD );
    CounterThread T2 = new CounterThread( "Thread - 2 ", PD );

    T1.start();
    T2.start();

    // wait for threads to end
    try {
       T1.join();
       T2.join();
    }catch( Exception e) {
       System.out.println("Interrupted");
    }
 }
	
}

