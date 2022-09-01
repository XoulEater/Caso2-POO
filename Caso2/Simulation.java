import java.util.LinkedList;

public class Simulation {

	public static void main(String[] args) {
		
		float eficiencia = 1.0f;
		
		LinkedList<Battery> ListBaterias = new LinkedList<Battery>();
		LinkedList<Panel> ListPaneles = new LinkedList<Panel>();
		
		for (int i = 0; i < Constants.BATQUANTITY; i++) {
			Battery bateria = new Battery(Constants.BATCAPACITY);
			ListBaterias.add(bateria);
		}
		
		for (int i = 0; i < Constants.PANQUANTITY; i++) {
			Panel panel = new Panel(Constants.CHARGEPS);
			ListPaneles.add(panel);
		}
		
		Yatch yate = new Yatch();
		
		// Centro de Control Energetico (CCE)
		EnergyCenter CCE = new EnergyCenter(ListBaterias, ListPaneles, Constants.YATCHINTAKE); 
		
		CCE.updateCapacity();
		CCE.updatetChargePS(eficiencia);
		CCE.updatetIntake(yate.getSpeedMul(), yate.getSpeed());
		
		MainThread controller = new MainThread(CCE, yate);
		//ThreadTime counter = new ThreadTime();
		YatchMainFrame myYatchWindow = new YatchMainFrame("Yatch Simulation", controller);
		
		
		
		

	}
}
