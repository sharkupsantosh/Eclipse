
public class QueueData {
	private String cmd;
    
    public QueueData(String str){
        this.cmd=str;
    }

    public String getMsg() {
        return cmd;
    }

    public void setMsg(String str) {
        this.cmd=str;
    }

}
