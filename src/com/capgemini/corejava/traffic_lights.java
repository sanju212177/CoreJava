package com.capgemini.corejava;

import java.util.Scanner;

public class traffic_lights {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String lights = in.next();
		switch(lights) {
			case "Red":
			case "red":
			case "RED":
				System.out.println("stop");
				break;
			case "Yellow":
			case "yellow":
			case "YELLOW":
				System.out.println("ready");
				break;
			case "green":
			case "Green":
			case "GREEN":
				System.out.println("go");
				break;
			default:
				System.out.println("Invalid Input");
		}
	}

}
