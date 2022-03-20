package com.capgemini.oops;

public class Mobileshop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		vivoMobile v = new vivoMobile("vivo",6,128,15000);
		OppoMobile o = new OppoMobile("oppo",8,256,16000);
		v.printMobileDetails();
		o.printMobileDetails();
	}

}
