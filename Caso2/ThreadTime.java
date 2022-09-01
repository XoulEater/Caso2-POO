/*
public class ThreadTime extends Thread{
	private int exeTime;
	private YatchMainFrame controlledFrame;
	
	public ThreadTime() {
		this.exeTime = Constants.EXECUTION;

	}
	public void setWindow(YatchMainFrame pFrame) {
		controlledFrame = pFrame;
	}
	
	public void run() {
		int count = 0;
		int hour = 0;
		while (count <= this.exeTime) {
			try {
				Thread.sleep(1000);
				count++;
				if (hour != 24) {
					hour++;
				} else {
					hour = 1;
				}
				controlledFrame.setCountHour(hour);
				
			} catch (InterruptedException ex) {
				Thread.currentThread().interrupt();
			}
		}
	}
			
}
*/
