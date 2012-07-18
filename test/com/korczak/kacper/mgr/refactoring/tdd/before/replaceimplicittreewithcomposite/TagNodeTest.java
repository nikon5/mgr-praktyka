package com.korczak.kacper.mgr.refactoring.tdd.before.replaceimplicittreewithcomposite;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class TagNodeTest {

	@Test
	public void shouldReturnTreeFromGivenString() {
		String expected = createExpectedOrdersTag();

		TagNode tagNode = new TagNode();

		assertThat(expected, is(equalTo(tagNode.createOrdersTag())));
	}

	private String createExpectedOrdersTag() {
		String expected =
				"<orders>" +
					"<order>" +
						"<item number='12660' quantity='1'>" +
						"Dog House" +
						"</item>" +
						"<item number='54678' quantity='1'>" +
						"Bird Feeder" +
						"</item>" +
					"</order>" +
				"</orders>";
		return expected;
	}

}