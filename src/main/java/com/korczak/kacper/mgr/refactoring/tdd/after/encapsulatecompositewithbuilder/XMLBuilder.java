package com.korczak.kacper.mgr.refactoring.tdd.after.encapsulatecompositewithbuilder;

public class XMLBuilder {

	private TagNode root;
	private TagNode current;
	private TagNode parent;

	public XMLBuilder(String rootName) {
		this.root = new TagNode(rootName);
		this.current = root;
		this.parent = root;
	}


	public void addBelow(String node) {
		TagNode childNode = new TagNode(node);
		current.add(childNode);
		parent = current;
		current = childNode;
	}

	public void addBeside(String sibling) {
		TagNode siblingNode = new TagNode(sibling);
		parent.add(siblingNode);
		current = siblingNode;
	}

	@Override
	public String toString() {
		return root.toString();
	}


	public void addAttribute(String name, String value) {
		current.addAttribute(name, value);
	}


}
