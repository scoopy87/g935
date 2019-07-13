package ierarhie_de_vehicule;

public class OnWater extends Vehicle{
	private int noEngines = 2;
	private int cargoCapacity;
	
	public OnWater(String serialNumber, int noPersons, String name) {
		super(serialNumber, noPersons, name);
		// TODO Auto-generated constructor stub
	}
	
	public OnWater(String serialNumber, int noPersons) {
		super(serialNumber, noPersons);
		// TODO Auto-generated constructor stub
	}
	
	public OnWater(String serialNumber, int noPersons, int noEngines, int cargoCapacity) {
		super(serialNumber, noPersons);
		this.noEngines = noEngines;
		this.cargoCapacity = cargoCapacity;
	}
	
	int getNoEngines() {
		return noEngines;
	}

	void setNoEngines(int noEngines) {
		this.noEngines = noEngines;
	}

	int getCargoCapacity() {
		return cargoCapacity;
	}

	void setCargoCapacity(int cargoCapacity) {
		this.cargoCapacity = cargoCapacity;
	}

	@Override
	boolean goTo(double positionX, double positionY) {
		System.out.println("Sailing " + super.getName() + " vessel to coordinates: [" +
										positionX + "," + positionY + "]");
		return true;
	}

	@Override
	boolean addFuel(double amount) {
		System.out.println("Adding " + amount + " l of fuel to the vessel " + super.getName());
		return true;
	}

	@Override
	void printInfo() {
		super.printInfo();
		System.out.println("Driving vehicle properties:" + 
				"\n	- number of engines: " + this.noEngines + 
				"\n	- cargo capacity: " + this.cargoCapacity);
	
	}
}
