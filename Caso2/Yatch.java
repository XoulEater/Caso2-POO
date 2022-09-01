
public class Yatch {
	private float speed;
	private float speedMul;
	private float xtrIntake;
	private float efficiency;

	public Yatch(float PxtrIntake) {
		this.xtrIntake = PxtrIntake;
		this.speed = 0.0f;
		this.speedMul = 0;
		this.efficiency = 1.0f;
	}
	public Yatch() { 
		this.xtrIntake = 0.0f;
		this.speed = 0.0f;
		this.speedMul = 0;
		this.efficiency = 1.0f;
	}
	public float getSpeed() {
		return speed;
	}
	public void setSpeed(float speed) {
		this.speed = speed;
	}
	public float getSpeedMul() {
		this.updateSpeedMul();
		return speedMul;
	}
	public void updateSpeedMul() {
		float res = 0;
		if (0 == this.speed) {
			res = 0f;
		} else if (0 < this.speed && this.speed <= 10) {
			res = 0.5f;
		} else if (10 < this.speed && this.speed <= 30) {
			res = 1f;
		} else if (30 < this.speed && this.speed <= 40) {
			res = 1.5f;
		} else {
			res = 2f;
		}
		this.speedMul = res;
	}
	public float getXtrIntake() {
		return xtrIntake;
	}
	public float getEfficiency() {
		return efficiency;
	}
	public void setEfficiency(float efficiency) {
		this.efficiency = efficiency;
	}
	
	
	
}