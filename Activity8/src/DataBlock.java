public class DataBlock implements Runnable {
	private String bookName;
	public DataBlock(String bookName) {
		this.bookName = bookName;
	}
	@Override
	public void run() {
		for(int i = 0; i<3; i++) {
			System.out.println("Reading book: "+ bookName);
		}
	}
} 