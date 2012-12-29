package com.korczak.kacper.mgr.refactoring.tdd.after.replaceonedistinctionwithcomposite;

public class Part {

	private float price = 0.0f;

	Part(float price) {
		this.price = price;
	}

	public float getPrice() {
		return this.price;
	}
}
