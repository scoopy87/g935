package ierarhie_de_vehicule;

public class OnAir extends Vehicle{
	private int noTurbines = 2;
	private boolean hasFirstClass;
	
	public OnAir(String serialNumber, int noPersons, String name) {
		super(serialNumber, noPersons, name);
	}
	
	public OnAir(String serialNumber, int noPersons) {
		super(serialNumber, noPersons);
	}

	public OnAir(String serialNumber, int noPersons, int noTurbines) {
		super(serialNumber, noPersons);
		this.noTurbines = noTurbines;
		
	}
	
	public OnAir(String serialNumber, int noPersons, int noTurbines, boolean hasFirstClass) {
		this(serialNumber, noPersons, noTurbines);
		this.hasFirstClass = hasFirstClass;
	}
	
	boolean goTo(double positionX, double positionY) {
		System.out.println("Flying " + super.getName() + " plane to coordinates: [" +
										positionX + "," + positionY + "]");
		return true;
	}

	int getNoTurbines() {
		return noTurbines;
	}

	void setNoTurbines(int noTurbines) {
		this.noTurbines = noTurbines;
		if (noTurbines >= 4) {
			this.hasFirstClass = true;
		} else if (noTurbines < 4) {
			this.hasFirstClass = false;
		} else if (noTurbines < 1) {
			System.out.println("Your plane has no engine so it won't fly!");
			System.exit(0);
		}
	}

	boolean hasFirstClass() {
		return hasFirstClass;
	}

	void setHasFirstClass(boolean hasFirstClass) {
		this.hasFirstClass = hasFirstClass;
	}

	@Override
	boolean addFuel(double amount) {
		System.out.println("Adding " + amount + " l of fuel to the plane " + super.getName());
		return true;
	}

	@Override
	void printInfo() {
		super.printInfo();
		if (hasFirstClass == true && noTurbines >= 4) {
			System.out.println("Airplane properties:" + 
					"\n	- number of turbines:" + this.noTurbines + 
					"\n	- has first class");
		} else if (hasFirstClass == false) {
			System.out.println("Airplane properties:" + 
					"\n	- number of turbines:" + this.noTurbines + 
					"\n	- does not have first class");
		}
	}
}
