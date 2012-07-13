package com.korczak.kacper.mgr.refactoring.tdd.after.encapsulatecompositewithbuilder;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;


public class XMLBuilderTest {

	@Test
	public void canCreateTagNode() {
		String name = "orders";

		new TagNode(name);
	}

	@Test
	public void shouldReutrnOneElementTreeWhenGivenName() {
		XMLBuilder builder = new XMLBuilder("orders");

		String expected = "<orders>" + "</orders>";

		assertThat(expected, is(equalTo(builder.toString())));
	}

	@Test
	public void shouldReturnChildNodeWhenParentNodeGiven() {
		String rootName = "orders";
		String expected = "<orders>" +
						  	"<order>" +
						  		"<item>" +
						  		"</item>" +
						  	"</order>" +
						  "</orders>";
		XMLBuilder builder = new XMLBuilder(rootName);

		builder.addBelow("order");
		builder.addBelow("item");

		assertThat(expected, is(equalTo(builder.toString())));
	}

	@Test
	public void shouldReturnSibilingNodeWhenBrohterNodeGiven() {
		String expected = "<orders>" +
				"<order>" +
					"<item>" +
					"</item>" +
					"<item>" +
					"</item>" +
				"</order>" +
			"</orders>";
		String rootName = "orders";
		XMLBuilder builder = new XMLBuilder(rootName);
		builder.addBelow("order");
		builder.addBelow("item");
		builder.addBeside("item");
		assertThat(expected, is(equalTo(builder.toString())));
	}

	@Test
	public void shouldReturnNodeWithAttributeWhenNodeGiven() {
		String expected =
		"<orders>" +
				"<order number='12345' quantity='2'>" +
				"</order>" +
		"</orders>";

		XMLBuilder builder = new XMLBuilder("orders");
		builder.addBelow("order");
		builder.addAttribute("number", "12345");
		builder.addAttribute("quantity", "2");

		assertThat(expected, is(equalTo(builder.toString())));
	}
}





