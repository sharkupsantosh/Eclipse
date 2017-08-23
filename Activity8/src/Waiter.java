
public class Waiter implements Runnable{
    
    private QueueData cmd;
    
    public Waiter(QueueData m){
        this.cmd=m;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        synchronized (cmd) {
            try{
                System.out.println(name+" waiting to get notified at time:"+System.currentTimeMillis());
                cmd.wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(name+" waiter thread got notified at time:"+System.currentTimeMillis());
            //process the message now
            System.out.println(name+" processed: "+cmd.getMsg());
        }
    }
}