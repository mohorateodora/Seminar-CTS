package ro.ase.acs.main;

import ro.ase.acs.facade.CockpitFacade;

public class MainFacade {
	
	public static void main(String[] args) {
		CockpitFacade cockpit = new CockpitFacade();
		
		cockpit.startCar();
		System.out.println("-----");
		cockpit.stopCar();
		System.out.println("-----");
		cockpit.emergencyStop();
		System.out.println("-----");
	}
}
