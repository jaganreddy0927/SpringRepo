package org.jagan.com;

public class Travel {
	Vehicle vehicle;

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	public void journey(){
		vehicle.go();
		System.out.println("Journey Started");
	}

}
