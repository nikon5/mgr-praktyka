package com.korczak.kacper.mgr.refactoring.tdd.before.strategypattern;

public class TaxCalculator {

	private static final int ONE_THOUSAND = 1000;
	private static final int TEN_THOUSAND = 10000;
	private static final double TWENTY_PERCENT = 0.2;
	private static final double FORTY_PERCENT = 0.4;

	public double calculate(double taxableAmount) {
		if(checkFirstThresholdFor(taxableAmount)) {
			return taxableAmount;
		}else if(checkSecondTresholdFor(taxableAmount)) {
			return TWENTY_PERCENT * taxableAmount;
		}else if(checkThirdTresholdFor(taxableAmount)) {
			return FORTY_PERCENT * taxableAmount;
		}
		else throw new RuntimeException("Taxable amount below zero.");
	}

	private boolean checkThirdTresholdFor(double taxableAmount) {
		return taxableAmount > TEN_THOUSAND;
	}

	private boolean checkSecondTresholdFor(double taxableAmount) {
		return taxableAmount > ONE_THOUSAND && taxableAmount <= TEN_THOUSAND;
	}

	private boolean checkFirstThresholdFor(double taxableAmount) {
		return taxableAmount >= 0 && taxableAmount <= ONE_THOUSAND;
	}

}