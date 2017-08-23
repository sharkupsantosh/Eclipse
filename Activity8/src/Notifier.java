import java.util.Scanner; 
public class Notifier implements Runnable {

    private QueueData cmd;
    
    public Notifier(QueueData cmd) {
        this.cmd = cmd;
    }

    @Override
    public void run() {
    	Scanner sc=new Scanner(System.in);
        String name = Thread.currentThread().getName();
        System.out.println(name+" started");
        try {
            Thread.sleep(1000);
            synchronized (cmd) {
            	cmd.setMsg(name+" Notifier work done");
            	System.out.println("\nSelect any (1 or 2) notification Type: \n 1.Notify \n 2.NotifyAll");
            	int notificationtype=sc.nextInt();
            	if(notificationtype==1){
            		cmd.notify();
            	}
            	if(notificationtype==2){
            		cmd.notifyAll();
            	}
            	sc.close(); 
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
    }

}