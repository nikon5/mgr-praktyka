package com.korczak.kacper.mgr.refactoring.tdd.after.replaceonedistinctionwithcomposite;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class PartTest {

	@Test
	public void canCreatePart() {

		new Part(5);
	}

	@Test
	public void shouldReturnSamePriceAsPassedToConstructor() {
		float expectedPrice = 5;
		Part part = new Part(expectedPrice);

		float actualPrice = part.getPrice();

		assertThat(actualPrice , is(equalTo(expectedPrice)));
	}
}
