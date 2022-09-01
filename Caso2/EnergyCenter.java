import java.util.LinkedList;

public class EnergyCenter {
	private float tCapacity;
	private float tCharge;
	private float tChargePS;
	private float tIntake;
	private LinkedList<Battery> batteries;
	private LinkedList<Panel> panels;
	

	public EnergyCenter(LinkedList<Battery> Pbatteries, LinkedList<Panel> Ppanels) {
		
		this.batteries = Pbatteries;
		this.panels = Ppanels;
		this.tCapacity = 0.0f;
		this.tChargePS = 0.0f;
		this.tCharge = 0.0f;
		this.tIntake = 0.0f;
	}
	
	public float gettCapacity() {
		return tCapacity;
	}

	public void updateCapacity() {
		float capacityBat = this.batteries.getFirst().getCapacity();
		int cantBat =  this.batteries.size();
		this.tCapacity = capacityBat * cantBat;
	}

	public float gettChargePS() {
		return tChargePS;
	}

	public void updatetChargePS(float efficiency) {
		float chargePSPan = this.panels.getFirst().getChargePS();
		int cantPan =  this.panels.size();
		this.tChargePS = chargePSPan * cantPan * efficiency;
	}
	
	public float gettCharge() {
		return tCharge;
	}
	
	public void updatetCharge() {
		this.tCharge += this.tChargePS; 
		this.tCharge -= this.tIntake;
		if (this.tCharge > this.tCapacity) {
			this.tCharge = this.tCapacity;
		}
	}

	public float gettIntake() {
		return tIntake;
	}

	public void updatetIntake(float speedMul, float xIntake) {
		this.tIntake = Constants.YATCHINTAKE * speedMul + xIntake;
	}



}
