package inheritance;

class Vehicles{
	int maxSpeed;
	String model;
	Vehicles(int maxSpeed, String model){
		this.maxSpeed=maxSpeed;
		this.model= model;
	}
}
interface Refuelable{
    void refuel();
}
class PetrolVehicle extends Vehicles implements Refuelable{ 
	public boolean fuel;
	PetrolVehicle(int maxSpeed, String model,boolean fuel){
		super(maxSpeed,model);
		this.fuel=fuel;
	}
	public void refuel() {
		if(fuel) {
			System.out.println("Model of vehicle is: "+ model);
			System.out.println("MaxSpeed of vehicle is: "+ maxSpeed);
			System.out.println("fill the tank of vehicle");
			System.out.println("\n_");
		}
		else {
			System.out.println("Model of vehicle is: "+ model);
			System.out.println("MaxSpeed of vehicle is: "+ maxSpeed);
			System.out.println("No need to fill the tank of vehicle");
			System.out.println("\n_");
		}
	}
	
}
class ElectricVehicle extends Vehicles{
	public boolean charge;
	ElectricVehicle(int maxSpeed, String model,boolean charge){
		super(maxSpeed,model);
		this.charge=charge;
	}
	public void charge() {
		if(charge) {
			System.out.println("Model of vehicle is: "+ model);
			System.out.println("MaxSpeed of vehicle is: "+ maxSpeed);
			System.out.println("Charge the vehicle");
			System.out.println("\n_");
		}
		else {
			System.out.println("Model of vehicle is: "+ model);
			System.out.println("MaxSpeed of vehicle is: "+ maxSpeed);
			System.out.println("No need to Charge the vehicle");
			System.out.println("\n_");
		}
	}
}
public class VehicleManagement {


	public static void main(String[] args) {
	 PetrolVehicle petrol = new PetrolVehicle(60, "splender",true);
	 petrol.refuel();
	 ElectricVehicle electric = new ElectricVehicle( 20, "Tata Nexon",false);
	 electric.charge();
	 
	}

}