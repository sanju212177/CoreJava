package com.capgemini.corejava;
import java.util.*;

public class switchDemo {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter The Day Number : ");
        int n = in.nextInt();
        String dayName = null;
        switch (n) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                System.out.println("Invalid Input!");
                break;
        }
        if(dayName != null)
            System.out.println("It's "+dayName);
    }

}
