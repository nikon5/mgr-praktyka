package com.korczak.kacper.mgr.refactoring.legacycode.before.sproutmethod;

import java.util.ArrayList;
import java.util.List;

public class NumbersProcessor {

	private List<Element> processedElementsList = new ArrayList<Element>();

	public List<Element> getProcessedElementsList() {
		return processedElementsList;
	}

	public void processElements(List<Element> toBeProcessedList) {
		for(int index = 0; index < toBeProcessedList.size(); index++) {
			Element e = toBeProcessedList.get(index);
			e.process();
			processedElementsList.add(e);
		}
	}

}