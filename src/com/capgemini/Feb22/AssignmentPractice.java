package com.capgemini.Feb22;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class Activity{
  //Implement Activity class here..
  String string1;
  String string2;
  String operator;

  Activity(String string1, String string2, String operator){
    this.string1 = string1;
    this.string2 = string2;
    this.operator = operator;
  }
  Activity(){

  }
}



public class AssignmentPractice {
  //Implement the two function given in description in here...
  public String handleException (Activity a)throws NullPointerException{
    try{
      if(a.string1==null || a.string2==null){
        throw new NullPointerException();
      }
      else if(a.operator!="+" && a.operator!="-"){
        throw new Exception();
      }
      else{
        return "No Exception Found";
      }
    }
    catch(NullPointerException e){
      return("Null values found");
    }
    catch(Exception e){
      return("Operator");
    }
  }
  public String doOperation(Activity a){
    switch(a.operator){
      case "+":
        return a.string1+a.string2;
      case "-":
        return a.string1.replace(a.string2,"");
      default:
        return null;
    }
  } 
	public static void main(String args[] ) throws Exception {
    //Write your own main to check the program..
    
	}
}
