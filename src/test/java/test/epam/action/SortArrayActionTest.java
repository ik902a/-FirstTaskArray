package test.epam.action;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import by.epam.action.SortArrayAction;
import by.epam.action.SortArrayActionStream;
import by.epam.entity.CustomArray;

public class SortArrayActionTest {
	SortArrayAction sortArray;
	SortArrayActionStream sortArrayStream;
	CustomArray customArray;
	
	@BeforeClass
	public void setUp() {
		customArray = new CustomArray();
		sortArray = new SortArrayAction();
		sortArrayStream = new SortArrayActionStream();
	}
	
	@AfterClass
	public void tearDown() {
		customArray = null;
		sortArray = null;
		sortArrayStream = null;
	}
	
	@Test (dataProvider = "arrays_sort")
	public void testBubbleSort(int[] array, int[] expected) {
		customArray.setArray(array);
		int[] actual = sortArray.bubbleSort(customArray);
		assertEquals(actual, expected);
	}
	
	@Test (dataProvider = "arrays_sort")
	public void testInsertionSort(int[] array, int[] expected) {
		customArray.setArray(array);
		int[] actual = sortArray.insertionSort(customArray);
		assertEquals(actual, expected);
	}
	
	@Test (dataProvider = "arrays_sort")
	public void testSelectionSort(int[] array, int[] expected) {
		customArray.setArray(array);
		int[] actual = sortArray.selectionSort(customArray);
		assertEquals(actual, expected);
	}
	
	@Test (dataProvider = "arrays_sort")
	public void testSortStream(int[] array, int[] expected) {
		customArray.setArray(array);
		int[] actual = sortArrayStream.sortStream(customArray);
		assertEquals(actual, expected);
	}
	
	@DataProvider(name = "arrays_sort")
	public Object[] createArraysSort() {
		return new Object[][] { { new int[] { 1, 2, 3, -1 } , new int[] { -1, 1, 2, 3 } },
			                    { new int[] { 9, 2, -42, -100 } , new int[] { -100, -42, 2, 9 } },
			                    { new int[] { -300, -500, 900, 0 } , new int[] { -500, -300, 0, 900 } },
			                    { new int[] { -4, -3, 9, 7 } , new int[] { -4, -3, 7, 9 } },
			                    { new int[] { 7, 4, 2, -5 } , new int[] { -5, 2, 4, 7 } }};
	}
}
