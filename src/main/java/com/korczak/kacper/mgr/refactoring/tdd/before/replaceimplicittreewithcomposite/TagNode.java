package com.korczak.kacper.mgr.refactoring.tdd.before.replaceimplicittreewithcomposite;

public class TagNode {

	public String createOrdersTag() {
		return 	"<orders>" +
					"<order>" +
						"<item number='12660' quantity='1'>" +
							"Dog House" +
						"</item>" +
						"<item number='54678' quantity='1'>" +
							"Bird Feeder" +
						"</item>" +
					"</order>" +
				"</orders>";
	}

}