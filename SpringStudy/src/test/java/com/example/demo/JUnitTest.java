package com.example.demo;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.example.demo.controller.Calcurator;

public class JUnitTest {
	@Test
	public void calcuratorTest() {
		Calcurator calcurator = new Calcurator();
		double plus = calcurator.plus(10, 20);
		double minus = calcurator.minus(10, 20);
		double times = calcurator.times(10, 20);
		double divid = calcurator.divid(10, 20);
		
		Boolean isTest = false;
		
		//assertEquals();//객체 A와 B의 값이 일치하는가
		//assertSame(plus, minus);//객체 A와 B가 일치하는가
		//assertArrayEquals();//배열 A,B가 일치하는가
		assertNotNull(plus);//객체 A가 null인가 아닌가
		//assertTrue(isTest);//객체가 true인지 확인
	}
}
