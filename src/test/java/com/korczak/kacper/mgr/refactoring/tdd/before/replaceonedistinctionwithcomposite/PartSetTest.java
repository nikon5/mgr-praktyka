package com.korczak.kacper.mgr.refactoring.tdd.before.replaceonedistinctionwithcomposite;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class PartSetTest {

	@Test
	public void canCreatePartSet() {
		new PartSet();
	}

	@Test
	public void shouldReturnSameValueAsPassedToConstructor1() {
		float expectedPrice = 10f;
		PartSet partSet = initializePartSetWith(expectedPrice);

		float actualPrice = partSet.getPrice();

		assertThat(actualPrice, is(equalTo(expectedPrice)));
	}

	@Test
	public void shouldReturnSummedPriceFromVector() {
		float expected = 15;
		PartSet partSet = initializePartSet();

		float actualPrice = partSet.getPrice();

		assertThat(actualPrice, is(equalTo(expected)));
	}

	private PartSet initializePartSet() {
		PartSet partSet = new PartSet();
		Part part1 = new Part(5);
		Part part2 = new Part(5);
		Part part3 = new Part(5);
		partSet.add(part1);
		partSet.add(part2);
		partSet.add(part3);
		return partSet;
	}

	private PartSet initializePartSetWith(float expectedPrice) {
		Part part = new Part(expectedPrice);
		PartSet partSet = new PartSet();
		partSet.add(part);
		return partSet;
	}
}
