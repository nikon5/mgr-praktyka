package com.korczak.kacper.mgr.refactoring.tdd.after.chainconstructors;

import java.util.Date;

public class ChainConstructor {

	private static final int DEFAULT_STRATEGY = 5;
	private static final Date NULL_MATURITY_DATE = null;
	@SuppressWarnings("unused")
	private float notional;
	@SuppressWarnings("unused")
	private float outstanding;
	@SuppressWarnings("unused")
	private int rating;
	@SuppressWarnings("unused")
	private Date expiry;
	@SuppressWarnings("unused")
	private Date maturity;
	@SuppressWarnings("unused")
	private int strategy;

	public ChainConstructor(float notional, float outstanding, int rating, Date expiry) {
		this(DEFAULT_STRATEGY, notional, outstanding, rating, expiry, NULL_MATURITY_DATE);
	}

	public ChainConstructor(float notional, float outstanding, int rating,
			Date expiry, Date maturity) {
		this(DEFAULT_STRATEGY, notional, outstanding, rating, expiry, maturity);
	}

	public ChainConstructor(int strategy,float notional, float outstanding, int rating,
			Date expiry, Date maturity) {
		this.strategy = strategy;
		this.notional = notional;
		this.outstanding = outstanding;
		this.rating = rating;
		this.expiry = expiry;
		this.maturity = maturity;
	}
}
