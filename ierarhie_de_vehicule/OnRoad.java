package ierarhie_de_vehicule;

public class OnRoad extends Vehicle{
	private int noWheels = 4;
	private int noDoors = 4;
	
	public OnRoad(String serialNumber, int noPersons, String name) {
		super(serialNumber, noPersons, name);
	}
	
	public OnRoad(String serialNumber, int noPersons) {
		super(serialNumber, noPersons);
	}
	
	public OnRoad(String serialNumber, int noPersons, int noWheels, int noDoors) {
		super(serialNumber, noPersons);
		this.noWheels = noWheels;
		this.noDoors = noDoors;
	}

	int getNoWheels() {
		return noWheels;
	}

	void setNoWheels(int noWheels) {
		this.noWheels = noWheels;
	}

	int getNoDoors() {
		return noDoors;
	}

	void setNoDoors(int noDoors) {
		this.noDoors = noDoors;
	}

	@Override
	boolean goTo(double positionX, double positionY) {
		System.out.println("Driving "+ super.getName() +" vehicle on road to coordinates: [" +
												positionX + "," + positionY + "]");
		return true;
	}

	@Override
	boolean addFuel(double amount) {
		System.out.println("Adding " + amount + " l of fuel to the driving vehicle " + super.getName());
		return true;
	}

	@Override
	void printInfo() {
		super.printInfo();
		System.out.println("Driving vehicle properties:" + 
				"\n	- number of wheels: " + this.noWheels + 
				"\n	- number of doors: " + this.noDoors);
	}
	
	
	
	
}
