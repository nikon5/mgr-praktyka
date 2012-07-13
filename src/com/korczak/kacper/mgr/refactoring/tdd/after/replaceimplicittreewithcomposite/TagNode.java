package com.korczak.kacper.mgr.refactoring.tdd.after.replaceimplicittreewithcomposite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TagNode {

	private String tagName;
	private String tagValue = "";
	private String attributes = "";
	private List<TagNode> children = new ArrayList<TagNode>();

	public TagNode(String name) {
		this.tagName = name;
	}

	public void add(TagNode childNode) {
		this.children.add(childNode);
	}

	public void addAttribute(String name, String value) {
		this.attributes += (" " + name + "='" + value + "'");
	}

	public void addValue(String value) {
		tagValue = value;
	}

	@Override
	public String toString() {
		String result = new String();
		result += "<" + this.tagName + attributes + ">";
		Iterator<TagNode> it = this.children.iterator();
		while(it.hasNext()) {
			TagNode node = it.next();
			result += node.toString();
		}
		if(!this.tagValue.equals("")) {
			result += this.tagValue;
		}
		result += "</" + this.tagName + ">";
		return result;
	}


}
