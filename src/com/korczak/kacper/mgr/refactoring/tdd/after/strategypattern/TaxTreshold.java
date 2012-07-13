package com.korczak.kacper.mgr.refactoring.tdd.after.strategypattern;

public interface TaxTreshold {

	public abstract boolean isApplicableFor(double taxableAmount);

	public abstract double apply(double taxableAmount);

}