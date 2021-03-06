package Decorator.src.ro.ase.acs.main;

import Decorator.src.ro.ase.acs.decorator.Car;
import Decorator.src.ro.ase.acs.decorator.Vehicle;
import Decorator.src.ro.ase.acs.decorator.VehicleWithAlarm;
import Decorator.src.ro.ase.acs.decorator.VehicleWithParkingSensors;

public class Main {

	public static void main(String[] args) {
        Car car=new Car("red", 300, 4);
        car.start();
        car.stop();
        VehicleWithAlarm carWithAlarm=new VehicleWithAlarm(car);
        carWithAlarm.start();
        carWithAlarm.stop();
        carWithAlarm.activateAlarm();
        Vehicle carWithParkingSensors=new VehicleWithParkingSensors(car,5);
        carWithParkingSensors.start();


        Vehicle carWithAlarmAndParkingSensors=new VehicleWithParkingSensors(new VehicleWithAlarm(car),3);
        carWithAlarmAndParkingSensors.start();
        carWithAlarmAndParkingSensors.stop();
	}

}
