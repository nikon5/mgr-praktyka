package com.korczak.kacper.mgr.refactoring.tdd.before.chainconstructors;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import com.korczak.kacper.mgr.refactoring.tdd.after.chainconstructors.ChainConstructor;

public class ChainConstructorsTest {

	private float notional;
	private float outstanding;
	private int rating;
	private Date expiry;

	@Before
	public void setUp() {
		notional = 1;
		outstanding = 2;
		rating = 3;
		expiry = new Date();
	}

	@Test
	public void canCreateChainConstructor() {

		new ChainConstructor(notional, outstanding, rating, expiry);
	}


	@Test
	public void canCreateChainConstructor2() {
		Date maturity = new Date();

		new ChainConstructor(notional, outstanding, rating, expiry, maturity);
	}

	@Test
	public void canCreateChainConstructor3() {
		Date maturity = new Date();
		int strategy = 5;

		new ChainConstructor(strategy, notional, outstanding, rating, expiry, maturity);
	}
}
