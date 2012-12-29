package com.korczak.kacper.mgr.refactoring.legacycode.before.wrapmethod;

public class Money {

	private int sum;

	public Money() {
		this.sum = 0;
	}

	public void add(int amount) {
		this.sum += amount;
	}

	public int getSum() {
		return this.sum;
	}

}