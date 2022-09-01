
public class MainThread extends Thread {
	private YatchMainFrame controlledFrame;
	private EnergyCenter energyCenter;
	private Yatch yatch;
	private int hour = 0;
	
	public MainThread(EnergyCenter PenergyCenter, Yatch Pyatch) {
		this.energyCenter = PenergyCenter;
		this.yatch = Pyatch;
	}
	public void setWindow(YatchMainFrame pFrame) {
		controlledFrame = pFrame;
	}
	

	
	public void NextHour(){
		
		float efficiency;
		if (hour < 6 || hour > 18) {
			efficiency = 0.1f;
	
		} else if ( ( (hour >= 6) && (hour < 10) )||(hour > 14) && ( hour <= 18)) {
			efficiency = 0.7f;
		} else {
			efficiency = 1f;
		}
		yatch.setEfficiency(efficiency);
		energyCenter.updatetChargePS(efficiency);
		
		float speed = yatch.getSpeed();
		if (hour < 5) {
			speed = 0;			
		} else if (hour < 12) {
			speed = 20;
		} else if (hour < 15) {
			speed = 30;
		} else {
			speed = 5; 
		}
		yatch.setSpeed(speed);
		yatch.updateSpeedMul();
		
		energyCenter.updatetCharge();
		
		controlledFrame.setPanelesCPS(energyCenter.gettChargePS());
		controlledFrame.setBateriasCarga(energyCenter.gettCharge());
		controlledFrame.setPanelesEfi(efficiency);
		controlledFrame.setyateIt(yatch.getSpeedMul());
		controlledFrame.setyateSpd(speed);
		controlledFrame.setCountHour(hour);
		
		if (hour != 24) {
			hour++;
		} else {
			hour = 1;
		}

	}
	

}
