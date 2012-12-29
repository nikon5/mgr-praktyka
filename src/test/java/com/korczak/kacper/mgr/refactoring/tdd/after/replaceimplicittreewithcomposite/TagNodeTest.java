package com.korczak.kacper.mgr.refactoring.tdd.after.replaceimplicittreewithcomposite;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import com.korczak.kacper.mgr.refactoring.tdd.after.replaceimplicittreewithcomposite.TagNode;

public class TagNodeTest {

	@Test
	public void canCreateTagNode() {
		String name = "orders";

		new TagNode(name);
	}

	@Test
	public void shouldReutrnOneElementTreeWhenGivenName() {
		String expected = "<orders>" + "</orders>";

		TagNode tagNode = new TagNode("orders");

		assertThat(expected, is(equalTo(tagNode.toString())));
	}

	@Test
	public void shouldReturnTreeWhenGivenChildren() {
		String expected =
			"<orders>" +
			  	"<order>" +
			  		"<item>" +
			  		"</item>" +
			  	"</order>" +
			"</orders>";

		TagNode orders = new TagNode("orders");
		TagNode order = new TagNode("order");
		TagNode item = new TagNode("item");
		orders.add(order);
		order.add(item);

		assertThat(expected, is(equalTo(orders.toString())));
	}

	@Test
	public void shouldReturnTreeWithAttributesAndValues() {
		String expected = settingUpExpectedString();

		TagNode orders = whenOrdersTreeCreated();

		assertThat(expected, is(equalTo(orders.toString())));
	}

	private String settingUpExpectedString() {
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

	private TagNode whenOrdersTreeCreated() {
		TagNode orders = new TagNode("orders");
		TagNode order = new TagNode("order");
		TagNode item1 = new TagNode("item");
		item1.addAttribute("number", "12660");
		item1.addAttribute("quantity", "1");
		item1.addValue("Dog House");
		TagNode item2 = new TagNode("item");
		item2.addAttribute("number", "54678");
		item2.addAttribute("quantity", "1");
		item2.addValue("Bird Feeder");
		orders.add(order);
		order.add(item1);
		order.add(item2);
		return orders;
	}
}






