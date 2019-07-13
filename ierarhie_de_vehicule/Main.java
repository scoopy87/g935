package ierarhie_de_vehicule;

public class Main {
	
	public static void main(String[] args ) {
	
	OnAir airplane1 = new OnAir("1AB380", 180, "Airbus A380");
	OnRoad car1 = new OnRoad("WBAF14DU154235", 4, "Mercedes E350");
	OnWater boat1 = new OnWater("1425YCHT", 12, "Schaefer 770 Fly");
	
	airplane1.addFuel(4000);
	airplane1.goTo(45.51, 42.73);
	airplane1.setNoTurbines(4);
	airplane1.setHasFirstClass(false);
	
	car1.addFuel(75);
	car1.goTo(45.4, 42.6);
	
	boat1.addFuel(1000);
	boat1.goTo(42.32, 40.13);
	boat1.setCargoCapacity(5000);
	boat1.setNoPersons(25);
	
	System.out.println();
	airplane1.printInfo();
	System.out.println();
	car1.printInfo();
	System.out.println();
	boat1.printInfo();
	
	}
}
