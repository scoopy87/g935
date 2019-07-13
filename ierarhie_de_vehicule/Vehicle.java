package ierarhie_de_vehicule;

public abstract class Vehicle {
	private final String serialNumber;
	private int noPersons;
	private String name;
	
	public Vehicle(String serialNumber, int noPersons) {
		this.serialNumber = serialNumber;
		this.noPersons = noPersons;
	}
	
	public Vehicle(String serialNumber, int noPersons, String name) {
		this(serialNumber, noPersons);
		this.name = name;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}
	
	int getNoPersons() {
		return noPersons;
	}

	void setNoPersons(int noPersons) {
		this.noPersons = noPersons;
	}
	
	public String getSerialNumber() {
		return serialNumber;
	}
	
	boolean goTo(double positionX, double positionY) {
		System.out.println("Error: unknown vehicle cannot move…");
		return false;
	}
	
	boolean addFuel(double amount) {
		System.out.println("Error: unknown type of vehicle…");
		return false;
	}
	
	void printInfo() {
		System.out.println("Vehicle properties:" + 
				"\n	- serial number: " + this.serialNumber +  
				"\n	- capacity: " + this.noPersons + 
				"\n	- name: " + this.name);
	}
}
