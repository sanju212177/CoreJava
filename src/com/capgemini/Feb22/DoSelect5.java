package com.capgemini.Feb22;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.*;
class Employee {
    String name;
    int salary;
    public Employee(String name,int salary)
    {
        this.name=name;
        this.salary=salary;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void setSalary(int salary)
    {
        this.salary=salary;
    }
    public String  getName()
    {
        return this.name;
    }
    public int  getSalary()
    {
        return this.salary;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append("name: ");
        sb.append(name);
        sb.append(" salary: ");
        sb.append("" + salary+">");
        return sb.toString();

    }
}
class EmployeeInfo{
    enum SortMethod {
        BYNAME , BYSALARY
    }
    public List<Employee> sort(List<Employee> emps, final SortMethod method){
        List<Employee> list = null;
        if(SortMethod.BYNAME == method){
            list = emps.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
        }
        else if(SortMethod.BYSALARY == method){
        	
            list = emps.stream().sorted(Comparator.comparing(Employee::getSalary)).collect(Collectors.toList());
        }
        return list;
    }
    public boolean isCharacterPresentInAllNames(Collection<Employee> entities, String character){
        return entities.stream().filter(a -> a.getName().startsWith(character)).count()>0;
    }

}

public class DoSelect5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
