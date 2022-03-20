package com.capgemini.Feb15;

import java.util.*;

public class TestMedicine {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Medicine[] med = new Medicine[5];
		for(int i=0;i<5;i++) {
			Random random = new Random();
			int ch = random.nextInt(3);
			System.out.println("Enter Price and date in mm/yyyy format");
			double price = in.nextDouble();
			String expdate = in.next();
			if(ch == 1) {
				med[i] = new Tablet(price,expdate);
			}
			else if(ch == 2) {
				med[i] = new Syrup(price,expdate);
			}
			else {
				med[i] = new Ointment(price,expdate);
			}
		}
		for(int i=0;i<5;i++) {
			med[i].displayLabel();
			med[i].getDetails();
		}
	}

}
