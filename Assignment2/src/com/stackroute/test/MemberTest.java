package com.stackroute.test;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

import com.stackroute.assignment.Member;

class MemberTest {
	@Test
	void testMember() {
		 Member mem = new Member("Harry Potter",30,new BigDecimal(10000));
		 assertEquals("Harry Potter", mem.getName()); 
		 assertEquals(30, mem.getAge()); 
		 assertEquals(new BigDecimal(10000), mem.getSalary()); 
		 
	}

}
