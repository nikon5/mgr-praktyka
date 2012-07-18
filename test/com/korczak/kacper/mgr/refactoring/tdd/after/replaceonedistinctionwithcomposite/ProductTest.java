package com.korczak.kacper.mgr.refactoring.tdd.after.replaceonedistinctionwithcomposite;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class ProductTest {

	@Test
	public void canCreateProduct() {
		new Product();
	}

	@Test
	public void shouldReturnPriceWhenOnePartAdded() {
		Product product = initializeProductWithPart();
		float expectedPrice = 5f;

		float actualPrice = product.getPrice();

		assertThat(actualPrice, is(equalTo(expectedPrice)));
	}

	@Test
	public void shouldReturnPriceWhenThreePartsAdded() {
		Product product = initializeProductWithMultipleParts();
		float expected = 15;

		float actual = product.getPrice();

		assertThat(actual , is(equalTo(expected)));
	}

	private Product initializeProductWithMultipleParts() {
		int initialPrice = 5;
		Product product = new Product();
		Part part1 = new Part(initialPrice);
		product.add(part1);
		Part part2 = new Part(initialPrice);
		product.add(part2);
		Part part3 = new Part(initialPrice);
		product.add(part3);
		return product;
	}

	private Product initializeProductWithPart() {
		int initialPrice = 5;
		Part part = new Part(initialPrice);
		Product product = new Product();
		product.add(part);

		return product;
	}
}
