package com.capgemini.Feb16;

import java.util.Scanner;

public class TestVehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Your Vehicle Choice");
        Scanner scanner = new Scanner(System.in);
        String vehicleType = scanner.next();
//        VehicleFactory factory = new VehicleFactory();
        Vehicle vehicle = VehicleFactory.getVehicle(vehicleType);
        if (vehicle != null) vehicle.drive();
        else System.out.println("Invalid Input");
	}

}
