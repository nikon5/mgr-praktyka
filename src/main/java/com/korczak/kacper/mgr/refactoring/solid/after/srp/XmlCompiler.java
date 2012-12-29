package com.korczak.kacper.mgr.refactoring.solid.after.srp;

import com.korczak.kacper.mgr.refactoring.solid.before.srp.CompiledNode;
import com.korczak.kacper.mgr.refactoring.solid.before.srp.XmlProcessedNode;

public class XmlCompiler {

	public CompiledNode copmile(String xml) {
		// do some string compilation
		return new CompiledNode();
	}

	public XmlProcessedNode process(String xml) {
		// do some xml processing
		return new XmlProcessedNode();
	}
}
