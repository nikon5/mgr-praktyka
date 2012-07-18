package com.korczak.kacper.mgr.refactoring.tdd.after.replaceonedistinctionwithcomposite;

import java.util.Enumeration;
import java.util.Vector;

public class Product {

	private Vector<Part> parts = new Vector<Part>();

	public void add(Part part) {
		parts.addElement(part);
	}

	public float getPrice() {
		float price = 0.0f;

		for(Enumeration<Part> e=parts.elements(); e.hasMoreElements();) {
			Part part = e.nextElement();
			price += part.getPrice();
		}

		return price;
	}
}
