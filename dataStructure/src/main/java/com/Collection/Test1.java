package com.Collection;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Test1 {
	
	public static void main(String[] args) {
		BiFunction<Integer,Integer, String> f = (i1,i2) -> {
			String data="";
				if(i1  ==  i2) {
					data = data+"welcome! Rakesh ";
				}
				return data;
				
		};
		
		System.out.println("String value is: "+f.apply(10,10));
		
	}

}
class Employee{
	private String name;
	private double salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
	
}
