package com.capgemini.corejava;
import java.util.*;
public class switch2Demo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter day of the week : ");
		String weekDay = in.next();
		weekDay=weekDay.toUpperCase();
		int num=0;
		switch(weekDay) {
			case "MONDAY":
			case "MON":
				num = 1;
				break;
			case "TUESDAY":
			case "TUE":
				num = 2;
				break;
			case "WEDNESDAY":
			case "WED":
				num = 3;
				break;
			case "THRUSDAY":
			case "THU":
			num = 4;
				break;
			case "FRIDAY":
			case "FRI":
				num = 5;
				break;
			case "SATURDAY":
			case "SAT":
				num = 6;
				break;
			case "SUNDAY":
			case "SUN":
				num = 7;
				break;
			default:
				System.out.println("wrong input");
		}
		if(num!=0) {
			System.out.println(num);
		}
	}
}
