package com.stackroute.assignment;

import java.math.BigDecimal;

public class MemberVariable {
 public static void main(String[] args) {
	 Member mem = new Member("Harry Potter",30,new BigDecimal(10000));
	 System.out.println("Member name: "+mem.getName());
	 System.out.println("Member age: "+mem.getAge());
	 System.out.println("Member Salary: "+mem.getSalary());
 }
}
