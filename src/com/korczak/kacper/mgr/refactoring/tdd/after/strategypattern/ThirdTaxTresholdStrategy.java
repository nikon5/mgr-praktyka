package com.korczak.kacper.mgr.refactoring.tdd.after.strategypattern;

public class ThirdTaxTresholdStrategy implements TaxTreshold {

	private static final double FORTY_PERCENT = 0.4;
	private static final int TEN_THOUSAND = 10000;

	@Override
	public boolean isApplicableFor(double taxableAmount) {
		return taxableAmount > TEN_THOUSAND;
	}

	@Override
	public double apply(double taxableAmount) {
		return FORTY_PERCENT * taxableAmount;
	}

}
