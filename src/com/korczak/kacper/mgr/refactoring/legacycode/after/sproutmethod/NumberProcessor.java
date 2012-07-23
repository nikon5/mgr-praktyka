package com.korczak.kacper.mgr.refactoring.legacycode.after.sproutmethod;

import java.util.ArrayList;
import java.util.List;

import com.korczak.kacper.mgr.refactoring.legacycode.after.sproutmethod.Element;


public class NumberProcessor {
	private List<Element> processedElementsList = new ArrayList<Element>();

	//zbudowany w celu testowania
	public void setProcessedElementsList(List<Element> processedElementsList) {
		this.processedElementsList = processedElementsList;
	}

	public List<Element> getProcessedElementsList() {
		return processedElementsList;
	}

	public void processElements(List<Element> toBeProcessedList) {
		List<Element> listFilteredFromDuplicates = removeDuplicates(toBeProcessedList);
		for(int index = 0; index < listFilteredFromDuplicates.size(); index++) {
			Element e = listFilteredFromDuplicates.get(index);
			e.process();
			processedElementsList.add(e);
		}
	}

	public List<Element> removeDuplicates(List<Element> toBeProcessedList) {
		List<Element> listWithoutDuplicates = new ArrayList<Element>();
		for(Element e : toBeProcessedList) {
			if(!this.processedElementsList.contains(e)) {
				listWithoutDuplicates.add(e);
			}
		}
		return listWithoutDuplicates;
	}
}
