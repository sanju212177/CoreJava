package com.capgemini.Feb22;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class CompanyJobRepository {
	static String getJobPrediction (int age, String highestQualification)throws NotEligibleException{
		if(age<19)
			throw new NotEligibleException("You are underage for any job");
		else if(highestQualification.equalsIgnoreCase("B.E")|| highestQualification.equalsIgnoreCase("M.S") || highestQualification.equalsIgnoreCase("PhD")){
			if(age>=26 && (highestQualification.equalsIgnoreCase("M.S")||highestQualification.equalsIgnoreCase("PhD")))
				return "We have openings for senior developer";
			else if(age>=21 && highestQualification.equalsIgnoreCase("B.E"))
				return "We have openings for junior developer";
			else
				return "Sorry we have no openings for now";
		}
		else
			throw new NotEligibleException("We do not have any job that matches your qualifications");
	}
}

public class DoSelectQuestion4 {

	public static String searchForJob (int age, String highestQualification)throws NotEligibleException{
		if(age>=200 || age<=0)
			throw new NotEligibleException("The age entered is not typical for a human being");
		else{
			try{
				CompanyJobRepository ob = new CompanyJobRepository();
				return ob.getJobPrediction(age,highestQualification);
			}
			catch(NotEligibleException e){
				return e.getMessage();
			}
		}
	}

	public static void main(String args[] )  {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT */
		try {
			System.out.println(searchForJob(22,"B.E"));
		} catch (NotEligibleException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
}
class NotEligibleException extends Exception {
	public NotEligibleException (String message) {
		super(message);
	}
}