package com.korczak.kacper.mgr.refactoring.tdd.before.replaceonedistinctionwithcomposite;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class ProductTest {

	@Test
	public void canCreateProduct() {

		new Product();
	}

	@Test
	public void shouldReturnPriceWhenVectorHasTwoParts() {
		int singlePartPrice = 5;
		Product product = initializeProductWithPartsHavingPassed(singlePartPrice);
		float expectedPrice = 10f;

		float actualPrice = product.getPrice();

		assertThat(actualPrice, is(equalTo(expectedPrice)));
	}


	@Test
	public void shouldReturnPriceWhenVectorHasTwoPartSets() {
		float singlePartPrice = 5f;
		Product product = initializeProductWithPartSetHaving(singlePartPrice);
		float expectedPrice = 15f;

		float actualPrice = product.getPrice();

		assertThat(actualPrice, is(equalTo(expectedPrice)));

	}

	@Test
	public void shouldGetPriceWhenGivenSetLargerThanOne() {
		Product product = initializeProductWithPartsAndPartSet();
		float expected = 20f;

		float actualPrice = product.getPrice();

		assertThat(actualPrice , is(equalTo(expected)));

	}

	private Product initializeProductWithPartsAndPartSet() {
		float initialPrice = 5f;

		Product product = new Product();
		Part part1 = new Part(initialPrice);
		product.add(part1);
		Part part2 = new Part(initialPrice);
		product.add(part2);

		PartSet partSet = new PartSet();
		Part part3 = new Part(initialPrice);
		partSet.add(part3);
		Part part4 = new Part(initialPrice);
		partSet.add(part4);

		product.add(partSet);
		return product;
	}

	private Product initializeProductWithPartSetHaving(float initialPrice) {
		Part partOne = new Part(initialPrice);
		Part partTwo = new Part(initialPrice);
		Part partThree = new Part(initialPrice);
		PartSet partSetOne = new PartSet();
		partSetOne.add(partOne);
		PartSet partSetTwo = new PartSet();
		partSetTwo.add(partTwo);
		partSetTwo.add(partThree);
		Product product = new Product();
		product.add(partSetOne);
		product.add(partSetTwo);
		return product;
	}


	private Product initializeProductWithPartsHavingPassed(float initialPrice) {
		Part partOne = new Part(initialPrice);
		Part partTwo = new Part(initialPrice);
		Product product = new Product();
		product.add(partOne);
		product.add(partTwo);
		return product;
	}
}
