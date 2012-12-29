package com.korczak.kacper.mgr.refactoring.tdd.before.replaceonedistinctionwithcomposite;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class PartTest {

	@Test
	public void canCreatePart() {

		int initialPrice = 8;
		new Part(initialPrice);
	}

	@Test
	public void shouldReturnSameValueAsPassedToConstructor() {
		float expectedPrice = 5;
		Part part = new Part(expectedPrice);

		float actualPrice = part.getPrice();

		assertThat(actualPrice, is(equalTo(expectedPrice)));
	}

}
