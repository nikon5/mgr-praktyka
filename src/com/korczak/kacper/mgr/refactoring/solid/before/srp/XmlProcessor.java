package com.korczak.kacper.mgr.refactoring.solid.before.srp;


public class XmlProcessor {

	public CompiledNode copmile(String xml) {
		// do some string compilation
		return new CompiledNode();
	}

	public XmlProcessedNode process(String xml) {
		// do some xml processing
		return new XmlProcessedNode();
	}

	public String prettyFormat(String xml) {
		// do some pretty formatting e.g. make a tree from one liner xml
		return xml;
	}

	public boolean validate(String xml) {
		// do some xml validation
		return true;
	}

	public String assembleOneLineFrom(String xml) {
		// prepare one line of text from input xml tree (string)
		return xml;
	}


}
