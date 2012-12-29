package com.korczak.kacper.mgr.refactoring.legacycode.before.sproutmethod;

import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.hasItems;
import static org.mockito.BDDMockito.given;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class NumbersProcessorTest {

	@Mock List<Element> toBeProcessedList;
	@Mock Element element;
	private NumbersProcessor numbersProcessor;

	@Before
	public void setUp() {
		prepareMocks();
		numbersProcessor = new NumbersProcessor();
	}

	@Test
	public void canCreateNumbersProcessor() {
		new NumbersProcessor();
	}

	@Test
	public void shouldProcessAllParametersPassedToMethod() {
		numbersProcessor.processElements(toBeProcessedList);

		verify(toBeProcessedList, times(3)).get(anyInt());
	}

	//TODO Finish testing ... write last test case for adding only processed stuff

	@Test
	public void shouldAddProcessedElementsToProcessedElementsList() {
		Element[] expectedElements = {element, element, element};

		numbersProcessor.processElements(toBeProcessedList);
		List<Element> processedElementsList = numbersProcessor.getProcessedElementsList();

		assertThat(processedElementsList, hasItems(expectedElements));
	}

	private void prepareMocks() {
		given(toBeProcessedList.size()).willReturn(3);
		given(toBeProcessedList.get(0)).willReturn(element);
		given(toBeProcessedList.get(1)).willReturn(element);
		given(toBeProcessedList.get(2)).willReturn(element);
	}

}
