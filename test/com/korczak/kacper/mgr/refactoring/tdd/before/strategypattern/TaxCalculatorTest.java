package com.korczak.kacper.mgr.refactoring.tdd.before.strategypattern;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;



public class TaxCalculatorTest {

	private TaxCalculator taxCalculator;

	@Before
	public void setUp() {
		taxCalculator = new TaxCalculator();
	}

	@Test(expected = RuntimeException.class)
	public void shouldThrowExceptionWhenAmonuntBelowZero(){
		double taxableAmount = -5;

		taxCalculator.calculate(taxableAmount);
	}

	@Test
	public void shouldApplyZeroPercentageRateWhenAmonuntAboveZero(){
		double taxableAmount = 1;

		double actualAmount = taxCalculator.calculate(taxableAmount);

		assertThat(actualAmount, is(equalTo(taxableAmount)));
	}

	@Test
	public void shouldApplyZeroPercentageRateWhenAmonuntBelowThousand(){
		double taxableAmount = 1000;

		double actualAmount = taxCalculator.calculate(taxableAmount);

		assertThat(actualAmount, is(equalTo(taxableAmount)));
	}


	@Test
	public void shouldApply20PercentageRateWhenAmountAboveThousand() {
		double taxableAmount = 1001;

		double actualAmount = taxCalculator.calculate(taxableAmount);

		assertThat(actualAmount, is(equalTo(twentyPercentOf(taxableAmount))));
	}

	@Test
	public void shouldApply20PercentRateWhenAmountBelowTenThousand() {
		double taxableAmount = 10000;

		double actualAmount = taxCalculator.calculate(taxableAmount);

		assertThat(actualAmount, is(equalTo(twentyPercentOf(taxableAmount))));
	}

	@Test
	public void shouldApply40PercentageRateWhenAmountAboveTenThousand() {
		double taxableAmount = 10001;

		double actualAmount = taxCalculator.calculate(taxableAmount);

		assertThat(actualAmount, is(equalTo(fortyPercentOf(taxableAmount))));
	}


	private double fortyPercentOf(double taxableAmount) {
		final double fortyPercent = 0.4;
		return fortyPercent * taxableAmount;
	}

	private double twentyPercentOf(double taxableAmount) {
		final double twentyPercent = 0.2;
		return twentyPercent * taxableAmount;
	}

}