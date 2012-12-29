package com.korczak.kacper.mgr.refactoring.tdd.before.replaceonedistinctionwithcomposite;

public class Part {

	private float price = 0.0f;

	protected Part(float price) {
		this.price = price;
	}

	public float getPrice() {
		return this.price;
	}
}