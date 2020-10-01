package com.example.demo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.example.demo.controller.Calcurator;

public class JUnitTest2 {
	@BeforeClass//테스트 클래스가 실행 될때 실행 됨
	public static void beforeClassTest() {
		System.out.println("BeforeClass");
	}
	@Before//@Test메서드가 실행될 때 실행 됨
	public void beforeTest() {
		System.out.println("Before");
	}
	@After//@Test 메서드가 종료될 때 실행 됨
	public void afterTest() {
		System.out.println("after");
	}

	@AfterClass//테스트 클래스가 종료 될때 실행됨
	public static void afterClassTest() {
		System.out.println("AfterClass");
	}
	
	@Test
	public void calcuratorTest() {
		Calcurator calcurator = new Calcurator();
		double plus = calcurator.plus(10, 20);
		System.out.println("plus : " + plus);
	}
	@Test
	public void calcuratorTest1() {
		Calcurator calcurator = new Calcurator();
		double minus = calcurator.minus(10, 20);
		System.out.println("minus : " + minus);
	}	
}
