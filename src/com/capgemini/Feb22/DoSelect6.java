package com.capgemini.Feb22;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.stream.Collectors;


class Candidate{
  //Write Your Code Here..
    private String name;
    private int id;
   private int age;
    private String gender;
   private String department;
   private int yearOfJoining;
   private double salary;
   Candidate(int id, String name, int age, String gender, String department, int yearOfJoining, double salary){
        this.id = id;
        this.name = name;
        this.age =age;
        this.gender = gender;
        this.department = department;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
   }
   public void setId(int id){
     this.id = id;
   }
   public void setAge(int age){
         this.age = age;
   }
   public void setName(String name){
        this.name = name;
   }
   public void setGender(String gender){
     this.gender = gender;
   }
   public void setDepartment(String department){
       this.department = department;
   }
   public void set(int yearOfJoining){
       this.yearOfJoining = yearOfJoining;
   }
   public void setSalary(double salary){
     this.salary = salary;
   }
   public String getName(){
     return this.name;
   }
   public int getAge(){
     return age;
   }
   public int  getId(){
     return this.id;
   }
   public String getGender(){
     return this.gender;
   }
   public String getDepartment(){
     return this.department;
   }
   public int getYearOfJoining(){
     return this.yearOfJoining;
   }
   public double  getSalary(){
     return this.salary;
   }
     @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", department="
                + department + ", yearOfJoining=" + yearOfJoining + ", salary=" + salary + "]";
    }
}

class Implementation{
  //Write Your Code Here..
	 public Map<String, Long> getCount(List<Candidate> list){
		    Map<String ,Long> mp = list.stream().collect(Collectors.groupingBy(a -> a.getGender(),Collectors.counting() ) );
		       return mp;
		   }
		    public  Map<String, Double> getAverageAge(List<Candidate> list){
		    Map<String ,Double> mp = list.stream().collect(Collectors.groupingBy(a -> a.getGender(),Collectors.averagingInt(a -> a.getAge()) ) );
		    return mp;
		    }
		    public Map<String, Long> countCandidatesDepartmentWise(List<Candidate> list){
		    Map<String ,Long> mp = list.stream().collect(Collectors.groupingBy(a -> a.getDepartment(),Collectors.counting()) );
		    return mp;
		    }
		    public Optional<Candidate>  getYoungestCandidateDetails(List<Candidate> list){
		      Optional<Candidate> obj = list.stream().filter(a-> a.getGender().equals("Male")&& a.getDepartment().equals("Product Development")).max(Comparator.comparingDouble(a -> a.getAge()));
		      return obj;
		     }
		}


public class DoSelect6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
