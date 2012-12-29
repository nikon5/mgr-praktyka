package com.korczak.kacper.mgr.refactoring.legacycode.after.sproutmethod;

import static org.junit.Assert.*;
import static org.junit.matchers.JUnitMatchers.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.korczak.kacper.mgr.refactoring.legacycode.after.sproutmethod.Element;
import com.korczak.kacper.mgr.refactoring.legacycode.after.sproutmethod.NumberProcessor;

public class NumberProcessorTest {

	@Test
	public void CanCreateNumberProcessor() {
		new NumberProcessor();
	}

	@Test
	public void shouldReturnSameProcessListAsGivenList() {
		Element[] expected = {new Element(5), new Element(5), new Element(5)};

		NumberProcessor numberPorcessor = new NumberProcessor();
		numberPorcessor.setProcessedElementsList(addThreeElementsToList());

		List<Element> actual = numberPorcessor.getProcessedElementsList();

		assertThat(actual, hasItems(expected));
	}

	@Test
	public void shouldRemoveDuplicatesWhenGivenListWithDuplicates() {
		Element[] expected = {new Element(6)};

		NumberProcessor numberProcessor = new NumberProcessor();
		List<Element> initListForNumberProcessor = initializeBenchmarkNumberProcessorList();
		numberProcessor.setProcessedElementsList(initListForNumberProcessor);

		List<Element> inputListWithDuplicates = createListWithDuplicates();

		List<Element> actual = numberProcessor.removeDuplicates(inputListWithDuplicates);

		assertThat(actual, hasItems(expected));
	}

	@Test
	public void shouldReturnIntactListWhenGivenListWithoutDuplicates() {
		Element[] expected = {new Element(6)};

		NumberProcessor numberProcessor = new NumberProcessor();
		List<Element> initListForNumberProcessor = initializeBenchmarkNumberProcessorList();
		numberProcessor.setProcessedElementsList(initListForNumberProcessor);

		List<Element> inputListWithDuplicates = createListWitoutDuplicates();

		List<Element> actual = numberProcessor.removeDuplicates(inputListWithDuplicates);

		assertThat(actual, hasItems(expected));
	}

	private List<Element> createListWitoutDuplicates() {
		List<Element> listWithoutDuplicates = new ArrayList<Element>();
		listWithoutDuplicates.add(new Element(6));
		listWithoutDuplicates.add(new Element(8));
		return listWithoutDuplicates;
	}

	private List<Element> initializeBenchmarkNumberProcessorList() {
		List<Element> initListForNumberProcessor = new ArrayList<Element>();
		initListForNumberProcessor.add(new Element(5));
		return initListForNumberProcessor;
	}

	private List<Element> createListWithDuplicates() {
		List<Element> listWithDuplicates = new ArrayList<Element>();;
		listWithDuplicates.add(new Element(5));
		listWithDuplicates.add(new Element(5));
		listWithDuplicates.add(new Element(6));
		return listWithDuplicates;
	}

	private List<Element> addThreeElementsToList() {
		int initialValue = 5;
		List<Element> list = new ArrayList<Element>();
		list.add(new Element(initialValue));
		list.add(new Element(initialValue));
		list.add(new Element(initialValue));
		return list;
	}
}
